# TitleBarSet
自定义通用标题栏,可以在xml和代码中设置图片和文字大小,背景操作
## 使用方式
      allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
## Step 2. Add the dependency

    dependencies {
            compile 'com.github.Simonhy:TitleBarSet:v1.1'
    }
## xml中使用方式
     xmlns:app="http://schemas.android.com/apk/res-auto"
     <com.isoftstone.styletitle.TitleBarView
        android:layout_marginTop="10dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:show_left_button="false"
        app:title_text="标题二">
        </com.isoftstone.styletitle.TitleBarView>
        
## 参数说明
      title_background  设置标题背景
      left_button_image 设置左边图片
      left_button_text 设置左边文字的内容
      left_button_textColor 文字颜色
      left_button_textSize  文字大小
      show_left_button  显示左边按钮
      show_right_button 显示右边按钮
      title_text 设置标题内容
       右边同左边一样
       
## 代码使用方法
    有兴趣的详见demo,
        ct = (TitleBarView) findViewById(R.id.ct);
        ct.setRight_button_text("");
        ct.setLeft_button_margin(20);
        ct.setShow_left_button(false);//设置按钮的显示与隐藏
        ct.setRight_button_imageId(R.drawable.add_gongzhonghaoliebiao);//自定义图片
        ct.setLeft_button_imageId(R.drawable.add_gongzhonghaoliebiao);
        ct.setOnTitleClickListener(new TitleBarView.TitleOnClickListener() {//设置按钮的点击事件
            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this, "点击了左边的返回按钮", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightClick() {
                Toast.makeText(MainActivity.this, "点击了右边的返回按钮", Toast.LENGTH_SHORT).show();
            }
        });
  ## 备注
       暂不支持eclipse的jar包,需要的话直接拷贝源代码.欢迎转载!邮箱 simoncqhy@163.com.
