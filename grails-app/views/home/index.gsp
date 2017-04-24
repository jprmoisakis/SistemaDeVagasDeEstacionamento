<%@ page import="sistemadevagasdeestacionamento.User" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <title>Home</title>
    </head>
    <body>
        Olá, ${userInstance.firstName}
        <br>
        <br> Escolha uma das opções:
        %{--#if($ParkingSpaceBooking)--}%
        <br> <g:link controller="parkingSpace" action="index" name="spotlist"><g:message code="default.menu.list"/></g:link>
        %{--#end--}%
        <br> <g:link controller="parkingSpace" action="suggestion" name="suggestions"><g:message code="default.menu.suggestion"/></g:link>
        <br> <g:link controller="user" action="index" name="profile"><g:message code="default.menu.profile"/></g:link>
        <br> <g:link class="reminder-link" controller="user" name = "reminder" action="lembrete" id="${userInstance.id}"><g:message code="default.menu.reminder"/></g:link>
        %{--#if($ReportParkingSpaceProblem)--}%
        <br> <g:link controller="problemReport" action="create" name="report">Reportar problemas com vaga</g:link>
        %{--#end--}%
        <br> <g:link controller="problemReport" action="index" name="problemReport" >%{--${message(code: 'problemReport.label')}--}% Problemas Reportados</g:link>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
    <!-- Piwik -->
        <script type="text/javascript">
          var _paq = _paq || [];
          /* tracker methods like "setCustomDimension" should be called before "trackPageView" */
          _paq.push(['trackPageView']);
          _paq.push(['enableLinkTracking']);
          (function() {
            var u="//piwikteste.zapto.org/";
            _paq.push(['setTrackerUrl', u+'piwik.php']);
            _paq.push(['setSiteId', '4']);
            var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0];
            g.type='text/javascript'; g.async=true; g.defer=true; g.src=u+'piwik.js'; s.parentNode.insertBefore(g,s);
          })();
        </script>
<!-- End Piwik Code -->

        <script>
          (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
          (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
          m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
          })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

          ga('create', 'UA-97980040-1', 'auto');
          ga('send', 'pageview');

        </script>        
    </body>
    
</html>
