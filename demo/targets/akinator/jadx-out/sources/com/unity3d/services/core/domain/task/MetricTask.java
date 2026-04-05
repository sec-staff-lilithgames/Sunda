package com.unity3d.services.core.domain.task;

import a.b;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import j1.o2;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        this.taskStatus = z.m7137isSuccessimpl(obj) ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        e0.checkNotNullExpressionValue(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", c1.getOrCreateKotlinClass(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: invoke-gIAlu-s$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m3530invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask<? super P, R> r8, P r9, zu.d<? super tu.z> r10) {
        /*
            boolean r0 = r10 instanceof com.unity3d.services.core.domain.task.MetricTask$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.MetricTask$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L51
            if (r2 != r3) goto L49
            long r8 = r0.J$0
            java.lang.Object r1 = r0.L$4
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            java.lang.Object r2 = r0.L$3
            com.unity3d.services.core.domain.task.MetricTask r2 = (com.unity3d.services.core.domain.task.MetricTask) r2
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.b1 r3 = (kotlin.jvm.internal.b1) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.b1 r4 = (kotlin.jvm.internal.b1) r4
            java.lang.Object r0 = r0.L$0
            com.unity3d.services.core.domain.task.MetricTask r0 = (com.unity3d.services.core.domain.task.MetricTask) r0
            tu.a0.throwOnFailure(r10)
            tu.z r10 = (tu.z) r10
            java.lang.Object r10 = r10.m7139unboximpl()
            r6 = r8
            r9 = r4
            r4 = r6
            r8 = r2
            goto L75
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L51:
            kotlin.jvm.internal.b1 r10 = com.google.android.gms.internal.play_billing.a.m(r10)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = java.lang.System.nanoTime()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r10
            r0.L$3 = r8
            r0.L$4 = r2
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m3514invokegIAlus(r8, r9, r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            r0 = r8
            r3 = r10
            r1 = r2
            r10 = r9
            r9 = r3
        L75:
            r3.f71816b = r10
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r1 = r1.toMillis(r2)
            r8.duration = r1
            java.lang.Object r8 = r9.f71816b
            r0.captureMetric(r8)
            java.lang.Object r8 = r9.f71816b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.MetricTask.m3530invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask, com.unity3d.services.core.domain.task.BaseParams, zu.d):java.lang.Object");
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getMetricName() {
        return null;
    }

    public final String getMetricNameForInitializeTask(String name) {
        e0.checkNotNullParameter(name, "name");
        StringBuilder sb2 = new StringBuilder("native_");
        sb2.append(name);
        sb2.append("_task_");
        return o2.o(sb2, this.taskStatus, "_time");
    }

    public final String getMetricNameForTask(Object task) {
        e0.checkNotNullParameter(task, "task");
        String className = task.getClass().getSimpleName();
        e0.checkNotNullExpressionValue(className, "className");
        if (className.length() == 0) {
            return null;
        }
        e0.checkNotNullExpressionValue(className, "className");
        String strSubstring = className.substring(getStatePrefixLength());
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return b.o(new StringBuilder(lowerCase.length() + 13), "native_", lowerCase, "_state");
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: invoke-gIAlu-s */
    public Object mo3513invokegIAlus(P p10, d<? super z> dVar) {
        return m3530invokegIAlus$suspendImpl(this, p10, dVar);
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setTaskStatus(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.taskStatus = str;
    }
}
