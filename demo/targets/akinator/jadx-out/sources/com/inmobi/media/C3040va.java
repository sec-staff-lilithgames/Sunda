package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3040va extends AbstractC3045vf {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3045vf f33511e;

    /* renamed from: f, reason: collision with root package name */
    public C2956qa f33512f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f33513g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33514h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3040va(C2734d8 adContainer, AbstractC3045vf mViewableAd, C2956qa c2956qa, F5 f52) {
        super(adContainer);
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.f33511e = mViewableAd;
        this.f33512f = c2956qa;
        this.f33513g = f52;
        this.f33514h = "va";
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return this.f33511e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View b() {
        return this.f33511e.b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View d() {
        F5 f52 = this.f33513g;
        if (f52 != null) {
            String TAG = this.f33514h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "inflateView");
        }
        return this.f33511e.d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
        try {
            try {
                F5 f52 = this.f33513g;
                if (f52 != null) {
                    String TAG = this.f33514h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).c(TAG, "stopTrackingForImpression");
                }
                C2956qa c2956qa = this.f33512f;
                if (c2956qa != null && C2956qa.a(c2956qa.f33288e, (byte) 2)) {
                    AdSession adSession = c2956qa.f33289f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c2956qa.f33289f = null;
                    c2956qa.f33288e = (byte) 3;
                }
            } catch (Exception e10) {
                F5 f53 = this.f33513g;
                if (f53 != null) {
                    String TAG2 = this.f33514h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).b(TAG2, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
            }
            this.f33511e.e();
        } catch (Throwable th2) {
            this.f33511e.e();
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        this.f33511e.a(childView, obstructionCode);
    }

    public final void b(Map map) {
        View viewG;
        F5 f52 = this.f33513g;
        if (f52 != null) {
            String TAG = this.f33514h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "registerView");
        }
        InterfaceC3063x interfaceC3063x = this.f33551a;
        if (!(interfaceC3063x instanceof C2734d8) || (viewG = ((C2734d8) interfaceC3063x).g()) == null) {
            return;
        }
        F5 f53 = this.f33513g;
        if (f53 != null) {
            String TAG2 = this.f33514h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "creating AD session");
        }
        C2956qa c2956qa = this.f33512f;
        if (c2956qa != null) {
            c2956qa.a(viewG, map, this.f33511e.b());
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        this.f33511e.a(childView);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
        F5 f52 = this.f33513g;
        if (f52 != null) {
            String TAG = this.f33514h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "startTrackingForImpression");
        }
        try {
            try {
                if (this.f33554d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC3074xa.f33574a.getClass();
                    if (Omid.isActive()) {
                        F5 f53 = this.f33513g;
                        if (f53 != null) {
                            String TAG2 = this.f33514h;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                            ((G5) f53).a(TAG2, "OMID enabled and initialised");
                        }
                        b(map);
                        a((byte) 19);
                    }
                }
            } catch (Exception e10) {
                F5 f54 = this.f33513g;
                if (f54 != null) {
                    String TAG3 = this.f33514h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f54).b(TAG3, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
            }
            this.f33511e.a(map);
        } catch (Throwable th2) {
            this.f33511e.a(map);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
        C3080y c3080y;
        AdEvents adEvents;
        AdEvents adEvents2;
        try {
            try {
                F5 f52 = this.f33513g;
                if (f52 != null) {
                    String TAG = this.f33514h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).c(TAG, "onAdEvent - event - " + ((int) b10));
                }
                C2956qa c2956qa = this.f33512f;
                if (c2956qa != null && C2956qa.a(c2956qa.f33288e, (byte) 2)) {
                    byte b11 = b10;
                    if (b11 == 0) {
                        C3080y c3080y2 = c2956qa.f33290g;
                        if (c3080y2 != null && (adEvents2 = c3080y2.f33589a) != null) {
                            adEvents2.impressionOccurred();
                        }
                    } else if (b11 == 19 && (c3080y = c2956qa.f33290g) != null && (adEvents = c3080y.f33589a) != null) {
                        adEvents.loaded();
                    }
                }
            } catch (Exception e10) {
                F5 f53 = this.f33513g;
                if (f53 != null) {
                    String TAG2 = this.f33514h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).b(TAG2, "Exception in onAdEvent with message : " + e10.getMessage());
                }
            }
            this.f33511e.a(b10);
        } catch (Throwable th2) {
            this.f33511e.a(b10);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f33511e.a(context, b10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        super.a();
        F5 f52 = this.f33513g;
        if (f52 != null) {
            String TAG = this.f33514h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "destroy");
        }
        try {
            this.f33512f = null;
        } catch (Exception e10) {
            F5 f53 = this.f33513g;
            if (f53 != null) {
                String TAG2 = this.f33514h;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).b(TAG2, "Exception in destroy with message : " + e10.getMessage());
            }
        } finally {
            this.f33511e.a();
        }
    }
}
