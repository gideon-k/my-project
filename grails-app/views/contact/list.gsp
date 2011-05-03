
<%@ page import="my.project.Contact" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'contact.label', default: 'Contact')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'contact.id.label', default: 'Id')}" />

                            <g:sortableColumn property="firstName" title="${message(code: 'contact.firstName.label', default: 'First Name')}" />
                        
                            <g:sortableColumn property="lastName" title="${message(code: 'contact.lastName.label', default: 'Last Name')}" />
                            <g:sortableColumn property="email" title="${message(code: 'contact.email.label', default: 'Email')}" />
                            <g:sortableColumn property="prefix" title="${message(code: 'contact.prefix.label', default: 'Prefix')}" />
                        
                            <g:sortableColumn property="phone" title="${message(code: 'contact.phone.label', default: 'Phone')}" />

                            <g:sortableColumn property="fax" title="${message(code: 'contact.fax.label', default: 'Fax')}" />

                            <g:sortableColumn property="title" title="${message(code: 'contact.title.label', default: 'Title')}" />

                            <g:sortableColumn property="company" title="${message(code: 'contact.company.label', default: 'Company')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${contactInstanceList}" status="i" var="contactInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${contactInstance.id}">${fieldValue(bean: contactInstance, field: "id")}</g:link></td>
                        

                        
                            <td>${fieldValue(bean: contactInstance, field: "firstName")}</td>
                        
                            <td>${fieldValue(bean: contactInstance, field: "lastName")}</td>
                            <td>${fieldValue(bean: contactInstance, field: "email")}</td>
                            <td>${fieldValue(bean: contactInstance, field: "prefix")}</td>
                        
                            <td>${fieldValue(bean: contactInstance, field: "phone")}</td>

                            <td>${fieldValue(bean: contactInstance, field: "fax")}</td>

                            <td>${fieldValue(bean: contactInstance, field: "title")}</td>

                            <td>${fieldValue(bean: contactInstance, field: "company")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${contactInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
