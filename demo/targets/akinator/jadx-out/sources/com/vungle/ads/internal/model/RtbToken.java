package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.CommonRequestBody;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class RtbToken {
    public static final Companion Companion = new Companion(null);
    private final DeviceNode device;
    private final CommonRequestBody.RequestExt ext;
    private final int ordinalView;
    private final RtbRequest request;
    private final CommonRequestBody.User user;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<RtbToken> serializer() {
            return RtbToken$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ RtbToken(int i10, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, @SerialName("ordinal_view") int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (17 != (i10 & 17)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 17, RtbToken$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = rtbRequest;
        }
        this.ordinalView = i11;
    }

    public static /* synthetic */ RtbToken copy$default(RtbToken rtbToken, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deviceNode = rtbToken.device;
        }
        if ((i11 & 2) != 0) {
            user = rtbToken.user;
        }
        if ((i11 & 4) != 0) {
            requestExt = rtbToken.ext;
        }
        if ((i11 & 8) != 0) {
            rtbRequest = rtbToken.request;
        }
        if ((i11 & 16) != 0) {
            i10 = rtbToken.ordinalView;
        }
        int i12 = i10;
        CommonRequestBody.RequestExt requestExt2 = requestExt;
        return rtbToken.copy(deviceNode, user, requestExt2, rtbRequest, i12);
    }

    public static final void write$Self(RtbToken self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.ext != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.request != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, RtbRequest$$serializer.INSTANCE, self.request);
        }
        output.encodeIntElement(serialDesc, 4, self.ordinalView);
    }

    public final DeviceNode component1() {
        return this.device;
    }

    public final CommonRequestBody.User component2() {
        return this.user;
    }

    public final CommonRequestBody.RequestExt component3() {
        return this.ext;
    }

    public final RtbRequest component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    public final RtbToken copy(DeviceNode device, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10) {
        e0.checkNotNullParameter(device, "device");
        return new RtbToken(device, user, requestExt, rtbRequest, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtbToken)) {
            return false;
        }
        RtbToken rtbToken = (RtbToken) obj;
        return e0.areEqual(this.device, rtbToken.device) && e0.areEqual(this.user, rtbToken.user) && e0.areEqual(this.ext, rtbToken.ext) && e0.areEqual(this.request, rtbToken.request) && this.ordinalView == rtbToken.ordinalView;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final RtbRequest getRequest() {
        return this.request;
    }

    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        CommonRequestBody.User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        CommonRequestBody.RequestExt requestExt = this.ext;
        int iHashCode3 = (iHashCode2 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RtbRequest rtbRequest = this.request;
        return Integer.hashCode(this.ordinalView) + ((iHashCode3 + (rtbRequest != null ? rtbRequest.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RtbToken(device=");
        sb2.append(this.device);
        sb2.append(", user=");
        sb2.append(this.user);
        sb2.append(", ext=");
        sb2.append(this.ext);
        sb2.append(", request=");
        sb2.append(this.request);
        sb2.append(", ordinalView=");
        return g.m(sb2, this.ordinalView, ')');
    }

    public RtbToken(DeviceNode device, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10) {
        e0.checkNotNullParameter(device, "device");
        this.device = device;
        this.user = user;
        this.ext = requestExt;
        this.request = rtbRequest;
        this.ordinalView = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RtbToken(DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, u uVar) {
        int i12;
        RtbRequest rtbRequest2;
        user = (i11 & 2) != 0 ? null : user;
        requestExt = (i11 & 4) != 0 ? null : requestExt;
        if ((i11 & 8) != 0) {
            i12 = i10;
            rtbRequest2 = null;
        } else {
            i12 = i10;
            rtbRequest2 = rtbRequest;
        }
        this(deviceNode, user, requestExt, rtbRequest2, i12);
    }

    @SerialName("ordinal_view")
    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}
