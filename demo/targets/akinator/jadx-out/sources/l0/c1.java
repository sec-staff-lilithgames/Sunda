package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f72064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f72065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m2.j0 f72066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m2.z f72067h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(j1.b0 b0Var, i1 i1Var, m2.j0 j0Var, m2.z zVar) {
        super(3);
        this.f72064e = b0Var;
        this.f72065f = i1Var;
        this.f72066g = j0Var;
        this.f72067h = zVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e1.v invoke(e1.v r11, p0.w r12, int r13) {
        /*
            r10 = this;
            java.lang.String r13 = "$this$composed"
            kotlin.jvm.internal.e0.checkNotNullParameter(r11, r13)
            r13 = 1634330012(0x6169e59c, float:2.6966478E20)
            r12.startReplaceableGroup(r13)
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r13)
            java.lang.Object r13 = r12.rememberedValue()
            p0.v r0 = p0.v.f80515a
            java.lang.Object r0 = r0.getEmpty()
            r1 = 0
            if (r13 != r0) goto L29
            r13 = 0
            r0 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            c0.e r13 = c0.f.Animatable$default(r2, r13, r0, r1)
            r12.updateRememberedValue(r13)
        L29:
            r12.endReplaceableGroup()
            r3 = r13
            c0.e r3 = (c0.e) r3
            j1.b0 r13 = r10.f72064e
            boolean r0 = r13 instanceof j1.j2
            if (r0 == 0) goto L47
            j1.j2 r13 = (j1.j2) r13
            long r4 = r13.m4781getValue0d7_KjU()
            j1.l0 r13 = j1.m0.f68918b
            long r6 = r13.m4835getUnspecified0d7_KjU()
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 != 0) goto L47
            r13 = 0
            goto L48
        L47:
            r13 = 1
        L48:
            l0.i1 r0 = r10.f72065f
            boolean r0 = r0.getHasFocus()
            if (r0 == 0) goto L88
            m2.j0 r0 = r10.f72066g
            long r4 = r0.m5591getSelectiond9O1mEE()
            boolean r2 = g2.a2.m3954getCollapsedimpl(r4)
            if (r2 == 0) goto L88
            if (r13 == 0) goto L88
            g2.b r5 = r0.getAnnotatedString()
            long r6 = r0.m5591getSelectiond9O1mEE()
            g2.a2 r6 = g2.a2.m3948boximpl(r6)
            l0.a1 r7 = new l0.a1
            r7.<init>(r3, r1)
            r9 = 0
            j1.b0 r4 = r10.f72064e
            r8 = r12
            p0.k1.LaunchedEffect(r4, r5, r6, r7, r8, r9)
            l0.b1 r2 = new l0.b1
            l0.i1 r6 = r10.f72065f
            j1.b0 r7 = r10.f72064e
            m2.z r4 = r10.f72067h
            m2.j0 r5 = r10.f72066g
            r2.<init>(r3, r4, r5, r6, r7)
            e1.v r11 = g1.j.drawWithContent(r11, r2)
            goto L8b
        L88:
            r8 = r12
            e1.t r11 = e1.t.f53496b
        L8b:
            r8.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c1.invoke(e1.v, p0.w, int):e1.v");
    }
}
