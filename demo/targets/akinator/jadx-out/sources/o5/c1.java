package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public String[] f77513i;

    /* renamed from: j, reason: collision with root package name */
    public int f77514j;

    /* renamed from: k, reason: collision with root package name */
    public int f77515k;

    /* renamed from: l, reason: collision with root package name */
    public int f77516l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f77517m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f77518n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String[] f77519o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(boolean z10, String[] strArr, zu.d dVar) {
        super(2, dVar);
        this.f77518n = z10;
        this.f77519o = strArr;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        c1 c1Var = new c1(this.f77518n, this.f77519o, dVar);
        c1Var.f77517m = obj;
        return c1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (o5.i2.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (o5.i2.execSQL(r6, r10, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:20:0x006a). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f77516l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r9.f77515k
            int r4 = r9.f77514j
            java.lang.String[] r5 = r9.f77513i
            java.lang.Object r6 = r9.f77517m
            o5.f2 r6 = (o5.f2) r6
            tu.a0.throwOnFailure(r10)
            goto L6a
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            java.lang.Object r1 = r9.f77517m
            o5.f2 r1 = (o5.f2) r1
            tu.a0.throwOnFailure(r10)
            goto L45
        L2c:
            tu.a0.throwOnFailure(r10)
            java.lang.Object r10 = r9.f77517m
            r1 = r10
            o5.f2 r1 = (o5.f2) r1
            boolean r10 = r9.f77518n
            if (r10 == 0) goto L45
            r9.f77517m = r1
            r9.f77516l = r3
            java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
            java.lang.Object r10 = o5.i2.execSQL(r1, r10, r9)
            if (r10 != r0) goto L45
            goto L69
        L45:
            java.lang.String[] r10 = r9.f77519o
            int r4 = r10.length
            r5 = 0
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L4d:
            if (r4 >= r1) goto L6c
            r10 = r5[r4]
            java.lang.String r7 = "DELETE FROM `"
            r8 = 96
            java.lang.String r10 = j1.o2.f(r8, r7, r10)
            r9.f77517m = r6
            r9.f77513i = r5
            r9.f77514j = r4
            r9.f77515k = r1
            r9.f77516l = r2
            java.lang.Object r10 = o5.i2.execSQL(r6, r10, r9)
            if (r10 != r0) goto L6a
        L69:
            return r0
        L6a:
            int r4 = r4 + r3
            goto L4d
        L6c:
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(f2 f2Var, zu.d<? super tu.x0> dVar) {
        return ((c1) create(f2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
