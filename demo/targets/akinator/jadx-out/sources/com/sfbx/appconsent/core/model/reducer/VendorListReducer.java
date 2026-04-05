package com.sfbx.appconsent.core.model.reducer;

import a.b;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e3.g;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class VendorListReducer {
    public static final Companion Companion = new Companion(null);
    private final int cmpVersion;
    private List<Integer> geolocAds;
    private List<Integer> geolocMarkets;
    private final String googleProviders;
    private final int gvlVersion;
    private final boolean isServiceSpecific;
    private final String publisherCC;
    private final String publisherRestrictions;
    private final boolean removeLegintables;
    private final int tcfPolicyVersion;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<VendorListReducer> serializer() {
            return VendorListReducer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VendorListReducer() {
        this(false, 0, 0, 0, (String) null, (String) null, (List) null, (List) null, (String) null, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (u) null);
    }

    public static /* synthetic */ VendorListReducer copy$default(VendorListReducer vendorListReducer, boolean z10, int i10, int i11, int i12, String str, String str2, List list, List list2, String str3, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = vendorListReducer.isServiceSpecific;
        }
        if ((i13 & 2) != 0) {
            i10 = vendorListReducer.gvlVersion;
        }
        if ((i13 & 4) != 0) {
            i11 = vendorListReducer.cmpVersion;
        }
        if ((i13 & 8) != 0) {
            i12 = vendorListReducer.tcfPolicyVersion;
        }
        if ((i13 & 16) != 0) {
            str = vendorListReducer.publisherCC;
        }
        if ((i13 & 32) != 0) {
            str2 = vendorListReducer.publisherRestrictions;
        }
        if ((i13 & 64) != 0) {
            list = vendorListReducer.geolocAds;
        }
        if ((i13 & 128) != 0) {
            list2 = vendorListReducer.geolocMarkets;
        }
        if ((i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str3 = vendorListReducer.googleProviders;
        }
        if ((i13 & 512) != 0) {
            z11 = vendorListReducer.removeLegintables;
        }
        String str4 = str3;
        boolean z12 = z11;
        List list3 = list;
        List list4 = list2;
        String str5 = str;
        String str6 = str2;
        return vendorListReducer.copy(z10, i10, i11, i12, str5, str6, list3, list4, str4, z12);
    }

    public static final void write$Self(VendorListReducer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isServiceSpecific) {
            output.encodeBooleanElement(serialDesc, 0, self.isServiceSpecific);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gvlVersion != 0) {
            output.encodeIntElement(serialDesc, 1, self.gvlVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cmpVersion != 0) {
            output.encodeIntElement(serialDesc, 2, self.cmpVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.tcfPolicyVersion != 0) {
            output.encodeIntElement(serialDesc, 3, self.tcfPolicyVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !e0.areEqual(self.publisherCC, "")) {
            output.encodeStringElement(serialDesc, 4, self.publisherCC);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !e0.areEqual(self.publisherRestrictions, "")) {
            output.encodeStringElement(serialDesc, 5, self.publisherRestrictions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !e0.areEqual(self.geolocAds, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 6, new ArrayListSerializer(IntSerializer.INSTANCE), self.geolocAds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !e0.areEqual(self.geolocMarkets, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 7, new ArrayListSerializer(IntSerializer.INSTANCE), self.geolocMarkets);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !e0.areEqual(self.googleProviders, "")) {
            output.encodeStringElement(serialDesc, 8, self.googleProviders);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.removeLegintables) {
            output.encodeBooleanElement(serialDesc, 9, self.removeLegintables);
        }
    }

    public final boolean component1() {
        return this.isServiceSpecific;
    }

    public final boolean component10() {
        return this.removeLegintables;
    }

    public final int component2() {
        return this.gvlVersion;
    }

    public final int component3() {
        return this.cmpVersion;
    }

    public final int component4() {
        return this.tcfPolicyVersion;
    }

    public final String component5() {
        return this.publisherCC;
    }

    public final String component6() {
        return this.publisherRestrictions;
    }

    public final List<Integer> component7() {
        return this.geolocAds;
    }

    public final List<Integer> component8() {
        return this.geolocMarkets;
    }

    public final String component9() {
        return this.googleProviders;
    }

    public final VendorListReducer copy(boolean z10, int i10, int i11, int i12, String publisherCC, String publisherRestrictions, List<Integer> geolocAds, List<Integer> geolocMarkets, String googleProviders, boolean z11) {
        e0.checkNotNullParameter(publisherCC, "publisherCC");
        e0.checkNotNullParameter(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullParameter(geolocAds, "geolocAds");
        e0.checkNotNullParameter(geolocMarkets, "geolocMarkets");
        e0.checkNotNullParameter(googleProviders, "googleProviders");
        return new VendorListReducer(z10, i10, i11, i12, publisherCC, publisherRestrictions, geolocAds, geolocMarkets, googleProviders, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorListReducer)) {
            return false;
        }
        VendorListReducer vendorListReducer = (VendorListReducer) obj;
        return this.isServiceSpecific == vendorListReducer.isServiceSpecific && this.gvlVersion == vendorListReducer.gvlVersion && this.cmpVersion == vendorListReducer.cmpVersion && this.tcfPolicyVersion == vendorListReducer.tcfPolicyVersion && e0.areEqual(this.publisherCC, vendorListReducer.publisherCC) && e0.areEqual(this.publisherRestrictions, vendorListReducer.publisherRestrictions) && e0.areEqual(this.geolocAds, vendorListReducer.geolocAds) && e0.areEqual(this.geolocMarkets, vendorListReducer.geolocMarkets) && e0.areEqual(this.googleProviders, vendorListReducer.googleProviders) && this.removeLegintables == vendorListReducer.removeLegintables;
    }

    public final int getCmpVersion() {
        return this.cmpVersion;
    }

    public final List<Integer> getGeolocAds() {
        return this.geolocAds;
    }

    public final List<Integer> getGeolocMarkets() {
        return this.geolocMarkets;
    }

    public final String getGoogleProviders() {
        return this.googleProviders;
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

    public final int getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z10 = this.isServiceSpecific;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iE = o2.e(j1.o2.c(j1.o2.c(o2.e(o2.e(g.d(this.tcfPolicyVersion, g.d(this.cmpVersion, g.d(this.gvlVersion, r02 * 31, 31), 31), 31), 31, this.publisherCC), 31, this.publisherRestrictions), 31, this.geolocAds), 31, this.geolocMarkets), 31, this.googleProviders);
        boolean z11 = this.removeLegintables;
        return iE + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isServiceSpecific() {
        return this.isServiceSpecific;
    }

    public final void setGeolocAds(List<Integer> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.geolocAds = list;
    }

    public final void setGeolocMarkets(List<Integer> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.geolocMarkets = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorListReducer(isServiceSpecific=");
        sb2.append(this.isServiceSpecific);
        sb2.append(", gvlVersion=");
        sb2.append(this.gvlVersion);
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
        sb2.append(", googleProviders=");
        sb2.append(this.googleProviders);
        sb2.append(", removeLegintables=");
        return b.p(sb2, this.removeLegintables, ')');
    }

    @f
    public /* synthetic */ VendorListReducer(int i10, @SerialName("is_service_specific") boolean z10, @SerialName("iab_gvl") int i11, @SerialName("cmp_version") int i12, @SerialName("tcf_policy_version") int i13, @SerialName("publisher_cc") String str, @SerialName("publisher_restrictions") String str2, @SerialName("geoloc_ad") List list, @SerialName("geoloc_market") List list2, @SerialName("google_providers") String str3, @SerialName("remove_legintables") boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.isServiceSpecific = false;
        } else {
            this.isServiceSpecific = z10;
        }
        if ((i10 & 2) == 0) {
            this.gvlVersion = 0;
        } else {
            this.gvlVersion = i11;
        }
        if ((i10 & 4) == 0) {
            this.cmpVersion = 0;
        } else {
            this.cmpVersion = i12;
        }
        if ((i10 & 8) == 0) {
            this.tcfPolicyVersion = 0;
        } else {
            this.tcfPolicyVersion = i13;
        }
        if ((i10 & 16) == 0) {
            this.publisherCC = "";
        } else {
            this.publisherCC = str;
        }
        if ((i10 & 32) == 0) {
            this.publisherRestrictions = "";
        } else {
            this.publisherRestrictions = str2;
        }
        if ((i10 & 64) == 0) {
            this.geolocAds = p0.emptyList();
        } else {
            this.geolocAds = list;
        }
        if ((i10 & 128) == 0) {
            this.geolocMarkets = p0.emptyList();
        } else {
            this.geolocMarkets = list2;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.googleProviders = "";
        } else {
            this.googleProviders = str3;
        }
        if ((i10 & 512) == 0) {
            this.removeLegintables = false;
        } else {
            this.removeLegintables = z11;
        }
    }

    public VendorListReducer(boolean z10, int i10, int i11, int i12, String publisherCC, String publisherRestrictions, List<Integer> geolocAds, List<Integer> geolocMarkets, String googleProviders, boolean z11) {
        e0.checkNotNullParameter(publisherCC, "publisherCC");
        e0.checkNotNullParameter(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullParameter(geolocAds, "geolocAds");
        e0.checkNotNullParameter(geolocMarkets, "geolocMarkets");
        e0.checkNotNullParameter(googleProviders, "googleProviders");
        this.isServiceSpecific = z10;
        this.gvlVersion = i10;
        this.cmpVersion = i11;
        this.tcfPolicyVersion = i12;
        this.publisherCC = publisherCC;
        this.publisherRestrictions = publisherRestrictions;
        this.geolocAds = geolocAds;
        this.geolocMarkets = geolocMarkets;
        this.googleProviders = googleProviders;
        this.removeLegintables = z11;
    }

    @SerialName("cmp_version")
    public static /* synthetic */ void getCmpVersion$annotations() {
    }

    @SerialName("geoloc_ad")
    public static /* synthetic */ void getGeolocAds$annotations() {
    }

    @SerialName("geoloc_market")
    public static /* synthetic */ void getGeolocMarkets$annotations() {
    }

    @SerialName("google_providers")
    public static /* synthetic */ void getGoogleProviders$annotations() {
    }

    @SerialName("iab_gvl")
    public static /* synthetic */ void getGvlVersion$annotations() {
    }

    @SerialName("publisher_cc")
    public static /* synthetic */ void getPublisherCC$annotations() {
    }

    @SerialName("publisher_restrictions")
    public static /* synthetic */ void getPublisherRestrictions$annotations() {
    }

    @SerialName("remove_legintables")
    public static /* synthetic */ void getRemoveLegintables$annotations() {
    }

    @SerialName("tcf_policy_version")
    public static /* synthetic */ void getTcfPolicyVersion$annotations() {
    }

    @SerialName("is_service_specific")
    public static /* synthetic */ void isServiceSpecific$annotations() {
    }

    public /* synthetic */ VendorListReducer(boolean z10, int i10, int i11, int i12, String str, String str2, List list, List list2, String str3, boolean z11, int i13, u uVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? "" : str2, (i13 & 64) != 0 ? p0.emptyList() : list, (i13 & 128) != 0 ? p0.emptyList() : list2, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? "" : str3, (i13 & 512) != 0 ? false : z11);
    }
}
