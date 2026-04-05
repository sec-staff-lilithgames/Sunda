package e0;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s2 implements p2, s2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2.e f53303b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53304c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53305e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f53306f;

    public s2(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f53303b = density;
        this.f53306f = MutexKt.Mutex(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e0.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitRelease(zu.d<? super tu.x0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0.q2
            if (r0 == 0) goto L13
            r0 = r5
            e0.q2 r0 = (e0.q2) r0
            int r1 = r0.f53263k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53263k = r1
            goto L18
        L13:
            e0.q2 r0 = new e0.q2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f53261i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53263k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            r0.f53263k = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L48:
            e0.i2 r5 = new e0.i2
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.s2.awaitRelease(zu.d):java.lang.Object");
    }

    public final void cancel() {
        this.f53305e = true;
        Mutex.DefaultImpls.unlock$default(this.f53306f, null, 1, null);
    }

    @Override // e0.p2, s2.e
    public float getDensity() {
        return this.f53303b.getDensity();
    }

    @Override // e0.p2, s2.e
    public float getFontScale() {
        return this.f53303b.getFontScale();
    }

    public final void release() {
        this.f53304c = true;
        Mutex.DefaultImpls.unlock$default(this.f53306f, null, 1, null);
    }

    public final void reset() {
        Mutex.DefaultImpls.tryLock$default(this.f53306f, null, 1, null);
        this.f53304c = false;
        this.f53305e = false;
    }

    @Override // e0.p2, s2.e
    /* renamed from: roundToPx--R2X_6o */
    public int mo3418roundToPxR2X_6o(long j10) {
        return this.f53303b.mo3418roundToPxR2X_6o(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: roundToPx-0680j_4 */
    public int mo3419roundToPx0680j_4(float f10) {
        return this.f53303b.mo3419roundToPx0680j_4(f10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDp-GaN1DYA */
    public float mo3420toDpGaN1DYA(long j10) {
        return this.f53303b.mo3420toDpGaN1DYA(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3421toDpu2uoSUM(float f10) {
        return this.f53303b.mo3421toDpu2uoSUM(f10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public long mo3423toDpSizekrfVVM(long j10) {
        return this.f53303b.mo3423toDpSizekrfVVM(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toPx--R2X_6o */
    public float mo3424toPxR2X_6o(long j10) {
        return this.f53303b.mo3424toPxR2X_6o(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toPx-0680j_4 */
    public float mo3425toPx0680j_4(float f10) {
        return this.f53303b.mo3425toPx0680j_4(f10);
    }

    @Override // e0.p2, s2.e
    public i1.j toRect(s2.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return this.f53303b.toRect(mVar);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSize-XkaWNTQ */
    public long mo3426toSizeXkaWNTQ(long j10) {
        return this.f53303b.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSp-0xMU5do */
    public long mo3427toSp0xMU5do(float f10) {
        return this.f53303b.mo3427toSp0xMU5do(f10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3428toSpkPz2Gy4(float f10) {
        return this.f53303b.mo3428toSpkPz2Gy4(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e0.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(zu.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0.r2
            if (r0 == 0) goto L13
            r0 = r5
            e0.r2 r0 = (e0.r2) r0
            int r1 = r0.f53286l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53286l = r1
            goto L18
        L13:
            e0.r2 r0 = new e0.r2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f53284j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53286l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e0.s2 r0 = r0.f53283i
            tu.a0.throwOnFailure(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            tu.a0.throwOnFailure(r5)
            boolean r5 = r4.f53304c
            if (r5 != 0) goto L4c
            boolean r5 = r4.f53305e
            if (r5 != 0) goto L4c
            r0.f53283i = r4
            r0.f53286l = r3
            kotlinx.coroutines.sync.Mutex r5 = r4.f53306f
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            boolean r5 = r0.f53304c
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.s2.tryAwaitRelease(zu.d):java.lang.Object");
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3422toDpu2uoSUM(int i10) {
        return this.f53303b.mo3422toDpu2uoSUM(i10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3429toSpkPz2Gy4(int i10) {
        return this.f53303b.mo3429toSpkPz2Gy4(i10);
    }
}
