<?php

header("Cache-Control: no-cache, must-revalidate"); // HTTP/1.1
header("Expires: Mon, 26 Jul 1997 05:00:00 GMT"); // Date in the past
session_start();

require_once(dirname(__FILE__).'/admin/connect.php');
require_once(dirname(__FILE__).'/function.php');

mysql_connect($DB_address, $DB_username, $DB_password);
mysql_select_db($DB);

 
$MMK = '<select name="make1" onchange="getmodel()">';
$MMK .= '<option value="">Any</option>';
$query	= "SELECT Make FROM Cars WHERE Flag<>'del' GROUP BY Make ORDER BY Make";
$result	= mysql_query($query) or die(mysql_error());
while($dbDATA = mysql_fetch_assoc($result))
{
	$MMK .= '<option value="'.$dbDATA['Make'].'">'.$dbDATA['Make'].'</option>';
}
$MMK .= '</select>';



$SERVER = 'http://'.$_SERVER["SERVER_NAME"].'/';

?>
<html>
<head>
<title>HIGH SPEED MOTOR</title>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />

<!-- for Google -->
<meta name="description" content="High Speed Motor Pte Ltd" />
<meta name="keywords" content="Singapore, Motor Vehicles, Cars, used, used cars export, used cars import, singapore cars exporter, righthand drive cars, automobiles for export, motorcars for export, singapore car dealers, toyota for export, mercedes benz for export" />

<meta name="author" content="High Speed Motor Pte Ltd" />
<meta name="copyright" content="High Speed Motor Pte Ltd" />
<meta name="application-name" content="High Speed Motor Pte Ltd" />

<!-- for Facebook -->          
<meta property="og:title" content="High Speed Motor Pte Ltd" />
<meta property="og:type" content="article" />
<meta property="og:image" content="<?=$SERVER?>images/index_r1_c1.jpg" />
<meta property="og:url" content="<?=$SERVER?><?=$_SERVER["REQUEST_URI"]?>" />
<meta property="og:description" content="We are an experienced reliable Exporter & Importer of Used Right Hand and Brand New Cars in Singapore. We have various used motor vehicles in our yard in Singapore for immediate delivery. We have been exporting to many countries such as Dubai, New Zealand, South Africa, Kenya, Russia, Australia, Indonesia.<br><br>We strongly believe in giving our customers their satisfaction." />

<!-- for Twitter -->          
<meta name="twitter:card" content="summary" />
<meta name="twitter:title" content="High Speed Motor Pte Ltd" />
<meta name="twitter:description" content="We are an experienced reliable Exporter & Importer of Used Right Hand and Brand New Cars in Singapore. We have various used motor vehicles in our yard in Singapore for immediate delivery. We have been exporting to many countries such as Dubai, New Zealand, South Africa, Kenya, Russia, Australia, Indonesia.<br><br>We strongly believe in giving our customers their satisfaction." />
<meta name="twitter:image" content="<?=$SERVER?>images/index_r1_c1.jpg" />


<link rel="stylesheet" href="include/style.css">
<script language="JavaScript">
<!--
function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}
function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}
function getmodel()
{
	var xmlhttp=false;
	/*@cc_on @*/
	/*@if (@_jscript_version >= 5)
	// JScript gives us Conditional compilation, we can cope with old IE versions.
	// and security blocked creation of the objects.
	 try {
	  xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
	 } catch (e) {
	  try {
	   xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	  } catch (E) {
	   xmlhttp = false;
	  }
	 }
	@end @*/
	if (!xmlhttp && typeof XMLHttpRequest!='undefined') {
		try {
			xmlhttp = new XMLHttpRequest();
		} catch (e) {
			xmlhttp=false;
		}
	}
	if (!xmlhttp && window.createRequest) {
		try {
			xmlhttp = window.createRequest();
		} catch (e) {
			xmlhttp=false;
		}
	}
	kk = document.search.make1.selectedIndex;
	xmlhttp.open("GET", "getmodel.php?make="+document.search.make1[kk].value,true);
	xmlhttp.onreadystatechange=function() {
		if (xmlhttp.readyState==4) {
			document.getElementById("gmod").innerHTML = xmlhttp.responseText;
		}
	}
	xmlhttp.send(null);
}

//-->
</script>
</head>

<body 	topmargin="0" 
		leftmargin="0"
		marginheight="0" 
		marginwidth="0"
		onload="MM_preloadImages('images/index_r2_c2_f2.jpg','images/index_r2_c3_f2.jpg','images/index_r2_c4_f2.jpg','images/index_r2_c5_f2.jpg');">
<!-- NAV -->
<?php
$t = 1;
if(isset($_GET['t']) && $_GET['t']!="") $t = $_GET['t'];
require_once(dirname(__FILE__).'/nav.php');
?>
<!-- BODY -->
<table border="0" cellpadding="0" cellspacing="0" width="930" align="center">
<tr valign="top">
	<td width="250">	
<?php
require_once(dirname(__FILE__).'/srch-nv.php');
?>
	</td>
	<td class="txt">
		We are a reliable experienced Importer & Exporter of Used and Brand New Right Hand Drive Motor Vehicles in Singapore. We have various Used, New Motor Vehicles and construction machinery in our yard in Singapore for immediate delivery. We have been exporting to many countries such as Africa, Australia, Dubai, Indonesia, New Zealand to name a few.<br><bR>
		We strongly believe in giving quality and Satisfactory service to our valuable customers.<br>
		<a href="list.php"><img src="images/t-latest.jpg" border="0" vspace="5"></a><br><br>
		<table border="0" cellpadding="2" cellspacing="1" width="100%" align="center">
<?php
		$query = "SELECT * FROM Cars where Flag <> 'del' AND (Availability=1 OR Availability=2) ORDER BY Availability DESC,Sequence DESC LIMIT 16";
		$result	= mysql_query($query) or die(mysql_error());
		$CT = 1;
		while ($dbDATA = mysql_fetch_assoc($result))
		{
			$temp = '';
			if($CT == 1)
				echo "<tr valign='top'><td width=\"150\" align=\"center\" class=\"txt\">";
			else
				echo "<td width=\"150\" align=\"center\" class=\"txt\">";

			if(trim($dbDATA['Picture1'])!="")
			{
				$temp = "admin/pics/".$dbDATA['Picture1'];
				if (file_exists($temp))
				{
					echo "<a href=\"".curPageURL()."/details.php?id={$dbDATA['ID']}\"><img src=\"thumbb.php?src=admin/pics/{$dbDATA['Picture1']}&w=150&h=115&far=C&f=jpg\" vspace=\"5\" style=\"border-style:solid;border-width:2px;border-color:#E6E6E6;\"></a><br>";
				}
				else
				{
					echo "<a href=\"".curPageURL()."/details.php?id={$dbDATA['ID']}\"><img src=\"thumbb.php?src=images/cam.jpg&w=150&h=115&far=C&f=jpg\" vspace=\"5\" style=\"border-style:solid;border-width:2px;border-color:#E6E6E6;\"></a><br>";
				}
				echo "<B>{$dbDATA['Make']}</B><br>{$dbDATA['Model']}<br>";
			}
			else
			{
				echo "<a href=\"".curPageURL()."/details.php?id={$dbDATA['ID']}\"><img src=\"thumbb.php?src=images/cam.jpg&w=150&h=115&far=C&f=jpg\" vspace=\"5\" style=\"border-style:solid;border-width:2px;border-color:#E6E6E6;\"></a><br>";
				echo "<B>{$dbDATA['Make']}</B><br>{$dbDATA['Model']}<br>";
			}

			if($CT == 4)
			{
				$CT = 1;
				echo '</td></tr>';
			}
			else
			{
				$CT++;
				echo '</td>';
			}
		}
		switch($CT)
		{
			case 2:
				echo '<td width=\"150\"></td><td width=\"150\"></td><td width=\"150\"></td></tr>';
				break;
			case 3:
				echo '<td width=\"150\"></td><td width=\"150\"></td></tr>';
				break;
			case 4:
				echo '<td width=\"150\"></td></tr>';
				break;
		}
?>
		</table>
		<br><br>
	</td>
</tr>
<!-- FOOTER -->
<?php
require_once(dirname(__FILE__).'/foot.php');
?>
</body>
</html>