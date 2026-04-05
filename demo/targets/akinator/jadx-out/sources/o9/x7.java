package o9;

import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78676i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78677j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.c f78678k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(SoundlikeActivity soundlikeActivity, e.c cVar, zu.d dVar) {
        super(2, dVar);
        this.f78677j = soundlikeActivity;
        this.f78678k = cVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x7(this.f78677j, this.f78678k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r6, r7) == r0) goto L15;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f78676i
            r2 = 0
            lb.e$c r3 = r7.f78678k
            com.digidust.elokence.akinator.activities.SoundlikeActivity r4 = r7.f78677j
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 != r5) goto L17
            tu.a0.throwOnFailure(r8)
            goto L50
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            tu.a0.throwOnFailure(r8)
            goto L38
        L23:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            o9.w7 r1 = new o9.w7
            r1.<init>(r4, r3, r2)
            r7.f78676i = r6
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
            if (r8 != r0) goto L38
            goto L4f
        L38:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            o9.v7 r6 = new o9.v7
            r6.<init>(r4, r8, r3, r2)
            r7.f78676i = r5
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r1, r6, r7)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.x7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((x7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
