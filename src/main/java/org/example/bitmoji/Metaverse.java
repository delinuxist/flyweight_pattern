package org.example.bitmoji;

import org.example.bitmoji.factory.BitmojiFactory;
import org.example.bitmoji.type.BitmojiType;
import org.example.bitmoji.type.BodyType;
import org.example.bitmoji.type.SkinColorType;

import java.util.ArrayList;
import java.util.List;

public class Metaverse {
    private List<Bitmoji> bitmojis = new ArrayList<>();

    public void buildBitmoji(String name, BodyType bodyType, SkinColorType skinColorType, String dressCode, String footWear) {
        BitmojiType bitmojiType = BitmojiFactory.getBitmojiType(name,skinColorType,bodyType);
        Bitmoji bitmoji = new Bitmoji(dressCode,footWear,bitmojiType);
        bitmojis.add(bitmoji);
    }

    public void shipToMetaverse() {
        for (Bitmoji bitmoji : bitmojis) {
            System.out.println(bitmoji);
        }
    }
}
