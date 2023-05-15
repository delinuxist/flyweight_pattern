package org.example.bitmoji;

public class BitmojiType {

    private String name;
    private BodyType type;
    private  SkinColorType skinColor;

    public BitmojiType(String name,BodyType type,SkinColorType skinColor) {
        this.name = name;
        this.type = type;
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "BitmojiType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", skinColor=" + skinColor +
                '}';
    }
}
