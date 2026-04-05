package s9;

import kotlinx.coroutines.CoroutineScope;
import lb.e;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f85551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f85552j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.g f85553k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g gVar, e.g gVar2, zu.d dVar) {
        super(2, dVar);
        this.f85552j = gVar;
        this.f85553k = gVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new p(this.f85552j, this.f85553k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r8) != r0) goto L37;
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
            int r1 = r8.f85551i
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            s9.g r6 = r8.f85552j
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            tu.a0.throwOnFailure(r9)
            goto Lae
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L26
            goto Lae
        L26:
            r9 = move-exception
            goto L9c
        L29:
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L26
            goto L44
        L2d:
            tu.a0.throwOnFailure(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L26
            s9.o r1 = new s9.o     // Catch: java.lang.Throwable -> L26
            lb.e$g r7 = r8.f85553k     // Catch: java.lang.Throwable -> L26
            r1.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L26
            r8.f85551i = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)     // Catch: java.lang.Throwable -> L26
            if (r9 != r0) goto L44
            goto Lad
        L44:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L26
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            if (r9 == 0) goto L8a
            r1 = 110(0x6e, float:1.54E-43)
            if (r9 == r1) goto L78
            r1 = 130(0x82, float:1.82E-43)
            if (r9 == r1) goto L66
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L26
            lb.b1$a r1 = lb.b1.f72741d     // Catch: java.lang.Throwable -> L26
            lb.b1 r1 = r1.sharedInstance()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"
            java.lang.String r1 = r1.getTraductionFromToken(r3)     // Catch: java.lang.Throwable -> L26
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L26
            throw r9     // Catch: java.lang.Throwable -> L26
        L66:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L26
            lb.b1$a r1 = lb.b1.f72741d     // Catch: java.lang.Throwable -> L26
            lb.b1 r1 = r1.sharedInstance()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "IMAGE_EN_COURS_DE_VALIDATION"
            java.lang.String r1 = r1.getTraductionFromToken(r3)     // Catch: java.lang.Throwable -> L26
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L26
            throw r9     // Catch: java.lang.Throwable -> L26
        L78:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L26
            lb.b1$a r1 = lb.b1.f72741d     // Catch: java.lang.Throwable -> L26
            lb.b1 r1 = r1.sharedInstance()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "L_EXTENSION_NE_SEMBLE_PAS_CORRESPONDRE_A_UNE_IMAGE_VALIDE"
            java.lang.String r1 = r1.getTraductionFromToken(r3)     // Catch: java.lang.Throwable -> L26
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L26
            throw r9     // Catch: java.lang.Throwable -> L26
        L8a:
            kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L26
            s9.m r1 = new s9.m     // Catch: java.lang.Throwable -> L26
            r1.<init>(r6, r5)     // Catch: java.lang.Throwable -> L26
            r8.f85551i = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)     // Catch: java.lang.Throwable -> L26
            if (r9 != r0) goto Lae
            goto Lad
        L9c:
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            s9.n r3 = new s9.n
            r3.<init>(r9, r6, r5)
            r8.f85551i = r2
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r8)
            if (r9 != r0) goto Lae
        Lad:
            return r0
        Lae:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
