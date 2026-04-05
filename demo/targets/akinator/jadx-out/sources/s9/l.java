package s9;

import kotlinx.coroutines.CoroutineScope;
import lb.e;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f85542i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f85543j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.b f85544k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, e.b bVar, zu.d dVar) {
        super(2, dVar);
        this.f85543j = gVar;
        this.f85544k = bVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new l(this.f85543j, this.f85544k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r8) != r0) goto L25;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f85542i
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            s9.g r6 = r8.f85543j
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            tu.a0.throwOnFailure(r9)
            goto L65
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L24
            goto L65
        L24:
            r9 = move-exception
            goto L53
        L26:
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L24
            goto L41
        L2a:
            tu.a0.throwOnFailure(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L24
            s9.h r1 = new s9.h     // Catch: java.lang.Throwable -> L24
            lb.e$b r7 = r8.f85544k     // Catch: java.lang.Throwable -> L24
            r1.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L24
            r8.f85542i = r4     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)     // Catch: java.lang.Throwable -> L24
            if (r9 != r0) goto L41
            goto L64
        L41:
            kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L24
            s9.i r1 = new s9.i     // Catch: java.lang.Throwable -> L24
            r1.<init>(r6, r5)     // Catch: java.lang.Throwable -> L24
            r8.f85542i = r3     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)     // Catch: java.lang.Throwable -> L24
            if (r9 != r0) goto L65
            goto L64
        L53:
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            s9.k r3 = new s9.k
            r3.<init>(r9, r6, r5)
            r8.f85542i = r2
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r8)
            if (r9 != r0) goto L65
        L64:
            return r0
        L65:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
