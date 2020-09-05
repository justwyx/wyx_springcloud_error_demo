//package com.wyx.servicea.exception;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.wyx.common.exception.BusinessException;
//import feign.Response;
//import feign.codec.ErrorDecoder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//import java.io.InputStream;
//
///**
// * @Description : 捕获 Feign 服务端异常
// * @author : Just wyx
// * @Date : 2020/8/26
// */
//@Configuration
//public class MyErrorDecoder implements ErrorDecoder {
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Override
//	public Exception decode(String methodKey, Response response) {
//		String body = "参数异常";
//		try {
////			body = convertResponseBody(response);
////			ObjectMapper mapper = JsonUtil.getObjectMapper();
////			JsonNode bodyJson = mapper.readTree(body);
////			String message = "";
////			if (bodyJson.has("message")) {
////				message = bodyJson.get("message").asText();
////			}
//			return new BusinessException(body, "", "");
//		} catch (Exception e) {
//			logger.error(body);
//			return new Exception("未知异常:" + body);
//		}
//	}
//
//	private String convertResponseBody(Response response) throws IOException {
//		InputStream in = response.body().asInputStream();
//
//		StringBuffer result = new StringBuffer();
//		byte[] b = new byte[4096];
//		for (int n; (n = in.read(b)) != -1;) {
//			result.append(new String(b, 0, n));
//		}
//		return result.toString();
//	}
//}
