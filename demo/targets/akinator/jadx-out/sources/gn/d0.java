package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public long f57850a;

    /* renamed from: b, reason: collision with root package name */
    public long f57851b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f57852c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f57853d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f57854e;

    public e0 build() {
        return new e0(this);
    }

    @Deprecated
    public f0 buildClippingProperties() {
        return new f0(this);
    }

    public d0 setEndPositionMs(long j10) {
        return setEndPositionUs(io.bidmachine.media3.common.util.a1.msToUs(j10));
    }

    public d0 setEndPositionUs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 == Long.MIN_VALUE || j10 >= 0);
        this.f57851b = j10;
        return this;
    }

    public d0 setRelativeToDefaultPosition(boolean z10) {
        this.f57853d = z10;
        return this;
    }

    public d0 setRelativeToLiveWindow(boolean z10) {
        this.f57852c = z10;
        return this;
    }

    public d0 setStartPositionMs(long j10) {
        return setStartPositionUs(io.bidmachine.media3.common.util.a1.msToUs(j10));
    }

    public d0 setStartPositionUs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
        this.f57850a = j10;
        return this;
    }

    public d0 setStartsAtKeyFrame(boolean z10) {
        this.f57854e = z10;
        return this;
    }
}
