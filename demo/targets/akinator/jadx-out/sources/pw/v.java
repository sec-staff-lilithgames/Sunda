package pw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v extends d1 {

    /* renamed from: g, reason: collision with root package name */
    public d1 f81985g;

    public v(d1 delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f81985g = delegate;
    }

    @Override // pw.d1
    public void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(condition, "condition");
        this.f81985g.awaitSignal(condition);
    }

    @Override // pw.d1
    public void cancel() {
        this.f81985g.cancel();
    }

    @Override // pw.d1
    public d1 clearDeadline() {
        return this.f81985g.clearDeadline();
    }

    @Override // pw.d1
    public d1 clearTimeout() {
        return this.f81985g.clearTimeout();
    }

    @Override // pw.d1
    public long deadlineNanoTime() {
        return this.f81985g.deadlineNanoTime();
    }

    public final d1 delegate() {
        return this.f81985g;
    }

    @Override // pw.d1
    public boolean hasDeadline() {
        return this.f81985g.hasDeadline();
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m5897setDelegate(d1 d1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d1Var, "<set-?>");
        this.f81985g = d1Var;
    }

    @Override // pw.d1
    public void throwIfReached() throws IOException {
        this.f81985g.throwIfReached();
    }

    @Override // pw.d1
    public d1 timeout(long j10, TimeUnit unit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        return this.f81985g.timeout(j10, unit);
    }

    @Override // pw.d1
    public long timeoutNanos() {
        return this.f81985g.timeoutNanos();
    }

    @Override // pw.d1
    public void waitUntilNotified(Object monitor) throws InterruptedException, InterruptedIOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(monitor, "monitor");
        this.f81985g.waitUntilNotified(monitor);
    }

    @Override // pw.d1
    public d1 deadlineNanoTime(long j10) {
        return this.f81985g.deadlineNanoTime(j10);
    }

    public final v setDelegate(d1 delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f81985g = delegate;
        return this;
    }
}
