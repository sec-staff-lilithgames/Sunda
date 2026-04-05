package sv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f86123e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b0[] f86124f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f86125g;

    /* renamed from: b, reason: collision with root package name */
    public final int f86126b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86127c;

    static {
        b0 b0Var = new b0("IGNORE_CASE", 0, 2);
        b0 b0Var2 = new b0("MULTILINE", 1, 8);
        b0 b0Var3 = new b0("LITERAL", 2, 16);
        f86123e = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, new b0("UNIX_LINES", 3, 1), new b0("COMMENTS", 4, 4), new b0("DOT_MATCHES_ALL", 5, 32), new b0("CANON_EQ", 6, 128)};
        f86124f = b0VarArr;
        f86125g = cv.b.enumEntries(b0VarArr);
    }

    public b0(String str, int i10, int i11) {
        this.f86126b = i11;
        this.f86127c = i11;
    }

    public static cv.a getEntries() {
        return f86125g;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f86124f.clone();
    }

    @Override // sv.j
    public int getMask() {
        return this.f86127c;
    }

    @Override // sv.j
    public int getValue() {
        return this.f86126b;
    }
}
