package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2691b extends I3 {

    /* renamed from: b, reason: collision with root package name */
    public final long f32663b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC2674a f32664c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f32665d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f32666e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f32667f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f32668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2691b(long j10, J3 listener) {
        super(listener);
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f32663b = j10;
        this.f32664c = new RunnableC2674a(this);
        this.f32665d = new AtomicBoolean(false);
        this.f32666e = new AtomicBoolean(false);
        this.f32667f = new Handler(Looper.getMainLooper());
    }

    public static final StackTraceElement[] a(C2691b c2691b) {
        c2691b.getClass();
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    public static final void b(C2691b this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.f32665d.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this$0.f32668g;
        if (scheduledExecutorService == null || scheduledExecutorService.scheduleAtFixedRate(this$0.f32664c, 0L, this$0.f32663b, TimeUnit.MILLISECONDS) == null) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new Q5("ANRWatchDog"));
            this$0.f32668g = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor != null) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(this$0.f32664c, 0L, this$0.f32663b, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.inmobi.media.I3
    public final void a() {
        zg.h runnable = new zg.h(this, 11);
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2809hf.f32906a.execute(runnable);
    }

    @Override // com.inmobi.media.I3
    public final void b() {
        if (this.f32665d.getAndSet(false)) {
            this.f32665d.set(false);
            this.f32666e.set(false);
            ScheduledExecutorService scheduledExecutorService = this.f32668g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.f32668g = null;
        }
    }
}
