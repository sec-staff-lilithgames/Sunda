package lc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f73143a;

    /* renamed from: b, reason: collision with root package name */
    public int f73144b;

    /* renamed from: c, reason: collision with root package name */
    public int f73145c;

    public s build() {
        return new s(this.f73143a, this.f73144b, this.f73145c);
    }

    public r maxDeserializerCacheSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxDeserializerCacheSize to a negative value");
        }
        this.f73143a = i10;
        return this;
    }

    public r maxSerializerCacheSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxSerializerCacheSize to a negative value");
        }
        this.f73144b = i10;
        return this;
    }

    public r maxTypeFactoryCacheSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxTypeFactoryCacheSize to a negative value");
        }
        this.f73145c = i10;
        return this;
    }
}
