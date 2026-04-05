package f8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public float f55514a;

    /* renamed from: b, reason: collision with root package name */
    public float f55515b;

    public d(float f10, float f11) {
        this.f55514a = f10;
        this.f55515b = f11;
    }

    public boolean equals(float f10, float f11) {
        return this.f55514a == f10 && this.f55515b == f11;
    }

    public float getScaleX() {
        return this.f55514a;
    }

    public float getScaleY() {
        return this.f55515b;
    }

    public void set(float f10, float f11) {
        this.f55514a = f10;
        this.f55515b = f11;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
