package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f75705b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f75706c;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f75707e;

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f75708f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f75709g;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f75710h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d0[] f75711i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75712j;

    static {
        d0 d0Var = new d0("NOT_REQUIRED", 0);
        f75705b = d0Var;
        d0 d0Var2 = new d0("CONNECTED", 1);
        f75706c = d0Var2;
        d0 d0Var3 = new d0("UNMETERED", 2);
        f75707e = d0Var3;
        d0 d0Var4 = new d0("NOT_ROAMING", 3);
        f75708f = d0Var4;
        d0 d0Var5 = new d0("METERED", 4);
        f75709g = d0Var5;
        d0 d0Var6 = new d0("TEMPORARILY_UNMETERED", 5);
        f75710h = d0Var6;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6};
        f75711i = d0VarArr;
        f75712j = cv.b.enumEntries(d0VarArr);
    }

    public static cv.a getEntries() {
        return f75712j;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f75711i.clone();
    }
}
