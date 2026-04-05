package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77524i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77525j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0 f77526k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f77527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String[] f77528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(y0 y0Var, boolean z10, String[] strArr, zu.d dVar) {
        super(2, dVar);
        this.f77526k = y0Var;
        this.f77527l = z10;
        this.f77528m = strArr;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        d1 d1Var = new d1(this.f77526k, this.f77527l, this.f77528m, dVar);
        d1Var.f77525j = obj;
        return d1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (o5.i2.execSQL(r1, "VACUUM", r8) != r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[PHI: r1
      0x0071: PHI (r1v7 o5.h2) = (r1v4 o5.h2), (r1v4 o5.h2), (r1v9 o5.h2) binds: [B:17:0x005f, B:19:0x006e, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[PHI: r1
      0x0088: PHI (r1v10 o5.h2) = (r1v7 o5.h2), (r1v12 o5.h2) binds: [B:22:0x0085, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r1 r9
      0x0094: PHI (r1v13 o5.h2) = (r1v10 o5.h2), (r1v15 o5.h2) binds: [B:25:0x0091, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:25:0x0091, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f77524i
            r2 = 0
            o5.y0 r3 = r8.f77526k
            switch(r1) {
                case 0: goto L43;
                case 1: goto L3b;
                case 2: goto L33;
                case 3: goto L2b;
                case 4: goto L22;
                case 5: goto L19;
                case 6: goto L14;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L14:
            tu.a0.throwOnFailure(r9)
            goto Lb8
        L19:
            java.lang.Object r1 = r8.f77525j
            o5.h2 r1 = (o5.h2) r1
            tu.a0.throwOnFailure(r9)
            goto Laa
        L22:
            java.lang.Object r1 = r8.f77525j
            o5.h2 r1 = (o5.h2) r1
            tu.a0.throwOnFailure(r9)
            goto L94
        L2b:
            java.lang.Object r1 = r8.f77525j
            o5.h2 r1 = (o5.h2) r1
            tu.a0.throwOnFailure(r9)
            goto L88
        L33:
            java.lang.Object r1 = r8.f77525j
            o5.h2 r1 = (o5.h2) r1
            tu.a0.throwOnFailure(r9)
            goto L71
        L3b:
            java.lang.Object r1 = r8.f77525j
            o5.h2 r1 = (o5.h2) r1
            tu.a0.throwOnFailure(r9)
            goto L59
        L43:
            tu.a0.throwOnFailure(r9)
            java.lang.Object r9 = r8.f77525j
            o5.h2 r9 = (o5.h2) r9
            r8.f77525j = r9
            r1 = 1
            r8.f77524i = r1
            java.lang.Object r1 = r9.inTransaction(r8)
            if (r1 != r0) goto L56
            goto Lb7
        L56:
            r7 = r1
            r1 = r9
            r9 = r7
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L71
            o5.y r9 = r3.getInvalidationTracker()
            r8.f77525j = r1
            r4 = 2
            r8.f77524i = r4
            java.lang.Object r9 = r9.sync$room_runtime_release(r8)
            if (r9 != r0) goto L71
            goto Lb7
        L71:
            o5.g2 r9 = o5.g2.f77580c
            o5.c1 r4 = new o5.c1
            boolean r5 = r8.f77527l
            java.lang.String[] r6 = r8.f77528m
            r4.<init>(r5, r6, r2)
            r8.f77525j = r1
            r5 = 3
            r8.f77524i = r5
            java.lang.Object r9 = r1.withTransaction(r9, r4, r8)
            if (r9 != r0) goto L88
            goto Lb7
        L88:
            r8.f77525j = r1
            r9 = 4
            r8.f77524i = r9
            java.lang.Object r9 = r1.inTransaction(r8)
            if (r9 != r0) goto L94
            goto Lb7
        L94:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lbf
            r8.f77525j = r1
            r9 = 5
            r8.f77524i = r9
            java.lang.String r9 = "PRAGMA wal_checkpoint(FULL)"
            java.lang.Object r9 = o5.i2.execSQL(r1, r9, r8)
            if (r9 != r0) goto Laa
            goto Lb7
        Laa:
            r8.f77525j = r2
            r9 = 6
            r8.f77524i = r9
            java.lang.String r9 = "VACUUM"
            java.lang.Object r9 = o5.i2.execSQL(r1, r9, r8)
            if (r9 != r0) goto Lb8
        Lb7:
            return r0
        Lb8:
            o5.y r9 = r3.getInvalidationTracker()
            r9.refreshAsync()
        Lbf:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(h2 h2Var, zu.d<? super tu.x0> dVar) {
        return ((d1) create(h2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
