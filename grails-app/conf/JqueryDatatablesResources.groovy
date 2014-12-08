def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def pluginName = 'jquery-datatables'

modules = {
    'jquery-datatables' {
        resource url: [ plugin: pluginName, dir: 'css', file: (dev ? 'jquery.dataTables.css' : 'jquery.dataTables.min.css') ],
                 exclude: 'minify', disposition: 'head'
        resource url: [ plugin: pluginName, dir: 'js', file: (dev ? 'jquery.dataTables.js' : 'jquery.dataTables.min.js') ],
                 exclude: 'minify', disposition: 'defer'
    }
}