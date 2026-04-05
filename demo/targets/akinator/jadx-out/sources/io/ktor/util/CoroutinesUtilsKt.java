package io.ktor.util;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import sv.k0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CoroutinesUtilsKt {
    public static final m SilentSupervisor(Job job) {
        return SupervisorKt.SupervisorJob(job).plus(new CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
    }

    public static /* synthetic */ m SilentSupervisor$default(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return SilentSupervisor(job);
    }

    public static final void printDebugTree(Job job, int i10) {
        e0.checkNotNullParameter(job, "<this>");
        System.out.println((Object) (k0.repeat(" ", i10) + job));
        Iterator<Object> it = job.getChildren().iterator();
        while (it.hasNext()) {
            printDebugTree((Job) it.next(), i10 + 2);
        }
        if (i10 == 0) {
            System.out.println();
        }
    }

    public static /* synthetic */ void printDebugTree$default(Job job, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        printDebugTree(job, i10);
    }
}
