package com.mbridge.msdk.video.dynview.moffer;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.video.dynview.listener.g;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f44419c;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f44420a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f44421b = 500;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f44425a;

        public b(MOfferModel mOfferModel) {
            this.f44425a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f44425a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f44427a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44428b;

        public c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f44427a = mOfferModel;
            this.f44428b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                a.this.a(this.f44427a, this.f44428b, viewGroup, campaignUnit);
            } catch (Exception e10) {
                p0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean b(String str) {
        if (this.f44420a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f44420a.containsKey(str);
    }

    public static a a() {
        a aVar;
        if (f44419c != null) {
            return f44419c;
        }
        synchronized (a.class) {
            try {
                if (f44419c == null) {
                    f44419c = new a();
                }
                aVar = f44419c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.dynview.moffer.a$a, reason: collision with other inner class name */
    public class C0340a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MOfferModel f44423b;

        public C0340a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f44422a = viewGroup;
            this.f44423b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f44422a) == null) {
                return;
            }
            try {
                a.this.a(this.f44423b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e10) {
                p0.b("MOfferEnergize", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
            p0.b("MOfferEnergize", str);
        }
    }

    public void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f44420a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f44420a.clear();
            }
        } catch (Exception e10) {
            p0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.listener.a aVar) {
        if (viewGroup == null || aVar == null || this.f44420a == null || TextUtils.isEmpty(str) || !this.f44420a.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f44420a.get(str);
        MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        a(mOfferModel, viewGroup, aVar);
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new C0340a(viewGroup, mOfferModel), aVar);
        mOfferModel.showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) throws Resources.NotFoundException {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int iA = u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 5.0f);
        layoutParams.setMargins(iA, iA, iA, iA);
        a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            a(mOfferModel, viewGroup, viewGroup2);
        } else {
            a(viewGroup, viewGroup2);
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(viewGroup2, 0, u0.g(com.mbridge.msdk.foundation.controller.c.m().d()), 0, com.google.android.gms.internal.play_billing.a.a(100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.f44421b + 500);
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        RelativeLayout relativeLayout;
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                } else {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 100.0f), this.f44421b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 != null) {
                if (viewGroup.isShown()) {
                    relativeLayout2.setVisibility(0);
                    relativeLayout2.addView(viewGroup2);
                    return;
                }
                return;
            }
            viewGroup.addView(viewGroup2);
        } catch (Exception e10) {
            p0.b("MOfferEnergize", e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.mbridge.msdk.video.dynview.moffer.MOfferModel r8, android.view.ViewGroup r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.a.a(com.mbridge.msdk.video.dynview.moffer.MOfferModel, android.view.ViewGroup, android.view.ViewGroup):void");
    }

    private void a(ViewGroup viewGroup) throws Resources.NotFoundException {
        View viewFindViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.m().d().getResources().getDrawable(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable != null && (viewFindViewById = viewGroup.findViewById(a("mbridge_moreoffer_hls"))) != null) {
                    viewFindViewById.setBackground(drawable);
                }
            } catch (Exception e10) {
                p0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f44420a == null) {
            this.f44420a = new ConcurrentHashMap();
        }
        if (this.f44420a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f44420a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            p0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(CampaignEx campaignEx, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f44420a == null) {
            this.f44420a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f44420a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            p0.b("MOfferEnergize", e10.getMessage());
        }
    }

    private int a(String str) {
        return h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, "id");
    }
}
