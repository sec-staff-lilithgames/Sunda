package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.I18NString$$serializer;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class ConsentableReducer {
    public static final Companion Companion = new Companion(null);
    private final I18NString description;
    private final I18NString descriptionLegal;
    private final String extraId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50525id;
    private final I18NString illustrations;
    private final int legintStatus;
    private final I18NString name;
    private final int status;
    private final int type;
    private final Integer vendorsNumber;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<ConsentableReducer> serializer() {
            return ConsentableReducer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ ConsentableReducer(int i10, int i11, @SerialName("iab_id") Integer num, @SerialName("extra_id") String str, I18NString i18NString, I18NString i18NString2, @SerialName("description_legal") I18NString i18NString3, I18NString i18NString4, int i12, int i13, int i14, @SerialName("vendors_number") Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (57 != (i10 & 57)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 57, ConsentableReducer$$serializer.INSTANCE.getDescriptor());
        }
        this.f50525id = i11;
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
            this.status = 0;
        } else {
            this.status = i13;
        }
        if ((i10 & 512) == 0) {
            this.legintStatus = 0;
        } else {
            this.legintStatus = i14;
        }
        if ((i10 & 1024) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public static /* synthetic */ ConsentableReducer copy$default(ConsentableReducer consentableReducer, int i10, Integer num, String str, I18NString i18NString, I18NString i18NString2, I18NString i18NString3, I18NString i18NString4, int i11, int i12, int i13, Integer num2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = consentableReducer.f50525id;
        }
        if ((i14 & 2) != 0) {
            num = consentableReducer.iabId;
        }
        if ((i14 & 4) != 0) {
            str = consentableReducer.extraId;
        }
        if ((i14 & 8) != 0) {
            i18NString = consentableReducer.name;
        }
        if ((i14 & 16) != 0) {
            i18NString2 = consentableReducer.description;
        }
        if ((i14 & 32) != 0) {
            i18NString3 = consentableReducer.descriptionLegal;
        }
        if ((i14 & 64) != 0) {
            i18NString4 = consentableReducer.illustrations;
        }
        if ((i14 & 128) != 0) {
            i11 = consentableReducer.type;
        }
        if ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i12 = consentableReducer.status;
        }
        if ((i14 & 512) != 0) {
            i13 = consentableReducer.legintStatus;
        }
        if ((i14 & 1024) != 0) {
            num2 = consentableReducer.vendorsNumber;
        }
        int i15 = i13;
        Integer num3 = num2;
        int i16 = i11;
        int i17 = i12;
        I18NString i18NString5 = i18NString3;
        I18NString i18NString6 = i18NString4;
        I18NString i18NString7 = i18NString2;
        String str2 = str;
        return consentableReducer.copy(i10, num, str2, i18NString, i18NString7, i18NString5, i18NString6, i16, i17, i15, num3);
    }

    public static final void write$Self(ConsentableReducer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50525id);
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
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.status != 0) {
            output.encodeIntElement(serialDesc, 8, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.legintStatus != 0) {
            output.encodeIntElement(serialDesc, 9, self.legintStatus);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.vendorsNumber == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.vendorsNumber);
    }

    public final int component1() {
        return this.f50525id;
    }

    public final int component10() {
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

    public final int component9() {
        return this.status;
    }

    public final ConsentableReducer copy(int i10, Integer num, String str, I18NString name, I18NString description, I18NString descriptionLegal, I18NString i18NString, int i11, int i12, int i13, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        return new ConsentableReducer(i10, num, str, name, description, descriptionLegal, i18NString, i11, i12, i13, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentableReducer)) {
            return false;
        }
        ConsentableReducer consentableReducer = (ConsentableReducer) obj;
        return this.f50525id == consentableReducer.f50525id && e0.areEqual(this.iabId, consentableReducer.iabId) && e0.areEqual(this.extraId, consentableReducer.extraId) && e0.areEqual(this.name, consentableReducer.name) && e0.areEqual(this.description, consentableReducer.description) && e0.areEqual(this.descriptionLegal, consentableReducer.descriptionLegal) && e0.areEqual(this.illustrations, consentableReducer.illustrations) && this.type == consentableReducer.type && this.status == consentableReducer.status && this.legintStatus == consentableReducer.legintStatus && e0.areEqual(this.vendorsNumber, consentableReducer.vendorsNumber);
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
        return this.f50525id;
    }

    public final I18NString getIllustrations() {
        return this.illustrations;
    }

    public final int getLegintStatus() {
        return this.legintStatus;
    }

    public final I18NString getName() {
        return this.name;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50525id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iHashCode3 = (this.descriptionLegal.hashCode() + ((this.description.hashCode() + ((this.name.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        I18NString i18NString = this.illustrations;
        int iD = g.d(this.legintStatus, g.d(this.status, g.d(this.type, (iHashCode3 + (i18NString == null ? 0 : i18NString.hashCode())) * 31, 31), 31), 31);
        Integer num2 = this.vendorsNumber;
        return iD + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConsentableReducer(id=");
        sb2.append(this.f50525id);
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

    public ConsentableReducer(int i10, Integer num, String str, I18NString name, I18NString description, I18NString descriptionLegal, I18NString i18NString, int i11, int i12, int i13, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        this.f50525id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.description = description;
        this.descriptionLegal = descriptionLegal;
        this.illustrations = i18NString;
        this.type = i11;
        this.status = i12;
        this.legintStatus = i13;
        this.vendorsNumber = num2;
    }

    public /* synthetic */ ConsentableReducer(int i10, Integer num, String str, I18NString i18NString, I18NString i18NString2, I18NString i18NString3, I18NString i18NString4, int i11, int i12, int i13, Integer num2, int i14, u uVar) {
        this(i10, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, i18NString, i18NString2, i18NString3, (i14 & 64) != 0 ? null : i18NString4, (i14 & 128) != 0 ? 0 : i11, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0 : i12, (i14 & 512) != 0 ? 0 : i13, (i14 & 1024) != 0 ? null : num2);
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
}
