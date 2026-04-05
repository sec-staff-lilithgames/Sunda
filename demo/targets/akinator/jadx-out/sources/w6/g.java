package w6;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n6.b1;
import uu.p0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {
    public static final void checkContentUriTriggerWorkerLimits(WorkDatabase workDatabase, androidx.work.a configuration, o6.d0 continuation) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "workDatabase");
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.e0.checkNotNullParameter(continuation, "continuation");
        List listMutableListOf = p0.mutableListOf(continuation);
        int i11 = 0;
        while (!listMutableListOf.isEmpty()) {
            o6.d0 d0Var = (o6.d0) v0.removeLast(listMutableListOf);
            List<? extends b1> work = d0Var.getWork();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(work, "getWork(...)");
            List<? extends b1> list = work;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((b1) it.next()).getWorkSpec().f89062j.hasContentUriTriggers() && (i10 = i10 + 1) < 0) {
                        p0.throwCountOverflow();
                    }
                }
            }
            i11 += i10;
            List<o6.d0> parents = d0Var.getParents();
            if (parents != null) {
                listMutableListOf.addAll(parents);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iCountNonFinishedContentUriTriggerWorkers = workDatabase.workSpecDao().countNonFinishedContentUriTriggerWorkers();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iCountNonFinishedContentUriTriggerWorkers + i11 > contentUriTriggerWorkersLimit) {
            throw new IllegalArgumentException(a.b.f(i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", w0.i.f(contentUriTriggerWorkersLimit, iCountNonFinishedContentUriTriggerWorkers, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
        }
    }

    public static final v6.b0 tryDelegateConstrainedWorkSpec(v6.b0 workSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
        n6.f fVar = workSpec.f89062j;
        String str = workSpec.f89055c;
        if (kotlin.jvm.internal.e0.areEqual(str, ConstraintTrackingWorker.class.getName()) || !(fVar.requiresBatteryNotLow() || fVar.requiresStorageNotLow())) {
            return workSpec;
        }
        androidx.work.b bVarBuild = new b.a().putAll(workSpec.f89057e).putString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).build();
        String name = ConstraintTrackingWorker.class.getName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "getName(...)");
        return v6.b0.copy$default(workSpec, null, null, name, null, bVarBuild, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final v6.b0 tryDelegateRemoteListenableWorker(v6.b0 workSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
        boolean zHasKeyWithValueOfType = workSpec.f89057e.hasKeyWithValueOfType("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zHasKeyWithValueOfType2 = workSpec.f89057e.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zHasKeyWithValueOfType3 = workSpec.f89057e.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zHasKeyWithValueOfType || !zHasKeyWithValueOfType2 || !zHasKeyWithValueOfType3) {
            return workSpec;
        }
        return v6.b0.copy$default(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new b.a().putAll(workSpec.f89057e).putString("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.f89055c).build(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final v6.b0 wrapWorkSpecIfNeeded(List<? extends o6.r> schedulers, v6.b0 workSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(schedulers, "schedulers");
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
        v6.b0 b0VarTryDelegateRemoteListenableWorker = tryDelegateRemoteListenableWorker(workSpec);
        return Build.VERSION.SDK_INT <= 25 ? tryDelegateConstrainedWorkSpec(b0VarTryDelegateRemoteListenableWorker) : b0VarTryDelegateRemoteListenableWorker;
    }
}
