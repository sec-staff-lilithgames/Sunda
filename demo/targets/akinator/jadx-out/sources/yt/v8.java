package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class v8 extends hu.b {

    /* renamed from: b, reason: collision with root package name */
    public final int f96453b;

    /* renamed from: c, reason: collision with root package name */
    public int f96454c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f96455e;

    public v8(int i10, int i11) {
        this.f96454c = i10;
        this.f96453b = i11;
    }

    public abstract void a();

    public abstract void b(long j10);

    @Override // hu.b, vt.l, tw.d
    public final void cancel() {
        this.f96455e = true;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final void clear() {
        this.f96454c = this.f96453b;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final boolean isEmpty() {
        return this.f96454c == this.f96453b;
    }

    @Override // hu.b, vt.l, tw.d
    public final void request(long j10) {
        if (hu.g.validate(j10) && iu.e.add(this, j10) == 0) {
            if (j10 == Long.MAX_VALUE) {
                a();
            } else {
                b(j10);
            }
        }
    }

    @Override // hu.b, vt.l, vt.k
    public final int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final Integer poll() {
        int i10 = this.f96454c;
        if (i10 == this.f96453b) {
            return null;
        }
        this.f96454c = i10 + 1;
        return Integer.valueOf(i10);
    }
}
