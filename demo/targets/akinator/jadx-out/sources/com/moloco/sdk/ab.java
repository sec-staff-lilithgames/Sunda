package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ab extends GeneratedMessageLite.Builder implements bb {
    public ab clearAdapterVer() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).clearAdapterVer();
        return this;
    }

    public ab clearCoreVer() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).clearCoreVer();
        return this;
    }

    @Override // com.moloco.sdk.bb
    public String getAdapterVer() {
        return ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).getAdapterVer();
    }

    @Override // com.moloco.sdk.bb
    public ByteString getAdapterVerBytes() {
        return ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).getAdapterVerBytes();
    }

    @Override // com.moloco.sdk.bb
    public String getCoreVer() {
        return ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).getCoreVer();
    }

    @Override // com.moloco.sdk.bb
    public ByteString getCoreVerBytes() {
        return ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).getCoreVerBytes();
    }

    public ab setAdapterVer(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).setAdapterVer(str);
        return this;
    }

    public ab setAdapterVerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).setAdapterVerBytes(byteString);
        return this;
    }

    public ab setCoreVer(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).setCoreVer(str);
        return this;
    }

    public ab setCoreVerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.MolocoSDK) this.instance).setCoreVerBytes(byteString);
        return this;
    }
}
