package io.bidmachine.iab.vast;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f60485a;

    public g(t tVar) {
        this.f60485a = tVar;
    }

    public g addExtra(String str, String str2) {
        this.f60485a.addExtra(str, str2);
        return this;
    }

    public t build() {
        return this.f60485a;
    }

    public g forceUseNativeCloseTime(boolean z10) {
        this.f60485a.f60540m = z10;
        return this;
    }

    public g setAdMeasurer(sm.c cVar) {
        this.f60485a.f60536i = cVar;
        return this;
    }

    public g setAutoClose(boolean z10) {
        this.f60485a.f60543p = z10;
        return this;
    }

    public g setCacheControl(qm.a aVar) {
        this.f60485a.f60529b = aVar;
        return this;
    }

    public g setCompanionCloseTime(int i10) {
        this.f60485a.f60539l = i10;
        return this;
    }

    public g setMaxDuration(int i10) {
        this.f60485a.f60541n = i10;
        return this;
    }

    public g setMediaFilePicker(wm.d dVar) {
        this.f60485a.f60534g = dVar;
        return this;
    }

    public g setPlaceholderTimeoutSec(float f10) {
        this.f60485a.f60537j = f10;
        return this;
    }

    public g setPreloadCompanion(boolean z10) {
        this.f60485a.f60546s = z10;
        return this;
    }

    public g setUseScreenSizeForCompanionOrientation(boolean z10) {
        this.f60485a.f60545r = z10;
        return this;
    }

    public g setUseScreenSizeForVideoOrientation(boolean z10) {
        this.f60485a.f60544q = z10;
        return this;
    }

    public g setVideoCloseTime(int i10) {
        this.f60485a.f60538k = Float.valueOf(i10);
        return this;
    }
}
