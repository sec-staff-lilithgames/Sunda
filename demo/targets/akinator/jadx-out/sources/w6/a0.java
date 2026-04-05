package w6;

import androidx.lifecycle.x0;
import androidx.work.impl.WorkDatabase;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.List;
import java.util.UUID;
import n6.a1;
import p0.g2;
import rv.n0;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class a0 {
    public static final n1 a(WorkDatabase workDatabase, x6.b bVar, kv.l lVar) {
        x6.a serialTaskExecutor = bVar.getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n6.w.executeAsync(serialTaskExecutor, "loadStatusFuture", new x0(23, lVar, workDatabase));
    }

    public static final n1 forStringIds(WorkDatabase workDatabase, x6.b executor, List<String> ids) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
        return a(workDatabase, executor, new n0(ids, 1));
    }

    public static final n1 forTag(WorkDatabase workDatabase, x6.b executor, String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        return a(workDatabase, executor, new v6.i0(tag, 10));
    }

    public static final n1 forUUID(WorkDatabase workDatabase, x6.b executor, UUID id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return a(workDatabase, executor, new g2(id2, 15));
    }

    public static final n1 forUniqueWork(WorkDatabase workDatabase, x6.b executor, String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return a(workDatabase, executor, new v6.i0(name, 9));
    }

    public static final n1 forWorkQuerySpec(WorkDatabase workDatabase, x6.b executor, a1 a1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(a1Var, SUvoXnn.pZgGZAMcLsy);
        return a(workDatabase, executor, new g2(a1Var, 16));
    }
}
