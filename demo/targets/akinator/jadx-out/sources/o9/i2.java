package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78214i;

    /* renamed from: j, reason: collision with root package name */
    public int f78215j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78216k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f78217l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(HomeActivity homeActivity, zu.d dVar, boolean z10) {
        super(2, dVar);
        this.f78216k = homeActivity;
        this.f78217l = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i2(this.f78216k, dVar, this.f78217l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10.await(r7, 1, r9) != r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:16:0x0045, B:17:0x0047], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r10
      0x003d: PHI (r10v1 java.lang.Object) = (r10v6 java.lang.Object), (r10v0 java.lang.Object) binds: [B:12:0x003a, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:22:0x0058, B:24:0x005e, B:26:0x006b), top: B:40:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:20:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:20:0x0054). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f78215j
            r2 = 600(0x258, float:8.41E-43)
            r3 = -1
            r4 = 0
            r5 = 2
            r6 = 1
            com.digidust.elokence.akinator.activities.HomeActivity r7 = r9.f78216k
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            int r1 = r9.f78214i
            tu.a0.throwOnFailure(r10)
            goto L54
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            tu.a0.throwOnFailure(r10)
            goto L3d
        L26:
            tu.a0.throwOnFailure(r10)
        L29:
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()
            o9.h2 r1 = new o9.h2
            boolean r8 = r9.f78217l
            r1.<init>(r7, r4, r8)
            r9.f78215j = r6
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r1, r9)
            if (r10 != r0) goto L3d
            goto L53
        L3d:
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            if (r1 == r3) goto L47
            if (r1 != r2) goto L54
        L47:
            da.o r10 = da.q.f51970b
            r9.f78214i = r1
            r9.f78215j = r5
            java.lang.Object r10 = r10.await(r7, r6, r9)
            if (r10 != r0) goto L54
        L53:
            return r0
        L54:
            if (r1 == r3) goto L29
            if (r1 == r2) goto L29
            android.app.Dialog r10 = com.digidust.elokence.akinator.activities.HomeActivity.access$getMProgressDialogGotoHome$p(r7)     // Catch: java.lang.Exception -> L76
            if (r10 == 0) goto L79
            android.app.Dialog r10 = com.digidust.elokence.akinator.activities.HomeActivity.access$getMProgressDialogGotoHome$p(r7)     // Catch: java.lang.Exception -> L76
            kotlin.jvm.internal.e0.checkNotNull(r10)     // Catch: java.lang.Exception -> L76
            boolean r10 = r10.isShowing()     // Catch: java.lang.Exception -> L76
            if (r10 == 0) goto L79
            android.app.Dialog r10 = com.digidust.elokence.akinator.activities.HomeActivity.access$getMProgressDialogGotoHome$p(r7)     // Catch: java.lang.Exception -> L76
            kotlin.jvm.internal.e0.checkNotNull(r10)     // Catch: java.lang.Exception -> L76
            r10.dismiss()     // Catch: java.lang.Exception -> L76
            goto L79
        L76:
            com.digidust.elokence.akinator.activities.HomeActivity.access$setMProgressDialogGotoHome$p(r7, r4)
        L79:
            r10 = 0
            if (r1 == 0) goto Lac
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L98
            r0 = 800(0x320, float:1.121E-42)
            if (r1 == r0) goto Lac
            lb.b1$a r0 = lb.b1.f72741d
            lb.b1 r0 = r0.sharedInstance()
            java.lang.String r1 = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"
            java.lang.String r0 = r0.getTraductionFromToken(r1)
            android.widget.Toast r10 = android.widget.Toast.makeText(r7, r0, r10)
            r10.show()
            goto Lbd
        L98:
            lb.b1$a r10 = lb.b1.f72741d
            lb.b1 r10 = r10.sharedInstance()
            java.lang.String r0 = "TROP_NOMBREUX_A_JOUER_RELANCE"
            java.lang.String r10 = r10.getTraductionFromToken(r0)
            android.widget.Toast r10 = android.widget.Toast.makeText(r7, r10, r6)
            r10.show()
            goto Lbd
        Lac:
            ca.o r0 = ca.o.sharedInstance()
            r0.setAkinatorStatus(r10)
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.digidust.elokence.akinator.activities.QuestionActivity> r0 = com.digidust.elokence.akinator.activities.QuestionActivity.class
            r10.<init>(r7, r0)
            r7.startActivity(r10)
        Lbd:
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((i2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
