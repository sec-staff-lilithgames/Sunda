package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a0 f73656a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final v f73657b = new v();

    /* renamed from: c, reason: collision with root package name */
    public static final t f73658c = new t();

    /* renamed from: d, reason: collision with root package name */
    public static final z f73659d = new z();

    /* renamed from: e, reason: collision with root package name */
    public static final x f73660e = new x();

    /* renamed from: f, reason: collision with root package name */
    public static final u f73661f = new u();

    /* renamed from: access$adjustByBoundary--Dv-ylE, reason: not valid java name */
    public static final long m5493access$adjustByBoundaryDvylE(a0 a0Var, g2.x1 x1Var, long j10, kv.l lVar) {
        a0Var.getClass();
        if (x1Var.getLayoutInput().getText().length() == 0) {
            return g2.a2.f56706b.m4051getZerod9O1mEE();
        }
        int lastIndex = sv.n0.getLastIndex(x1Var.getLayoutInput().getText());
        long jM3964unboximpl = ((g2.a2) lVar.invoke(Integer.valueOf(qv.v.coerceIn(g2.a2.m3960getStartimpl(j10), 0, lastIndex)))).m3964unboximpl();
        long jM3964unboximpl2 = ((g2.a2) lVar.invoke(Integer.valueOf(qv.v.coerceIn(g2.a2.m3955getEndimpl(j10), 0, lastIndex)))).m3964unboximpl();
        return g2.b2.TextRange(g2.a2.m3959getReversedimpl(j10) ? g2.a2.m3955getEndimpl(jM3964unboximpl) : g2.a2.m3960getStartimpl(jM3964unboximpl), g2.a2.m3959getReversedimpl(j10) ? g2.a2.m3960getStartimpl(jM3964unboximpl2) : g2.a2.m3955getEndimpl(jM3964unboximpl2));
    }

    public final b0 getCharacter() {
        return f73658c;
    }

    public final b0 getCharacterWithWordAccelerate() {
        return f73661f;
    }

    public final b0 getNone() {
        return f73657b;
    }

    public final b0 getParagraph() {
        return f73660e;
    }

    public final b0 getWord() {
        return f73659d;
    }
}
