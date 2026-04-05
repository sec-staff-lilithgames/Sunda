package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: b, reason: collision with root package name */
    public static final o3 f80381b;

    /* renamed from: c, reason: collision with root package name */
    public static final o3 f80382c;

    /* renamed from: e, reason: collision with root package name */
    public static final o3 f80383e;

    /* renamed from: f, reason: collision with root package name */
    public static final o3 f80384f;

    /* renamed from: g, reason: collision with root package name */
    public static final o3 f80385g;

    /* renamed from: h, reason: collision with root package name */
    public static final o3 f80386h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ o3[] f80387i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cv.a f80388j;

    static {
        o3 o3Var = new o3("ShutDown", 0);
        f80381b = o3Var;
        o3 o3Var2 = new o3("ShuttingDown", 1);
        f80382c = o3Var2;
        o3 o3Var3 = new o3("Inactive", 2);
        f80383e = o3Var3;
        o3 o3Var4 = new o3("InactivePendingWork", 3);
        f80384f = o3Var4;
        o3 o3Var5 = new o3("Idle", 4);
        f80385g = o3Var5;
        o3 o3Var6 = new o3("PendingWork", 5);
        f80386h = o3Var6;
        o3[] o3VarArr = {o3Var, o3Var2, o3Var3, o3Var4, o3Var5, o3Var6};
        f80387i = o3VarArr;
        f80388j = cv.b.enumEntries(o3VarArr);
    }

    public static cv.a getEntries() {
        return f80388j;
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) f80387i.clone();
    }
}
