package wk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Quaternion;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 extends GeneratedMessageLite.Builder implements b0 {
    public a0 clearW() {
        copyOnWrite();
        ((Quaternion) this.instance).clearW();
        return this;
    }

    public a0 clearX() {
        copyOnWrite();
        ((Quaternion) this.instance).clearX();
        return this;
    }

    public a0 clearY() {
        copyOnWrite();
        ((Quaternion) this.instance).clearY();
        return this;
    }

    public a0 clearZ() {
        copyOnWrite();
        ((Quaternion) this.instance).clearZ();
        return this;
    }

    @Override // wk.b0
    public double getW() {
        return ((Quaternion) this.instance).getW();
    }

    @Override // wk.b0
    public double getX() {
        return ((Quaternion) this.instance).getX();
    }

    @Override // wk.b0
    public double getY() {
        return ((Quaternion) this.instance).getY();
    }

    @Override // wk.b0
    public double getZ() {
        return ((Quaternion) this.instance).getZ();
    }

    public a0 setW(double d10) {
        copyOnWrite();
        ((Quaternion) this.instance).setW(d10);
        return this;
    }

    public a0 setX(double d10) {
        copyOnWrite();
        ((Quaternion) this.instance).setX(d10);
        return this;
    }

    public a0 setY(double d10) {
        copyOnWrite();
        ((Quaternion) this.instance).setY(d10);
        return this;
    }

    public a0 setZ(double d10) {
        copyOnWrite();
        ((Quaternion) this.instance).setZ(d10);
        return this;
    }
}
