//package com.app.msg.iso.controller;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rumango.closure.entity.AccClosureMaintReqDTO;
//import com.rumango.esb.iso.server.IsoClient;
//import com.solab.iso8583.IsoMessage;
//import com.solab.iso8583.IsoValue;
//import com.solab.iso8583.MessageFactory;
//import com.solab.iso8583.parse.ConfigParser;
//
//import io.netty.buffer.ByteBuf;
//
///**
// * --------------------------------------------------------------------------------------------------------------
// *
// * File Name : IsoTestController.java
// *
// * Description : Controller class to test iso message pack and unpack
//
// *
// * All rights reserved. No part of this work may be reproduced, stored in a
// * retrieval system, adopted or transmitted in any form or by any means,
// * electronic, mechanical, photographic, graphic, optic recording or otherwise,
// * translated in any language or computer language, without the prior written
// * permission from Rumango Ltd
// *
// * Rumango Ltd, 119 Wards Road, Ilford, England, IG2 7DZ
// *
// * Copyright ©2020 Rumango Ltd.
// * 
// * ---------------------------------------------------------------------------------------------------------------
// */
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//@RestController
//@RequestMapping("/isotest")
//
//public class IsoTestController {
//	
//	private static final org.slf4j.Logger LOGGER=LoggerFactory.getLogger(IsoTestController.class);
//	
//	@Autowired
//	IsoUtil  isoUtil;
//	
//	@Autowired
//	IsoClient isoClient;
//
//	@GetMapping("/unpack/{iso}/{makerId}")
//	public Map<Integer, String> packIso(@PathVariable("iso") String iso,
//			@PathVariable("makerId") String makerId) throws Exception {
//		LOGGER.info("inside pack");
//		MessageFactory<IsoMessage> mfact = null;
//		try {
////			if (isoVersion.equalsIgnoreCase(EsbConstants.version_87))
////				mfact = ConfigParser.createFromClasspathConfig("config87.xml");
////			else if (isoVersion.equalsIgnoreCase(EsbConstants.version_93))
////				mfact = ConfigParser.createFromClasspathConfig("config93.xml");
////			else if (isoVersion.equalsIgnoreCase(EsbConstants.version_ge))
//			mfact = ConfigParser.createFromClasspathConfig("configGe.xml");
//
//			mfact.setIgnoreLastMissingField(true);
//			mfact.setUseBinaryBitmap(true);
//	
//		byte[] isobyte=isoUtil.hexToByteConverter(iso);
//		IsoMessage m = mfact.parseMessage(isobyte, 0);// mfact.getIsoHeader(0x1200).length()
//		Map<Integer, String> toMap;
//		if (m != null) {
//			toMap = new LinkedHashMap<>();
//			toMap.put(1, Integer.toString(m.getType(), 16));
//
//			for (int i = 2; i <= 128; i++) {
//				IsoValue<?> f = m.getField(i);
//				if (f != null) {
//					toMap.put(i, f.toString());
//				}
//			}
//			return toMap;
//		}
//		System.out.println(isobyte);
//		Map<Integer, String> isoMap=isoClient.getMapResponse(isobyte, iso, 0);
//		System.out.println(isoMap);	
//		isoUtil.packMessageByte(isoMap, iso);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;		
//
//
//	
//	}
//	@GetMapping("/pack/{iso}/{makerId}")
//	public ResponseEntity<String> unpackIso(@PathVariable("iso") ByteBuf in,
//			@PathVariable("makerId") String makerId) throws Exception {
//		LOGGER.info("inside pack");
//		String iso = null;
//		
//		isoUtil.unpackMessage(null, iso);
////		String iso = "";
////		byte[] bytes = iso.getBytes();
////		System.out.println( Hex.encodeHexString( bytes ) );
//
//		return null;
//	}
//
//}
