package tv;

import tv.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final long f87460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87461b;

    public r(long j10, int i10) {
        this.f87460a = j10;
        this.f87461b = i10;
    }

    public final long getEpochSeconds() {
        return this.f87460a;
    }

    public final int getNanosecondsOfSecond() {
        return this.f87461b;
    }

    @Override // tv.s
    public n toInstant() {
        n.a aVar = n.f87449e;
        long epochSeconds = aVar.getMIN$kotlin_stdlib().getEpochSeconds();
        long j10 = this.f87460a;
        if (j10 >= epochSeconds && j10 <= aVar.getMAX$kotlin_stdlib().getEpochSeconds()) {
            return aVar.fromEpochSeconds(j10, this.f87461b);
        }
        throw new o("The parsed date is outside the range representable by Instant (Unix epoch second " + j10 + ')');
    }

    @Override // tv.s
    public n toInstantOrNull() {
        n.a aVar = n.f87449e;
        long epochSeconds = aVar.getMIN$kotlin_stdlib().getEpochSeconds();
        long j10 = this.f87460a;
        if (j10 < epochSeconds || j10 > aVar.getMAX$kotlin_stdlib().getEpochSeconds()) {
            return null;
        }
        return aVar.fromEpochSeconds(j10, this.f87461b);
    }
}
