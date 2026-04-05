package com.sfbx.appconsent.core.model.api.proto;

import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.util.ExtensionKt;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Stack {
    public static final Companion Companion = new Companion(null);
    private final List<Integer> consentables;
    private final I18NString description;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50523id;
    private final ConsentStatus legintStatus;
    private final I18NString name;
    private final ConsentStatus status;
    private final Integer vendorsNumber;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Stack> serializer() {
            return Stack$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ Stack(int i10, int i11, @SerialName("iab_id") Integer num, I18NString i18NString, I18NString i18NString2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, @SerialName("vendors_number") Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i10 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 13, Stack$$serializer.INSTANCE.getDescriptor());
        }
        this.f50523id = i11;
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
            this.status = ConsentStatus.PENDING;
        } else {
            this.status = consentStatus;
        }
        if ((i10 & 64) == 0) {
            this.legintStatus = ConsentStatus.PENDING;
        } else {
            this.legintStatus = consentStatus2;
        }
        if ((i10 & 128) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public static /* synthetic */ Stack copy$default(Stack stack, int i10, Integer num, I18NString i18NString, I18NString i18NString2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = stack.f50523id;
        }
        if ((i11 & 2) != 0) {
            num = stack.iabId;
        }
        if ((i11 & 4) != 0) {
            i18NString = stack.name;
        }
        if ((i11 & 8) != 0) {
            i18NString2 = stack.description;
        }
        if ((i11 & 16) != 0) {
            list = stack.consentables;
        }
        if ((i11 & 32) != 0) {
            consentStatus = stack.status;
        }
        if ((i11 & 64) != 0) {
            consentStatus2 = stack.legintStatus;
        }
        if ((i11 & 128) != 0) {
            num2 = stack.vendorsNumber;
        }
        ConsentStatus consentStatus3 = consentStatus2;
        Integer num3 = num2;
        List list2 = list;
        ConsentStatus consentStatus4 = consentStatus;
        return stack.copy(i10, num, i18NString, i18NString2, list2, consentStatus4, consentStatus3, num3);
    }

    public static final void write$Self(Stack self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50523id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        }
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, i18NString$$serializer, self.name);
        output.encodeSerializableElement(serialDesc, 3, i18NString$$serializer, self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !e0.areEqual(self.consentables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(IntSerializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.status != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 5, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.legintStatus != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 6, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.legintStatus);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.vendorsNumber == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.vendorsNumber);
    }

    public final int component1() {
        return this.f50523id;
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

    public final ConsentStatus component6() {
        return this.status;
    }

    public final ConsentStatus component7() {
        return this.legintStatus;
    }

    public final Integer component8() {
        return this.vendorsNumber;
    }

    public final Stack copy(int i10, Integer num, I18NString name, I18NString description, List<Integer> consentables, ConsentStatus status, ConsentStatus legintStatus, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        return new Stack(i10, num, name, description, consentables, status, legintStatus, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stack)) {
            return false;
        }
        Stack stack = (Stack) obj;
        return this.f50523id == stack.f50523id && e0.areEqual(this.iabId, stack.iabId) && e0.areEqual(this.name, stack.name) && e0.areEqual(this.description, stack.description) && e0.areEqual(this.consentables, stack.consentables) && this.status == stack.status && this.legintStatus == stack.legintStatus && e0.areEqual(this.vendorsNumber, stack.vendorsNumber);
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
        return this.f50523id;
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

    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50523id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (this.legintStatus.hashCode() + ((this.status.hashCode() + o2.c((this.description.hashCode() + ((this.name.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31, this.consentables)) * 31)) * 31;
        Integer num2 = this.vendorsNumber;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Stack(id=");
        sb2.append(this.f50523id);
        sb2.append(", iabId=");
        sb2.append(this.iabId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", consentables=");
        sb2.append(this.consentables);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", legintStatus=");
        sb2.append(this.legintStatus);
        sb2.append(", vendorsNumber=");
        return a.j(sb2, this.vendorsNumber, ')');
    }

    public Stack(int i10, Integer num, I18NString name, I18NString description, List<Integer> consentables, ConsentStatus status, ConsentStatus legintStatus, Integer num2) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        this.f50523id = i10;
        this.iabId = num;
        this.name = name;
        this.description = description;
        this.consentables = consentables;
        this.status = status;
        this.legintStatus = legintStatus;
        this.vendorsNumber = num2;
    }

    public /* synthetic */ Stack(int i10, Integer num, I18NString i18NString, I18NString i18NString2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : num, i18NString, i18NString2, (i11 & 16) != 0 ? p0.emptyList() : list, (i11 & 32) != 0 ? ConsentStatus.PENDING : consentStatus, (i11 & 64) != 0 ? ConsentStatus.PENDING : consentStatus2, (i11 & 128) != 0 ? null : num2);
    }

    @SerialName("iab_id")
    public static /* synthetic */ void getIabId$annotations() {
    }

    @SerialName("vendors_number")
    public static /* synthetic */ void getVendorsNumber$annotations() {
    }
}
