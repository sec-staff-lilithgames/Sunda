package i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final r0.c f59309a = new r0.c(new l[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please report as a decompilation issue!!! */
    @Override // i0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bringIntoView(i1.j r8, zu.d<? super tu.x0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof i0.g
            if (r0 == 0) goto L13
            r0 = r9
            i0.g r0 = (i0.g) r0
            int r1 = r0.f59308o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59308o = r1
            goto L18
        L13:
            i0.g r0 = new i0.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f59306m
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59308o
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r8 = r0.f59305l
            int r2 = r0.f59304k
            java.lang.Object[] r4 = r0.f59303j
            i1.j r5 = r0.f59302i
            tu.a0.throwOnFailure(r9)
            r9 = r5
            goto L63
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            tu.a0.throwOnFailure(r9)
            r0.c r9 = r7.f59309a
            int r2 = r9.getSize()
            if (r2 <= 0) goto L66
            java.lang.Object[] r9 = r9.getContent()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L4e:
            r5 = r4[r8]
            i0.l r5 = (i0.l) r5
            r0.f59302i = r9
            r0.f59303j = r4
            r0.f59304k = r2
            r0.f59305l = r8
            r0.f59308o = r3
            java.lang.Object r5 = r5.bringIntoView(r9, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            int r8 = r8 + r3
            if (r8 < r2) goto L4e
        L66:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.bringIntoView(i1.j, zu.d):java.lang.Object");
    }

    public final r0.c getModifiers() {
        return this.f59309a;
    }
}
