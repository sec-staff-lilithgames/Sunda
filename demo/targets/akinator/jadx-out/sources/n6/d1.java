package n6;

import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f75713a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f75714b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f75715c;

    public d1(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workerClassName, "workerClassName");
        kotlin.jvm.internal.e0.checkNotNullParameter(workerParameters, "workerParameters");
        kotlin.jvm.internal.e0.checkNotNullParameter(throwable, "throwable");
        this.f75713a = workerClassName;
        this.f75714b = workerParameters;
        this.f75715c = throwable;
    }

    public final Throwable getThrowable() {
        return this.f75715c;
    }

    public final String getWorkerClassName() {
        return this.f75713a;
    }

    public final WorkerParameters getWorkerParameters() {
        return this.f75714b;
    }
}
