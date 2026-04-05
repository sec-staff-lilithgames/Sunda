package com.sfbx.appconsent.core.model.api.proto;

import a.b;
import com.inmobi.sdk.InMobiSdk;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class CountryProto {
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final boolean gdpr;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<CountryProto> serializer() {
            return CountryProto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryProto() {
        this((String) null, false, 3, (u) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CountryProto copy$default(CountryProto countryProto, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = countryProto.code;
        }
        if ((i10 & 2) != 0) {
            z10 = countryProto.gdpr;
        }
        return countryProto.copy(str, z10);
    }

    public static final void write$Self(CountryProto self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.code, "")) {
            output.encodeStringElement(serialDesc, 0, self.code);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gdpr) {
            output.encodeBooleanElement(serialDesc, 1, self.gdpr);
        }
    }

    public final String component1() {
        return this.code;
    }

    public final boolean component2() {
        return this.gdpr;
    }

    public final CountryProto copy(String code, boolean z10) {
        e0.checkNotNullParameter(code, "code");
        return new CountryProto(code, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryProto)) {
            return false;
        }
        CountryProto countryProto = (CountryProto) obj;
        return e0.areEqual(this.code, countryProto.code) && this.gdpr == countryProto.gdpr;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getGdpr() {
        return this.gdpr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        boolean z10 = this.gdpr;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CountryProto(code=");
        sb2.append(this.code);
        sb2.append(", gdpr=");
        return b.p(sb2, this.gdpr, ')');
    }

    @f
    public /* synthetic */ CountryProto(int i10, @SerialName("code") String str, @SerialName(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES) boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        this.code = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.gdpr = false;
        } else {
            this.gdpr = z10;
        }
    }

    public CountryProto(String code, boolean z10) {
        e0.checkNotNullParameter(code, "code");
        this.code = code;
        this.gdpr = z10;
    }

    public /* synthetic */ CountryProto(String str, boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }

    @SerialName("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @SerialName(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES)
    public static /* synthetic */ void getGdpr$annotations() {
    }
}
