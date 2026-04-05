package io.odeeo.internal.f1;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    @lk.c("gc")
    private final boolean generalConsent;

    @lk.c("gcp")
    private final String generalConsentPayload;

    @lk.c("regulation_type")
    private final String regulationType;

    public e(boolean z10, String generalConsentPayload, String regulationType) {
        e0.checkNotNullParameter(generalConsentPayload, "generalConsentPayload");
        e0.checkNotNullParameter(regulationType, "regulationType");
        this.generalConsent = z10;
        this.generalConsentPayload = generalConsentPayload;
        this.regulationType = regulationType;
    }

    public static /* synthetic */ e copy$default(e eVar, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = eVar.generalConsent;
        }
        if ((i10 & 2) != 0) {
            str = eVar.generalConsentPayload;
        }
        if ((i10 & 4) != 0) {
            str2 = eVar.regulationType;
        }
        return eVar.copy(z10, str, str2);
    }

    public final boolean component1() {
        return this.generalConsent;
    }

    public final String component2() {
        return this.generalConsentPayload;
    }

    public final String component3() {
        return this.regulationType;
    }

    public final e copy(boolean z10, String generalConsentPayload, String regulationType) {
        e0.checkNotNullParameter(generalConsentPayload, "generalConsentPayload");
        e0.checkNotNullParameter(regulationType, "regulationType");
        return new e(z10, generalConsentPayload, regulationType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.generalConsent == eVar.generalConsent && e0.areEqual(this.generalConsentPayload, eVar.generalConsentPayload) && e0.areEqual(this.regulationType, eVar.regulationType);
    }

    public final boolean getGeneralConsent() {
        return this.generalConsent;
    }

    public final String getGeneralConsentPayload() {
        return this.generalConsentPayload;
    }

    public final String getRegulationType() {
        return this.regulationType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.generalConsent;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.regulationType.hashCode() + o2.e(r02 * 31, 31, this.generalConsentPayload);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeneralConsentData(generalConsent=");
        sb2.append(this.generalConsent);
        sb2.append(", generalConsentPayload=");
        sb2.append(this.generalConsentPayload);
        sb2.append(", regulationType=");
        return o2.q(sb2, this.regulationType, ')');
    }
}
