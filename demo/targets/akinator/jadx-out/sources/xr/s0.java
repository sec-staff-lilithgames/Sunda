package xr;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s0 implements r1 {

    /* renamed from: b, reason: collision with root package name */
    public final r1 f92973b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.f f92974c;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f92975e;

    public s0(r1 r1Var, wr.f fVar, u7 u7Var) {
        this.f92973b = (r1) mh.p1.checkNotNull(r1Var, "delegate");
        this.f92974c = fVar;
        this.f92975e = (Executor) mh.p1.checkNotNull(u7Var, "appExecutor");
    }

    @Override // xr.r1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92973b.close();
    }

    @Override // xr.r1
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f92973b.getScheduledExecutorService();
    }

    @Override // xr.r1
    public Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes() {
        return this.f92973b.getSupportedSocketAddressTypes();
    }

    @Override // xr.r1
    public a2 newClientTransport(SocketAddress socketAddress, p1 p1Var, wr.m mVar) {
        return new r0(this, this.f92973b.newClientTransport(socketAddress, p1Var, mVar), p1Var.getAuthority());
    }

    @Override // xr.r1
    public q1 swapChannelCredentials(wr.k kVar) {
        throw new UnsupportedOperationException();
    }
}
