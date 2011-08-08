
modules = {
	core {
		dependsOn 'jquery, utils, application'
//		resource url: '/js/core.js', disposition: 'head'
//		resource url: '/js/ui.js'
		resource url: '/css/main.css'
		resource url: '/css/mobile.css'
//		resource url: '/css/branding.css'
//		resource url: '/css/print.css', attrs: [media: 'print']
	}
	
	application {
		dependsOn 'jquery'
		
		resource url: '/js/application.js'
	}
	
	utils {
		dependsOn 'jquery'

//		resource url: '/js/utils.js'
	}

	forms {
		dependsOn 'core,utils'

//		resource url: '/css/forms.css'
//		resource url: '/js/forms.js'
	}
}
