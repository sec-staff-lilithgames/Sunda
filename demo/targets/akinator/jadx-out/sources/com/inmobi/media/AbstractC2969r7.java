package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2969r7 {

    /* renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f33307a;

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f33308b;

    /* renamed from: c, reason: collision with root package name */
    public static final Semaphore f33309c;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f33310d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new Q5("Log", true));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        f33307a = scheduledExecutorServiceNewScheduledThreadPool;
        f33308b = Executors.newSingleThreadExecutor(new Q5("LogSingle", true));
        f33309c = new Semaphore(1);
        f33310d = new AtomicBoolean(false);
    }
}
