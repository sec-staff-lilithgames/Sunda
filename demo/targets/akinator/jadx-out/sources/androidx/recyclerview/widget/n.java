package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public long f7198a = 0;

    /* renamed from: b, reason: collision with root package name */
    public n f7199b;

    public final void a(int i10) {
        if (i10 < 64) {
            this.f7198a &= ~(1 << i10);
            return;
        }
        n nVar = this.f7199b;
        if (nVar != null) {
            nVar.a(i10 - 64);
        }
    }

    public final int b(int i10) {
        n nVar = this.f7199b;
        if (nVar == null) {
            return i10 >= 64 ? Long.bitCount(this.f7198a) : Long.bitCount(this.f7198a & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f7198a & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f7198a) + nVar.b(i10 - 64);
    }

    public final void c() {
        if (this.f7199b == null) {
            this.f7199b = new n();
        }
    }

    public final boolean d(int i10) {
        if (i10 < 64) {
            return (this.f7198a & (1 << i10)) != 0;
        }
        c();
        return this.f7199b.d(i10 - 64);
    }

    public final void e(int i10, boolean z10) {
        if (i10 >= 64) {
            c();
            this.f7199b.e(i10 - 64, z10);
            return;
        }
        long j10 = this.f7198a;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.f7198a = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            h(i10);
        } else {
            a(i10);
        }
        if (z11 || this.f7199b != null) {
            c();
            this.f7199b.e(0, z11);
        }
    }

    public final boolean f(int i10) {
        if (i10 >= 64) {
            c();
            return this.f7199b.f(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f7198a;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.f7198a = j12;
        long j13 = j10 - 1;
        this.f7198a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        n nVar = this.f7199b;
        if (nVar != null) {
            if (nVar.d(0)) {
                h(63);
            }
            this.f7199b.f(0);
        }
        return z10;
    }

    public final void g() {
        this.f7198a = 0L;
        n nVar = this.f7199b;
        if (nVar != null) {
            nVar.g();
        }
    }

    public final void h(int i10) {
        if (i10 < 64) {
            this.f7198a |= 1 << i10;
        } else {
            c();
            this.f7199b.h(i10 - 64);
        }
    }

    public String toString() {
        if (this.f7199b == null) {
            return Long.toBinaryString(this.f7198a);
        }
        return this.f7199b.toString() + "xx" + Long.toBinaryString(this.f7198a);
    }
}
