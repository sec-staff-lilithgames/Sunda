package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class VendorReducer {
    public static final Companion Companion = new Companion(null);
    private final List<Integer> consentables;
    private final Double cookieMaxAgeSeconds;
    private final List<Integer> dataDeclaration;
    private final DataRetentionReducer dataRetention;
    private final String extraId;
    private final List<Integer> flexibles;
    private final Integer googleAtpId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50528id;
    private final int legintStatus;
    private final List<Integer> legintables;
    private final String name;
    private final String policyUrl;
    private final int status;
    private final int type;
    private final Map<String, VendorUrl> urls;
    private final Boolean usesNonCookieAccess;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<VendorReducer> serializer() {
            return VendorReducer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ VendorReducer(int i10, int i11, @SerialName("iab_id") Integer num, @SerialName("extra_id") String str, String str2, @SerialName("policy_url") String str3, Map map, DataRetentionReducer dataRetentionReducer, List list, List list2, List list3, int i12, int i13, int i14, Double d10, Boolean bool, @SerialName("google_atp_id") Integer num2, @SerialName("data_declaration") List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i10 & 25)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 25, VendorReducer$$serializer.INSTANCE.getDescriptor());
        }
        this.f50528id = i11;
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
            this.dataRetention = new DataRetentionReducer(0, (Map) null, (Map) null, 7, (u) null);
        } else {
            this.dataRetention = dataRetentionReducer;
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
            this.type = 0;
        } else {
            this.type = i12;
        }
        if ((i10 & 2048) == 0) {
            this.status = 0;
        } else {
            this.status = i13;
        }
        if ((i10 & 4096) == 0) {
            this.legintStatus = 0;
        } else {
            this.legintStatus = i14;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.cookieMaxAgeSeconds = null;
        } else {
            this.cookieMaxAgeSeconds = d10;
        }
        if ((i10 & 16384) == 0) {
            this.usesNonCookieAccess = null;
        } else {
            this.usesNonCookieAccess = bool;
        }
        if ((32768 & i10) == 0) {
            this.googleAtpId = null;
        } else {
            this.googleAtpId = num2;
        }
        this.dataDeclaration = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0 ? p0.emptyList() : list4;
    }

    public static /* synthetic */ VendorReducer copy$default(VendorReducer vendorReducer, int i10, Integer num, String str, String str2, String str3, Map map, DataRetentionReducer dataRetentionReducer, List list, List list2, List list3, int i11, int i12, int i13, Double d10, Boolean bool, Integer num2, List list4, int i14, Object obj) {
        List list5;
        Integer num3;
        int i15;
        VendorReducer vendorReducer2;
        Boolean bool2;
        Integer num4;
        String str4;
        String str5;
        String str6;
        Map map2;
        DataRetentionReducer dataRetentionReducer2;
        List list6;
        List list7;
        List list8;
        int i16;
        int i17;
        int i18;
        Double d11;
        int i19 = (i14 & 1) != 0 ? vendorReducer.f50528id : i10;
        Integer num5 = (i14 & 2) != 0 ? vendorReducer.iabId : num;
        String str7 = (i14 & 4) != 0 ? vendorReducer.extraId : str;
        String str8 = (i14 & 8) != 0 ? vendorReducer.name : str2;
        String str9 = (i14 & 16) != 0 ? vendorReducer.policyUrl : str3;
        Map map3 = (i14 & 32) != 0 ? vendorReducer.urls : map;
        DataRetentionReducer dataRetentionReducer3 = (i14 & 64) != 0 ? vendorReducer.dataRetention : dataRetentionReducer;
        List list9 = (i14 & 128) != 0 ? vendorReducer.consentables : list;
        List list10 = (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? vendorReducer.legintables : list2;
        List list11 = (i14 & 512) != 0 ? vendorReducer.flexibles : list3;
        int i20 = (i14 & 1024) != 0 ? vendorReducer.type : i11;
        int i21 = (i14 & 2048) != 0 ? vendorReducer.status : i12;
        int i22 = (i14 & 4096) != 0 ? vendorReducer.legintStatus : i13;
        Double d12 = (i14 & Segment.SIZE) != 0 ? vendorReducer.cookieMaxAgeSeconds : d10;
        int i23 = i19;
        Boolean bool3 = (i14 & 16384) != 0 ? vendorReducer.usesNonCookieAccess : bool;
        Integer num6 = (i14 & 32768) != 0 ? vendorReducer.googleAtpId : num2;
        if ((i14 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            num3 = num6;
            list5 = vendorReducer.dataDeclaration;
            bool2 = bool3;
            num4 = num5;
            str4 = str7;
            str5 = str8;
            str6 = str9;
            map2 = map3;
            dataRetentionReducer2 = dataRetentionReducer3;
            list6 = list9;
            list7 = list10;
            list8 = list11;
            i16 = i20;
            i17 = i21;
            i18 = i22;
            d11 = d12;
            i15 = i23;
            vendorReducer2 = vendorReducer;
        } else {
            list5 = list4;
            num3 = num6;
            i15 = i23;
            vendorReducer2 = vendorReducer;
            bool2 = bool3;
            num4 = num5;
            str4 = str7;
            str5 = str8;
            str6 = str9;
            map2 = map3;
            dataRetentionReducer2 = dataRetentionReducer3;
            list6 = list9;
            list7 = list10;
            list8 = list11;
            i16 = i20;
            i17 = i21;
            i18 = i22;
            d11 = d12;
        }
        return vendorReducer2.copy(i15, num4, str4, str5, str6, map2, dataRetentionReducer2, list6, list7, list8, i16, i17, i18, d11, bool2, num3, list5);
    }

    public static final void write$Self(VendorReducer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50528id);
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
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !e0.areEqual(self.dataRetention, new DataRetentionReducer(0, (Map) null, (Map) null, 7, (u) null))) {
            output.encodeSerializableElement(serialDesc, 6, DataRetentionReducer$$serializer.INSTANCE, self.dataRetention);
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
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.type != 0) {
            output.encodeIntElement(serialDesc, 10, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.status != 0) {
            output.encodeIntElement(serialDesc, 11, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.legintStatus != 0) {
            output.encodeIntElement(serialDesc, 12, self.legintStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.cookieMaxAgeSeconds != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, DoubleSerializer.INSTANCE, self.cookieMaxAgeSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.usesNonCookieAccess != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, self.usesNonCookieAccess);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.googleAtpId != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, IntSerializer.INSTANCE, self.googleAtpId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && e0.areEqual(self.dataDeclaration, p0.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 16, new ArrayListSerializer(IntSerializer.INSTANCE), self.dataDeclaration);
    }

    public final int component1() {
        return this.f50528id;
    }

    public final List<Integer> component10() {
        return this.flexibles;
    }

    public final int component11() {
        return this.type;
    }

    public final int component12() {
        return this.status;
    }

    public final int component13() {
        return this.legintStatus;
    }

    public final Double component14() {
        return this.cookieMaxAgeSeconds;
    }

    public final Boolean component15() {
        return this.usesNonCookieAccess;
    }

    public final Integer component16() {
        return this.googleAtpId;
    }

    public final List<Integer> component17() {
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

    public final DataRetentionReducer component7() {
        return this.dataRetention;
    }

    public final List<Integer> component8() {
        return this.consentables;
    }

    public final List<Integer> component9() {
        return this.legintables;
    }

    public final VendorReducer copy(int i10, Integer num, String str, String name, String policyUrl, Map<String, VendorUrl> urls, DataRetentionReducer dataRetention, List<Integer> consentables, List<Integer> legintables, List<Integer> flexibles, int i11, int i12, int i13, Double d10, Boolean bool, Integer num2, List<Integer> dataDeclaration) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(dataRetention, "dataRetention");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(legintables, "legintables");
        e0.checkNotNullParameter(flexibles, "flexibles");
        e0.checkNotNullParameter(dataDeclaration, "dataDeclaration");
        return new VendorReducer(i10, num, str, name, policyUrl, urls, dataRetention, consentables, legintables, flexibles, i11, i12, i13, d10, bool, num2, dataDeclaration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorReducer)) {
            return false;
        }
        VendorReducer vendorReducer = (VendorReducer) obj;
        return this.f50528id == vendorReducer.f50528id && e0.areEqual(this.iabId, vendorReducer.iabId) && e0.areEqual(this.extraId, vendorReducer.extraId) && e0.areEqual(this.name, vendorReducer.name) && e0.areEqual(this.policyUrl, vendorReducer.policyUrl) && e0.areEqual(this.urls, vendorReducer.urls) && e0.areEqual(this.dataRetention, vendorReducer.dataRetention) && e0.areEqual(this.consentables, vendorReducer.consentables) && e0.areEqual(this.legintables, vendorReducer.legintables) && e0.areEqual(this.flexibles, vendorReducer.flexibles) && this.type == vendorReducer.type && this.status == vendorReducer.status && this.legintStatus == vendorReducer.legintStatus && e0.areEqual((Object) this.cookieMaxAgeSeconds, (Object) vendorReducer.cookieMaxAgeSeconds) && e0.areEqual(this.usesNonCookieAccess, vendorReducer.usesNonCookieAccess) && e0.areEqual(this.googleAtpId, vendorReducer.googleAtpId) && e0.areEqual(this.dataDeclaration, vendorReducer.dataDeclaration);
    }

    public final List<Integer> getConsentables() {
        return this.consentables;
    }

    public final Double getCookieMaxAgeSeconds() {
        return this.cookieMaxAgeSeconds;
    }

    public final List<Integer> getDataDeclaration() {
        return this.dataDeclaration;
    }

    public final DataRetentionReducer getDataRetention() {
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
        return this.f50528id;
    }

    public final int getLegintStatus() {
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

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final Map<String, VendorUrl> getUrls() {
        return this.urls;
    }

    public final Boolean getUsesNonCookieAccess() {
        return this.usesNonCookieAccess;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50528id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iD = g.d(this.legintStatus, g.d(this.status, g.d(this.type, o2.c(o2.c(o2.c((this.dataRetention.hashCode() + p0.o2.f(this.urls, p0.o2.e(p0.o2.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.policyUrl), 31)) * 31, 31, this.consentables), 31, this.legintables), 31, this.flexibles), 31), 31), 31);
        Double d10 = this.cookieMaxAgeSeconds;
        int iHashCode3 = (iD + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool = this.usesNonCookieAccess;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.googleAtpId;
        return this.dataDeclaration.hashCode() + ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorReducer(id=");
        sb2.append(this.f50528id);
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
        sb2.append(", type=");
        sb2.append(this.type);
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

    public VendorReducer(int i10, Integer num, String str, String name, String policyUrl, Map<String, VendorUrl> urls, DataRetentionReducer dataRetention, List<Integer> consentables, List<Integer> legintables, List<Integer> flexibles, int i11, int i12, int i13, Double d10, Boolean bool, Integer num2, List<Integer> dataDeclaration) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(dataRetention, "dataRetention");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(legintables, "legintables");
        e0.checkNotNullParameter(flexibles, "flexibles");
        e0.checkNotNullParameter(dataDeclaration, "dataDeclaration");
        this.f50528id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.policyUrl = policyUrl;
        this.urls = urls;
        this.dataRetention = dataRetention;
        this.consentables = consentables;
        this.legintables = legintables;
        this.flexibles = flexibles;
        this.type = i11;
        this.status = i12;
        this.legintStatus = i13;
        this.cookieMaxAgeSeconds = d10;
        this.usesNonCookieAccess = bool;
        this.googleAtpId = num2;
        this.dataDeclaration = dataDeclaration;
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

    public /* synthetic */ VendorReducer(int i10, Integer num, String str, String str2, String str3, Map map, DataRetentionReducer dataRetentionReducer, List list, List list2, List list3, int i11, int i12, int i13, Double d10, Boolean bool, Integer num2, List list4, int i14, u uVar) {
        this(i10, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, str2, str3, (i14 & 32) != 0 ? p1.emptyMap() : map, (i14 & 64) != 0 ? new DataRetentionReducer(0, (Map) null, (Map) null, 7, (u) null) : dataRetentionReducer, (i14 & 128) != 0 ? p0.emptyList() : list, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p0.emptyList() : list2, (i14 & 512) != 0 ? p0.emptyList() : list3, (i14 & 1024) != 0 ? 0 : i11, (i14 & 2048) != 0 ? 0 : i12, (i14 & 4096) != 0 ? 0 : i13, (i14 & Segment.SIZE) != 0 ? null : d10, (i14 & 16384) != 0 ? null : bool, (32768 & i14) != 0 ? null : num2, (i14 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? p0.emptyList() : list4);
    }
}
