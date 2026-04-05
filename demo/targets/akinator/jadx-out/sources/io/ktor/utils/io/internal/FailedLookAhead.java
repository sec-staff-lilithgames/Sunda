package io.ktor.utils.io.internal;

import io.ktor.utils.io.LookAheadSuspendSession;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FailedLookAhead implements LookAheadSuspendSession {
    private final Throwable cause;

    public FailedLookAhead(Throwable cause) {
        e0.checkNotNullParameter(cause, "cause");
        this.cause = cause;
    }

    @Override // io.ktor.utils.io.LookAheadSuspendSession
    public Object awaitAtLeast(int i10, d<? super Boolean> dVar) throws Throwable {
        throw this.cause;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    @Override // io.ktor.utils.io.LookAheadSession
    public ByteBuffer request(int i10, int i11) throws Throwable {
        throw this.cause;
    }

    @Override // io.ktor.utils.io.LookAheadSession
    /* renamed from: consumed, reason: merged with bridge method [inline-methods] */
    public Void mo4580consumed(int i10) throws Throwable {
        throw this.cause;
    }
}
