package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t4 {
    public static Object a(c0 c0Var, r4 r4Var, int i10) {
        switch (r4Var.ordinal()) {
            case 0:
                return Double.valueOf(c0Var.readDouble());
            case 1:
                return Float.valueOf(c0Var.readFloat());
            case 2:
                return Long.valueOf(c0Var.readInt64());
            case 3:
                return Long.valueOf(c0Var.readUInt64());
            case 4:
                return Integer.valueOf(c0Var.readInt32());
            case 5:
                return Long.valueOf(c0Var.readFixed64());
            case 6:
                return Integer.valueOf(c0Var.readFixed32());
            case 7:
                return Boolean.valueOf(c0Var.readBool());
            case 8:
                return i10 != 1 ? i10 != 2 ? c0Var.readBytes() : c0Var.readStringRequireUtf8() : c0Var.readString();
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c0Var.readBytes();
            case 12:
                return Integer.valueOf(c0Var.readUInt32());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c0Var.readSFixed32());
            case 15:
                return Long.valueOf(c0Var.readSFixed64());
            case 16:
                return Integer.valueOf(c0Var.readSInt32());
            case 17:
                return Long.valueOf(c0Var.readSInt64());
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
