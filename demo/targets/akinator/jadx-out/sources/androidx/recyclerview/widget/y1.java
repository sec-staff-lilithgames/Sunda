package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final y1 f7321b;

    /* renamed from: c, reason: collision with root package name */
    public static final y1 f7322c;

    /* renamed from: e, reason: collision with root package name */
    public static final y1 f7323e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y1[] f7324f;

    static {
        y1 y1Var = new y1("ALLOW", 0);
        f7321b = y1Var;
        y1 y1Var2 = new y1("PREVENT_WHEN_EMPTY", 1);
        f7322c = y1Var2;
        y1 y1Var3 = new y1("PREVENT", 2);
        f7323e = y1Var3;
        f7324f = new y1[]{y1Var, y1Var2, y1Var3};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f7324f.clone();
    }
}
