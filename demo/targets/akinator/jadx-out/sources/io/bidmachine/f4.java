package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.protobuf.sdk.User;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f4 implements up.m, up.d {

    /* renamed from: a, reason: collision with root package name */
    public String f60353a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f60354b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f60355c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f60356d;

    /* renamed from: e, reason: collision with root package name */
    public String f60357e;

    /* renamed from: f, reason: collision with root package name */
    public String f60358f;

    /* renamed from: g, reason: collision with root package name */
    public List f60359g;

    public final void a(User.Builder builder) {
        builder.setCoppa(b());
        builder.setGdpr(c());
        builder.setConsent(getIABGDPRString());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.setCcpa(uSPrivacyString);
        }
        String gPPString = getGPPString();
        if (!TextUtils.isEmpty(gPPString)) {
            builder.setGpp(gPPString);
        }
        List<Integer> gPPIds = getGPPIds();
        if (nm.j.isEmpty(gPPIds)) {
            return;
        }
        builder.addAllGppSid(gPPIds);
    }

    public final boolean b() {
        Boolean bool = this.f60356d;
        return bool != null && bool.booleanValue();
    }

    public final boolean c() {
        n2 n2Var = n1.a().f61928k;
        Boolean bool = (Boolean) nm.j.oneOf(this.f60354b, n2Var.getTcfGdprApplies(), n2Var.getSubjectToGDPR());
        return bool != null && bool.booleanValue();
    }

    @Override // up.d
    public boolean canSendBmIfv() {
        return !b();
    }

    @Override // up.d
    public boolean canSendDeviceInfo() {
        return !b();
    }

    @Override // up.d
    public boolean canSendGeoPosition() {
        return (b() || isUserGdprProtected()) ? false : true;
    }

    @Override // up.d
    public boolean canSendIfa() {
        return (b() || isUserGdprProtected()) ? false : true;
    }

    @Override // up.d
    public boolean canSendUserInfo() {
        return (b() || isUserGdprProtected()) ? false : true;
    }

    @Override // up.d
    public List<Integer> getGPPIds() {
        return (List) nm.j.oneOf(this.f60359g, n1.a().f61928k.getGPPIds());
    }

    @Override // up.d
    public String getGPPString() {
        return (String) nm.j.oneOf(this.f60358f, n1.a().f61928k.getGPPString());
    }

    @Override // up.d
    public String getIABGDPRString() {
        n2 n2Var = n1.a().f61928k;
        String str = (String) nm.j.oneOf(this.f60353a, n2Var.getTcfTcString(), n2Var.getGDPRConsentString());
        return TextUtils.isEmpty(str) ? hasConsent() ? "1" : "0" : str;
    }

    @Override // up.d
    public String getUSPrivacyString() {
        return (String) nm.j.oneOf(this.f60357e, n1.a().f61928k.getUSPrivacyString());
    }

    @Override // up.d
    public boolean hasConsent() {
        Boolean bool = this.f60355c;
        return bool != null && bool.booleanValue();
    }

    @Override // up.d
    public boolean isUserAgeRestricted() {
        return b();
    }

    @Override // up.d
    public boolean isUserGdprProtected() {
        if (!c() || hasConsent()) {
            return false;
        }
        n2 n2Var = n1.a().f61928k;
        return TextUtils.isEmpty((String) nm.j.oneOf(this.f60353a, n2Var.getTcfTcString(), n2Var.getGDPRConsentString()));
    }

    @Override // up.d
    public boolean isUserHasCcpaConsent() {
        String uSPrivacyString = getUSPrivacyString();
        return uSPrivacyString != null && uSPrivacyString.length() == 4 && uSPrivacyString.charAt(0) == '1' && (uSPrivacyString.charAt(2) == 'N' || uSPrivacyString.charAt(2) == 'n');
    }

    @Override // up.d
    public boolean isUserHasConsent() {
        if (hasConsent()) {
            return true;
        }
        n2 n2Var = n1.a().f61928k;
        return !TextUtils.isEmpty((String) nm.j.oneOf(this.f60353a, n2Var.getTcfTcString(), n2Var.getGDPRConsentString()));
    }

    @Override // up.d
    public boolean isUserInCcpaScope() {
        String uSPrivacyString = getUSPrivacyString();
        return uSPrivacyString != null && uSPrivacyString.length() == 4 && uSPrivacyString.charAt(0) == '1' && !uSPrivacyString.contains("---");
    }

    @Override // up.d
    public boolean isUserInGdprScope() {
        return c();
    }

    @Override // up.m
    public /* bridge */ /* synthetic */ Object setGPP(String str, List list) {
        return setGPP(str, (List<Integer>) list);
    }

    @Override // up.m
    public f4 setConsentConfig(boolean z10, String str) {
        this.f60353a = str;
        this.f60355c = Boolean.valueOf(z10);
        return this;
    }

    @Override // up.m
    public f4 setCoppa(Boolean bool) {
        this.f60356d = bool;
        return this;
    }

    @Override // up.m
    public f4 setGPP(String str, List<Integer> list) {
        this.f60358f = str;
        this.f60359g = list;
        return this;
    }

    @Override // up.m
    public f4 setSubjectToGDPR(Boolean bool) {
        this.f60354b = bool;
        return this;
    }

    @Override // up.m
    public f4 setUSPrivacyString(String str) {
        this.f60357e = str;
        return this;
    }
}
