package com.jk.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseAction{

	private static final long serialVersionUID = -9079055950435953564L;

	public static void responseWrite(String jsonStr,HttpServletResponse response){
		//设置编码格式
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.flush();
				writer.close();
			}
		}
	}
	
	
}
