package tb;

import com.unity3d.ads.beta.xyn.RnJusJ;

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
public final class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f86793c;

    /* renamed from: e, reason: collision with root package name */
    public static final w0 f86794e;

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f86795f;

    /* renamed from: g, reason: collision with root package name */
    public static final w0 f86796g;

    /* renamed from: h, reason: collision with root package name */
    public static final w0 f86797h;

    /* renamed from: i, reason: collision with root package name */
    public static final w0 f86798i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w0[] f86799j;

    /* renamed from: b, reason: collision with root package name */
    public final String f86800b;

    public w0(String str, int i10, String str2) {
        this.f86800b = str2;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f86799j.clone();
    }

    public String getDefaultPropertyName() {
        return this.f86800b;
    }

    static {
        w0 w0Var = new w0("NONE", 0, null);
        f86793c = w0Var;
        w0 w0Var2 = new w0("CLASS", 1, "@class");
        f86794e = w0Var2;
        w0 w0Var3 = new w0("MINIMAL_CLASS", 2, "@c");
        f86795f = w0Var3;
        String str = RnJusJ.BYBxvzNK;
        w0 w0Var4 = new w0("NAME", 3, str);
        f86796g = w0Var4;
        w0 w0Var5 = new w0("SIMPLE_NAME", 4, str);
        f86797h = w0Var5;
        w0 w0Var6 = new w0("DEDUCTION", 5, null);
        f86798i = w0Var6;
        f86799j = new w0[]{w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, new w0(com.ironsource.mediationsdk.l.f37559f, 6, null)};
    }
}
