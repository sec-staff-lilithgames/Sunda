package nn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public int f77065b;

    public final boolean a(int i10) {
        return (this.f77065b & i10) == i10;
    }

    public final void addFlag(int i10) {
        this.f77065b = i10 | this.f77065b;
    }

    public void clear() {
        this.f77065b = 0;
    }

    public final void clearFlag(int i10) {
        this.f77065b = (~i10) & this.f77065b;
    }

    public final boolean hasSupplementalData() {
        return a(268435456);
    }

    public final boolean isEndOfStream() {
        return a(4);
    }

    public final boolean isFirstSample() {
        return a(134217728);
    }

    public final boolean isKeyFrame() {
        return a(1);
    }

    public final boolean isLastSample() {
        return a(536870912);
    }

    public final boolean notDependedOn() {
        return a(67108864);
    }

    public final void setFlags(int i10) {
        this.f77065b = i10;
    }
}
