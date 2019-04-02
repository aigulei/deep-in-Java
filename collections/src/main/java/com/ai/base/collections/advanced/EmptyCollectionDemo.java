package com.ai.base.collections.advanced;

import java.util.Collections;
import java.util.List;

public class EmptyCollectionDemo {
	public static void main(String[] args) {
		//对自己（严格）：所有的放回接口类型的方法禁止返回null
		//对别人（宽容）：要做null判断（尤其是RPC）
		//集合方法入参：
		//1：如果能用Iterable尽量用
		//2:其次是Collection
		//3:再者是List或Set
		//4:禁止使用具体类型，如ArrayList，LinkedHashSet
	}
	
	public static List<String> getIdsList(String name){
		if(name == null || name.length()<1) {
			return Collections.EMPTY_LIST;
		}
		//只读empty List
		//实现Java序列化
		return Collections.EMPTY_LIST;
	}
}
