package com.sfbx.appconsentv3.ui.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import cv.BLca.YsiBvdpw;
import j1.o2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorCore {
    private final List<Integer> consentables;
    private final Long cookieMaxAgeSeconds;
    private final List<Integer> dataDeclaration;
    private final DataRetentionCore dataRetention;
    private final String extraId;
    private final List<Integer> flexibles;
    private final Integer googleAtpId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50544id;
    private final ACConsentStatus legintStatus;
    private final List<Integer> legintables;
    private final String name;
    private final String policyUrl;
    private final ACConsentStatus status;
    private final Map<String, VendorUrlCore> urls;
    private final Boolean usesNonCookieAccess;

    public VendorCore(int i10, Integer num, String str, String name, String str2, Map<String, VendorUrlCore> urls, DataRetentionCore dataRetention, List<Integer> consentables, List<Integer> legintables, List<Integer> flexibles, ACConsentStatus status, ACConsentStatus legintStatus, Long l9, Boolean bool, Integer num2, List<Integer> dataDeclaration) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(str2, YsiBvdpw.xyobMTbx);
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(dataRetention, "dataRetention");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(legintables, "legintables");
        e0.checkNotNullParameter(flexibles, "flexibles");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        e0.checkNotNullParameter(dataDeclaration, "dataDeclaration");
        this.f50544id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.policyUrl = str2;
        this.urls = urls;
        this.dataRetention = dataRetention;
        this.consentables = consentables;
        this.legintables = legintables;
        this.flexibles = flexibles;
        this.status = status;
        this.legintStatus = legintStatus;
        this.cookieMaxAgeSeconds = l9;
        this.usesNonCookieAccess = bool;
        this.googleAtpId = num2;
        this.dataDeclaration = dataDeclaration;
    }

    public final int component1() {
        return this.f50544id;
    }

    public final List<Integer> component10() {
        return this.flexibles;
    }

    public final ACConsentStatus component11() {
        return this.status;
    }

    public final ACConsentStatus component12() {
        return this.legintStatus;
    }

    public final Long component13() {
        return this.cookieMaxAgeSeconds;
    }

    public final Boolean component14() {
        return this.usesNonCookieAccess;
    }

    public final Integer component15() {
        return this.googleAtpId;
    }

    public final List<Integer> component16() {
        return this.dataDeclaration;
    }

    public final Integer component2() {
        return this.iabId;
    }

    public final String component3() {
        return this.extraId;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.policyUrl;
    }

    public final Map<String, VendorUrlCore> component6() {
        return this.urls;
    }

    public final DataRetentionCore component7() {
        return this.dataRetention;
    }

    public final List<Integer> component8() {
        return this.consentables;
    }

    public final List<Integer> component9() {
        return this.legintables;
    }

    public final VendorCore copy(int i10, Integer num, String str, String name, String policyUrl, Map<String, VendorUrlCore> urls, DataRetentionCore dataRetention, List<Integer> consentables, List<Integer> legintables, List<Integer> flexibles, ACConsentStatus status, ACConsentStatus legintStatus, Long l9, Boolean bool, Integer num2, List<Integer> dataDeclaration) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(dataRetention, "dataRetention");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(legintables, "legintables");
        e0.checkNotNullParameter(flexibles, "flexibles");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        e0.checkNotNullParameter(dataDeclaration, "dataDeclaration");
        return new VendorCore(i10, num, str, name, policyUrl, urls, dataRetention, consentables, legintables, flexibles, status, legintStatus, l9, bool, num2, dataDeclaration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorCore)) {
            return false;
        }
        VendorCore vendorCore = (VendorCore) obj;
        return this.f50544id == vendorCore.f50544id && e0.areEqual(this.iabId, vendorCore.iabId) && e0.areEqual(this.extraId, vendorCore.extraId) && e0.areEqual(this.name, vendorCore.name) && e0.areEqual(this.policyUrl, vendorCore.policyUrl) && e0.areEqual(this.urls, vendorCore.urls) && e0.areEqual(this.dataRetention, vendorCore.dataRetention) && e0.areEqual(this.consentables, vendorCore.consentables) && e0.areEqual(this.legintables, vendorCore.legintables) && e0.areEqual(this.flexibles, vendorCore.flexibles) && this.status == vendorCore.status && this.legintStatus == vendorCore.legintStatus && e0.areEqual(this.cookieMaxAgeSeconds, vendorCore.cookieMaxAgeSeconds) && e0.areEqual(this.usesNonCookieAccess, vendorCore.usesNonCookieAccess) && e0.areEqual(this.googleAtpId, vendorCore.googleAtpId) && e0.areEqual(this.dataDeclaration, vendorCore.dataDeclaration);
    }

    public final List<Integer> getConsentables() {
        return this.consentables;
    }

    public final Long getCookieMaxAgeSeconds() {
        return this.cookieMaxAgeSeconds;
    }

    public final List<Integer> getDataDeclaration() {
        return this.dataDeclaration;
    }

    public final DataRetentionCore getDataRetention() {
        return this.dataRetention;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final List<Integer> getFlexibles() {
        return this.flexibles;
    }

    public final Integer getGoogleAtpId() {
        return this.googleAtpId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50544id;
    }

    public final ACConsentStatus getLegintStatus() {
        return this.legintStatus;
    }

    public final List<Integer> getLegintables() {
        return this.legintables;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    public final ACConsentStatus getStatus() {
        return this.status;
    }

    public final Map<String, VendorUrlCore> getUrls() {
        return this.urls;
    }

    public final Boolean getUsesNonCookieAccess() {
        return this.usesNonCookieAccess;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50544id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iHashCode3 = (this.legintStatus.hashCode() + ((this.status.hashCode() + o2.c(o2.c(o2.c((this.dataRetention.hashCode() + p0.o2.f(this.urls, p0.o2.e(p0.o2.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.policyUrl), 31)) * 31, 31, this.consentables), 31, this.legintables), 31, this.flexibles)) * 31)) * 31;
        Long l9 = this.cookieMaxAgeSeconds;
        int iHashCode4 = (iHashCode3 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Boolean bool = this.usesNonCookieAccess;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.googleAtpId;
        return this.dataDeclaration.hashCode() + ((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorCore(id=");
        sb2.append(this.f50544id);
        sb2.append(", iabId=");
        sb2.append(this.iabId);
        sb2.append(", extraId=");
        sb2.append(this.extraId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", policyUrl=");
        sb2.append(this.policyUrl);
        sb2.append(", urls=");
        sb2.append(this.urls);
        sb2.append(", dataRetention=");
        sb2.append(this.dataRetention);
        sb2.append(", consentables=");
        sb2.append(this.consentables);
        sb2.append(", legintables=");
        sb2.append(this.legintables);
        sb2.append(", flexibles=");
        sb2.append(this.flexibles);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", legintStatus=");
        sb2.append(this.legintStatus);
        sb2.append(", cookieMaxAgeSeconds=");
        sb2.append(this.cookieMaxAgeSeconds);
        sb2.append(", usesNonCookieAccess=");
        sb2.append(this.usesNonCookieAccess);
        sb2.append(", googleAtpId=");
        sb2.append(this.googleAtpId);
        sb2.append(", dataDeclaration=");
        return o2.p(sb2, this.dataDeclaration, ')');
    }

    public /* synthetic */ VendorCore(int i10, Integer num, String str, String str2, String str3, Map map, DataRetentionCore dataRetentionCore, List list, List list2, List list3, ACConsentStatus aCConsentStatus, ACConsentStatus aCConsentStatus2, Long l9, Boolean bool, Integer num2, List list4, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, str2, str3, (i11 & 32) != 0 ? p1.emptyMap() : map, (i11 & 64) != 0 ? new DataRetentionCore(0, null, null, 7, null) : dataRetentionCore, (i11 & 128) != 0 ? p0.emptyList() : list, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p0.emptyList() : list2, (i11 & 512) != 0 ? p0.emptyList() : list3, (i11 & 1024) != 0 ? ACConsentStatus.PENDING : aCConsentStatus, (i11 & 2048) != 0 ? ACConsentStatus.PENDING : aCConsentStatus2, (i11 & 4096) != 0 ? null : l9, (i11 & Segment.SIZE) != 0 ? null : bool, (i11 & 16384) != 0 ? null : num2, (i11 & 32768) != 0 ? p0.emptyList() : list4);
    }
}
