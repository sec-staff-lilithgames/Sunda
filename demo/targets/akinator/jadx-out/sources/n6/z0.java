package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f75816b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f75817c;

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f75818e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z0[] f75819f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75820g;

    static {
        z0 z0Var = new z0("NOT_APPLIED", 0);
        f75816b = z0Var;
        z0 z0Var2 = new z0("APPLIED_IMMEDIATELY", 1);
        f75817c = z0Var2;
        z0 z0Var3 = new z0("APPLIED_FOR_NEXT_RUN", 2);
        f75818e = z0Var3;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
        f75819f = z0VarArr;
        f75820g = cv.b.enumEntries(z0VarArr);
    }

    public static cv.a getEntries() {
        return f75820g;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f75819f.clone();
    }
}
