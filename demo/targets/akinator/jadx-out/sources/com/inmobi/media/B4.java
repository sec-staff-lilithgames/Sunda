package com.inmobi.media;

import com.inmobi.media.B4;
import com.ironsource.C3271ic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class B4 {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f31648a = tu.q.lazy(A4.f31618a);

    public static final void a(X9 mRequest, C3102z4 listener, C3085y4 eventPayload, int i10, String str, int i11, long j10, Te te2, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "$request");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventPayload, "$eventPayload");
        kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "mRequest");
        Z9 z9B = mRequest.b();
        if (z9B.b()) {
            boolean z11 = C2736da.f32781a;
            S9 s92 = z9B.f32602d;
            EnumC3017u4 enumC3017u4 = s92 != null ? s92.f32266a : null;
            if (C2736da.f32781a && (enumC3017u4 == EnumC3017u4.f33434q || enumC3017u4 == EnumC3017u4.f33433p || enumC3017u4 == EnumC3017u4.f33432o || enumC3017u4 == EnumC3017u4.f33431n || enumC3017u4 == EnumC3017u4.f33435r)) {
                listener.a(eventPayload, false);
                return;
            } else {
                if (i10 <= 1) {
                    listener.a(eventPayload, true);
                    return;
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("B4", "TAG");
                z9B.a();
                a(eventPayload, str, i11, i10 - 1, j10, te2, listener, z10);
                return;
            }
        }
        listener.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(eventPayload, "eventPayload");
        String TAG = listener.f33689d;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        listener.f33686a.a(eventPayload.f33597a);
        listener.f33686a.a(System.currentTimeMillis());
        if (listener.f33688c != null) {
            ArrayList eventIds = eventPayload.f33597a;
            kotlin.jvm.internal.e0.checkNotNullParameter(eventIds, "eventIds");
            Integer num = AbstractC3010te.f33404c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                AbstractC3010te.f33403b = 0;
                I6 i62 = AbstractC3010te.f33402a;
                if (i62 != null) {
                    I6.a(i62, "count", 0, false, 4, (Object) null);
                }
                AbstractC3010te.f33404c = null;
            }
        }
        listener.f33690e.set(false);
    }

    public static void a(final C3085y4 c3085y4, final String str, final int i10, final int i11, final long j10, final Te te2, final C3102z4 c3102z4, final boolean z10) {
        long j11;
        HashMap mapHashMapOf;
        HashMap map;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("B4", "TAG");
        if (C2736da.a(false) == null && C2925od.m()) {
            final X9 x92 = new X9(C3271ic.f36944b, str, te2, false, (F5) null, (String) null, 104);
            HashMap mapHashMapOf2 = uu.p1.hashMapOf(tu.e0.to("payload", c3085y4.f33598b));
            if (mapHashMapOf2 != null && (map = x92.f32502k) != null) {
                map.putAll(mapHashMapOf2);
            }
            int i12 = i10 - i11;
            if (i12 > 0 && (mapHashMapOf = uu.p1.hashMapOf(tu.e0.to("X-im-retry-count", String.valueOf(i12)))) != null) {
                x92.f32500i.putAll(mapHashMapOf);
            }
            x92.f32515x = false;
            x92.f32511t = false;
            x92.f32512u = false;
            if (z10) {
                long jPow = i11 != i10 ? ((long) Math.pow(2.0d, i12)) * j10 : 0L;
                j11 = jPow;
                Object value = f31648a.getValue();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "getValue(...)");
                ((ScheduledExecutorService) value).schedule(new Runnable() { // from class: zk.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        B4.a(x92, c3102z4, c3085y4, i11, str, i10, j10, te2, z10);
                    }
                }, j11, TimeUnit.SECONDS);
                return;
            }
            if (i11 != i10) {
                j11 = j10;
                Object value2 = f31648a.getValue();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, "getValue(...)");
                ((ScheduledExecutorService) value2).schedule(new Runnable() { // from class: zk.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        B4.a(x92, c3102z4, c3085y4, i11, str, i10, j10, te2, z10);
                    }
                }, j11, TimeUnit.SECONDS);
                return;
            }
            j11 = jPow;
            Object value22 = f31648a.getValue();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(value22, "getValue(...)");
            ((ScheduledExecutorService) value22).schedule(new Runnable() { // from class: zk.d
                @Override // java.lang.Runnable
                public final void run() {
                    B4.a(x92, c3102z4, c3085y4, i11, str, i10, j10, te2, z10);
                }
            }, j11, TimeUnit.SECONDS);
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("B4", "TAG");
        c3102z4.a(c3085y4, false);
    }
}
