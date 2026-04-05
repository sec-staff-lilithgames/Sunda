package l2;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f72288a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f72289b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f72290c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f72291d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f72292e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f72293f;

    public g0(h1 platformFontLoader, k1 platformResolveInterceptor, w1 typefaceRequestCache, m0 fontListFontFamilyTypefaceAdapter, g1 platformFamilyTypefaceAdapter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.f72288a = platformFontLoader;
        this.f72289b = platformResolveInterceptor;
        this.f72290c = typefaceRequestCache;
        this.f72291d = fontListFontFamilyTypefaceAdapter;
        this.f72292e = platformFamilyTypefaceAdapter;
        this.f72293f = new a0(this);
    }

    public final h1 getPlatformFontLoader$ui_text_release() {
        return this.f72288a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // l2.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preload(l2.x r14, zu.d<? super tu.x0> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof l2.b0
            if (r0 == 0) goto L13
            r0 = r15
            l2.b0 r0 = (l2.b0) r0
            int r1 = r0.f72255m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72255m = r1
            goto L18
        L13:
            l2.b0 r0 = new l2.b0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f72253k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72255m
            tu.x0 r3 = tu.x0.f87415a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            l2.l0 r14 = r0.f72252j
            l2.g0 r0 = r0.f72251i
            tu.a0.throwOnFailure(r15)
            goto L54
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            tu.a0.throwOnFailure(r15)
            boolean r15 = r14 instanceof l2.l0
            if (r15 != 0) goto L3f
            return r3
        L3f:
            r0.f72251i = r13
            r15 = r14
            l2.l0 r15 = (l2.l0) r15
            r0.f72252j = r15
            r0.f72255m = r4
            l2.m0 r15 = r13.f72291d
            l2.h1 r2 = r13.f72288a
            java.lang.Object r15 = r15.preload(r14, r2, r0)
            if (r15 != r1) goto L53
            return r1
        L53:
            r0 = r13
        L54:
            r15 = r14
            l2.l0 r15 = (l2.l0) r15
            java.util.List r15 = r15.getFonts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            int r2 = r15.size()
            r4 = 0
        L69:
            if (r4 >= r2) goto La2
            java.lang.Object r5 = r15.get(r4)
            l2.w r5 = (l2.w) r5
            l2.u1 r6 = new l2.u1
            l2.k1 r7 = r0.f72289b
            r8 = r7
            l2.x r7 = r8.interceptFontFamily(r14)
            l2.c1 r9 = r5.getWeight()
            l2.c1 r9 = r8.interceptFontWeight(r9)
            int r5 = r5.mo5433getStyle_LCdwA()
            int r5 = r8.mo5435interceptFontStyleT2F_aPo(r5)
            l2.z0 r8 = l2.a1.f72244b
            int r10 = r8.m5489getAllGVVA2EU()
            l2.h1 r8 = r0.f72288a
            java.lang.Object r11 = r8.getCacheKey()
            r12 = 0
            r8 = r9
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.add(r6)
            int r4 = r4 + 1
            goto L69
        La2:
            l2.w1 r14 = r0.f72290c
            l2.e0 r15 = new l2.e0
            r15.<init>(r0)
            r14.preWarmCache(r1, r15)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.g0.preload(l2.x, zu.d):java.lang.Object");
    }

    @Override // l2.y
    /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
    public v5 mo5437resolveDPcqOEQ(x xVar, c1 fontWeight, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        k1 k1Var = this.f72289b;
        u1 u1Var = new u1(k1Var.interceptFontFamily(xVar), k1Var.interceptFontWeight(fontWeight), k1Var.mo5435interceptFontStyleT2F_aPo(i10), k1Var.mo5436interceptFontSynthesisMscr08Y(i11), this.f72288a.getCacheKey(), null);
        return this.f72290c.runCached(u1Var, new f0(this, u1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g0(h1 h1Var, k1 k1Var, w1 w1Var, m0 m0Var, g1 g1Var, int i10, kotlin.jvm.internal.u uVar) {
        this(h1Var, (i10 & 2) != 0 ? k1.f72314a.getDefault$ui_text_release() : k1Var, (i10 & 4) != 0 ? h0.getGlobalTypefaceRequestCache() : w1Var, (i10 & 8) != 0 ? new m0(h0.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : m0Var, (i10 & 16) != 0 ? new g1() : g1Var);
    }
}
