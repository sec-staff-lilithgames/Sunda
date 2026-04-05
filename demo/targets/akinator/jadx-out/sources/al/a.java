package al;

import android.app.Activity;
import android.content.Context;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import ao.q0;
import bf.d0;
import bf.i0;
import bf.j0;
import bf.y;
import br.h0;
import com.amazon.aps.shared.util.APSNetworkManager;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.e1;
import com.applovin.impl.i;
import com.applovin.impl.j;
import com.applovin.impl.k0;
import com.applovin.impl.m2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.q1;
import com.applovin.impl.q2;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.google.android.ump.FormError;
import com.inmobi.media.C8;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.ironsource.AbstractC3297k3;
import com.ironsource.C3466te;
import com.ironsource.C3568ze;
import com.ironsource.Ga;
import com.ironsource.InterfaceC3432re;
import com.ironsource.M2;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import dq.a0;
import io.bidmachine.media3.exoplayer.audio.p;
import io.bidmachine.media3.exoplayer.audio.s;
import io.bidmachine.media3.exoplayer.audio.u0;
import io.odeeo.internal.a0.q;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.u;
import ir.d;
import ir.g;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import jd.m;
import ji.r;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4435c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4438g;

    public /* synthetic */ a(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f4434b = i10;
        this.f4435c = obj;
        this.f4436e = obj2;
        this.f4437f = obj3;
        this.f4438g = obj4;
    }

    public /* synthetic */ a(int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f4434b = i10;
        this.f4435c = obj;
        this.f4437f = str;
        this.f4436e = obj2;
        this.f4438g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f4434b) {
            case 0:
                InMobiSdk.a((Context) this.f4435c, (SdkInitializationListener) this.f4436e, (String) this.f4437f, (JSONObject) this.f4438g);
                return;
            case 1:
                ((j0) this.f4436e).onUpstreamDiscarded(((i0) this.f4435c).f9271a, (d0) this.f4437f, (y) this.f4438g);
                return;
            case 2:
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0((IronSourceNativeAdAdapter) this.f4435c, (JSONObject) this.f4438g, (NativeAdSmashListener) this.f4436e, (String) this.f4437f);
                return;
            case 3:
                ((APSNetworkManager) this.f4435c).lambda$sendData$0((String) this.f4437f, (String) this.f4436e, (String) this.f4438g);
                return;
            case 4:
                ((d2) this.f4435c).a((String) this.f4437f, (c2) this.f4436e, (JSONObject) this.f4438g);
                return;
            case 5:
                ((e1) this.f4435c).a((com.applovin.impl.adview.a) this.f4436e, (Activity) this.f4438g, (String) this.f4437f);
                return;
            case 6:
                ((j) this.f4435c).a((j.b) this.f4436e, (String) this.f4437f, (String) this.f4438g);
                return;
            case 7:
                ((m2) this.f4435c).a((ViewGroup) this.f4436e, (Activity) this.f4437f, (AppLovinFullscreenAdViewObserver) this.f4438g);
                return;
            case 8:
                ((MaxFullscreenAdImpl) this.f4436e).a((Activity) this.f4437f, (Context) this.f4435c, (i) this.f4438g);
                return;
            case 9:
                ((MaxFullscreenAdImpl) this.f4435c).a((String) this.f4437f, (String) this.f4436e, (Activity) this.f4438g);
                return;
            case 10:
                ((com.applovin.impl.privacy.cmp.a) this.f4435c).a((FormError) this.f4436e, (k0) this.f4437f, (a.InterfaceC0037a) this.f4438g);
                return;
            case 11:
                ((q1) this.f4435c).a((String) this.f4437f, (String) this.f4436e, (Throwable) this.f4438g);
                return;
            case 12:
                q2.b((AppLovinAdViewEventListener) this.f4435c, (AppLovinAd) this.f4436e, (AppLovinAdView) this.f4437f, (AppLovinAdViewDisplayErrorCode) this.f4438g);
                return;
            case 13:
                ((EventServiceImpl) this.f4435c).b((String) this.f4437f, (Map) this.f4436e, (Map) this.f4438g);
                return;
            case 14:
                ((com.applovin.impl.sdk.c) this.f4435c).a((File) this.f4436e, (c.InterfaceC0040c) this.f4437f, (c.a) this.f4438g);
                return;
            case 15:
                ImageViewUtils.a((String) this.f4437f, (k) this.f4435c, (ImageView) this.f4436e, (Uri) this.f4438g);
                return;
            case 16:
                Ga.a((Ga) this.f4435c, (M2) this.f4436e, (AbstractC3297k3) this.f4437f, (Long) this.f4438g);
                return;
            case 17:
                C3568ze.a((InterfaceC3432re) this.f4436e, (Context) this.f4435c, (C3466te) this.f4437f, (Context) this.f4438g);
                return;
            case 18:
                VungleInitializer.m3594init$lambda2((VungleInitializer) this.f4436e, (Context) this.f4435c, (String) this.f4437f, (o) this.f4438g);
                return;
            case 19:
                BaseAdLoader$assetDownloadListener$1.m3615onSuccess$lambda2((File) this.f4435c, (BaseAdLoader$assetDownloadListener$1) this.f4436e, (DownloadRequest) this.f4437f, (BaseAdLoader) this.f4438g);
                return;
            case 20:
                BaseAdLoader$assetDownloadListener$1.m3613onError$lambda1((DownloadRequest) this.f4435c, (BaseAdLoader) this.f4436e, (BaseAdLoader$assetDownloadListener$1) this.f4437f, (AssetDownloadListener.DownloadError) this.f4438g);
                return;
            case 21:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.f4435c, (AdapterNativeAdData) this.f4436e, (AdapterNativeAdViewBinder) this.f4437f, (AdInfo) this.f4438g);
                return;
            case 22:
                a0 this$0 = (a0) this.f4436e;
                Context context = (Context) this.f4435c;
                Uri uri = (Uri) this.f4437f;
                d dVar = (d) this.f4438g;
                int i10 = a0.f52460b;
                e0.checkNotNullParameter(this$0, "this$0");
                e0.checkNotNullParameter(uri, "$uri");
                e0.checkNotNullExpressionValue(context, gjnZrsdA.bhS);
                g.findEndpointAndOpenUrl(context, uri.toString(), dVar);
                return;
            case 23:
                gq.b this$02 = (gq.b) this.f4435c;
                tm.y yVar = (tm.y) this.f4436e;
                String str = (String) this.f4437f;
                String preparedSource = (String) this.f4438g;
                int i11 = gq.b.f58390u;
                e0.checkNotNullParameter(this$02, "this$0");
                e0.checkNotNullParameter(preparedSource, "$preparedSource");
                try {
                    Context contextT = this$02.t();
                    ar.d dVar2 = this$02.f58391s;
                    List<String> listD = this$02.D();
                    eq.c cVar = this$02.f54991g;
                    tq.b eventCallback = this$02.o();
                    e0.checkNotNullExpressionValue(eventCallback, "eventCallback");
                    tm.g gVar = new tm.g(contextT, yVar, str, null, listD, null, new gq.c(this$02, cVar, eventCallback, dVar2));
                    gVar.load(preparedSource);
                    if (dVar2 != null) {
                        dVar2.onViewCreated(gVar.getWebView());
                    }
                    this$02.f58392t = gVar;
                    return;
                } catch (Throwable th2) {
                    dq.d0.b(th2);
                    this$02.a(h0.f9867b.create(th2));
                    return;
                }
            case 24:
                ((u.a) this.f4435c).a((u) this.f4436e, (t.a) this.f4437f, (q) this.f4438g);
                return;
            case 25:
                AudioTrack audioTrack = (AudioTrack) this.f4435c;
                s sVar = (s) this.f4436e;
                Handler handler = (Handler) this.f4437f;
                p pVar = (p) this.f4438g;
                int i12 = 11;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (sVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new im.k(i12, sVar, pVar));
                    }
                    synchronized (u0.f61020l0) {
                        try {
                            int i13 = u0.f61022n0 - 1;
                            u0.f61022n0 = i13;
                            if (i13 == 0) {
                                u0.f61021m0.shutdown();
                                u0.f61021m0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (sVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new im.k(i12, sVar, pVar));
                    }
                    synchronized (u0.f61020l0) {
                        try {
                            int i14 = u0.f61022n0 - 1;
                            u0.f61022n0 = i14;
                            if (i14 == 0) {
                                u0.f61021m0.shutdown();
                                u0.f61021m0 = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            case 26:
                ji.u uVar = (ji.u) this.f4435c;
                String str2 = (String) this.f4437f;
                Map<String, String> map = (Map) this.f4436e;
                List<r> list = (List) this.f4438g;
                ji.j jVar = uVar.f69618a;
                if (uVar.getUserId() != null) {
                    jVar.writeUserData(str2, uVar.getUserId());
                }
                if (!map.isEmpty()) {
                    jVar.writeKeyData(str2, map);
                }
                if (list.isEmpty()) {
                    return;
                }
                jVar.writeRolloutState(str2, list);
                return;
            case 27:
                List list2 = (List) this.f4435c;
                v6.s sVar2 = (v6.s) this.f4436e;
                androidx.work.a aVar = (androidx.work.a) this.f4437f;
                WorkDatabase workDatabase = (WorkDatabase) this.f4438g;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((o6.r) it.next()).cancel(sVar2.getWorkSpecId());
                }
                o6.t.schedule(aVar, workDatabase, list2);
                return;
            case 28:
                td.a aVar2 = (td.a) this.f4435c;
                md.d0 d0Var = (md.d0) this.f4436e;
                m mVar = (m) this.f4437f;
                md.u uVar2 = (md.u) this.f4438g;
                Logger logger = td.a.f86813f;
                try {
                    nd.o oVar = ((nd.m) aVar2.f86816c).get(d0Var.getBackendName());
                    if (oVar == null) {
                        String str3 = "Transport backend '" + d0Var.getBackendName() + "' is not registered";
                        logger.warning(str3);
                        mVar.onSchedule(new IllegalArgumentException(str3));
                    } else {
                        ((vd.p) aVar2.f86818e).runCriticalSection(new q0(aVar2, 17, d0Var, ((kd.d) oVar).decorate(uVar2)));
                        mVar.onSchedule(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    mVar.onSchedule(e10);
                    return;
                }
            default:
                C8.a((String) this.f4437f, (C8) this.f4435c, (JSONObject) this.f4438g, (String) this.f4436e);
                return;
        }
    }

    public /* synthetic */ a(e1 e1Var, com.applovin.impl.adview.a aVar, Activity activity, String str) {
        this.f4434b = 5;
        this.f4435c = e1Var;
        this.f4436e = aVar;
        this.f4438g = activity;
        this.f4437f = str;
    }

    public /* synthetic */ a(MaxFullscreenAdImpl maxFullscreenAdImpl, Activity activity, Context context, i iVar) {
        this.f4434b = 8;
        this.f4436e = maxFullscreenAdImpl;
        this.f4437f = activity;
        this.f4435c = context;
        this.f4438g = iVar;
    }

    public /* synthetic */ a(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        this.f4434b = 2;
        this.f4435c = ironSourceNativeAdAdapter;
        this.f4438g = jSONObject;
        this.f4436e = nativeAdSmashListener;
        this.f4437f = str;
    }

    public /* synthetic */ a(Object obj, Context context, Object obj2, Object obj3, int i10) {
        this.f4434b = i10;
        this.f4436e = obj;
        this.f4435c = context;
        this.f4437f = obj2;
        this.f4438g = obj3;
    }

    public /* synthetic */ a(String str, k kVar, ImageView imageView, Uri uri) {
        this.f4434b = 15;
        this.f4437f = str;
        this.f4435c = kVar;
        this.f4436e = imageView;
        this.f4438g = uri;
    }

    public /* synthetic */ a(String str, C8 c82, JSONObject jSONObject, String str2) {
        this.f4434b = 29;
        this.f4437f = str;
        this.f4435c = c82;
        this.f4438g = jSONObject;
        this.f4436e = str2;
    }
}
