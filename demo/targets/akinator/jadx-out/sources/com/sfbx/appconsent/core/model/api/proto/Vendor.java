package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.model.ConsentStatus;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Vendor {
    public static final Companion Companion = new Companion(null);
    private final List<Integer> consentables;
    private final Long cookieMaxAgeSeconds;
    private final List<Integer> dataDeclaration;
    private final DataRetention dataRetention;
    private final String extraId;
    private final List<Integer> flexibles;
    private final Integer googleAtpId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50524id;
    private final ConsentStatus legintStatus;
    private final List<Integer> legintables;
    private final String name;
    private final String policyUrl;
    private final ConsentStatus status;
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
    public /* synthetic */ Vendor(int i10, int i11, @SerialName("iab_id") Integer num, @SerialName("extra_id") String str, String str2, @SerialName("policy_url") String str3, Map map, DataRetention dataRetention, List list, List list2, List list3, ConsentStatus consentStatus, ConsentStatus consentStatus2, Long l9, Boolean bool, @SerialName("google_atp_id") Integer num2, @SerialName("data_declaration") List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i10 & 25)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 25, Vendor$$serializer.INSTANCE.getDescriptor());
        }
        this.f50524id = i11;
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
        this.name = str2;
        this.policyUrl = str3;
        if ((i10 & 32) == 0) {
            this.urls = p1.emptyMap();
        } else {
            this.urls = map;
        }
        if ((i10 & 64) == 0) {
            this.dataRetention = new DataRetention(0, (Map) null, (Map) null, 7, (u) null);
        } else {
            this.dataRetention = dataRetention;
        }
        if ((i10 & 128) == 0) {
            this.consentables = p0.emptyList();
        } else {
            this.consentables = list;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.legintables = p0.emptyList();
        } else {
            this.legintables = list2;
        }
        if ((i10 & 512) == 0) {
            this.flexibles = p0.emptyList();
        } else {
            this.flexibles = list3;
        }
        if ((i10 & 1024) == 0) {
            this.status = ConsentStatus.PENDING;
        } else {
            this.status = consentStatus;
        }
        if ((i10 & 2048) == 0) {
            this.legintStatus = ConsentStatus.PENDING;
        } else {
            this.legintStatus = consentStatus2;
        }
        if ((i10 & 4096) == 0) {
            this.cookieMaxAgeSeconds = null;
        } else {
            this.cookieMaxAgeSeconds = l9;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.usesNonCookieAccess = null;
        } else {
            this.usesNonCookieAccess = bool;
        }
        if ((i10 & 16384) == 0) {
            this.googleAtpId = null;
        } else {
            this.googleAtpId = num2;
        }
        this.dataDeclaration = (i10 & 32768) == 0 ? p0.emptyList() : list4;
    }

    public static final void write$Self(Vendor self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50524id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.extraId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.extraId);
        }
        output.encodeStringElement(serialDesc, 3, self.name);
        output.encodeStringElement(serialDesc, 4, self.policyUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !e0.areEqual(self.urls, p1.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 5, new LinkedHashMapSerializer(StringSerializer.INSTANCE, VendorUrl$$serializer.INSTANCE), self.urls);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !e0.areEqual(self.dataRetention, new DataRetention(0, (Map) null, (Map) null, 7, (u) null))) {
            output.encodeSerializableElement(serialDesc, 6, DataRetention$$serializer.INSTANCE, self.dataRetention);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !e0.areEqual(self.consentables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 7, new ArrayListSerializer(IntSerializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !e0.areEqual(self.legintables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 8, new ArrayListSerializer(IntSerializer.INSTANCE), self.legintables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !e0.areEqual(self.flexibles, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 9, new ArrayListSerializer(IntSerializer.INSTANCE), self.flexibles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.status != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 10, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.legintStatus != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 11, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.legintStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.cookieMaxAgeSeconds != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, LongSerializer.INSTANCE, self.cookieMaxAgeSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.usesNonCookieAccess != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, self.usesNonCookieAccess);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.googleAtpId != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, IntSerializer.INSTANCE, self.googleAtpId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && e0.areEqual(self.dataDeclaration, p0.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 15, new ArrayListSerializer(IntSerializer.INSTANCE), self.dataDeclaration);
    }

    public final int component1() {
        return this.f50524id;
    }

    public final List<Integer> component10() {
        return this.flexibles;
    }

    public final ConsentStatus component11() {
        return this.status;
    }

    public final ConsentStatus component12() {
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

    public final Map<String, VendorUrl> component6() {
        return this.urls;
    }

    public final DataRetention component7() {
        return this.dataRetention;
    }

    public final List<Integer> component8() {
        return this.consentables;
    }

    public final List<Integer> component9() {
        return this.legintables;
    }

    public final Vendor copy(int i10, Integer num, String str, String name, String policyUrl, Map<String, VendorUrl> urls, DataRetention dataRetention, List<Integer> consentables, List<Integer> legintables, List<Integer> flexibles, ConsentStatus status, ConsentStatus legintStatus, Long l9, Boolean bool, Integer num2, List<Integer> dataDeclaration) {
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
        return new Vendor(i10, num, str, name, policyUrl, urls, dataRetention, consentables, legintables, flexibles, status, legintStatus, l9, bool, num2, dataDeclaration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vendor)) {
            return false;
        }
        Vendor vendor = (Vendor) obj;
        return this.f50524id == vendor.f50524id && e0.areEqual(this.iabId, vendor.iabId) && e0.areEqual(this.extraId, vendor.extraId) && e0.areEqual(this.name, vendor.name) && e0.areEqual(this.policyUrl, vendor.policyUrl) && e0.areEqual(this.urls, vendor.urls) && e0.areEqual(this.dataRetention, vendor.dataRetention) && e0.areEqual(this.consentables, vendor.consentables) && e0.areEqual(this.legintables, vendor.legintables) && e0.areEqual(this.flexibles, vendor.flexibles) && this.status == vendor.status && this.legintStatus == vendor.legintStatus && e0.areEqual(this.cookieMaxAgeSeconds, vendor.cookieMaxAgeSeconds) && e0.areEqual(this.usesNonCookieAccess, vendor.usesNonCookieAccess) && e0.areEqual(this.googleAtpId, vendor.googleAtpId) && e0.areEqual(this.dataDeclaration, vendor.dataDeclaration);
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

    public final DataRetention getDataRetention() {
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
        return this.f50524id;
    }

    public final ConsentStatus getLegintStatus() {
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

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final Map<String, VendorUrl> getUrls() {
        return this.urls;
    }

    public final Boolean getUsesNonCookieAccess() {
        return this.usesNonCookieAccess;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50524id) * 31;
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
        StringBuilder sb2 = new StringBuilder("Vendor(id=");
        sb2.append(this.f50524id);
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

    @SerialName("data_declaration")
    public static /* synthetic */ void getDataDeclaration$annotations() {
    }

    @SerialName("extra_id")
    public static /* synthetic */ void getExtraId$annotations() {
    }

    @SerialName("google_atp_id")
    public static /* synthetic */ void getGoogleAtpId$annotations() {
    }

    @SerialName("iab_id")
    public static /* synthetic */ void getIabId$annotations() {
    }

    @SerialName("policy_url")
    public static /* synthetic */ void getPolicyUrl$annotations() {
    }

    public Vendor(int i10, Integer num, String str, String name, String policyUrl, Map<String, VendorUrl> urls, DataRetention dataRetention, List<Integer> consentables, List<Integer> legintables, List<Integer> flexibles, ConsentStatus status, ConsentStatus legintStatus, Long l9, Boolean bool, Integer num2, List<Integer> dataDeclaration) {
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
        this.f50524id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.policyUrl = policyUrl;
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

    public /* synthetic */ Vendor(int i10, Integer num, String str, String str2, String str3, Map map, DataRetention dataRetention, List list, List list2, List list3, ConsentStatus consentStatus, ConsentStatus consentStatus2, Long l9, Boolean bool, Integer num2, List list4, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, str2, str3, (i11 & 32) != 0 ? p1.emptyMap() : map, (i11 & 64) != 0 ? new DataRetention(0, (Map) null, (Map) null, 7, (u) null) : dataRetention, (i11 & 128) != 0 ? p0.emptyList() : list, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p0.emptyList() : list2, (i11 & 512) != 0 ? p0.emptyList() : list3, (i11 & 1024) != 0 ? ConsentStatus.PENDING : consentStatus, (i11 & 2048) != 0 ? ConsentStatus.PENDING : consentStatus2, (i11 & 4096) != 0 ? null : l9, (i11 & Segment.SIZE) != 0 ? null : bool, (i11 & 16384) != 0 ? null : num2, (i11 & 32768) != 0 ? p0.emptyList() : list4);
    }
}
