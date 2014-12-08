class JqueryDatatablesGrailsPlugin {
    def version = "1.10.4"
    def grailsVersion = "2.0 > *"
    def title = "JQuery DataTables Plugin"
    def author = "Grant McConnaughey"
    def authorEmail = "grantmcconnaughey@gmail.com"
    def developers = [ [ name: "Lim Chee Kin", email: "limcheekin@vobject.com" ]]
    def description = '''\
This plugin simply supplies jQuery DataTables plugin resources, and depends on the jQuery plugin to include the core jquery libraries.
Use this plugin in your own apps and plugins to avoid resource duplication and conflicts.
'''
    def documentation = "https://github.com/grantmcconnaughey/grails-jquery-datatables"
    def license = "APACHE"
    def issueManagement = [ system: "Github", url: "https://github.com/grantmcconnaughey/grails-jquery-datatables/issues" ]
    def scm = [ url: "https://github.com/grantmcconnaughey/grails-jquery-datatables" ]
}
