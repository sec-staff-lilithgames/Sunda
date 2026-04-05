package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3023ua extends AbstractC3045vf {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f33449h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3062wf f33450e;

    /* renamed from: f, reason: collision with root package name */
    public C2956qa f33451f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f33452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3023ua(InterfaceC3063x adContainer, AbstractC3062wf mViewableAd, C2956qa c2956qa, F5 f52) {
        super(adContainer);
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.f33450e = mViewableAd;
        this.f33451f = c2956qa;
        this.f33452g = f52;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return this.f33450e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View b() {
        return this.f33450e.b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View d() {
        F5 f52 = this.f33452g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
            ((G5) f52).c(com.ironsource.Q6.f35252d0, "inflateView called");
        }
        return this.f33450e.d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
        try {
            try {
                F5 f52 = this.f33452g;
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
                    ((G5) f52).a(com.ironsource.Q6.f35252d0, "stopTrackingForImpression");
                }
                C2956qa c2956qa = this.f33451f;
                if (c2956qa != null && C2956qa.a(c2956qa.f33288e, (byte) 2)) {
                    AdSession adSession = c2956qa.f33289f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c2956qa.f33289f = null;
                    c2956qa.f33288e = (byte) 3;
                }
            } catch (Exception e10) {
                F5 f53 = this.f33452g;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
                    ((G5) f53).b(com.ironsource.Q6.f35252d0, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
            }
            this.f33450e.e();
        } catch (Throwable th2) {
            this.f33450e.e();
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        F5 f52 = this.f33452g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
            ((G5) f52).a(com.ironsource.Q6.f35252d0, "addFriendlyView with obstruction code: " + obstructionCode);
        }
        C2956qa c2956qa = this.f33451f;
        if (c2956qa != null) {
            c2956qa.a(childView, obstructionCode);
        }
        this.f33450e.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        C2956qa c2956qa = this.f33451f;
        if (c2956qa != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
            byte b10 = c2956qa.f33288e;
            if (b10 > 0) {
                AdSession adSession = c2956qa.f33289f;
                if (adSession != null) {
                    adSession.removeFriendlyObstruction(childView);
                }
            } else {
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(new Exception(p0.o2.k(b10, "Omid AdSession State Error currentState :: ", ", expectedState :: 1")));
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
            }
        }
        this.f33450e.a(childView);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
        View view;
        F5 f52 = this.f33452g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
            ((G5) f52).a(com.ironsource.Q6.f35252d0, "startTrackingForImpression");
        }
        try {
            try {
                if (this.f33554d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC3074xa.f33574a.getClass();
                    if (Omid.isActive()) {
                        InterfaceC3063x interfaceC3063x = this.f33551a;
                        if (interfaceC3063x instanceof C2734d8) {
                            C2734d8 c2734d8 = (C2734d8) interfaceC3063x;
                            view = c2734d8.H;
                            if (view == null) {
                                view = c2734d8.I;
                            }
                        } else {
                            View viewB = this.f33450e.b();
                            view = viewB instanceof WebView ? (WebView) viewB : null;
                        }
                        if (view != null) {
                            F5 f53 = this.f33452g;
                            if (f53 != null) {
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
                                ((G5) f53).a(com.ironsource.Q6.f35252d0, "creating OMSDK session");
                            }
                            C2956qa c2956qa = this.f33451f;
                            if (c2956qa != null) {
                                c2956qa.a(view, map, (View) null);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                F5 f54 = this.f33452g;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
                    ((G5) f54).b(com.ironsource.Q6.f35252d0, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
            }
            this.f33450e.a(map);
        } catch (Throwable th2) {
            this.f33450e.a(map);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
        this.f33450e.a(b10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f33450e.a(context, b10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        F5 f52 = this.f33452g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
            ((G5) f52).c(com.ironsource.Q6.f35252d0, "destroy");
        }
        super.a();
        try {
            this.f33451f = null;
        } catch (Exception e10) {
            F5 f53 = this.f33452g;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "TAG");
                ((G5) f53).a(com.ironsource.Q6.f35252d0, "Exception in destroy with message", e10);
            }
        } finally {
            this.f33450e.a();
        }
    }
}
