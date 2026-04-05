package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.util.ExtensionKt;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Consentable {
    public static final Companion Companion = new Companion(null);
    private final I18NString description;
    private final I18NString descriptionLegal;
    private final String extraId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50521id;
    private final I18NString illustrations;
    private final ConsentStatus legintStatus;
    private final I18NString name;
    private final ConsentStatus status;
    private final int type;
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
    public /* synthetic */ Consentable(int i10, int i11, @SerialName("iab_id") Integer num, @SerialName("extra_id") String str, I18NString i18NString, I18NString i18NString2, @SerialName("description_legal") I18NString i18NString3, I18NString i18NString4, int i12, ConsentStatus consentStatus, ConsentStatus consentStatus2, @SerialName("vendors_number") Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (57 != (i10 & 57)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 57, Consentable$$serializer.INSTANCE.getDescriptor());
        }
        this.f50521id = i11;
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
        this.name = i18NString;
        this.description = i18NString2;
        this.descriptionLegal = i18NString3;
        if ((i10 & 64) == 0) {
            this.illustrations = null;
        } else {
            this.illustrations = i18NString4;
        }
        if ((i10 & 128) == 0) {
            this.type = 0;
        } else {
            this.type = i12;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.status = ConsentStatus.PENDING;
        } else {
            this.status = consentStatus;
        }
        if ((i10 & 512) == 0) {
            this.legintStatus = ConsentStatus.PENDING;
        } else {
            this.legintStatus = consentStatus2;
        }
        if ((i10 & 1024) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public static /* synthetic */ Consentable copy$default(Consentable consentable, int i10, Integer num, String str, I18NString i18NString, I18NString i18NString2, I18NString i18NString3, I18NString i18NString4, int i11, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = consentable.f50521id;
        }
        if ((i12 & 2) != 0) {
            num = consentable.iabId;
        }
        if ((i12 & 4) != 0) {
            str = consentable.extraId;
        }
        if ((i12 & 8) != 0) {
            i18NString = consentable.name;
        }
        if ((i12 & 16) != 0) {
            i18NString2 = consentable.description;
        }
        if ((i12 & 32) != 0) {
            i18NString3 = consentable.descriptionLegal;
        }
        if ((i12 & 64) != 0) {
            i18NString4 = consentable.illustrations;
        }
        if ((i12 & 128) != 0) {
            i11 = consentable.type;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            consentStatus = consentable.status;
        }
        if ((i12 & 512) != 0) {
            consentStatus2 = consentable.legintStatus;
        }
        if ((i12 & 1024) != 0) {
            num2 = consentable.vendorsNumber;
        }
        ConsentStatus consentStatus3 = consentStatus2;
        Integer num3 = num2;
        int i13 = i11;
        ConsentStatus consentStatus4 = consentStatus;
        I18NString i18NString5 = i18NString3;
        I18NString i18NString6 = i18NString4;
        I18NString i18NString7 = i18NString2;
        String str2 = str;
        return consentable.copy(i10, num, str2, i18NString, i18NString7, i18NString5, i18NString6, i13, consentStatus4, consentStatus3, num3);
    }

    public static final void write$Self(Consentable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50521id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.extraId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.extraId);
        }
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, i18NString$$serializer, self.name);
        output.encodeSerializableElement(serialDesc, 4, i18NString$$serializer, self.description);
        output.encodeSerializableElement(serialDesc, 5, i18NString$$serializer, self.descriptionLegal);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.illustrations != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, i18NString$$serializer, self.illustrations);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.type != 0) {
            output.encodeIntElement(serialDesc, 7, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.status != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 8, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.legintStatus != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 9, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.legintStatus);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.vendorsNumber == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.vendorsNumber);
    }

    public final int component1() {
        return this.f50521id;
    }

    public final ConsentStatus component10() {
        return this.legintStatus;
    }

    public final Integer component11() {
        return this.vendorsNumber;
    }

    public final Integer component2() {
        return this.iabId;
    }

    public final String component3() {
        return this.extraId;
    }

    public final I18NString component4() {
        return this.name;
    }

    public final I18NString component5() {
        return this.description;
    }

    public final I18NString component6() {
        return this.descriptionLegal;
    }

    public final I18NString component7() {
        return this.illustrations;
    }

    public final int component8() {
        return this.type;
    }

    public final ConsentStatus component9() {
        return this.status;
    }

    public final Consentable copy(int i10, Integer num, String str, I18NString name, I18NString description, I18NString descriptionLegal, I18NString i18NString, int i11, ConsentStatus status, ConsentStatus legintStatus, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        return new Consentable(i10, num, str, name, description, descriptionLegal, i18NString, i11, status, legintStatus, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Consentable)) {
            return false;
        }
        Consentable consentable = (Consentable) obj;
        return this.f50521id == consentable.f50521id && e0.areEqual(this.iabId, consentable.iabId) && e0.areEqual(this.extraId, consentable.extraId) && e0.areEqual(this.name, consentable.name) && e0.areEqual(this.description, consentable.description) && e0.areEqual(this.descriptionLegal, consentable.descriptionLegal) && e0.areEqual(this.illustrations, consentable.illustrations) && this.type == consentable.type && this.status == consentable.status && this.legintStatus == consentable.legintStatus && e0.areEqual(this.vendorsNumber, consentable.vendorsNumber);
    }

    public final I18NString getDescription() {
        return this.description;
    }

    public final I18NString getDescriptionLegal() {
        return this.descriptionLegal;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50521id;
    }

    public final I18NString getIllustrations() {
        return this.illustrations;
    }

    public final ConsentStatus getLegintStatus() {
        return this.legintStatus;
    }

    public final I18NString getName() {
        return this.name;
    }

    public final String getNameAsString(String appconsentThemeLocal) {
        e0.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        return ExtensionKt.removeLineSeparatorAtEnd(LocalizedUtils.INSTANCE.getNameByAppConsentThemeLocal$appconsent_core_prodXchangeRelease(appconsentThemeLocal, this.name));
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50521id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iHashCode3 = (this.descriptionLegal.hashCode() + ((this.description.hashCode() + ((this.name.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        I18NString i18NString = this.illustrations;
        int iHashCode4 = (this.legintStatus.hashCode() + ((this.status.hashCode() + g.d(this.type, (iHashCode3 + (i18NString == null ? 0 : i18NString.hashCode())) * 31, 31)) * 31)) * 31;
        Integer num2 = this.vendorsNumber;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean isExtraPurpose() {
        return this.type == ConsentableType.PURPOSE.getValue() && this.extraId != null;
    }

    public final boolean isPurposeFromIab() {
        return this.iabId != null && this.extraId == null && this.type == ConsentableType.PURPOSE.getValue();
    }

    public final boolean isSpecialPurposeFromIab() {
        return this.iabId != null && this.extraId == null && this.type == ConsentableType.SPECIAL_PURPOSE.getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Consentable(id=");
        sb2.append(this.f50521id);
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
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", legintStatus=");
        sb2.append(this.legintStatus);
        sb2.append(", vendorsNumber=");
        return a.j(sb2, this.vendorsNumber, ')');
    }

    public Consentable(int i10, Integer num, String str, I18NString name, I18NString description, I18NString descriptionLegal, I18NString i18NString, int i11, ConsentStatus status, ConsentStatus legintStatus, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        this.f50521id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.description = description;
        this.descriptionLegal = descriptionLegal;
        this.illustrations = i18NString;
        this.type = i11;
        this.status = status;
        this.legintStatus = legintStatus;
        this.vendorsNumber = num2;
    }

    @SerialName("description_legal")
    public static /* synthetic */ void getDescriptionLegal$annotations() {
    }

    @SerialName("extra_id")
    public static /* synthetic */ void getExtraId$annotations() {
    }

    @SerialName("iab_id")
    public static /* synthetic */ void getIabId$annotations() {
    }

    @SerialName("vendors_number")
    public static /* synthetic */ void getVendorsNumber$annotations() {
    }

    public /* synthetic */ Consentable(int i10, Integer num, String str, I18NString i18NString, I18NString i18NString2, I18NString i18NString3, I18NString i18NString4, int i11, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i12, u uVar) {
        this(i10, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str, i18NString, i18NString2, i18NString3, (i12 & 64) != 0 ? null : i18NString4, (i12 & 128) != 0 ? 0 : i11, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? ConsentStatus.PENDING : consentStatus, (i12 & 512) != 0 ? ConsentStatus.PENDING : consentStatus2, (i12 & 1024) != 0 ? null : num2);
    }
}
