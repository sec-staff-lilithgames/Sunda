package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2978s {

    /* renamed from: b, reason: collision with root package name */
    public static AudioManager f33336b;

    /* renamed from: c, reason: collision with root package name */
    public static C2894n f33337c;

    /* renamed from: f, reason: collision with root package name */
    public static ScheduledFuture f33340f;

    /* renamed from: h, reason: collision with root package name */
    public static C2945q f33342h;

    /* renamed from: a, reason: collision with root package name */
    public static final C2978s f33335a = new C2978s();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f33338d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f33339e = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Set f33341g = Collections.synchronizedSet(new LinkedHashSet());

    public static void a(F5 f52, C2721cc listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new zk.w0(f52, listener, 1));
    }

    public static final void b(F5 f52, C2721cc listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        if (f52 != null) {
            ((G5) f52).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + f33341g.size());
        }
        Set<WeakReference> listeners = f33341g;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listeners, "listeners");
        for (WeakReference weakReference : listeners) {
            if (weakReference.get() == null) {
                f33341g.remove(weakReference);
            }
        }
        Set set = f33341g;
        boolean zIsEmpty = set.isEmpty();
        set.add(new WeakReference(listener));
        Float f10 = (Float) f33339e.get();
        Float fValueOf = f10 != null ? Float.valueOf(D2.a(f10.floatValue() * 100.0f)) : null;
        listener.f32709a.c("window.mraidview.broadcastEvent('audioVolumeChange', " + fValueOf + ");");
        if (!zIsEmpty) {
            if (f52 != null) {
                ((G5) f52).c("AdAudioTracker", "Resuming audio volume change listener");
                return;
            }
            return;
        }
        if (f52 != null) {
            ((G5) f52).c("AdAudioTracker", "Starting audio volume change listener");
        }
        Context contextD = C2925od.d();
        if (contextD == null) {
            if (f52 != null) {
                ((G5) f52).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(E2.a(new r(f52, contextD, ((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getMraid3Config().getMuteChangeInterval())));
        if (thM7134exceptionOrNullimpl != null) {
            if (f52 != null) {
                ((G5) f52).b("AdAudioTracker", b0.e2.o(thM7134exceptionOrNullimpl, new StringBuilder("Error starting audio volume tracking - ")));
            }
            a((Float) null);
        }
    }

    public static void c(F5 f52, C2721cc listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new zk.w0(f52, listener, 0));
    }

    public static final void d(F5 f52, C2721cc listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        if (f52 != null) {
            ((G5) f52).c("AdAudioTracker", "Removing audio volume change listener");
        }
        Set<WeakReference> listeners = f33341g;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listeners, "listeners");
        for (WeakReference weakReference : listeners) {
            if (kotlin.jvm.internal.e0.areEqual(weakReference.get(), listener)) {
                f33341g.remove(weakReference);
            }
        }
        if (f33341g.isEmpty()) {
            if (f52 != null) {
                ((G5) f52).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            Context contextD = C2925od.d();
            if (contextD == null) {
                if (f52 != null) {
                    ((G5) f52).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                a((Float) null);
            } else {
                if (!f33338d.compareAndSet(true, false)) {
                    if (f52 != null) {
                        ((G5) f52).c("AdAudioTracker", "Audio volume tracking is already stopped");
                        return;
                    }
                    return;
                }
                if (f52 != null) {
                    ((G5) f52).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(E2.a(new C2928p(contextD)));
                if (thM7134exceptionOrNullimpl == null || f52 == null) {
                    return;
                }
                ((G5) f52).b("AdAudioTracker", b0.e2.o(thM7134exceptionOrNullimpl, new StringBuilder("Error cleaning up audio volume tracker - ")));
            }
        }
    }

    public static final void e() {
        if (f33338d.get() && b()) {
            a(Float.valueOf(0.0f));
        }
    }

    public static void a(long j10) {
        f33340f = ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).scheduleWithFixedDelay(new al.b(24), 0L, j10, TimeUnit.MILLISECONDS);
    }

    public static void c() {
        if (!R3.f32183a.R()) {
            a((Float) null);
        } else {
            ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new al.b(25));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized float a() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = b()     // Catch: java.lang.Throwable -> L10
            android.media.AudioManager r1 = com.inmobi.media.C2978s.f33336b     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L12
            int r1 = r1.getStreamVolume(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r0 = move-exception
            goto L2f
        L12:
            r1 = r2
        L13:
            android.media.AudioManager r4 = com.inmobi.media.C2978s.f33336b     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L1b
            int r2 = r4.getStreamMaxVolume(r3)     // Catch: java.lang.Throwable -> L10
        L1b:
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            if (r1 >= 0) goto L21
            goto L28
        L21:
            if (r1 <= r2) goto L26
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L2d
        L26:
            if (r2 != 0) goto L2a
        L28:
            r0 = 0
            goto L2d
        L2a:
            float r0 = (float) r1
            float r1 = (float) r2
            float r0 = r0 / r1
        L2d:
            monitor-exit(r5)
            return r0
        L2f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2978s.a():float");
    }

    public static void a(Float f10) {
        if (kotlin.jvm.internal.e0.areEqual((Float) f33339e.getAndSet(f10), f10)) {
            return;
        }
        Iterator it = f33341g.iterator();
        while (it.hasNext()) {
            C2721cc c2721cc = (C2721cc) ((WeakReference) it.next()).get();
            if (c2721cc != null) {
                Float fValueOf = f10 != null ? Float.valueOf(D2.a(f10.floatValue() * 100.0f)) : null;
                c2721cc.f32709a.c("window.mraidview.broadcastEvent('audioVolumeChange', " + fValueOf + ");");
            }
        }
    }

    public static final void d() {
        a(Float.valueOf(f33335a.a()));
    }

    public static boolean b() {
        AudioManager audioManager;
        AudioManager audioManager2;
        if (!R3.f32183a.R() ? (audioManager = f33336b) == null || audioManager.getStreamVolume(3) != 0 : (audioManager2 = f33336b) == null || !audioManager2.isStreamMute(3)) {
            if (!C2925od.o()) {
                return false;
            }
        }
        return true;
    }
}
