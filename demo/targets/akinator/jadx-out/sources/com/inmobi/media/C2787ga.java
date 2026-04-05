package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2787ga extends Pa {

    /* renamed from: g, reason: collision with root package name */
    public final Object f32880g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f32881h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2787ga(Za dao, G3 listener, Ua networkHandler) {
        super(dao, listener, networkHandler);
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkHandler, "networkHandler");
        this.f32880g = new Object();
    }

    public final void a() {
        synchronized (this.f32880g) {
            ScheduledFuture scheduledFuture = this.f32881h;
            if (scheduledFuture != null) {
                kotlin.jvm.internal.e0.checkNotNull(scheduledFuture);
                if (!scheduledFuture.isDone()) {
                    return;
                }
            }
            long normal = this.f32136f.getInterval().getNormal();
            if (normal <= 0) {
                return;
            }
            this.f32881h = ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).scheduleWithFixedDelay(new zg.h(this, 15), 0L, normal, TimeUnit.SECONDS);
        }
    }

    public final void b() {
        synchronized (this.f32880g) {
            try {
                ScheduledFuture scheduledFuture = this.f32881h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.f32881h = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void a(C2787ga this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.f32134d != Ma.f32031a) {
            int normal = this$0.f32136f.getMaxBatchSize().getNormal();
            this$0.f32131a.a("time_created < ?", new String[]{String.valueOf(System.currentTimeMillis() - (this$0.f32136f.getExpiry().getNormal() * 1000))});
            Za za2 = this$0.f32131a;
            Integer numValueOf = Integer.valueOf(normal);
            kotlin.jvm.internal.e0.checkNotNullParameter("normal", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            List listFilterNotNull = uu.y0.filterNotNull(V1.a(za2, "priority = ? AND retryAfter <= ?", new String[]{"normal", String.valueOf(System.currentTimeMillis())}, null, null, "time_created ASC", numValueOf, 12));
            if (listFilterNotNull.isEmpty()) {
                Za za3 = this$0.f32131a;
                kotlin.jvm.internal.e0.checkNotNullParameter("normal", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                if (V1.a(za3, "priority = ?", new String[]{"normal"}, 12) == 0) {
                    Ma ma2 = Ma.f32032b;
                    if (this$0.a(ma2)) {
                        this$0.f32134d = ma2;
                    }
                    synchronized (this$0.f32880g) {
                        try {
                            ScheduledFuture scheduledFuture = this$0.f32881h;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this$0.f32881h = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            Iterator it = listFilterNotNull.iterator();
            while (it.hasNext()) {
                this$0.a((Ja) it.next(), (ScheduledThreadPoolExecutor) F4.f31770b.getValue(), new C2770fa(this$0));
            }
        }
    }
}
