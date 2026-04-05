package xr;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92461a;

    /* renamed from: b, reason: collision with root package name */
    public final long f92462b;

    /* renamed from: c, reason: collision with root package name */
    public final nh.l6 f92463c;

    public e5(int i10, long j10, Set set) {
        this.f92461a = i10;
        this.f92462b = j10;
        this.f92463c = nh.l6.copyOf((Collection) set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e5.class != obj.getClass()) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return this.f92461a == e5Var.f92461a && this.f92462b == e5Var.f92462b && mh.h1.equal(this.f92463c, e5Var.f92463c);
    }

    public int hashCode() {
        return mh.h1.hashCode(Integer.valueOf(this.f92461a), Long.valueOf(this.f92462b), this.f92463c);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("maxAttempts", this.f92461a).add("hedgingDelayNanos", this.f92462b).add("nonFatalStatusCodes", this.f92463c).toString();
    }
}
