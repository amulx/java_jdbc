<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
*{
	padding:0;
	margin:0;
}

ul li{
	list-style:none;
}

.banner{
	height:380px;

	margin-top:20px;
	position:relative;
	overflow:hidden;
}

.banner .content{
	width: 1060px;
	height:450px;
	margin:20px auto;
	position:relative;
}
.banner ul li img{
	width:1024px;
	height:380px;
}
.fl{
	float:left;
}
.fr{
	float:right;
}

.banner .content ul{
	width:10000px;
	margin-left: -1024px;
}

.btn_left ,.btn_right{
    display: inline-block;
    width: 21px;
    height: 150px;
    background: url(banner_tb.png) no-repeat;
    position: absolute;
    left: -38px;
    top: 90px;
}

.btn_right{
    background-position: -29px 0;
    position: absolute;
    left: 1041px;
    top: 90px;
}

.banner .content:hover .btn_left{
    opacity: 1;
}

.banner .content:hover .btn_right{
    opacity: 1;
}
</style>
</head>
<body>
	<div class='banner'>
		<div class='content'>
			<ul>
				<li>
					<a href="javascript:void(0)"><img alt="" src="http://img05.tooopen.com/images/20140604/sy_62331342149.jpg"></a>
				</li>
				<li>
					<a href="javascript:void(0)"><img alt="" src="http://img05.tooopen.com/images/20140604/sy_62331342149.jpg"></a>
				</li>
				<li>
					<a href="javascript:void(0)"><img alt="" src="http://img05.tooopen.com/images/20140604/sy_62331342149.jpg"></a>
				</li>
				<li>
					<a href="javascript:void(0)"><img alt="" src="http://img05.tooopen.com/images/20140604/sy_62331342149.jpg"></a>
				</li>
				<li>
					<a href="javascript:void(0)"><img alt="" src="http://img05.tooopen.com/images/20140604/sy_62331342149.jpg"></a>
				</li>
				<i class='btn_left'></i>
				<i class='btn_right'></i>
			</ul>
		</div>
	</div>
</body>
</html>