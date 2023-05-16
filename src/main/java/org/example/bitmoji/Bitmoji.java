package org.example.bitmoji;

import org.example.bitmoji.type.BitmojiType;

public class Bitmoji {
    private String dressCode;
    private String footWear;

    private BitmojiType bitmojiType;

    public Bitmoji(String dressCode,String footWear,BitmojiType bitmojiType) {
        this.dressCode = dressCode;
        this.footWear = footWear;
        this.bitmojiType = bitmojiType;
    }

    @Override
    public String toString() {
        return "Bitmoji{" +
                "bitmojiType=" + bitmojiType +
                ", dressCode='" + dressCode + '\'' +
                ", footWear='" + footWear + '\'' +
                '}';
    }
}
