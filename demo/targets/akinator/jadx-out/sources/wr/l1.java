package wr;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l1 extends j5 {
    public static j5 forPort(int i10) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    @Override // wr.j5
    public j5 addService(a6 a6Var) {
        ((yr.o0) this).f94974a.addService(a6Var);
        return this;
    }

    @Override // wr.j5
    public j5 addStreamTracerFactory(b6.a aVar) {
        ((yr.o0) this).f94974a.addStreamTracerFactory(aVar);
        return this;
    }

    @Override // wr.j5
    public j5 addTransportFilter(d6 d6Var) {
        ((yr.o0) this).f94974a.addTransportFilter(d6Var);
        return this;
    }

    @Override // wr.j5
    public i5 build() {
        return ((yr.o0) this).f94974a.build();
    }

    @Override // wr.j5
    public j5 callExecutor(l5 l5Var) {
        ((yr.o0) this).f94974a.callExecutor(l5Var);
        return this;
    }

    @Override // wr.j5
    public j5 compressorRegistry(e0 e0Var) {
        ((yr.o0) this).f94974a.compressorRegistry(e0Var);
        return this;
    }

    @Override // wr.j5
    public j5 decompressorRegistry(c1 c1Var) {
        ((yr.o0) this).f94974a.decompressorRegistry(c1Var);
        return this;
    }

    @Override // wr.j5
    public j5 directExecutor() {
        ((yr.o0) this).f94974a.directExecutor();
        return this;
    }

    @Override // wr.j5
    public j5 executor(Executor executor) {
        ((yr.o0) this).f94974a.executor(executor);
        return this;
    }

    @Override // wr.j5
    public j5 fallbackHandlerRegistry(r1 r1Var) {
        ((yr.o0) this).f94974a.fallbackHandlerRegistry(r1Var);
        return this;
    }

    @Override // wr.j5
    public j5 handshakeTimeout(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.handshakeTimeout(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 intercept(o5 o5Var) {
        ((yr.o0) this).f94974a.intercept(o5Var);
        return this;
    }

    @Override // wr.j5
    public j5 keepAliveTime(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.keepAliveTime(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 keepAliveTimeout(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.keepAliveTimeout(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 maxConnectionAge(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.maxConnectionAge(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 maxConnectionAgeGrace(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.maxConnectionAgeGrace(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 maxConnectionIdle(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.maxConnectionIdle(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 maxInboundMessageSize(int i10) {
        ((yr.o0) this).f94974a.maxInboundMessageSize(i10);
        return this;
    }

    @Override // wr.j5
    public j5 maxInboundMetadataSize(int i10) {
        ((yr.o0) this).f94974a.maxInboundMetadataSize(i10);
        return this;
    }

    @Override // wr.j5
    public j5 permitKeepAliveTime(long j10, TimeUnit timeUnit) {
        ((yr.o0) this).f94974a.permitKeepAliveTime(j10, timeUnit);
        return this;
    }

    @Override // wr.j5
    public j5 permitKeepAliveWithoutCalls(boolean z10) {
        ((yr.o0) this).f94974a.permitKeepAliveWithoutCalls(z10);
        return this;
    }

    @Override // wr.j5
    public j5 setBinaryLog(d dVar) {
        ((yr.o0) this).f94974a.setBinaryLog(dVar);
        return this;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", ((yr.o0) this).f94974a).toString();
    }

    @Override // wr.j5
    public j5 useTransportSecurity(File file, File file2) {
        ((yr.o0) this).f94974a.useTransportSecurity(file, file2);
        return this;
    }

    @Override // wr.j5
    public j5 addService(e eVar) {
        ((yr.o0) this).f94974a.addService(eVar);
        return this;
    }

    @Override // wr.j5
    public j5 useTransportSecurity(InputStream inputStream, InputStream inputStream2) {
        ((yr.o0) this).f94974a.useTransportSecurity(inputStream, inputStream2);
        return this;
    }
}
