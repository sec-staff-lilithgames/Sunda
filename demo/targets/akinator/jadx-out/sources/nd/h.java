package nd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f75987b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f75988c;

    /* renamed from: e, reason: collision with root package name */
    public static final h f75989e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f75990f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f75991g;

    static {
        h hVar = new h("OK", 0);
        f75987b = hVar;
        h hVar2 = new h("TRANSIENT_ERROR", 1);
        f75988c = hVar2;
        h hVar3 = new h("FATAL_ERROR", 2);
        f75989e = hVar3;
        h hVar4 = new h("INVALID_PAYLOAD", 3);
        f75990f = hVar4;
        f75991g = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f75991g.clone();
    }
}
