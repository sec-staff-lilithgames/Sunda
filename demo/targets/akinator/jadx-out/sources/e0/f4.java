package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f4 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53056i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53057j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.q f53058k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s2 f53060m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.l f53061n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(kv.q qVar, CoroutineScope coroutineScope, s2 s2Var, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f53058k = qVar;
        this.f53059l = coroutineScope;
        this.f53060m = s2Var;
        this.f53061n = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        f4 f4Var = new f4(this.f53058k, this.f53059l, this.f53060m, this.f53061n, dVar);
        f4Var.f53057j = obj;
        return f4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r14 == r0) goto L18;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r13.f53056i
            r2 = 2
            e0.s2 r3 = r13.f53060m
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r2) goto L15
            tu.a0.throwOnFailure(r14)
            goto L5f
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            java.lang.Object r1 = r13.f53057j
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r14)
            goto L39
        L25:
            tu.a0.throwOnFailure(r14)
            java.lang.Object r14 = r13.f53057j
            r1 = r14
            u1.c r1 = (u1.c) r1
            r13.f53057j = r1
            r13.f53056i = r5
            r14 = 0
            java.lang.Object r14 = e0.q4.awaitFirstDown$default(r1, r14, r13, r5, r4)
            if (r14 != r0) goto L39
            goto L5e
        L39:
            u1.c0 r14 = (u1.c0) r14
            r14.consume()
            kv.q r5 = e0.q4.access$getNoPressGesture$p()
            kv.q r6 = r13.f53058k
            if (r6 == r5) goto L54
            e0.e4 r10 = new e0.e4
            r10.<init>(r6, r3, r14, r4)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.CoroutineScope r7 = r13.f53059l
            r8 = 0
            r9 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
        L54:
            r13.f53057j = r4
            r13.f53056i = r2
            java.lang.Object r14 = e0.q4.waitForUpOrCancellation(r1, r13)
            if (r14 != r0) goto L5f
        L5e:
            return r0
        L5f:
            u1.c0 r14 = (u1.c0) r14
            if (r14 != 0) goto L67
            r3.cancel()
            goto L7c
        L67:
            r14.consume()
            r3.release()
            kv.l r0 = r13.f53061n
            if (r0 == 0) goto L7c
            long r1 = r14.m7295getPositionF1C5BW0()
            i1.h r14 = i1.h.m4174boximpl(r1)
            r0.invoke(r14)
        L7c:
            tu.x0 r14 = tu.x0.f87415a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((f4) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
