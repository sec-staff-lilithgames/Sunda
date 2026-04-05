package pi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f81392b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f81393c;

    /* renamed from: e, reason: collision with root package name */
    public static final e f81394e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f81395f;

    static {
        e eVar = new e("USE_CACHE", 0);
        f81392b = eVar;
        e eVar2 = new e("SKIP_CACHE_LOOKUP", 1);
        f81393c = eVar2;
        e eVar3 = new e("IGNORE_CACHE_EXPIRATION", 2);
        f81394e = eVar3;
        f81395f = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f81395f.clone();
    }
}
