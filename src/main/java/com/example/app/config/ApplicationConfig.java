package com.example.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApplicationConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/uploads/**")//アクセスするURLの指定
	    //TODO ★★★ ファイルパスを編集する ★★★
		//.addResourceLocations("file:///C:/Users/zd3M02/uploads/");//ソースの指定
		.addResourceLocations("file:/home/trainee/uploads/");//ソースの指定 //公開サーバー
	}

}
