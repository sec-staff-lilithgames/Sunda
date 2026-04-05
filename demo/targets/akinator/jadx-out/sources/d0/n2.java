package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51516i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f51517j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ zu.m f51518k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.q f51520m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51521n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(zu.m mVar, CoroutineScope coroutineScope, f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51518k = mVar;
        this.f51519l = coroutineScope;
        this.f51520m = qVar;
        this.f51521n = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        n2 n2Var = new n2(this.f51518k, this.f51519l, this.f51520m, this.f51521n, dVar);
        n2Var.f51517j = obj;
        return n2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:14:0x0037). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r14.f51516i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r14.f51517j
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r15)
            goto L37
        L14:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1c:
            tu.a0.throwOnFailure(r15)
            java.lang.Object r15 = r14.f51517j
            u1.c r15 = (u1.c) r15
            r1 = r15
        L24:
            zu.m r15 = r14.f51518k
            boolean r15 = kotlinx.coroutines.JobKt.isActive(r15)
            if (r15 == 0) goto L75
            r14.f51517j = r1
            r14.f51516i = r2
            java.lang.Object r15 = u1.c.awaitPointerEvent$default(r1, r3, r14, r2, r3)
            if (r15 != r0) goto L37
            return r0
        L37:
            u1.m r15 = (u1.m) r15
            int r15 = r15.m7345getType7fucELk()
            u1.q r4 = u1.r.f87659b
            int r5 = r4.m7349getEnter7fucELk()
            boolean r5 = u1.r.m7358equalsimpl0(r15, r5)
            p0.j2 r6 = r14.f51521n
            f0.q r7 = r14.f51520m
            if (r5 == 0) goto L5c
            d0.l2 r11 = new d0.l2
            r11.<init>(r7, r6, r3)
            r12 = 3
            r13 = 0
            kotlinx.coroutines.CoroutineScope r8 = r14.f51519l
            r9 = 0
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
            goto L24
        L5c:
            int r4 = r4.m7350getExit7fucELk()
            boolean r15 = u1.r.m7358equalsimpl0(r15, r4)
            if (r15 == 0) goto L24
            d0.m2 r11 = new d0.m2
            r11.<init>(r7, r6, r3)
            r12 = 3
            r13 = 0
            kotlinx.coroutines.CoroutineScope r8 = r14.f51519l
            r9 = 0
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
            goto L24
        L75:
            tu.x0 r15 = tu.x0.f87415a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((n2) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
