package xr;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class uc {

    /* renamed from: a, reason: collision with root package name */
    public final int f93136a;

    /* renamed from: b, reason: collision with root package name */
    public final long f93137b;

    /* renamed from: c, reason: collision with root package name */
    public final long f93138c;

    /* renamed from: d, reason: collision with root package name */
    public final double f93139d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f93140e;

    /* renamed from: f, reason: collision with root package name */
    public final nh.l6 f93141f;

    public uc(int i10, long j10, long j11, double d10, Long l9, Set set) {
        this.f93136a = i10;
        this.f93137b = j10;
        this.f93138c = j11;
        this.f93139d = d10;
        this.f93140e = l9;
        this.f93141f = nh.l6.copyOf((Collection) set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return this.f93136a == ucVar.f93136a && this.f93137b == ucVar.f93137b && this.f93138c == ucVar.f93138c && Double.compare(this.f93139d, ucVar.f93139d) == 0 && mh.h1.equal(this.f93140e, ucVar.f93140e) && mh.h1.equal(this.f93141f, ucVar.f93141f);
    }

    public int hashCode() {
        return mh.h1.hashCode(Integer.valueOf(this.f93136a), Long.valueOf(this.f93137b), Long.valueOf(this.f93138c), Double.valueOf(this.f93139d), this.f93140e, this.f93141f);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("maxAttempts", this.f93136a).add("initialBackoffNanos", this.f93137b).add("maxBackoffNanos", this.f93138c).add("backoffMultiplier", this.f93139d).add("perAttemptRecvTimeoutNanos", this.f93140e).add("retryableStatusCodes", this.f93141f).toString();
    }
}
