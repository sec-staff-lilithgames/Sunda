package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import ao.kwoC.zAQQWzBxnS;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class f7 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f13967a;

    /* renamed from: b, reason: collision with root package name */
    private p2 f13968b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class a extends p2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return i10 == d.SETTINGS.ordinal() ? f7.this.c() : f7.this.a();
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return i10 == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return i10 == d.SETTINGS.ordinal() ? new t4("SETTINGS") : new t4("GDPR APPLICABILITY");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class b implements p2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f13970a;

        public b(com.applovin.impl.sdk.k kVar) {
            this.f13970a = kVar;
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            if (i2Var.b() == d.SETTINGS.ordinal()) {
                if (i2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f13970a.y().f() != null) {
                        h7.a(this.f13970a.y().f(), com.applovin.impl.sdk.k.o(), this.f13970a);
                        return;
                    } else {
                        k7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", f7.this);
                        return;
                    }
                }
                if (i2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f13970a.y().h() == null) {
                    return;
                }
                h7.a(this.f13970a.y().h(), com.applovin.impl.sdk.k.o(), this.f13970a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private o2 d() {
        o2.b bVarD = o2.a().d("Terms of Service URL");
        if (this.f13967a.y().h() != null) {
            bVarD.a(R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(m0.a(R.color.applovin_sdk_checkmarkColor, this));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f13967a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f13967a = kVar;
        a aVar = new a(this);
        this.f13968b = aVar;
        aVar.a(new b(kVar));
        this.f13968b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f13968b);
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p2 p2Var = this.f13968b;
        if (p2Var != null) {
            p2Var.a((p2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f13967a.w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = this.f13967a.y().d();
        boolean z10 = k7.c(this.f13967a) && consentFlowUserGeographyD != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(o2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z10));
        arrayList.add(b(consentFlowUserGeographyD, z10));
        return arrayList;
    }

    private o2 b() {
        boolean z10 = this.f13967a.y().f() != null;
        return o2.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }

    private o2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return o2.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? zAQQWzBxnS.YNlMEzMyyoecuv : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z10).a();
    }

    private o2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return o2.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z10).a();
    }
}
