package n6;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 {
    /* renamed from: createWorker */
    public abstract b0 mo5747createWorker(Context context, String str, WorkerParameters workerParameters);

    public final b0 createWorkerWithDefaultFallback(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.e0.checkNotNullParameter(workerClassName, "workerClassName");
        kotlin.jvm.internal.e0.checkNotNullParameter(workerParameters, "workerParameters");
        b0 b0VarMo5747createWorker = mo5747createWorker(appContext, workerClassName, workerParameters);
        if (b0VarMo5747createWorker == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(b0.class);
                kotlin.jvm.internal.e0.checkNotNull(clsAsSubclass);
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                    kotlin.jvm.internal.e0.checkNotNull(objNewInstance);
                    b0VarMo5747createWorker = (b0) objNewInstance;
                } catch (Throwable th2) {
                    c0.get().error(f1.f75739a, "Could not instantiate " + workerClassName, th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                c0.get().error(f1.f75739a, "Invalid class: " + workerClassName, th3);
                throw th3;
            }
        }
        if (!b0VarMo5747createWorker.isUsed()) {
            return b0VarMo5747createWorker;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
