package n4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public enum o {
    BOOLEAN(1),
    FLOAT(2),
    INTEGER(3),
    LONG(4),
    STRING(5),
    STRING_SET(6),
    DOUBLE(7),
    BYTES(8),
    VALUE_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f75628b;

    o(int i10) {
        this.f75628b = i10;
    }

    public static o forNumber(int i10) {
        switch (i10) {
            case 0:
                return VALUE_NOT_SET;
            case 1:
                return BOOLEAN;
            case 2:
                return FLOAT;
            case 3:
                return INTEGER;
            case 4:
                return LONG;
            case 5:
                return STRING;
            case 6:
                return STRING_SET;
            case 7:
                return DOUBLE;
            case 8:
                return BYTES;
            default:
                return null;
        }
    }

    public int getNumber() {
        return this.f75628b;
    }

    @Deprecated
    public static o valueOf(int i10) {
        return forNumber(i10);
    }
}
