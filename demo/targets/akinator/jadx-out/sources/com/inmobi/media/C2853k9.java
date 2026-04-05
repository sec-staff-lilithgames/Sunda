package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2853k9 extends C2734d8 {
    public final String U;
    public final String V;
    public final F5 W;
    public final String X;
    public final String Y;
    public WeakReference Z;

    /* renamed from: a0, reason: collision with root package name */
    public final C2836j9 f33015a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C2820i9 f33016b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2853k9(Context context, byte b10, C3106z8 dataModel, String impressionId, Set set, AdConfig adConfig, long j10, boolean z10, String creativeId, C2780g3 c2780g3, Y6 y62, F5 f52) {
        super(context, b10, dataModel, impressionId, set, adConfig, j10, z10, creativeId, c2780g3, y62, f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "dataModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
        this.U = impressionId;
        this.V = creativeId;
        this.W = f52;
        this.X = "k9";
        this.Y = "InMobi";
        this.f33015a0 = new C2836j9(this);
        this.f33016b0 = new C2820i9(this);
    }

    public final void a(View view, boolean z10) {
        C3039v9 c3039v9 = (C3039v9) view.findViewById(Integer.MAX_VALUE);
        if (c3039v9 != null) {
            Object tag = c3039v9.getTag();
            C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
            if (c2887m9 != null) {
                new Handler(Looper.getMainLooper()).post(new com.applovin.impl.aa(c2887m9, z10, this, c3039v9, 11));
            }
        }
    }

    @Override // com.inmobi.media.C2734d8
    public final void b(View view) {
        if (this.f32757r || this.f32759t || !(view instanceof C3039v9)) {
            return;
        }
        this.f32757r = true;
        C2780g3 c2780g3 = this.f32747h;
        if (c2780g3 != null) {
            c2780g3.a();
        }
        Object tag = ((C3039v9) view).getTag();
        if (tag instanceof C2887m9) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            C2887m9 c2887m9 = (C2887m9) tag;
            Object obj = c2887m9.f33155t.get("didImpressionFire");
            if (kotlin.jvm.internal.e0.areEqual(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
                return;
            }
            ArrayList arrayList = c2887m9.f33154s;
            HashMap mapJ = j(c2887m9);
            Iterator it = arrayList.iterator();
            List list = null;
            while (it.hasNext()) {
                C2752e9 c2752e9 = (C2752e9) it.next();
                if (kotlin.jvm.internal.e0.areEqual("VideoImpression", c2752e9.f32815b)) {
                    if (sv.k0.startsWith$default(c2752e9.f32817d, "http", false, 2, null)) {
                        C2903n8.a(c2752e9, mapJ, (V7) null, this.W);
                    }
                    HashMap map = c2752e9.f32818e;
                    Object obj2 = map != null ? map.get("referencedEvents") : null;
                    list = obj2 instanceof List ? (List) obj2 : null;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            c2887m9.a((String) it2.next(), mapJ, (V7) null, this.W);
                        }
                    }
                }
            }
            if (list == null || list.isEmpty()) {
                c2887m9.a("start", mapJ, (V7) null, this.W);
                c2887m9.a("Impression", mapJ, this.O, this.W);
            }
            C2970r8 c2970r8 = this.f32741b.f33704e;
            if (c2970r8 != null) {
                c2970r8.a("Impression", j(c2887m9), this.O, this.W);
            }
            c2887m9.f33155t.put("didImpressionFire", Boolean.TRUE);
            AbstractC3045vf abstractC3045vf = this.f32755p;
            if (abstractC3045vf != null) {
                abstractC3045vf.a((byte) 0);
            }
            R0 r02 = this.f32762w;
            if (r02 != null) {
                r02.f();
            }
        }
    }

    @Override // com.inmobi.media.C2734d8
    public final void c(C2903n8 asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        byte b10 = asset.f33146k;
        if (b10 != 0) {
            if (b10 == 2) {
                try {
                    if (1 != this.f32740a) {
                        R0 r02 = this.f32762w;
                        if (r02 != null) {
                            r02.h();
                        }
                        r();
                        return;
                    }
                    super.c(asset);
                    if (kotlin.jvm.internal.e0.areEqual("VIDEO", asset.f33138c)) {
                        View videoContainerView = getVideoContainerView();
                        C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
                        if (c3056w9 != null) {
                            c3056w9.getVideoView().c();
                            c3056w9.getVideoView().j();
                        }
                        r();
                        return;
                    }
                    F5 f52 = this.W;
                    if (f52 != null) {
                        String TAG = this.X;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                        ((G5) f52).b(TAG, "Action 2 not valid for asset of type: " + asset.f33138c);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    F5 f53 = this.W;
                    if (f53 != null) {
                        String str = this.X;
                        StringBuilder sbA = N6.a(str, "TAG", "Action 2 not valid for asset of type: ");
                        sbA.append(asset.f33138c);
                        ((G5) f53).b(str, sbA.toString());
                    }
                    Y5 y52 = Y5.f32563a;
                    Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            if (b10 == 3) {
                try {
                    if (!kotlin.jvm.internal.e0.areEqual("VIDEO", asset.f33138c)) {
                        F5 f54 = this.W;
                        if (f54 != null) {
                            String TAG2 = this.X;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                            ((G5) f54).b(TAG2, "Action 3 not valid for asset of type: " + asset.f33138c);
                            return;
                        }
                        return;
                    }
                    GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.H;
                    if (gestureDetectorOnGestureListenerC3093yc != null) {
                        F5 f55 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                        if (f55 != null) {
                            String TAG3 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                            ((G5) f55).a(TAG3, "replayToInterActive");
                        }
                        gestureDetectorOnGestureListenerC3093yc.c("window.imraid.broadcastEvent('replay');");
                    }
                    View viewG = g();
                    if (viewG != null) {
                        C2735d9 c2735d9A = C2734d8.a(viewG);
                        if (c2735d9A != null) {
                            c2735d9A.d();
                        }
                        ViewParent parent = viewG.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(viewG);
                        }
                    }
                    View videoContainerView2 = getVideoContainerView();
                    C3056w9 c3056w92 = videoContainerView2 instanceof C3056w9 ? (C3056w9) videoContainerView2 : null;
                    if (c3056w92 != null) {
                        c3056w92.getVideoView().k();
                        c3056w92.getVideoView().start();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    F5 f56 = this.W;
                    if (f56 != null) {
                        String str2 = this.X;
                        ((G5) f56).b(str2, Qf.a(e11, N6.a(str2, "TAG", "Encountered unexpected error in handling replay action on video: ")));
                    }
                    AbstractC2902n7.a((byte) 2, this.Y, "SDK encountered unexpected error in replaying video");
                    Y5 y53 = Y5.f32563a;
                    Y5.f32566d.a(C5.a(e11, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            if (b10 == 1) {
                super.c(asset);
                return;
            }
            if (b10 == 4) {
                try {
                    if (this.f32740a != 0) {
                        F5 f57 = this.W;
                        if (f57 != null) {
                            String TAG4 = this.X;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
                            ((G5) f57).b(TAG4, "Invalid action! Online inline videos can be expanded to fullscreen!");
                            return;
                        }
                        return;
                    }
                    View videoContainerView3 = getVideoContainerView();
                    C3056w9 c3056w93 = videoContainerView3 instanceof C3056w9 ? (C3056w9) videoContainerView3 : null;
                    if (c3056w93 != null) {
                        C3039v9 videoView = c3056w93.getVideoView();
                        Object tag = videoView.getTag();
                        C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
                        if (videoView.getState() == 1 || c2887m9 == null) {
                            return;
                        }
                        try {
                            a(c2887m9, videoView);
                            return;
                        } catch (Exception e12) {
                            F5 f58 = this.W;
                            if (f58 != null) {
                                String TAG5 = this.X;
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
                                ((G5) f58).b(TAG5, "SDK encountered unexpected error in handling the onVideoRequestedFullScreen event; " + e12.getMessage());
                            }
                            Y5 y54 = Y5.f32563a;
                            C2796h2 event = new C2796h2(e12);
                            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                            Y5.f32566d.a(event);
                            return;
                        }
                    }
                    return;
                } catch (Exception e13) {
                    F5 f59 = this.W;
                    if (f59 != null) {
                        String str3 = this.X;
                        ((G5) f59).b(str3, Qf.a(e13, N6.a(str3, "TAG", "Encountered unexpected error in handling fullscreen action on video: ")));
                    }
                    AbstractC2902n7.a((byte) 2, this.Y, "SDK encountered unexpected error in expanding video to fullscreen");
                    Y5 y55 = Y5.f32563a;
                    Y5.f32566d.a(C5.a(e13, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            if (b10 == 5) {
                try {
                    View videoContainerView4 = getVideoContainerView();
                    C3056w9 c3056w94 = videoContainerView4 instanceof C3056w9 ? (C3056w9) videoContainerView4 : null;
                    if (c3056w94 != null) {
                        Object tag2 = c3056w94.getVideoView().getTag();
                        C2887m9 c2887m92 = tag2 instanceof C2887m9 ? (C2887m9) tag2 : null;
                        if (c2887m92 != null) {
                            HashMap map = c2887m92.f33155t;
                            Boolean bool = Boolean.TRUE;
                            map.put("shouldAutoPlay", bool);
                            C2903n8 c2903n8 = c2887m92.f33158w;
                            if (c2903n8 != null) {
                                c2903n8.f33155t.put("shouldAutoPlay", bool);
                            }
                        }
                        c3056w94.getVideoView().start();
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    F5 f510 = this.W;
                    if (f510 != null) {
                        String str4 = this.X;
                        ((G5) f510).b(str4, Qf.a(e14, N6.a(str4, "TAG", "Encountered unexpected error in handling play action on video: ")));
                    }
                    AbstractC2902n7.a((byte) 2, this.Y, "SDK encountered unexpected error in playing video");
                    Y5 y56 = Y5.f32563a;
                    Y5.f32566d.a(C5.a(e14, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            try {
                if (1 != this.f32740a) {
                    R0 r03 = this.f32762w;
                    if (r03 != null) {
                        r03.h();
                    }
                    r();
                    return;
                }
                super.c(asset);
                if (kotlin.jvm.internal.e0.areEqual("VIDEO", asset.f33138c)) {
                    View videoContainerView5 = getVideoContainerView();
                    C3056w9 c3056w95 = videoContainerView5 instanceof C3056w9 ? (C3056w9) videoContainerView5 : null;
                    if (c3056w95 != null) {
                        c3056w95.getVideoView().c();
                        c3056w95.getVideoView().j();
                    }
                    r();
                    return;
                }
                F5 f511 = this.W;
                if (f511 != null) {
                    String TAG6 = this.X;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG6, "TAG");
                    ((G5) f511).b(TAG6, "Action 2 not valid for asset of type: " + asset.f33138c);
                }
            } catch (Exception e15) {
                F5 f512 = this.W;
                if (f512 != null) {
                    String str5 = this.X;
                    StringBuilder sbA2 = N6.a(str5, "TAG", "Action 2 not valid for asset of type: ");
                    sbA2.append(asset.f33138c);
                    ((G5) f512).b(str5, sbA2.toString());
                }
                Y5 y57 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e15, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }

    public final void d(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        F5 f52 = this.W;
        if (f52 != null) {
            String str = this.X;
            StringBuilder sbA = N6.a(str, "TAG", "Firing Q4 beacons for completion at ");
            sbA.append(videoAsset.D);
            ((G5) f52).c(str, sbA.toString());
        }
        videoAsset.f33155t.put("didQ4Fire", Boolean.TRUE);
        videoAsset.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, j(videoAsset), (V7) null, this.W);
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 12);
        }
        F5 f53 = this.W;
        if (f53 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).c(TAG, "onVideoQuartileEvent(Q4)");
        }
    }

    public final void f(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        C2735d9 c2735d9A = C2734d8.a(g());
        if (c2735d9A != null) {
            c2735d9A.b();
        }
        videoAsset.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, j(videoAsset), (V7) null, this.W);
        F5 f52 = this.W;
        if (f52 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onVideoPaused");
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 7);
        }
    }

    public final void g(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        F5 f52 = this.W;
        if (f52 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onVideoPlayed");
        }
        if (this.f32740a == 0) {
            Object obj = videoAsset.f33155t.get("currentMediaVolume");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 0;
            Object obj2 = videoAsset.f33155t.get("lastMediaVolume");
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            if (iIntValue > 0 && iIntValue2 == 0) {
                i(videoAsset);
            }
            Object obj3 = videoAsset.f33155t.get("currentMediaVolume");
            Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Object obj4 = videoAsset.f33155t.get("lastMediaVolume");
            Integer num4 = obj4 instanceof Integer ? (Integer) obj4 : null;
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            if (iIntValue3 == 0 && iIntValue4 > 0) {
                e(videoAsset);
            }
        }
        Object obj5 = videoAsset.f33155t.get("didStartPlaying");
        if (kotlin.jvm.internal.e0.areEqual(obj5 instanceof Boolean ? (Boolean) obj5 : null, Boolean.FALSE)) {
            videoAsset.f33155t.put("didStartPlaying", Boolean.TRUE);
            AbstractC3062wf viewableAd = getViewableAd();
            if (viewableAd != null) {
                viewableAd.a((byte) 6);
            }
        }
    }

    @Override // com.inmobi.media.C2734d8, com.inmobi.media.InterfaceC3063x
    public final String getCreativeId() {
        return this.V;
    }

    @Override // com.inmobi.media.C2734d8, com.inmobi.media.InterfaceC3063x
    public final InterfaceC3046w getFullScreenEventsListener() {
        return this.f33015a0;
    }

    @Override // com.inmobi.media.C2734d8, com.inmobi.media.InterfaceC3063x
    public final String getImpressionId() {
        return this.U;
    }

    @Override // com.inmobi.media.C2734d8, com.inmobi.media.InterfaceC3063x
    public final View getVideoContainerView() {
        WeakReference weakReference = this.Z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.inmobi.media.C2734d8, com.inmobi.media.InterfaceC3063x
    public final AbstractC3062wf getViewableAd() {
        C2853k9 c2853k9;
        Context contextJ = j();
        if (this.f32755p == null && contextJ != null) {
            F5 f52 = this.f32749j;
            if (f52 != null) {
                String TAG = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "fireLoadedAndServedBeacons");
            }
            C2970r8 c2970r8 = this.f32741b.f33704e;
            if (c2970r8 != null) {
                HashMap mapA = a(c2970r8);
                a((byte) 1, mapA);
                a((byte) 2, mapA);
            }
            this.f32755p = new T5(this, new Bf(this, this.W), this.W);
            Set<Pe> set = this.f32743d;
            if (set != null) {
                for (Pe pe2 : set) {
                    try {
                        if (pe2.f32140a == 3) {
                            Object obj = pe2.f32141b.get("omidAdSession");
                            C2956qa c2956qa = obj instanceof C2956qa ? (C2956qa) obj : null;
                            Object obj2 = pe2.f32141b.get("videoAutoPlay");
                            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            Object obj3 = pe2.f32141b.get("videoSkippable");
                            Boolean bool2 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                            Object obj4 = pe2.f32141b.get("videoSkipOffset");
                            VastProperties vastPropertiesCreateVastPropertiesForSkippableMedia = zBooleanValue2 ? VastProperties.createVastPropertiesForSkippableMedia((obj4 instanceof Integer ? (Integer) obj4 : null) != null ? r4.intValue() : 0, zBooleanValue, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(zBooleanValue, Position.STANDALONE);
                            C2956qa c2956qa2 = c2956qa;
                            AbstractC3045vf abstractC3045vf = this.f32755p;
                            if (c2956qa2 == null || abstractC3045vf == null) {
                                F5 f53 = this.W;
                                if (f53 != null) {
                                    String TAG2 = this.X;
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                                    ((G5) f53).b(TAG2, "Did not find a OMID video ad session; the OMID decorator will not be applied.");
                                }
                            } else {
                                kotlin.jvm.internal.e0.checkNotNull(vastPropertiesCreateVastPropertiesForSkippableMedia);
                                c2853k9 = this;
                                try {
                                    c2853k9.f32755p = new C3057wa(contextJ, abstractC3045vf, c2853k9, c2956qa2, vastPropertiesCreateVastPropertiesForSkippableMedia, this.W);
                                } catch (Exception e10) {
                                    e = e10;
                                    F5 f54 = c2853k9.W;
                                    if (f54 != null) {
                                        String str = c2853k9.X;
                                        ((G5) f54).b(str, Qf.a(e, N6.a(str, "TAG", "Exception occurred while creating the video viewable ad : ")));
                                    }
                                    Y5 y52 = Y5.f32563a;
                                    Y5.f32566d.a(C5.a(e, NotificationCompat.CATEGORY_EVENT));
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c2853k9 = this;
                    }
                }
            }
        }
        return this.f32755p;
    }

    @Override // com.inmobi.media.C2734d8
    public final Df i() {
        return this.f33016b0;
    }

    public final HashMap j(C2887m9 c2887m9) {
        String strB;
        C3039v9 videoView;
        C2970r8 c2970r8 = c2887m9.f33153r;
        if (c2970r8 == null) {
            c2970r8 = null;
        }
        HashMap map = new HashMap();
        WeakReference weakReference = this.Z;
        View view = weakReference != null ? (View) weakReference.get() : null;
        C3056w9 c3056w9 = view instanceof C3056w9 ? (C3056w9) view : null;
        if (c3056w9 != null && (videoView = c3056w9.getVideoView()) != null) {
        }
        map.put("[ERRORCODE]", "405");
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb2.append(iNextInt);
        for (int i10 = 1; i10 < 8; i10++) {
            sb2.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        map.put("[CACHEBUSTING]", string);
        InterfaceC3028uf interfaceC3028ufD = c2887m9.d();
        if (interfaceC3028ufD != null && (strB = ((C3011tf) interfaceC3028ufD).b()) != null) {
        }
        map.put("$TS", String.valueOf(System.currentTimeMillis()));
        Object obj = c2887m9.f33155t.get("seekPosition");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = iIntValue;
        String str = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * 1000))}, 4));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        map.put("[CONTENTPLAYHEAD]", str);
        if (c2970r8 != null) {
        }
        Object map2 = this.f32741b.f33719t;
        if (map2 == null) {
            map2 = new HashMap();
        }
        map.putAll(map2);
        return map;
    }

    @Override // com.inmobi.media.C2734d8
    public final boolean k() {
        return this.f32740a == 0 && f() != null;
    }

    @Override // com.inmobi.media.C2734d8
    public final void l() {
        super.l();
        View videoContainerView = getVideoContainerView();
        C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
        if (c3056w9 != null) {
            C3039v9 videoView = c3056w9.getVideoView();
            if (this.f32740a == 0 && !k() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                a(true);
            }
            videoView.pause();
        }
    }

    @Override // com.inmobi.media.C2734d8
    public final boolean n() {
        return !this.A;
    }

    public final void r() {
        C2780g3 c2780g3 = this.f32747h;
        if (c2780g3 != null) {
            if (!c2780g3.f32867g.get()) {
                c2780g3.f32864d.f33004h = 1;
                kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
            }
            this.f32747h.b();
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 15);
        }
    }

    public final void e(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        videoAsset.f33155t.put(duhsDlGWdBkekB.VZgRvYPiN, 0);
        videoAsset.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, j(videoAsset), (V7) null, this.W);
        F5 f52 = this.W;
        if (f52 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onVideoMuted");
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 13);
        }
    }

    public final void h(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        C2735d9 c2735d9A = C2734d8.a(g());
        if (c2735d9A != null) {
            c2735d9A.c();
        }
        videoAsset.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, j(videoAsset), (V7) null, this.W);
        F5 f52 = this.W;
        if (f52 != null) {
            String str = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, GalEuEfxjome.TEHKG);
            ((G5) f52).c(str, "onVideoResumed");
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 8);
        }
    }

    public final void i(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        videoAsset.f33155t.put("lastMediaVolume", 15);
        videoAsset.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, j(videoAsset), (V7) null, this.W);
        F5 f52 = this.W;
        if (f52 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onVideoUnMuted");
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 14);
        }
    }

    public static final void a(C2887m9 c2887m9, boolean z10, C2853k9 this$0, C3039v9 c3039v9) {
        int videoVolume;
        int lastVolume;
        int videoVolume2;
        int lastVolume2;
        int videoVolume3;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        c2887m9.f33155t.put("visible", Boolean.valueOf(z10));
        if (z10 && !this$0.f32760u) {
            c2887m9.f33155t.put("lastVisibleTimestamp", Long.valueOf(SystemClock.uptimeMillis()));
            if (c3039v9.getPauseScheduled() && c3039v9.getMediaPlayer() != null) {
                if (c2887m9.c()) {
                    c3039v9.k();
                } else {
                    c3039v9.c();
                }
            }
            Handler handler = c3039v9.f33503s;
            if (handler != null) {
                handler.removeMessages(0);
            }
            c3039v9.f33504t = false;
            kotlin.jvm.internal.e0.checkNotNull(c3039v9);
            if (this$0.f32740a == 0 && !this$0.k() && (videoVolume3 = c3039v9.getVideoVolume()) != c3039v9.getLastVolume() && c3039v9.isPlaying()) {
                this$0.a(videoVolume3 <= 0);
                c3039v9.setLastVolume(videoVolume3);
            }
            if (this$0.f32740a == 0 && !this$0.k() && !c2887m9.B && !c3039v9.isPlaying() && c3039v9.getState() == 5 && (videoVolume2 = c3039v9.getVideoVolume()) != (lastVolume2 = c3039v9.getLastVolume()) && lastVolume2 > 0) {
                this$0.a(true);
                c3039v9.setLastVolume(videoVolume2);
            }
            if (1 == c3039v9.getState()) {
                Q8 mediaPlayer = c3039v9.getMediaPlayer();
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.f32169b = 3;
                return;
            }
            if (2 == c3039v9.getState() || 4 == c3039v9.getState() || (5 == c3039v9.getState() && c2887m9.B)) {
                c3039v9.start();
                return;
            }
            return;
        }
        kotlin.jvm.internal.e0.checkNotNull(c3039v9);
        if (this$0.f32740a == 0 && !this$0.k() && !this$0.f32760u && (videoVolume = c3039v9.getVideoVolume()) != (lastVolume = c3039v9.getLastVolume()) && lastVolume > 0) {
            this$0.a(true);
            c3039v9.setLastVolume(videoVolume);
        }
        c3039v9.a(c2887m9.E);
    }

    public final void b(C2887m9 videoAsset, C3039v9 videoView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        kotlin.jvm.internal.e0.checkNotNullParameter(videoView, "videoView");
        F5 f52 = this.W;
        if (f52 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onVideoViewCreated");
        }
        videoView.setIsLockScreen(this.D);
        ViewParent parent = videoView.getParent();
        C3056w9 c3056w9 = parent instanceof C3056w9 ? (C3056w9) parent : null;
        if (c3056w9 != null) {
            this.Z = new WeakReference(c3056w9);
            C2921o9 mediaController = c3056w9.getVideoView().getMediaController();
            if (mediaController != null) {
                mediaController.setVideoAd(this);
            }
        }
    }

    @Override // com.inmobi.media.C2734d8, com.inmobi.media.InterfaceC3063x
    public final void b() {
        C3039v9 videoView;
        if (this.f32759t) {
            return;
        }
        View videoContainerView = getVideoContainerView();
        C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
        if (c3056w9 != null && (videoView = c3056w9.getVideoView()) != null) {
            videoView.g();
        }
        super.b();
    }

    public final void a(boolean z10) {
        R0 r02;
        if (this.f32740a != 0 || k() || (r02 = this.f32762w) == null) {
            return;
        }
        F5 f52 = r02.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).a(strE, "onAudioStateChanged");
        }
        if (r02.f32179a.a0()) {
            return;
        }
        H0 h02 = (H0) r02.f32180b.get();
        if (h02 != null) {
            h02.a(z10);
            return;
        }
        F5 f53 = r02.f32179a.f32321j;
        if (f53 != null) {
            ((G5) f53).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void b(C2887m9 videoAsset) {
        HashMap map;
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        Object obj = videoAsset.f33155t.get("didRequestFullScreen");
        if (kotlin.jvm.internal.e0.areEqual(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
            HashMap map2 = videoAsset.f33155t;
            Boolean bool = Boolean.FALSE;
            map2.put("didRequestFullScreen", bool);
            C2903n8 c2903n8 = videoAsset.f33158w;
            if (c2903n8 != null && (map = c2903n8.f33155t) != null) {
                map.put("didRequestFullScreen", bool);
            }
            a();
            videoAsset.f33155t.put("isFullScreen", bool);
        }
    }

    public final void a(C2887m9 videoAsset, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (this.f32759t) {
            return;
        }
        F5 f52 = this.W;
        if (f52 != null) {
            String str = this.X;
            ((G5) f52).a(str, AbstractC2803h9.a(str, "TAG", "Moat onVideoError + ", i10));
        }
        videoAsset.a("error", j(videoAsset), (V7) null, this.W);
        F5 f53 = this.W;
        if (f53 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).c(TAG, "onVideoError");
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.inmobi.media.C2887m9 r7, com.inmobi.media.C3039v9 r8) throws java.lang.IllegalStateException {
        /*
            r6 = this;
            boolean r0 = r6.f32759t
            if (r0 != 0) goto Lc0
            java.lang.ref.WeakReference r0 = r6.f32763x
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Le
            goto Lc0
        Le:
            java.util.HashMap r0 = r7.f33155t
            java.lang.String r1 = "didRequestFullScreen"
            java.lang.Object r0 = r0.get(r1)
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L1d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r2 = 0
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 != 0) goto Lc0
            java.util.HashMap r0 = r7.f33155t
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.put(r1, r3)
            int r1 = r8.getCurrentPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "seekPosition"
            r0.put(r4, r1)
            int r1 = r8.getVolume()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "lastMediaVolume"
            r0.put(r5, r1)
            com.inmobi.media.Q8 r0 = r8.getMediaPlayer()
            if (r0 == 0) goto L58
            boolean r0 = r0.isPlaying()
            r1 = 1
            if (r0 != r1) goto L58
            goto L59
        L58:
            r1 = r2
        L59:
            if (r1 == 0) goto L6b
            com.inmobi.media.Q8 r0 = r8.getMediaPlayer()
            if (r0 == 0) goto L64
            r0.pause()
        L64:
            com.inmobi.media.p8 r0 = r8.getAudioFocusManager$media_release()
            r0.a()
        L6b:
            com.inmobi.media.Q8 r0 = r8.getMediaPlayer()
            if (r0 != 0) goto L72
            goto L75
        L72:
            r1 = 4
            r0.f32168a = r1
        L75:
            java.util.HashMap r0 = r7.f33155t
            java.lang.String r1 = "isFullScreen"
            r0.put(r1, r3)
            java.util.HashMap r7 = r7.f33155t
            com.inmobi.media.Q8 r8 = r8.getMediaPlayer()
            if (r8 == 0) goto L88
            int r2 = r8.getCurrentPosition()
        L88:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r7.put(r4, r8)
            com.inmobi.media.F5 r7 = r6.f32749j
            if (r7 == 0) goto La1
            java.lang.String r8 = r6.f32752m
            java.lang.String r0 = "TAG"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r0)
            com.inmobi.media.G5 r7 = (com.inmobi.media.G5) r7
            java.lang.String r0 = "launchFullscreen"
            r7.c(r8, r0)
        La1:
            com.inmobi.media.d8 r7 = com.inmobi.media.C2734d8.c(r6)
            if (r7 != 0) goto La8
            goto Lc0
        La8:
            com.inmobi.media.R0 r8 = r7.f32762w
            if (r8 == 0) goto Laf
            r8.e()
        Laf:
            com.inmobi.media.A r8 = r6.M
            int r0 = r6.hashCode()
            com.inmobi.media.W7 r1 = new com.inmobi.media.W7
            r1.<init>(r6, r7)
            r8.getClass()
            com.inmobi.media.A.a(r0, r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2853k9.a(com.inmobi.media.m9, com.inmobi.media.v9):void");
    }

    public final void c(C2887m9 videoAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        F5 f52 = this.W;
        if (f52 != null) {
            String TAG = this.X;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "Video completed; rewards, if any, will be unlocked and end-card displayed");
        }
        Object obj = videoAsset.f33155t.get("didSignalVideoCompleted");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        C2780g3 c2780g3 = this.f32747h;
        if (c2780g3 != null) {
            if (!c2780g3.f32867g.get()) {
                c2780g3.f32864d.f33005i = 1;
                kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
            }
            this.f32747h.b();
        }
        if (kotlin.jvm.internal.e0.areEqual(bool, Boolean.TRUE)) {
            F5 f53 = this.W;
            if (f53 != null) {
                String TAG2 = this.X;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).c(TAG2, "Ignoring callback onAdRewardsUnlocked(), as it is only fired after first time video is played.");
            }
        } else {
            q();
            R0 r02 = this.f32762w;
            if (r02 != null) {
                F5 f54 = r02.f32179a.f32321j;
                if (f54 != null) {
                    String strE = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                    ((G5) f54).a(strE, "onMediaPlaybackComplete");
                }
                if (!r02.f32179a.a0()) {
                    H0 h02 = (H0) r02.f32180b.get();
                    if (h02 != null) {
                        h02.f();
                    } else {
                        F5 f55 = r02.f32179a.f32321j;
                        if (f55 != null) {
                            ((G5) f55).b("InMobi", "Listener was garbage collected.Unable to give callback");
                        }
                    }
                }
            }
        }
        if (1 == this.f32740a) {
            b((C2903n8) videoAsset);
        }
    }
}
