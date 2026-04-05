package sv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final c f86128c;

    /* renamed from: e, reason: collision with root package name */
    public static final tu.o f86129e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f86130f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f86131g;

    /* renamed from: b, reason: collision with root package name */
    public final int f86132b;

    static {
        d[] dVarArr = {new d("UNDEFINED", 0, -1), new d("LEFT_TO_RIGHT", 1, 0), new d("RIGHT_TO_LEFT", 2, 1), new d("RIGHT_TO_LEFT_ARABIC", 3, 2), new d("EUROPEAN_NUMBER", 4, 3), new d("EUROPEAN_NUMBER_SEPARATOR", 5, 4), new d("EUROPEAN_NUMBER_TERMINATOR", 6, 5), new d("ARABIC_NUMBER", 7, 6), new d("COMMON_NUMBER_SEPARATOR", 8, 7), new d("NONSPACING_MARK", 9, 8), new d("BOUNDARY_NEUTRAL", 10, 9), new d("PARAGRAPH_SEPARATOR", 11, 10), new d("SEGMENT_SEPARATOR", 12, 11), new d("WHITESPACE", 13, 12), new d("OTHER_NEUTRALS", 14, 13), new d("LEFT_TO_RIGHT_EMBEDDING", 15, 14), new d("LEFT_TO_RIGHT_OVERRIDE", 16, 15), new d("RIGHT_TO_LEFT_EMBEDDING", 17, 16), new d("RIGHT_TO_LEFT_OVERRIDE", 18, 17), new d("POP_DIRECTIONAL_FORMAT", 19, 18)};
        f86130f = dVarArr;
        f86131g = cv.b.enumEntries(dVarArr);
        f86128c = new c(null);
        f86129e = tu.q.lazy(new i.f(13));
    }

    public d(String str, int i10, int i11) {
        this.f86132b = i11;
    }

    public static cv.a getEntries() {
        return f86131g;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f86130f.clone();
    }

    public final int getValue() {
        return this.f86132b;
    }
}
