
package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;

public class generatePDF {

    // Header Section
    /*private static class Header {
        static Table createHeaderTable() {
            float twocol = 285f;
            float twocol150 = twocol + 150f;
            float twoColumnWidth[] = {twocol, twocol150};
            Color slateblue = new DeviceRgb(11, 80, 79);

            Table headerTable = new Table(twoColumnWidth);
            headerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setBold().setFontSize(20f).setFontColor(slateblue));
            headerTable.addCell(new Cell().add("Reservation Confirmation").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingLeft(100f));


            headerTable.addCell(new Cell().add("Date :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
            headerTable.addCell(new Cell().add("INVOICE DATE :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
            headerTable.addCell(new Cell().add("Company : Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(10f));
            headerTable.addCell(new Cell().add("Order :").setBold().setBorder(Border.NO_BORDER).setFontSize(10f));
            headerTable.addCell(new Cell().add("Phone : +88001797078379").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add("Email : support@ghuddy.com").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));

            Paragraph paragraph = new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.").setFontSize(9f).setPaddingBottom(20f);
            Paragraph p1 = new Paragraph("Customer Name : "+ customerName).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p2 = new Paragraph("Phone :"+ customerPhone).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p3 = new Paragraph("Email :"+ customerEmail).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p4 = new Paragraph("Checkin Date :"+ checkinDate).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p5 = new Paragraph("Checkout Date :"+ checkoutDate).setPaddingBottom(20f).setFontSize(10f);
            headerTable.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(paragraph).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p5).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));


            return headerTable;
        }


        static Table createHeader2() {
            float twocol = 285f;
            float twocol150 = twocol + 150f;
            float twoColumnWidth[] = {twocol, twocol150};
            Color slateblue = new DeviceRgb(11, 80, 79);

            Table headerTable = new Table(1);
         *//*   headerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setBold().setFontSize(20f).setFontColor(slateblue));
            headerTable.addCell(new Cell().add("Reservation Confirmation").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingLeft(100f));
*//*

           *//* headerTable.addCell(new Cell().add("Date :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
            headerTable.addCell(new Cell().add("INVOICE DATE :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
            headerTable.addCell(new Cell().add("Company : Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(10f));
            headerTable.addCell(new Cell().add("Order :").setBold().setBorder(Border.NO_BORDER).setFontSize(10f));
            headerTable.addCell(new Cell().add("Phone : +88001797078379").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add("Email : support@ghuddy.com").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
*//*
            Paragraph paragraph = new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.").setFontSize(9f).setPaddingBottom(20f);
            Paragraph p1 = new Paragraph("Customer Name : "*//*+ customerName*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p2 = new Paragraph("Phone :"*//*+ customerPhone*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p3 = new Paragraph("Email :"*//*+ customerEmail*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p4 = new Paragraph("Checkin Date :"*//*+ checkinDate*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p5 = new Paragraph("Checkout Date :"*//*+ checkoutDate*//*).setPaddingBottom(20f).setFontSize(10f);
            headerTable.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(paragraph).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p5).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));


            return headerTable;
        }

    }*/

    // Body Section
   /* private static class Body {
        static Table createOrderDetailsTable(order[] orders, float col3) {
            Table orderDetails = new Table(new float[]{col3 / 5, col3 / 4, col3 / 3, col3 / 3, col3 / 3});
            orderDetails.addCell(new Cell().add("No.").setBold());
            orderDetails.addCell(new Cell().add("Title ").setBold());
            orderDetails.addCell(new Cell().add("Description ").setBold());
            orderDetails.addCell(new Cell().add("Quantity ").setBold());
            orderDetails.addCell(new Cell().add("Total Price ").setBold());

            for (order o1 : orders) {
                orderDetails.addCell(new Cell().add(String.valueOf(o1.getOrderNo())));
                orderDetails.addCell(new Cell().add(o1.getOrderTitle()));
                orderDetails.addCell(new Cell().add(o1.getOrderDescription()));
                orderDetails.addCell(new Cell().add(String.valueOf(o1.getOrderQuantity())));
                orderDetails.addCell(new Cell().add(String.valueOf(o1.getTotalPrice())));
            }

            return orderDetails;
        }

      *//*  static Paragraph createFooterParagraph() {
            return new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.")
                    .setFontSize(9f).setPaddingBottom(20f);
        }*//*

        // Add other methods for body content creation as needed
    }*/

    // Footer Section
    /*private static class Footer {
        private static final Border BORDER = new SolidBorder(Color.BLACK, 1f / 2f);

        static Table createFooterTable() {
            Table footerTable = new Table(1);
            footerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setFontSize(15f)
                    .setTextAlignment(TextAlignment.CENTER));
            footerTable.addCell(new Cell().add("RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH").setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.CENTER));
            footerTable.addCell(new Cell().add("© All Rights Reserved. Ghuddy, 2024").setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.CENTER));

            return footerTable;
        }

        static Table createHRTable(float[] devider) {
            Table HR = new Table(devider);
            HR.setBorder(BORDER);
            return HR;
        }
    }*/

    public static void main(String[] args) throws FileNotFoundException {
        String path = "invoice2.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        MyEventHandler eventHandler = new MyEventHandler(document);
        pdfDocument.addEventHandler(PdfDocumentEvent.END_PAGE, eventHandler);

        // Body content
        order[] orders = {
                new order(1, "Order 1", "Description 1", 5, 100),
                new order(2, "Order 2", "Description 2", 3, 475),
                new order(3, "Order 3", "Description 3", 8, 200),
                new order(1, "Order 4", "Description 4", 5, 300),
                new order(2, "Order 5", "Description 5", 3, 275),
                new order(3, "Order 6", "Description 6", 8, 210),
                new order(1, "Order 7", "Description 7", 5, 120),
                new order(2, "Order 8", "Description 8", 3, 750),
                new order(3, "Order 9", "Description 9", 8, 280),
                new order(1, "Order 10", "Description 10", 5, 190),
                new order(2, "Order 11", "Description 11", 3, 705),
                new order(3, "Order 12", "Description 12", 8, 300),
                new order(1, "Order 13", "Description 13", 5, 600),
                new order(2, "Order 14", "Description 14", 3, 575),
                new order(3, "Order 15", "Description 15", 8, 400),
                new order(1, "Order 16", "Description 16", 5, 100),
                new order(2, "Order 17", "Description 17", 3, 75),
                new order(3, "Order 18", "Description 18", 8, 200),
                new order(1, "Order 19", "Description 19", 5, 100),
                new order(2, "Order 20", "Description 20", 3, 75),
                new order(3, "Order 21", "Description 21", 8, 200)

        };
        float col3 = 520f;

        // Adding content to the document

        document.add(Header.createHeaderTable());

        document.add(Header.createHeader2());

        /*document.add(Body.createFooterParagraph());*/
        document.add(Body.createOrderDetailsTable(orders, col3));
        document.add(Footer.createHRTable(new float[]{col3}));
        /*document.add(Footer.createFooterTable());*/

        document.close();
    }

    // Custom event handler class for the footer
    private static class MyEventHandler implements IEventHandler {
        private Document document;

        public MyEventHandler(Document document) {
            this.document = document;
        }

        @Override
        public void handleEvent(Event event) {
            PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
            PdfPage page = docEvent.getPage();
            float x = page.getPageSize().getLeft() + 20;
            float y = page.getPageSize().getBottom() + 20;

            Table footerTable = Footer.createFooterTable();
            footerTable.setWidth(page.getPageSize().getWidth() - 40);
            footerTable.setFixedPosition(x, y, page.getPageSize().getWidth() - 40);

            document.add(footerTable);
        }
    }
}