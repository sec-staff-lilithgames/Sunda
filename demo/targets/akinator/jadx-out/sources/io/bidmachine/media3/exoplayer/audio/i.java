package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f60947a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f60948b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f60949c;

    public i() {
    }

    public j build() {
        if (this.f60947a || !(this.f60948b || this.f60949c)) {
            return new j(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public i setIsFormatSupported(boolean z10) {
        this.f60947a = z10;
        return this;
    }

    public i setIsGaplessSupported(boolean z10) {
        this.f60948b = z10;
        return this;
    }

    public i setIsSpeedChangeSupported(boolean z10) {
        this.f60949c = z10;
        return this;
    }

    public i(j jVar) {
        this.f60947a = jVar.f60952a;
        this.f60948b = jVar.f60953b;
        this.f60949c = jVar.f60954c;
    }
}
