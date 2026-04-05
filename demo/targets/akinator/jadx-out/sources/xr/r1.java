package xr;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface r1 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ScheduledExecutorService getScheduledExecutorService();

    Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes();

    a2 newClientTransport(SocketAddress socketAddress, p1 p1Var, wr.m mVar);

    q1 swapChannelCredentials(wr.k kVar);
}
