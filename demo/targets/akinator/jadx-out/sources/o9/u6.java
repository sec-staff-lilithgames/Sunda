package o9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u6 {

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f78591b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f78592c;

    /* renamed from: e, reason: collision with root package name */
    public static final u6 f78593e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u6[] f78594f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f78595g;

    static {
        u6 u6Var = new u6("PROPOSAL", 0);
        f78591b = u6Var;
        u6 u6Var2 = new u6("LOCKED_RARE_CHARACTER", 1);
        f78592c = u6Var2;
        u6 u6Var3 = new u6("UNLOCKED_RARE_CHARACTER", 2);
        f78593e = u6Var3;
        u6[] u6VarArr = {u6Var, u6Var2, u6Var3};
        f78594f = u6VarArr;
        f78595g = cv.b.enumEntries(u6VarArr);
    }

    public static cv.a getEntries() {
        return f78595g;
    }

    public static u6 valueOf(String str) {
        return (u6) Enum.valueOf(u6.class, str);
    }

    public static u6[] values() {
        return (u6[]) f78594f.clone();
    }
}
