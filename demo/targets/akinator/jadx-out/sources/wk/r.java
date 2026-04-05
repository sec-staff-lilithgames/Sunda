package wk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.type.LatLng;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r extends GeneratedMessageLite.Builder implements s {
    public r clearLatitude() {
        copyOnWrite();
        ((LatLng) this.instance).clearLatitude();
        return this;
    }

    public r clearLongitude() {
        copyOnWrite();
        ((LatLng) this.instance).clearLongitude();
        return this;
    }

    @Override // wk.s
    public double getLatitude() {
        return ((LatLng) this.instance).getLatitude();
    }

    @Override // wk.s
    public double getLongitude() {
        return ((LatLng) this.instance).getLongitude();
    }

    public r setLatitude(double d10) {
        copyOnWrite();
        ((LatLng) this.instance).setLatitude(d10);
        return this;
    }

    public r setLongitude(double d10) {
        copyOnWrite();
        ((LatLng) this.instance).setLongitude(d10);
        return this;
    }
}
