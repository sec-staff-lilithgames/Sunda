package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.context.AttributeContext;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends GeneratedMessageLite.Builder implements vk.b {
    public a clearOperation() {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).clearOperation();
        return this;
    }

    public a clearProtocol() {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).clearProtocol();
        return this;
    }

    public a clearService() {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).clearService();
        return this;
    }

    public a clearVersion() {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).clearVersion();
        return this;
    }

    @Override // vk.b
    public String getOperation() {
        return ((AttributeContext.Api) this.instance).getOperation();
    }

    @Override // vk.b
    public ByteString getOperationBytes() {
        return ((AttributeContext.Api) this.instance).getOperationBytes();
    }

    @Override // vk.b
    public String getProtocol() {
        return ((AttributeContext.Api) this.instance).getProtocol();
    }

    @Override // vk.b
    public ByteString getProtocolBytes() {
        return ((AttributeContext.Api) this.instance).getProtocolBytes();
    }

    @Override // vk.b
    public String getService() {
        return ((AttributeContext.Api) this.instance).getService();
    }

    @Override // vk.b
    public ByteString getServiceBytes() {
        return ((AttributeContext.Api) this.instance).getServiceBytes();
    }

    @Override // vk.b
    public String getVersion() {
        return ((AttributeContext.Api) this.instance).getVersion();
    }

    @Override // vk.b
    public ByteString getVersionBytes() {
        return ((AttributeContext.Api) this.instance).getVersionBytes();
    }

    public a setOperation(String str) {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setOperation(str);
        return this;
    }

    public a setOperationBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setOperationBytes(byteString);
        return this;
    }

    public a setProtocol(String str) {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setProtocol(str);
        return this;
    }

    public a setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setProtocolBytes(byteString);
        return this;
    }

    public a setService(String str) {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setService(str);
        return this;
    }

    public a setServiceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setServiceBytes(byteString);
        return this;
    }

    public a setVersion(String str) {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setVersion(str);
        return this;
    }

    public a setVersionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Api) this.instance).setVersionBytes(byteString);
        return this;
    }
}
