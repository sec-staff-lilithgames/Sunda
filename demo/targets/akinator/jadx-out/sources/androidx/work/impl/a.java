package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.digidust.elokence.akinator.freemium.R;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import n6.c0;
import o6.a1;
import o6.b1;
import o6.p;
import o6.r;
import o6.t;
import o6.u0;
import o6.y0;
import p6.d;
import q6.f;
import t6.m;
import uu.p0;
import x6.b;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class a {
    public static final List access$createSchedulers(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, m mVar, p pVar) {
        String str = t.f77971a;
        f fVar = new f(context, workDatabase, aVar);
        w6.t.setComponentEnabled(context, SystemJobService.class, true);
        c0.get().debug(t.f77971a, "Created SystemJobScheduler and enabled SystemJobService");
        e0.checkNotNullExpressionValue(fVar, "createBestAvailableBackgroundScheduler(...)");
        return p0.listOf((Object[]) new r[]{fVar, new d(context, aVar, mVar, pVar, new u0(pVar, bVar), bVar)});
    }

    public static final void close(y0 y0Var) {
        e0.checkNotNullParameter(y0Var, "<this>");
        BuildersKt__BuildersKt.runBlocking$default(null, new b1(y0Var, null), 1, null);
        y0Var.getWorkDatabase().close();
    }

    public static final y0 createTestWorkManager(Context context, androidx.work.a configuration, b workTaskExecutor) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.a aVar = WorkDatabase.f7491m;
        x6.a serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return createWorkManager$default(context, configuration, workTaskExecutor, aVar.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    public static final y0 createWorkManager(Context context, androidx.work.a configuration) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }

    public static /* synthetic */ y0 createWorkManager$default(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, m mVar, p pVar, kv.t tVar, int i10, Object obj) {
        m mVar2;
        if ((i10 & 4) != 0) {
            bVar = new x6.d(aVar.getTaskExecutor());
        }
        b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.a aVar2 = WorkDatabase.f7491m;
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            x6.a serialTaskExecutor = bVar2.getSerialTaskExecutor();
            e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
            workDatabase = aVar2.create(applicationContext, serialTaskExecutor, aVar.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            mVar2 = new m(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            mVar2 = mVar;
        }
        return createWorkManager(context, aVar, bVar2, workDatabase, mVar2, (i10 & 32) != 0 ? new p(context.getApplicationContext(), aVar, bVar2, workDatabase) : pVar, (i10 & 64) != 0 ? a1.f77865b : tVar);
    }

    public static final CoroutineScope createWorkManagerScope(b taskExecutor) {
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        CoroutineDispatcher taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        e0.checkNotNullExpressionValue(taskCoroutineDispatcher, "getTaskCoroutineDispatcher(...)");
        return CoroutineScopeKt.CoroutineScope(taskCoroutineDispatcher);
    }

    public static final kv.t schedulers(final r... schedulers) {
        e0.checkNotNullParameter(schedulers, "schedulers");
        return new kv.t() { // from class: o6.z0
            @Override // kv.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                kotlin.jvm.internal.e0.checkNotNullParameter((Context) obj, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter((androidx.work.a) obj2, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter((x6.b) obj3, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter((WorkDatabase) obj4, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter((t6.m) obj5, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter((p) obj6, "<unused var>");
                return uu.k0.toList(schedulers);
            }
        };
    }

    public static final y0 createWorkManager(Context context, androidx.work.a configuration, b workTaskExecutor) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null);
    }

    public static final y0 createWorkManager(Context context, androidx.work.a configuration, b workTaskExecutor, WorkDatabase workDatabase) {
        e0.checkNotNullParameter(context, VPCjETNfjxu.tCMrvxLBBx);
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        e0.checkNotNullParameter(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final y0 createWorkManager(Context context, androidx.work.a configuration, b workTaskExecutor, WorkDatabase workDatabase, m trackers) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        e0.checkNotNullParameter(workDatabase, "workDatabase");
        e0.checkNotNullParameter(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final y0 createWorkManager(Context context, androidx.work.a configuration, b workTaskExecutor, WorkDatabase workDatabase, m trackers, p processor) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        e0.checkNotNullParameter(workDatabase, "workDatabase");
        e0.checkNotNullParameter(trackers, "trackers");
        e0.checkNotNullParameter(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final y0 createWorkManager(Context context, androidx.work.a configuration, b workTaskExecutor, WorkDatabase workDatabase, m trackers, p processor, kv.t schedulersCreator) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        e0.checkNotNullParameter(workDatabase, "workDatabase");
        e0.checkNotNullParameter(trackers, "trackers");
        e0.checkNotNullParameter(processor, "processor");
        e0.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new y0(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
