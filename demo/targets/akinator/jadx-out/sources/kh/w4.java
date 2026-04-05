package kh;

import com.google.api.SystemParameter;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w4 extends GeneratedMessageLite.Builder implements x4 {
    public w4 clearHttpHeader() {
        copyOnWrite();
        ((SystemParameter) this.instance).clearHttpHeader();
        return this;
    }

    public w4 clearName() {
        copyOnWrite();
        ((SystemParameter) this.instance).clearName();
        return this;
    }

    public w4 clearUrlQueryParameter() {
        copyOnWrite();
        ((SystemParameter) this.instance).clearUrlQueryParameter();
        return this;
    }

    @Override // kh.x4
    public String getHttpHeader() {
        return ((SystemParameter) this.instance).getHttpHeader();
    }

    @Override // kh.x4
    public ByteString getHttpHeaderBytes() {
        return ((SystemParameter) this.instance).getHttpHeaderBytes();
    }

    @Override // kh.x4
    public String getName() {
        return ((SystemParameter) this.instance).getName();
    }

    @Override // kh.x4
    public ByteString getNameBytes() {
        return ((SystemParameter) this.instance).getNameBytes();
    }

    @Override // kh.x4
    public String getUrlQueryParameter() {
        return ((SystemParameter) this.instance).getUrlQueryParameter();
    }

    @Override // kh.x4
    public ByteString getUrlQueryParameterBytes() {
        return ((SystemParameter) this.instance).getUrlQueryParameterBytes();
    }

    public w4 setHttpHeader(String str) {
        copyOnWrite();
        ((SystemParameter) this.instance).setHttpHeader(str);
        return this;
    }

    public w4 setHttpHeaderBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((SystemParameter) this.instance).setHttpHeaderBytes(byteString);
        return this;
    }

    public w4 setName(String str) {
        copyOnWrite();
        ((SystemParameter) this.instance).setName(str);
        return this;
    }

    public w4 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((SystemParameter) this.instance).setNameBytes(byteString);
        return this;
    }

    public w4 setUrlQueryParameter(String str) {
        copyOnWrite();
        ((SystemParameter) this.instance).setUrlQueryParameter(str);
        return this;
    }

    public w4 setUrlQueryParameterBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((SystemParameter) this.instance).setUrlQueryParameterBytes(byteString);
        return this;
    }
}
