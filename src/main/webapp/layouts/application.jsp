<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link type="text/css" rel="stylesheet" href="assets/stylesheets/normalize.css"/>
    <link type="text/css" rel="stylesheet" href="assets/stylesheets/application.css"/>

    <title><decorator:title default="VRaptor Base"/></title>
  </head>
  <body>
    <section class="container">
      <decorator:body/>
    </section>
  </body>
</html>
