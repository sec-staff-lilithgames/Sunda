package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public m0[] f77783i;

    /* renamed from: j, reason: collision with root package name */
    public j2 f77784j;

    /* renamed from: k, reason: collision with root package name */
    public h2 f77785k;

    /* renamed from: l, reason: collision with root package name */
    public int f77786l;

    /* renamed from: m, reason: collision with root package name */
    public int f77787m;

    /* renamed from: n, reason: collision with root package name */
    public int f77788n;

    /* renamed from: o, reason: collision with root package name */
    public int f77789o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0[] f77790p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j2 f77791q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h2 f77792r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(m0[] m0VarArr, j2 j2Var, h2 h2Var, zu.d dVar) {
        super(2, dVar);
        this.f77790p = m0VarArr;
        this.f77791q = j2Var;
        this.f77792r = h2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x2(this.f77790p, this.f77791q, this.f77792r, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (o5.j2.access$startTrackingTable(r7, r6, r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:26:0x0078). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r10.f77789o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto Le
            if (r1 != r2) goto L1e
        Le:
            int r1 = r10.f77788n
            int r4 = r10.f77787m
            int r5 = r10.f77786l
            o5.h2 r6 = r10.f77785k
            o5.j2 r7 = r10.f77784j
            o5.m0[] r8 = r10.f77783i
            tu.a0.throwOnFailure(r11)
            goto L5a
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            tu.a0.throwOnFailure(r11)
            o5.m0[] r11 = r10.f77790p
            int r1 = r11.length
            r4 = 0
            o5.j2 r5 = r10.f77791q
            o5.h2 r6 = r10.f77792r
            r8 = r11
            r11 = r4
            r7 = r5
        L34:
            if (r4 >= r1) goto L7a
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L77
            if (r5 == r3) goto L62
            if (r5 != r2) goto L5c
            r10.f77783i = r8
            r10.f77784j = r7
            r10.f77785k = r6
            r10.f77786l = r9
            r10.f77787m = r4
            r10.f77788n = r1
            r10.f77789o = r2
            java.lang.Object r11 = o5.j2.access$stopTrackingTable(r7, r6, r11, r10)
            if (r11 != r0) goto L59
            goto L76
        L59:
            r5 = r9
        L5a:
            r11 = r5
            goto L78
        L5c:
            tu.t r11 = new tu.t
            r11.<init>()
            throw r11
        L62:
            r10.f77783i = r8
            r10.f77784j = r7
            r10.f77785k = r6
            r10.f77786l = r9
            r10.f77787m = r4
            r10.f77788n = r1
            r10.f77789o = r3
            java.lang.Object r11 = o5.j2.access$startTrackingTable(r7, r6, r11, r10)
            if (r11 != r0) goto L59
        L76:
            return r0
        L77:
            r11 = r9
        L78:
            int r4 = r4 + r3
            goto L34
        L7a:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.x2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(f2 f2Var, zu.d<? super tu.x0> dVar) {
        return ((x2) create(f2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
