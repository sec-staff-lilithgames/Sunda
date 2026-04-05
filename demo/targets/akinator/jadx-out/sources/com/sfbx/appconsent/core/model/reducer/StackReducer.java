package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.I18NString$$serializer;
import e3.g;
import j1.o2;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class StackReducer {
    public static final Companion Companion = new Companion(null);
    private final List<Integer> consentables;
    private final I18NString description;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50527id;
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

        public final KSerializer<StackReducer> serializer() {
            return StackReducer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ StackReducer(int i10, int i11, @SerialName("iab_id") Integer num, I18NString i18NString, I18NString i18NString2, List list, int i12, int i13, int i14, @SerialName("vendors_number") Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i10 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 13, StackReducer$$serializer.INSTANCE.getDescriptor());
        }
        this.f50527id = i11;
        if ((i10 & 2) == 0) {
            this.iabId = null;
        } else {
            this.iabId = num;
        }
        this.name = i18NString;
        this.description = i18NString2;
        if ((i10 & 16) == 0) {
            this.consentables = p0.emptyList();
        } else {
            this.consentables = list;
        }
        if ((i10 & 32) == 0) {
            this.type = 0;
        } else {
            this.type = i12;
        }
        if ((i10 & 64) == 0) {
            this.status = 0;
        } else {
            this.status = i13;
        }
        if ((i10 & 128) == 0) {
            this.legintStatus = 0;
        } else {
            this.legintStatus = i14;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public static /* synthetic */ StackReducer copy$default(StackReducer stackReducer, int i10, Integer num, I18NString i18NString, I18NString i18NString2, List list, int i11, int i12, int i13, Integer num2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = stackReducer.f50527id;
        }
        if ((i14 & 2) != 0) {
            num = stackReducer.iabId;
        }
        if ((i14 & 4) != 0) {
            i18NString = stackReducer.name;
        }
        if ((i14 & 8) != 0) {
            i18NString2 = stackReducer.description;
        }
        if ((i14 & 16) != 0) {
            list = stackReducer.consentables;
        }
        if ((i14 & 32) != 0) {
            i11 = stackReducer.type;
        }
        if ((i14 & 64) != 0) {
            i12 = stackReducer.status;
        }
        if ((i14 & 128) != 0) {
            i13 = stackReducer.legintStatus;
        }
        if ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num2 = stackReducer.vendorsNumber;
        }
        int i15 = i13;
        Integer num3 = num2;
        int i16 = i11;
        int i17 = i12;
        List list2 = list;
        I18NString i18NString3 = i18NString;
        return stackReducer.copy(i10, num, i18NString3, i18NString2, list2, i16, i17, i15, num3);
    }

    public static final void write$Self(StackReducer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50527id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        }
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, i18NString$$serializer, self.name);
        output.encodeSerializableElement(serialDesc, 3, i18NString$$serializer, self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !e0.areEqual(self.consentables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(IntSerializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.type != 0) {
            output.encodeIntElement(serialDesc, 5, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.status != 0) {
            output.encodeIntElement(serialDesc, 6, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.legintStatus != 0) {
            output.encodeIntElement(serialDesc, 7, self.legintStatus);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.vendorsNumber == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.vendorsNumber);
    }

    public final int component1() {
        return this.f50527id;
    }

    public final Integer component2() {
        return this.iabId;
    }

    public final I18NString component3() {
        return this.name;
    }

    public final I18NString component4() {
        return this.description;
    }

    public final List<Integer> component5() {
        return this.consentables;
    }

    public final int component6() {
        return this.type;
    }

    public final int component7() {
        return this.status;
    }

    public final int component8() {
        return this.legintStatus;
    }

    public final Integer component9() {
        return this.vendorsNumber;
    }

    public final StackReducer copy(int i10, Integer num, I18NString name, I18NString description, List<Integer> consentables, int i11, int i12, int i13, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(consentables, "consentables");
        return new StackReducer(i10, num, name, description, consentables, i11, i12, i13, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackReducer)) {
            return false;
        }
        StackReducer stackReducer = (StackReducer) obj;
        return this.f50527id == stackReducer.f50527id && e0.areEqual(this.iabId, stackReducer.iabId) && e0.areEqual(this.name, stackReducer.name) && e0.areEqual(this.description, stackReducer.description) && e0.areEqual(this.consentables, stackReducer.consentables) && this.type == stackReducer.type && this.status == stackReducer.status && this.legintStatus == stackReducer.legintStatus && e0.areEqual(this.vendorsNumber, stackReducer.vendorsNumber);
    }

    public final List<Integer> getConsentables() {
        return this.consentables;
    }

    public final I18NString getDescription() {
        return this.description;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50527id;
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
        int iHashCode = Integer.hashCode(this.f50527id) * 31;
        Integer num = this.iabId;
        int iD = g.d(this.legintStatus, g.d(this.status, g.d(this.type, o2.c((this.description.hashCode() + ((this.name.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31, this.consentables), 31), 31), 31);
        Integer num2 = this.vendorsNumber;
        return iD + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StackReducer(id=");
        sb2.append(this.f50527id);
        sb2.append(", iabId=");
        sb2.append(this.iabId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", consentables=");
        sb2.append(this.consentables);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", legintStatus=");
        sb2.append(this.legintStatus);
        sb2.append(", vendorsNumber=");
        return a.j(sb2, this.vendorsNumber, ')');
    }

    public StackReducer(int i10, Integer num, I18NString name, I18NString description, List<Integer> consentables, int i11, int i12, int i13, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(consentables, "consentables");
        this.f50527id = i10;
        this.iabId = num;
        this.name = name;
        this.description = description;
        this.consentables = consentables;
        this.type = i11;
        this.status = i12;
        this.legintStatus = i13;
        this.vendorsNumber = num2;
    }

    public /* synthetic */ StackReducer(int i10, Integer num, I18NString i18NString, I18NString i18NString2, List list, int i11, int i12, int i13, Integer num2, int i14, u uVar) {
        this(i10, (i14 & 2) != 0 ? null : num, i18NString, i18NString2, (i14 & 16) != 0 ? p0.emptyList() : list, (i14 & 32) != 0 ? 0 : i11, (i14 & 64) != 0 ? 0 : i12, (i14 & 128) != 0 ? 0 : i13, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num2);
    }

    @SerialName("iab_id")
    public static /* synthetic */ void getIabId$annotations() {
    }

    @SerialName("vendors_number")
    public static /* synthetic */ void getVendorsNumber$annotations() {
    }
}
