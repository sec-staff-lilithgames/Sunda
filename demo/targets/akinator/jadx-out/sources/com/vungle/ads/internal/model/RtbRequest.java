package com.vungle.ads.internal.model;

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
public final class RtbRequest {
    public static final Companion Companion = new Companion(null);
    private final String sdkUserAgent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<RtbRequest> serializer() {
            return RtbRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RtbRequest() {
        this((String) null, 1, (u) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RtbRequest copy$default(RtbRequest rtbRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rtbRequest.sdkUserAgent;
        }
        return rtbRequest.copy(str);
    }

    public static final void write$Self(RtbRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.sdkUserAgent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.sdkUserAgent);
    }

    public final String component1() {
        return this.sdkUserAgent;
    }

    public final RtbRequest copy(String str) {
        return new RtbRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RtbRequest) && e0.areEqual(this.sdkUserAgent, ((RtbRequest) obj).sdkUserAgent);
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("RtbRequest(sdkUserAgent="), this.sdkUserAgent, ')');
    }

    @f
    public /* synthetic */ RtbRequest(int i10, @SerialName("sdk_user_agent") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public RtbRequest(String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ RtbRequest(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    @SerialName("sdk_user_agent")
    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
