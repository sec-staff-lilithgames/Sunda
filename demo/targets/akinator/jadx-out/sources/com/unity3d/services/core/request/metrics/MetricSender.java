package com.unity3d.services.core.request.metrics;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kv.p;
import org.json.JSONObject;
import sv.n0;
import tu.a0;
import tu.x0;
import uu.o0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final CoroutineScope scope;
    private final String sessionToken;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ List<Metric> $metrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Metric> list, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$metrics = list;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return MetricSender.this.new AnonymousClass1(this.$metrics, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Object objExecute;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                String string = new JSONObject(new MetricsContainer(MetricSender.this.metricSampleRate, MetricSender.this.commonTags, this.$metrics, MetricSender.this.sessionToken).toMap()).toString();
                e0.checkNotNullExpressionValue(string, "JSONObject(container.toMap()).toString()");
                String metricEndPoint = MetricSender.this.getMetricEndPoint();
                if (metricEndPoint == null) {
                    metricEndPoint = "";
                }
                HttpRequest httpRequest = new HttpRequest(metricEndPoint, null, RequestType.POST, string, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
                HttpClient httpClient = MetricSender.this.httpClient;
                this.label = 1;
                objExecute = httpClient.execute(httpRequest, this);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objExecute = obj;
            }
            HttpResponse httpResponse = (HttpResponse) objExecute;
            if (httpResponse.getStatusCode() / 100 == 2) {
                DeviceLog.debug("Metric " + this.$metrics + " sent to " + MetricSender.this.getMetricEndPoint());
            } else {
                DeviceLog.debug("Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode());
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(mv.d.roundToInt(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService("", c1.getOrCreateKotlinClass(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClient = (HttpClient) getServiceProvider().getRegistry().getService("", c1.getOrCreateKotlinClass(HttpClient.class));
        this.scope = CoroutineScopeKt.CoroutineScope(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(event, "event");
        e0.checkNotNullParameter(tags, "tags");
        if (event.length() != 0) {
            sendMetrics(o0.listOf(new Metric(event, str, tags)));
            return;
        }
        DeviceLog.debug("Metric event not sent due to being null or empty: " + event);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(metric2, "metric");
        sendMetrics(o0.listOf(metric2));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(List<Metric> metrics) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(metrics, "metrics");
        if (metrics.isEmpty()) {
            DeviceLog.debug("Metrics event not send due to being empty");
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint != null && !n0.isBlank(metricEndPoint)) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, metrics), null, new AnonymousClass1(metrics, null), 2, null);
            return;
        }
        DeviceLog.debug("Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint());
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
