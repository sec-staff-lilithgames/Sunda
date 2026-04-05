package ud;

import j1.o2;
import java.util.Set;
import ud.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends e.b.a {

    /* renamed from: a, reason: collision with root package name */
    public Long f88409a;

    /* renamed from: b, reason: collision with root package name */
    public Long f88410b;

    /* renamed from: c, reason: collision with root package name */
    public Set f88411c;

    @Override // ud.e.b.a
    public e.b build() {
        String strL = this.f88409a == null ? " delta" : "";
        if (this.f88410b == null) {
            strL = strL.concat(" maxAllowedDelay");
        }
        if (this.f88411c == null) {
            strL = o2.l(strL, " flags");
        }
        if (strL.isEmpty()) {
            return new c(this.f88409a.longValue(), this.f88410b.longValue(), this.f88411c);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    @Override // ud.e.b.a
    public e.b.a setDelta(long j10) {
        this.f88409a = Long.valueOf(j10);
        return this;
    }

    @Override // ud.e.b.a
    public e.b.a setFlags(Set<f> set) {
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        this.f88411c = set;
        return this;
    }

    @Override // ud.e.b.a
    public e.b.a setMaxAllowedDelay(long j10) {
        this.f88410b = Long.valueOf(j10);
        return this;
    }
}
