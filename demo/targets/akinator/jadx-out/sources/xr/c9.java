package xr;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c9 extends o4 {

    /* renamed from: c, reason: collision with root package name */
    public static final ReferenceQueue f92331c = new ReferenceQueue();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f92332d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f92333e = Logger.getLogger(c9.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final b9 f92334b;

    public c9(u8 u8Var) {
        super(u8Var);
        this.f92334b = new b9(this, u8Var, f92331c, f92332d);
    }

    @Override // xr.o4, wr.k3
    public wr.k3 shutdown() {
        b9 b9Var = this.f92334b;
        if (!b9Var.f92283e.getAndSet(true)) {
            b9Var.clear();
        }
        return super.shutdown();
    }

    @Override // xr.o4, wr.k3
    public wr.k3 shutdownNow() {
        b9 b9Var = this.f92334b;
        if (!b9Var.f92283e.getAndSet(true)) {
            b9Var.clear();
        }
        return super.shutdownNow();
    }
}
