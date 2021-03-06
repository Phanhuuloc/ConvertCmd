///**
// * Copyright (c) Aspose 2002-2014. All Rights Reserved.
// *
// * LICENSE: This program is free software; you can redistribute it and/or
// * modify it under the terms of the GNU General Public License
// * as published by the Free Software Foundation; either version 3
// * of the License, or (at your option) any later version.
// * This program is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// * GNU General Public License for more details.
// * You should have received a copy of the GNU General Public License
// * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
// *
// * @author  Shoaib Khan <shoaib.khan@aspose.com>
// * @link    https://github.com/asposemarketplace/Aspose_for_Apache_POI
// */
//
//package com.ws.converter;
//
//import com.aspose.slides.Presentation;
//import com.aspose.slides.SaveFormat;
//
//public class AsposeConverter
//{
//    public static void main(String[] args)
//    {
//        // 1. Conversion to PDF using default options.
//
//        //Instantiate a Presentation object that represents a PPT file
//        Presentation pres = new Presentation("data/presentation.ppt");
//
//        //Saving the presentation to PDF document
//        pres.save("data/AsposeConvert.pdf", SaveFormat.Pdf);
//
//        //Display result of conversion.
//        System.out.println("Conversion to PDF performed successfully with default options!");
//
//        // 2. Conversion to PDF using custom options.
//
//        //Instantiate the PdfOptions class
//        com.aspose.slides.PdfOptions opts = new com.aspose.slides.PdfOptions();
//
//        //Set JPEG Quality
//        opts.setJpegQuality((byte)90);
//
//        //Define behavior for meta files
//        opts.setSaveMetafilesAsPng(true);
//
//        //Set Text Compression level
//        opts.setTextCompression(com.aspose.slides.PdfTextCompression.Flate);
//
//        //Define the PDF standard
//        opts.setCompliance(com.aspose.slides.PdfCompliance.Pdf15);
//
//        //Save the presentation to PDF with specified options
//        pres.save("data/AsposeConvert2.pdf", SaveFormat.Pdf,opts);
//
//        //Display result of conversion.
//        System.out.println("Conversion to PDF performed successfully with custom options!");
//    }
//}
