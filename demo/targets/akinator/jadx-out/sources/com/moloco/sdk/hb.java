package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class hb extends GeneratedMessageLite.Builder implements ib {
    public hb clearX() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Position) this.instance).clearX();
        return this;
    }

    public hb clearY() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Position) this.instance).clearY();
        return this;
    }

    @Override // com.moloco.sdk.ib
    public float getX() {
        return ((UserIntent$UserAdInteractionExt.Position) this.instance).getX();
    }

    @Override // com.moloco.sdk.ib
    public float getY() {
        return ((UserIntent$UserAdInteractionExt.Position) this.instance).getY();
    }

    public hb setX(float f10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Position) this.instance).setX(f10);
        return this;
    }

    public hb setY(float f10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Position) this.instance).setY(f10);
        return this;
    }
}
