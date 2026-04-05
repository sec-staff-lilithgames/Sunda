package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f53529b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f53530c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f53531e;

    static {
        h hVar = new h("Stripe", 0);
        f53529b = hVar;
        h hVar2 = new h("Location", 1);
        f53530c = hVar2;
        f53531e = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f53531e.clone();
    }
}
