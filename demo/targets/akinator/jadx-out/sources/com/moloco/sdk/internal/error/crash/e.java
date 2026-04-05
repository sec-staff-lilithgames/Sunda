package com.moloco.sdk.internal.error.crash;

import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f45906a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.api.a f45907b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f45908c;

    public e(List<? extends com.moloco.sdk.internal.error.crash.filters.a> exceptionFilters, com.moloco.sdk.internal.error.api.a errorReporter, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        e0.checkNotNullParameter(exceptionFilters, "exceptionFilters");
        e0.checkNotNullParameter(errorReporter, "errorReporter");
        e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f45906a = exceptionFilters;
        this.f45907b = errorReporter;
        this.f45908c = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.error.crash.d
    public void a(Throwable crash) {
        e0.checkNotNullParameter(crash, "crash");
        if (!b(crash)) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashHandlerService", "App Crashed", null, false, 12, null);
            return;
        }
        this.f45908c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.G.c()));
        this.f45907b.a(crash);
    }

    public final boolean b(Throwable th2) {
        Iterator it = this.f45906a.iterator();
        while (it.hasNext()) {
            if (((com.moloco.sdk.internal.error.crash.filters.a) it.next()).a(th2)) {
                return true;
            }
        }
        return false;
    }
}
