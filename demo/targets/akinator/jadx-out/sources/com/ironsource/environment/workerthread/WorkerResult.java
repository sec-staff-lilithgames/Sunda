package com.ironsource.environment.workerthread;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class WorkerResult<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Canceled<T> extends WorkerResult<T> {
        public Callable<T> callable;

        public Canceled(Callable<T> callable) {
            super(0);
            this.callable = callable;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Completed<T> extends WorkerResult<T> {
        public T data;

        public Completed(T t10) {
            super(0);
            this.data = t10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Failed<T> extends WorkerResult<T> {
        public Callable<T> callable;
        public Exception exception;

        public Failed(Callable<T> callable, Exception exc) {
            super(0);
            this.callable = callable;
            this.exception = exc;
        }
    }

    public /* synthetic */ WorkerResult(int i10) {
        this();
    }

    private WorkerResult() {
    }
}
