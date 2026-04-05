package ek;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i0 implements wi.g {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f54548c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i0[] f54549e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f54550f;

    /* renamed from: b, reason: collision with root package name */
    public final int f54551b;

    static {
        i0 i0Var = new i0("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        i0 i0Var2 = new i0("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        i0 i0Var3 = new i0("LOG_ENVIRONMENT_STAGING", 2, 2);
        i0 i0Var4 = new i0("LOG_ENVIRONMENT_PROD", 3, 3);
        f54548c = i0Var4;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4};
        f54549e = i0VarArr;
        f54550f = cv.b.enumEntries(i0VarArr);
    }

    public i0(String str, int i10, int i11) {
        this.f54551b = i11;
    }

    public static cv.a getEntries() {
        return f54550f;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f54549e.clone();
    }

    @Override // wi.g
    public int getNumber() {
        return this.f54551b;
    }
}
