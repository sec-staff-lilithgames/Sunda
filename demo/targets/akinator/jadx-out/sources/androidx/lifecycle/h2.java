package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f6590i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f6591j;

    /* renamed from: k, reason: collision with root package name */
    public CoroutineScope f6592k;

    /* renamed from: l, reason: collision with root package name */
    public kv.p f6593l;

    /* renamed from: m, reason: collision with root package name */
    public int f6594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k0 f6595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j0 f6596o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f6597p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kv.p f6598q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(k0 k0Var, j0 j0Var, CoroutineScope coroutineScope, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f6595n = k0Var;
        this.f6596o = j0Var;
        this.f6597p = coroutineScope;
        this.f6598q = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h2(this.f6595n, this.f6596o, this.f6597p, this.f6598q, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r14.f6594m
            tu.x0 r2 = tu.x0.f87415a
            androidx.lifecycle.k0 r3 = r14.f6595n
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 != r5) goto L21
            kv.p r0 = r14.f6593l
            kv.p r0 = (kv.p) r0
            kotlin.jvm.internal.b1 r1 = r14.f6591j
            kotlin.jvm.internal.b1 r6 = r14.f6590i
            tu.a0.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L1d
            goto L93
        L1d:
            r0 = move-exception
            r15 = r0
            goto La6
        L21:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L29:
            tu.a0.throwOnFailure(r15)
            androidx.lifecycle.j0 r15 = r3.getCurrentState()
            androidx.lifecycle.j0 r1 = androidx.lifecycle.j0.f6614b
            if (r15 != r1) goto L36
            goto La5
        L36:
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            kotlin.jvm.internal.b1 r1 = new kotlin.jvm.internal.b1
            r1.<init>()
            androidx.lifecycle.j0 r15 = r14.f6596o     // Catch: java.lang.Throwable -> L8b
            kotlinx.coroutines.CoroutineScope r9 = r14.f6597p     // Catch: java.lang.Throwable -> L8b
            kv.p r13 = r14.f6598q     // Catch: java.lang.Throwable -> L8b
            r14.f6590i = r8     // Catch: java.lang.Throwable -> L8b
            r14.f6591j = r1     // Catch: java.lang.Throwable -> L8b
            r14.f6592k = r9     // Catch: java.lang.Throwable -> L8b
            r6 = r13
            kv.p r6 = (kv.p) r6     // Catch: java.lang.Throwable -> L8b
            r14.f6593l = r6     // Catch: java.lang.Throwable -> L8b
            r14.f6594m = r5     // Catch: java.lang.Throwable -> L8b
            kotlinx.coroutines.CancellableContinuationImpl r11 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L8b
            zu.d r6 = av.b.intercepted(r14)     // Catch: java.lang.Throwable -> L8b
            r11.<init>(r6, r5)     // Catch: java.lang.Throwable -> L8b
            r11.initCancellability()     // Catch: java.lang.Throwable -> L8b
            androidx.lifecycle.g0 r6 = androidx.lifecycle.i0.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.lifecycle.i0 r7 = r6.upTo(r15)     // Catch: java.lang.Throwable -> L8b
            androidx.lifecycle.i0 r10 = r6.downFrom(r15)     // Catch: java.lang.Throwable -> L8b
            r15 = 0
            kotlinx.coroutines.sync.Mutex r12 = kotlinx.coroutines.sync.MutexKt.Mutex$default(r15, r5, r4)     // Catch: java.lang.Throwable -> L8b
            androidx.lifecycle.g2 r6 = new androidx.lifecycle.g2     // Catch: java.lang.Throwable -> L8b
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8b
            r1.f71816b = r6     // Catch: java.lang.Throwable -> L8b
            java.lang.String r15 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
            kotlin.jvm.internal.e0.checkNotNull(r6, r15)     // Catch: java.lang.Throwable -> L8b
            r3.addObserver(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r15 = r11.getResult()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r6 = av.e.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L8b
            if (r15 != r6) goto L8f
            bv.h.probeCoroutineSuspended(r14)     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r0 = move-exception
            r15 = r0
            r6 = r8
            goto La6
        L8f:
            if (r15 != r0) goto L92
            return r0
        L92:
            r6 = r8
        L93:
            java.lang.Object r15 = r6.f71816b
            kotlinx.coroutines.Job r15 = (kotlinx.coroutines.Job) r15
            if (r15 == 0) goto L9c
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r15, r4, r5, r4)
        L9c:
            java.lang.Object r15 = r1.f71816b
            androidx.lifecycle.v0 r15 = (androidx.lifecycle.v0) r15
            if (r15 == 0) goto La5
            r3.removeObserver(r15)
        La5:
            return r2
        La6:
            java.lang.Object r0 = r6.f71816b
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto Laf
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r4, r5, r4)
        Laf:
            java.lang.Object r0 = r1.f71816b
            androidx.lifecycle.v0 r0 = (androidx.lifecycle.v0) r0
            if (r0 == 0) goto Lb8
            r3.removeObserver(r0)
        Lb8:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((h2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
