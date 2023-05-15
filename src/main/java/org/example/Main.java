package org.example;

import org.example.bitmoji.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<<---Welcome To Our Metaverse--->>>");
        Metaverse shiboshi = new Metaverse();

        shiboshi.buildBitmoji("slimDark",BodyType.SLIM,SkinColorType.DARK,"Shirt","Sandals");

        shiboshi.shipToMetaverse();
    }
}