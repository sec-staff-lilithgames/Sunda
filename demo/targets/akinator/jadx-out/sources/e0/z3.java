package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f53448a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53449b;

    /* renamed from: c, reason: collision with root package name */
    public final v5 f53450c;

    /* renamed from: d, reason: collision with root package name */
    public final d2 f53451d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.u3 f53452e;

    public z3(m2 orientation, boolean z10, v5 nestedScrollDispatcher, t3 scrollableState, d2 flingBehavior, d0.u3 u3Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(scrollableState, "scrollableState");
        kotlin.jvm.internal.e0.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.f53448a = orientation;
        this.f53449b = z10;
        this.f53450c = nestedScrollDispatcher;
        this.f53451d = flingBehavior;
        this.f53452e = u3Var;
    }

    /* renamed from: dispatchScroll-f0eR0lY, reason: not valid java name */
    public final long m3793dispatchScrollf0eR0lY(d3 dispatchScroll, long j10, i1.h hVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        d0.u3 u3Var = this.f53452e;
        long jM4189minusMKHz9U = i1.h.m4189minusMKHz9U(j10, (u3Var == null || !u3Var.isEnabled()) ? i1.h.f59344b.m4173getZeroF1C5BW0() : u3Var.mo3684consumePreScrollA0NYTsA(j10, hVar, i10));
        t1.e eVar = (t1.e) this.f53450c.getValue();
        long jM4189minusMKHz9U2 = i1.h.m4189minusMKHz9U(jM4189minusMKHz9U, eVar.m7018dispatchPreScrollOzD1aCk(jM4189minusMKHz9U, i10));
        long jM3796reverseIfNeededMKHz9U = m3796reverseIfNeededMKHz9U(m3799toOffsettuRUvjQ(dispatchScroll.scrollBy(m3798toFloatk4lQ0M(m3796reverseIfNeededMKHz9U(jM4189minusMKHz9U2)))));
        long jM4189minusMKHz9U3 = i1.h.m4189minusMKHz9U(jM4189minusMKHz9U2, jM3796reverseIfNeededMKHz9U);
        long jM7016dispatchPostScrollDzOQY0M = eVar.m7016dispatchPostScrollDzOQY0M(jM3796reverseIfNeededMKHz9U, jM4189minusMKHz9U3, i10);
        if (u3Var != null && u3Var.isEnabled()) {
            this.f53452e.mo3682consumePostScrolll7mfB5k(jM4189minusMKHz9U2, i1.h.m4189minusMKHz9U(jM4189minusMKHz9U3, jM7016dispatchPostScrollDzOQY0M), hVar, i10);
        }
        return jM4189minusMKHz9U3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3794doFlingAnimationQWom1Mo(long r12, zu.d<? super s2.e0> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof e0.u3
            if (r0 == 0) goto L14
            r0 = r14
            e0.u3 r0 = (e0.u3) r0
            int r1 = r0.f53334l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f53334l = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            e0.u3 r0 = new e0.u3
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.f53332j
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.f53334l
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.jvm.internal.a1 r12 = r4.f53331i
            tu.a0.throwOnFailure(r14)
            goto L58
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            tu.a0.throwOnFailure(r14)
            kotlin.jvm.internal.a1 r7 = new kotlin.jvm.internal.a1
            r7.<init>()
            r7.f71813b = r12
            e0.x3 r3 = new e0.x3
            r10 = 0
            r6 = r11
            r8 = r12
            r5 = r3
            r5.<init>(r6, r7, r8, r10)
            r4.f53331i = r7
            r4.f53334l = r2
            r1 = 0
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = e0.t3.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L57
            return r0
        L57:
            r12 = r7
        L58:
            long r12 = r12.f71813b
            s2.e0 r12 = s2.e0.m6790boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.z3.m3794doFlingAnimationQWom1Mo(long, zu.d):java.lang.Object");
    }

    public final d2 getFlingBehavior() {
        return this.f53451d;
    }

    public final v5 getNestedScrollDispatcher() {
        return this.f53450c;
    }

    public final m2 getOrientation() {
        return this.f53448a;
    }

    public final d0.u3 getOverscrollEffect() {
        return this.f53452e;
    }

    public final boolean getReverseDirection() {
        return this.f53449b;
    }

    public final t3 getScrollableState() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDragStopped(float r13, zu.d<? super tu.x0> r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.z3.onDragStopped(float, zu.d):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m3795performRawScrollMKHz9U(long j10) {
        throw null;
    }

    public final float reverseIfNeeded(float f10) {
        return this.f53449b ? f10 * (-1) : f10;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m3796reverseIfNeededMKHz9U(long j10) {
        return this.f53449b ? i1.h.m4192timestuRUvjQ(j10, -1.0f) : j10;
    }

    public final boolean shouldScrollImmediately() {
        throw null;
    }

    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m3797toFloatTH1AsA0(long j10) {
        return this.f53448a == m2.f53184c ? s2.e0.m6799getXimpl(j10) : s2.e0.m6800getYimpl(j10);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m3798toFloatk4lQ0M(long j10) {
        return this.f53448a == m2.f53184c ? i1.h.m4185getXimpl(j10) : i1.h.m4186getYimpl(j10);
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m3799toOffsettuRUvjQ(float f10) {
        return f10 == 0.0f ? i1.h.f59344b.m4173getZeroF1C5BW0() : this.f53448a == m2.f53184c ? i1.i.Offset(f10, 0.0f) : i1.i.Offset(0.0f, f10);
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m3800toVelocityadjELrA(float f10) {
        return this.f53448a == m2.f53184c ? s2.f0.Velocity(f10, 0.0f) : s2.f0.Velocity(0.0f, f10);
    }

    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m3801updateQWom1Mo(long j10, float f10) {
        return this.f53448a == m2.f53184c ? s2.e0.m6795copyOhffZ5M$default(j10, f10, 0.0f, 2, null) : s2.e0.m6795copyOhffZ5M$default(j10, 0.0f, f10, 1, null);
    }
}
