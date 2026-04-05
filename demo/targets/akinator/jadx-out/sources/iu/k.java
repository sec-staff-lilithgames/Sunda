package iu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f68411b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f68412c;

    /* renamed from: e, reason: collision with root package name */
    public static final k f68413e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f68414f;

    static {
        k kVar = new k("IMMEDIATE", 0);
        f68411b = kVar;
        k kVar2 = new k("BOUNDARY", 1);
        f68412c = kVar2;
        k kVar3 = new k("END", 2);
        f68413e = kVar3;
        f68414f = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f68414f.clone();
    }
}
