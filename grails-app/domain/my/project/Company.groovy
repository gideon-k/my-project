package my.project

class Company {
    String name = ''
    String address  = ''
    String city  = ''
    String state  = ''
    String country  = ''
    String phone  = ''
    String fax  = ''

    //TODO hasMany contacts?
    static constraints = {
        name (blank:false,unique: true)

    }
}
