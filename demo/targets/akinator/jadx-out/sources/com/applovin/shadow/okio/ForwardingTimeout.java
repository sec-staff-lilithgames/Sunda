package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m364setDelegate(Timeout timeout) {
        e0.checkNotNullParameter(timeout, "<set-?>");
        this.delegate = timeout;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout timeout(long j10, TimeUnit unit) {
        e0.checkNotNullParameter(unit, "unit");
        return this.delegate.timeout(j10, unit);
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout deadlineNanoTime(long j10) {
        return this.delegate.deadlineNanoTime(j10);
    }

    public final ForwardingTimeout setDelegate(Timeout delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
