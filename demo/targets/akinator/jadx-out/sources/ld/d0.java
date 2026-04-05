package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f73218a;

    public d0(long j10) {
        this.f73218a = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof q0) && this.f73218a == ((q0) obj).getNextRequestWaitMillis();
    }

    @Override // ld.q0
    public long getNextRequestWaitMillis() {
        return this.f73218a;
    }

    public int hashCode() {
        long j10 = this.f73218a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public String toString() {
        return a.b.g(this.f73218a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
