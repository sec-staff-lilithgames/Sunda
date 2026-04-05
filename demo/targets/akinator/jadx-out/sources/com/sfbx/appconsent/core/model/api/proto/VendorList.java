package com.sfbx.appconsent.core.model.api.proto;

import a.b;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.DataCategoryCore$$serializer;
import e3.g;
import j1.o2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.p0;
import uu.p1;
import uu.v0;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class VendorList {
    public static final Companion Companion = new Companion(null);
    private final int cmpVersion;
    private final int consentLifetime;
    private final List<Consentable> consentables;
    private final Map<Integer, DataCategoryCore> dataCategories;
    private final List<Integer> geolocAds;
    private final List<Integer> geolocMarkets;
    private final String googleProvider;
    private final int gvlVersion;
    private final String publisherCC;
    private final String publisherRestrictions;
    private final boolean removeLegintables;
    private final List<Stack> stacks;
    private final int tcfPolicyVersion;
    private final List<Vendor> vendors;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<VendorList> serializer() {
            return VendorList$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VendorList() {
        this(0, (List) null, (Map) null, (List) null, (List) null, 0, 0, (String) null, (String) null, (List) null, (List) null, (String) null, 0, false, 16383, (u) null);
    }

    private final Consentable getPurpose1() {
        Object next;
        Iterator<T> it = this.consentables.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Consentable) next).getId() == 1) {
                break;
            }
        }
        return (Consentable) next;
    }

    public static final void write$Self(VendorList self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.gvlVersion != 0) {
            output.encodeIntElement(serialDesc, 0, self.gvlVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.consentables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(Consentable$$serializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !e0.areEqual(self.dataCategories, p1.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 2, new LinkedHashMapSerializer(IntSerializer.INSTANCE, DataCategoryCore$$serializer.INSTANCE), self.dataCategories);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !e0.areEqual(self.vendors, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(Vendor$$serializer.INSTANCE), self.vendors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !e0.areEqual(self.stacks, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(Stack$$serializer.INSTANCE), self.stacks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.cmpVersion != 0) {
            output.encodeIntElement(serialDesc, 5, self.cmpVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.tcfPolicyVersion != 2) {
            output.encodeIntElement(serialDesc, 6, self.tcfPolicyVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !e0.areEqual(self.publisherCC, "")) {
            output.encodeStringElement(serialDesc, 7, self.publisherCC);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !e0.areEqual(self.publisherRestrictions, "")) {
            output.encodeStringElement(serialDesc, 8, self.publisherRestrictions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !e0.areEqual(self.geolocAds, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 9, new ArrayListSerializer(IntSerializer.INSTANCE), self.geolocAds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !e0.areEqual(self.geolocMarkets, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 10, new ArrayListSerializer(IntSerializer.INSTANCE), self.geolocMarkets);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.googleProvider != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.googleProvider);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.consentLifetime != 0) {
            output.encodeIntElement(serialDesc, 12, self.consentLifetime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.removeLegintables) {
            output.encodeBooleanElement(serialDesc, 13, self.removeLegintables);
        }
    }

    public final int component1() {
        return this.gvlVersion;
    }

    public final List<Integer> component10() {
        return this.geolocAds;
    }

    public final List<Integer> component11() {
        return this.geolocMarkets;
    }

    public final String component12() {
        return this.googleProvider;
    }

    public final int component13() {
        return this.consentLifetime;
    }

    public final boolean component14() {
        return this.removeLegintables;
    }

    public final List<Consentable> component2() {
        return this.consentables;
    }

    public final Map<Integer, DataCategoryCore> component3() {
        return this.dataCategories;
    }

    public final List<Vendor> component4() {
        return this.vendors;
    }

    public final List<Stack> component5() {
        return this.stacks;
    }

    public final int component6() {
        return this.cmpVersion;
    }

    public final int component7() {
        return this.tcfPolicyVersion;
    }

    public final String component8() {
        return this.publisherCC;
    }

    public final String component9() {
        return this.publisherRestrictions;
    }

    public final VendorList copy(int i10, List<Consentable> consentables, Map<Integer, DataCategoryCore> dataCategories, List<Vendor> vendors, List<Stack> stacks, int i11, int i12, String publisherCC, String publisherRestrictions, List<Integer> geolocAds, List<Integer> geolocMarkets, String str, int i13, boolean z10) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(publisherCC, "publisherCC");
        e0.checkNotNullParameter(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullParameter(geolocAds, "geolocAds");
        e0.checkNotNullParameter(geolocMarkets, "geolocMarkets");
        return new VendorList(i10, consentables, dataCategories, vendors, stacks, i11, i12, publisherCC, publisherRestrictions, geolocAds, geolocMarkets, str, i13, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorList)) {
            return false;
        }
        VendorList vendorList = (VendorList) obj;
        return this.gvlVersion == vendorList.gvlVersion && e0.areEqual(this.consentables, vendorList.consentables) && e0.areEqual(this.dataCategories, vendorList.dataCategories) && e0.areEqual(this.vendors, vendorList.vendors) && e0.areEqual(this.stacks, vendorList.stacks) && this.cmpVersion == vendorList.cmpVersion && this.tcfPolicyVersion == vendorList.tcfPolicyVersion && e0.areEqual(this.publisherCC, vendorList.publisherCC) && e0.areEqual(this.publisherRestrictions, vendorList.publisherRestrictions) && e0.areEqual(this.geolocAds, vendorList.geolocAds) && e0.areEqual(this.geolocMarkets, vendorList.geolocMarkets) && e0.areEqual(this.googleProvider, vendorList.googleProvider) && this.consentLifetime == vendorList.consentLifetime && this.removeLegintables == vendorList.removeLegintables;
    }

    public final int getCmpVersion() {
        return this.cmpVersion;
    }

    public final int getConsentLifetime() {
        return this.consentLifetime;
    }

    public final List<Consentable> getConsentables() {
        return this.consentables;
    }

    public final Map<Integer, DataCategoryCore> getDataCategories() {
        return this.dataCategories;
    }

    public final List<Consentable> getExternalPurposes() {
        List<Consentable> list = this.consentables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Consentable) obj).isExtraPurpose()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Consentable> getFeaturesAndSpecialFeaturesNotIntoStacks() {
        List<Integer> purposesIdFromStacks = getPurposesIdFromStacks();
        List<Consentable> list = this.consentables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!purposesIdFromStacks.contains(Integer.valueOf(((Consentable) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Consentable consentable = (Consentable) obj2;
            if (consentable.getType() == ConsentableType.FEATURE.getValue() || consentable.getType() == ConsentableType.SPECIAL_FEATURE.getValue()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
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

    public final String getPurpose1Name(String appconsentThemeLanguage) {
        e0.checkNotNullParameter(appconsentThemeLanguage, "appconsentThemeLanguage");
        Consentable purpose1 = getPurpose1();
        if (purpose1 != null) {
            return purpose1.getNameAsString(appconsentThemeLanguage);
        }
        return null;
    }

    public final List<Consentable> getPurposesExceptPurpose1AndPurposesFromStacksOtherThanStack1() {
        List<Stack> stacksExceptStack1 = getStacksExceptStack1();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = stacksExceptStack1.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, ((Stack) it.next()).getConsentables());
        }
        List<Consentable> list = this.consentables;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Consentable consentable = (Consentable) obj;
            if (!arrayList.contains(Integer.valueOf(consentable.getId())) && consentable.getId() != 1) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((Consentable) obj2).isPurposeFromIab()) {
                arrayList3.add(obj2);
            }
        }
        return y0.sortedWith(arrayList3, new Comparator() { // from class: com.sfbx.appconsent.core.model.api.proto.VendorList$getPurposesExceptPurpose1AndPurposesFromStacksOtherThanStack1$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(Integer.valueOf(((Consentable) t10).getId()), Integer.valueOf(((Consentable) t11).getId()));
            }
        });
    }

    public final List<Integer> getPurposesIdFromStacks() {
        List<Stack> list = this.stacks;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, ((Stack) it.next()).getConsentables());
        }
        return arrayList;
    }

    public final boolean getRemoveLegintables() {
        return this.removeLegintables;
    }

    public final List<Consentable> getSpecialPurposes() {
        List<Consentable> list = this.consentables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Consentable) obj).isSpecialPurposeFromIab()) {
                arrayList.add(obj);
            }
        }
        return y0.sortedWith(arrayList, new Comparator() { // from class: com.sfbx.appconsent.core.model.api.proto.VendorList$getSpecialPurposes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(Integer.valueOf(((Consentable) t10).getId()), Integer.valueOf(((Consentable) t11).getId()));
            }
        });
    }

    public final String getStack1Name(String appconsentThemeLanguage) {
        Object next;
        e0.checkNotNullParameter(appconsentThemeLanguage, "appconsentThemeLanguage");
        Iterator<T> it = this.stacks.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Stack) next).getId() == 1) {
                break;
            }
        }
        Stack stack = (Stack) next;
        if (stack != null) {
            return stack.getNameAsString(appconsentThemeLanguage);
        }
        return null;
    }

    public final List<Stack> getStacks() {
        return this.stacks;
    }

    public final List<Stack> getStacksExceptStack1() {
        List<Stack> list = this.stacks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Stack) obj).getId() != 1) {
                arrayList.add(obj);
            }
        }
        return y0.sortedWith(arrayList, new Comparator() { // from class: com.sfbx.appconsent.core.model.api.proto.VendorList$getStacksExceptStack1$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(Integer.valueOf(((Stack) t10).getId()), Integer.valueOf(((Stack) t11).getId()));
            }
        });
    }

    public final int getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final List<Vendor> getVendors() {
        return this.vendors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC = o2.c(o2.c(p0.o2.e(p0.o2.e(g.d(this.tcfPolicyVersion, g.d(this.cmpVersion, o2.c(o2.c(p0.o2.f(this.dataCategories, o2.c(Integer.hashCode(this.gvlVersion) * 31, 31, this.consentables), 31), 31, this.vendors), 31, this.stacks), 31), 31), 31, this.publisherCC), 31, this.publisherRestrictions), 31, this.geolocAds), 31, this.geolocMarkets);
        String str = this.googleProvider;
        int iD = g.d(this.consentLifetime, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z10 = this.removeLegintables;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iD + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorList(gvlVersion=");
        sb2.append(this.gvlVersion);
        sb2.append(", consentables=");
        sb2.append(this.consentables);
        sb2.append(", dataCategories=");
        sb2.append(this.dataCategories);
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
        return b.p(sb2, this.removeLegintables, ')');
    }

    @f
    public /* synthetic */ VendorList(int i10, @SerialName("iab_gvl") int i11, List list, @SerialName("data_categories") Map map, List list2, List list3, @SerialName("cmp_version") int i12, @SerialName("tcf_policy_version") int i13, @SerialName("publisher_cc") String str, @SerialName("publisher_restrictions") String str2, @SerialName("geoloc_ad") List list4, @SerialName("geoloc_market") List list5, @SerialName("google_providers") String str3, @SerialName("consent_lifetime") int i14, @SerialName("remove_legintables") boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.gvlVersion = 0;
        } else {
            this.gvlVersion = i11;
        }
        if ((i10 & 2) == 0) {
            this.consentables = p0.emptyList();
        } else {
            this.consentables = list;
        }
        if ((i10 & 4) == 0) {
            this.dataCategories = p1.emptyMap();
        } else {
            this.dataCategories = map;
        }
        if ((i10 & 8) == 0) {
            this.vendors = p0.emptyList();
        } else {
            this.vendors = list2;
        }
        if ((i10 & 16) == 0) {
            this.stacks = p0.emptyList();
        } else {
            this.stacks = list3;
        }
        if ((i10 & 32) == 0) {
            this.cmpVersion = 0;
        } else {
            this.cmpVersion = i12;
        }
        if ((i10 & 64) == 0) {
            this.tcfPolicyVersion = 2;
        } else {
            this.tcfPolicyVersion = i13;
        }
        if ((i10 & 128) == 0) {
            this.publisherCC = "";
        } else {
            this.publisherCC = str;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.publisherRestrictions = "";
        } else {
            this.publisherRestrictions = str2;
        }
        if ((i10 & 512) == 0) {
            this.geolocAds = p0.emptyList();
        } else {
            this.geolocAds = list4;
        }
        if ((i10 & 1024) == 0) {
            this.geolocMarkets = p0.emptyList();
        } else {
            this.geolocMarkets = list5;
        }
        if ((i10 & 2048) == 0) {
            this.googleProvider = null;
        } else {
            this.googleProvider = str3;
        }
        if ((i10 & 4096) == 0) {
            this.consentLifetime = 0;
        } else {
            this.consentLifetime = i14;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.removeLegintables = false;
        } else {
            this.removeLegintables = z10;
        }
    }

    public VendorList(int i10, List<Consentable> consentables, Map<Integer, DataCategoryCore> dataCategories, List<Vendor> vendors, List<Stack> stacks, int i11, int i12, String publisherCC, String publisherRestrictions, List<Integer> geolocAds, List<Integer> geolocMarkets, String str, int i13, boolean z10) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(publisherCC, "publisherCC");
        e0.checkNotNullParameter(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullParameter(geolocAds, "geolocAds");
        e0.checkNotNullParameter(geolocMarkets, "geolocMarkets");
        this.gvlVersion = i10;
        this.consentables = consentables;
        this.dataCategories = dataCategories;
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
    }

    @SerialName("cmp_version")
    public static /* synthetic */ void getCmpVersion$annotations() {
    }

    @SerialName("consent_lifetime")
    public static /* synthetic */ void getConsentLifetime$annotations() {
    }

    @SerialName("data_categories")
    public static /* synthetic */ void getDataCategories$annotations() {
    }

    @SerialName("geoloc_ad")
    public static /* synthetic */ void getGeolocAds$annotations() {
    }

    @SerialName("geoloc_market")
    public static /* synthetic */ void getGeolocMarkets$annotations() {
    }

    @SerialName("google_providers")
    public static /* synthetic */ void getGoogleProvider$annotations() {
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

    public /* synthetic */ VendorList(int i10, List list, Map map, List list2, List list3, int i11, int i12, String str, String str2, List list4, List list5, String str3, int i13, boolean z10, int i14, u uVar) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? p0.emptyList() : list, (i14 & 4) != 0 ? p1.emptyMap() : map, (i14 & 8) != 0 ? p0.emptyList() : list2, (i14 & 16) != 0 ? p0.emptyList() : list3, (i14 & 32) != 0 ? 0 : i11, (i14 & 64) != 0 ? 2 : i12, (i14 & 128) != 0 ? "" : str, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? str2 : "", (i14 & 512) != 0 ? p0.emptyList() : list4, (i14 & 1024) != 0 ? p0.emptyList() : list5, (i14 & 2048) != 0 ? null : str3, (i14 & 4096) != 0 ? 0 : i13, (i14 & Segment.SIZE) != 0 ? false : z10);
    }
}
