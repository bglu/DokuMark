package de.lineas.dokumark;

import org.pegdown.PegDownProcessor;

/**
 * Created by Benjamin on 13.02.2015.
 */
public class Main {


    public static void main(String[] args) {
        PegDownProcessor pdp = new PegDownProcessor();
        String html = pdp.markdownToHtml("#Hello\nDu da,");
        System.out.println(html);

    }
}
