package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: b, reason: collision with root package name */
    public static final l3 f51488b;

    /* renamed from: c, reason: collision with root package name */
    public static final l3 f51489c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l3[] f51490e;

    static {
        l3 l3Var = new l3("Default", 0);
        f51488b = l3Var;
        l3 l3Var2 = new l3("UserInput", 1);
        f51489c = l3Var2;
        f51490e = new l3[]{l3Var, l3Var2, new l3("PreventUserInput", 2)};
    }

    public static l3 valueOf(String str) {
        return (l3) Enum.valueOf(l3.class, str);
    }

    public static l3[] values() {
        return (l3[]) f51490e.clone();
    }
}
