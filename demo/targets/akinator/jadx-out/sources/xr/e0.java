package xr;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f92452c = Logger.getLogger(e0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f92453a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f92454b;

    public e0(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f92454b = atomicLong;
        mh.p1.checkArgument(j10 > 0, "value must be positive");
        this.f92453a = str;
        atomicLong.set(j10);
    }

    public d0 getState() {
        return new d0(this, this.f92454b.get());
    }
}
