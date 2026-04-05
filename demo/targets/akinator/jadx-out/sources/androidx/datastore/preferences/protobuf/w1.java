package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: f, reason: collision with root package name */
    public static final w1 f6079f;

    /* renamed from: g, reason: collision with root package name */
    public static final w1 f6080g;

    /* renamed from: h, reason: collision with root package name */
    public static final w1 f6081h;

    /* renamed from: i, reason: collision with root package name */
    public static final w1 f6082i;

    /* renamed from: j, reason: collision with root package name */
    public static final w1 f6083j;

    /* renamed from: k, reason: collision with root package name */
    public static final w1 f6084k;

    /* renamed from: l, reason: collision with root package name */
    public static final w1 f6085l;

    /* renamed from: m, reason: collision with root package name */
    public static final w1 f6086m;

    /* renamed from: n, reason: collision with root package name */
    public static final w1 f6087n;

    /* renamed from: o, reason: collision with root package name */
    public static final w1 f6088o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w1[] f6089p;

    /* renamed from: b, reason: collision with root package name */
    public final Class f6090b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f6091c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6092e;

    static {
        w1 w1Var = new w1("VOID", 0, Void.class, Void.class, null);
        f6079f = w1Var;
        Class cls = Integer.TYPE;
        w1 w1Var2 = new w1("INT", 1, cls, Integer.class, 0);
        f6080g = w1Var2;
        w1 w1Var3 = new w1("LONG", 2, Long.TYPE, Long.class, 0L);
        f6081h = w1Var3;
        w1 w1Var4 = new w1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6082i = w1Var4;
        w1 w1Var5 = new w1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6083j = w1Var5;
        w1 w1Var6 = new w1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6084k = w1Var6;
        w1 w1Var7 = new w1("STRING", 6, String.class, String.class, "");
        f6085l = w1Var7;
        w1 w1Var8 = new w1("BYTE_STRING", 7, x.class, x.class, x.f6099c);
        f6086m = w1Var8;
        w1 w1Var9 = new w1("ENUM", 8, cls, Integer.class, null);
        f6087n = w1Var9;
        w1 w1Var10 = new w1("MESSAGE", 9, Object.class, Object.class, null);
        f6088o = w1Var10;
        f6089p = new w1[]{w1Var, w1Var2, w1Var3, w1Var4, w1Var5, w1Var6, w1Var7, w1Var8, w1Var9, w1Var10};
    }

    public w1(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        this.f6090b = cls;
        this.f6091c = cls2;
        this.f6092e = serializable;
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) f6089p.clone();
    }

    public Class<?> getBoxedType() {
        return this.f6091c;
    }

    public Object getDefaultDefault() {
        return this.f6092e;
    }

    public Class<?> getType() {
        return this.f6090b;
    }

    public boolean isValidType(Class<?> cls) {
        return this.f6090b.isAssignableFrom(cls);
    }
}
