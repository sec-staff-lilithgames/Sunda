package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.LocalizedMessage;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m extends GeneratedMessageLite.Builder implements n {
    public m clearLocale() {
        copyOnWrite();
        ((LocalizedMessage) this.instance).clearLocale();
        return this;
    }

    public m clearMessage() {
        copyOnWrite();
        ((LocalizedMessage) this.instance).clearMessage();
        return this;
    }

    @Override // uk.n
    public String getLocale() {
        return ((LocalizedMessage) this.instance).getLocale();
    }

    @Override // uk.n
    public ByteString getLocaleBytes() {
        return ((LocalizedMessage) this.instance).getLocaleBytes();
    }

    @Override // uk.n
    public String getMessage() {
        return ((LocalizedMessage) this.instance).getMessage();
    }

    @Override // uk.n
    public ByteString getMessageBytes() {
        return ((LocalizedMessage) this.instance).getMessageBytes();
    }

    public m setLocale(String str) {
        copyOnWrite();
        ((LocalizedMessage) this.instance).setLocale(str);
        return this;
    }

    public m setLocaleBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LocalizedMessage) this.instance).setLocaleBytes(byteString);
        return this;
    }

    public m setMessage(String str) {
        copyOnWrite();
        ((LocalizedMessage) this.instance).setMessage(str);
        return this;
    }

    public m setMessageBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LocalizedMessage) this.instance).setMessageBytes(byteString);
        return this;
    }
}
