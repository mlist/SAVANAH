package org.nanocan.savanah.attributes

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class IdentifierController {

    def scaffold = true
}
