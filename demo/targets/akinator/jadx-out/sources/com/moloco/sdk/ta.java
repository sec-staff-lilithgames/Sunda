package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ta extends GeneratedMessageLite.Builder implements xa {
    public ta clearModel() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).clearModel();
        return this;
    }

    public ta clearOs() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).clearOs();
        return this;
    }

    public ta clearOsVer() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).clearOsVer();
        return this;
    }

    public ta clearScreenScale() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).clearScreenScale();
        return this;
    }

    @Override // com.moloco.sdk.xa
    public String getModel() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getModel();
    }

    @Override // com.moloco.sdk.xa
    public ByteString getModelBytes() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getModelBytes();
    }

    @Override // com.moloco.sdk.xa
    public wa getOs() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getOs();
    }

    @Override // com.moloco.sdk.xa
    public int getOsValue() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getOsValue();
    }

    @Override // com.moloco.sdk.xa
    public String getOsVer() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getOsVer();
    }

    @Override // com.moloco.sdk.xa
    public ByteString getOsVerBytes() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getOsVerBytes();
    }

    @Override // com.moloco.sdk.xa
    public float getScreenScale() {
        return ((UserIntent$UserAdInteractionExt.Device) this.instance).getScreenScale();
    }

    public ta setModel(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setModel(str);
        return this;
    }

    public ta setModelBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setModelBytes(byteString);
        return this;
    }

    public ta setOs(wa waVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setOs(waVar);
        return this;
    }

    public ta setOsValue(int i10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setOsValue(i10);
        return this;
    }

    public ta setOsVer(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setOsVer(str);
        return this;
    }

    public ta setOsVerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setOsVerBytes(byteString);
        return this;
    }

    public ta setScreenScale(float f10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Device) this.instance).setScreenScale(f10);
        return this;
    }
}
