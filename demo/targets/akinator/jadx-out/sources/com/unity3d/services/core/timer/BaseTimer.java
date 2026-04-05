package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BaseTimer implements IBaseTimer {
    final Integer _delayMs;
    private final AtomicBoolean _hasPaused;
    private final AtomicBoolean _isRunning;
    private final LifecycleCache _lifecycleCache;
    Integer _remainingDurationMs;
    private ScheduledFuture<?> _task;
    private ITimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    final Integer _totalDurationMs;

    public BaseTimer(Integer num, ITimerListener iTimerListener, LifecycleCache lifecycleCache) {
        this._delayMs = 1000;
        this._isRunning = new AtomicBoolean(false);
        this._hasPaused = new AtomicBoolean(false);
        this._totalDurationMs = num;
        this._remainingDurationMs = num;
        this._timerListener = iTimerListener;
        this._lifecycleCache = lifecycleCache;
        addLifecycleListener();
    }

    private void addLifecycleListener() {
        LifecycleCache lifecycleCache = this._lifecycleCache;
        if (lifecycleCache == null) {
            return;
        }
        lifecycleCache.addActiveListener(new IAppActiveListener() { // from class: com.unity3d.services.core.timer.BaseTimer.1
            @Override // com.unity3d.services.core.lifecycle.IAppActiveListener
            public void onAppStateChanged(boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (z10) {
                    if (BaseTimer.this._hasPaused.get()) {
                        BaseTimer.this._hasPaused.getAndSet(false);
                        BaseTimer.this.resume();
                        return;
                    }
                    return;
                }
                if (BaseTimer.this.isRunning()) {
                    BaseTimer.this.pause();
                    BaseTimer.this._hasPaused.getAndSet(true);
                }
            }
        });
    }

    private void notifyListeners() {
        ITimerListener iTimerListener = this._timerListener;
        if (iTimerListener != null) {
            iTimerListener.onTimerFinished();
        }
    }

    private void schedule() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            this._task = this._timerService.scheduleAtFixedRate(new Runnable() { // from class: com.unity3d.services.core.timer.BaseTimer.2
                @Override // java.lang.Runnable
                public void run() {
                    BaseTimer baseTimer = BaseTimer.this;
                    baseTimer._remainingDurationMs = Integer.valueOf(baseTimer._remainingDurationMs.intValue() - BaseTimer.this._delayMs.intValue());
                    BaseTimer.this.onStep();
                }
            }, this._delayMs.intValue(), this._delayMs.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e10) {
            DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e10.getLocalizedMessage());
        }
    }

    public boolean isRunning() {
        return this._isRunning.get();
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        stop();
        this._timerListener = null;
    }

    public void onStep() {
        if (this._remainingDurationMs.intValue() <= 0) {
            notifyListeners();
            kill();
        }
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public boolean pause() {
        boolean z10;
        ScheduledFuture<?> scheduledFuture = this._task;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z10 = false;
        } else {
            z10 = true;
            this._task.cancel(true);
            this._task = null;
        }
        this._isRunning.getAndSet(false);
        return z10;
    }

    public void restart(ScheduledExecutorService scheduledExecutorService) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ScheduledExecutorService scheduledExecutorService2 = this._timerService;
        if (scheduledExecutorService2 == null || scheduledExecutorService2.isShutdown()) {
            this._timerService = scheduledExecutorService;
        }
        this._remainingDurationMs = this._totalDurationMs;
        schedule();
        this._isRunning.getAndSet(true);
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public boolean resume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z10 = false;
        } else {
            schedule();
            z10 = true;
        }
        this._isRunning.getAndSet(z10);
        return z10;
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void start(ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void stop() {
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
            this._timerService = null;
        }
        this._isRunning.getAndSet(false);
    }

    public BaseTimer(Integer num, ITimerListener iTimerListener) {
        this(num, iTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
