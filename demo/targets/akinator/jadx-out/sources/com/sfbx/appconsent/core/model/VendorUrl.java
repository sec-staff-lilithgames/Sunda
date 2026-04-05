package com.sfbx.appconsent.core.model;

import ao.kwoC.zAQQWzBxnS;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class VendorUrl {
    public static final Companion Companion = new Companion(null);
    private final String legintClaimUrl;
    private final String policyUrl;

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
            str = vendorUrl.policyUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = vendorUrl.legintClaimUrl;
        }
        return vendorUrl.copy(str, str2);
    }

    @SerialName("legIntClaimUrl")
    public static /* synthetic */ void getLegintClaimUrl$annotations() {
    }

    public static final void write$Self(VendorUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.policyUrl, "")) {
            output.encodeStringElement(serialDesc, 0, self.policyUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && e0.areEqual(self.legintClaimUrl, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.legintClaimUrl);
    }

    public final String component1() {
        return this.policyUrl;
    }

    public final String component2() {
        return this.legintClaimUrl;
    }

    public final VendorUrl copy(String policyUrl, String legintClaimUrl) {
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(legintClaimUrl, "legintClaimUrl");
        return new VendorUrl(policyUrl, legintClaimUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorUrl)) {
            return false;
        }
        VendorUrl vendorUrl = (VendorUrl) obj;
        return e0.areEqual(this.policyUrl, vendorUrl.policyUrl) && e0.areEqual(this.legintClaimUrl, vendorUrl.legintClaimUrl);
    }

    public final String getLegintClaimUrl() {
        return this.legintClaimUrl;
    }

    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    public int hashCode() {
        return this.legintClaimUrl.hashCode() + (this.policyUrl.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorUrl(policyUrl=");
        sb2.append(this.policyUrl);
        sb2.append(", legintClaimUrl=");
        return o2.q(sb2, this.legintClaimUrl, ')');
    }

    @f
    public /* synthetic */ VendorUrl(int i10, String str, @SerialName("legIntClaimUrl") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        int i11 = i10 & 1;
        String str3 = zAQQWzBxnS.gFAWqQHbodu;
        if (i11 == 0) {
            this.policyUrl = str3;
        } else {
            this.policyUrl = str;
        }
        if ((i10 & 2) == 0) {
            this.legintClaimUrl = str3;
        } else {
            this.legintClaimUrl = str2;
        }
    }

    public VendorUrl(String policyUrl, String legintClaimUrl) {
        e0.checkNotNullParameter(policyUrl, "policyUrl");
        e0.checkNotNullParameter(legintClaimUrl, "legintClaimUrl");
        this.policyUrl = policyUrl;
        this.legintClaimUrl = legintClaimUrl;
    }

    public /* synthetic */ VendorUrl(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
