package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ga extends GeneratedMessageLite.Builder implements ka {
    public ga clearId() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.App) this.instance).clearId();
        return this;
    }

    public ga clearVer() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.App) this.instance).clearVer();
        return this;
    }

    @Override // com.moloco.sdk.ka
    public String getId() {
        return ((UserIntent$UserAdInteractionExt.App) this.instance).getId();
    }

    @Override // com.moloco.sdk.ka
    public ByteString getIdBytes() {
        return ((UserIntent$UserAdInteractionExt.App) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.ka
    public String getVer() {
        return ((UserIntent$UserAdInteractionExt.App) this.instance).getVer();
    }

    @Override // com.moloco.sdk.ka
    public ByteString getVerBytes() {
        return ((UserIntent$UserAdInteractionExt.App) this.instance).getVerBytes();
    }

    public ga setId(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.App) this.instance).setId(str);
        return this;
    }

    public ga setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.App) this.instance).setIdBytes(byteString);
        return this;
    }

    public ga setVer(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.App) this.instance).setVer(str);
        return this;
    }

    public ga setVerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.App) this.instance).setVerBytes(byteString);
        return this;
    }
}
