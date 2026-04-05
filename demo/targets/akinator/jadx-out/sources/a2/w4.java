package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: b, reason: collision with root package name */
    public static final w4 f3875b;

    /* renamed from: c, reason: collision with root package name */
    public static final w4 f3876c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w4[] f3877e;

    static {
        w4 w4Var = new w4("Shown", 0);
        f3875b = w4Var;
        w4 w4Var2 = new w4("Hidden", 1);
        f3876c = w4Var2;
        f3877e = new w4[]{w4Var, w4Var2};
    }

    public static w4 valueOf(String str) {
        return (w4) Enum.valueOf(w4.class, str);
    }

    public static w4[] values() {
        return (w4[]) f3877e.clone();
    }
}
