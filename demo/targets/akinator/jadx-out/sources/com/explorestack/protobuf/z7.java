package com.explorestack.protobuf;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
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
public final class z7 {

    /* renamed from: f, reason: collision with root package name */
    public static final z7 f22961f;

    /* renamed from: g, reason: collision with root package name */
    public static final z7 f22962g;

    /* renamed from: h, reason: collision with root package name */
    public static final z7 f22963h;

    /* renamed from: i, reason: collision with root package name */
    public static final z7 f22964i;

    /* renamed from: j, reason: collision with root package name */
    public static final z7 f22965j;

    /* renamed from: k, reason: collision with root package name */
    public static final z7 f22966k;

    /* renamed from: l, reason: collision with root package name */
    public static final z7 f22967l;

    /* renamed from: m, reason: collision with root package name */
    public static final z7 f22968m;

    /* renamed from: n, reason: collision with root package name */
    public static final z7 f22969n;

    /* renamed from: o, reason: collision with root package name */
    public static final z7 f22970o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ z7[] f22971p;

    /* renamed from: b, reason: collision with root package name */
    public final Class f22972b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f22973c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22974e;

    static {
        z7 z7Var = new z7("VOID", 0, Void.class, Void.class, null);
        f22961f = z7Var;
        Class cls = Integer.TYPE;
        z7 z7Var2 = new z7("INT", 1, cls, Integer.class, 0);
        f22962g = z7Var2;
        z7 z7Var3 = new z7("LONG", 2, Long.TYPE, Long.class, 0L);
        f22963h = z7Var3;
        z7 z7Var4 = new z7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f22964i = z7Var4;
        z7 z7Var5 = new z7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f22965j = z7Var5;
        z7 z7Var6 = new z7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f22966k = z7Var6;
        z7 z7Var7 = new z7("STRING", 6, String.class, String.class, "");
        f22967l = z7Var7;
        z7 z7Var8 = new z7("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.EMPTY);
        f22968m = z7Var8;
        z7 z7Var9 = new z7("ENUM", 8, cls, Integer.class, null);
        f22969n = z7Var9;
        z7 z7Var10 = new z7("MESSAGE", 9, Object.class, Object.class, null);
        f22970o = z7Var10;
        f22971p = new z7[]{z7Var, z7Var2, z7Var3, z7Var4, z7Var5, z7Var6, z7Var7, z7Var8, z7Var9, z7Var10};
    }

    public z7(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        this.f22972b = cls;
        this.f22973c = cls2;
        this.f22974e = serializable;
    }

    public static z7 valueOf(String str) {
        return (z7) Enum.valueOf(z7.class, str);
    }

    public static z7[] values() {
        return (z7[]) f22971p.clone();
    }

    public Class<?> getBoxedType() {
        return this.f22973c;
    }

    public Object getDefaultDefault() {
        return this.f22974e;
    }

    public Class<?> getType() {
        return this.f22972b;
    }

    public boolean isValidType(Class<?> cls) {
        return this.f22972b.isAssignableFrom(cls);
    }
}
