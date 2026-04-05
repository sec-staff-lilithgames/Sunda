package kk;

import com.google.geo.type.Viewport;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.LatLng;
import wk.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearHigh() {
        copyOnWrite();
        ((Viewport) this.instance).clearHigh();
        return this;
    }

    public b clearLow() {
        copyOnWrite();
        ((Viewport) this.instance).clearLow();
        return this;
    }

    @Override // kk.c
    public LatLng getHigh() {
        return ((Viewport) this.instance).getHigh();
    }

    @Override // kk.c
    public LatLng getLow() {
        return ((Viewport) this.instance).getLow();
    }

    @Override // kk.c
    public boolean hasHigh() {
        return ((Viewport) this.instance).hasHigh();
    }

    @Override // kk.c
    public boolean hasLow() {
        return ((Viewport) this.instance).hasLow();
    }

    public b mergeHigh(LatLng latLng) {
        copyOnWrite();
        ((Viewport) this.instance).mergeHigh(latLng);
        return this;
    }

    public b mergeLow(LatLng latLng) {
        copyOnWrite();
        ((Viewport) this.instance).mergeLow(latLng);
        return this;
    }

    public b setHigh(LatLng latLng) {
        copyOnWrite();
        ((Viewport) this.instance).setHigh(latLng);
        return this;
    }

    public b setLow(LatLng latLng) {
        copyOnWrite();
        ((Viewport) this.instance).setLow(latLng);
        return this;
    }

    public b setHigh(r rVar) {
        copyOnWrite();
        ((Viewport) this.instance).setHigh((LatLng) rVar.build());
        return this;
    }

    public b setLow(r rVar) {
        copyOnWrite();
        ((Viewport) this.instance).setLow((LatLng) rVar.build());
        return this;
    }
}
