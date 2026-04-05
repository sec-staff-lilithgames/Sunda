package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DefaultIntervalTimerFactory implements IIntervalTimerFactory {
    @Override // com.unity3d.services.core.timer.IIntervalTimerFactory
    public IIntervalTimer createTimer(Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener) {
        return new IntervalTimer(num, num2, iIntervalTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
