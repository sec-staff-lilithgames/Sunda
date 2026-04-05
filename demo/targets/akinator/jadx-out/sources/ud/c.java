package ud;

import java.util.Set;
import ud.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends e.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f88412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f88413b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f88414c;

    public c(long j10, long j11, Set set) {
        this.f88412a = j10;
        this.f88413b = j11;
        this.f88414c = set;
    }

    @Override // ud.e.b
    public final long a() {
        return this.f88412a;
    }

    @Override // ud.e.b
    public final Set b() {
        return this.f88414c;
    }

    @Override // ud.e.b
    public final long c() {
        return this.f88413b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.b)) {
            return false;
        }
        e.b bVar = (e.b) obj;
        return this.f88412a == bVar.a() && this.f88413b == bVar.c() && this.f88414c.equals(bVar.b());
    }

    public int hashCode() {
        long j10 = this.f88412a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f88413b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f88414c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f88412a + ", maxAllowedDelay=" + this.f88413b + ", flags=" + this.f88414c + "}";
    }
}
