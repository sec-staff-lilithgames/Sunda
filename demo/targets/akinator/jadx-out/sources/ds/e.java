package ds;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import mh.p1;
import wr.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final wr.j f52599a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.i f52600b;

    public e(wr.j jVar, wr.i iVar) {
        this.f52599a = (wr.j) p1.checkNotNull(jVar, "channel");
        this.f52600b = (wr.i) p1.checkNotNull(iVar, "callOptions");
    }

    public static <T extends e> T newStub(d dVar, wr.j jVar) {
        return (T) newStub(dVar, jVar, wr.i.f90961k);
    }

    public abstract e a(wr.j jVar, wr.i iVar);

    public final wr.i getCallOptions() {
        return this.f52600b;
    }

    public final wr.j getChannel() {
        return this.f52599a;
    }

    public final e withCallCredentials(wr.f fVar) {
        return a(this.f52599a, this.f52600b.withCallCredentials(fVar));
    }

    @Deprecated
    public final e withChannel(wr.j jVar) {
        return a(jVar, this.f52600b);
    }

    public final e withCompression(String str) {
        return a(this.f52599a, this.f52600b.withCompression(str));
    }

    public final e withDeadline(z0 z0Var) {
        return a(this.f52599a, this.f52600b.withDeadline(z0Var));
    }

    public final e withDeadlineAfter(long j10, TimeUnit timeUnit) {
        return a(this.f52599a, this.f52600b.withDeadlineAfter(j10, timeUnit));
    }

    public final e withExecutor(Executor executor) {
        return a(this.f52599a, this.f52600b.withExecutor(executor));
    }

    public final e withInterceptors(wr.q... qVarArr) {
        return a(wr.t.intercept(this.f52599a, qVarArr), this.f52600b);
    }

    public final e withMaxInboundMessageSize(int i10) {
        return a(this.f52599a, this.f52600b.withMaxInboundMessageSize(i10));
    }

    public final e withMaxOutboundMessageSize(int i10) {
        return a(this.f52599a, this.f52600b.withMaxOutboundMessageSize(i10));
    }

    public final <T> e withOption(wr.h hVar, T t10) {
        return a(this.f52599a, this.f52600b.withOption(hVar, t10));
    }

    public final e withWaitForReady() {
        return a(this.f52599a, this.f52600b.withWaitForReady());
    }

    public static <T extends e> T newStub(d dVar, wr.j jVar, wr.i iVar) {
        return (T) dVar.newStub(jVar, iVar);
    }
}
