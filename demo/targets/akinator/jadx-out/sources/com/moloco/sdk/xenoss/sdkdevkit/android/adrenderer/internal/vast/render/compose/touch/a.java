package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import bv.d;
import e0.p2;
import i1.j;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import s2.e;
import s2.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements p2, e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f49746b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49747c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49748e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f49749f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a, reason: collision with other inner class name */
    public static final class C0475a extends d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49750i;

        /* renamed from: k, reason: collision with root package name */
        public int f49752k;

        public C0475a(zu.d<? super C0475a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49750i = obj;
            this.f49752k |= Integer.MIN_VALUE;
            return a.this.awaitRelease(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends d {

        /* renamed from: i, reason: collision with root package name */
        public a f49753i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49754j;

        /* renamed from: l, reason: collision with root package name */
        public int f49756l;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49754j = obj;
            this.f49756l |= Integer.MIN_VALUE;
            return a.this.tryAwaitRelease(this);
        }
    }

    public a(e density) {
        e0.checkNotNullParameter(density, "density");
        this.f49746b = density;
        this.f49749f = MutexKt.Mutex(false);
    }

    public final void a() {
        this.f49748e = true;
        Mutex.DefaultImpls.unlock$default(this.f49749f, null, 1, null);
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
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0475a
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0475a) r0
            int r1 = r0.f49752k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49752k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49750i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49752k
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
            r0.f49752k = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.awaitRelease(zu.d):java.lang.Object");
    }

    public final void b() {
        this.f49747c = true;
        Mutex.DefaultImpls.unlock$default(this.f49749f, null, 1, null);
    }

    public final void c() {
        Mutex.DefaultImpls.tryLock$default(this.f49749f, null, 1, null);
        this.f49747c = false;
        this.f49748e = false;
    }

    @Override // e0.p2, s2.e
    public float getDensity() {
        return this.f49746b.getDensity();
    }

    @Override // e0.p2, s2.e
    public float getFontScale() {
        return this.f49746b.getFontScale();
    }

    @Override // e0.p2, s2.e
    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
    public int mo3418roundToPxR2X_6o(long j10) {
        return this.f49746b.mo3418roundToPxR2X_6o(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
    public int mo3419roundToPx0680j_4(float f10) {
        return this.f49746b.mo3419roundToPx0680j_4(f10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    public float mo3420toDpGaN1DYA(long j10) {
        return this.f49746b.mo3420toDpGaN1DYA(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo3421toDpu2uoSUM(float f10) {
        return this.f49746b.mo3421toDpu2uoSUM(f10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
    public long mo3423toDpSizekrfVVM(long j10) {
        return this.f49746b.mo3423toDpSizekrfVVM(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toPx--R2X_6o, reason: not valid java name */
    public float mo3424toPxR2X_6o(long j10) {
        return this.f49746b.mo3424toPxR2X_6o(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toPx-0680j_4, reason: not valid java name */
    public float mo3425toPx0680j_4(float f10) {
        return this.f49746b.mo3425toPx0680j_4(f10);
    }

    @Override // e0.p2, s2.e
    public j toRect(m mVar) {
        e0.checkNotNullParameter(mVar, "<this>");
        return this.f49746b.toRect(mVar);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
    public long mo3426toSizeXkaWNTQ(long j10) {
        return this.f49746b.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    public long mo3427toSp0xMU5do(float f10) {
        return this.f49746b.mo3427toSp0xMU5do(f10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo3428toSpkPz2Gy4(float f10) {
        return this.f49746b.mo3428toSpkPz2Gy4(f10);
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
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$b r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b) r0
            int r1 = r0.f49756l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49756l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$b r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49754j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49756l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r0 = r0.f49753i
            tu.a0.throwOnFailure(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            tu.a0.throwOnFailure(r5)
            boolean r5 = r4.f49747c
            if (r5 != 0) goto L4c
            boolean r5 = r4.f49748e
            if (r5 != 0) goto L4c
            r0.f49753i = r4
            r0.f49756l = r3
            kotlinx.coroutines.sync.Mutex r5 = r4.f49749f
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            boolean r5 = r0.f49747c
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.tryAwaitRelease(zu.d):java.lang.Object");
    }

    @Override // e0.p2, s2.e
    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo3422toDpu2uoSUM(int i10) {
        return this.f49746b.mo3422toDpu2uoSUM(i10);
    }

    @Override // e0.p2, s2.e
    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo3429toSpkPz2Gy4(int i10) {
        return this.f49746b.mo3429toSpkPz2Gy4(i10);
    }
}
