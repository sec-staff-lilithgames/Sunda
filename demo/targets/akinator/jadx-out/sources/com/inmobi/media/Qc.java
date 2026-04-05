package com.inmobi.media;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Qc {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f32173a;

    static {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Qc", "getSimpleName(...)");
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        f32173a = setNewSetFromMap;
    }

    public static void a(Oc oc2, long j10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        int iOrdinal = oc2.f32105f.ordinal();
        if (iOrdinal == 0) {
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) F4.f31771c.getValue();
        } else {
            if (iOrdinal != 1) {
                throw new tu.t();
            }
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) F4.f31770b.getValue();
        }
        scheduledThreadPoolExecutor.schedule(new Rc(oc2, Pc.f32138a), j10, TimeUnit.MILLISECONDS);
    }
}
