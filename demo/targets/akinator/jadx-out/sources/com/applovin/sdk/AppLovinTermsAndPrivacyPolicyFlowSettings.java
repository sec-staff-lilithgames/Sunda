package com.applovin.sdk;

import android.net.Uri;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface AppLovinTermsAndPrivacyPolicyFlowSettings {
    AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    Uri getPrivacyPolicyUri();

    Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);

    void setEnabled(boolean z10);

    void setPrivacyPolicyUri(Uri uri);

    void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z10);

    void setTermsOfServiceUri(Uri uri);

    boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr();
}
