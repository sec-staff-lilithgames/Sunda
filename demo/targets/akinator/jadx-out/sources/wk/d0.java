package wk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.type.TimeOfDay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d0 extends GeneratedMessageLite.Builder implements e0 {
    public d0 clearHours() {
        copyOnWrite();
        ((TimeOfDay) this.instance).clearHours();
        return this;
    }

    public d0 clearMinutes() {
        copyOnWrite();
        ((TimeOfDay) this.instance).clearMinutes();
        return this;
    }

    public d0 clearNanos() {
        copyOnWrite();
        ((TimeOfDay) this.instance).clearNanos();
        return this;
    }

    public d0 clearSeconds() {
        copyOnWrite();
        ((TimeOfDay) this.instance).clearSeconds();
        return this;
    }

    @Override // wk.e0
    public int getHours() {
        return ((TimeOfDay) this.instance).getHours();
    }

    @Override // wk.e0
    public int getMinutes() {
        return ((TimeOfDay) this.instance).getMinutes();
    }

    @Override // wk.e0
    public int getNanos() {
        return ((TimeOfDay) this.instance).getNanos();
    }

    @Override // wk.e0
    public int getSeconds() {
        return ((TimeOfDay) this.instance).getSeconds();
    }

    public d0 setHours(int i10) {
        copyOnWrite();
        ((TimeOfDay) this.instance).setHours(i10);
        return this;
    }

    public d0 setMinutes(int i10) {
        copyOnWrite();
        ((TimeOfDay) this.instance).setMinutes(i10);
        return this;
    }

    public d0 setNanos(int i10) {
        copyOnWrite();
        ((TimeOfDay) this.instance).setNanos(i10);
        return this;
    }

    public d0 setSeconds(int i10) {
        copyOnWrite();
        ((TimeOfDay) this.instance).setSeconds(i10);
        return this;
    }
}
