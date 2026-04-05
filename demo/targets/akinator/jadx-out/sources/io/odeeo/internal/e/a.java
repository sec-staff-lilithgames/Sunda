package io.odeeo.internal.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f63680a;

    public final boolean a(int i10) {
        return (this.f63680a & i10) == i10;
    }

    public final void addFlag(int i10) {
        this.f63680a = i10 | this.f63680a;
    }

    public void clear() {
        this.f63680a = 0;
    }

    public final void clearFlag(int i10) {
        this.f63680a = (~i10) & this.f63680a;
    }

    public final boolean hasSupplementalData() {
        return a(268435456);
    }

    public final boolean isDecodeOnly() {
        return a(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return a(4);
    }

    public final boolean isKeyFrame() {
        return a(1);
    }

    public final void setFlags(int i10) {
        this.f63680a = i10;
    }
}
