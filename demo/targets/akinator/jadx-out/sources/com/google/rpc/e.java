package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.Help;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e extends GeneratedMessageLite.Builder implements uk.k {
    public e clearDescription() {
        copyOnWrite();
        ((Help.Link) this.instance).clearDescription();
        return this;
    }

    public e clearUrl() {
        copyOnWrite();
        ((Help.Link) this.instance).clearUrl();
        return this;
    }

    @Override // uk.k
    public String getDescription() {
        return ((Help.Link) this.instance).getDescription();
    }

    @Override // uk.k
    public ByteString getDescriptionBytes() {
        return ((Help.Link) this.instance).getDescriptionBytes();
    }

    @Override // uk.k
    public String getUrl() {
        return ((Help.Link) this.instance).getUrl();
    }

    @Override // uk.k
    public ByteString getUrlBytes() {
        return ((Help.Link) this.instance).getUrlBytes();
    }

    public e setDescription(String str) {
        copyOnWrite();
        ((Help.Link) this.instance).setDescription(str);
        return this;
    }

    public e setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Help.Link) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public e setUrl(String str) {
        copyOnWrite();
        ((Help.Link) this.instance).setUrl(str);
        return this;
    }

    public e setUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Help.Link) this.instance).setUrlBytes(byteString);
        return this;
    }
}
