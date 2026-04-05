package ek;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f54631i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f54632j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i1 f54633k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, i1 i1Var, zu.d dVar) {
        super(2, dVar);
        this.f54632j = uVar;
        this.f54633k = i1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t(this.f54632j, this.f54633k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r7.updateSettings(r6) == r0) goto L25;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f54631i
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            ek.u r5 = r6.f54632j
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            tu.a0.throwOnFailure(r7)
            goto L69
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            tu.a0.throwOnFailure(r7)
            goto L30
        L22:
            tu.a0.throwOnFailure(r7)
            fk.d r7 = fk.d.f55729a
            r6.f54631i = r4
            java.lang.Object r7 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r6)
            if (r7 != r0) goto L30
            goto L68
        L30:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L46
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L46
            goto L8c
        L46:
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r7.next()
            fk.g r1 = (fk.g) r1
            boolean r1 = r1.isDataCollectionEnabled()
            if (r1 == 0) goto L4a
            ik.o r7 = ek.u.access$getSettings$p(r5)
            r6.f54631i = r3
            java.lang.Object r7 = r7.updateSettings(r6)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            ik.o r7 = ek.u.access$getSettings$p(r5)
            boolean r7 = r7.getSessionsEnabled()
            if (r7 != 0) goto L7d
            java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r2, r7)
            bv.b.boxInt(r7)
            goto L95
        L7d:
            com.google.firebase.g r7 = ek.u.access$getFirebaseApp$p(r5)
            ek.s r0 = new ek.s
            ek.i1 r1 = r6.f54633k
            r0.<init>(r1)
            r7.addLifecycleEventListener(r0)
            goto L95
        L8c:
            java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r2, r7)
            bv.b.boxInt(r7)
        L95:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((t) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
