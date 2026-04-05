package lh;

import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends GeneratedMessageLite.Builder implements l {
    public k clearCallerIp() {
        copyOnWrite();
        ((RequestMetadata) this.instance).clearCallerIp();
        return this;
    }

    public k clearCallerSuppliedUserAgent() {
        copyOnWrite();
        ((RequestMetadata) this.instance).clearCallerSuppliedUserAgent();
        return this;
    }

    @Override // lh.l
    public String getCallerIp() {
        return ((RequestMetadata) this.instance).getCallerIp();
    }

    @Override // lh.l
    public ByteString getCallerIpBytes() {
        return ((RequestMetadata) this.instance).getCallerIpBytes();
    }

    @Override // lh.l
    public String getCallerSuppliedUserAgent() {
        return ((RequestMetadata) this.instance).getCallerSuppliedUserAgent();
    }

    @Override // lh.l
    public ByteString getCallerSuppliedUserAgentBytes() {
        return ((RequestMetadata) this.instance).getCallerSuppliedUserAgentBytes();
    }

    public k setCallerIp(String str) {
        copyOnWrite();
        ((RequestMetadata) this.instance).setCallerIp(str);
        return this;
    }

    public k setCallerIpBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((RequestMetadata) this.instance).setCallerIpBytes(byteString);
        return this;
    }

    public k setCallerSuppliedUserAgent(String str) {
        copyOnWrite();
        ((RequestMetadata) this.instance).setCallerSuppliedUserAgent(str);
        return this;
    }

    public k setCallerSuppliedUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((RequestMetadata) this.instance).setCallerSuppliedUserAgentBytes(byteString);
        return this;
    }
}
