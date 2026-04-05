package androidx.browser.customtabs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.applovin.impl.a5;
import com.applovin.impl.b5;
import com.applovin.impl.c2;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.e1;
import com.applovin.impl.h7;
import com.applovin.impl.i8;
import com.applovin.impl.l8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n5;
import com.applovin.impl.q2;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.u0;
import com.applovin.impl.v1;
import com.applovin.impl.y0;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.google.android.exoplayer2.z1;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.ironsource.Da;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.List;
import java.util.concurrent.Executor;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5222c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5224f;

    public /* synthetic */ g(Object obj, int i10, Object obj2, Object obj3) {
        this.f5221b = i10;
        this.f5222c = obj;
        this.f5223e = obj2;
        this.f5224f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5221b;
        Object obj = this.f5224f;
        Object obj2 = this.f5223e;
        Object obj3 = this.f5222c;
        switch (i10) {
            case 0:
                ((u.c) ((u.a) obj3)).onExtraCallback((String) obj2, (Bundle) obj);
                return;
            case 1:
                ((ar.a) obj3).f7924b.clear();
                ((Handler) obj2).post((Runnable) obj);
                return;
            case 2:
                bf.i0 i0Var = (bf.i0) obj3;
                ((bf.j0) obj2).onDownstreamFormatChanged(i0Var.f9271a, i0Var.f9272b, (bf.y) obj);
                return;
            case 3:
                super/*android.webkit.WebView*/.evaluateJavascript((String) obj2, (ValueCallback) obj);
                return;
            case 4:
                ApsAsyncUtil.lambda$runAsyncAndCallbackOnUiThread$2((ApsAsyncUtil.ApsExecutionListener) obj3, (ApsResult) obj2, obj);
                return;
            case 5:
                ((DtbOmSdkSessionManager) obj3).lambda$addFriendlyObstruction$8((View) obj2, (FriendlyObstructionPurpose) obj);
                return;
            case 6:
                ((com.applovin.impl.adview.a) obj3).a((String) obj2, (String) obj);
                return;
            case 7:
                ((c4) obj3).a((View) obj2, (List) obj);
                return;
            case 8:
                ((c4) obj3).a((String) obj2, (Runnable) obj);
                return;
            case 9:
                ((d2) obj3).b((c2) obj2, (List) obj);
                return;
            case 10:
                ((e1) obj3).a((com.applovin.impl.sdk.ad.b) obj2, (k0) obj);
                return;
            case 11:
                ((e1) obj3).a((List) obj2, (k0) obj);
                return;
            case 12:
                h7.a((com.applovin.impl.sdk.k) obj3, (String) obj2, (com.applovin.impl.sdk.ad.b) obj);
                return;
            case 13:
                ((i8) obj3).b((com.applovin.impl.sdk.network.e) obj2, (AppLovinPostbackListener) obj);
                return;
            case 14:
                l8.a((WebView) obj3, (String) obj2, (q4) obj);
                return;
            case 15:
                ((MaxAdViewImpl) obj3).a((a.InterfaceC0034a) obj2, (com.applovin.impl.i) obj);
                return;
            case 16:
                ((MaxFullscreenAdImpl.b) obj3).a((z2) obj2, (MaxAd) obj);
                return;
            case 17:
                ((MaxFullscreenAdImpl.b) obj3).a((String) obj2, (MaxError) obj);
                return;
            case 18:
                ((n5) obj3).b((b5) obj2, (a5.a) obj);
                return;
            case 19:
                q2.a((MaxAdReviewListener) obj3, (String) obj2, (MaxAd) obj);
                return;
            case 20:
                ((q4) obj3).b((Executor) obj2, (q4.b) obj);
                return;
            case 21:
                ((com.applovin.impl.sdk.network.b) obj3).b((com.applovin.impl.sdk.network.d) obj2, (AppLovinPostbackListener) obj);
                return;
            case 22:
                ImageViewUtils.a((com.applovin.impl.sdk.k) obj3, (Bitmap) obj2, (ImageView) obj);
                return;
            case 23:
                ((v1) obj3).a((com.applovin.impl.b) obj2, (q4) obj);
                return;
            case 24:
                ((y0) obj3).a((u0) obj2, (Activity) obj);
                return;
            case 25:
                ((z1) obj3).f28817c.updateMediaPeriodQueueInfo(((x4) obj2).build(), (bf.d0) obj);
                return;
            case 26:
                Pair pair = (Pair) obj2;
                f2.this.f27472h.onDrmSessionManagerError(((Integer) pair.first).intValue(), (bf.d0) pair.second, (Exception) obj);
                return;
            case 27:
                z0 z0Var = (z0) obj2;
                com.google.android.exoplayer2.audio.b0 b0Var = ((com.google.android.exoplayer2.audio.a0) obj3).f27047b;
                ((com.google.android.exoplayer2.p0) ((com.google.android.exoplayer2.audio.b0) n1.castNonNull(b0Var))).onAudioInputFormatChanged(z0Var);
                ((com.google.android.exoplayer2.p0) ((com.google.android.exoplayer2.audio.b0) n1.castNonNull(b0Var))).onAudioInputFormatChanged(z0Var, (ce.k) obj);
                return;
            case 28:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) obj3;
                Intent intent = (Intent) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                int i11 = EnhancedIntentService.f29716h;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            default:
                Da.a((LevelPlayAdInfo) obj3, (LevelPlayAdError) obj2, (Da) obj);
                return;
        }
    }
}
