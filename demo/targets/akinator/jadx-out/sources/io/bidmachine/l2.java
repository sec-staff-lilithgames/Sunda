package io.bidmachine;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f60591a = {DtbConstants.IABCONSENT_SUBJECT_TO_GDPR, "IABTCF_gdprApplies", DtbConstants.IABCONSENT_CONSENT_STRING, "IABTCF_TCString", "IABUSPrivacy_String", DtbConstants.IABGPP_HDR_GppString, DtbConstants.IABGPP_GppSID};

    String getGDPRConsentString();

    List<Integer> getGPPIds();

    String getGPPString();

    Boolean getSubjectToGDPR();

    Boolean getTcfGdprApplies();

    String getTcfTcString();

    String getUSPrivacyString();

    void initialize(Context context);
}
