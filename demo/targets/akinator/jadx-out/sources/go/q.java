package go;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f58360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58363d;

    public q(int i10, int i11, int i12, int i13) {
        this.f58360a = i10;
        this.f58361b = i11;
        this.f58362c = i12;
        this.f58363d = i13;
    }

    public boolean isFallbackAvailable(int i10) {
        return i10 == 1 ? this.f58360a - this.f58361b > 1 : this.f58362c - this.f58363d > 1;
    }
}
