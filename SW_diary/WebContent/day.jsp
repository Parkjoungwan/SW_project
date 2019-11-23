<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="diary.DiaryDAO" %>
<%@ page import="diary.Diary" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Random" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name=viewport content="width=device-width, initial-scale=1, user-scalable=0">
<title>오늘의 교환일기_day</title>
<style type="text/css">

		body{
			margin: 0px auto;
			background-color: #FFFFFF;
			box-sizing : border-box;
		}
		
		
		div.top{
			background: #00218c;
		    position: fixed;
			top:0;
		    left: 0;
		    right: 0;
			box-sizing : border-box;
		    height: 70px;
		    z-index: 1;
		    margin: 0;
		    padding: 0;
		}
		
		
		div.month{
			float: left;
		}
		div.day{
			text-align: center;
			float: left;
			padding-top: 10%;
			
		}
</style>
</head>
	<body>
	    <%
	        String userID = null;
	        if(session.getAttribute("userID")!=null){
	            userID = (String) session.getAttribute("userID");
	        }
	    	DiaryDAO diaryDAO = new DiaryDAO();
	    %>
		<div class="top"></div>
			<div class="month" style="float: left; border: 0; padding-top: 25%;" >
				<a href="month.html"><img src="images/month.png" style="max-width: 20%; height: auto; padding-left: 10%; "></a>
				<img src="images/wol.png" style="max-width: 20%; height: auto; float: right; padding-right: 10%;">
				<!--날짜는 네모빈칸으로 해서 당일 날짜 출력기능 추가예정-->
			</div>
	
		<div class="day">
			<img src="images/bell_25.png" style="max-width: 100%; height: auto; ">
			<a href="write.jsp"><img src="images/write_button.png" style="max-width: 70%;padding-top: 3%; padding-bottom: 10%;"></a>
		</div>
			<hr style="border: solid 2px #353c54; margin-top: 10;">
			<div class="bottom_bar" style="padding-top:3%;">
				<a href="day.jsp"><img src="images/home_1.png" style="max-width: 10%;height: auto; padding-left:12% ;padding-top:2px;"></a>
				<a href="diary.jsp"><img src="images/my_diary.png" style="max-width:15%; height: auto; padding-left: 18%;padding-top:3px;"></a>
				<%
			            if(userID!=null)
			            {
			            	String userAge=null;
			            	userAge = (String)session.getAttribute("userAge");
			            	ArrayList<Integer> IDlist= null;
			            	Random random = new Random();
			            	int rannum=0;
			            	IDlist = diaryDAO.getRAN(userID, userAge);
			            	if(IDlist.size()!=0)
			            	{
			                	rannum = random.nextInt(IDlist.size());
			            	
			           	%>
			           		<a href="view.jsp?diaryID=<%=IDlist.get(rannum) %>"><img src="images/exchange.png" style="max-width: 16%; height: auto;padding-left: 18%;"></a>
			            <%}
			            }
			     %>
			</div>
	</body>
</html>