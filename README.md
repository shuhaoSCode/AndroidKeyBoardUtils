# AndroidKeyBoardUtils
键盘的显示和隐藏 在dialog中也木有问题

## 如何导入？

* Android Studio

		allprojects {
			repositories {
			  ...
			  maven { url 'https://jitpack.io' }
			}
		}
		  
		dependencies {
	       compile 'com.github.shuhaoSCode:AndroidKeyBoardUtils:1.0.0'
		}


* eclipse。。。请自行copy class。

## 当前功能
* 控制键盘的显示和隐藏，解决在Dialog中无法获取焦点的问题

## 如何使用
	//显示
	KeyboardUtils.showSoftInput(activity, EditText)
	//隐藏
	KeyboardUtils.hideSoftInput(activity);

