package wr;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l3 {
    public static l3 forAddress(String str, int i10) {
        return n3.provider().builderForAddress(str, i10);
    }

    public static l3 forTarget(String str) {
        return n3.provider().builderForTarget(str);
    }

    public l3 addTransportFilter(x xVar) {
        throw new UnsupportedOperationException();
    }

    public abstract k3 build();

    public abstract l3 compressorRegistry(e0 e0Var);

    public abstract l3 decompressorRegistry(c1 c1Var);

    public l3 defaultLoadBalancingPolicy(String str) {
        throw new UnsupportedOperationException();
    }

    public l3 defaultServiceConfig(Map<String, ?> map) {
        throw new UnsupportedOperationException();
    }

    public abstract l3 directExecutor();

    public l3 disableRetry() {
        throw new UnsupportedOperationException();
    }

    public l3 disableServiceConfigLookUp() {
        throw new UnsupportedOperationException();
    }

    public l3 enableRetry() {
        throw new UnsupportedOperationException();
    }

    public abstract l3 executor(Executor executor);

    public abstract l3 idleTimeout(long j10, TimeUnit timeUnit);

    public abstract l3 intercept(List<q> list);

    public abstract l3 intercept(q... qVarArr);

    public l3 keepAliveTime(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public l3 keepAliveTimeout(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public l3 keepAliveWithoutCalls(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public l3 maxHedgedAttempts(int i10) {
        throw new UnsupportedOperationException();
    }

    public l3 maxInboundMessageSize(int i10) {
        mh.p1.checkArgument(i10 >= 0, "bytes must be >= 0");
        return this;
    }

    public l3 maxInboundMetadataSize(int i10) {
        mh.p1.checkArgument(i10 > 0, "maxInboundMetadataSize must be > 0");
        return this;
    }

    public l3 maxRetryAttempts(int i10) {
        throw new UnsupportedOperationException();
    }

    public l3 maxTraceEvents(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public abstract l3 nameResolverFactory(p4.a aVar);

    public l3 offloadExecutor(Executor executor) {
        throw new UnsupportedOperationException();
    }

    public abstract l3 overrideAuthority(String str);

    public l3 perRpcBufferLimit(long j10) {
        throw new UnsupportedOperationException();
    }

    public l3 proxyDetector(g5 g5Var) {
        throw new UnsupportedOperationException();
    }

    public l3 retryBufferSize(long j10) {
        throw new UnsupportedOperationException();
    }

    public l3 setBinaryLog(d dVar) {
        throw new UnsupportedOperationException();
    }

    public l3 usePlaintext() {
        throw new UnsupportedOperationException();
    }

    public l3 useTransportSecurity() {
        throw new UnsupportedOperationException();
    }

    public abstract l3 userAgent(String str);
}
