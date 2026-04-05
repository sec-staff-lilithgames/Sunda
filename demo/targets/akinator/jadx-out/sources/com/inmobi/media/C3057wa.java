package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.wa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3057wa extends AbstractC3045vf {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3045vf f33540e;

    /* renamed from: f, reason: collision with root package name */
    public C2956qa f33541f;

    /* renamed from: g, reason: collision with root package name */
    public final VastProperties f33542g;

    /* renamed from: h, reason: collision with root package name */
    public final F5 f33543h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33544i;

    /* renamed from: j, reason: collision with root package name */
    public final float f33545j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f33546k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f33547l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3057wa(Context context, AbstractC3045vf mViewableAd, C2853k9 adContainer, C2956qa c2956qa, VastProperties mVastProperties, F5 f52) {
        super(adContainer);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(mVastProperties, "mVastProperties");
        this.f33540e = mViewableAd;
        this.f33541f = c2956qa;
        this.f33542g = mVastProperties;
        this.f33543h = f52;
        this.f33544i = "wa";
        this.f33545j = 1.0f;
        this.f33546k = new WeakReference(context);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return this.f33540e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View b() {
        return this.f33540e.b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final H8 c() {
        return this.f33540e.c();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View d() {
        return this.f33540e.d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
        try {
            try {
                InterfaceC3063x interfaceC3063x = this.f33551a;
                if ((interfaceC3063x instanceof C2853k9) && !((C2853k9) interfaceC3063x).k()) {
                    C2956qa c2956qa = this.f33541f;
                    if (c2956qa != null && C2956qa.a(c2956qa.f33288e, (byte) 2)) {
                        AdSession adSession = c2956qa.f33289f;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        c2956qa.f33289f = null;
                        c2956qa.f33288e = (byte) 3;
                    }
                    F5 f52 = this.f33543h;
                    if (f52 != null) {
                        String TAG = this.f33544i;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                        StringBuilder sb2 = new StringBuilder("Unregistered VideoView to OMID AdSession : ");
                        C2956qa c2956qa2 = this.f33541f;
                        sb2.append(c2956qa2 != null ? c2956qa2.hashCode() : 0);
                        ((G5) f52).a(TAG, sb2.toString());
                    }
                }
                this.f33540e.e();
            } catch (Exception e10) {
                F5 f53 = this.f33543h;
                if (f53 != null) {
                    String TAG2 = this.f33544i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).b(TAG2, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                this.f33540e.e();
            }
        } catch (Throwable th2) {
            this.f33540e.e();
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        C2956qa c2956qa = this.f33541f;
        if (c2956qa != null) {
            c2956qa.a(childView, obstructionCode);
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        C2956qa c2956qa = this.f33541f;
        if (c2956qa != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
            byte b10 = c2956qa.f33288e;
            if (b10 > 0) {
                AdSession adSession = c2956qa.f33289f;
                if (adSession != null) {
                    adSession.removeFriendlyObstruction(childView);
                    return;
                }
                return;
            }
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(new Exception(p0.o2.k(b10, "Omid AdSession State Error currentState :: ", ", expectedState :: 1")));
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
        String str = duhsDlGWdBkekB.SNJOrG;
        try {
            try {
                F5 f52 = this.f33543h;
                if (f52 != null) {
                    String str2 = this.f33544i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, str);
                    ((G5) f52).c(str2, "startTrackingForImpression");
                }
                if (this.f33554d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC3074xa.f33574a.getClass();
                    if (Omid.isActive()) {
                        F5 f53 = this.f33543h;
                        if (f53 != null) {
                            String str3 = this.f33544i;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, str);
                            ((G5) f53).a(str3, "OMID enabled and OM SDK initialised");
                        }
                        InterfaceC3063x interfaceC3063x = this.f33551a;
                        if (interfaceC3063x instanceof C2853k9) {
                            View videoContainerView = ((C2853k9) interfaceC3063x).getVideoContainerView();
                            C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
                            if (c3056w9 != null) {
                                C2921o9 mediaController = c3056w9.getVideoView().getMediaController();
                                this.f33547l = new WeakReference(c3056w9);
                                F5 f54 = this.f33543h;
                                if (f54 != null) {
                                    String str4 = this.f33544i;
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, str);
                                    ((G5) f54).a(str4, "creating new OM SDK ad session");
                                }
                                C2956qa c2956qa = this.f33541f;
                                if (c2956qa != null) {
                                    c2956qa.a(c3056w9, mediaController != null ? mediaController.getFriendlyViews() : null, this.f33540e.b());
                                }
                                F5 f55 = this.f33543h;
                                if (f55 != null) {
                                    String str5 = this.f33544i;
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, str);
                                    StringBuilder sb2 = new StringBuilder("Registered ad view with OMID Video AdSession ");
                                    C2956qa c2956qa2 = this.f33541f;
                                    sb2.append(c2956qa2 != null ? c2956qa2.hashCode() : 0);
                                    ((G5) f55).a(str5, sb2.toString());
                                }
                            }
                        }
                    }
                }
                this.f33540e.a(map);
            } catch (Exception e10) {
                F5 f56 = this.f33543h;
                if (f56 != null) {
                    String str6 = this.f33544i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str6, str);
                    ((G5) f56).b(str6, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                this.f33540e.a(map);
            }
        } catch (Throwable th2) {
            this.f33540e.a(map);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
        try {
            try {
                F5 f52 = this.f33543h;
                if (f52 != null) {
                    String TAG = this.f33544i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "onAdView - event - " + ((int) b10));
                }
                float fA = this.f33545j;
                int duration = 0;
                if (b10 == 13) {
                    fA = 0.0f;
                } else if (b10 != 14) {
                    if (b10 == 6) {
                        InterfaceC3063x interfaceC3063x = this.f33551a;
                        if (interfaceC3063x instanceof C2853k9) {
                            View videoContainerView = ((C2853k9) interfaceC3063x).getVideoContainerView();
                            C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
                            if (c3056w9 != null) {
                                duration = c3056w9.getVideoView().getDuration();
                                Object tag = c3056w9.getVideoView().getTag();
                                fA = a(tag instanceof C2887m9 ? (C2887m9) tag : null);
                            }
                        }
                    } else if (b10 == 5) {
                        InterfaceC3063x interfaceC3063x2 = this.f33551a;
                        if ((interfaceC3063x2 instanceof C2853k9) && ((C2853k9) interfaceC3063x2).k()) {
                            this.f33540e.a(b10);
                            return;
                        }
                    }
                }
                C2956qa c2956qa = this.f33541f;
                if (c2956qa != null) {
                    c2956qa.a(b10, duration, fA, this.f33542g);
                }
                this.f33540e.a(b10);
            } catch (Exception e10) {
                F5 f53 = this.f33543h;
                if (f53 != null) {
                    String TAG2 = this.f33544i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).b(TAG2, "Exception in onAdEvent with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                this.f33540e.a(b10);
            }
        } catch (Throwable th2) {
            this.f33540e.a(b10);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        F5 f52 = this.f33543h;
        if (f52 != null) {
            String str = this.f33544i;
            ((G5) f52).c(str, AbstractC2803h9.a(str, "TAG", "onActivityStateChanged - state - ", b10));
        }
        this.f33540e.a(context, b10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        super.a();
        F5 f52 = this.f33543h;
        if (f52 != null) {
            String TAG = this.f33544i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "destroy");
        }
        try {
            try {
                this.f33546k.clear();
                WeakReference weakReference = this.f33547l;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this.f33541f = null;
            } catch (Exception e10) {
                F5 f53 = this.f33543h;
                if (f53 != null) {
                    String TAG2 = this.f33544i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).b(TAG2, "Exception in destroy with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
            }
            this.f33540e.a();
        } catch (Throwable th2) {
            this.f33540e.a();
            throw th2;
        }
    }

    public final float a(C2887m9 c2887m9) {
        if (c2887m9 == null) {
            return 0.0f;
        }
        Object obj = c2887m9.f33155t.get("currentMediaVolume");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        Object obj2 = c2887m9.f33155t.get("lastMediaVolume");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num == null || num2 == null || num.intValue() <= 0 || num2.intValue() != 0) {
            return 0.0f;
        }
        return this.f33545j;
    }
}
