package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u8 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78604i;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u8(2, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r9 = av.e.getCOROUTINE_SUSPENDED()
            int r0 = r10.f78604i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            tu.a0.throwOnFailure(r11)
            r0 = r11
            goto Lef
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L19:
            tu.a0.throwOnFailure(r11)
            timber.log.Timber$Forest r0 = timber.log.Timber.Forest
            java.lang.String r2 = "SplashscreenActivity"
            timber.log.Timber$Tree r0 = r0.tag(r2)
            java.lang.String r2 = "boot calling..."
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r0.d(r2, r4)
            jb.c$a r0 = jb.c.f69226m
            jb.c r2 = r0.sharedInstance()
            java.lang.String r4 = "MWtry"
            java.lang.String r5 = "10"
            r2.addCampaign(r4, r5)
            jb.c r2 = r0.sharedInstance()
            java.lang.String r4 = "PopularityTresholdActivated"
            java.lang.String r5 = "1"
            r2.addCampaign(r4, r5)
            jb.c r2 = r0.sharedInstance()
            java.lang.String r4 = "SlidePrimary"
            java.lang.String r6 = "lsa"
            r2.addCampaign(r4, r6)
            jb.c r2 = r0.sharedInstance()
            java.lang.String r4 = "AdsStatus"
            java.lang.String r6 = "full ads"
            r2.addCampaign(r4, r6)
            jb.c r2 = r0.sharedInstance()
            java.lang.String r4 = "PopularityTresholdRule"
            java.lang.String r6 = "NOR"
            r2.addCampaign(r4, r6)
            jb.c r2 = r0.sharedInstance()
            java.lang.String r4 = "QuestionLearningStatus"
            r2.addCampaign(r4, r5)
            ca.m r2 = ca.m.sharedInstance()
            boolean r2 = r2.isPaid()
            if (r2 == 0) goto L7b
            r3 = 2
        L79:
            r6 = r3
            goto L86
        L7b:
            ca.o r2 = ca.o.sharedInstance()
            boolean r2 = r2.isUnlocked()
            if (r2 == 0) goto L79
            r6 = r1
        L86:
            java.lang.String r2 = ca.a.getAbtestUrlSondageKey()
            jb.c r3 = r0.sharedInstance()
            kotlin.jvm.internal.e0.checkNotNull(r2)
            java.lang.String r4 = ""
            r3.addCampaign(r2, r4)
            java.lang.String r2 = ca.a.getAbtestIdSondageKey()
            jb.c r3 = r0.sharedInstance()
            kotlin.jvm.internal.e0.checkNotNull(r2)
            r3.addCampaign(r2, r4)
            jb.c r2 = r0.sharedInstance()
            java.lang.String r3 = "id_media_pub"
            r2.addCampaign(r3, r5)
            jb.c r0 = r0.sharedInstance()
            com.digidust.elokence.akinator.factories.AkApplication$a r2 = com.digidust.elokence.akinator.factories.AkApplication.f21719f
            android.content.Context r2 = r2.getAppContext()
            ca.m r3 = ca.m.sharedInstance()
            java.lang.String r3 = r3.getDeviceId()
            java.lang.String r4 = "getDeviceId(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r4)
            ca.m r4 = ca.m.sharedInstance()
            java.lang.String r4 = r4.getApplicationIdForAnalytics()
            lb.b1$a r5 = lb.b1.f72741d
            lb.b1 r5 = r5.sharedInstance()
            java.lang.String r5 = r5.getApplicationLanguage()
            ca.m r7 = ca.m.sharedInstance()
            java.lang.String r7 = r7.getFcmToken()
            r10.f78604i = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            java.lang.String r7 = "akinator"
            r8 = r10
            java.lang.Object r0 = r0.bootSuspend(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto Lef
            return r9
        Lef:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            ca.m r0 = ca.m.sharedInstance()
            jb.c$a r1 = jb.c.f69226m
            jb.c r1 = r1.sharedInstance()
            java.lang.String r1 = r1.getCreatedDeviceRecord()
            r0.setCreatedDeviceRecord(r1)
            tu.x0 r0 = tu.x0.f87415a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.u8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((u8) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
