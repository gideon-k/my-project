package my.project

class Contact {
    String email
    String firstName  = ''
    String lastName  = ''
    String prefix  = ''
    String phone  = ''
    String fax  = ''
    String company  = ''
    String title  = ''
    //TODO hasMany companies?

    static constraints = {
        email(blank:false,unique: true, email: true)
        firstName()
        lastName()
        prefix()
        phone()
        fax()
        company()
        title()
    }
}
