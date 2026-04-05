package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import e3.g;
import j1.o2;
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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Consent {
    public static final Companion Companion = new Companion(null);
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Consent> serializer() {
            return Consent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Consent() {
        this((String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Integer) null, (String) null, 0, (String) null, (Integer) null, (Map) null, 4095, (u) null);
    }

    public static /* synthetic */ Consent copy$default(Consent consent, String str, List list, List list2, List list3, List list4, List list5, Integer num, String str2, int i10, String str3, Integer num2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = consent.consentString;
        }
        if ((i11 & 2) != 0) {
            list = consent.specialFeatureOptIns;
        }
        if ((i11 & 4) != 0) {
            list2 = consent.purposesConsent;
        }
        if ((i11 & 8) != 0) {
            list3 = consent.purposesLITransparency;
        }
        if ((i11 & 16) != 0) {
            list4 = consent.vendorsConsent;
        }
        if ((i11 & 32) != 0) {
            list5 = consent.vendorLIT;
        }
        if ((i11 & 64) != 0) {
            num = consent.cmpVersion;
        }
        if ((i11 & 128) != 0) {
            str2 = consent.uuid;
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i10 = consent.type;
        }
        if ((i11 & 512) != 0) {
            str3 = consent.cmpHash;
        }
        if ((i11 & 1024) != 0) {
            num2 = consent.cmpHashVersion;
        }
        if ((i11 & 2048) != 0) {
            map = consent.externalIds;
        }
        Integer num3 = num2;
        Map map2 = map;
        int i12 = i10;
        String str4 = str3;
        Integer num4 = num;
        String str5 = str2;
        List list6 = list4;
        List list7 = list5;
        return consent.copy(str, list, list2, list3, list6, list7, num4, str5, i12, str4, num3, map2);
    }

    public static final void write$Self(Consent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.consentString, "")) {
            output.encodeStringElement(serialDesc, 0, self.consentString);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.specialFeatureOptIns, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(IntSerializer.INSTANCE), self.specialFeatureOptIns);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !e0.areEqual(self.purposesConsent, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 2, new ArrayListSerializer(IntSerializer.INSTANCE), self.purposesConsent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !e0.areEqual(self.purposesLITransparency, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(IntSerializer.INSTANCE), self.purposesLITransparency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !e0.areEqual(self.vendorsConsent, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(IntSerializer.INSTANCE), self.vendorsConsent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !e0.areEqual(self.vendorLIT, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 5, new ArrayListSerializer(IntSerializer.INSTANCE), self.vendorLIT);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.cmpVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.cmpVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.uuid != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.uuid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.type != 2) {
            output.encodeIntElement(serialDesc, 8, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.cmpHash != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.cmpHash);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.cmpHashVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.cmpHashVersion);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && e0.areEqual(self.externalIds, p1.emptyMap())) {
            return;
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 11, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.externalIds);
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

    public final Consent copy(String consentString, List<Integer> specialFeatureOptIns, List<Integer> purposesConsent, List<Integer> purposesLITransparency, List<Integer> vendorsConsent, List<Integer> vendorLIT, Integer num, String str, int i10, String str2, Integer num2, Map<String, String> externalIds) {
        e0.checkNotNullParameter(consentString, "consentString");
        e0.checkNotNullParameter(specialFeatureOptIns, "specialFeatureOptIns");
        e0.checkNotNullParameter(purposesConsent, "purposesConsent");
        e0.checkNotNullParameter(purposesLITransparency, "purposesLITransparency");
        e0.checkNotNullParameter(vendorsConsent, "vendorsConsent");
        e0.checkNotNullParameter(vendorLIT, "vendorLIT");
        e0.checkNotNullParameter(externalIds, "externalIds");
        return new Consent(consentString, specialFeatureOptIns, purposesConsent, purposesLITransparency, vendorsConsent, vendorLIT, num, str, i10, str2, num2, externalIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Consent)) {
            return false;
        }
        Consent consent = (Consent) obj;
        return e0.areEqual(this.consentString, consent.consentString) && e0.areEqual(this.specialFeatureOptIns, consent.specialFeatureOptIns) && e0.areEqual(this.purposesConsent, consent.purposesConsent) && e0.areEqual(this.purposesLITransparency, consent.purposesLITransparency) && e0.areEqual(this.vendorsConsent, consent.vendorsConsent) && e0.areEqual(this.vendorLIT, consent.vendorLIT) && e0.areEqual(this.cmpVersion, consent.cmpVersion) && e0.areEqual(this.uuid, consent.uuid) && this.type == consent.type && e0.areEqual(this.cmpHash, consent.cmpHash) && e0.areEqual(this.cmpHashVersion, consent.cmpHashVersion) && e0.areEqual(this.externalIds, consent.externalIds);
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
        StringBuilder sb2 = new StringBuilder("Consent(consentString=");
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

    @f
    public /* synthetic */ Consent(int i10, @SerialName("iab_cs") String str, @SerialName("special_features") List list, @SerialName("purposes") List list2, @SerialName("purposes_legint") List list3, @SerialName("vendors") List list4, @SerialName("vendors_legint") List list5, @SerialName("cmp_version") Integer num, String str2, int i11, @SerialName("cmp_hash") String str3, @SerialName("cmp_hash_version") Integer num2, @SerialName("external_ids") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.consentString = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.specialFeatureOptIns = p0.emptyList();
        } else {
            this.specialFeatureOptIns = list;
        }
        if ((i10 & 4) == 0) {
            this.purposesConsent = p0.emptyList();
        } else {
            this.purposesConsent = list2;
        }
        if ((i10 & 8) == 0) {
            this.purposesLITransparency = p0.emptyList();
        } else {
            this.purposesLITransparency = list3;
        }
        if ((i10 & 16) == 0) {
            this.vendorsConsent = p0.emptyList();
        } else {
            this.vendorsConsent = list4;
        }
        if ((i10 & 32) == 0) {
            this.vendorLIT = p0.emptyList();
        } else {
            this.vendorLIT = list5;
        }
        if ((i10 & 64) == 0) {
            this.cmpVersion = null;
        } else {
            this.cmpVersion = num;
        }
        if ((i10 & 128) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str2;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.type = 2;
        } else {
            this.type = i11;
        }
        if ((i10 & 512) == 0) {
            this.cmpHash = null;
        } else {
            this.cmpHash = str3;
        }
        if ((i10 & 1024) == 0) {
            this.cmpHashVersion = null;
        } else {
            this.cmpHashVersion = num2;
        }
        if ((i10 & 2048) == 0) {
            this.externalIds = p1.emptyMap();
        } else {
            this.externalIds = map;
        }
    }

    public Consent(String consentString, List<Integer> specialFeatureOptIns, List<Integer> purposesConsent, List<Integer> purposesLITransparency, List<Integer> vendorsConsent, List<Integer> vendorLIT, Integer num, String str, int i10, String str2, Integer num2, Map<String, String> externalIds) {
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

    @SerialName("cmp_hash")
    public static /* synthetic */ void getCmpHash$annotations() {
    }

    @SerialName("cmp_hash_version")
    public static /* synthetic */ void getCmpHashVersion$annotations() {
    }

    @SerialName("cmp_version")
    public static /* synthetic */ void getCmpVersion$annotations() {
    }

    @SerialName("iab_cs")
    public static /* synthetic */ void getConsentString$annotations() {
    }

    @SerialName("external_ids")
    public static /* synthetic */ void getExternalIds$annotations() {
    }

    @SerialName("purposes")
    public static /* synthetic */ void getPurposesConsent$annotations() {
    }

    @SerialName("purposes_legint")
    public static /* synthetic */ void getPurposesLITransparency$annotations() {
    }

    @SerialName("special_features")
    public static /* synthetic */ void getSpecialFeatureOptIns$annotations() {
    }

    @SerialName("vendors_legint")
    public static /* synthetic */ void getVendorLIT$annotations() {
    }

    @SerialName("vendors")
    public static /* synthetic */ void getVendorsConsent$annotations() {
    }

    public /* synthetic */ Consent(String str, List list, List list2, List list3, List list4, List list5, Integer num, String str2, int i10, String str3, Integer num2, Map map, int i11, u uVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? p0.emptyList() : list, (i11 & 4) != 0 ? p0.emptyList() : list2, (i11 & 8) != 0 ? p0.emptyList() : list3, (i11 & 16) != 0 ? p0.emptyList() : list4, (i11 & 32) != 0 ? p0.emptyList() : list5, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str2, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 2 : i10, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : num2, (i11 & 2048) != 0 ? p1.emptyMap() : map);
    }
}
