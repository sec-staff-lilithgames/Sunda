package com.vungle.ads.internal.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class OmSdkData {
    public static final Companion Companion = new Companion(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<OmSdkData> serializer() {
            return OmSdkData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OmSdkData() {
        this((String) null, (String) null, (String) null, 7, (u) null);
    }

    public static /* synthetic */ OmSdkData copy$default(OmSdkData omSdkData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = omSdkData.params;
        }
        if ((i10 & 2) != 0) {
            str2 = omSdkData.vendorKey;
        }
        if ((i10 & 4) != 0) {
            str3 = omSdkData.vendorURL;
        }
        return omSdkData.copy(str, str2, str3);
    }

    public static final void write$Self(OmSdkData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.params != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.params);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.vendorKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.vendorKey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.vendorURL == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.vendorURL);
    }

    public final String component1() {
        return this.params;
    }

    public final String component2() {
        return this.vendorKey;
    }

    public final String component3() {
        return this.vendorURL;
    }

    public final OmSdkData copy(String str, String str2, String str3) {
        return new OmSdkData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmSdkData)) {
            return false;
        }
        OmSdkData omSdkData = (OmSdkData) obj;
        return e0.areEqual(this.params, omSdkData.params) && e0.areEqual(this.vendorKey, omSdkData.vendorKey) && e0.areEqual(this.vendorURL, omSdkData.vendorURL);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        String str = this.params;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OmSdkData(params=");
        sb2.append(this.params);
        sb2.append(", vendorKey=");
        sb2.append(this.vendorKey);
        sb2.append(", vendorURL=");
        return o2.q(sb2, this.vendorURL, ')');
    }

    @f
    public /* synthetic */ OmSdkData(int i10, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i10 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i10 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public OmSdkData(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ OmSdkData(String str, String str2, String str3, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
