package wr;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j5 {
    public static j5 forPort(int i10) {
        v5.provider().a();
        throw null;
    }

    public abstract j5 addService(a6 a6Var);

    public abstract j5 addService(e eVar);

    public final j5 addServices(List<a6> list) {
        mh.p1.checkNotNull(list, "services");
        Iterator<a6> it = list.iterator();
        while (it.hasNext()) {
            addService(it.next());
        }
        return this;
    }

    public j5 addStreamTracerFactory(b6.a aVar) {
        throw new UnsupportedOperationException();
    }

    public j5 addTransportFilter(d6 d6Var) {
        throw new UnsupportedOperationException();
    }

    public abstract i5 build();

    public abstract j5 compressorRegistry(e0 e0Var);

    public abstract j5 decompressorRegistry(c1 c1Var);

    public abstract j5 directExecutor();

    public abstract j5 executor(Executor executor);

    public abstract j5 fallbackHandlerRegistry(r1 r1Var);

    public j5 handshakeTimeout(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 intercept(o5 o5Var) {
        throw new UnsupportedOperationException();
    }

    public j5 keepAliveTime(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 keepAliveTimeout(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 maxConnectionAge(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 maxConnectionAgeGrace(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 maxConnectionIdle(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 maxInboundMessageSize(int i10) {
        mh.p1.checkArgument(i10 >= 0, "bytes must be >= 0");
        return this;
    }

    public j5 maxInboundMetadataSize(int i10) {
        mh.p1.checkArgument(i10 > 0, "maxInboundMetadataSize must be > 0");
        return this;
    }

    public j5 permitKeepAliveTime(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public j5 permitKeepAliveWithoutCalls(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public j5 setBinaryLog(d dVar) {
        throw new UnsupportedOperationException();
    }

    public abstract j5 useTransportSecurity(File file, File file2);

    public j5 useTransportSecurity(InputStream inputStream, InputStream inputStream2) {
        throw new UnsupportedOperationException();
    }

    public j5 callExecutor(l5 l5Var) {
        return this;
    }
}
