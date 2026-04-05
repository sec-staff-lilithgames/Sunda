package rj;

import j1.o2;
import rj.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends v.a {

    /* renamed from: a, reason: collision with root package name */
    public String f84435a;

    /* renamed from: b, reason: collision with root package name */
    public long f84436b;

    /* renamed from: c, reason: collision with root package name */
    public long f84437c;

    /* renamed from: d, reason: collision with root package name */
    public byte f84438d;

    @Override // rj.v.a
    public v build() {
        String str;
        if (this.f84438d == 3 && (str = this.f84435a) != null) {
            return new d(str, this.f84436b, this.f84437c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f84435a == null) {
            sb2.append(" limiterKey");
        }
        if ((this.f84438d & 1) == 0) {
            sb2.append(" limit");
        }
        if ((this.f84438d & 2) == 0) {
            sb2.append(" timeToLiveMillis");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // rj.v.a
    public v.a setLimit(long j10) {
        this.f84436b = j10;
        this.f84438d = (byte) (this.f84438d | 1);
        return this;
    }

    @Override // rj.v.a
    public v.a setLimiterKey(String str) {
        if (str == null) {
            throw new NullPointerException("Null limiterKey");
        }
        this.f84435a = str;
        return this;
    }

    @Override // rj.v.a
    public v.a setTimeToLiveMillis(long j10) {
        this.f84437c = j10;
        this.f84438d = (byte) (this.f84438d | 2);
        return this;
    }
}
