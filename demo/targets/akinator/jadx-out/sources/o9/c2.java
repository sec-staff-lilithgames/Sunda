package o9;

import android.graphics.Bitmap;
import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78061i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78062j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bitmap f78064l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(int i10, Bitmap bitmap, HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78062j = i10;
        this.f78063k = homeActivity;
        this.f78064l = bitmap;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        HomeActivity homeActivity = this.f78063k;
        return new c2(this.f78062j, this.f78064l, homeActivity, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L15;
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
            int r1 = r7.f78061i
            r2 = 0
            int r3 = r7.f78062j
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            tu.a0.throwOnFailure(r8)
            goto L4c
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            tu.a0.throwOnFailure(r8)
            goto L36
        L21:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            o9.a2 r1 = new o9.a2
            r1.<init>(r3, r2)
            r7.f78061i = r5
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
            if (r8 != r0) goto L36
            goto L4b
        L36:
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
            o9.b2 r1 = new o9.b2
            com.digidust.elokence.akinator.activities.HomeActivity r5 = r7.f78063k
            android.graphics.Bitmap r6 = r7.f78064l
            r1.<init>(r3, r6, r5, r2)
            r7.f78061i = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
            if (r8 != r0) goto L4c
        L4b:
            return r0
        L4c:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((c2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
