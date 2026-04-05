package com.explorestack.protobuf;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c6 {
    public static final c6 A;
    public static final c6 B;
    public static final c6 C;
    public static final c6 D;
    public static final c6 E;
    public static final c6 F;
    public static final c6 G;
    public static final c6 H;
    public static final c6 I;
    public static final c6 J;
    public static final c6 K;
    public static final c6 L;
    public static final c6 M;
    public static final c6 N;
    public static final c6 O;
    public static final c6 P;
    public static final c6 Q;
    public static final c6 R;
    public static final c6 S;
    public static final c6 T;
    public static final c6 U;
    public static final c6 V;
    public static final c6 W;
    public static final c6 X;
    public static final c6 Y;
    public static final c6 Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final c6 f21987a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final c6 f21988b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final c6 f21989c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final c6 f21990d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final c6 f21991e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final c6 f21992f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final c6[] f21993g0;

    /* renamed from: h, reason: collision with root package name */
    public static final c6 f21994h;

    /* renamed from: h0, reason: collision with root package name */
    public static final Type[] f21995h0;

    /* renamed from: i, reason: collision with root package name */
    public static final c6 f21996i;

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ c6[] f21997i0;

    /* renamed from: j, reason: collision with root package name */
    public static final c6 f21998j;

    /* renamed from: k, reason: collision with root package name */
    public static final c6 f21999k;

    /* renamed from: l, reason: collision with root package name */
    public static final c6 f22000l;

    /* renamed from: m, reason: collision with root package name */
    public static final c6 f22001m;

    /* renamed from: n, reason: collision with root package name */
    public static final c6 f22002n;

    /* renamed from: o, reason: collision with root package name */
    public static final c6 f22003o;

    /* renamed from: p, reason: collision with root package name */
    public static final c6 f22004p;

    /* renamed from: q, reason: collision with root package name */
    public static final c6 f22005q;

    /* renamed from: r, reason: collision with root package name */
    public static final c6 f22006r;

    /* renamed from: s, reason: collision with root package name */
    public static final c6 f22007s;

    /* renamed from: t, reason: collision with root package name */
    public static final c6 f22008t;

    /* renamed from: u, reason: collision with root package name */
    public static final c6 f22009u;

    /* renamed from: v, reason: collision with root package name */
    public static final c6 f22010v;

    /* renamed from: w, reason: collision with root package name */
    public static final c6 f22011w;

    /* renamed from: x, reason: collision with root package name */
    public static final c6 f22012x;

    /* renamed from: y, reason: collision with root package name */
    public static final c6 f22013y;

    /* renamed from: z, reason: collision with root package name */
    public static final c6 f22014z;

    /* renamed from: b, reason: collision with root package name */
    public final z7 f22015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22016c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f22017e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22018f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22019g;

    public c6(String str, int i10, int i11, int i12, z7 z7Var) {
        int iOrdinal;
        this.f22016c = i11;
        this.f22019g = i12;
        this.f22015b = z7Var;
        int iC = b3.h.c(i12);
        if (iC == 1 || iC == 3) {
            this.f22017e = z7Var.getBoxedType();
        } else {
            this.f22017e = null;
        }
        this.f22018f = (i12 != 1 || (iOrdinal = z7Var.ordinal()) == 6 || iOrdinal == 7 || iOrdinal == 9) ? false : true;
    }

    public static c6 forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        c6[] c6VarArr = f21993g0;
        if (i10 >= c6VarArr.length) {
            return null;
        }
        return c6VarArr[i10];
    }

    public static c6 valueOf(String str) {
        return (c6) Enum.valueOf(c6.class, str);
    }

    public static c6[] values() {
        return (c6[]) f21997i0.clone();
    }

    public z7 getJavaType() {
        return this.f22015b;
    }

    public int id() {
        return this.f22016c;
    }

    public boolean isList() {
        int i10 = this.f22019g;
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
        return this.f22019g == 4;
    }

    public boolean isPacked() {
        return b3.h.a(3, this.f22019g);
    }

    public boolean isPrimitiveScalar() {
        return this.f22018f;
    }

    public boolean isScalar() {
        return this.f22019g == 1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.c6.isValidForField(java.lang.reflect.Field):boolean");
    }

    static {
        z7 z7Var = z7.f22965j;
        c6 c6Var = new c6("DOUBLE", 0, 0, 1, z7Var);
        f21994h = c6Var;
        z7 z7Var2 = z7.f22964i;
        c6 c6Var2 = new c6("FLOAT", 1, 1, 1, z7Var2);
        f21996i = c6Var2;
        z7 z7Var3 = z7.f22963h;
        c6 c6Var3 = new c6("INT64", 2, 2, 1, z7Var3);
        f21998j = c6Var3;
        c6 c6Var4 = new c6("UINT64", 3, 3, 1, z7Var3);
        f21999k = c6Var4;
        z7 z7Var4 = z7.f22962g;
        c6 c6Var5 = new c6(wHkgq.kNKeFVLLcUYo, 4, 4, 1, z7Var4);
        f22000l = c6Var5;
        c6 c6Var6 = new c6("FIXED64", 5, 5, 1, z7Var3);
        f22001m = c6Var6;
        c6 c6Var7 = new c6("FIXED32", 6, 6, 1, z7Var4);
        f22002n = c6Var7;
        z7 z7Var5 = z7.f22966k;
        c6 c6Var8 = new c6("BOOL", 7, 7, 1, z7Var5);
        f22003o = c6Var8;
        z7 z7Var6 = z7.f22967l;
        c6 c6Var9 = new c6("STRING", 8, 8, 1, z7Var6);
        f22004p = c6Var9;
        z7 z7Var7 = z7.f22970o;
        c6 c6Var10 = new c6("MESSAGE", 9, 9, 1, z7Var7);
        f22005q = c6Var10;
        z7 z7Var8 = z7.f22968m;
        c6 c6Var11 = new c6("BYTES", 10, 10, 1, z7Var8);
        f22006r = c6Var11;
        c6 c6Var12 = new c6("UINT32", 11, 11, 1, z7Var4);
        f22007s = c6Var12;
        z7 z7Var9 = z7.f22969n;
        c6 c6Var13 = new c6("ENUM", 12, 12, 1, z7Var9);
        f22008t = c6Var13;
        c6 c6Var14 = new c6("SFIXED32", 13, 13, 1, z7Var4);
        f22009u = c6Var14;
        c6 c6Var15 = new c6("SFIXED64", 14, 14, 1, z7Var3);
        f22010v = c6Var15;
        c6 c6Var16 = new c6("SINT32", 15, 15, 1, z7Var4);
        f22011w = c6Var16;
        c6 c6Var17 = new c6("SINT64", 16, 16, 1, z7Var3);
        f22012x = c6Var17;
        c6 c6Var18 = new c6("GROUP", 17, 17, 1, z7Var7);
        f22013y = c6Var18;
        c6 c6Var19 = new c6("DOUBLE_LIST", 18, 18, 2, z7Var);
        f22014z = c6Var19;
        c6 c6Var20 = new c6("FLOAT_LIST", 19, 19, 2, z7Var2);
        A = c6Var20;
        c6 c6Var21 = new c6("INT64_LIST", 20, 20, 2, z7Var3);
        B = c6Var21;
        c6 c6Var22 = new c6("UINT64_LIST", 21, 21, 2, z7Var3);
        C = c6Var22;
        c6 c6Var23 = new c6("INT32_LIST", 22, 22, 2, z7Var4);
        D = c6Var23;
        c6 c6Var24 = new c6("FIXED64_LIST", 23, 23, 2, z7Var3);
        E = c6Var24;
        c6 c6Var25 = new c6("FIXED32_LIST", 24, 24, 2, z7Var4);
        F = c6Var25;
        c6 c6Var26 = new c6("BOOL_LIST", 25, 25, 2, z7Var5);
        G = c6Var26;
        c6 c6Var27 = new c6("STRING_LIST", 26, 26, 2, z7Var6);
        H = c6Var27;
        c6 c6Var28 = new c6("MESSAGE_LIST", 27, 27, 2, z7Var7);
        I = c6Var28;
        c6 c6Var29 = new c6("BYTES_LIST", 28, 28, 2, z7Var8);
        J = c6Var29;
        c6 c6Var30 = new c6("UINT32_LIST", 29, 29, 2, z7Var4);
        K = c6Var30;
        c6 c6Var31 = new c6("ENUM_LIST", 30, 30, 2, z7Var9);
        L = c6Var31;
        c6 c6Var32 = new c6("SFIXED32_LIST", 31, 31, 2, z7Var4);
        M = c6Var32;
        c6 c6Var33 = new c6("SFIXED64_LIST", 32, 32, 2, z7Var3);
        N = c6Var33;
        c6 c6Var34 = new c6("SINT32_LIST", 33, 33, 2, z7Var4);
        O = c6Var34;
        c6 c6Var35 = new c6("SINT64_LIST", 34, 34, 2, z7Var3);
        P = c6Var35;
        c6 c6Var36 = new c6("DOUBLE_LIST_PACKED", 35, 35, 3, z7Var);
        Q = c6Var36;
        c6 c6Var37 = new c6("FLOAT_LIST_PACKED", 36, 36, 3, z7Var2);
        R = c6Var37;
        c6 c6Var38 = new c6("INT64_LIST_PACKED", 37, 37, 3, z7Var3);
        S = c6Var38;
        c6 c6Var39 = new c6("UINT64_LIST_PACKED", 38, 38, 3, z7Var3);
        T = c6Var39;
        c6 c6Var40 = new c6("INT32_LIST_PACKED", 39, 39, 3, z7Var4);
        U = c6Var40;
        c6 c6Var41 = new c6("FIXED64_LIST_PACKED", 40, 40, 3, z7Var3);
        V = c6Var41;
        c6 c6Var42 = new c6("FIXED32_LIST_PACKED", 41, 41, 3, z7Var4);
        W = c6Var42;
        c6 c6Var43 = new c6("BOOL_LIST_PACKED", 42, 42, 3, z7Var5);
        X = c6Var43;
        c6 c6Var44 = new c6("UINT32_LIST_PACKED", 43, 43, 3, z7Var4);
        Y = c6Var44;
        c6 c6Var45 = new c6("ENUM_LIST_PACKED", 44, 44, 3, z7Var9);
        Z = c6Var45;
        c6 c6Var46 = new c6("SFIXED32_LIST_PACKED", 45, 45, 3, z7Var4);
        f21987a0 = c6Var46;
        c6 c6Var47 = new c6("SFIXED64_LIST_PACKED", 46, 46, 3, z7Var3);
        f21988b0 = c6Var47;
        c6 c6Var48 = new c6("SINT32_LIST_PACKED", 47, 47, 3, z7Var4);
        f21989c0 = c6Var48;
        c6 c6Var49 = new c6("SINT64_LIST_PACKED", 48, 48, 3, z7Var3);
        f21990d0 = c6Var49;
        c6 c6Var50 = new c6("GROUP_LIST", 49, 49, 2, z7Var7);
        f21991e0 = c6Var50;
        c6 c6Var51 = new c6("MAP", 50, 50, 4, z7.f22961f);
        f21992f0 = c6Var51;
        f21997i0 = new c6[]{c6Var, c6Var2, c6Var3, c6Var4, c6Var5, c6Var6, c6Var7, c6Var8, c6Var9, c6Var10, c6Var11, c6Var12, c6Var13, c6Var14, c6Var15, c6Var16, c6Var17, c6Var18, c6Var19, c6Var20, c6Var21, c6Var22, c6Var23, c6Var24, c6Var25, c6Var26, c6Var27, c6Var28, c6Var29, c6Var30, c6Var31, c6Var32, c6Var33, c6Var34, c6Var35, c6Var36, c6Var37, c6Var38, c6Var39, c6Var40, c6Var41, c6Var42, c6Var43, c6Var44, c6Var45, c6Var46, c6Var47, c6Var48, c6Var49, c6Var50, c6Var51};
        f21995h0 = new Type[0];
        c6[] c6VarArrValues = values();
        f21993g0 = new c6[c6VarArrValues.length];
        for (c6 c6Var52 : c6VarArrValues) {
            f21993g0[c6Var52.f22016c] = c6Var52;
        }
    }
}
