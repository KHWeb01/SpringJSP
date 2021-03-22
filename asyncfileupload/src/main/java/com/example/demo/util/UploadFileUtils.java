package com.example.demo.util;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
	
	private static final Logger log =
			LoggerFactory.getLogger(UploadFileUtils.class);
	
	public static String uploadFile(String uploadPath, 
			String originalName, byte[] fileData) throws Exception {
		
		UUID uid = UUID.randomUUID();
		
		String savedName = uid.toString() + "_" + originalName;
		
		log.info("savedName: " + savedName);
		
		String savedPath = calcPath(uploadPath);
		
		File target = new File(uploadPath + savedPath, savedName);
		
		FileCopyUtils.copy(fileData, target);
		
		String formatName = originalName.substring(originalName.lastIndexOf(".") + 1);
		
		String uploadedFileName = 
				savedPath.replace(File.separatorChar, '/') + '/' + savedName;
		
		/* Todo: Image 처리 */
		
		return uploadedFileName;
	}

	public static String calcPath (String uploadPath) {
		Calendar cal = Calendar.getInstance();
		
		String yearPath = File.separator + cal.get(Calendar.YEAR);
		
		String monthPath = yearPath + File.separator + 
				new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
		
		String datePath = monthPath + File.separator +
				new DecimalFormat("00").format(cal.get(Calendar.DATE));
		
		makeDir(uploadPath, yearPath, monthPath, datePath);
		
		log.info(datePath);
		
		return datePath;
	}
	
	private static void makeDir (String uploadPath, String... paths) {
		if (new File(paths[paths.length - 1]).exists()) {
			return;
		}
		
		for (String path: paths) {
			File dirPath = new File(uploadPath + path);
			
			if (!dirPath.exists()) {
				dirPath.mkdir();
			}
		}
	}
}
