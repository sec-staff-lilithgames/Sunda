package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78104i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78105j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(SplashscreenActivity splashscreenActivity, int i10, zu.d dVar) {
        super(2, dVar);
        this.f78104i = i10;
        this.f78105j = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d9(this.f78105j, this.f78104i, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            av.e.getCOROUTINE_SUSPENDED()
            tu.a0.throwOnFailure(r6)
            r6 = 0
            com.digidust.elokence.akinator.activities.SplashscreenActivity r0 = r5.f78105j
            int r1 = r5.f78104i
            if (r1 == 0) goto L58
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 == r2) goto L43
            r2 = 800(0x320, float:1.121E-42)
            if (r1 == r2) goto L58
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.String r3 = "SplashscreenActivity"
            timber.log.Timber$Tree r2 = r2.tag(r3)
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "init2 error"
            r3.<init>(r4)
            java.lang.String r4 = "startSession error : "
            java.lang.String r1 = a.b.e(r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r2.e(r3, r1, r4)
            lb.b1$a r1 = lb.b1.f72741d
            lb.b1 r1 = r1.sharedInstance()
            java.lang.String r2 = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"
            java.lang.String r1 = r1.getTraductionFromToken(r2)
            android.widget.Toast r6 = android.widget.Toast.makeText(r0, r1, r6)
            r6.show()
            goto L69
        L43:
            lb.b1$a r6 = lb.b1.f72741d
            lb.b1 r6 = r6.sharedInstance()
            java.lang.String r1 = "TROP_NOMBREUX_A_JOUER_RELANCE"
            java.lang.String r6 = r6.getTraductionFromToken(r1)
            r1 = 1
            android.widget.Toast r6 = android.widget.Toast.makeText(r0, r6, r1)
            r6.show()
            goto L69
        L58:
            ca.o r1 = ca.o.sharedInstance()
            r1.setAkinatorStatus(r6)
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.digidust.elokence.akinator.activities.QuestionActivity> r1 = com.digidust.elokence.akinator.activities.QuestionActivity.class
            r6.<init>(r0, r1)
            r0.startActivity(r6)
        L69:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.d9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((d9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
