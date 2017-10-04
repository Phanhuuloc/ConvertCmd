package com.ws.converter;

import java.io.File;
import java.io.IOException;

public class App {
//        private final static Logger LOGGER = Logger.getLogger("App");
    public static void main(String[] args) {

//        String sTest = "C:\\Users\\localadmin\\Desktop\\Project NOTES\\editorNew\\slide.pptx";
//        String dTest = "C:\\Users\\localadmin\\Desktop\\Project NOTES\\editorNew\\slide.pdf";
//        String args[] = {"pl", "-c", sTest, dTest};

        if (args.length != 4) {
            System.out.println("missing arguments");
            System.exit(1);
        }
        if (!"pl".equals(args[0])) {
            System.out.println("wrong app");
            System.exit(1);
        }
        if (!"-c".equals(args[1])) {
            System.out.println("wrong command");
            System.exit(1);
        }
        if (null != args[2] && null != args[3] && !args[2].isEmpty() && !args[3].isEmpty()) {
            runSP(args[2], args[3]);
        }
    }

    private static void runSP(String ip, String op) {
        String space = " ";
        String cmd = "unoconv -f pdf -o"+ space + op + space + ip;
        String[] terms = new String[]{"/bin/bash", "-c", cmd};
        try {
            System.out.println("start .....");
            Process proc = new ProcessBuilder(terms).start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        while (true){
            File f = new File(op);
            if(f.exists() && !f.isDirectory()) {
                System.out.println("do next");
                break;
            }
        }
    }

//    private static void runC(String sTest, String dTest) {
//        File sF = new File(sTest);
//        File tF = new File(dTest);
//
//        System.out.println(String.format("Conver from  %s to %s", FilenameUtils.getExtension(sF.getPath()),
//                FilenameUtils.getExtension(tF.getPath())));
//
//        switch (FilenameUtils.getExtension(sF.getPath())) {
//            case "doc":
//            case "docx":
//                convertDE(DocumentType.MS_WORD, sF, tF);
//                break;
//            case "xls":
//            case "xlsx":
//                convertDE(DocumentType.MS_EXCEL, sF, tF);
//                break;
//            case "ppt":
//            case "pptx":
//                try {
//                    convertP(sTest, dTest);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            default:
//                break;
//        }
//    }

//    private static void convertP(String sF, String tF) throws IOException {
////        PythonInterpreter pi = new PythonInterpreter();
////        pi.set(“integer”, new PyInteger(42));
////        pi.exec(“square = integer*integer”);
////        PyInteger square = (PyInteger)pi.get(“square”);
////        System.out.println(“square: ” + square.asInt());
//
//        // 1. Conversion to PDF using default options.
//
//        //Instantiate a Presentation object that represents a PPT file
//        Presentation pres = new Presentation(sF);
//
//        //Saving the presentation to PDF document
//        pres.save(tF, SaveFormat.Pdf);
//
//        //Display result of conversion.
//        System.out.println("Conversion to PDF performed successfully with default options!");
//
//        // 2. Conversion to PDF using custom options.
//
//        //Instantiate the PdfOptions class
////        com.aspose.slides.PdfOptions opts = new com.aspose.slides.PdfOptions();
//
//        //Set JPEG Quality
////        opts.setJpegQuality((byte)90);
//
//        //Define behavior for meta files
////        opts.setSaveMetafilesAsPng(true);
//
//        //Set Text Compression level
////        opts.setTextCompression(com.aspose.slides.PdfTextCompression.Flate);
//
//        //Define the PDF standard
////        opts.setCompliance(com.aspose.slides.PdfCompliance.Pdf15);
//
//        //Save the presentation to PDF with specified options
////        pres.save("data/AsposeConvert2.pdf", SaveFormat.Pdf,opts);
//
//        //Display result of conversion.
////        System.out.println("Conversion to PDF performed successfully with custom options!");
//    }

//    private static void convertDE(DocumentType documentType, File sF, File tF) {
//        System.out.println(documentType);
//        IConverter converter = LocalConverter.builder()
//                .baseFolder(new File(System.getProperty("java.io.tmpdir")))
//                .workerPool(20, 25, 2, TimeUnit.SECONDS)
//                .processTimeout(5, TimeUnit.SECONDS)
//                .build();
//        Future<Boolean> conversion = converter
//                .convert(sF).as(DocumentType.TEXT)
//                .to(tF).as(DocumentType.TEXT)
//                .prioritizeWith(1000)
//                .schedule();
//        converter.shutDown();
//    }
}
