package com.inmobi.media;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Wb implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2784g7 f32456a;

    /* renamed from: b, reason: collision with root package name */
    public static C2868l7 f32457b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f32458c;

    /* renamed from: d, reason: collision with root package name */
    public static TelemetryConfig f32459d;

    /* renamed from: e, reason: collision with root package name */
    public static CrashConfig f32460e;

    /* renamed from: f, reason: collision with root package name */
    public static final ReentrantLock f32461f;

    /* renamed from: g, reason: collision with root package name */
    public static final Vb f32462g;

    /* renamed from: h, reason: collision with root package name */
    public static final ReferenceQueue f32463h;

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f32464i;

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f32465j;

    static {
        Wb wb2 = new Wb();
        f32456a = EnumC2784g7.f32872c;
        f32458c = new AtomicBoolean(false);
        f32461f = new ReentrantLock();
        f32462g = Vb.f32397a;
        f32463h = new ReferenceQueue();
        f32464i = new ConcurrentHashMap();
        f32465j = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a("telemetry", C2925od.b(), wb2);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f32459d = (TelemetryConfig) configA;
        Config configA2 = O2.a("crashReporting", C2925od.b(), wb2);
        kotlin.jvm.internal.e0.checkNotNull(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        f32460e = (CrashConfig) configA2;
    }

    public static G5 a(String logType, String placementType, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(logType, "logType");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementType, "placementType");
        Context context = C2925od.d();
        if (context != null) {
            try {
                b();
                TelemetryConfig.LoggingConfig loggingConfig = f32459d.getLoggingConfig();
                double dB = b(logType, placementType, loggingConfig);
                EnumC2784g7 logLevel = a(logType, placementType, loggingConfig);
                boolean z11 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * 1000;
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
                return new G5(context, dB, logLevel, z11, z10, maxNoOfEntries, expiry, false);
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
        return null;
    }

    public static void b() {
        if (f32457b != null) {
            return;
        }
        ReentrantLock reentrantLock = f32461f;
        if (reentrantLock.tryLock()) {
            try {
                if (f32457b == null && f32458c.get()) {
                    Context contextD = C2925od.d();
                    if (contextD != null) {
                        TelemetryConfig.LoggingConfig loggingConfig = f32459d.getLoggingConfig();
                        f32457b = new C2868l7(contextD, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * 1000, loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    C2868l7 c2868l7 = f32457b;
                    if (c2868l7 != null) {
                        J5.a(c2868l7);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                f32461f.unlock();
                throw th2;
            }
        }
    }

    public static final void c() {
        WeakReference weakReference;
        F5 f52;
        while (f32458c.get()) {
            Reference referenceRemove = f32463h.remove();
            ConcurrentHashMap concurrentHashMap = f32464i;
            if (uu.y0.contains(concurrentHashMap.keySet(), referenceRemove)) {
                tu.v vVar = (tu.v) concurrentHashMap.get(referenceRemove);
                if (vVar != null && (weakReference = (WeakReference) vVar.getSecond()) != null && (f52 = (F5) weakReference.get()) != null) {
                    ((G5) f52).a("ReferenceTracker", j1.o2.o(new StringBuilder(" reference "), (String) vVar.getFirst(), " reference is GCed."));
                }
                kotlin.jvm.internal.h1.asMutableMap(concurrentHashMap).remove(referenceRemove);
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((WeakReference) ((tu.v) entry.getValue()).getSecond()).get() == null) {
                    f32464i.remove(entry.getKey());
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC2784g7 a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                        return AbstractC2801h7.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return AbstractC2801h7.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                        return AbstractC2801h7.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return AbstractC2801h7.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                        return AbstractC2801h7.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return AbstractC2801h7.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return AbstractC2801h7.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                        return AbstractC2801h7.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return AbstractC2801h7.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return AbstractC2801h7.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f32456a;
    }

    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.e0.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static void a(Object obj, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
        try {
            if (f32459d.getLoggingConfig().getEnabled()) {
                if (f52 != null) {
                    ((G5) f52).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (f52 != null) {
                    f32464i.put(new PhantomReference(obj, f32463h), new tu.v(obj.toString(), new WeakReference(f52)));
                    if (f32465j.getAndSet(true)) {
                        return;
                    }
                    ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
                    al.b runnable = new al.b(22);
                    kotlin.jvm.internal.e0.checkNotNullParameter("RemoteLoggerComponent", "tag");
                    kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
                    try {
                        AbstractC2969r7.f33308b.submit(runnable);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            f32459d = (TelemetryConfig) config;
            C2868l7 c2868l7 = f32457b;
            if (c2868l7 != null) {
                c2868l7.f33053g.set(true);
            }
            f32457b = null;
            al.b runnable = new al.b(23);
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            AbstractC2809hf.f32906a.execute(runnable);
            return;
        }
        if (config instanceof CrashConfig) {
            f32460e = (CrashConfig) config;
        }
    }

    public static final void a() {
        b();
    }
}
