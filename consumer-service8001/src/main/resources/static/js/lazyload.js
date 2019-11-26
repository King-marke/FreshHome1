//图片懒加载
window.lazy = (function(window, document, undefined) {
	'use strict';
	var store = [],
	offset, //离可视区域多少像素的图片可以被加载 例如：200
	throttle, //图片延时多少毫秒加载
	poll; // 获取图片属性的timer

	var _inView = function(el) {
		var coords = el.getBoundingClientRect();
		return ((coords.top >= 0 && coords.left >= 0 && coords.top) <= (window.innerHeight || document.documentElement.clientHeight) + parseInt(offset));
	};

	var _pollImages = function() {
		for (var i = store.length; i--;) {
			var self = store[i];
			if (_inView(self)) {
				self.src = self.getAttribute('data-lazy');
				store.splice(i, 1);
			}
		}
	};

	var _throttle = function() {
		clearTimeout(poll);
		poll = setTimeout(_pollImages, throttle);
	};

	var init = function(obj) {
		if (!document.querySelectorAll) {
			document.querySelectorAll = function (selectors) {
					var style = document.createElement('style'), elements = [], element;
					document.documentElement.firstChild.appendChild(style);
					document._qsa = [];
	
					style.styleSheet.cssText = selectors + '{x-qsa:expression(document._qsa && document._qsa.push(this))}';
					window.scrollBy(0, 0);
					style.parentNode.removeChild(style);
	
					while (document._qsa.length) {
							element = document._qsa.shift();
							element.style.removeAttribute('x-qsa');
							elements.push(element);
					}
					document._qsa = null;
					return elements;
			};
	}
	
	if (!document.querySelector) {
			document.querySelector = function (selectors) {
					var elements = document.querySelectorAll(selectors);
					return (elements.length) ? elements[0] : null;
			};
		}
		
		// 用于在IE6和IE7浏览器中，支持Element.querySelectorAll方法
		var qsaWorker = (function () {
				var idAllocator = 10000;
		
				function qsaWorkerShim(element, selector) {
						var needsID = element.id === "";
						if (needsID) {
								++idAllocator;
								element.id = "__qsa" + idAllocator;
						}
						try {
								return document.querySelectorAll("#" + element.id + " " + selector);
						}
						finally {
								if (needsID) {
										element.id = "";
								}
						}
				}
		
				function qsaWorkerWrap(element, selector) {
						return element.querySelectorAll(selector);
				}
		
				// Return the one this browser wants to use
				return document.createElement('div').querySelectorAll ? qsaWorkerWrap : qsaWorkerShim;
		})();
		
		var nodes = document.querySelectorAll('[data-lazy]');
		var opts = obj || {};
		offset = opts.offset || 150;
		throttle = opts.throttle || 250;

		for (var i = 0; i < nodes.length; i++) {
			store.push(nodes[i]);
		}

		_throttle();

		if (document.addEventListener) {
			window.addEventListener('scroll', _throttle, false);
		} else {
			window.attachEvent('onscroll', _throttle);
		}
	};

	return {
		init: init,
		render: _throttle
	};

})(window, document);