package com.sfbx.appconsentv3.ui.model;

import androidx.core.app.NotificationCompat;
import e3.g;
import j1.o2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentCore {
    private final String cmpHash;
    private final Integer cmpHashVersion;
    private final Integer cmpVersion;
    private final String consentString;
    private final Map<String, String> externalIds;
    private final List<Integer> purposesConsent;
    private final List<Integer> purposesLITransparency;
    private final List<Integer> specialFeatureOptIns;
    private final int type;
    private final String uuid;
    private final List<Integer> vendorLIT;
    private final List<Integer> vendorsConsent;

    public ConsentCore() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, 4095, null);
    }

    public static /* synthetic */ ConsentCore copy$default(ConsentCore consentCore, String str, List list, List list2, List list3, List list4, List list5, Integer num, String str2, int i10, String str3, Integer num2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = consentCore.consentString;
        }
        if ((i11 & 2) != 0) {
            list = consentCore.specialFeatureOptIns;
        }
        if ((i11 & 4) != 0) {
            list2 = consentCore.purposesConsent;
        }
        if ((i11 & 8) != 0) {
            list3 = consentCore.purposesLITransparency;
        }
        if ((i11 & 16) != 0) {
            list4 = consentCore.vendorsConsent;
        }
        if ((i11 & 32) != 0) {
            list5 = consentCore.vendorLIT;
        }
        if ((i11 & 64) != 0) {
            num = consentCore.cmpVersion;
        }
        if ((i11 & 128) != 0) {
            str2 = consentCore.uuid;
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i10 = consentCore.type;
        }
        if ((i11 & 512) != 0) {
            str3 = consentCore.cmpHash;
        }
        if ((i11 & 1024) != 0) {
            num2 = consentCore.cmpHashVersion;
        }
        if ((i11 & 2048) != 0) {
            map = consentCore.externalIds;
        }
        Integer num3 = num2;
        Map map2 = map;
        int i12 = i10;
        String str4 = str3;
        Integer num4 = num;
        String str5 = str2;
        List list6 = list4;
        List list7 = list5;
        return consentCore.copy(str, list, list2, list3, list6, list7, num4, str5, i12, str4, num3, map2);
    }

    public final String component1() {
        return this.consentString;
    }

    public final String component10() {
        return this.cmpHash;
    }

    public final Integer component11() {
        return this.cmpHashVersion;
    }

    public final Map<String, String> component12() {
        return this.externalIds;
    }

    public final List<Integer> component2() {
        return this.specialFeatureOptIns;
    }

    public final List<Integer> component3() {
        return this.purposesConsent;
    }

    public final List<Integer> component4() {
        return this.purposesLITransparency;
    }

    public final List<Integer> component5() {
        return this.vendorsConsent;
    }

    public final List<Integer> component6() {
        return this.vendorLIT;
    }

    public final Integer component7() {
        return this.cmpVersion;
    }

    public final String component8() {
        return this.uuid;
    }

    public final int component9() {
        return this.type;
    }

    public final ConsentCore copy(String consentString, List<Integer> specialFeatureOptIns, List<Integer> purposesConsent, List<Integer> purposesLITransparency, List<Integer> vendorsConsent, List<Integer> vendorLIT, Integer num, String str, int i10, String str2, Integer num2, Map<String, String> externalIds) {
        e0.checkNotNullParameter(consentString, "consentString");
        e0.checkNotNullParameter(specialFeatureOptIns, "specialFeatureOptIns");
        e0.checkNotNullParameter(purposesConsent, "purposesConsent");
        e0.checkNotNullParameter(purposesLITransparency, "purposesLITransparency");
        e0.checkNotNullParameter(vendorsConsent, "vendorsConsent");
        e0.checkNotNullParameter(vendorLIT, "vendorLIT");
        e0.checkNotNullParameter(externalIds, "externalIds");
        return new ConsentCore(consentString, specialFeatureOptIns, purposesConsent, purposesLITransparency, vendorsConsent, vendorLIT, num, str, i10, str2, num2, externalIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentCore)) {
            return false;
        }
        ConsentCore consentCore = (ConsentCore) obj;
        return e0.areEqual(this.consentString, consentCore.consentString) && e0.areEqual(this.specialFeatureOptIns, consentCore.specialFeatureOptIns) && e0.areEqual(this.purposesConsent, consentCore.purposesConsent) && e0.areEqual(this.purposesLITransparency, consentCore.purposesLITransparency) && e0.areEqual(this.vendorsConsent, consentCore.vendorsConsent) && e0.areEqual(this.vendorLIT, consentCore.vendorLIT) && e0.areEqual(this.cmpVersion, consentCore.cmpVersion) && e0.areEqual(this.uuid, consentCore.uuid) && this.type == consentCore.type && e0.areEqual(this.cmpHash, consentCore.cmpHash) && e0.areEqual(this.cmpHashVersion, consentCore.cmpHashVersion) && e0.areEqual(this.externalIds, consentCore.externalIds);
    }

    public final String getCmpHash() {
        return this.cmpHash;
    }

    public final Integer getCmpHashVersion() {
        return this.cmpHashVersion;
    }

    public final Integer getCmpVersion() {
        return this.cmpVersion;
    }

    public final String getConsentString() {
        return this.consentString;
    }

    public final Map<String, String> getExternalIds() {
        return this.externalIds;
    }

    public final List<Integer> getPurposesConsent() {
        return this.purposesConsent;
    }

    public final List<Integer> getPurposesLITransparency() {
        return this.purposesLITransparency;
    }

    public final List<Integer> getSpecialFeatureOptIns() {
        return this.specialFeatureOptIns;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final List<Integer> getVendorLIT() {
        return this.vendorLIT;
    }

    public final List<Integer> getVendorsConsent() {
        return this.vendorsConsent;
    }

    public int hashCode() {
        int iC = o2.c(o2.c(o2.c(o2.c(o2.c(this.consentString.hashCode() * 31, 31, this.specialFeatureOptIns), 31, this.purposesConsent), 31, this.purposesLITransparency), 31, this.vendorsConsent), 31, this.vendorLIT);
        Integer num = this.cmpVersion;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.uuid;
        int iD = g.d(this.type, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.cmpHash;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.cmpHashVersion;
        return this.externalIds.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConsentCore(consentString=");
        sb2.append(this.consentString);
        sb2.append(", specialFeatureOptIns=");
        sb2.append(this.specialFeatureOptIns);
        sb2.append(", purposesConsent=");
        sb2.append(this.purposesConsent);
        sb2.append(", purposesLITransparency=");
        sb2.append(this.purposesLITransparency);
        sb2.append(", vendorsConsent=");
        sb2.append(this.vendorsConsent);
        sb2.append(", vendorLIT=");
        sb2.append(this.vendorLIT);
        sb2.append(", cmpVersion=");
        sb2.append(this.cmpVersion);
        sb2.append(", uuid=");
        sb2.append(this.uuid);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", cmpHash=");
        sb2.append(this.cmpHash);
        sb2.append(", cmpHashVersion=");
        sb2.append(this.cmpHashVersion);
        sb2.append(", externalIds=");
        return o2.q(sb2, this.externalIds, ')');
    }

    public ConsentCore(String consentString, List<Integer> specialFeatureOptIns, List<Integer> purposesConsent, List<Integer> purposesLITransparency, List<Integer> vendorsConsent, List<Integer> vendorLIT, Integer num, String str, int i10, String str2, Integer num2, Map<String, String> externalIds) {
        e0.checkNotNullParameter(consentString, "consentString");
        e0.checkNotNullParameter(specialFeatureOptIns, "specialFeatureOptIns");
        e0.checkNotNullParameter(purposesConsent, "purposesConsent");
        e0.checkNotNullParameter(purposesLITransparency, "purposesLITransparency");
        e0.checkNotNullParameter(vendorsConsent, "vendorsConsent");
        e0.checkNotNullParameter(vendorLIT, "vendorLIT");
        e0.checkNotNullParameter(externalIds, "externalIds");
        this.consentString = consentString;
        this.specialFeatureOptIns = specialFeatureOptIns;
        this.purposesConsent = purposesConsent;
        this.purposesLITransparency = purposesLITransparency;
        this.vendorsConsent = vendorsConsent;
        this.vendorLIT = vendorLIT;
        this.cmpVersion = num;
        this.uuid = str;
        this.type = i10;
        this.cmpHash = str2;
        this.cmpHashVersion = num2;
        this.externalIds = externalIds;
    }

    public /* synthetic */ ConsentCore(String str, List list, List list2, List list3, List list4, List list5, Integer num, String str2, int i10, String str3, Integer num2, Map map, int i11, u uVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? p0.emptyList() : list, (i11 & 4) != 0 ? p0.emptyList() : list2, (i11 & 8) != 0 ? p0.emptyList() : list3, (i11 & 16) != 0 ? p0.emptyList() : list4, (i11 & 32) != 0 ? p0.emptyList() : list5, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str2, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 2 : i10, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : num2, (i11 & 2048) != 0 ? p1.emptyMap() : map);
    }
}
