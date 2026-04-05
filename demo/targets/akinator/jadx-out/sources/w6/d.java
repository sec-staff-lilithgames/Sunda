package w6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import n6.j0;
import n6.n0;
import n6.t0;
import n6.x0;
import o6.w0;
import o6.y0;
import uu.p0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final void a(String str, y0 y0Var) {
        WorkDatabase workDatabase = y0Var.getWorkDatabase();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
        v6.c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
        v6.b bVarDependencyDao = workDatabase.dependencyDao();
        List listMutableListOf = p0.mutableListOf(str);
        while (!listMutableListOf.isEmpty()) {
            String str2 = (String) v0.removeLast(listMutableListOf);
            x0 state = c0VarWorkSpecDao.getState(str2);
            if (state != x0.f75808e && state != x0.f75809f) {
                c0VarWorkSpecDao.setCancelledState(str2);
            }
            listMutableListOf.addAll(bVarDependencyDao.getDependentWorkIds(str2));
        }
        o6.p processor = y0Var.getProcessor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(processor, "getProcessor(...)");
        processor.stopAndCancelWork(str, 1);
        Iterator<o6.r> it = y0Var.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public static final j0 forAll(y0 workManagerImpl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        t0 tracer = workManagerImpl.getConfiguration().getTracer();
        x6.a serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n0.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new w0(workManagerImpl, 1));
    }

    public static final j0 forId(UUID id2, y0 workManagerImpl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        t0 tracer = workManagerImpl.getConfiguration().getTracer();
        x6.a serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n0.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new androidx.lifecycle.x0(22, workManagerImpl, id2));
    }

    public static final j0 forName(String name, y0 workManagerImpl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        t0 tracer = workManagerImpl.getConfiguration().getTracer();
        String strK = a.b.k("CancelWorkByName_", name);
        x6.a serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n0.launchOperation(tracer, strK, serialTaskExecutor, new c(name, workManagerImpl));
    }

    public static final void forNameInline(String name, y0 workManagerImpl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
        workDatabase.runInTransaction(new b(workDatabase, name, workManagerImpl, 0));
    }

    public static final j0 forTag(String tag, y0 workManagerImpl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        t0 tracer = workManagerImpl.getConfiguration().getTracer();
        String strK = a.b.k("CancelWorkByTag_", tag);
        x6.a serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n0.launchOperation(tracer, strK, serialTaskExecutor, new c(workManagerImpl, tag));
    }
}
