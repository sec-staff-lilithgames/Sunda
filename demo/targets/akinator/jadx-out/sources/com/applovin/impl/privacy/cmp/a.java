package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import ao.q0;
import com.applovin.impl.c2;
import com.applovin.impl.k0;
import com.applovin.impl.k7;
import com.applovin.impl.o9;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final k f15079a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15080b;

    /* renamed from: c, reason: collision with root package name */
    private ConsentForm f15081c;

    /* renamed from: d, reason: collision with root package name */
    private int f15082d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0037a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.f15079a = kVar;
        this.f15080b = kVar.O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.o());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.f15081c != null) {
            this.f15081c = null;
        }
        this.f15082d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.o()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0037a interfaceC0037a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0037a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.f15079a.c(v4.P6).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f15079a.a(v4.O6);
        return num.intValue() < 0 || this.f15082d < num.intValue();
    }

    public void a(Activity activity, k0 k0Var, InterfaceC0037a interfaceC0037a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (k7.c(this.f15079a) && k0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f15079a.o0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new q0(this, 3, activity, interfaceC0037a), new b(this, interfaceC0037a));
    }

    public void b(Activity activity, final k0 k0Var, final InterfaceC0037a interfaceC0037a) {
        if (this.f15081c == null) {
            b("Failed to show - not ready yet");
            interfaceC0037a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f15081c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.c
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f15085a.a(k0Var, interfaceC0037a, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(FormError formError, k0 k0Var, InterfaceC0037a interfaceC0037a) {
        a("Retrying to load and show consent form...");
        this.f15082d++;
        UserMessagingPlatform.loadConsentForm(k.o(), new o9(this, interfaceC0037a, formError, k0Var), new q0(this, 4, interfaceC0037a, formError));
    }

    private void b(String str) {
        if (o.a()) {
            this.f15080b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, InterfaceC0037a interfaceC0037a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0037a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
        } else if (consentStatus != 2) {
            b(a.b.e(consentStatus, PtLatqAYjEFT.qHBt));
            interfaceC0037a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, a.b.e(consentStatus, "Consent form not required for consent status: ")));
        } else {
            a("Successfully requested consent info");
            a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new b(this, interfaceC0037a), new b(this, interfaceC0037a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0037a interfaceC0037a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.f15081c = consentForm;
        interfaceC0037a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0037a interfaceC0037a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0037a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k0 k0Var, InterfaceC0037a interfaceC0037a, FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f15079a.E().a(c2.B0, "googleConsentFormDismissed", map);
            if (c(strValueOf)) {
                a(a.b.k("Consent form was dismissed due to error: ", message));
                AppLovinSdkUtils.runOnUiThread(new al.a(10, this, formError, k0Var, interfaceC0037a));
                return;
            } else {
                b(a.b.k("Failed to show with error: ", message));
                interfaceC0037a.onFlowShowFailed(a(formError, "Consent form show failed"));
                return;
            }
        }
        a("Consent form finished showing");
        interfaceC0037a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0037a interfaceC0037a, FormError formError, k0 k0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.f15081c = consentForm;
        Activity activityV0 = this.f15079a.v0();
        if (activityV0 == null) {
            interfaceC0037a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(activityV0, k0Var, interfaceC0037a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0037a interfaceC0037a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0037a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    private void a(String str) {
        if (o.a()) {
            this.f15080b.a("GoogleCmpAdapter", str);
        }
    }
}
