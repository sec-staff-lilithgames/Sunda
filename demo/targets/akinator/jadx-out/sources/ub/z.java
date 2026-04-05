package ub;

import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum z {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY(C3191e4.i.f36529d, 3),
    END_ARRAY(C3191e4.i.f36531e, 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL(AbstractJsonLexerKt.NULL, 11);


    /* renamed from: b, reason: collision with root package name */
    public final String f88395b;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f88396c;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f88397e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88398f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f88399g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f88400h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f88401i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f88402j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f88403k;

    z(String str, int i10) {
        boolean z10 = false;
        if (str == null) {
            this.f88395b = null;
            this.f88396c = null;
            this.f88397e = null;
        } else {
            this.f88395b = str;
            char[] charArray = str.toCharArray();
            this.f88396c = charArray;
            int length = charArray.length;
            this.f88397e = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.f88397e[i11] = (byte) this.f88396c[i11];
            }
        }
        this.f88398f = i10;
        this.f88402j = i10 == 10 || i10 == 9;
        this.f88401i = i10 == 7 || i10 == 8;
        boolean z11 = i10 == 1 || i10 == 3;
        this.f88399g = z11;
        boolean z12 = i10 == 2 || i10 == 4;
        this.f88400h = z12;
        if (!z11 && !z12 && i10 != 5 && i10 != -1) {
            z10 = true;
        }
        this.f88403k = z10;
    }

    public static String valueDescFor(z zVar) {
        if (zVar == null) {
            return "<end of input>";
        }
        switch (zVar.ordinal()) {
            case 1:
            case 2:
            case 5:
                return "Object value";
            case 3:
            case 4:
                return "Array value";
            case 6:
                return "Embedded Object value";
            case 7:
                return "String value";
            case 8:
                return "Integer value";
            case 9:
                return "Floating-point value";
            case 10:
            case 11:
                return "Boolean value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    public final byte[] asByteArray() {
        return this.f88397e;
    }

    public final char[] asCharArray() {
        return this.f88396c;
    }

    public final String asString() {
        return this.f88395b;
    }

    public final int id() {
        return this.f88398f;
    }

    public final boolean isBoolean() {
        return this.f88402j;
    }

    public final boolean isNumeric() {
        return this.f88401i;
    }

    public final boolean isScalarValue() {
        return this.f88403k;
    }

    public final boolean isStructEnd() {
        return this.f88400h;
    }

    public final boolean isStructStart() {
        return this.f88399g;
    }
}
