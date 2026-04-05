package ed;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public long f54100c = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f54099b = 16;

    /* renamed from: a, reason: collision with root package name */
    public int f54098a = 16;

    public v build() {
        boolean z10 = this.f54100c >= 0;
        int i10 = v.f54130q;
        if (z10) {
            return new v(this);
        }
        throw new IllegalStateException();
    }

    public f concurrencyLevel(int i10) {
        boolean z10 = i10 > 0;
        int i11 = v.f54130q;
        if (!z10) {
            throw new IllegalArgumentException();
        }
        this.f54098a = i10;
        return this;
    }

    public f initialCapacity(int i10) {
        boolean z10 = i10 >= 0;
        int i11 = v.f54130q;
        if (!z10) {
            throw new IllegalArgumentException();
        }
        this.f54099b = i10;
        return this;
    }

    public f maximumCapacity(long j10) {
        boolean z10 = j10 >= 0;
        int i10 = v.f54130q;
        if (!z10) {
            throw new IllegalArgumentException();
        }
        this.f54100c = j10;
        return this;
    }
}
