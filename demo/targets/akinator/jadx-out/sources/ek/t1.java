package ek;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f54638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f54639j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t0 f54640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, t0 t0Var, zu.d dVar) {
        super(2, dVar);
        this.f54639j = v1Var;
        this.f54640k = t0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t1(this.f54639j, this.f54640k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r12.updateData(r0, r11) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (ek.v1.access$notifySubscribers(r4, r12, r0, r11) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        return r1;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r0 = r11.f54638i
            r2 = 2
            r3 = 1
            ek.v1 r4 = r11.f54639j
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            tu.a0.throwOnFailure(r12)
            goto L85
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Exception -> L20
            goto L85
        L20:
            r0 = move-exception
            r12 = r0
            goto L39
        L23:
            tu.a0.throwOnFailure(r12)
            k4.n r12 = ek.v1.access$getSessionDataStore$p(r4)     // Catch: java.lang.Exception -> L20
            ek.s1 r0 = new ek.s1     // Catch: java.lang.Exception -> L20
            r5 = 0
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
            r11.f54638i = r3     // Catch: java.lang.Exception -> L20
            java.lang.Object r12 = r12.updateData(r0, r11)     // Catch: java.lang.Exception -> L20
            if (r12 != r1) goto L85
            goto L84
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "App foregrounded, failed to update data. Message: "
            r0.<init>(r3)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "FirebaseSessions"
            android.util.Log.d(r0, r12)
            ek.t0 r5 = r11.f54640k
            boolean r12 = ek.v1.access$isSessionExpired(r4, r5)
            if (r12 == 0) goto L85
            ek.f1 r12 = ek.v1.access$getSessionGenerator$p(r4)
            ek.x0 r0 = r5.getSessionDetails()
            ek.x0 r6 = r12.generateNewSession(r0)
            r9 = 4
            r10 = 0
            r7 = 0
            r8 = 0
            ek.t0 r12 = ek.t0.copy$default(r5, r6, r7, r8, r9, r10)
            r4.setLocalSessionData$com_google_firebase_firebase_sessions(r12)
            ek.a1 r12 = ek.v1.access$getSessionFirelogPublisher$p(r4)
            r12.mayLogSession(r6)
            java.lang.String r12 = r6.getSessionId()
            ek.p1 r0 = ek.p1.f54610c
            r11.f54638i = r2
            java.lang.Object r12 = ek.v1.access$notifySubscribers(r4, r12, r0, r11)
            if (r12 != r1) goto L85
        L84:
            return r1
        L85:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.t1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((t1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
