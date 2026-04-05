package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f73126b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f73127c;

    /* renamed from: e, reason: collision with root package name */
    public static final k f73128e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f73129f;

    static {
        k kVar = new k("DELEGATING", 0);
        f73126b = kVar;
        k kVar2 = new k("PROPERTIES", 1);
        f73127c = kVar2;
        k kVar3 = new k("HEURISTIC", 2);
        f73128e = kVar3;
        f73129f = new k[]{kVar, kVar2, kVar3, new k("REQUIRE_MODE", 3)};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f73129f.clone();
    }
}
