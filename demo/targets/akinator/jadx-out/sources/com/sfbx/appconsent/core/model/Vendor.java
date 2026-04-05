package com.sfbx.appconsent.core.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;
import uu.o0;
import uu.p0;
import uu.p1;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Vendor {
    public static final Companion Companion = new Companion(null);
    private final Long cookieMaxAgeSeconds;
    private final List<Integer> dataDeclarations;
    private final DataRetentionCore dataRetention;
    private final String extraId;
    private final Integer googleAtpId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50520id;
    private final boolean isExtraVendor;
    private final boolean isLegVendor;
    private ConsentStatus legIntStatus;
    private final String name;
    private final String policyUrl;
    private ConsentStatus status;
    private final Map<String, VendorUrl> urls;
    private final Boolean usesNonCookieAccess;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Vendor> serializer() {
            return Vendor$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ Vendor(int i10, int i11, Integer num, String str, String str2, String str3, DataRetentionCore dataRetentionCore, Map map, boolean z10, boolean z11, ConsentStatus consentStatus, ConsentStatus consentStatus2, Long l9, Boolean bool, Integer num2, @SerialName("data_declaration") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, Vendor$$serializer.INSTANCE.getDescriptor());
        }
        this.f50520id = i11;
        if ((i10 & 2) == 0) {
            this.iabId = null;
        } else {
            this.iabId = num;
        }
        if ((i10 & 4) == 0) {
            this.extraId = null;
        } else {
            this.extraId = str;
        }
        if ((i10 & 8) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i10 & 16) == 0) {
            this.policyUrl = "";
        } else {
            this.policyUrl = str3;
        }
        if ((i10 & 32) == 0) {
            this.dataRetention = new DataRetentionCore(0, (Map) null, (Map) null, 7, (u) null);
        } else {
            this.dataRetention = dataRetentionCore;
        }
        if ((i10 & 64) == 0) {
            this.urls = p1.emptyMap();
        } else {
            this.urls = map;
        }
        if ((i10 & 128) == 0) {
            this.isLegVendor = false;
        } else {
            this.isLegVendor = z10;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.isExtraVendor = false;
        } else {
            this.isExtraVendor = z11;
        }
        this.status = (i10 & 512) == 0 ? ConsentStatus.PENDING : consentStatus;
        this.legIntStatus = (i10 & 1024) == 0 ? ConsentStatus.UNDEFINED : consentStatus2;
        if ((i10 & 2048) == 0) {
            this.cookieMaxAgeSeconds = null;
        } else {
            this.cookieMaxAgeSeconds = l9;
        }
        if ((i10 & 4096) == 0) {
            this.usesNonCookieAccess = null;
        } else {
            this.usesNonCookieAccess = bool;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.googleAtpId = null;
        } else {
            this.googleAtpId = num2;
        }
        this.dataDeclarations = (i10 & 16384) == 0 ? p0.emptyList() : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.sfbx.appconsent.core.model.Vendor r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.model.Vendor.write$Self(com.sfbx.appconsent.core.model.Vendor, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return this.f50520id;
    }

    public final ConsentStatus component10() {
        return this.status;
    }

    public final ConsentStatus component11() {
        return this.legIntStatus;
    }

    public final Long component12() {
        return this.cookieMaxAgeSeconds;
    }

    public final Boolean component13() {
        return this.usesNonCookieAccess;
    }

    public final Integer component14() {
        return this.googleAtpId;
    }

    public final List<Integer> component15() {
        return this.dataDeclarations;
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

    public final DataRetentionCore component6() {
        return this.dataRetention;
    }

    public final Map<String, VendorUrl> component7() {
        return this.urls;
    }

    public final boolean component8() {
        return this.isLegVendor;
    }

    public final boolean component9() {
        return this.isExtraVendor;
    }

    public final Vendor copy(int i10, Integer num, String str, String name, String policyUrl, DataRetentionCore dataRetention, Map<String, VendorUrl> urls, boolean z10, boolean z11, ConsentStatus status, ConsentStatus legIntStatus, Long l9, Boolean bool, Integer num2, List<Integer> dataDeclarations) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(dataRetention, "dataRetention");
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legIntStatus, "legIntStatus");
        e0.checkNotNullParameter(dataDeclarations, "dataDeclarations");
        return new Vendor(i10, num, str, name, policyUrl, dataRetention, urls, z10, z11, status, legIntStatus, l9, bool, num2, dataDeclarations);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vendor)) {
            return false;
        }
        Vendor vendor = (Vendor) obj;
        return this.f50520id == vendor.f50520id && e0.areEqual(this.iabId, vendor.iabId) && e0.areEqual(this.extraId, vendor.extraId) && e0.areEqual(this.name, vendor.name) && e0.areEqual(this.policyUrl, vendor.policyUrl) && e0.areEqual(this.dataRetention, vendor.dataRetention) && e0.areEqual(this.urls, vendor.urls) && this.isLegVendor == vendor.isLegVendor && this.isExtraVendor == vendor.isExtraVendor && this.status == vendor.status && this.legIntStatus == vendor.legIntStatus && e0.areEqual(this.cookieMaxAgeSeconds, vendor.cookieMaxAgeSeconds) && e0.areEqual(this.usesNonCookieAccess, vendor.usesNonCookieAccess) && e0.areEqual(this.googleAtpId, vendor.googleAtpId) && e0.areEqual(this.dataDeclarations, vendor.dataDeclarations);
    }

    public final Long getCookieMaxAgeSeconds() {
        return this.cookieMaxAgeSeconds;
    }

    public final List<String> getDataCategoriesByLanguage(List<DataCategoryCore> dataCategories, String localByTheme) {
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        e0.checkNotNullParameter(localByTheme, "localByTheme");
        String language = Locale.getDefault().getLanguage();
        if (dataCategories.isEmpty()) {
            return p0.emptyList();
        }
        List<DataCategoryCore> list = dataCategories;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((DataCategoryCore) it.next()).getName().getValues().containsKey(localByTheme)) {
                    ArrayList arrayList = new ArrayList();
                    for (DataCategoryCore dataCategoryCore : list) {
                        String str = dataCategoryCore.getName().getValues().get(localByTheme);
                        if (str == null) {
                            str = (String) y0.first(dataCategoryCore.getName().getValues().values());
                        }
                        v0.addAll(arrayList, o0.listOf(str));
                    }
                    return arrayList;
                }
            }
        }
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((DataCategoryCore) it2.next()).getName().getValues().containsKey(language)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (DataCategoryCore dataCategoryCore2 : list) {
                        String str2 = dataCategoryCore2.getName().getValues().get(language);
                        if (str2 == null) {
                            str2 = (String) y0.first(dataCategoryCore2.getName().getValues().values());
                        }
                        v0.addAll(arrayList2, o0.listOf(str2));
                    }
                    return arrayList2;
                }
            }
        }
        String language2 = Locale.ENGLISH.getLanguage();
        e0.checkNotNullExpressionValue(language2, "ENGLISH.language");
        String lowerCase = language2.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((DataCategoryCore) it3.next()).getName().getValues().containsKey(lowerCase)) {
                    ArrayList arrayList3 = new ArrayList();
                    for (DataCategoryCore dataCategoryCore3 : list) {
                        String str3 = dataCategoryCore3.getName().getValues().get(lowerCase);
                        if (str3 == null) {
                            str3 = (String) y0.first(dataCategoryCore3.getName().getValues().values());
                        }
                        v0.addAll(arrayList3, o0.listOf(str3));
                    }
                    return arrayList3;
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            v0.addAll(arrayList4, o0.listOf(y0.first(((DataCategoryCore) it4.next()).getName().getValues().values())));
        }
        return arrayList4;
    }

    public final List<Integer> getDataDeclarations() {
        return this.dataDeclarations;
    }

    public final DataRetentionCore getDataRetention() {
        return this.dataRetention;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final Integer getGoogleAtpId() {
        return this.googleAtpId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50520id;
    }

    public final ConsentStatus getLegIntStatus() {
        return this.legIntStatus;
    }

    public final String getLegitimateInterestByNoticeLocale(String local) {
        e0.checkNotNullParameter(local, "local");
        String language = Locale.getDefault().getLanguage();
        e0.checkNotNullExpressionValue(language, "getDefault().language");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.urls.isEmpty()) {
            return "";
        }
        if (this.urls.containsKey(local)) {
            VendorUrl vendorUrl = this.urls.get(local);
            e0.checkNotNull(vendorUrl);
            return vendorUrl.getLegintClaimUrl();
        }
        String language2 = Locale.ENGLISH.getLanguage();
        e0.checkNotNullExpressionValue(language2, "ENGLISH.language");
        String lowerCase2 = language2.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.urls.containsKey(lowerCase)) {
            VendorUrl vendorUrl2 = this.urls.get(lowerCase);
            e0.checkNotNull(vendorUrl2);
            return vendorUrl2.getLegintClaimUrl();
        }
        if (!this.urls.containsKey(lowerCase2)) {
            return ((VendorUrl) y0.first(this.urls.values())).getLegintClaimUrl();
        }
        VendorUrl vendorUrl3 = this.urls.get(lowerCase2);
        e0.checkNotNull(vendorUrl3);
        return vendorUrl3.getLegintClaimUrl();
    }

    public final String getName() {
        return this.name;
    }

    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    public final String getPrivacyPolicy(String local) {
        e0.checkNotNullParameter(local, "local");
        String language = Locale.getDefault().getLanguage();
        e0.checkNotNullExpressionValue(language, "getDefault().language");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.urls.isEmpty()) {
            return this.policyUrl;
        }
        if (this.urls.containsKey(local)) {
            VendorUrl vendorUrl = this.urls.get(local);
            e0.checkNotNull(vendorUrl);
            return vendorUrl.getPolicyUrl();
        }
        String language2 = Locale.ENGLISH.getLanguage();
        e0.checkNotNullExpressionValue(language2, "ENGLISH.language");
        String lowerCase2 = language2.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.urls.containsKey(lowerCase)) {
            VendorUrl vendorUrl2 = this.urls.get(lowerCase);
            e0.checkNotNull(vendorUrl2);
            return vendorUrl2.getPolicyUrl();
        }
        if (!this.urls.containsKey(lowerCase2)) {
            return ((VendorUrl) y0.first(this.urls.values())).getPolicyUrl();
        }
        VendorUrl vendorUrl3 = this.urls.get(lowerCase2);
        e0.checkNotNull(vendorUrl3);
        return vendorUrl3.getPolicyUrl();
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final Map<String, VendorUrl> getUrls() {
        return this.urls;
    }

    public final Boolean getUsesNonCookieAccess() {
        return this.usesNonCookieAccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50520id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iF = o2.f(this.urls, (this.dataRetention.hashCode() + o2.e(o2.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.policyUrl)) * 31, 31);
        boolean z10 = this.isLegVendor;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iF + i10) * 31;
        boolean z11 = this.isExtraVendor;
        int iHashCode3 = (this.legIntStatus.hashCode() + ((this.status.hashCode() + ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31)) * 31)) * 31;
        Long l9 = this.cookieMaxAgeSeconds;
        int iHashCode4 = (iHashCode3 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Boolean bool = this.usesNonCookieAccess;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.googleAtpId;
        return this.dataDeclarations.hashCode() + ((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean isExtraVendor() {
        return this.isExtraVendor;
    }

    public final boolean isLegVendor() {
        return this.isLegVendor;
    }

    public final void setLegIntStatus(ConsentStatus consentStatus) {
        e0.checkNotNullParameter(consentStatus, "<set-?>");
        this.legIntStatus = consentStatus;
    }

    public final void setStatus(ConsentStatus consentStatus) {
        e0.checkNotNullParameter(consentStatus, "<set-?>");
        this.status = consentStatus;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Vendor(id=");
        sb2.append(this.f50520id);
        sb2.append(", iabId=");
        sb2.append(this.iabId);
        sb2.append(", extraId=");
        sb2.append(this.extraId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", policyUrl=");
        sb2.append(this.policyUrl);
        sb2.append(", dataRetention=");
        sb2.append(this.dataRetention);
        sb2.append(", urls=");
        sb2.append(this.urls);
        sb2.append(", isLegVendor=");
        sb2.append(this.isLegVendor);
        sb2.append(", isExtraVendor=");
        sb2.append(this.isExtraVendor);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", legIntStatus=");
        sb2.append(this.legIntStatus);
        sb2.append(", cookieMaxAgeSeconds=");
        sb2.append(this.cookieMaxAgeSeconds);
        sb2.append(", usesNonCookieAccess=");
        sb2.append(this.usesNonCookieAccess);
        sb2.append(", googleAtpId=");
        sb2.append(this.googleAtpId);
        sb2.append(", dataDeclarations=");
        return j1.o2.p(sb2, this.dataDeclarations, ')');
    }

    public Vendor(int i10, Integer num, String str, String name, String policyUrl, DataRetentionCore dataRetention, Map<String, VendorUrl> urls, boolean z10, boolean z11, ConsentStatus status, ConsentStatus legIntStatus, Long l9, Boolean bool, Integer num2, List<Integer> dataDeclarations) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(dataRetention, "dataRetention");
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legIntStatus, "legIntStatus");
        e0.checkNotNullParameter(dataDeclarations, "dataDeclarations");
        this.f50520id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.policyUrl = policyUrl;
        this.dataRetention = dataRetention;
        this.urls = urls;
        this.isLegVendor = z10;
        this.isExtraVendor = z11;
        this.status = status;
        this.legIntStatus = legIntStatus;
        this.cookieMaxAgeSeconds = l9;
        this.usesNonCookieAccess = bool;
        this.googleAtpId = num2;
        this.dataDeclarations = dataDeclarations;
    }

    @SerialName("data_declaration")
    public static /* synthetic */ void getDataDeclarations$annotations() {
    }

    public /* synthetic */ Vendor(int i10, Integer num, String str, String str2, String str3, DataRetentionCore dataRetentionCore, Map map, boolean z10, boolean z11, ConsentStatus consentStatus, ConsentStatus consentStatus2, Long l9, Boolean bool, Integer num2, List list, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? "" : str2, (i11 & 16) == 0 ? str3 : "", (i11 & 32) != 0 ? new DataRetentionCore(0, (Map) null, (Map) null, 7, (u) null) : dataRetentionCore, (i11 & 64) != 0 ? p1.emptyMap() : map, (i11 & 128) != 0 ? false : z10, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? z11 : false, (i11 & 512) != 0 ? ConsentStatus.PENDING : consentStatus, (i11 & 1024) != 0 ? ConsentStatus.UNDEFINED : consentStatus2, (i11 & 2048) != 0 ? null : l9, (i11 & 4096) != 0 ? null : bool, (i11 & Segment.SIZE) == 0 ? num2 : null, (i11 & 16384) != 0 ? p0.emptyList() : list);
    }
}
