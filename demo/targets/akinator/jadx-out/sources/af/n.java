package af;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.ImageView;
import ao.c1;
import ao.s0;
import bf.d0;
import bf.r0;
import bf.v0;
import bi.w;
import bi.y;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.ads.util.adview.ApsAdViewWebBridge;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.m2;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.google.android.exoplayer2.audio.a0;
import com.google.android.exoplayer2.audio.b0;
import com.google.android.exoplayer2.k2;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.t0;
import com.google.android.exoplayer2.w2;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.h0;
import ee.i0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import ko.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4377c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4378e;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f4376b = i10;
        this.f4377c = obj;
        this.f4378e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        sj.a aVar;
        long j10;
        boolean z10;
        int i10 = this.f4376b;
        long positionInWindowUs = C.TIME_UNSET;
        boolean z11 = false;
        switch (i10) {
            case 0:
                o oVar = (o) this.f4377c;
                DownloadService downloadService = (DownloadService) this.f4378e;
                oVar.f4380b.getCurrentDownloads();
                HashMap map = DownloadService.f27880g;
                downloadService.getClass();
                return;
            case 1:
                InMobiSdk.c((SdkInitializationListener) this.f4377c, (String) this.f4378e);
                return;
            case 2:
                androidx.appcompat.app.t tVar = (androidx.appcompat.app.t) this.f4377c;
                Runnable runnable = (Runnable) this.f4378e;
                tVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    tVar.a();
                }
            case 3:
                ((u.c) ((u.a) this.f4377c)).onWarmupCompleted((Bundle) this.f4378e);
                return;
            case 4:
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) this.f4377c;
                if (!uVar.f6716d.offer((Runnable) this.f4378e)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                uVar.drainQueue();
                return;
            case 5:
                ((io.bidmachine.media3.common.util.k) this.f4377c).accept((s0) this.f4378e);
                return;
            case 6:
                c1 c1Var = (c1) this.f4377c;
                y0 y0Var = (y0) this.f4378e;
                Map map2 = c1.T;
                c1Var.i(y0Var);
                return;
            case 7:
                r0 r0Var = (r0) this.f4377c;
                i0 i0Var = (i0) this.f4378e;
                r0Var.A = r0Var.f9398t == null ? i0Var : new h0(C.TIME_UNSET);
                r0Var.B = i0Var.getDurationUs();
                if (!r0Var.H && i0Var.getDurationUs() == C.TIME_UNSET) {
                    z11 = true;
                }
                r0Var.C = z11;
                r0Var.D = z11 ? 7 : 1;
                ((v0) r0Var.f9387i).onSourceInfoRefreshed(r0Var.B, i0Var.isSeekable(), r0Var.C);
                if (r0Var.f9402x) {
                    return;
                }
                r0Var.e();
                return;
            case 8:
                y yVar = (y) this.f4377c;
                sj.c cVar = (sj.c) this.f4378e;
                if (yVar.f9603b != y.f9601d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (yVar) {
                    aVar = yVar.f9602a;
                    yVar.f9602a = null;
                    yVar.f9603b = cVar;
                }
                aVar.handle(cVar);
                return;
            case 9:
                w wVar = (w) this.f4377c;
                sj.c cVar2 = (sj.c) this.f4378e;
                synchronized (wVar) {
                    try {
                        if (wVar.f9599b == null) {
                            wVar.f9598a.add(cVar2);
                        } else {
                            wVar.f9599b.add(cVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                ((yi.b) ((Map.Entry) this.f4377c).getKey()).handle((yi.a) this.f4378e);
                return;
            case 11:
                ci.a aVar2 = (ci.a) this.f4377c;
                Runnable runnable2 = (Runnable) this.f4378e;
                Process.setThreadPriority(aVar2.f12319e);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f12320f;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 12:
                Callable callable = (Callable) this.f4377c;
                ci.i iVar = (ci.i) this.f4378e;
                try {
                    ((ci.h) iVar).set(callable.call());
                    return;
                } catch (Exception e10) {
                    ((ci.h) iVar).setException(e10);
                    return;
                }
            case 13:
                ci.n nVar = (ci.n) this.f4377c;
                Runnable runnable3 = (Runnable) this.f4378e;
                Semaphore semaphore = nVar.f12353c;
                try {
                    runnable3.run();
                    return;
                } finally {
                    semaphore.release();
                    nVar.d();
                }
            case 14:
                ApsAdViewImpl.loadUrl$lambda$10$lambda$9((ApsAdViewImpl) this.f4377c, (String) this.f4378e);
                return;
            case 15:
                ApsAdViewWebBridge.echo$lambda$8((ApsAdViewWebBridge) this.f4377c, (String) this.f4378e);
                return;
            case 16:
                ((AppLovinFullscreenActivity) this.f4377c).a((Long) this.f4378e);
                return;
            case 17:
                ((AppLovinFullscreenActivity) this.f4377c).a((m2) this.f4378e);
                return;
            case 18:
                ((com.applovin.impl.adview.a) this.f4377c).b((MotionEvent) this.f4378e);
                return;
            case 19:
                ((com.applovin.impl.adview.a) this.f4377c).b((WebView) this.f4378e);
                return;
            case 20:
                ((com.applovin.impl.adview.a) this.f4377c).a((AppLovinAd) this.f4378e);
                return;
            case 21:
                ((com.applovin.impl.sdk.nativeAd.b) this.f4377c).b((AppLovinNativeAdImpl) this.f4378e);
                return;
            case 22:
                ((ImageView) this.f4377c).setImageBitmap((Bitmap) this.f4378e);
                return;
            case 23:
                ((AppLovinAdapterAdViewListener) this.f4377c).lambda$adReceived$0((AppLovinAd) this.f4378e);
                return;
            case 24:
                com.google.android.exoplayer2.r0 r0Var2 = (com.google.android.exoplayer2.r0) this.f4377c;
                u0.c cVar3 = (u0.c) this.f4378e;
                int i11 = r0Var2.H - cVar3.f28090c;
                r0Var2.H = i11;
                if (cVar3.f28091d) {
                    r0Var2.I = cVar3.f28092e;
                    r0Var2.J = true;
                }
                if (cVar3.f28093f) {
                    r0Var2.K = cVar3.f28094g;
                }
                if (i11 == 0) {
                    m3 m3Var = cVar3.f28089b.f27572a;
                    if (!r0Var2.f28004v0.f27572a.isEmpty() && m3Var.isEmpty()) {
                        r0Var2.f28006w0 = -1;
                        r0Var2.f28008x0 = 0L;
                    }
                    if (!m3Var.isEmpty()) {
                        List listAsList = Arrays.asList(((w2) m3Var).f28691n);
                        com.google.android.exoplayer2.util.a.checkState(listAsList.size() == r0Var2.f27989o.size());
                        for (int i12 = 0; i12 < listAsList.size(); i12++) {
                            ((r0.a) r0Var2.f27989o.get(i12)).f28012b = (m3) listAsList.get(i12);
                        }
                    }
                    if (r0Var2.J) {
                        if (cVar3.f28089b.f27573b.equals(r0Var2.f28004v0.f27573b) && cVar3.f28089b.f27575d == r0Var2.f28004v0.f27589r) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (m3Var.isEmpty() || cVar3.f28089b.f27573b.isAd()) {
                                positionInWindowUs = cVar3.f28089b.f27575d;
                            } else {
                                k2 k2Var = cVar3.f28089b;
                                d0 d0Var = k2Var.f27573b;
                                long j11 = k2Var.f27575d;
                                Object obj = d0Var.f9193a;
                                k3 k3Var = r0Var2.f27987n;
                                m3Var.getPeriodByUid(obj, k3Var);
                                positionInWindowUs = k3Var.getPositionInWindowUs() + j11;
                            }
                        }
                        j10 = positionInWindowUs;
                        z10 = i;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = 0;
                    }
                    r0Var2.J = false;
                    r0Var2.y(cVar3.f28089b, 1, r0Var2.K, z10, r0Var2.I, j10, -1, false);
                    return;
                }
                return;
            case 25:
                ((p0) ((b0) n1.castNonNull(((a0) this.f4377c).f27047b))).onAudioDecoderReleased((String) this.f4378e);
                return;
            case 26:
                AudioTrack audioTrack = (AudioTrack) this.f4377c;
                com.google.android.exoplayer2.util.g gVar = (com.google.android.exoplayer2.util.g) this.f4378e;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    gVar.open();
                    synchronized (com.google.android.exoplayer2.audio.c1.f27061h0) {
                        try {
                            int i13 = com.google.android.exoplayer2.audio.c1.f27063j0 - 1;
                            com.google.android.exoplayer2.audio.c1.f27063j0 = i13;
                            if (i13 == 0) {
                                com.google.android.exoplayer2.audio.c1.f27062i0.shutdown();
                                com.google.android.exoplayer2.audio.c1.f27062i0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    gVar.open();
                    synchronized (com.google.android.exoplayer2.audio.c1.f27061h0) {
                        try {
                            int i14 = com.google.android.exoplayer2.audio.c1.f27063j0 - 1;
                            com.google.android.exoplayer2.audio.c1.f27063j0 = i14;
                            if (i14 == 0) {
                                com.google.android.exoplayer2.audio.c1.f27062i0.shutdown();
                                com.google.android.exoplayer2.audio.c1.f27062i0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 27:
                ((qf.v) ((com.google.android.exoplayer2.util.s0) this.f4378e)).onNetworkTypeChanged(((t0) this.f4377c).getNetworkType());
                return;
            case 28:
                ((com.google.firebase.messaging.o) this.f4377c).a((Intent) this.f4378e);
                return;
            default:
                com.google.firebase.messaging.w wVar2 = (com.google.firebase.messaging.w) this.f4377c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4378e;
                wVar2.getClass();
                try {
                    taskCompletionSource.setResult(wVar2.blockingDownload());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
        }
    }
}
