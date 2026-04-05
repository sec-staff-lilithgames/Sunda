package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public i f91159a = i.f90961k;

    /* renamed from: b, reason: collision with root package name */
    public int f91160b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f91161c;

    public w build() {
        return new w(this.f91159a, this.f91160b, this.f91161c);
    }

    public v setCallOptions(i iVar) {
        this.f91159a = (i) mh.p1.checkNotNull(iVar, "callOptions cannot be null");
        return this;
    }

    public v setIsTransparentRetry(boolean z10) {
        this.f91161c = z10;
        return this;
    }

    public v setPreviousAttempts(int i10) {
        this.f91160b = i10;
        return this;
    }
}
