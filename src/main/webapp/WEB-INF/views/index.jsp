<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
  <head>
    <title>Slow News</title>
    <meta http-equiv="Content-Type" content="text/html"; charset="utf-8" />
    <meta name="description" content="News reader">
    <meta name="keywords" content="news, aggregator, slow news">
    <link href="../../resources/css/index.css" rel="stylesheet" type="text/css">
  </head>

  <body>
  <div>
    <c:if test="${login != null}">
      <p style="font-family: monospace; margin-right: 20pt; color: darksalmon; text-align: right; font-size: 15pt"> <c:out value="${login}"/></p>

    </c:if>
  </div>

  <div  style="display: flex"><%@include file='menu.jsp'%></div>

  <div>
    <c:if test="${login == null}">
      <p style="font-family: monospace; margin-left: 10pt; color: darksalmon">Please,  <a style="color: lightgoldenrodyellow" href="/login">login</a> and use personal archive!</p>

    </c:if>
  </div>



   <form action="archive" method="post" style="margin-right:20px">
    <c:forEach items="${allNews}" var="aNews" varStatus="i">
      <div class="itemContainer">
      <div style="display: flex">
        <c:if test="${login != null}">
           <input type="checkbox" name="${i.index}" value="save">
        </c:if>
              <h2 style="margin:1px; font-size:13pt; color: lightgrey;font-family: sans-serif "><c:out value="${aNews.title}" /></h2>
       </div>

            <div style="border-top:solid 1px #49545d; border-bottom:solid 1px #49545d; padding-left: 10pt">
             <p style="margin: 2px; color: antiquewhite;font-family: monospace "><c:out value="${aNews.description}" /></p>
            </div>

            <div>
              <details style="color: honeydew; font-size: 10pt">
                <summary>More...</summary>
                <div style="margin-left: 25pt; margin-top: 2pt; background-color: #687983; border-radius: 0 10px 10px 10px; padding: 5px">
                  <p><c:out value="${aNews.fulltext}" escapeXml="false"/></p>
                </div>
              </details>
            </div>
      </div>

            <div></c:forEach>
                <input type="hidden" name="articleListID" value="${articleListID}" /></div>
       <c:if test="${login != null}">
          <input type="submit" value="Save">
       </c:if>


  </form>




    <%--</c:if>--%>


  </body>
</html>
