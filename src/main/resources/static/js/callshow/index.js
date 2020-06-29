jQuery(document).ready(function($) {
	//	bodyheight();
	//	PelletClicks("#alertpage1");
	//	xuanz('.xuan', 'xuaned');
});
//前台表单验证
function yanzheng() {
	//手机号 isPhone
	$('.isPhone').each(function(i, e) {
		$(this).on('blur', function() {
			var isPhone = $(this).val();
			if(!(/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/.test(isPhone))) {
				$(this).parent('p').append('<p class="tishi">请输入正确的手机号</p>');
			}
		})
		$(this).on('focus', function() {
			$(this).parent('p').find('.tishi').remove();
		})
	});
	////身份证验证 isId
	$('.isId').each(function(i, e) {
		$(this).on('blur', function() {
			var isId = $(this).val();
			if(!(/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/.test(isId))) {
				$(this).parent('p').append('<p class="tishi">请输入正确的身份证号</p>');
			}
		})
		$(this).on('focus', function() {
			$(this).parent('p').find('.tishi').remove();
		})
	});

	//邮箱/传真  isEmail
	$('.isEmail').each(function(i, e) {
		$(this).on('blur', function() {
			var isEmail = $(this).val();
			if(!(/^[a-zA-Z0-9]+([._-]*[a-zA-Z0-9]*)*@[a-zA-Z0-9]+.[a-zA-Z0-9{2,5}$]|^(\d{3,4}-)?\d{7,8}$/.test(isEmail))) {
				$(this).parent('p').append('<p class="tishi">请输入正确的身份证号</p>');
			}
		})
		$(this).on('focus', function() {
			$(this).parent('p').find('.tishi').remove();
		})
	});
}

//验证码
function settime(ti) {
	var set;
	$(".yanz").text("" + ti + " " + "秒");
	set = setInterval(function() {
		if(ti <= 0) {
			clearInterval(set);
			$(".yanz").text("重新发送");
			return;
		}
		ti--;
		$(".yanz").text(ti + " " + "秒");
	}, 1000);
}
//下拉
//sel();
function sel() {
	$('.select .inp').each(function() {
		$(this).focus(function() {
			$(this).next('ul').show();
		});
	})
	$('.select .inp').blur(function() {
		setTimeout(function() {
			$('.select ul').hide();
		}, 50);
	})
	xunz_i();
}
//下拉选中
function xunz_i() {
	$('.select ul li').click(function() {
		$(this).parents('.select').find('i').removeClass('xuaned');
		$(this).find('i').addClass('xuaned');
		var tex = $(this).find('em').text();
		$(this).parents('.select').find('.inp').val(tex);
	});
}

//选中
function xuanzs(e, q) {
	$(e).click(function() {
		if($(this).hasClass(q)) {
			$(this).removeClass(q);
			$(this).find('input').removeAttr('checked');
		} else {
			$(this).addClass(q);
			$(this).find('input').attr('checked', true);
		};
	});
}
//选中
function xuanz(e, q) {
	$(e).click(function() {
		$(e).removeClass(q);
		$(this).addClass(q);
	});
}
//
function bodyheight() {
	var w = $(document).height();
	$('.box').css({
		"min-height": w
	});
}

//可以作弹窗模板
function showT(id, text) {
	$('.pellets').hide();
	PelletClicks(id);
	$(id).find('.ptext').html(text);
}

/*
    显示/关闭页面弹窗
*/
function PelletClicks(id) {
	$(id).show();
	var wh = $(window).height();
	var whd = $(id).find('.tcon').height() - 100;
	$('.x').click(function() {
		$(this).parents('.pellets').hide();
	})
}

//页面自适应

;
(function(designWidth, maxWidth) {
	var doc = document,
		win = window,
		docEl = doc.documentElement,
		remStyle = document.createElement("style"),
		tid;

	function refreshRem() {
		var width = docEl.getBoundingClientRect().width;
		maxWidth = maxWidth || 540;
		width > maxWidth && (width = maxWidth);
		var rem = width * 100 / designWidth;
		remStyle.innerHTML = 'html{font-size:' + rem + 'px;}';
	}

	if(docEl.firstElementChild) {
		docEl.firstElementChild.appendChild(remStyle);
	} else {
		var wrap = doc.createElement("div");
		wrap.appendChild(remStyle);
		doc.write(wrap.innerHTML);
		wrap = null;
	}
	//要等 wiewport 设置好后才能执行 refreshRem，不然 refreshRem 会执行2次；
	refreshRem();

	win.addEventListener("resize", function() {
		clearTimeout(tid); //防止执行两次
		tid = setTimeout(refreshRem, 300);
	}, false);

	win.addEventListener("pageshow", function(e) {
		if(e.persisted) { // 浏览器后退的时候重新计算
			clearTimeout(tid);
			tid = setTimeout(refreshRem, 300);
		}
	}, false);

	if(doc.readyState === "complete") {
		doc.body.style.fontSize = "14px";
	} else {
		doc.addEventListener("DOMContentLoaded", function(e) {
			doc.body.style.fontSize = "14px";
		}, false);
	}
})(750, 750);

//微信端字体固定
(function() {
	if(typeof WeixinJSBridge == "object" && typeof WeixinJSBridge.invoke == "function") {
		handleFontSize();
	} else {　　
		if(document.addEventListener) {
			document.addEventListener("WeixinJSBridgeReady", handleFontSize, false);
		} else if(document.attachEvent) {
			document.attachEvent("WeixinJSBridgeReady", handleFontSize);
			document.attachEvent("onWeixinJSBridgeReady", handleFontSize);
		}
	}

	function handleFontSize() {
		WeixinJSBridge.invoke('setFontSizeCallback', {　　
			'fontSize': 0
		});

		WeixinJSBridge.on('menu:setfont', function() {
			WeixinJSBridge.invoke('setFontSizeCallback', {
				'fontSize': 0
			});
		});
	}
})();