package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ResendTpatJob implements Job {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final PathProvider pathProvider;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final JobInfo makeJobInfo() {
            return new JobInfo(ResendTpatJob.TAG).setPriority(0).setUpdateCurrent(true);
        }

        private Companion() {
        }
    }

    public ResendTpatJob(Context context, PathProvider pathProvider) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final TpatSender m3647onRunJob$lambda0(o oVar) {
        return (TpatSender) oVar.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        e0.checkNotNullParameter(bundle, "bundle");
        e0.checkNotNullParameter(jobRunner, "jobRunner");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m3647onRunJob$lambda0(q.lazy(s.f87403b, (a) new ResendTpatJob$onRunJob$$inlined$inject$1(this.context))).resendStoredTpats$vungle_ads_release();
        return 0;
    }
}
