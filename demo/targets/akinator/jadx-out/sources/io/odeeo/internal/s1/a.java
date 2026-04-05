package io.odeeo.internal.s1;

import io.odeeo.internal.f1.f;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.consent.ConsentStringSource;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.p1.b<io.odeeo.internal.f1.c, Throwable> {
    public a() {
        super(Dispatchers.getIO());
    }

    @Override // io.odeeo.internal.p1.b
    public Object a(zu.d<? super io.odeeo.internal.a.c<io.odeeo.internal.f1.c, ? extends Throwable>> dVar) {
        String str;
        OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
        f iabTcfMetadata$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getConsentDataManager$odeeoSdk_release().getIabTcfMetadata$odeeoSdk_release();
        ConsentStringSource privacyStrSource$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getConsentDataManager$odeeoSdk_release().getPrivacyStrSource$odeeoSdk_release();
        Boolean boolBoxBoolean = null;
        if (privacyStrSource$odeeoSdk_release == ConsentStringSource.None) {
            str = null;
        } else {
            String lowerCase = privacyStrSource$odeeoSdk_release.getValue().toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            str = lowerCase;
        }
        String odeeoSDKIdentifier$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().getInfoManager$odeeoSdk_release().getOdeeoSDKIdentifier$odeeoSdk_release();
        String sessionID$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().getSessionID$odeeoSdk_release();
        String engineName = io.odeeo.internal.d1.f.f63660a.getEngineName();
        String lowerCase2 = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getForceRegulationType$odeeoSdk_release().getValue().toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean zIsLimitAdTrackingEnabled$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().isLimitAdTrackingEnabled$odeeoSdk_release();
        boolean zIsChildDirected$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().isChildDirected$odeeoSdk_release();
        Integer cmpSdkId = iabTcfMetadata$odeeoSdk_release.getCmpSdkId();
        String strValueOf = cmpSdkId == null ? null : String.valueOf(cmpSdkId.intValue());
        Integer cmpSdkVersion = iabTcfMetadata$odeeoSdk_release.getCmpSdkVersion();
        String strValueOf2 = cmpSdkVersion == null ? null : String.valueOf(cmpSdkVersion.intValue());
        Integer cmpGdprApplied = iabTcfMetadata$odeeoSdk_release.getCmpGdprApplied();
        if (cmpGdprApplied != null) {
            boolBoxBoolean = bv.b.boxBoolean(cmpGdprApplied.intValue() == 1);
        }
        return new io.odeeo.internal.a.b(new io.odeeo.internal.f1.c(odeeoSDKIdentifier$odeeoSdk_release, OdeeoSDK.SDK_VERSION, engineName, sessionID$odeeoSdk_release, lowerCase2, zIsLimitAdTrackingEnabled$odeeoSdk_release, zIsChildDirected$odeeoSdk_release, strValueOf, strValueOf2, boolBoxBoolean, odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getGdprConsentString$odeeoSdk_release(), odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getPrivacyStr$odeeoSdk_release(), str, bv.b.boxBoolean(!(odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getConsentDataManager$odeeoSdk_release().getCcpaConsent$odeeoSdk_release() != null ? r0.booleanValue() : false))));
    }
}
