package com.inmobi.compliance;

import com.amazon.device.ads.DtbConstants;
import com.inmobi.media.H2;
import com.ironsource.mediationsdk.metadata.a;
import java.util.HashMap;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiPrivacyCompliance {
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean z10) {
        H2.f31833a.put(a.f37595a, z10 ? "1" : "0");
    }

    public static final void setUSPrivacyString(String privacyString) {
        e0.checkNotNullParameter(privacyString, "privacyString");
        HashMap map = H2.f31833a;
        e0.checkNotNullParameter(privacyString, "privacyString");
        H2.f31833a.put(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, privacyString);
    }
}
