package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class jb extends GeneratedMessageLite.Builder implements kb {
    public jb clearH() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Size) this.instance).clearH();
        return this;
    }

    public jb clearW() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Size) this.instance).clearW();
        return this;
    }

    @Override // com.moloco.sdk.kb
    public float getH() {
        return ((UserIntent$UserAdInteractionExt.Size) this.instance).getH();
    }

    @Override // com.moloco.sdk.kb
    public float getW() {
        return ((UserIntent$UserAdInteractionExt.Size) this.instance).getW();
    }

    public jb setH(float f10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Size) this.instance).setH(f10);
        return this;
    }

    public jb setW(float f10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Size) this.instance).setW(f10);
        return this;
    }
}
