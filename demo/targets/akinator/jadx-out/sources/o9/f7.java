package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f78142i;

    /* renamed from: j, reason: collision with root package name */
    public int f78143j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78144k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f78145l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(SelectLanguageActivity selectLanguageActivity, int i10, zu.d dVar) {
        super(2, dVar);
        this.f78144k = selectLanguageActivity;
        this.f78145l = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f7(this.f78144k, this.f78145l, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$refreshUserInfos(r7, r9) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f78143j
            r2 = 0
            int r3 = r9.f78145l
            r4 = 3
            r5 = 2
            r6 = 1
            com.digidust.elokence.akinator.activities.SelectLanguageActivity r7 = r9.f78144k
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L26
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            tu.a0.throwOnFailure(r10)
            goto L6a
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            tu.a0.throwOnFailure(r10)
            goto L57
        L26:
            kotlin.jvm.internal.b1 r1 = r9.f78142i
            tu.a0.throwOnFailure(r10)
            goto L44
        L2c:
            kotlin.jvm.internal.b1 r1 = com.google.android.gms.internal.play_billing.a.m(r10)
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()
            o9.e7 r8 = new o9.e7
            r8.<init>(r1, r3, r7, r2)
            r9.f78142i = r1
            r9.f78143j = r6
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r8, r9)
            if (r10 != r0) goto L44
            goto L69
        L44:
            java.util.concurrent.atomic.AtomicReference r10 = com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$showLoadingDialog(r7)
            java.lang.Object r1 = r1.f71816b
            java.lang.String r1 = (java.lang.String) r1
            r9.f78142i = r2
            r9.f78143j = r5
            java.lang.Object r10 = com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$asyncCheckLanguage(r7, r1, r3, r10, r9)
            if (r10 != r0) goto L57
            goto L69
        L57:
            ca.m r10 = ca.m.sharedInstance()
            boolean r10 = r10.isUserConnected()
            if (r10 == 0) goto L6a
            r9.f78143j = r4
            java.lang.Object r10 = com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$refreshUserInfos(r7, r9)
            if (r10 != r0) goto L6a
        L69:
            return r0
        L6a:
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.f7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
