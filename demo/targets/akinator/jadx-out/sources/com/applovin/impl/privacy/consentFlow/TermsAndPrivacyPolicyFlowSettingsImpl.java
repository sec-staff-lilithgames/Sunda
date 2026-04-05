package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15088a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15089b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f15090c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f15091d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f15092e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z10, boolean z11, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f15088a = z10;
        this.f15089b = z11;
        this.f15090c = consentFlowUserGeography;
        this.f15091d = uri;
        this.f15092e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f15090c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f15091d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f15092e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f15088a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        o.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f15090c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z10) {
        o.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z10);
        this.f15088a = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        o.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f15091d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z10) {
        o.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z10);
        this.f15089b = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        o.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f15092e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f15089b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f15088a + ", privacyPolicyUri=" + this.f15091d + ", termsOfServiceUri=" + this.f15092e + AbstractJsonLexerKt.END_OBJ;
    }
}
