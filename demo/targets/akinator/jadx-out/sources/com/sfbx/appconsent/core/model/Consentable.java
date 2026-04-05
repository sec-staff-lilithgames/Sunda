package com.sfbx.appconsent.core.model;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.api.proto.LocalizedUtils;
import com.sfbx.appconsent.core.util.ExtensionKt;
import j1.o2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
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
public final class Consentable {
    public static final Companion Companion = new Companion(null);
    private final BannerType bannerType;
    private final Map<String, String> description;
    private final Map<String, String> descriptionLegal;
    private final String extraId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50516id;
    private final Map<String, String> illustrations;
    private ConsentStatus legIntStatus;
    private final Map<String, String> name;
    private ConsentStatus status;
    private final ConsentableType type;
    private final List<Vendor> vendors;
    private final Integer vendorsNumber;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Consentable> serializer() {
            return Consentable$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ Consentable(int i10, int i11, Integer num, String str, Map map, Map map2, Map map3, Map map4, ConsentableType consentableType, BannerType bannerType, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, Consentable$$serializer.INSTANCE.getDescriptor());
        }
        this.f50516id = i11;
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
            this.name = p1.emptyMap();
        } else {
            this.name = map;
        }
        if ((i10 & 16) == 0) {
            this.description = p1.emptyMap();
        } else {
            this.description = map2;
        }
        if ((i10 & 32) == 0) {
            this.descriptionLegal = p1.emptyMap();
        } else {
            this.descriptionLegal = map3;
        }
        if ((i10 & 64) == 0) {
            this.illustrations = p1.emptyMap();
        } else {
            this.illustrations = map4;
        }
        if ((i10 & 128) == 0) {
            this.type = ConsentableType.UNKNOWN;
        } else {
            this.type = consentableType;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.bannerType = BannerType.NONE;
        } else {
            this.bannerType = bannerType;
        }
        if ((i10 & 512) == 0) {
            this.vendors = p0.emptyList();
        } else {
            this.vendors = list;
        }
        if ((i10 & 1024) == 0) {
            this.status = ConsentStatus.PENDING;
        } else {
            this.status = consentStatus;
        }
        if ((i10 & 2048) == 0) {
            this.legIntStatus = ConsentStatus.UNDEFINED;
        } else {
            this.legIntStatus = consentStatus2;
        }
        if ((i10 & 4096) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public static /* synthetic */ Consentable copy$default(Consentable consentable, int i10, Integer num, String str, Map map, Map map2, Map map3, Map map4, ConsentableType consentableType, BannerType bannerType, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = consentable.f50516id;
        }
        return consentable.copy(i10, (i11 & 2) != 0 ? consentable.iabId : num, (i11 & 4) != 0 ? consentable.extraId : str, (i11 & 8) != 0 ? consentable.name : map, (i11 & 16) != 0 ? consentable.description : map2, (i11 & 32) != 0 ? consentable.descriptionLegal : map3, (i11 & 64) != 0 ? consentable.illustrations : map4, (i11 & 128) != 0 ? consentable.type : consentableType, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? consentable.bannerType : bannerType, (i11 & 512) != 0 ? consentable.vendors : list, (i11 & 1024) != 0 ? consentable.status : consentStatus, (i11 & 2048) != 0 ? consentable.legIntStatus : consentStatus2, (i11 & 4096) != 0 ? consentable.vendorsNumber : num2);
    }

    public static final void write$Self(Consentable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50516id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.extraId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.extraId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !e0.areEqual(self.name, p1.emptyMap())) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !e0.areEqual(self.description, p1.emptyMap())) {
            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 4, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !e0.areEqual(self.descriptionLegal, p1.emptyMap())) {
            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 5, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), self.descriptionLegal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !e0.areEqual(self.illustrations, p1.emptyMap())) {
            StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 6, new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), self.illustrations);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.type != ConsentableType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 7, ConsentableType.Companion.serializer(), self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.bannerType != BannerType.NONE) {
            output.encodeSerializableElement(serialDesc, 8, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.BannerType", BannerType.values()), self.bannerType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !e0.areEqual(self.vendors, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 9, new ArrayListSerializer(Vendor$$serializer.INSTANCE), self.vendors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.status != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 10, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.legIntStatus != ConsentStatus.UNDEFINED) {
            output.encodeSerializableElement(serialDesc, 11, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.legIntStatus);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.vendorsNumber == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, IntSerializer.INSTANCE, self.vendorsNumber);
    }

    public final int component1() {
        return this.f50516id;
    }

    public final List<Vendor> component10() {
        return this.vendors;
    }

    public final ConsentStatus component11() {
        return this.status;
    }

    public final ConsentStatus component12() {
        return this.legIntStatus;
    }

    public final Integer component13() {
        return this.vendorsNumber;
    }

    public final Integer component2() {
        return this.iabId;
    }

    public final String component3() {
        return this.extraId;
    }

    public final Map<String, String> component4() {
        return this.name;
    }

    public final Map<String, String> component5() {
        return this.description;
    }

    public final Map<String, String> component6() {
        return this.descriptionLegal;
    }

    public final Map<String, String> component7() {
        return this.illustrations;
    }

    public final ConsentableType component8() {
        return this.type;
    }

    public final BannerType component9() {
        return this.bannerType;
    }

    public final Consentable copy(int i10, Integer num, String str, Map<String, String> name, Map<String, String> description, Map<String, String> descriptionLegal, Map<String, String> illustrations, ConsentableType type, BannerType bannerType, List<Vendor> vendors, ConsentStatus status, ConsentStatus legIntStatus, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        e0.checkNotNullParameter(illustrations, "illustrations");
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(bannerType, "bannerType");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legIntStatus, "legIntStatus");
        return new Consentable(i10, num, str, name, description, descriptionLegal, illustrations, type, bannerType, vendors, status, legIntStatus, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Consentable)) {
            return false;
        }
        Consentable consentable = (Consentable) obj;
        return this.f50516id == consentable.f50516id && e0.areEqual(this.iabId, consentable.iabId) && e0.areEqual(this.extraId, consentable.extraId) && e0.areEqual(this.name, consentable.name) && e0.areEqual(this.description, consentable.description) && e0.areEqual(this.descriptionLegal, consentable.descriptionLegal) && e0.areEqual(this.illustrations, consentable.illustrations) && this.type == consentable.type && this.bannerType == consentable.bannerType && e0.areEqual(this.vendors, consentable.vendors) && this.status == consentable.status && this.legIntStatus == consentable.legIntStatus && e0.areEqual(this.vendorsNumber, consentable.vendorsNumber);
    }

    public final BannerType getBannerType() {
        return this.bannerType;
    }

    public final Map<String, String> getDescription() {
        return this.description;
    }

    public final Map<String, String> getDescriptionLegal() {
        return this.descriptionLegal;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50516id;
    }

    public final Map<String, String> getIllustrations() {
        return this.illustrations;
    }

    public final ConsentStatus getLegIntStatus() {
        return this.legIntStatus;
    }

    public final Map<String, String> getName() {
        return this.name;
    }

    public final String getNameAsString(String appconsentThemeLocal) {
        e0.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        return ExtensionKt.removeLineSeparatorAtEnd(LocalizedUtils.INSTANCE.getNameByAppConsentThemeLocal$appconsent_core_prodXchangeRelease(appconsentThemeLocal, this.name));
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final ConsentableType getType() {
        return this.type;
    }

    public final List<Vendor> getVendors() {
        return this.vendors;
    }

    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50516id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iHashCode3 = (this.legIntStatus.hashCode() + ((this.status.hashCode() + o2.c((this.bannerType.hashCode() + ((this.type.hashCode() + p0.o2.f(this.illustrations, p0.o2.f(this.descriptionLegal, p0.o2.f(this.description, p0.o2.f(this.name, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31)) * 31)) * 31, 31, this.vendors)) * 31)) * 31;
        Integer num2 = this.vendorsNumber;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean isGeolocation() {
        BannerType bannerType = this.bannerType;
        return bannerType == BannerType.GEOLOCATION_AD || bannerType == BannerType.GEOLOCATION_MARKET;
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
        StringBuilder sb2 = new StringBuilder("Consentable(id=");
        sb2.append(this.f50516id);
        sb2.append(", iabId=");
        sb2.append(this.iabId);
        sb2.append(", extraId=");
        sb2.append(this.extraId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", descriptionLegal=");
        sb2.append(this.descriptionLegal);
        sb2.append(", illustrations=");
        sb2.append(this.illustrations);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", bannerType=");
        sb2.append(this.bannerType);
        sb2.append(", vendors=");
        sb2.append(this.vendors);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", legIntStatus=");
        sb2.append(this.legIntStatus);
        sb2.append(", vendorsNumber=");
        return a.j(sb2, this.vendorsNumber, ')');
    }

    public Consentable(int i10, Integer num, String str, Map<String, String> name, Map<String, String> description, Map<String, String> descriptionLegal, Map<String, String> illustrations, ConsentableType type, BannerType bannerType, List<Vendor> vendors, ConsentStatus status, ConsentStatus legIntStatus, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        e0.checkNotNullParameter(illustrations, "illustrations");
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(bannerType, "bannerType");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legIntStatus, "legIntStatus");
        this.f50516id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.description = description;
        this.descriptionLegal = descriptionLegal;
        this.illustrations = illustrations;
        this.type = type;
        this.bannerType = bannerType;
        this.vendors = vendors;
        this.status = status;
        this.legIntStatus = legIntStatus;
        this.vendorsNumber = num2;
    }

    public /* synthetic */ Consentable(int i10, Integer num, String str, Map map, Map map2, Map map3, Map map4, ConsentableType consentableType, BannerType bannerType, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? p1.emptyMap() : map, (i11 & 16) != 0 ? p1.emptyMap() : map2, (i11 & 32) != 0 ? p1.emptyMap() : map3, (i11 & 64) != 0 ? p1.emptyMap() : map4, (i11 & 128) != 0 ? ConsentableType.UNKNOWN : consentableType, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? BannerType.NONE : bannerType, (i11 & 512) != 0 ? p0.emptyList() : list, (i11 & 1024) != 0 ? ConsentStatus.PENDING : consentStatus, (i11 & 2048) != 0 ? ConsentStatus.UNDEFINED : consentStatus2, (i11 & 4096) != 0 ? null : num2);
    }
}
