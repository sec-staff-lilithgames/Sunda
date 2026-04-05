package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f56760b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f56761c;

    /* renamed from: e, reason: collision with root package name */
    public static final h f56762e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f56763f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f56764g;

    static {
        h hVar = new h("Paragraph", 0);
        f56760b = hVar;
        h hVar2 = new h("Span", 1);
        f56761c = hVar2;
        h hVar3 = new h("VerbatimTts", 2);
        f56762e = hVar3;
        h hVar4 = new h("String", 3);
        f56763f = hVar4;
        f56764g = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f56764g.clone();
    }
}
