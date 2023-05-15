package org.example.bitmoji;

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
                "dressCode='" + dressCode + '\'' +
                ", footWear='" + footWear + '\'' +
                ", bitmojiType=" + bitmojiType +
                '}';
    }
}
