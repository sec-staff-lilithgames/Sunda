package wr;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g1 extends l3 {
    public static l3 forAddress(String str, int i10) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    public static l3 forTarget(String str) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    public abstract l3 a();

    @Override // wr.l3
    public l3 addTransportFilter(x xVar) {
        a().addTransportFilter(xVar);
        return this;
    }

    @Override // wr.l3
    public k3 build() {
        return a().build();
    }

    @Override // wr.l3
    public l3 compressorRegistry(e0 e0Var) {
        a().compressorRegistry(e0Var);
        return this;
    }

    @Override // wr.l3
    public l3 decompressorRegistry(c1 c1Var) {
        a().decompressorRegistry(c1Var);
        return this;
    }

    @Override // wr.l3
    public l3 defaultLoadBalancingPolicy(String str) {
        a().defaultLoadBalancingPolicy(str);
        return this;
    }

    @Override // wr.l3
    public l3 defaultServiceConfig(Map<String, ?> map) {
        a().defaultServiceConfig(map);
        return this;
    }

    @Override // wr.l3
    public l3 directExecutor() {
        a().directExecutor();
        return this;
    }

    @Override // wr.l3
    public l3 disableRetry() {
        a().disableRetry();
        return this;
    }

    @Override // wr.l3
    public l3 disableServiceConfigLookUp() {
        a().disableServiceConfigLookUp();
        return this;
    }

    @Override // wr.l3
    public l3 enableRetry() {
        a().enableRetry();
        return this;
    }

    @Override // wr.l3
    public l3 executor(Executor executor) {
        a().executor(executor);
        return this;
    }

    @Override // wr.l3
    public l3 idleTimeout(long j10, TimeUnit timeUnit) {
        a().idleTimeout(j10, timeUnit);
        return this;
    }

    @Override // wr.l3
    public l3 intercept(List<q> list) {
        a().intercept(list);
        return this;
    }

    @Override // wr.l3
    public l3 keepAliveTime(long j10, TimeUnit timeUnit) {
        a().keepAliveTime(j10, timeUnit);
        return this;
    }

    @Override // wr.l3
    public l3 keepAliveTimeout(long j10, TimeUnit timeUnit) {
        a().keepAliveTimeout(j10, timeUnit);
        return this;
    }

    @Override // wr.l3
    public l3 keepAliveWithoutCalls(boolean z10) {
        a().keepAliveWithoutCalls(z10);
        return this;
    }

    @Override // wr.l3
    public l3 maxHedgedAttempts(int i10) {
        a().maxHedgedAttempts(i10);
        return this;
    }

    @Override // wr.l3
    public l3 maxInboundMessageSize(int i10) {
        a().maxInboundMessageSize(i10);
        return this;
    }

    @Override // wr.l3
    public l3 maxInboundMetadataSize(int i10) {
        a().maxInboundMetadataSize(i10);
        return this;
    }

    @Override // wr.l3
    public l3 maxRetryAttempts(int i10) {
        a().maxRetryAttempts(i10);
        return this;
    }

    @Override // wr.l3
    public l3 maxTraceEvents(int i10) {
        a().maxTraceEvents(i10);
        return this;
    }

    @Override // wr.l3
    @Deprecated
    public l3 nameResolverFactory(p4.a aVar) {
        a().nameResolverFactory(aVar);
        return this;
    }

    @Override // wr.l3
    public l3 offloadExecutor(Executor executor) {
        a().offloadExecutor(executor);
        return this;
    }

    @Override // wr.l3
    public l3 overrideAuthority(String str) {
        a().overrideAuthority(str);
        return this;
    }

    @Override // wr.l3
    public l3 perRpcBufferLimit(long j10) {
        a().perRpcBufferLimit(j10);
        return this;
    }

    @Override // wr.l3
    public l3 proxyDetector(g5 g5Var) {
        a().proxyDetector(g5Var);
        return this;
    }

    @Override // wr.l3
    public l3 retryBufferSize(long j10) {
        a().retryBufferSize(j10);
        return this;
    }

    @Override // wr.l3
    public l3 setBinaryLog(d dVar) {
        a().setBinaryLog(dVar);
        return this;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", a()).toString();
    }

    @Override // wr.l3
    public l3 usePlaintext() {
        a().usePlaintext();
        return this;
    }

    @Override // wr.l3
    public l3 useTransportSecurity() {
        a().useTransportSecurity();
        return this;
    }

    @Override // wr.l3
    public l3 userAgent(String str) {
        a().userAgent(str);
        return this;
    }

    @Override // wr.l3
    public l3 intercept(q... qVarArr) {
        a().intercept(qVarArr);
        return this;
    }
}
