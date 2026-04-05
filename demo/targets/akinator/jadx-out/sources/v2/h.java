package v2;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f88907i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f88908j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f88909k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a0 a0Var, zu.d dVar) {
        super(2, dVar);
        this.f88909k = a0Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        h hVar = new h(this.f88909k, dVar);
        hVar.f88908j = obj;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r3.f88907i
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r3.f88908j
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            tu.a0.throwOnFailure(r4)
            goto L36
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            tu.a0.throwOnFailure(r4)
            java.lang.Object r4 = r3.f88908j
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            r1 = r4
        L23:
            boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
            if (r4 == 0) goto L3c
            v2.g r4 = v2.g.f88904e
            r3.f88908j = r1
            r3.f88907i = r2
            java.lang.Object r4 = a2.p3.withInfiniteAnimationFrameNanos(r4, r3)
            if (r4 != r0) goto L36
            return r0
        L36:
            v2.a0 r4 = r3.f88909k
            r4.pollForLocationOnScreenChange()
            goto L23
        L3c:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
