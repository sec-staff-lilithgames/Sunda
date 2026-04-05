package c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f11632b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u0[] f11633c;

    static {
        u0 u0Var = new u0("Default", 0);
        f11632b = u0Var;
        f11633c = new u0[]{u0Var, new u0("UserInput", 1), new u0("PreventUserInput", 2)};
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f11633c.clone();
    }
}
