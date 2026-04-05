package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class cb extends GeneratedMessageLite.Builder implements gb {
    public cb clearCarrier() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Network) this.instance).clearCarrier();
        return this;
    }

    public cb clearConnectionType() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Network) this.instance).clearConnectionType();
        return this;
    }

    @Override // com.moloco.sdk.gb
    public String getCarrier() {
        return ((UserIntent$UserAdInteractionExt.Network) this.instance).getCarrier();
    }

    @Override // com.moloco.sdk.gb
    public ByteString getCarrierBytes() {
        return ((UserIntent$UserAdInteractionExt.Network) this.instance).getCarrierBytes();
    }

    @Override // com.moloco.sdk.gb
    public fb getConnectionType() {
        return ((UserIntent$UserAdInteractionExt.Network) this.instance).getConnectionType();
    }

    @Override // com.moloco.sdk.gb
    public int getConnectionTypeValue() {
        return ((UserIntent$UserAdInteractionExt.Network) this.instance).getConnectionTypeValue();
    }

    public cb setCarrier(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Network) this.instance).setCarrier(str);
        return this;
    }

    public cb setCarrierBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Network) this.instance).setCarrierBytes(byteString);
        return this;
    }

    public cb setConnectionType(fb fbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Network) this.instance).setConnectionType(fbVar);
        return this;
    }

    public cb setConnectionTypeValue(int i10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Network) this.instance).setConnectionTypeValue(i10);
        return this;
    }
}
