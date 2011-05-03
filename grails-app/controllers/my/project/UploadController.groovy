package my.project

class UploadController {

    def uploadService

    def index = { }

    def upload = {
        log.debug params

        def f = request.getFile('myFile')
        if (!f.empty) {
            uploadService.processFile(f)

//            f.transferTo(new File('someotherloc'))       // now we have a local file  since the one received from the web form was a MutlipartFile
//            // load the local file back in
//            def localFile = new File('someotherloc')
//
////            println 'size'+ localFile.size()
//            def list = []
//
//            localFile.eachLine {line -> list << line}
//
//            // now that we have a list, populate the Gorm objects
//            def map = [:]
//            list.eachWithIndex { line, index ->
//                if (index == 0) return // skip the header row
////                def toks = line.tokenize(',') // this doesnt work since it passes over empty tokens
//                def toks = line.split(',')
//                toks.eachWithIndex {field, position ->
//                    switch (position) {
//                        case 0:   //email
//                            if (field) map.email = field else map.email = ''
//                            break
//                        case 1:  //first
//                            if (field) map.firstName = field else map.firstName = ''
//                            break
//                        case 2:  //last
//                            if (field) map.lastName = field else map.lastName = ''
//                            break
//                        case 3:  //prefix
//                            if (field) map.prefix = field else map.prefix = ''
//                            break
//                        case 4:  //phone
//                            if (field) map.phone = field else map.phone = ''
//                            break
//                        case 5:  //fax
//                            if (field) map.fax = field else map.fax = ''
//                            break
//                        case 6:  //title
//                            if (field) map.title = field else map.title = ''
//                            break
//                        case 7:  //company
//                            if (field) map.company = field else map.company = ''
//                            break
//                    }
//                }
//                def company = new Company([name: map.company])
//                company.save(flush: true)
//                def contact = new Contact(
//                        [email: map.email, firstName: map.firstName, lastName: map.lastName, prefix: map.prefix, phone: map.phone, fax: map.fax,
//                                title: map.title, company: map.company])
////                                                title:map.title,company:company])
//                contact.save(flush: true)
////                println 'saved'+ contact.firstName + company.name
//            }

            flash.message = 'file upload success'
            render(view: '../index') //back to home page
//            response.sendError(200, 'Done');
        }
        else {
            flash.message = 'file cannot be empty'
            redirect(action: 'index')
        }
    }
}
