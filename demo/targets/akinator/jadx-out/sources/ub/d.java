package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f88200a;

    /* renamed from: b, reason: collision with root package name */
    public int f88201b;

    public e build() {
        return new e(this.f88200a, this.f88201b);
    }

    public d maxErrorTokenLength(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format("Value of maxErrorTokenLength (%d) cannot be negative", Integer.valueOf(i10)));
        }
        this.f88200a = i10;
        return this;
    }

    public d maxRawContentLength(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format("Value of maxRawContentLength (%d) cannot be negative", Integer.valueOf(i10)));
        }
        this.f88201b = i10;
        return this;
    }
}
