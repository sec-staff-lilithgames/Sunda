package com.unity3d.ads.core.domain;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends zu.a implements CoroutineExceptionHandler {
    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(m mVar, Throwable th2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + th2.getMessage());
    }
}
