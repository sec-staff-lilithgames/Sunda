package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public int f58248a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f58249b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58250c = false;

    public y1 build() {
        return new y1(this);
    }

    public x1 setAudioOffloadMode(int i10) {
        this.f58248a = i10;
        return this;
    }

    public x1 setIsGaplessSupportRequired(boolean z10) {
        this.f58249b = z10;
        return this;
    }

    public x1 setIsSpeedChangeSupportRequired(boolean z10) {
        this.f58250c = z10;
        return this;
    }
}
