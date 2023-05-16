package org.example.bitmoji.type;

public class BitmojiType {

    private String name;
    private BodyType bodyType;
    private SkinColorType skinColor;

    public BitmojiType(String name,BodyType type,SkinColorType skinColor) {
        this.name = name;
        this.bodyType = type;
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "BitmojiType{" +
                "name='" + name + '\'' +
                ", type=" + bodyType +
                ", skinColor=" + skinColor +
                '}';
    }
}
