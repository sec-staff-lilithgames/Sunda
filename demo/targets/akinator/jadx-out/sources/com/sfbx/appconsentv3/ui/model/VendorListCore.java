package com.sfbx.appconsentv3.ui.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.model.DataCategoryCore;
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
public final class VendorListCore {
    private final int cmpVersion;
    private final int consentLifetime;
    private final List<ConsentableCore> consentables;
    private final Map<Integer, DataCategoryCore> dataCategories;
    private final List<Integer> geolocAds;
    private final List<Integer> geolocMarkets;
    private final String googleProvider;
    private final int gvlVersion;
    private final String publisherCC;
    private final String publisherRestrictions;
    private final boolean removeLegintables;
    private final List<StackCore> stacks;
    private final int tcfPolicyVersion;
    private final List<VendorCore> vendors;

    public VendorListCore() {
        this(0, null, null, null, 0, 0, null, null, null, null, null, 0, false, null, 16383, null);
    }

    public final int component1() {
        return this.gvlVersion;
    }

    public final List<Integer> component10() {
        return this.geolocMarkets;
    }

    public final String component11() {
        return this.googleProvider;
    }

    public final int component12() {
        return this.consentLifetime;
    }

    public final boolean component13() {
        return this.removeLegintables;
    }

    public final Map<Integer, DataCategoryCore> component14() {
        return this.dataCategories;
    }

    public final List<ConsentableCore> component2() {
        return this.consentables;
    }

    public final List<VendorCore> component3() {
        return this.vendors;
    }

    public final List<StackCore> component4() {
        return this.stacks;
    }

    public final int component5() {
        return this.cmpVersion;
    }

    public final int component6() {
        return this.tcfPolicyVersion;
    }

    public final String component7() {
        return this.publisherCC;
    }

    public final String component8() {
        return this.publisherRestrictions;
    }

    public final List<Integer> component9() {
        return this.geolocAds;
    }

    public final VendorListCore copy(int i10, List<ConsentableCore> consentables, List<VendorCore> vendors, List<StackCore> stacks, int i11, int i12, String publisherCC, String publisherRestrictions, List<Integer> geolocAds, List<Integer> geolocMarkets, String str, int i13, boolean z10, Map<Integer, DataCategoryCore> dataCategories) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(publisherCC, "publisherCC");
        e0.checkNotNullParameter(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullParameter(geolocAds, "geolocAds");
        e0.checkNotNullParameter(geolocMarkets, "geolocMarkets");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        return new VendorListCore(i10, consentables, vendors, stacks, i11, i12, publisherCC, publisherRestrictions, geolocAds, geolocMarkets, str, i13, z10, dataCategories);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorListCore)) {
            return false;
        }
        VendorListCore vendorListCore = (VendorListCore) obj;
        return this.gvlVersion == vendorListCore.gvlVersion && e0.areEqual(this.consentables, vendorListCore.consentables) && e0.areEqual(this.vendors, vendorListCore.vendors) && e0.areEqual(this.stacks, vendorListCore.stacks) && this.cmpVersion == vendorListCore.cmpVersion && this.tcfPolicyVersion == vendorListCore.tcfPolicyVersion && e0.areEqual(this.publisherCC, vendorListCore.publisherCC) && e0.areEqual(this.publisherRestrictions, vendorListCore.publisherRestrictions) && e0.areEqual(this.geolocAds, vendorListCore.geolocAds) && e0.areEqual(this.geolocMarkets, vendorListCore.geolocMarkets) && e0.areEqual(this.googleProvider, vendorListCore.googleProvider) && this.consentLifetime == vendorListCore.consentLifetime && this.removeLegintables == vendorListCore.removeLegintables && e0.areEqual(this.dataCategories, vendorListCore.dataCategories);
    }

    public final int getCmpVersion() {
        return this.cmpVersion;
    }

    public final int getConsentLifetime() {
        return this.consentLifetime;
    }

    public final List<ConsentableCore> getConsentables() {
        return this.consentables;
    }

    public final Map<Integer, DataCategoryCore> getDataCategories() {
        return this.dataCategories;
    }

    public final List<Integer> getGeolocAds() {
        return this.geolocAds;
    }

    public final List<Integer> getGeolocMarkets() {
        return this.geolocMarkets;
    }

    public final String getGoogleProvider() {
        return this.googleProvider;
    }

    public final int getGvlVersion() {
        return this.gvlVersion;
    }

    public final String getPublisherCC() {
        return this.publisherCC;
    }

    public final String getPublisherRestrictions() {
        return this.publisherRestrictions;
    }

    public final boolean getRemoveLegintables() {
        return this.removeLegintables;
    }

    public final List<StackCore> getStacks() {
        return this.stacks;
    }

    public final int getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final List<VendorCore> getVendors() {
        return this.vendors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC = o2.c(o2.c(p0.o2.e(p0.o2.e(g.d(this.tcfPolicyVersion, g.d(this.cmpVersion, o2.c(o2.c(o2.c(Integer.hashCode(this.gvlVersion) * 31, 31, this.consentables), 31, this.vendors), 31, this.stacks), 31), 31), 31, this.publisherCC), 31, this.publisherRestrictions), 31, this.geolocAds), 31, this.geolocMarkets);
        String str = this.googleProvider;
        int iD = g.d(this.consentLifetime, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z10 = this.removeLegintables;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.dataCategories.hashCode() + ((iD + i10) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorListCore(gvlVersion=");
        sb2.append(this.gvlVersion);
        sb2.append(", consentables=");
        sb2.append(this.consentables);
        sb2.append(", vendors=");
        sb2.append(this.vendors);
        sb2.append(", stacks=");
        sb2.append(this.stacks);
        sb2.append(", cmpVersion=");
        sb2.append(this.cmpVersion);
        sb2.append(", tcfPolicyVersion=");
        sb2.append(this.tcfPolicyVersion);
        sb2.append(", publisherCC=");
        sb2.append(this.publisherCC);
        sb2.append(", publisherRestrictions=");
        sb2.append(this.publisherRestrictions);
        sb2.append(", geolocAds=");
        sb2.append(this.geolocAds);
        sb2.append(", geolocMarkets=");
        sb2.append(this.geolocMarkets);
        sb2.append(", googleProvider=");
        sb2.append(this.googleProvider);
        sb2.append(", consentLifetime=");
        sb2.append(this.consentLifetime);
        sb2.append(", removeLegintables=");
        sb2.append(this.removeLegintables);
        sb2.append(", dataCategories=");
        return o2.q(sb2, this.dataCategories, ')');
    }

    public VendorListCore(int i10, List<ConsentableCore> consentables, List<VendorCore> vendors, List<StackCore> stacks, int i11, int i12, String publisherCC, String publisherRestrictions, List<Integer> geolocAds, List<Integer> geolocMarkets, String str, int i13, boolean z10, Map<Integer, DataCategoryCore> dataCategories) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(publisherCC, "publisherCC");
        e0.checkNotNullParameter(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullParameter(geolocAds, "geolocAds");
        e0.checkNotNullParameter(geolocMarkets, "geolocMarkets");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        this.gvlVersion = i10;
        this.consentables = consentables;
        this.vendors = vendors;
        this.stacks = stacks;
        this.cmpVersion = i11;
        this.tcfPolicyVersion = i12;
        this.publisherCC = publisherCC;
        this.publisherRestrictions = publisherRestrictions;
        this.geolocAds = geolocAds;
        this.geolocMarkets = geolocMarkets;
        this.googleProvider = str;
        this.consentLifetime = i13;
        this.removeLegintables = z10;
        this.dataCategories = dataCategories;
    }

    public /* synthetic */ VendorListCore(int i10, List list, List list2, List list3, int i11, int i12, String str, String str2, List list4, List list5, String str3, int i13, boolean z10, Map map, int i14, u uVar) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? p0.emptyList() : list, (i14 & 4) != 0 ? p0.emptyList() : list2, (i14 & 8) != 0 ? p0.emptyList() : list3, (i14 & 16) != 0 ? 0 : i11, (i14 & 32) != 0 ? 2 : i12, (i14 & 64) != 0 ? "" : str, (i14 & 128) == 0 ? str2 : "", (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p0.emptyList() : list4, (i14 & 512) != 0 ? p0.emptyList() : list5, (i14 & 1024) != 0 ? null : str3, (i14 & 2048) != 0 ? 0 : i13, (i14 & 4096) == 0 ? z10 : false, (i14 & Segment.SIZE) != 0 ? p1.emptyMap() : map);
    }
}
