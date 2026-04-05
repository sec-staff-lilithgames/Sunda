package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements i2 {

    /* renamed from: e, reason: collision with root package name */
    public static final RouteDiscoveryPreference f61599e = new RouteDiscoveryPreference.Builder(b5.of(), false).build();

    /* renamed from: a, reason: collision with root package name */
    public MediaRouter2 f61600a;

    /* renamed from: b, reason: collision with root package name */
    public w f61601b;

    /* renamed from: c, reason: collision with root package name */
    public x f61602c;

    /* renamed from: d, reason: collision with root package name */
    public io.bidmachine.media3.common.util.e f61603d;

    public static /* synthetic */ void a(y yVar) {
        ((MediaRouter2) io.bidmachine.media3.common.util.a.checkNotNull(yVar.f61600a)).unregisterControllerCallback((MediaRouter2$ControllerCallback) io.bidmachine.media3.common.util.a.checkNotNull(yVar.f61602c));
        yVar.f61602c = null;
        yVar.f61600a.unregisterRouteCallback((MediaRouter2$RouteCallback) io.bidmachine.media3.common.util.a.checkNotNull(yVar.f61601b));
    }

    public static void b(y yVar, Context context) {
        io.bidmachine.media3.common.util.a.checkNotNull(yVar.f61603d);
        yVar.f61600a = MediaRouter2.getInstance(context);
        yVar.f61601b = new w();
        final io.bidmachine.media3.common.util.e eVar = yVar.f61603d;
        Objects.requireNonNull(eVar);
        Executor executor = new Executor() { // from class: io.bidmachine.media3.exoplayer.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                eVar.runInBackground(runnable);
            }
        };
        yVar.f61600a.registerRouteCallback(executor, yVar.f61601b, f61599e);
        x xVar = new x(yVar);
        yVar.f61602c = xVar;
        yVar.f61600a.registerControllerCallback(executor, xVar);
        yVar.f61603d.setStateInBackground(Boolean.valueOf(c(yVar.f61600a)));
    }

    public static boolean c(MediaRouter2 mediaRouter2) {
        int transferReason = ((MediaRouter2) io.bidmachine.media3.common.util.a.checkNotNull(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
        Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            int suitabilityStatus = it.next().getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                if (transferReason == 1 || transferReason == 2) {
                    if (zWasTransferInitiatedBySelf) {
                        return true;
                    }
                }
            } else if (suitabilityStatus == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void disable() {
        ((io.bidmachine.media3.common.util.e) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61603d)).runInBackground(new c(this, 3));
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void enable(h2 h2Var, Context context, Looper looper, Looper looper2, io.bidmachine.media3.common.util.g gVar) {
        io.bidmachine.media3.common.util.e eVar = new io.bidmachine.media3.common.util.e(Boolean.TRUE, looper2, looper, gVar, new s(h2Var, 1));
        this.f61603d = eVar;
        eVar.runInBackground(new im.k(8, this, context));
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isSelectedOutputSuitableForPlayback() {
        io.bidmachine.media3.common.util.e eVar = this.f61603d;
        if (eVar == null) {
            return true;
        }
        return ((Boolean) eVar.get()).booleanValue();
    }
}
