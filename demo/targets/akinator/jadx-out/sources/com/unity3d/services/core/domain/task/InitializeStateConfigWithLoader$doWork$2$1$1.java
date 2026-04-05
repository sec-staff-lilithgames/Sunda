package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateConfigWithLoader$doWork$2$1$1 extends n implements p {
    final /* synthetic */ b1 $config;
    final /* synthetic */ b1 $configurationLoader;
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$1(b1 b1Var, b1 b1Var2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, d<? super InitializeStateConfigWithLoader$doWork$2$1$1> dVar) {
        super(2, dVar);
        this.$configurationLoader = b1Var;
        this.$config = b1Var2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Exception {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        IConfigurationLoader iConfigurationLoader = (IConfigurationLoader) this.$configurationLoader.f71816b;
        final b1 b1Var = this.$config;
        final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
        final InitializeStateConfigWithLoader.Params params = this.$params;
        iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1.1
            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onError(String errorMsg) throws InitializationException {
                e0.checkNotNullParameter(errorMsg, "errorMsg");
                SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                Metric metricNewEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                e0.checkNotNullExpressionValue(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(errorMsg), params.getConfig());
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onSuccess(Configuration configuration) {
                e0.checkNotNullParameter(configuration, "configuration");
                b1Var.f71816b = configuration;
                configuration.saveToDisk();
                initializeStateConfigWithLoader.tokenStorage.setInitToken(((Configuration) b1Var.f71816b).getUnifiedAuctionToken());
            }
        });
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
