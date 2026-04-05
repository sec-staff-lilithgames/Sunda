package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import tu.u;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final MutableSharedFlow<String> broadcastEventChannel = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

        private Companion() {
        }

        public final MutableSharedFlow<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, d<? super x0> dVar) {
            CoroutineScopeKt.cancel$default(adPlayer.getScope(), null, 1, null);
            return x0.f87415a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            e0.checkNotNullParameter(showOptions, "showOptions");
            throw new u(null, 1, null);
        }
    }

    Object destroy(d<? super x0> dVar);

    void dispatchShowCompleted();

    Flow<LoadEvent> getOnLoadEvent();

    Flow<OfferwallShowEvent> getOnOfferwallEvent();

    Flow<ScarEvent> getOnScarEvent();

    Flow<ShowEvent> getOnShowEvent();

    CoroutineScope getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, d<? super x0> dVar);

    Object onBroadcastEvent(String str, d<? super x0> dVar);

    Object requestShow(Map<String, ? extends Object> map, d<? super x0> dVar);

    Object sendActivityDestroyed(d<? super x0> dVar);

    Object sendFocusChange(boolean z10, d<? super x0> dVar);

    Object sendGmaEvent(c cVar, d<? super x0> dVar);

    Object sendMuteChange(boolean z10, d<? super x0> dVar);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, d<? super x0> dVar);

    Object sendPrivacyFsmChange(byte[] bArr, d<? super x0> dVar);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, d<? super x0> dVar);

    Object sendUserConsentChange(byte[] bArr, d<? super x0> dVar);

    Object sendVisibilityChange(boolean z10, d<? super x0> dVar);

    Object sendVolumeChange(double d10, d<? super x0> dVar);

    void show(ShowOptions showOptions);
}
