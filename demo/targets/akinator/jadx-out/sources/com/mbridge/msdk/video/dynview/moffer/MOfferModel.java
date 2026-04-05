package com.mbridge.msdk.video.dynview.moffer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.ObservableScrollView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MOfferModel implements NoProGuard {
    private static final String MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5 = "12930014";
    private static final String MOF_LOAD_RESULT_FAILED = "2";
    private static final String MOF_LOAD_RESULT_SUCCESS = "1";
    private static final String TAG = "MOfferModel";
    private int admf;
    private int admftm;
    private List<Integer> cacheImpressionReportList;
    private List<Integer> cacheOnlyImpressionReportList;
    private boolean isShowMoreOffer;
    private CampaignUnit mCampaignUnit;
    private Context mContext;
    private LinearLayout mLinearLayout;
    private CampaignEx mMainOfferCampaignEx;
    private com.mbridge.msdk.video.dynview.listener.g mMoreOfferLayoutListener;
    private com.mbridge.msdk.video.module.listener.a mNotifyListener;
    private ObservableScrollView mObservableScrollView;
    private com.mbridge.msdk.foundation.same.net.wrapper.e mParam;
    private String mRid;
    private String mUnitId;
    private MBridgeRelativeLayout viewMofferLayout;
    private final String VALUE_MOF_TYPE = "1";
    private final String VALUE_H5_TYPE = "1";
    private final String VALUE_MOF = "1";
    private final String VALUE_COUNTRY_CODE = "CN";
    private final String VALUE_MOF_VER = "1";
    private final String VALUE_OFF_SET = "0";
    private final String VALUE_CATEGORY = "0";
    private final String VALUE_ONLY_IMPRESSION = "1";
    private final String VALUE_PING_MODE = "1";
    private final String VALUE_HTTP_REQ = "2";
    private final String VALUE_AD_NUM = "20";
    private final String VALUE_TNUM = "20";
    private final String VALUE_API_VERSION = "2.3";
    private final String VALUE_DEFAULT_VIDEO_TEMP_ID = "404";
    private final String K = CampaignEx.JSON_KEY_AD_K;
    private final String MOF_TEST_UID = "mof_testuid";
    private final String MCC = "mcc";
    private final String MOF_UID = "mof_uid";
    private final String MNC = "mnc";
    private final String RV_TID = "rv_tid";
    private final String EC_ID = "ecid";
    private final String TP_LGP = "tplgp";
    private final String V_FMD5 = "v_fmd5";
    private final String I_FMD5 = "i_fmd5";
    private final String APP_ID = "app_id";
    private final String SIGN = "sign";
    private final String PARENT_UNIT = "parent_unit";
    private final String E = "e";
    private final String MOF_TYPE = "mof_type";
    private final String H5_TYPE = "h5_type";
    private final String MOF = "mof";
    private final String COUNTRY_CODE = "country_code";
    private final String MOF_VER = "mof_ver";
    private final String CRT_CID = "crt_cid";
    private final String CRT_RID = "crt_rid";
    private final String H5_T = "h5_t";
    private final String MOF_T = "mof_t";
    private final String MOF_DATA = "mof_data";
    private final String OFFER_ID = "offer_id";
    private final String OFF_SET = "offset";
    private final String CATEGORY = "category";
    private final String ONLY_IMPRESSION = "only_impression";
    private final String PING_MODE = "ping_mode";
    private final String HTTP_REQ = "http_req";
    private final String AD_NUM = "ad_num";
    private final String TNUM = "tnum";
    private final String API_VERSION = "api_version";
    private final String MOF_DOMAIN = "mof_domain";
    private final String PARENT_ID = "parent_id";
    private final String MOF_PARENT_ID = "mof_parent_id";
    private final String MOF_CALLBACK_DATE = "mcd";
    private final String UC_PARENT_UNIT = "uc_parent_unit";
    private final String DEFAULT_PATH_V3 = "/openapi/ad/v3";
    private final String PARENT_EXCHANGE = "parent_exchange";
    private final String PARENT_AD_TYPE = "parent_ad_type";
    private final String PARENT_TEMPLATE_ID = "parent_template_id";
    private final String ONE_ID = "oneId";
    private final String DY_VIEW = "dy_view";
    private final String MORE_OFFER_DEFAULT_UNIT_ID = "117361";
    private final String MORE_OFFER_DEFAULT_APP_ID = "92762";
    private final String MORE_OFFER_DEFAULT_APP_KEY = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private final String MORE_OFFER_LOAD_SUCCESS = "more offer load success";
    private final String MORE_OFFER_LOAD_FAILED = "more offer load failed";
    private final String MORE_OFFER_SHOW = "more offer show";
    private final String MORE_OFFER_CLICK = "more offer click";
    private final String MORE_OFFER_SHOW_FAILED = "more offer show fail";
    private final String UNIT_ID = MBridgeConstans.PROPERTIES_UNIT_ID;
    private final String R_ID = "r_id";
    private final int DO_ACTION_IMPRESSION = 0;
    private final int DO_ACTION_ONLY_IMPRESSION = 1;
    private volatile boolean hasReportMoreOfferLoad = false;
    private volatile boolean hasReportMoreOfferShow = false;
    private int bitmapSuccessCount = 0;
    private List<Integer> mImpressionId = new ArrayList();
    private int mControlShowSize = 0;
    private boolean isOnlyImpShow = false;
    private boolean mHasReportMofScenes = false;
    private boolean mIsRetry = false;
    private int mFromType = 0;
    private OnItemExposeListener onItemExposeListener = new a();
    private com.mbridge.msdk.video.dynview.moffer.c mMoreOfferShowCallBack = new b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements OnItemExposeListener {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public void onItemViewFirstVisible() {
            if (MOfferModel.this.viewMofferLayout == null || !MOfferModel.this.isOnlyImpShow) {
                return;
            }
            if (MOfferModel.this.viewMofferLayout.getVisibility() == 0) {
                try {
                    com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, 0, 1, "117361");
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (MOfferModel.this.cacheOnlyImpressionReportList == null) {
                MOfferModel.this.cacheOnlyImpressionReportList = new ArrayList();
            }
            MOfferModel.this.cacheOnlyImpressionReportList.add(0);
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public void onItemViewVisible(boolean z10, int i10) {
            if (MOfferModel.this.viewMofferLayout == null) {
                return;
            }
            if (MOfferModel.this.viewMofferLayout.getVisibility() != 0) {
                if (MOfferModel.this.cacheImpressionReportList == null) {
                    MOfferModel.this.cacheImpressionReportList = new ArrayList();
                }
                if (MOfferModel.this.cacheImpressionReportList.contains(Integer.valueOf(i10))) {
                    return;
                }
                MOfferModel.this.cacheImpressionReportList.add(Integer.valueOf(i10));
                return;
            }
            if (!MOfferModel.this.hasReportMoreOfferShow) {
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                MOfferModel.this.hasReportMoreOfferShow = true;
            }
            try {
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, i10, 0, "117361");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.video.dynview.moffer.c {
        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.c
        public void a(List<View> list) {
            TextView textView;
            if (MOfferModel.this.viewMofferLayout == null || (textView = (TextView) MOfferModel.this.viewMofferLayout.findViewById(MOfferModel.this.findID("mbridge_reward_end_card_like_tv"))) == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.video.dynview.moffer.b {
        public d() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.b
        public void a() {
            try {
                if (MOfferModel.this.cacheImpressionReportList != null) {
                    for (int i10 = 0; i10 < MOfferModel.this.cacheImpressionReportList.size(); i10++) {
                        if (!MOfferModel.this.hasReportMoreOfferShow) {
                            com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                            MOfferModel.this.hasReportMoreOfferShow = true;
                        }
                        com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheImpressionReportList.get(i10)).intValue(), 0, "117361");
                    }
                }
                if (!MOfferModel.this.isOnlyImpShow && MOfferModel.this.cacheOnlyImpressionReportList != null) {
                    for (int i11 = 0; i11 < MOfferModel.this.cacheOnlyImpressionReportList.size(); i11++) {
                        com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheOnlyImpressionReportList.get(i11)).intValue(), 1, "117361");
                    }
                }
                MOfferModel.this.release();
            } catch (Exception e10) {
                p0.b(MOfferModel.TAG, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements com.mbridge.msdk.video.dynview.moffer.d {
        public e() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.d
        public void a() {
            if (MOfferModel.this.viewMofferLayout != null && MOfferModel.this.viewMofferLayout.getVisibility() != 0) {
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show fail", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
            }
            MOfferModel.this.release();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MOfferModel.this.checkViewVisiableState();
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44413a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f44414b;

        public g(int i10, View view) {
            this.f44413a = i10;
            this.f44414b = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CampaignEx campaignEx;
            try {
                if (MOfferModel.this.mCampaignUnit == null || MOfferModel.this.mCampaignUnit.ads == null || MOfferModel.this.mCampaignUnit.ads.size() <= 0 || (campaignEx = MOfferModel.this.mCampaignUnit.ads.get(this.f44413a)) == null) {
                    return;
                }
                if (MOfferModel.this.mNotifyListener != null) {
                    MOfferModel mOfferModel = MOfferModel.this;
                    mOfferModel.callBackClick(mOfferModel.mNotifyListener);
                }
                campaignEx.setLocalRequestId(MOfferModel.this.mCampaignUnit.getLocalRequestId());
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), "more offer click", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                com.mbridge.msdk.video.dynview.request.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx, MOfferModel.this.mUnitId, this.f44414b);
            } catch (Exception e10) {
                p0.b(MOfferModel.TAG, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MOfferModel.this.mObservableScrollView != null) {
                if (MOfferModel.this.mObservableScrollView.getVisibility() == 0) {
                    MOfferModel.this.mObservableScrollView.setVisibility(8);
                } else {
                    MOfferModel.this.mObservableScrollView.setVisibility(0);
                }
            }
            try {
                new com.mbridge.msdk.video.dynview.ui.b().c(MOfferModel.this.mLinearLayout, 300L);
            } catch (Exception e10) {
                p0.b(MOfferModel.TAG, e10.getMessage());
            }
        }
    }

    public static /* synthetic */ int access$2208(MOfferModel mOfferModel) {
        int i10 = mOfferModel.bitmapSuccessCount;
        mOfferModel.bitmapSuccessCount = i10 + 1;
        return i10;
    }

    private void addLikeTextView() {
        TextView textView;
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (textView = (TextView) mBridgeRelativeLayout.findViewById(findID("mbridge_reward_end_card_like_tv"))) == null) {
            return;
        }
        textView.setTextColor(Color.parseColor("#FF000000"));
        textView.setTextSize(10.0f);
        if (l0.p(com.mbridge.msdk.foundation.controller.c.m().d()).contains("zh")) {
            textView.setEms(1);
            textView.getLayoutParams().width = com.google.android.gms.internal.play_billing.a.a(30.0f);
            textView.setText("猜你喜欢");
        } else {
            textView.setText("Just\nfor\nYou");
        }
        textView.setOnClickListener(new i());
    }

    private View buildItemView(int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA;
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(this.mContext).inflate(h0.a(context, "mbridge_reward_end_card_more_offer_item", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
        int iA = h0.a(this.mContext, "mbridge_reward_end_card_item_iv", "id");
        if (viewInflate == null) {
            return null;
        }
        setOfferData(this.mCampaignUnit.getAds(), i10, (RoundImageView) viewInflate.findViewById(iA), (TextView) viewInflate.findViewById(h0.a(this.mContext, "mbridge_reward_end_card_item_title_tv", "id")));
        CampaignEx campaignEx = this.mCampaignUnit.getAds().get(0);
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 295);
        if (TextUtils.isEmpty(campaignEx.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        if (TextUtils.isEmpty(this.mCampaignUnit.getLocalRequestId())) {
            cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(false, campaignEx.getBidToken(), eVar, campaignEx, this.mUnitId);
        } else {
            campaignEx.setLocalRequestId(this.mCampaignUnit.getLocalRequestId());
            cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(this.mCampaignUnit.getLocalRequestId());
        }
        a1.a(viewInflate, cVarA.o(), campaignEx.getLocalAllowTrackClick());
        this.mCampaignUnit.setLocalRequestId(cVarA.o());
        viewInflate.setOnClickListener(new g(i10, viewInflate));
        return viewInflate;
    }

    private void buildRequestParams(CampaignEx campaignEx) throws JSONException {
        String str;
        String str2;
        String str3;
        if (campaignEx == null) {
            return;
        }
        this.mParam = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        String campaignUnitId = campaignEx.getCampaignUnitId();
        String id2 = campaignEx.getId();
        String requestIdNotice = campaignEx.getRequestIdNotice();
        campaignEx.getRequestId();
        String strA = b1.a(campaignEx.getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(strA)) {
            strA = b1.a(campaignEx.getendcard_url(), "mof_uid");
        }
        String strB = com.mbridge.msdk.foundation.controller.c.m().b();
        String strK = (TextUtils.isEmpty(strB) || com.mbridge.msdk.setting.h.b().d(strB) == null) ? "CN" : com.mbridge.msdk.setting.h.b().d(strB).k();
        String strA2 = b1.a(campaignEx.getendcard_url(), "mcc");
        String strA3 = b1.a(campaignEx.getendcard_url(), "mnc");
        String strA4 = b1.a(campaignEx.getendcard_url(), "rv_tid");
        String strA5 = campaignEx.getendcard_url().contains("ecid") ? b1.a(campaignEx.getendcard_url(), "ecid") : String.valueOf(campaignEx.getEcTemplateId());
        String str4 = strA;
        String strA6 = b1.a(campaignEx.getendcard_url(), "tplgp");
        String str5 = strK;
        String strA7 = b1.a(campaignEx.getendcard_url(), "v_fmd5");
        String strA8 = b1.a(campaignEx.getendcard_url(), "i_fmd5");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "app_id", com.mbridge.msdk.foundation.controller.c.m().b());
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = this.mParam;
        StringBuilder sbU = o2.u(strB);
        sbU.append(com.mbridge.msdk.foundation.controller.c.m().c());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", SameMD5.getMD5(sbU.toString()));
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar2 = this.mParam;
        String str6 = "";
        if (TextUtils.isEmpty(requestIdNotice)) {
            str = "sign";
            str2 = "";
        } else {
            str = "sign";
            str2 = requestIdNotice;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar2, "r_id", str2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "e", Arrays.toString(new String[]{id2}));
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_type", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "h5_type", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "country_code", TextUtils.isEmpty(str5) ? "CN" : str5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_ver", "1");
        this.mParam.a("parent_exchange", "");
        int adType = campaignEx.getAdType();
        if (adType == 94) {
            str6 = "rewarded_video";
        } else if (adType == 287) {
            str6 = "interstitial_video";
        }
        this.mParam.a("parent_ad_type", str6);
        this.mParam.a("oneId", campaignEx.getReq_ext_data());
        if (TextUtils.isEmpty(strA5)) {
            this.mParam.a("parent_template_id", "404");
        } else {
            this.mParam.a("parent_template_id", strA5);
        }
        if (TextUtils.isEmpty(str4)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "uc_parent_unit", campaignUnitId);
        } else {
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "parent_unit", campaignUnitId);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mnc", strA3);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mcc", strA2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crt_cid", id2);
            jSONObject.put("crt_rid", requestIdNotice);
            jSONObject.put("rv_tid", strA4);
            jSONObject.put("ecid", strA5);
            jSONObject.put("tplgp", strA6);
            jSONObject.put("v_fmd5", strA7);
            jSONObject.put("i_fmd5", strA8);
            jSONObject.put("h5_t", 1);
            jSONObject.put("mof_t", 1);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_data", jSONObject.toString());
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "offer_id", id2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "offset", "0");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "category", "0");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "http_req", "2");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "ad_num", "20");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "tnum", "20");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "api_version", "2.3");
        if (TextUtils.isEmpty(str4)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "app_id", "92762");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, str, SameMD5.getMD5("92762936dcbdd57fe235fd7cf61c2e93da3c4"));
            str3 = "117361";
        } else {
            str3 = str4;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, MBridgeConstans.PROPERTIES_UNIT_ID, str3);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "dy_view", "1");
    }

    private void buildScrollViewGroup() {
        if (this.mContext == null || this.viewMofferLayout == null || this.mMainOfferCampaignEx == null) {
            return;
        }
        this.mLinearLayout = new LinearLayout(this.mContext);
        this.mLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.mLinearLayout.setOrientation(0);
        this.mLinearLayout.setGravity(17);
        for (int i10 = 0; i10 < this.mCampaignUnit.ads.size(); i10++) {
            View viewBuildItemView = buildItemView(i10);
            if (viewBuildItemView != null) {
                this.mLinearLayout.addView(viewBuildItemView);
            }
        }
        this.mObservableScrollView.addView(this.mLinearLayout);
        this.mObservableScrollView.setOnTouchListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBackClick(com.mbridge.msdk.video.module.listener.a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.a(128, "");
    }

    private void createMoreOfferList() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        this.mObservableScrollView = (ObservableScrollView) mBridgeRelativeLayout.findViewById(findID("mbridge_moreoffer_hls"));
        buildScrollViewGroup();
        addLikeTextView();
        showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMoreOfferView() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || this.mContext == null || campaignUnit.getAds() == null || this.mCampaignUnit.getAds().size() == 0) {
            return;
        }
        setMoreOfferLayoutCallBack();
        createMoreOfferList();
    }

    private void doAdmfContorl() {
        try {
            CampaignEx campaignEx = this.mMainOfferCampaignEx;
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getMoreOfferJsonData())) {
                JSONObject jSONObject = new JSONObject(this.mMainOfferCampaignEx.getMoreOfferJsonData());
                int i10 = this.mFromType;
                JSONObject jSONObject2 = i10 != 1 ? i10 != 2 ? null : jSONObject.getJSONObject(CampaignEx.ENDCARD_URL) : jSONObject.getJSONObject("template_url");
                if (jSONObject2 == null) {
                    return;
                }
                if (jSONObject2.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM)) {
                    this.admftm = jSONObject2.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
                }
                if (jSONObject2.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF)) {
                    this.admf = jSONObject2.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
                }
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doControllableImpOnRequest() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null) {
            return;
        }
        try {
            com.mbridge.msdk.video.dynview.request.a.a(campaignUnit, 0, 1, "117361");
            this.isOnlyImpShow = true;
            if (this.mCampaignUnit.getAds() == null) {
                return;
            }
            int size = this.mCampaignUnit.getAds().size();
            if (this.admf >= size) {
                this.admf = size;
            }
            if (this.mImpressionId == null) {
                this.mImpressionId = new ArrayList();
            }
            for (int i10 = 0; i10 < this.admf; i10++) {
                if (!this.mImpressionId.contains(Integer.valueOf(i10))) {
                    com.mbridge.msdk.video.dynview.request.a.a(this.mCampaignUnit, i10, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i10));
                }
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void doControllableImpOnShow(int i10) {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return;
        }
        try {
            int size = this.mCampaignUnit.getAds().size();
            if (this.mControlShowSize == 0) {
                this.mControlShowSize = this.admf + i10;
            }
            if (this.mControlShowSize >= size) {
                this.mControlShowSize = size;
            }
            while (i10 < this.mControlShowSize) {
                if (!this.mImpressionId.contains(Integer.valueOf(i10))) {
                    com.mbridge.msdk.video.dynview.request.a.a(this.mCampaignUnit, i10, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i10));
                }
                i10++;
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findID(String str) {
        return h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, "id");
    }

    private void initData() throws JSONException {
        CampaignEx campaignEx = this.mMainOfferCampaignEx;
        if (campaignEx == null || this.mContext == null) {
            return;
        }
        buildRequestParams(campaignEx);
        if (this.mParam == null) {
            return;
        }
        com.mbridge.msdk.video.dynview.request.b bVar = new com.mbridge.msdk.video.dynview.request.b(this.mContext);
        c cVar = new c();
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().Z;
        if (!TextUtils.isEmpty(this.mMainOfferCampaignEx.getReq_ext_data())) {
            try {
                JSONObject jSONObject = new JSONObject(this.mMainOfferCampaignEx.getReq_ext_data());
                String strOptString = jSONObject.optString("mof_domain");
                if (!TextUtils.isEmpty(strOptString)) {
                    str = strOptString + "/openapi/ad/v3";
                }
                String strOptString2 = jSONObject.optString("parent_id");
                if (!TextUtils.isEmpty(strOptString2)) {
                    com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_parent_id", strOptString2);
                }
                String strOptString3 = jSONObject.optString("oneId");
                if (!TextUtils.isEmpty(strOptString3)) {
                    com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "oneId", strOptString3);
                }
                String strOptString4 = jSONObject.optString("mcd");
                if (!TextUtils.isEmpty(strOptString4)) {
                    com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mcd", strOptString4);
                }
                cVar.setUnitId(this.mMainOfferCampaignEx.getCampaignUnitId());
            } catch (Exception e10) {
                p0.b(TAG, e10.getMessage());
                str = com.mbridge.msdk.foundation.same.net.utils.d.h().Z;
            }
        }
        String str2 = str;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (this.mIsRetry) {
            eVar.a("retry", "1");
        }
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_initiate", this.mMainOfferCampaignEx, eVar);
        bVar.getLoadOrSetting(1, str2, this.mParam, cVar, true, "more_offer", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        doAdmfContorl();
    }

    private void initView() {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.viewMofferLayout = (MBridgeRelativeLayout) LayoutInflater.from(this.mContext).inflate(h0.a(context, "mbridge_reward_more_offer_view", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        List<Integer> list = this.cacheImpressionReportList;
        if (list != null) {
            list.clear();
            this.cacheImpressionReportList = null;
        }
        List<Integer> list2 = this.cacheOnlyImpressionReportList;
        if (list2 != null) {
            list2.clear();
            this.cacheOnlyImpressionReportList = null;
        }
    }

    private void setCallbackForLogicVisibleView(View view, int i10) {
        if (view == null) {
            return;
        }
        try {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z10 = rect.width() > view.getMeasuredWidth() / 5;
            if (!globalVisibleRect || !z10) {
                if (this.admf != 0) {
                    doControllableImpOnShow(i10);
                    return;
                }
                return;
            }
            List<Integer> list = this.mImpressionId;
            if (list != null && this.onItemExposeListener != null && !list.contains(Integer.valueOf(i10))) {
                this.mImpressionId.add(Integer.valueOf(i10));
                this.onItemExposeListener.onItemViewVisible(true, i10);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void setMoreOfferLayoutCallBack() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        mBridgeRelativeLayout.setMoreOfferCacheReportCallBack(new d());
        this.viewMofferLayout.setMoreOfferShowFailedCallBack(new e());
    }

    private void setOfferData(List<CampaignEx> list, int i10, RoundImageView roundImageView, TextView textView) {
        CampaignEx campaignEx;
        if (roundImageView == null || textView == null || list == null || this.mContext == null || this.mMainOfferCampaignEx == null || list.size() <= 0 || (campaignEx = list.get(i10)) == null) {
            return;
        }
        roundImageView.setImageDrawable(null);
        com.mbridge.msdk.foundation.same.image.b.a(this.mContext).a(campaignEx.getIconUrl(), new h(roundImageView));
        if (TextUtils.isEmpty(campaignEx.getAppName())) {
            return;
        }
        String strA = b1.a(this.mMainOfferCampaignEx.getendcard_url(), "mof_textmod");
        if (TextUtils.isEmpty(strA) || !strA.equals("1")) {
            textView.setVisibility(8);
        } else {
            textView.setText(campaignEx.getAppName());
        }
    }

    public void buildMofferAd(CampaignEx campaignEx) throws JSONException {
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        this.mContext = contextD;
        if (contextD == null) {
            return;
        }
        this.mMainOfferCampaignEx = campaignEx;
        initView();
        initData();
    }

    public void checkViewVisiableState() {
        if (this.mLinearLayout == null) {
            return;
        }
        for (int i10 = 0; i10 < this.mLinearLayout.getChildCount(); i10++) {
            try {
                setCallbackForLogicVisibleView(this.mLinearLayout.getChildAt(i10), i10);
            } catch (Exception e10) {
                p0.b(TAG, e10.getMessage());
                return;
            }
        }
    }

    public long getECParentTemplateCode() {
        try {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = this.mParam;
            String str = eVar != null ? eVar.a().get("parent_template_id") : "";
            if (TextUtils.isEmpty(str)) {
                return 404L;
            }
            return Long.parseLong(str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return 404L;
        }
    }

    public CampaignEx getmMainOfferCampaignEx() {
        return this.mMainOfferCampaignEx;
    }

    public void mofDestroy() {
        if (this.mMoreOfferLayoutListener != null) {
            this.mMoreOfferLayoutListener = null;
        }
        if (this.onItemExposeListener != null) {
            this.onItemExposeListener = null;
        }
        if (this.mMoreOfferShowCallBack != null) {
            this.mMoreOfferShowCallBack = null;
        }
        if (this.mNotifyListener != null) {
            this.mNotifyListener = null;
        }
    }

    public void setFromType(int i10) {
        this.mFromType = i10;
    }

    public void setIsRetry(boolean z10) {
        this.mIsRetry = z10;
    }

    public void setMoreOfferListener(com.mbridge.msdk.video.dynview.listener.g gVar, com.mbridge.msdk.video.module.listener.a aVar) {
        this.mMoreOfferLayoutListener = gVar;
        this.mNotifyListener = aVar;
    }

    public void showView() {
        CampaignUnit campaignUnit;
        com.mbridge.msdk.video.dynview.listener.g gVar = this.mMoreOfferLayoutListener;
        if (gVar == null) {
            return;
        }
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (campaignUnit = this.mCampaignUnit) == null) {
            gVar.a(-1, "more Offer create fail");
            return;
        }
        gVar.a(mBridgeRelativeLayout, campaignUnit);
        if (!this.isOnlyImpShow) {
            com.mbridge.msdk.video.dynview.request.a.a(this.mCampaignUnit, 0, 1, "117361");
        }
        if (this.mHasReportMofScenes) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("scene", this.mFromType + "");
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_scenes", this.mMainOfferCampaignEx, eVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.video.dynview.request.abs.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.request.abs.a
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            if (MOfferModel.this.mParam == null || campaignUnit == null) {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            }
            try {
                MOfferModel mOfferModel = MOfferModel.this;
                mOfferModel.mUnitId = mOfferModel.mParam.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                MOfferModel mOfferModel2 = MOfferModel.this;
                mOfferModel2.mRid = mOfferModel2.mParam.a().get("r_id");
                if (campaignUnit.getAds() == null || campaignUnit.getAds().size() < 5) {
                    if (!MOfferModel.this.hasReportMoreOfferLoad) {
                        com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), "more offer load failed errorCode: -999 errorMsg: The campaign quantity less than 5.", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                        MOfferModel.this.hasReportMoreOfferLoad = true;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("result", "2");
                    eVar.a("code", MOfferModel.MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5);
                    if (MOfferModel.this.mIsRetry) {
                        eVar.a("retry", "1");
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, eVar);
                    com.mbridge.msdk.video.dynview.moffer.a.a().b();
                    return;
                }
                MOfferModel.this.mCampaignUnit = campaignUnit;
                if (MOfferModel.this.admf > 0 && MOfferModel.this.admftm == 1) {
                    MOfferModel.this.doControllableImpOnRequest();
                }
                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                    com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), "more offer load success", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferLoad = true;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("result", "1");
                if (MOfferModel.this.mIsRetry) {
                    eVar2.a("retry", "1");
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, eVar2);
                MOfferModel.this.createMoreOfferView();
            } catch (Exception e10) {
                p0.b(MOfferModel.TAG, e10.getMessage());
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.request.abs.a
        public void a(int i10, String str) {
            if (MOfferModel.this.mParam == null) {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            }
            try {
                MOfferModel mOfferModel = MOfferModel.this;
                mOfferModel.mUnitId = mOfferModel.mParam.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                MOfferModel mOfferModel2 = MOfferModel.this;
                mOfferModel2.mRid = mOfferModel2.mParam.a().get("r_id");
                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                    com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), "more offer load failed errorCode:" + i10 + "errorMsg:" + str, MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferLoad = true;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "2");
                eVar.a("code", i10 + "");
                if (MOfferModel.this.mIsRetry) {
                    eVar.a("retry", "1");
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, eVar);
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
            } catch (Exception e10) {
                p0.b(MOfferModel.TAG, e10.getMessage());
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f44416a;

        public h(RoundImageView roundImageView) {
            this.f44416a = roundImageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (this.f44416a != null && bitmap != null && !bitmap.isRecycled()) {
                    this.f44416a.setBorderRadius(13);
                    this.f44416a.setImageBitmap(bitmap);
                }
                MOfferModel.access$2208(MOfferModel.this);
                if (MOfferModel.this.isShowMoreOffer || MOfferModel.this.bitmapSuccessCount < 5 || MOfferModel.this.mMoreOfferShowCallBack == null) {
                    return;
                }
                MOfferModel.this.isShowMoreOffer = true;
                MOfferModel.this.mMoreOfferShowCallBack.a(null);
            } catch (Exception e10) {
                p0.b(MOfferModel.TAG, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
