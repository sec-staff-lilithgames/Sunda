package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class hd {
    public static Object a(y yVar, bd bdVar, gd gdVar) {
        switch (bdVar.ordinal()) {
            case 0:
                return Double.valueOf(yVar.readDouble());
            case 1:
                return Float.valueOf(yVar.readFloat());
            case 2:
                return Long.valueOf(yVar.readInt64());
            case 3:
                return Long.valueOf(yVar.readUInt64());
            case 4:
                return Integer.valueOf(yVar.readInt32());
            case 5:
                return Long.valueOf(yVar.readFixed64());
            case 6:
                return Integer.valueOf(yVar.readFixed32());
            case 7:
                return Boolean.valueOf(yVar.readBool());
            case 8:
                return gdVar.a(yVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return yVar.readBytes();
            case 12:
                return Integer.valueOf(yVar.readUInt32());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(yVar.readSFixed32());
            case 15:
                return Long.valueOf(yVar.readSFixed64());
            case 16:
                return Integer.valueOf(yVar.readSInt32());
            case 17:
                return Long.valueOf(yVar.readSInt64());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int getTagFieldNumber(int i10) {
        return i10 >>> 3;
    }

    public static int getTagWireType(int i10) {
        return i10 & 7;
    }
}
