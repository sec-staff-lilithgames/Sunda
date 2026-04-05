package ek;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public h0 f54477i;

    /* renamed from: j, reason: collision with root package name */
    public b1 f54478j;

    /* renamed from: k, reason: collision with root package name */
    public z0 f54479k;

    /* renamed from: l, reason: collision with root package name */
    public com.google.firebase.g f54480l;

    /* renamed from: m, reason: collision with root package name */
    public x0 f54481m;

    /* renamed from: n, reason: collision with root package name */
    public ik.o f54482n;

    /* renamed from: o, reason: collision with root package name */
    public int f54483o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b1 f54484p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0 f54485q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(b1 b1Var, x0 x0Var, zu.d dVar) {
        super(2, dVar);
        this.f54484p = b1Var;
        this.f54485q = x0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new c1(this.f54484p, this.f54485q, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f54483o
            r2 = 3
            r3 = 2
            r4 = 1
            ek.b1 r5 = r8.f54484p
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ik.o r0 = r8.f54482n
            ek.x0 r1 = r8.f54481m
            com.google.firebase.g r2 = r8.f54480l
            ek.z0 r3 = r8.f54479k
            ek.b1 r5 = r8.f54478j
            ek.h0 r4 = r8.f54477i
            tu.a0.throwOnFailure(r9)
            r7 = r3
            r3 = r0
            r0 = r7
            r7 = r2
            r2 = r1
            r1 = r7
        L28:
            r7 = r5
            goto L89
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            tu.a0.throwOnFailure(r9)
            goto L5d
        L36:
            tu.a0.throwOnFailure(r9)
            goto L46
        L3a:
            tu.a0.throwOnFailure(r9)
            r8.f54483o = r4
            java.lang.Object r9 = ek.b1.access$shouldLogSession(r5, r8)
            if (r9 != r0) goto L46
            goto L82
        L46:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9b
            ek.h0$a r9 = ek.h0.f54537c
            tj.f r1 = ek.b1.access$getFirebaseInstallations$p(r5)
            r8.f54483o = r3
            java.lang.Object r9 = r9.create(r1, r8)
            if (r9 != r0) goto L5d
            goto L82
        L5d:
            r4 = r9
            ek.h0 r4 = (ek.h0) r4
            ek.z0 r3 = ek.z0.f54684a
            com.google.firebase.g r9 = ek.b1.access$getFirebaseApp$p(r5)
            ik.o r1 = ek.b1.access$getSessionSettings$p(r5)
            fk.d r6 = fk.d.f55729a
            r8.f54477i = r4
            r8.f54478j = r5
            r8.f54479k = r3
            r8.f54480l = r9
            ek.x0 r7 = r8.f54485q
            r8.f54481m = r7
            r8.f54482n = r1
            r8.f54483o = r2
            java.lang.Object r2 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r8)
            if (r2 != r0) goto L83
        L82:
            return r0
        L83:
            r0 = r3
            r3 = r1
            r1 = r9
            r9 = r2
            r2 = r7
            goto L28
        L89:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r5 = r4.getFid()
            java.lang.String r6 = r4.getAuthToken()
            r4 = r9
            ek.y0 r9 = r0.buildSession(r1, r2, r3, r4, r5, r6)
            ek.b1.access$attemptLoggingSessionEvent(r7, r9)
        L9b:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((c1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
