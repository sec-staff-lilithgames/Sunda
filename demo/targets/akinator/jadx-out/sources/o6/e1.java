package o6;

import androidx.work.impl.WorkDatabase;
import j1.o2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 {
    public static final n6.z0 a(p pVar, WorkDatabase workDatabase, androidx.work.a aVar, List list, v6.b0 spec, Set set) {
        String str = spec.f89053a;
        v6.b0 spec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (spec2 == null) {
            throw new IllegalArgumentException(a.b.l("Worker with ", str, " doesn't exist"));
        }
        if (spec2.f89054b.isFinished()) {
            return n6.z0.f75816b;
        }
        if (spec2.isPeriodic() ^ spec.isPeriodic()) {
            StringBuilder sb2 = new StringBuilder("Can't update ");
            kotlin.jvm.internal.e0.checkNotNullParameter(spec2, "spec");
            sb2.append(spec2.isPeriodic() ? "Periodic" : "OneTime");
            sb2.append(" Worker to ");
            kotlin.jvm.internal.e0.checkNotNullParameter(spec, "spec");
            throw new UnsupportedOperationException(o2.o(sb2, spec.isPeriodic() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        boolean zIsEnqueued = pVar.isEnqueued(str);
        if (!zIsEnqueued) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((r) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new com.amazon.device.ads.m(workDatabase, spec2, spec, list, str, set, zIsEnqueued));
        if (!zIsEnqueued) {
            t.schedule(aVar, workDatabase, list);
        }
        return zIsEnqueued ? n6.z0.f75818e : n6.z0.f75817c;
    }

    public static final n6.j0 enqueueUniquelyNamedPeriodic(y0 y0Var, String name, n6.b1 workRequest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(workRequest, "workRequest");
        n6.t0 tracer = y0Var.getConfiguration().getTracer();
        String strK = a.b.k("enqueueUniquePeriodic_", name);
        x6.a serialTaskExecutor = y0Var.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n6.n0.launchOperation(tracer, strK, serialTaskExecutor, new com.moloco.sdk.internal.ilrd.j(y0Var, 3, name, workRequest));
    }

    public static final sh.n1 updateWorkImpl(y0 y0Var, n6.b1 workRequest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(workRequest, "workRequest");
        x6.a serialTaskExecutor = y0Var.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n6.w.executeAsync(serialTaskExecutor, "updateWorkImpl", new androidx.lifecycle.x0(16, y0Var, workRequest));
    }
}
