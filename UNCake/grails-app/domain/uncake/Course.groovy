package uncake

class Course {

    String code
    Integer credits
    static hasMany = [groups: Groups, comments: Comment]
    String name
    String typology
    Double grade
    String semester
    Integer semesterNumber
    Location location
	
	static mapping = {
        comments sort: 'id'
    }

    static constraints = {
        code nullable: true
        name nullable: true
        typology nullable: true
        grade nullable: true
        credits nullable: true
        semester nullable: true
        groups nullable: true
        location nullable: true
	    semesterNumber nullable: true
    }
}
