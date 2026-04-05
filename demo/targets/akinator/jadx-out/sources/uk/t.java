package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.RequestInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t extends GeneratedMessageLite.Builder implements u {
    public t clearRequestId() {
        copyOnWrite();
        ((RequestInfo) this.instance).clearRequestId();
        return this;
    }

    public t clearServingData() {
        copyOnWrite();
        ((RequestInfo) this.instance).clearServingData();
        return this;
    }

    @Override // uk.u
    public String getRequestId() {
        return ((RequestInfo) this.instance).getRequestId();
    }

    @Override // uk.u
    public ByteString getRequestIdBytes() {
        return ((RequestInfo) this.instance).getRequestIdBytes();
    }

    @Override // uk.u
    public String getServingData() {
        return ((RequestInfo) this.instance).getServingData();
    }

    @Override // uk.u
    public ByteString getServingDataBytes() {
        return ((RequestInfo) this.instance).getServingDataBytes();
    }

    public t setRequestId(String str) {
        copyOnWrite();
        ((RequestInfo) this.instance).setRequestId(str);
        return this;
    }

    public t setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((RequestInfo) this.instance).setRequestIdBytes(byteString);
        return this;
    }

    public t setServingData(String str) {
        copyOnWrite();
        ((RequestInfo) this.instance).setServingData(str);
        return this;
    }

    public t setServingDataBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((RequestInfo) this.instance).setServingDataBytes(byteString);
        return this;
    }
}
