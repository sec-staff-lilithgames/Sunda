package io.odeeo.internal.f1;

import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    @lk.c(com.ironsource.mediationsdk.metadata.a.f37595a)
    private final Boolean doNotSell;

    @lk.c("engine_name")
    private final String engineName;

    @lk.c("force_regulation")
    private final String forceRegulation;

    @lk.c(com.ironsource.mediationsdk.metadata.a.f37596b)
    private final boolean isChildDirected;

    @lk.c("limited_ad_tracking")
    private final boolean limitedAdTracking;

    @lk.c("odeeo_id")
    private final String odeeoId;

    @lk.c("sdk_version")
    private final String sdkVersion;

    @lk.c("session_id")
    private final String sessionId;

    @lk.c("tcf_cmp_sdk_id")
    private final String tcfCmpSdkId;

    @lk.c("tcf_cmp_sdk_version")
    private final String tcfCmpSdkVersion;

    @lk.c("tcf_gdpr_applies")
    private final Boolean tcfGdprApplies;

    @lk.c("tcf_tcstring")
    private final String tcfTcstring;

    @lk.c(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY)
    private final String usPrivacy;

    @lk.c("us_privacy_source")
    private final String usPrivacySource;

    public c(String odeeoId, String sdkVersion, String engineName, String sessionId, String forceRegulation, boolean z10, boolean z11, String str, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2) {
        e0.checkNotNullParameter(odeeoId, "odeeoId");
        e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        e0.checkNotNullParameter(engineName, "engineName");
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(forceRegulation, "forceRegulation");
        this.odeeoId = odeeoId;
        this.sdkVersion = sdkVersion;
        this.engineName = engineName;
        this.sessionId = sessionId;
        this.forceRegulation = forceRegulation;
        this.limitedAdTracking = z10;
        this.isChildDirected = z11;
        this.tcfCmpSdkId = str;
        this.tcfCmpSdkVersion = str2;
        this.tcfGdprApplies = bool;
        this.tcfTcstring = str3;
        this.usPrivacy = str4;
        this.usPrivacySource = str5;
        this.doNotSell = bool2;
    }

    public final String component1() {
        return this.odeeoId;
    }

    public final Boolean component10() {
        return this.tcfGdprApplies;
    }

    public final String component11() {
        return this.tcfTcstring;
    }

    public final String component12() {
        return this.usPrivacy;
    }

    public final String component13() {
        return this.usPrivacySource;
    }

    public final Boolean component14() {
        return this.doNotSell;
    }

    public final String component2() {
        return this.sdkVersion;
    }

    public final String component3() {
        return this.engineName;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final String component5() {
        return this.forceRegulation;
    }

    public final boolean component6() {
        return this.limitedAdTracking;
    }

    public final boolean component7() {
        return this.isChildDirected;
    }

    public final String component8() {
        return this.tcfCmpSdkId;
    }

    public final String component9() {
        return this.tcfCmpSdkVersion;
    }

    public final c copy(String odeeoId, String sdkVersion, String engineName, String sessionId, String forceRegulation, boolean z10, boolean z11, String str, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2) {
        e0.checkNotNullParameter(odeeoId, "odeeoId");
        e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        e0.checkNotNullParameter(engineName, "engineName");
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(forceRegulation, "forceRegulation");
        return new c(odeeoId, sdkVersion, engineName, sessionId, forceRegulation, z10, z11, str, str2, bool, str3, str4, str5, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.odeeoId, cVar.odeeoId) && e0.areEqual(this.sdkVersion, cVar.sdkVersion) && e0.areEqual(this.engineName, cVar.engineName) && e0.areEqual(this.sessionId, cVar.sessionId) && e0.areEqual(this.forceRegulation, cVar.forceRegulation) && this.limitedAdTracking == cVar.limitedAdTracking && this.isChildDirected == cVar.isChildDirected && e0.areEqual(this.tcfCmpSdkId, cVar.tcfCmpSdkId) && e0.areEqual(this.tcfCmpSdkVersion, cVar.tcfCmpSdkVersion) && e0.areEqual(this.tcfGdprApplies, cVar.tcfGdprApplies) && e0.areEqual(this.tcfTcstring, cVar.tcfTcstring) && e0.areEqual(this.usPrivacy, cVar.usPrivacy) && e0.areEqual(this.usPrivacySource, cVar.usPrivacySource) && e0.areEqual(this.doNotSell, cVar.doNotSell);
    }

    public final Boolean getDoNotSell() {
        return this.doNotSell;
    }

    public final String getEngineName() {
        return this.engineName;
    }

    public final String getForceRegulation() {
        return this.forceRegulation;
    }

    public final boolean getLimitedAdTracking() {
        return this.limitedAdTracking;
    }

    public final String getOdeeoId() {
        return this.odeeoId;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTcfCmpSdkId() {
        return this.tcfCmpSdkId;
    }

    public final String getTcfCmpSdkVersion() {
        return this.tcfCmpSdkVersion;
    }

    public final Boolean getTcfGdprApplies() {
        return this.tcfGdprApplies;
    }

    public final String getTcfTcstring() {
        return this.tcfTcstring;
    }

    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    public final String getUsPrivacySource() {
        return this.usPrivacySource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iE = o2.e(o2.e(o2.e(o2.e(this.odeeoId.hashCode() * 31, 31, this.sdkVersion), 31, this.engineName), 31, this.sessionId), 31, this.forceRegulation);
        boolean z10 = this.limitedAdTracking;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iE + i10) * 31;
        boolean z11 = this.isChildDirected;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.tcfCmpSdkId;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tcfCmpSdkVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.tcfGdprApplies;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.tcfTcstring;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.usPrivacy;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.usPrivacySource;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.doNotSell;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isChildDirected() {
        return this.isChildDirected;
    }

    public String toString() {
        return "ConsentRequest(odeeoId=" + this.odeeoId + ", sdkVersion=" + this.sdkVersion + ", engineName=" + this.engineName + ", sessionId=" + this.sessionId + ", forceRegulation=" + this.forceRegulation + ", limitedAdTracking=" + this.limitedAdTracking + ", isChildDirected=" + this.isChildDirected + ", tcfCmpSdkId=" + ((Object) this.tcfCmpSdkId) + ", tcfCmpSdkVersion=" + ((Object) this.tcfCmpSdkVersion) + ", tcfGdprApplies=" + this.tcfGdprApplies + ", tcfTcstring=" + ((Object) this.tcfTcstring) + ", usPrivacy=" + ((Object) this.usPrivacy) + ", usPrivacySource=" + ((Object) this.usPrivacySource) + ", doNotSell=" + this.doNotSell + ')';
    }
}
