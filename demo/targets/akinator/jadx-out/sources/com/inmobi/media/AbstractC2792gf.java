package com.inmobi.media;

import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2792gf {
    public static final boolean a(xv.v0 v0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v0Var, "<this>");
        int iCode = v0Var.code();
        return !(400 <= iCode && iCode < 600);
    }

    public static final Object a(ExecutorService executorService, long j10, TimeUnit unit, Callable task) throws Throwable {
        kotlin.jvm.internal.e0.checkNotNullParameter(executorService, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        Future futureSubmit = executorService.submit(task);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(futureSubmit, "submit(...)");
        try {
            return futureSubmit.get(j10, unit);
        } catch (InterruptedException e10) {
            futureSubmit.cancel(true);
            Thread.currentThread().interrupt();
            throw e10;
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                throw e11;
            }
            throw cause;
        } catch (TimeoutException unused) {
            futureSubmit.cancel(true);
            throw new SocketTimeoutException();
        }
    }
}
