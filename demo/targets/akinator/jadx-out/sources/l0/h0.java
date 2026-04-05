package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public u1.c0 f72092i;

    /* renamed from: j, reason: collision with root package name */
    public int f72093j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72094k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z0 f72095l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f72095l = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        h0 h0Var = new h0(this.f72095l, dVar);
        h0Var.f72094k = obj;
        return h0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r8 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r9 != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:17:0x005d). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72093j
            l0.z0 r3 = r0.f72095l
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L32
            if (r2 == r7) goto L28
            if (r2 != r5) goto L20
            u1.c0 r2 = r0.f72092i
            java.lang.Object r8 = r0.f72094k
            u1.c r8 = (u1.c) r8
            tu.a0.throwOnFailure(r17)
            r9 = r17
            goto L5d
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L28:
            java.lang.Object r2 = r0.f72094k
            u1.c r2 = (u1.c) r2
            tu.a0.throwOnFailure(r17)
            r8 = r17
            goto L44
        L32:
            tu.a0.throwOnFailure(r17)
            java.lang.Object r2 = r0.f72094k
            u1.c r2 = (u1.c) r2
            r0.f72094k = r2
            r0.f72093j = r7
            java.lang.Object r8 = e0.q4.awaitFirstDown$default(r2, r4, r0, r7, r6)
            if (r8 != r1) goto L44
            goto L5c
        L44:
            u1.c0 r8 = (u1.c0) r8
            long r9 = r8.m7295getPositionF1C5BW0()
            r3.mo5281onDownk4lQ0M(r9)
            r15 = r8
            r8 = r2
            r2 = r15
        L50:
            r0.f72094k = r8
            r0.f72092i = r2
            r0.f72093j = r5
            java.lang.Object r9 = u1.c.awaitPointerEvent$default(r8, r6, r0, r7, r6)
            if (r9 != r1) goto L5d
        L5c:
            return r1
        L5d:
            u1.m r9 = (u1.m) r9
            java.util.List r9 = r9.getChanges()
            int r10 = r9.size()
            r11 = r4
        L68:
            if (r11 >= r10) goto L8c
            java.lang.Object r12 = r9.get(r11)
            u1.c0 r12 = (u1.c0) r12
            long r13 = r12.m7294getIdJ3iCeTQ()
            long r4 = r2.m7294getIdJ3iCeTQ()
            boolean r4 = u1.b0.m7258equalsimpl0(r13, r4)
            if (r4 == 0) goto L87
            boolean r4 = r12.getPressed()
            if (r4 == 0) goto L87
            r4 = 0
            r5 = 2
            goto L50
        L87:
            int r11 = r11 + 1
            r4 = 0
            r5 = 2
            goto L68
        L8c:
            r3.onUp()
            tu.x0 r1 = tu.x0.f87415a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((h0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
