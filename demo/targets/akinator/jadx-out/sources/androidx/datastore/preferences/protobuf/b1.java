package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: h, reason: collision with root package name */
    public static final b1 f5811h;

    /* renamed from: i, reason: collision with root package name */
    public static final b1 f5812i;

    /* renamed from: j, reason: collision with root package name */
    public static final b1 f5813j;

    /* renamed from: k, reason: collision with root package name */
    public static final b1 f5814k;

    /* renamed from: l, reason: collision with root package name */
    public static final b1 f5815l;

    /* renamed from: m, reason: collision with root package name */
    public static final b1[] f5816m;

    /* renamed from: n, reason: collision with root package name */
    public static final Type[] f5817n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b1[] f5818o;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f5819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5820c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f5821e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5822f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5823g;

    /* JADX INFO: Fake field, exist only in values array */
    b1 EF0;

    static {
        w1 w1Var = w1.f6083j;
        b1 b1Var = new b1("DOUBLE", 0, 0, 1, w1Var);
        w1 w1Var2 = w1.f6082i;
        b1 b1Var2 = new b1("FLOAT", 1, 1, 1, w1Var2);
        w1 w1Var3 = w1.f6081h;
        b1 b1Var3 = new b1("INT64", 2, 2, 1, w1Var3);
        b1 b1Var4 = new b1("UINT64", 3, 3, 1, w1Var3);
        w1 w1Var4 = w1.f6080g;
        b1 b1Var5 = new b1("INT32", 4, 4, 1, w1Var4);
        b1 b1Var6 = new b1("FIXED64", 5, 5, 1, w1Var3);
        b1 b1Var7 = new b1("FIXED32", 6, 6, 1, w1Var4);
        w1 w1Var5 = w1.f6084k;
        b1 b1Var8 = new b1("BOOL", 7, 7, 1, w1Var5);
        w1 w1Var6 = w1.f6085l;
        b1 b1Var9 = new b1("STRING", 8, 8, 1, w1Var6);
        w1 w1Var7 = w1.f6088o;
        b1 b1Var10 = new b1("MESSAGE", 9, 9, 1, w1Var7);
        w1 w1Var8 = w1.f6086m;
        b1 b1Var11 = new b1("BYTES", 10, 10, 1, w1Var8);
        b1 b1Var12 = new b1("UINT32", 11, 11, 1, w1Var4);
        w1 w1Var9 = w1.f6087n;
        b1 b1Var13 = new b1("ENUM", 12, 12, 1, w1Var9);
        b1 b1Var14 = new b1("SFIXED32", 13, 13, 1, w1Var4);
        b1 b1Var15 = new b1("SFIXED64", 14, 14, 1, w1Var3);
        b1 b1Var16 = new b1("SINT32", 15, 15, 1, w1Var4);
        b1 b1Var17 = new b1("SINT64", 16, 16, 1, w1Var3);
        b1 b1Var18 = new b1("GROUP", 17, 17, 1, w1Var7);
        b1 b1Var19 = new b1("DOUBLE_LIST", 18, 18, 2, w1Var);
        b1 b1Var20 = new b1("FLOAT_LIST", 19, 19, 2, w1Var2);
        b1 b1Var21 = new b1("INT64_LIST", 20, 20, 2, w1Var3);
        b1 b1Var22 = new b1("UINT64_LIST", 21, 21, 2, w1Var3);
        b1 b1Var23 = new b1("INT32_LIST", 22, 22, 2, w1Var4);
        b1 b1Var24 = new b1("FIXED64_LIST", 23, 23, 2, w1Var3);
        b1 b1Var25 = new b1("FIXED32_LIST", 24, 24, 2, w1Var4);
        b1 b1Var26 = new b1("BOOL_LIST", 25, 25, 2, w1Var5);
        b1 b1Var27 = new b1("STRING_LIST", 26, 26, 2, w1Var6);
        b1 b1Var28 = new b1("MESSAGE_LIST", 27, 27, 2, w1Var7);
        f5811h = b1Var28;
        b1 b1Var29 = new b1("BYTES_LIST", 28, 28, 2, w1Var8);
        b1 b1Var30 = new b1("UINT32_LIST", 29, 29, 2, w1Var4);
        b1 b1Var31 = new b1("ENUM_LIST", 30, 30, 2, w1Var9);
        b1 b1Var32 = new b1("SFIXED32_LIST", 31, 31, 2, w1Var4);
        b1 b1Var33 = new b1("SFIXED64_LIST", 32, 32, 2, w1Var3);
        b1 b1Var34 = new b1("SINT32_LIST", 33, 33, 2, w1Var4);
        b1 b1Var35 = new b1("SINT64_LIST", 34, 34, 2, w1Var3);
        b1 b1Var36 = new b1("DOUBLE_LIST_PACKED", 35, 35, 3, w1Var);
        f5812i = b1Var36;
        b1 b1Var37 = new b1("FLOAT_LIST_PACKED", 36, 36, 3, w1Var2);
        b1 b1Var38 = new b1("INT64_LIST_PACKED", 37, 37, 3, w1Var3);
        b1 b1Var39 = new b1("UINT64_LIST_PACKED", 38, 38, 3, w1Var3);
        b1 b1Var40 = new b1("INT32_LIST_PACKED", 39, 39, 3, w1Var4);
        b1 b1Var41 = new b1("FIXED64_LIST_PACKED", 40, 40, 3, w1Var3);
        b1 b1Var42 = new b1("FIXED32_LIST_PACKED", 41, 41, 3, w1Var4);
        b1 b1Var43 = new b1("BOOL_LIST_PACKED", 42, 42, 3, w1Var5);
        b1 b1Var44 = new b1("UINT32_LIST_PACKED", 43, 43, 3, w1Var4);
        b1 b1Var45 = new b1("ENUM_LIST_PACKED", 44, 44, 3, w1Var9);
        b1 b1Var46 = new b1("SFIXED32_LIST_PACKED", 45, 45, 3, w1Var4);
        b1 b1Var47 = new b1("SFIXED64_LIST_PACKED", 46, 46, 3, w1Var3);
        b1 b1Var48 = new b1("SINT32_LIST_PACKED", 47, 47, 3, w1Var4);
        b1 b1Var49 = new b1("SINT64_LIST_PACKED", 48, 48, 3, w1Var3);
        f5813j = b1Var49;
        b1 b1Var50 = new b1("GROUP_LIST", 49, 49, 2, w1Var7);
        f5814k = b1Var50;
        b1 b1Var51 = new b1("MAP", 50, 50, 4, w1.f6079f);
        f5815l = b1Var51;
        f5818o = new b1[]{b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, b1Var8, b1Var9, b1Var10, b1Var11, b1Var12, b1Var13, b1Var14, b1Var15, b1Var16, b1Var17, b1Var18, b1Var19, b1Var20, b1Var21, b1Var22, b1Var23, b1Var24, b1Var25, b1Var26, b1Var27, b1Var28, b1Var29, b1Var30, b1Var31, b1Var32, b1Var33, b1Var34, b1Var35, b1Var36, b1Var37, b1Var38, b1Var39, b1Var40, b1Var41, b1Var42, b1Var43, b1Var44, b1Var45, b1Var46, b1Var47, b1Var48, b1Var49, b1Var50, b1Var51};
        f5817n = new Type[0];
        b1[] b1VarArrValues = values();
        f5816m = new b1[b1VarArrValues.length];
        for (b1 b1Var52 : b1VarArrValues) {
            f5816m[b1Var52.f5820c] = b1Var52;
        }
    }

    public b1(String str, int i10, int i11, int i12, w1 w1Var) {
        int iOrdinal;
        this.f5820c = i11;
        this.f5823g = i12;
        this.f5819b = w1Var;
        int iC = b3.h.c(i12);
        if (iC == 1 || iC == 3) {
            this.f5821e = w1Var.getBoxedType();
        } else {
            this.f5821e = null;
        }
        this.f5822f = (i12 != 1 || (iOrdinal = w1Var.ordinal()) == 6 || iOrdinal == 7 || iOrdinal == 9) ? false : true;
    }

    public static b1 forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        b1[] b1VarArr = f5816m;
        if (i10 >= b1VarArr.length) {
            return null;
        }
        return b1VarArr[i10];
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f5818o.clone();
    }

    public w1 getJavaType() {
        return this.f5819b;
    }

    public int id() {
        return this.f5820c;
    }

    public boolean isList() {
        int i10 = this.f5823g;
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw null;
    }

    public boolean isMap() {
        return this.f5823g == 4;
    }

    public boolean isPacked() {
        return b3.h.a(3, this.f5823g);
    }

    public boolean isPrimitiveScalar() {
        return this.f5822f;
    }

    public boolean isScalar() {
        return this.f5823g == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x002f, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValidForField(java.lang.reflect.Field r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b1.isValidForField(java.lang.reflect.Field):boolean");
    }
}
