var mobile = /((MIDP)|(WAP)|(UP.Browser)|(Smartphone)|(Obigo)|(Mobile)|(AU.Browser)|(wxd.Mms)|(WxdB.Browser)|(CLDC)|(UP.Link)|(KM.Browser)|(UCWEB)|(SEMC\-Browser)|(Mini)|(Symbian)|(Palm)|(Nokia)|(Panasonic)|(MOT)|(SonyEricsson)|(NEC)|(Alcatel)|(Ericsson)|(BENQ)|(BenQ)|(Amoisonic)|(Amoi)|(Capitel)|(PHILIPS)|(SAMSUNG)|(Lenovo)|(Mitsu)|(Motorola)|(SHARP)|(WAPPER)|(LG)|(EG900)|(CECT)|(Compal)|(kejian)|(Bird)|(BIRD)|(G900\/V1.0)|(Arima)|(CTL)|(TDG)|(Daxian)|(DAXIAN)|(DBTEL)|(Eastcom)|(EASTCOM)|(PANTECH)|(Dopod)|(Haier)|(HAIER)|(KONKA)|(KEJIAN)|(LENOVO)|(Soutec)|(SOUTEC)|(SAGEM)|(SEC)|(SED)|(EMOL)|(INNO55)|(ZTE)|(iPhone)|(Android)|(Windows CE)|(Wget)|(Java)|(curl)|(Opera))/.test(navigator.userAgent);
if( mobile ){
	document.write('<div class="theme-box"><a href="'+'/theme/touch/?url=' + encodeURIComponent(location.href) + '" class="touch">触摸版</a><a href="'+'/theme/default/?url=' + encodeURIComponent(location.href) + '" class="default">电脑版</a></div></div>');
}