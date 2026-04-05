package com.mbridge.msdk.video.dynview.ordercamp.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.nVUQ.UupKET;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f44430a = false;

    /* renamed from: b, reason: collision with root package name */
    private b f44431b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f44432c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$a, reason: collision with other inner class name */
    public class C0341a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f44433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f44434b;

        public C0341a(ImageView imageView, boolean z10) {
            this.f44433a = imageView;
            this.f44434b = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (this.f44434b) {
                this.f44433a.setVisibility(8);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f44433a.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                p0.b("OrderCampAdapter", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f44436a;

        /* renamed from: b, reason: collision with root package name */
        MBRotationView f44437b;

        /* renamed from: c, reason: collision with root package name */
        MBridgeImageView f44438c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f44439d;

        /* renamed from: e, reason: collision with root package name */
        TextView f44440e;

        /* renamed from: f, reason: collision with root package name */
        TextView f44441f;

        /* renamed from: g, reason: collision with root package name */
        TextView f44442g;

        /* renamed from: h, reason: collision with root package name */
        TextView f44443h;

        /* renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f44444i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f44445j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f44446k;

        /* renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f44447l;

        /* renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f44448m;

        /* renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f44449n;

        /* renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f44450o;

        /* renamed from: p, reason: collision with root package name */
        MBFrameLayout f44451p;
    }

    public a(List<CampaignEx> list) {
        this.f44432c = list;
    }

    private void a(int i10, ViewGroup viewGroup) throws Resources.NotFoundException {
        List<CampaignEx> list = this.f44432c;
        if (list == null || this.f44431b == null || list.size() == 0) {
            return;
        }
        MBridgeImageView mBridgeImageView = this.f44431b.f44438c;
        if (mBridgeImageView != null) {
            a(mBridgeImageView, this.f44432c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f44431b.f44446k;
        if (imageView != null) {
            a(imageView, this.f44432c.get(i10).getImageUrl(), false);
        }
        RoundImageView roundImageView = this.f44431b.f44439d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f44431b.f44439d, this.f44432c.get(i10).getIconUrl(), true);
        }
        double rating = this.f44432c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f44431b.f44444i;
        if (mBridgeLevelLayoutView != null) {
            mBridgeLevelLayoutView.setRatingAndUser(rating, this.f44432c.get(i10).getNumberRating());
            this.f44431b.f44444i.setOrientation(0);
        }
        MBRotationView mBRotationView = this.f44431b.f44437b;
        if (mBRotationView != null) {
            mBRotationView.setWidthRatio(1.0f);
            this.f44431b.f44437b.setHeightRatio(1.0f);
            this.f44431b.f44437b.setAutoscroll(false);
        }
        MBridgeImageView mBridgeImageView2 = this.f44431b.f44438c;
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private View b(int i10) throws Throwable {
        View viewA;
        String cMPTEntryUrl;
        String str;
        try {
            List<CampaignEx> list = this.f44432c;
            cMPTEntryUrl = "";
            if (list == null || list.get(i10) == null) {
                str = "501";
            } else {
                str = this.f44432c.get(i10).getMof_tplid() + "";
                cMPTEntryUrl = this.f44432c.get(i10).getCMPTEntryUrl();
            }
        } catch (Exception e10) {
            p0.b("OrderCampAdapter", e10.getMessage());
            viewA = null;
        }
        if (TextUtils.isEmpty(cMPTEntryUrl)) {
            return a();
        }
        int iF = l0.F(com.mbridge.msdk.foundation.controller.c.m().d());
        String strA = y.a(0, str, cMPTEntryUrl);
        if (TextUtils.isEmpty(strA)) {
            return a();
        }
        File file = new File(strA + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> listA = n0.a(strA, "template_" + str + "_" + iF + "_item");
            if (listA == null) {
                return a();
            }
            viewA = a(i10, listA);
            return this.f44430a ? viewA : a();
        }
        return a();
    }

    private int c(String str) {
        return h0.a(com.mbridge.msdk.foundation.controller.c.m().d().getApplicationContext(), str, "id");
    }

    public int d(String str) {
        return h0.a(com.mbridge.msdk.foundation.controller.c.m().d().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<CampaignEx> list = this.f44432c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f44432c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        List<CampaignEx> list = this.f44432c;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) throws Throwable {
        try {
            if (view == null) {
                view = b(i10);
            } else {
                this.f44431b = (b) view.getTag();
            }
            a(view);
            if (this.f44430a) {
                b(i10, viewGroup);
            } else {
                a(i10, viewGroup);
            }
            a(i10);
        } catch (Exception e10) {
            p0.b("OrderCampAdapter", e10.getMessage());
        }
        List<CampaignEx> list = this.f44432c;
        if (list != null && list.size() > i10) {
            a1.a(view, this.f44432c.get(i10).getLocalRequestId(), this.f44432c.get(i10).getLocalAllowTrackClick());
        }
        return view;
    }

    private void b(int i10, ViewGroup viewGroup) throws Resources.NotFoundException {
        List<CampaignEx> list = this.f44432c;
        if (list == null || this.f44431b == null || list.size() == 0) {
            return;
        }
        MBCusRoundImageView mBCusRoundImageView = this.f44431b.f44447l;
        if (mBCusRoundImageView != null) {
            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
            a(this.f44431b.f44447l, this.f44432c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f44431b.f44446k;
        if (imageView != null) {
            a(imageView, this.f44432c.get(i10).getImageUrl(), false);
        }
        MBCusRoundImageView mBCusRoundImageView2 = this.f44431b.f44448m;
        if (mBCusRoundImageView2 != null) {
            mBCusRoundImageView2.setBorder(50, 20, -1);
            a(this.f44431b.f44448m, this.f44432c.get(i10).getIconUrl(), true);
        }
        double rating = this.f44432c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBStarLevelLayoutView mBStarLevelLayoutView = this.f44431b.f44449n;
        if (mBStarLevelLayoutView != null) {
            mBStarLevelLayoutView.setRating((int) rating);
            this.f44431b.f44449n.setOrientation(0);
        }
        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f44431b.f44450o;
        if (mBHeatLevelLayoutView != null) {
            mBHeatLevelLayoutView.setHeatCount(this.f44432c.get(i10).getNumberRating());
        }
    }

    private View a(int i10, List<String> list) {
        int iF = l0.F(com.mbridge.msdk.foundation.controller.c.m().d());
        h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
        View viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f44432c.get(i10)).fileDirs(list).dyAdType(DyAdType.REWARD).orientation(iF).adChoiceLink(u0.a(this.f44432c.get(i10))).build());
        if (viewCreateDynamicView != null) {
            this.f44430a = true;
            b bVar = new b();
            this.f44431b = bVar;
            bVar.f44447l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv"));
            this.f44431b.f44446k = (ImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv_burl"));
            this.f44431b.f44448m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_icon_iv"));
            this.f44431b.f44449n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(b("mbridge_lv_sv_starlevel"));
            this.f44431b.f44451p = (MBFrameLayout) viewCreateDynamicView.findViewById(b("mbridge_lv_ration"));
            viewCreateDynamicView.setTag(this.f44431b);
        }
        return viewCreateDynamicView;
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private View a() {
        View viewInflate = LayoutInflater.from(com.mbridge.msdk.foundation.controller.c.m().d()).inflate(d("mbridge_order_layout_item"), (ViewGroup) null);
        b bVar = new b();
        this.f44431b = bVar;
        bVar.f44438c = (MBridgeImageView) viewInflate.findViewById(c(UupKET.vySFbS));
        this.f44431b.f44446k = (ImageView) viewInflate.findViewById(c("mbridge_lv_iv_burl"));
        this.f44431b.f44439d = (RoundImageView) viewInflate.findViewById(c("mbridge_lv_icon_iv"));
        this.f44431b.f44444i = (MBridgeLevelLayoutView) viewInflate.findViewById(c("mbridge_lv_sv_starlevel"));
        this.f44431b.f44437b = (MBRotationView) viewInflate.findViewById(c("mbridge_lv_ration"));
        viewInflate.setTag(this.f44431b);
        return viewInflate;
    }

    private void a(View view) {
        this.f44431b.f44436a = (RelativeLayout) view.findViewById(a("mbridge_lv_item_rl"));
        this.f44431b.f44440e = (TextView) view.findViewById(a("mbridge_lv_title_tv"));
        this.f44431b.f44442g = (TextView) view.findViewById(a("mbridge_lv_tv_install"));
        this.f44431b.f44450o = (MBHeatLevelLayoutView) view.findViewById(a("mbridge_lv_sv_heat_level"));
        this.f44431b.f44441f = (TextView) view.findViewById(a("mbridge_lv_desc_tv"));
        this.f44431b.f44445j = (ImageView) view.findViewById(a("mbridge_iv_flag"));
        this.f44431b.f44443h = (TextView) view.findViewById(a("mbridge_order_viewed_tv"));
    }

    private void a(ImageView imageView, String str, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new C0341a(imageView, z10));
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private void a(int i10) {
        b bVar = this.f44431b;
        if (bVar != null) {
            if (bVar.f44440e != null) {
                this.f44431b.f44440e.setText(this.f44432c.get(i10).getAppName());
            }
            if (this.f44431b.f44441f != null) {
                this.f44431b.f44441f.setText(this.f44432c.get(i10).getAppDesc());
            }
            if (this.f44431b.f44442g != null) {
                String adCall = this.f44432c.get(i10).getAdCall();
                if (this.f44431b.f44442g instanceof MBridgeTextView) {
                    ((MBridgeTextView) this.f44431b.f44442g).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(this.f44431b.f44442g));
                }
                this.f44431b.f44442g.setText(adCall);
            }
            if (this.f44431b.f44445j != null) {
                try {
                    String language = Locale.getDefault().getLanguage();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                    if (contextD != null) {
                        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                            this.f44431b.f44445j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
                        } else {
                            this.f44431b.f44445j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
                        }
                    }
                } catch (Exception e10) {
                    p0.b("OrderCampAdapter", e10.getMessage());
                }
                u0.a(2, this.f44431b.f44445j, this.f44432c.get(i10), com.mbridge.msdk.foundation.controller.c.m().d(), false, null);
            }
            if (this.f44431b.f44443h != null) {
                try {
                    this.f44431b.f44443h.setText(com.mbridge.msdk.foundation.controller.c.m().d().getResources().getString(com.mbridge.msdk.foundation.controller.c.m().d().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", com.mbridge.msdk.foundation.controller.c.m().h())));
                    this.f44431b.f44443h.setVisibility(0);
                } catch (Exception e11) {
                    p0.b("OrderCampAdapter", e11.getMessage());
                }
            }
        }
    }

    private int a(String str) {
        if (this.f44430a) {
            return b(str);
        }
        return c(str);
    }
}
