package c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f11480b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f11481c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f11482e;

    static {
        h hVar = new h("BoundReached", 0);
        f11480b = hVar;
        h hVar2 = new h("Finished", 1);
        f11481c = hVar2;
        f11482e = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f11482e.clone();
    }
}
