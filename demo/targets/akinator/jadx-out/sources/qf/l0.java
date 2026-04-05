package qf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f82961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82963c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82964d;

    public l0(int i10, int i11, int i12, int i13) {
        this.f82961a = i10;
        this.f82962b = i11;
        this.f82963c = i12;
        this.f82964d = i13;
    }

    public boolean isFallbackAvailable(int i10) {
        return i10 == 1 ? this.f82961a - this.f82962b > 1 : this.f82963c - this.f82964d > 1;
    }
}
