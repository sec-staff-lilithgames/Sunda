package wr;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f90976a = u0.key("io.grpc.Server");

    public abstract void awaitTermination() throws InterruptedException;

    public abstract boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException;

    public List<a6> getImmutableServices() {
        return Collections.EMPTY_LIST;
    }

    public List<? extends SocketAddress> getListenSockets() {
        throw new UnsupportedOperationException();
    }

    public List<a6> getMutableServices() {
        return Collections.EMPTY_LIST;
    }

    public int getPort() {
        return -1;
    }

    public List<a6> getServices() {
        return Collections.EMPTY_LIST;
    }

    public abstract boolean isShutdown();

    public abstract boolean isTerminated();

    public abstract i5 shutdown();

    public abstract i5 shutdownNow();

    public abstract i5 start() throws IOException;
}
