module java9 {
	//requires 内部依赖
	requires java.base;	//默认依赖
	requires java.sql; //传递依赖 requires transitive
	requires java.compiler;//exports控制可访问的API包
	
	//非命名模块
	requires spring.context;
	requires commons.collections;
	requires commons.lang;
	
	//exports 外部访问
	exports com.ai.java9.modular; //供外部访问
}