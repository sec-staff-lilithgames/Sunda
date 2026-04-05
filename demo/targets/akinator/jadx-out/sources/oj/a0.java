package oj;

import android.app.Application;
import java.util.concurrent.Executor;
import nj.e1;
import nj.g1;
import nj.p0;
import nj.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface a0 {
    yh.d analyticsConnector();

    rt.a analyticsEventsFlowable();

    nj.c analyticsEventsManager();

    rt.a appForegroundEventFlowable();

    rj.v appForegroundRateLimit();

    Application application();

    Executor blockingExecutor();

    nj.h campaignCacheClient();

    qj.a clock();

    nj.k developerListenerManager();

    yi.d firebaseEventsSubscriber();

    wr.j gRPCChannel();

    nj.z impressionStorageClient();

    Executor lightWeightExecutor();

    rt.a programmaticContextualTriggerFlowable();

    p0 programmaticContextualTriggers();

    rj.s protoMarshallerClient();

    r0 providerInstaller();

    e1 rateLimiterClient();

    g1 schedulers();
}
