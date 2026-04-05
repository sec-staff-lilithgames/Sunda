package com.sfbx.appconsent.core.model.api.proto;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
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
public final class VendorUrl {
    public static final Companion Companion = new Companion(null);
    private final String legintClaim;
    private final String privacy;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<VendorUrl> serializer() {
            return VendorUrl$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VendorUrl() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ VendorUrl copy$default(VendorUrl vendorUrl, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vendorUrl.privacy;
        }
        if ((i10 & 2) != 0) {
            str2 = vendorUrl.legintClaim;
        }
        return vendorUrl.copy(str, str2);
    }

    public static final void write$Self(VendorUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.privacy != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.privacy);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.legintClaim == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.legintClaim);
    }

    public final String component1() {
        return this.privacy;
    }

    public final String component2() {
        return this.legintClaim;
    }

    public final VendorUrl copy(String str, String str2) {
        return new VendorUrl(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorUrl)) {
            return false;
        }
        VendorUrl vendorUrl = (VendorUrl) obj;
        return e0.areEqual(this.privacy, vendorUrl.privacy) && e0.areEqual(this.legintClaim, vendorUrl.legintClaim);
    }

    public final String getLegintClaim() {
        return this.legintClaim;
    }

    public final String getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        String str = this.privacy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legintClaim;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorUrl(privacy=");
        sb2.append(this.privacy);
        sb2.append(", legintClaim=");
        return o2.q(sb2, this.legintClaim, ')');
    }

    @f
    public /* synthetic */ VendorUrl(int i10, String str, @SerialName("legint_claim") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.privacy = null;
        } else {
            this.privacy = str;
        }
        if ((i10 & 2) == 0) {
            this.legintClaim = null;
        } else {
            this.legintClaim = str2;
        }
    }

    public VendorUrl(String str, String str2) {
        this.privacy = str;
        this.legintClaim = str2;
    }

    public /* synthetic */ VendorUrl(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    @SerialName("legint_claim")
    public static /* synthetic */ void getLegintClaim$annotations() {
    }
}
