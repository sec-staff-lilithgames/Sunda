package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s2 implements d2 {

    /* renamed from: b, reason: collision with root package name */
    public final d2 f80452b;

    /* renamed from: c, reason: collision with root package name */
    public final x1 f80453c = new x1();

    public s2(d2 d2Var) {
        this.f80452b = d2Var;
    }

    @Override // p0.d2, zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) b2.fold(this, r10, pVar);
    }

    @Override // p0.d2, zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) b2.get(this, lVar);
    }

    @Override // p0.d2, zu.k
    public /* bridge */ /* synthetic */ zu.l getKey() {
        return super.getKey();
    }

    public final boolean isPaused() {
        return !this.f80453c.isOpen();
    }

    @Override // p0.d2, zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return b2.minusKey(this, lVar);
    }

    public final void pause() {
        this.f80453c.closeLatch();
    }

    @Override // p0.d2, zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return b2.plus(this, mVar);
    }

    public final void resume() {
        this.f80453c.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p0.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object withFrameNanos(kv.l r6, zu.d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p0.r2
            if (r0 == 0) goto L13
            r0 = r7
            p0.r2 r0 = (p0.r2) r0
            int r1 = r0.f80428l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80428l = r1
            goto L18
        L13:
            p0.r2 r0 = new p0.r2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f80426j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80428l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kv.l r6 = r0.f80425i
            kv.l r6 = (kv.l) r6
            tu.a0.throwOnFailure(r7)
            goto L4f
        L3c:
            tu.a0.throwOnFailure(r7)
            r7 = r6
            kv.l r7 = (kv.l) r7
            r0.f80425i = r7
            r0.f80428l = r4
            p0.x1 r7 = r5.f80453c
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L4f
            goto L5c
        L4f:
            r7 = 0
            r0.f80425i = r7
            r0.f80428l = r3
            p0.d2 r7 = r5.f80452b
            java.lang.Object r6 = r7.withFrameNanos(r6, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.s2.withFrameNanos(kv.l, zu.d):java.lang.Object");
    }
}
