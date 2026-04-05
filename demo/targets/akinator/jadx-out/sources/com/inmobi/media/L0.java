package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import androidx.core.app.NotificationCompat;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L0 extends I1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U0 f31982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(U0 u02) {
        super(u02);
        this.f31982d = u02;
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        U0 u02 = (U0) this.f31862b.get();
        if (u02 != null) {
            try {
                byte bK = u02.K();
                JSONObject pubContent = new JSONObject(u02.M());
                AdConfig adConfig = u02.j();
                kotlin.jvm.internal.e0.checkNotNull(adConfig);
                HashMap mapA = null;
                if (u02.z() != null) {
                    boolean z10 = C2736da.f32781a;
                    A0 a0Z = u02.z();
                    mapA = C2736da.a(a0Z != null ? a0Z.h() : null);
                }
                HashMap map = mapA;
                F5 f52 = this.f31982d.f32321j;
                kotlin.jvm.internal.e0.checkNotNullParameter(pubContent, "pubContent");
                kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
                C3106z8 c3106z8 = new C3106z8(bK, pubContent, null, false, adConfig, map, null, f52);
                Handler handlerE = this.f31982d.E();
                if (handlerE != null) {
                    handlerE.post(new zk.n(3, c3106z8, this.f31982d));
                }
            } catch (Exception e10) {
                F5 f53 = this.f31982d.f32321j;
                if (f53 != null) {
                    String strE = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                    ((G5) f53).a(strE, "Exception for handleInterActive ", e10);
                }
                u02.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 76);
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        U0 u02 = (U0) this.f31862b.get();
        if (u02 != null) {
            u02.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (short) 40);
        }
    }

    public static final void a(C3106z8 dataModel, U0 this$0) {
        String strU;
        kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "$dataModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            P9 p92 = dataModel.f33717r;
            C2793h c2793hM = this$0.m();
            if (p92 == null || this$0.t() == null || c2793hM == null) {
                return;
            }
            String strB = this$0.J().b();
            String strO = c2793hM.o();
            boolean zC = this$0.c(0);
            C2793h c2793hM2 = this$0.m();
            AdQualityControl adQualityControlE = c2793hM2 != null ? c2793hM2.e() : null;
            C2793h c2793hM3 = this$0.m();
            if (c2793hM3 == null || (strU = c2793hM3.u()) == null) {
                strU = "html";
            }
            S s10 = new S(strB, this$0.b(c2793hM), this$0.J().l(), zC, strO, null, strU, null, null, null, null, Boolean.valueOf(this$0.J().p()), null, adQualityControlE, this$0.K(), this$0.e(0), this$0.n(), null, null, null, 3020704);
            Sf sfC = U0.c(this$0);
            Wc wc2 = new Wc("interactiveAdUnit", BuildConfig.FLAVOR);
            Context contextT = this$0.t();
            kotlin.jvm.internal.e0.checkNotNull(contextT);
            this$0.f32325n = sfC.a(wc2, contextT, (short) 0, s10);
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY = this$0.y();
            if (gestureDetectorOnGestureListenerC3093ycY != null) {
                Ac ac2 = this$0.M;
                AdConfig adConfigJ = this$0.j();
                kotlin.jvm.internal.e0.checkNotNull(adConfigJ);
                gestureDetectorOnGestureListenerC3093ycY.a(ac2, adConfigJ);
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY2 = this$0.y();
            if (gestureDetectorOnGestureListenerC3093ycY2 != null) {
                F5 f52 = gestureDetectorOnGestureListenerC3093ycY2.f33628i;
                if (f52 != null) {
                    String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "disableUrlsToOpenInExternalApp " + gestureDetectorOnGestureListenerC3093ycY2);
                }
                gestureDetectorOnGestureListenerC3093ycY2.f33662z = true;
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY3 = this$0.y();
            if (gestureDetectorOnGestureListenerC3093ycY3 != null) {
                gestureDetectorOnGestureListenerC3093ycY3.setBlobProvider(this$0);
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY4 = this$0.y();
            if (gestureDetectorOnGestureListenerC3093ycY4 != null) {
                gestureDetectorOnGestureListenerC3093ycY4.setPreloadView(true);
            }
            if (this$0.U() == 0) {
                this$0.a(true, this$0.y());
            }
            if (kotlin.jvm.internal.e0.areEqual("URL", p92.f32129y)) {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY5 = this$0.y();
                if (gestureDetectorOnGestureListenerC3093ycY5 != null) {
                    Object obj = p92.f33140e;
                    kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    gestureDetectorOnGestureListenerC3093ycY5.e((String) obj);
                    return;
                }
                return;
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY6 = this$0.y();
            if (gestureDetectorOnGestureListenerC3093ycY6 != null) {
                Object obj2 = p92.f33140e;
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                gestureDetectorOnGestureListenerC3093ycY6.d((String) obj2);
            }
        } catch (Exception e10) {
            F5 f53 = this$0.f32321j;
            if (f53 != null) {
                String strE = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                ((G5) f53).a(strE, "Exception for handleInterActive ", e10);
            }
            this$0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 76);
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
