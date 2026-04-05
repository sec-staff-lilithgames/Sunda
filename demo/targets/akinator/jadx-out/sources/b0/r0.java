package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f8493b;

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f8494c;

    /* renamed from: e, reason: collision with root package name */
    public static final r0 f8495e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r0[] f8496f;

    static {
        r0 r0Var = new r0("PreEnter", 0);
        f8493b = r0Var;
        r0 r0Var2 = new r0("Visible", 1);
        f8494c = r0Var2;
        r0 r0Var3 = new r0("PostExit", 2);
        f8495e = r0Var3;
        f8496f = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f8496f.clone();
    }
}
