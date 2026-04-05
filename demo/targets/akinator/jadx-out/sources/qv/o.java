package qv;

import java.util.NoSuchElementException;
import uu.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f83543b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83544c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83545e;

    /* renamed from: f, reason: collision with root package name */
    public long f83546f;

    public o(long j10, long j11, long j12) {
        this.f83543b = j12;
        this.f83544c = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f83545e = z10;
        this.f83546f = z10 ? j10 : j11;
    }

    public final long getStep() {
        return this.f83543b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f83545e;
    }

    @Override // uu.k1
    public long nextLong() {
        long j10 = this.f83546f;
        if (j10 != this.f83544c) {
            this.f83546f = this.f83543b + j10;
            return j10;
        }
        if (!this.f83545e) {
            throw new NoSuchElementException();
        }
        this.f83545e = false;
        return j10;
    }
}
