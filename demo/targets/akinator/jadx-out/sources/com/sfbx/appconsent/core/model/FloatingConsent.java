package com.sfbx.appconsent.core.model;

import com.sfbx.appconsent.core.model.reducer.TimestampSurrogate;
import com.sfbx.appconsent.core.model.reducer.TimestampSurrogate$$serializer;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class FloatingConsent {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> externalIds;
    private final TimestampSurrogate givenAt;

    /* renamed from: id, reason: collision with root package name */
    private final String f50518id;
    private final ConsentStatus status;
    private final String uuid;
    private final Integer version;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<FloatingConsent> serializer() {
            return FloatingConsent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FloatingConsent() {
        this((String) null, (Map) null, (Integer) null, (String) null, (TimestampSurrogate) null, (ConsentStatus) null, 63, (u) null);
    }

    public static /* synthetic */ FloatingConsent copy$default(FloatingConsent floatingConsent, String str, Map map, Integer num, String str2, TimestampSurrogate timestampSurrogate, ConsentStatus consentStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = floatingConsent.f50518id;
        }
        if ((i10 & 2) != 0) {
            map = floatingConsent.externalIds;
        }
        if ((i10 & 4) != 0) {
            num = floatingConsent.version;
        }
        if ((i10 & 8) != 0) {
            str2 = floatingConsent.uuid;
        }
        if ((i10 & 16) != 0) {
            timestampSurrogate = floatingConsent.givenAt;
        }
        if ((i10 & 32) != 0) {
            consentStatus = floatingConsent.status;
        }
        TimestampSurrogate timestampSurrogate2 = timestampSurrogate;
        ConsentStatus consentStatus2 = consentStatus;
        return floatingConsent.copy(str, map, num, str2, timestampSurrogate2, consentStatus2);
    }

    public static final void write$Self(FloatingConsent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f50518id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.f50518id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.externalIds != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.externalIds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.version != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.uuid != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.uuid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.givenAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, TimestampSurrogate$$serializer.INSTANCE, self.givenAt);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.status == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
    }

    public final String component1() {
        return this.f50518id;
    }

    public final Map<String, String> component2() {
        return this.externalIds;
    }

    public final Integer component3() {
        return this.version;
    }

    public final String component4() {
        return this.uuid;
    }

    public final TimestampSurrogate component5() {
        return this.givenAt;
    }

    public final ConsentStatus component6() {
        return this.status;
    }

    public final FloatingConsent copy(String str, Map<String, String> map, Integer num, String str2, TimestampSurrogate timestampSurrogate, ConsentStatus consentStatus) {
        return new FloatingConsent(str, map, num, str2, timestampSurrogate, consentStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatingConsent)) {
            return false;
        }
        FloatingConsent floatingConsent = (FloatingConsent) obj;
        return e0.areEqual(this.f50518id, floatingConsent.f50518id) && e0.areEqual(this.externalIds, floatingConsent.externalIds) && e0.areEqual(this.version, floatingConsent.version) && e0.areEqual(this.uuid, floatingConsent.uuid) && e0.areEqual(this.givenAt, floatingConsent.givenAt) && this.status == floatingConsent.status;
    }

    public final Map<String, String> getExternalIds() {
        return this.externalIds;
    }

    public final TimestampSurrogate getGivenAt() {
        return this.givenAt;
    }

    public final String getId() {
        return this.f50518id;
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.f50518id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.externalIds;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.version;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.uuid;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TimestampSurrogate timestampSurrogate = this.givenAt;
        int iHashCode5 = (iHashCode4 + (timestampSurrogate == null ? 0 : timestampSurrogate.hashCode())) * 31;
        ConsentStatus consentStatus = this.status;
        return iHashCode5 + (consentStatus != null ? consentStatus.hashCode() : 0);
    }

    public String toString() {
        return "FloatingConsent(id=" + this.f50518id + ", externalIds=" + this.externalIds + ", version=" + this.version + ", uuid=" + this.uuid + ", givenAt=" + this.givenAt + ", status=" + this.status + ')';
    }

    @f
    public /* synthetic */ FloatingConsent(int i10, String str, Map map, Integer num, String str2, TimestampSurrogate timestampSurrogate, ConsentStatus consentStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.f50518id = null;
        } else {
            this.f50518id = str;
        }
        if ((i10 & 2) == 0) {
            this.externalIds = null;
        } else {
            this.externalIds = map;
        }
        if ((i10 & 4) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 8) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str2;
        }
        if ((i10 & 16) == 0) {
            this.givenAt = null;
        } else {
            this.givenAt = timestampSurrogate;
        }
        if ((i10 & 32) == 0) {
            this.status = null;
        } else {
            this.status = consentStatus;
        }
    }

    public FloatingConsent(String str, Map<String, String> map, Integer num, String str2, TimestampSurrogate timestampSurrogate, ConsentStatus consentStatus) {
        this.f50518id = str;
        this.externalIds = map;
        this.version = num;
        this.uuid = str2;
        this.givenAt = timestampSurrogate;
        this.status = consentStatus;
    }

    public /* synthetic */ FloatingConsent(String str, Map map, Integer num, String str2, TimestampSurrogate timestampSurrogate, ConsentStatus consentStatus, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : timestampSurrogate, (i10 & 32) != 0 ? null : consentStatus);
    }
}
