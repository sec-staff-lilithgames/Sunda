package fk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f55731b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f55732c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f55733e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f55734f;

    static {
        e eVar = new e("CRASHLYTICS", 0);
        f55731b = eVar;
        e eVar2 = new e("PERFORMANCE", 1);
        f55732c = eVar2;
        e[] eVarArr = {eVar, eVar2, new e("MATT_SAYS_HI", 2)};
        f55733e = eVarArr;
        f55734f = cv.b.enumEntries(eVarArr);
    }

    public static cv.a getEntries() {
        return f55734f;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f55733e.clone();
    }
}
