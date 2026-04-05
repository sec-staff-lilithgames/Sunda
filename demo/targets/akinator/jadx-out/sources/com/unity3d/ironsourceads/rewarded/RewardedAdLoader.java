package com.unity3d.ironsourceads.rewarded;

import com.ironsource.C3306kc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.Sd;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import gl.a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RewardedAdLoader {
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f50628a = V7.f35633a.c();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb loadTask) {
        e0.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(RewardedAdRequest adRequest, RewardedAdLoaderListener listener) {
        e0.checkNotNullParameter(adRequest, "adRequest");
        e0.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f50628a, new Sd(adRequest, listener, C3306kc.f37095e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Fb loadTaskProvider) {
        e0.checkNotNullParameter(executor, "executor");
        e0.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        executor.execute(new a(loadTaskProvider.a(), 2));
    }
}
