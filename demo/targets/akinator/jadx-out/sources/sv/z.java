package sv;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f86210i;

    /* renamed from: j, reason: collision with root package name */
    public int f86211j;

    /* renamed from: k, reason: collision with root package name */
    public int f86212k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f86213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f86214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CharSequence f86215n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f86216o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, CharSequence charSequence, int i10, zu.d dVar) {
        super(2, dVar);
        this.f86214m = xVar;
        this.f86215n = charSequence;
        this.f86216o = i10;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        z zVar = new z(this.f86214m, this.f86215n, this.f86216o, dVar);
        zVar.f86213l = obj;
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0069 -> B:22:0x006a). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f86213l
            rv.v r0 = (rv.v) r0
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r12.f86212k
            tu.x0 r3 = tu.x0.f87415a
            int r4 = r12.f86216o
            r5 = 3
            r6 = 2
            java.lang.CharSequence r7 = r12.f86215n
            r8 = 1
            if (r2 == 0) goto L35
            if (r2 == r8) goto L1b
            if (r2 == r6) goto L2b
            if (r2 != r5) goto L23
        L1b:
            java.lang.Object r0 = r12.f86210i
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            tu.a0.throwOnFailure(r13)
            return r3
        L23:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2b:
            int r2 = r12.f86211j
            java.lang.Object r9 = r12.f86210i
            java.util.regex.Matcher r9 = (java.util.regex.Matcher) r9
            tu.a0.throwOnFailure(r13)
            goto L6a
        L35:
            tu.a0.throwOnFailure(r13)
            sv.x r13 = r12.f86214m
            java.util.regex.Pattern r13 = sv.x.access$getNativePattern$p(r13)
            java.util.regex.Matcher r13 = r13.matcher(r7)
            if (r4 == r8) goto La1
            boolean r2 = r13.find()
            if (r2 != 0) goto L4b
            goto La1
        L4b:
            r2 = 0
            r9 = r13
            r13 = r2
        L4e:
            int r10 = r9.start()
            java.lang.CharSequence r2 = r7.subSequence(r2, r10)
            java.lang.String r2 = r2.toString()
            r12.f86213l = r0
            r12.f86210i = r9
            r12.f86211j = r13
            r12.f86212k = r6
            java.lang.Object r2 = r0.yield(r2, r12)
            if (r2 != r1) goto L69
            goto Lb9
        L69:
            r2 = r13
        L6a:
            int r13 = r9.end()
            int r2 = r2 + r8
            int r10 = r4 + (-1)
            if (r2 == r10) goto L7e
            boolean r10 = r9.find()
            if (r10 != 0) goto L7a
            goto L7e
        L7a:
            r11 = r2
            r2 = r13
            r13 = r11
            goto L4e
        L7e:
            int r4 = r7.length()
            java.lang.CharSequence r13 = r7.subSequence(r13, r4)
            java.lang.String r13 = r13.toString()
            java.lang.Object r4 = bv.m.nullOutSpilledVariable(r0)
            r12.f86213l = r4
            java.lang.Object r4 = bv.m.nullOutSpilledVariable(r9)
            r12.f86210i = r4
            r12.f86211j = r2
            r12.f86212k = r5
            java.lang.Object r13 = r0.yield(r13, r12)
            if (r13 != r1) goto Lba
            goto Lb9
        La1:
            java.lang.String r2 = r7.toString()
            java.lang.Object r4 = bv.m.nullOutSpilledVariable(r0)
            r12.f86213l = r4
            java.lang.Object r13 = bv.m.nullOutSpilledVariable(r13)
            r12.f86210i = r13
            r12.f86212k = r8
            java.lang.Object r13 = r0.yield(r2, r12)
            if (r13 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super x0> dVar) {
        return ((z) create(vVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
