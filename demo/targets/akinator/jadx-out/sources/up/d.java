package up;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface d {
    boolean canSendBmIfv();

    boolean canSendDeviceInfo();

    boolean canSendGeoPosition();

    boolean canSendIfa();

    boolean canSendUserInfo();

    List<Integer> getGPPIds();

    String getGPPString();

    String getIABGDPRString();

    String getUSPrivacyString();

    boolean hasConsent();

    boolean isUserAgeRestricted();

    boolean isUserGdprProtected();

    boolean isUserHasCcpaConsent();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();
}
