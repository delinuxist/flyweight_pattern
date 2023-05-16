package org.example;

import org.example.bitmoji.*;
import org.example.bitmoji.type.BodyType;
import org.example.bitmoji.type.SkinColorType;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<<---Welcome To Our Metaverse--->>>");
        Metaverse shiboshi = new Metaverse();

        shiboshi.buildBitmoji("slimDark", BodyType.SLIM, SkinColorType.DARK,"Shirt","Sandals");
        shiboshi.buildBitmoji("slimDark",BodyType.SLIM,SkinColorType.DARK,"Straight dress","high heels");

        shiboshi.shipToMetaverse();
    }
}