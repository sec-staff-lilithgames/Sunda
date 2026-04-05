package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f40287a;

    /* renamed from: b, reason: collision with root package name */
    private c f40288b;

    /* renamed from: c, reason: collision with root package name */
    private f f40289c;

    /* renamed from: d, reason: collision with root package name */
    private h f40290d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f40291e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f40292f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40293a;

        static {
            int[] iArr = new int[EAction.values().length];
            f40293a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40293a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBSplashViewVModel(DyOption dyOption) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f40292f = dyOption;
        String campaignUnitId = (dyOption == null || dyOption.getCampaignEx() == null) ? "" : dyOption.getCampaignEx().getCampaignUnitId();
        if (TextUtils.isEmpty(campaignUnitId)) {
            EventBus.getDefault().register(this);
        } else {
            EventBus.getDefault().register(campaignUnitId, this);
        }
    }

    private void a(Object obj) {
        c cVar = this.f40288b;
        if (cVar != null) {
            cVar.a(obj);
        }
    }

    private void b(Object obj) {
        d dVar = this.f40287a;
        if (dVar != null) {
            dVar.a(obj);
        }
    }

    private void c(Object obj) {
        f fVar = this.f40289c;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f40288b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f40287a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f40291e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f40289c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        MBSplashData mBSplashData = new MBSplashData(this.f40292f);
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (contextD != null) {
            DyOption dyOption = this.f40292f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                mBSplashData.setCountDownText(contextD.getResources().getString(h0.a(contextD, this.f40292f.isCanSkip() ? "mbridge_splash_count_time_can_skip" : "mbridge_splash_count_time_can_skip_not", "string")));
            }
            mBSplashData.setNoticeImage(h0.a(contextD, "mbridge_splash_notice", "drawable"));
            String strP = l0.p(contextD);
            mBSplashData.setLogoText((TextUtils.isEmpty(strP) || !strP.contains("zh")) ? "AD" : "广告");
        }
        b(mBSplashData);
        a(mBSplashData);
        c(mBSplashData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f40290d = hVar;
        }
    }

    private void a(SplashResData splashResData) {
        if (this.f40291e == null || splashResData == null) {
            return;
        }
        int i10 = AnonymousClass1.f40293a[splashResData.geteAction().ordinal()];
        if (i10 == 1 || i10 == 2) {
            b(splashResData);
        }
        this.f40291e.viewClicked(splashResData);
    }

    private void b(SplashResData splashResData) {
        try {
            String campaignUnitId = "";
            if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                campaignUnitId = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
            }
            if (!TextUtils.isEmpty(campaignUnitId)) {
                EventBus.getDefault().unregister(campaignUnitId);
                b.a().b();
            } else {
                EventBus.getDefault().unregister(this);
                b.a().b();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            EventBus.getDefault().unregister(this);
            EventBus.getDefault().release();
            b.a().b();
        }
    }
}
