<%@ page contentType="text/html;charset=UTF-8" language="java" %>

        <form action="index" method="post" class="headerMain">
          <input type="submit" value="News">
        </form>

        <form action="archive" method="get" class="headerMain">
          <input type="submit" value="Archive">
        </form>

        <c:if test="${login != null}">
            <form action="logout" method="get" class="headerMain">
              <input type="submit" value="Logout">
            </form>
        </c:if>

        <c:if test="${login == null}">
          <form action="login" method="get" class="headerMain">
            <input type="submit" value="Login">
          </form>
        </c:if>
