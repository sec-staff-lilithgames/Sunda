package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class c extends com.mbridge.msdk.splash.manager.a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements DyCountDownListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DyOption f42836a;

        public a(DyOption dyOption) {
            this.f42836a = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
        public void getCountDownValue(int i10) {
            this.f42836a.setDyCountDownListener(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements DynamicViewBackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.inter.a f42838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f42839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.common.c f42840c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DyOption f42841d;

        public b(com.mbridge.msdk.splash.inter.a aVar, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, DyOption dyOption) {
            this.f42838a = aVar;
            this.f42839b = mBSplashView;
            this.f42840c = cVar;
            this.f42841d = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewClicked(BaseRespData baseRespData) {
            com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl;
            MBSplashView mBSplashView = this.f42839b;
            com.mbridge.msdk.splash.middle.a aVarA = (mBSplashView == null || (splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl()) == null) ? null : splashSignalCommunicationImpl.a();
            DyOption dyOption = this.f42841d;
            CampaignEx campaignEx = dyOption != null ? dyOption.getCampaignEx() : null;
            EAction eAction = baseRespData instanceof SplashResData ? ((SplashResData) baseRespData).geteAction() : null;
            if (eAction != null) {
                int i10 = C0325c.f42843a[eAction.ordinal()];
                if (i10 == 1) {
                    if (aVarA != null) {
                        if (baseRespData == null) {
                            aVarA.a(campaignEx);
                            return;
                        } else {
                            if (baseRespData instanceof SplashResData) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    c.this.a(splashResData.getBaseViewData(), aVarA, campaignEx);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (aVarA != null) {
                        aVarA.close();
                    }
                } else if (i10 == 3) {
                    if (this.f42841d != null) {
                        com.mbridge.msdk.click.c.e(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42841d.getAdChoiceLink());
                    }
                } else if (i10 == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                    SplashResData splashResData2 = (SplashResData) baseRespData;
                    if (splashResData2.getBaseViewData() != null) {
                        c.this.a(aVarA, campaignEx, splashResData2.getBaseViewData());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreateFail(com.mbridge.msdk.dycreator.error.a aVar) {
            MBSplashView mBSplashView = this.f42839b;
            if (mBSplashView != null) {
                Context context = mBSplashView.getContext();
                if (context == null) {
                    context = com.mbridge.msdk.foundation.controller.c.m().d();
                }
                c.this.a(context, this.f42839b, this.f42840c, this.f42838a);
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreatedSuccess(View view) {
            com.mbridge.msdk.splash.inter.a aVar = this.f42838a;
            if (aVar != null) {
                if (view != null) {
                    aVar.a(view);
                } else {
                    aVar.onError("View render error.");
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.splash.manager.c$c, reason: collision with other inner class name */
    public static /* synthetic */ class C0325c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42843a;

        static {
            int[] iArr = new int[EAction.values().length];
            f42843a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42843a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42843a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42843a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final c f42844a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
        this();
    }

    public static c a() {
        return d.f42844a;
    }

    private c() {
    }

    @Override // com.mbridge.msdk.splash.manager.a
    public void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
        DyOption dyOptionBuild = new DyOption.Builder().campaignEx(cVar.b()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(cVar.m()).isScreenClick(cVar.f() == 1).isClickButtonVisible(cVar.c() == 0).isShakeVisible(cVar.i() == 1).isApkInfoVisible(cVar.a() == 0).isLogoVisible(cVar.e() == 1).shakeStrenght(cVar.j()).shakeTime(cVar.k()).orientation(cVar.g()).countDownTime(cVar.d()).adChoiceLink(u0.a(cVar.b())).build();
        mBSplashView.setDyCountDownListener(new a(dyOptionBuild));
        DynamicViewCreator.getInstance().createDynamicView(dyOptionBuild, new b(aVar, mBSplashView, cVar, dyOptionBuild));
    }
}
