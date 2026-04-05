package wr;

import java.util.concurrent.TimeoutException;
import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class w0 {
    public static <ReqT, RespT> k5.a interceptCall(u0 u0Var, k5 k5Var, e4 e4Var, m5 m5Var) {
        u0 u0VarAttach = u0Var.attach();
        try {
            return new v0(m5Var.startCall(k5Var, e4Var), u0Var);
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }

    public static m6 statusFromCancelled(u0 u0Var) {
        mh.p1.checkNotNull(u0Var, "context must not be null");
        if (!u0Var.isCancelled()) {
            return null;
        }
        Throwable thCancellationCause = u0Var.cancellationCause();
        if (thCancellationCause == null) {
            return m6.f91038f.withDescription("io.grpc.Context was cancelled without error");
        }
        if (thCancellationCause instanceof TimeoutException) {
            return m6.f91040h.withDescription(thCancellationCause.getMessage()).withCause(thCancellationCause);
        }
        m6 m6VarFromThrowable = m6.fromThrowable(thCancellationCause);
        return (j6.UNKNOWN.equals(m6VarFromThrowable.getCode()) && m6VarFromThrowable.getCause() == thCancellationCause) ? m6.f91038f.withDescription("Context cancelled").withCause(thCancellationCause) : m6VarFromThrowable.withCause(thCancellationCause);
    }
}
