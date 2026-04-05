package o5;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77706i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77707j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f77708k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f77708k = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r2 r2Var = new r2(this.f77708k, dVar);
        r2Var.f77707j = obj;
        return r2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f77706i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            tu.a0.throwOnFailure(r7)     // Catch: android.database.SQLException -> L5a
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f77707j
            o5.h2 r1 = (o5.h2) r1
            tu.a0.throwOnFailure(r7)
            goto L35
        L22:
            tu.a0.throwOnFailure(r7)
            java.lang.Object r7 = r6.f77707j
            r1 = r7
            o5.h2 r1 = (o5.h2) r1
            r6.f77707j = r1
            r6.f77706i = r3
            java.lang.Object r7 = r1.inTransaction(r6)
            if (r7 != r0) goto L35
            goto L56
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L42
            java.util.Set r7 = uu.c2.emptySet()
            return r7
        L42:
            o5.g2 r7 = o5.g2.f77580c     // Catch: android.database.SQLException -> L5a
            o5.q2 r3 = new o5.q2     // Catch: android.database.SQLException -> L5a
            o5.j2 r4 = r6.f77708k     // Catch: android.database.SQLException -> L5a
            r5 = 0
            r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
            r6.f77707j = r5     // Catch: android.database.SQLException -> L5a
            r6.f77706i = r2     // Catch: android.database.SQLException -> L5a
            java.lang.Object r7 = r1.withTransaction(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
            if (r7 != r0) goto L57
        L56:
            return r0
        L57:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
            return r7
        L5a:
            java.util.Set r7 = uu.c2.emptySet()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(h2 h2Var, zu.d<? super Set<Integer>> dVar) {
        return ((r2) create(h2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
