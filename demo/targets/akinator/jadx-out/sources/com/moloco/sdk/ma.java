package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ma extends GeneratedMessageLite.Builder implements qa {
    public ma clearPos() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).clearPos();
        return this;
    }

    public ma clearSize() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).clearSize();
        return this;
    }

    public ma clearType() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).clearType();
        return this;
    }

    @Override // com.moloco.sdk.qa
    public UserIntent$UserAdInteractionExt.Position getPos() {
        return ((UserIntent$UserAdInteractionExt.Button) this.instance).getPos();
    }

    @Override // com.moloco.sdk.qa
    public UserIntent$UserAdInteractionExt.Size getSize() {
        return ((UserIntent$UserAdInteractionExt.Button) this.instance).getSize();
    }

    @Override // com.moloco.sdk.qa
    public pa getType() {
        return ((UserIntent$UserAdInteractionExt.Button) this.instance).getType();
    }

    @Override // com.moloco.sdk.qa
    public int getTypeValue() {
        return ((UserIntent$UserAdInteractionExt.Button) this.instance).getTypeValue();
    }

    @Override // com.moloco.sdk.qa
    public boolean hasPos() {
        return ((UserIntent$UserAdInteractionExt.Button) this.instance).hasPos();
    }

    @Override // com.moloco.sdk.qa
    public boolean hasSize() {
        return ((UserIntent$UserAdInteractionExt.Button) this.instance).hasSize();
    }

    public ma mergePos(UserIntent$UserAdInteractionExt.Position position) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).mergePos(position);
        return this;
    }

    public ma mergeSize(UserIntent$UserAdInteractionExt.Size size) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).mergeSize(size);
        return this;
    }

    public ma setPos(UserIntent$UserAdInteractionExt.Position position) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).setPos(position);
        return this;
    }

    public ma setSize(UserIntent$UserAdInteractionExt.Size size) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).setSize(size);
        return this;
    }

    public ma setType(pa paVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).setType(paVar);
        return this;
    }

    public ma setTypeValue(int i10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).setTypeValue(i10);
        return this;
    }

    public ma setPos(hb hbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).setPos((UserIntent$UserAdInteractionExt.Position) hbVar.build());
        return this;
    }

    public ma setSize(jb jbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.Button) this.instance).setSize((UserIntent$UserAdInteractionExt.Size) jbVar.build());
        return this;
    }
}
