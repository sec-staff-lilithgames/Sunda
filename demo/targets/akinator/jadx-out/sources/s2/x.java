package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f85363b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f85364c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x[] f85365e;

    static {
        x xVar = new x("Ltr", 0);
        f85363b = xVar;
        x xVar2 = new x("Rtl", 1);
        f85364c = xVar2;
        f85365e = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f85365e.clone();
    }
}
