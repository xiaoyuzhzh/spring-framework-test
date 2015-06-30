package org.iceberg.controller;

import goja.QRCode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utils")
public class UtilController {

	@RequestMapping("/qrcode/{codeNo}")
	public void getQRCodeImage(@PathVariable("codeNo")String codeNo,HttpServletResponse resp){
		String valCode = codeNo;
		QRCode qrCode = QRCode.create(valCode);
		BufferedImage image = qrCode.getQrcodeImage();
		qrCode.toFile("d:testqrcode.bmp");
		resp.setHeader("Content-Type", "image/jpg");
		resp.setHeader("Content-Disposition","attachment;filename=test.jpg");
		OutputStream os = null;
		try {
			os = resp.getOutputStream();
			ImageIO.write(image, "jpg", os);
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(os!=null){
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
