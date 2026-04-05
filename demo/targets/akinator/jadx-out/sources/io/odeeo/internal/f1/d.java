package io.odeeo.internal.f1;

import io.odeeo.sdk.consent.ConsentType;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f64045a;

    /* renamed from: b, reason: collision with root package name */
    public String f64046b;

    /* renamed from: c, reason: collision with root package name */
    public a f64047c;

    /* renamed from: d, reason: collision with root package name */
    public a f64048d;

    /* renamed from: e, reason: collision with root package name */
    public ConsentType f64049e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f64050f;

    /* renamed from: g, reason: collision with root package name */
    public String f64051g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        TrueInt,
        FalseInt,
        Default
    }

    public d() {
        this(null, null, null, null, null, false, null, 127, null);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, a aVar, a aVar2, ConsentType consentType, boolean z10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.f64045a;
        }
        if ((i10 & 2) != 0) {
            str2 = dVar.f64046b;
        }
        if ((i10 & 4) != 0) {
            aVar = dVar.f64047c;
        }
        if ((i10 & 8) != 0) {
            aVar2 = dVar.f64048d;
        }
        if ((i10 & 16) != 0) {
            consentType = dVar.f64049e;
        }
        if ((i10 & 32) != 0) {
            z10 = dVar.f64050f;
        }
        if ((i10 & 64) != 0) {
            str3 = dVar.f64051g;
        }
        boolean z11 = z10;
        String str4 = str3;
        ConsentType consentType2 = consentType;
        a aVar3 = aVar;
        return dVar.copy(str, str2, aVar3, aVar2, consentType2, z11, str4);
    }

    public static /* synthetic */ void setDoNotSell$default(d dVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        dVar.setDoNotSell(z10, str);
    }

    public final void a() {
        this.f64045a = "";
        this.f64046b = "";
        a aVar = a.Default;
        this.f64047c = aVar;
        this.f64048d = aVar;
        clearForceRegulationType();
    }

    public final void clearForceRegulationType() {
        this.f64049e = ConsentType.Undefined;
    }

    public final String component1() {
        return this.f64045a;
    }

    public final String component2() {
        return this.f64046b;
    }

    public final a component3() {
        return this.f64047c;
    }

    public final a component4() {
        return this.f64048d;
    }

    public final ConsentType component5() {
        return this.f64049e;
    }

    public final boolean component6() {
        return this.f64050f;
    }

    public final String component7() {
        return this.f64051g;
    }

    public final d copy(String str, String str2, a gdprConsent, a ccpaConsent, ConsentType forceRegulationType, boolean z10, String publisherUserID) {
        e0.checkNotNullParameter(gdprConsent, "gdprConsent");
        e0.checkNotNullParameter(ccpaConsent, "ccpaConsent");
        e0.checkNotNullParameter(forceRegulationType, "forceRegulationType");
        e0.checkNotNullParameter(publisherUserID, "publisherUserID");
        return new d(str, str2, gdprConsent, ccpaConsent, forceRegulationType, z10, publisherUserID);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.areEqual(this.f64045a, dVar.f64045a) && e0.areEqual(this.f64046b, dVar.f64046b) && this.f64047c == dVar.f64047c && this.f64048d == dVar.f64048d && this.f64049e == dVar.f64049e && this.f64050f == dVar.f64050f && e0.areEqual(this.f64051g, dVar.f64051g);
    }

    public final void forceRegulationType(ConsentType type) {
        e0.checkNotNullParameter(type, "type");
        this.f64049e = type;
    }

    public final a getCcpaConsent() {
        return this.f64048d;
    }

    public final String getConsentStr() {
        return this.f64045a;
    }

    public final ConsentType getForceRegulationType() {
        return this.f64049e;
    }

    public final a getGdprConsent() {
        return this.f64047c;
    }

    public final String getPrivacyStr() {
        return this.f64046b;
    }

    public final String getPublisherUserID() {
        return this.f64051g;
    }

    public final ConsentType getRegulationType$odeeoSdk_release() {
        ConsentType consentType = this.f64049e;
        ConsentType consentType2 = ConsentType.Undefined;
        return consentType != consentType2 ? consentType : consentType2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f64045a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64046b;
        int iHashCode2 = (this.f64049e.hashCode() + ((this.f64048d.hashCode() + ((this.f64047c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        boolean z10 = this.f64050f;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.f64051g.hashCode() + ((iHashCode2 + i10) * 31);
    }

    public final boolean isChildDirected() {
        return this.f64050f;
    }

    public final void processDefaultValues(io.odeeo.internal.u1.a mPersonalInfo) {
        e0.checkNotNullParameter(mPersonalInfo, "mPersonalInfo");
        String str = this.f64045a;
        if (str != null && str.length() > 0) {
            mPersonalInfo.setGdprConsentString$odeeoSdk_release(this.f64045a);
        }
        String str2 = this.f64046b;
        if (str2 != null && str2.length() > 0) {
            mPersonalInfo.setPrivacyStr$odeeoSdk_release(this.f64046b);
        }
        if (this.f64051g.length() > 0) {
            mPersonalInfo.setPublisherUserID$odeeoSdk_release(this.f64051g);
        }
        a aVar = this.f64048d;
        if (aVar != a.Default) {
            mPersonalInfo.setDoNotSell$odeeoSdk_release(aVar == a.TrueInt, this.f64046b);
        }
        ConsentType consentType = this.f64049e;
        if (consentType != ConsentType.Undefined) {
            mPersonalInfo.forceRegulationType$odeeoSdk_release(consentType);
        }
        boolean z10 = this.f64050f;
        if (z10) {
            mPersonalInfo.setChildDirected$odeeoSdk_release(z10);
        }
        a();
    }

    public final void setCcpaConsent(a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f64048d = aVar;
    }

    public final void setChildDirected(boolean z10) {
        this.f64050f = z10;
    }

    public final void setConsentStr(String str) {
        this.f64045a = str;
    }

    public final void setDoNotSell(boolean z10, String str) {
        this.f64046b = str;
        this.f64048d = z10 ? a.TrueInt : a.FalseInt;
    }

    public final void setForceRegulationType(ConsentType consentType) {
        e0.checkNotNullParameter(consentType, "<set-?>");
        this.f64049e = consentType;
    }

    public final void setGdprConsent(a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f64047c = aVar;
    }

    public final void setPrivacyStr(String str) {
        this.f64046b = str;
    }

    public final void setPublisherUserID(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f64051g = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DefaultConsentData(consentStr=");
        sb2.append((Object) this.f64045a);
        sb2.append(", privacyStr=");
        sb2.append((Object) this.f64046b);
        sb2.append(", gdprConsent=");
        sb2.append(this.f64047c);
        sb2.append(", ccpaConsent=");
        sb2.append(this.f64048d);
        sb2.append(", forceRegulationType=");
        sb2.append(this.f64049e);
        sb2.append(", isChildDirected=");
        sb2.append(this.f64050f);
        sb2.append(", publisherUserID=");
        return o2.q(sb2, this.f64051g, ')');
    }

    public d(String str, String str2, a gdprConsent, a ccpaConsent, ConsentType forceRegulationType, boolean z10, String publisherUserID) {
        e0.checkNotNullParameter(gdprConsent, "gdprConsent");
        e0.checkNotNullParameter(ccpaConsent, "ccpaConsent");
        e0.checkNotNullParameter(forceRegulationType, "forceRegulationType");
        e0.checkNotNullParameter(publisherUserID, "publisherUserID");
        this.f64045a = str;
        this.f64046b = str2;
        this.f64047c = gdprConsent;
        this.f64048d = ccpaConsent;
        this.f64049e = forceRegulationType;
        this.f64050f = z10;
        this.f64051g = publisherUserID;
    }

    public /* synthetic */ d(String str, String str2, a aVar, a aVar2, ConsentType consentType, boolean z10, String str3, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? a.Default : aVar, (i10 & 8) != 0 ? a.Default : aVar2, (i10 & 16) != 0 ? ConsentType.Undefined : consentType, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? "" : str3);
    }
}
