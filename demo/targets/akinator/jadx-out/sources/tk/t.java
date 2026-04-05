package tk;

import com.google.longrunning.OperationInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t extends GeneratedMessageLite.Builder implements u {
    public t clearMetadataType() {
        copyOnWrite();
        ((OperationInfo) this.instance).clearMetadataType();
        return this;
    }

    public t clearResponseType() {
        copyOnWrite();
        ((OperationInfo) this.instance).clearResponseType();
        return this;
    }

    @Override // tk.u
    public String getMetadataType() {
        return ((OperationInfo) this.instance).getMetadataType();
    }

    @Override // tk.u
    public ByteString getMetadataTypeBytes() {
        return ((OperationInfo) this.instance).getMetadataTypeBytes();
    }

    @Override // tk.u
    public String getResponseType() {
        return ((OperationInfo) this.instance).getResponseType();
    }

    @Override // tk.u
    public ByteString getResponseTypeBytes() {
        return ((OperationInfo) this.instance).getResponseTypeBytes();
    }

    public t setMetadataType(String str) {
        copyOnWrite();
        ((OperationInfo) this.instance).setMetadataType(str);
        return this;
    }

    public t setMetadataTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((OperationInfo) this.instance).setMetadataTypeBytes(byteString);
        return this;
    }

    public t setResponseType(String str) {
        copyOnWrite();
        ((OperationInfo) this.instance).setResponseType(str);
        return this;
    }

    public t setResponseTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((OperationInfo) this.instance).setResponseTypeBytes(byteString);
        return this;
    }
}
