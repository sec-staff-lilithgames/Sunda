package o9;

import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(SoundlikeActivity soundlikeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78488j = soundlikeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r7(this.f78488j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r5, r6) == r0) goto L15;
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
            int r1 = r6.f78487i
            r2 = 0
            com.digidust.elokence.akinator.activities.SoundlikeActivity r3 = r6.f78488j
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            tu.a0.throwOnFailure(r7)
            goto L4e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            tu.a0.throwOnFailure(r7)
            goto L36
        L21:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            o9.q7 r1 = new o9.q7
            r1.<init>(r3, r2)
            r6.f78487i = r5
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
            if (r7 != r0) goto L36
            goto L4d
        L36:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            o9.p7 r5 = new o9.p7
            r5.<init>(r3, r7, r2)
            r6.f78487i = r4
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r5, r6)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.r7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
