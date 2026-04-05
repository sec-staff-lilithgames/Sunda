package com.sfbx.appconsent.core.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class ExportConsentable {
    public static final Companion Companion = new Companion(null);
    private final String extraId;
    private final Integer iabId;
    private ConsentStatus status;
    private final ConsentableType type;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<ExportConsentable> serializer() {
            return ExportConsentable$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExportConsentable() {
        this((Integer) null, (String) null, (ConsentableType) null, (ConsentStatus) null, 15, (u) null);
    }

    public static /* synthetic */ ExportConsentable copy$default(ExportConsentable exportConsentable, Integer num, String str, ConsentableType consentableType, ConsentStatus consentStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = exportConsentable.iabId;
        }
        if ((i10 & 2) != 0) {
            str = exportConsentable.extraId;
        }
        if ((i10 & 4) != 0) {
            consentableType = exportConsentable.type;
        }
        if ((i10 & 8) != 0) {
            consentStatus = exportConsentable.status;
        }
        return exportConsentable.copy(num, str, consentableType, consentStatus);
    }

    public static final void write$Self(ExportConsentable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.iabId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extraId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extraId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.type != ConsentableType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 2, ConsentableType.Companion.serializer(), self.type);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.status == ConsentStatus.PENDING) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
    }

    public final Integer component1() {
        return this.iabId;
    }

    public final String component2() {
        return this.extraId;
    }

    public final ConsentableType component3() {
        return this.type;
    }

    public final ConsentStatus component4() {
        return this.status;
    }

    public final ExportConsentable copy(Integer num, String str, ConsentableType type, ConsentStatus status) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(status, "status");
        return new ExportConsentable(num, str, type, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportConsentable)) {
            return false;
        }
        ExportConsentable exportConsentable = (ExportConsentable) obj;
        return e0.areEqual(this.iabId, exportConsentable.iabId) && e0.areEqual(this.extraId, exportConsentable.extraId) && this.type == exportConsentable.type && this.status == exportConsentable.status;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final ConsentableType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.iabId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.extraId;
        return this.status.hashCode() + ((this.type.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final void setStatus(ConsentStatus consentStatus) {
        e0.checkNotNullParameter(consentStatus, "<set-?>");
        this.status = consentStatus;
    }

    public String toString() {
        return "ExportConsentable(iabId=" + this.iabId + ", extraId=" + this.extraId + ", type=" + this.type + ", status=" + this.status + ')';
    }

    @f
    public /* synthetic */ ExportConsentable(int i10, Integer num, String str, ConsentableType consentableType, ConsentStatus consentStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.iabId = null;
        } else {
            this.iabId = num;
        }
        if ((i10 & 2) == 0) {
            this.extraId = null;
        } else {
            this.extraId = str;
        }
        if ((i10 & 4) == 0) {
            this.type = ConsentableType.UNKNOWN;
        } else {
            this.type = consentableType;
        }
        if ((i10 & 8) == 0) {
            this.status = ConsentStatus.PENDING;
        } else {
            this.status = consentStatus;
        }
    }

    public ExportConsentable(Integer num, String str, ConsentableType type, ConsentStatus status) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(status, "status");
        this.iabId = num;
        this.extraId = str;
        this.type = type;
        this.status = status;
    }

    public /* synthetic */ ExportConsentable(Integer num, String str, ConsentableType consentableType, ConsentStatus consentStatus, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? ConsentableType.UNKNOWN : consentableType, (i10 & 8) != 0 ? ConsentStatus.PENDING : consentStatus);
    }
}
