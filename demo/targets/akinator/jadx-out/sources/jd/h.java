package jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f69502b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f69503c;

    /* renamed from: e, reason: collision with root package name */
    public static final h f69504e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f69505f;

    static {
        h hVar = new h("DEFAULT", 0);
        f69502b = hVar;
        h hVar2 = new h("VERY_LOW", 1);
        f69503c = hVar2;
        h hVar3 = new h("HIGHEST", 2);
        f69504e = hVar3;
        f69505f = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f69505f.clone();
    }
}
