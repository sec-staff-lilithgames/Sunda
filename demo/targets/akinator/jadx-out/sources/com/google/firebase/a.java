package com.google.firebase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f29657a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29658b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29659c;

    public a(long j10, long j11, long j12) {
        this.f29657a = j10;
        this.f29658b = j11;
        this.f29659c = j12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f29657a == lVar.getEpochMillis() && this.f29658b == lVar.getElapsedRealtime() && this.f29659c == lVar.getUptimeMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.l
    public long getElapsedRealtime() {
        return this.f29658b;
    }

    @Override // com.google.firebase.l
    public long getEpochMillis() {
        return this.f29657a;
    }

    @Override // com.google.firebase.l
    public long getUptimeMillis() {
        return this.f29659c;
    }

    public int hashCode() {
        long j10 = this.f29657a;
        long j11 = this.f29658b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f29659c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f29657a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f29658b);
        sb2.append(", uptimeMillis=");
        return a.b.g(this.f29659c, "}", sb2);
    }
}
