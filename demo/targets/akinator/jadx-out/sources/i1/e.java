package i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public float f59340a;

    /* renamed from: b, reason: collision with root package name */
    public float f59341b;

    /* renamed from: c, reason: collision with root package name */
    public float f59342c;

    /* renamed from: d, reason: collision with root package name */
    public float f59343d;

    public e(float f10, float f11, float f12, float f13) {
        this.f59340a = f10;
        this.f59341b = f11;
        this.f59342c = f12;
        this.f59343d = f13;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4166containsk4lQ0M(long j10) {
        return h.m4185getXimpl(j10) >= this.f59340a && h.m4185getXimpl(j10) < this.f59342c && h.m4186getYimpl(j10) >= this.f59341b && h.m4186getYimpl(j10) < this.f59343d;
    }

    public final float getBottom() {
        return this.f59343d;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.f59340a;
    }

    public final float getRight() {
        return this.f59342c;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4167getSizeNHjbRc() {
        return p.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.f59341b;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final void intersect(float f10, float f11, float f12, float f13) {
        this.f59340a = Math.max(f10, this.f59340a);
        this.f59341b = Math.max(f11, this.f59341b);
        this.f59342c = Math.min(f12, this.f59342c);
        this.f59343d = Math.min(f13, this.f59343d);
    }

    public final boolean isEmpty() {
        return this.f59340a >= this.f59342c || this.f59341b >= this.f59343d;
    }

    public final void set(float f10, float f11, float f12, float f13) {
        this.f59340a = f10;
        this.f59341b = f11;
        this.f59342c = f12;
        this.f59343d = f13;
    }

    public final void setBottom(float f10) {
        this.f59343d = f10;
    }

    public final void setLeft(float f10) {
        this.f59340a = f10;
    }

    public final void setRight(float f10) {
        this.f59342c = f10;
    }

    public final void setTop(float f10) {
        this.f59341b = f10;
    }

    public String toString() {
        return "MutableRect(" + d.toStringAsFixed(this.f59340a, 1) + ", " + d.toStringAsFixed(this.f59341b, 1) + ", " + d.toStringAsFixed(this.f59342c, 1) + ", " + d.toStringAsFixed(this.f59343d, 1) + ')';
    }
}
