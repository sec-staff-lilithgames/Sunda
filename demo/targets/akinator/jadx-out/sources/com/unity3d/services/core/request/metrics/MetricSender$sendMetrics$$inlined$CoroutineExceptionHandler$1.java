package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import zu.a;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements CoroutineExceptionHandler {
    final /* synthetic */ List $metrics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, List list) {
        super(key);
        this.$metrics$inlined = list;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(m mVar, Throwable th2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th2);
    }
}
