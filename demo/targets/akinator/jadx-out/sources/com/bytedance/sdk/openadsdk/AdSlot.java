package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.jpo.jpo.jpo.qk.jd;
import com.bytedance.sdk.component.utils.prr;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;

    /* renamed from: au, reason: collision with root package name */
    private boolean f19102au;

    /* renamed from: cm, reason: collision with root package name */
    private float f19103cm;

    /* renamed from: dt, reason: collision with root package name */
    private int f19104dt;
    private int hmu;
    private String hna;

    /* renamed from: if, reason: not valid java name */
    private int f82if;

    /* renamed from: jd, reason: collision with root package name */
    private int f19105jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f19106jj;
    private String jpo;

    /* renamed from: jr, reason: collision with root package name */
    private String f19107jr;

    /* renamed from: ju, reason: collision with root package name */
    private String f19108ju;
    private float my;
    private int nmd;

    /* renamed from: nq, reason: collision with root package name */
    private boolean f19109nq;
    private String opi;
    private boolean oya;
    private String prr;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f19110qk;

    /* renamed from: rq, reason: collision with root package name */
    private int f19111rq;

    /* renamed from: se, reason: collision with root package name */
    private Map<String, Object> f19112se;

    /* renamed from: sq, reason: collision with root package name */
    private String f19113sq;

    /* renamed from: tu, reason: collision with root package name */
    private int f19114tu;
    private int wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f19115yd;
    private int zz;

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.f19106jj;
    }

    public String getAdId() {
        return this.hna;
    }

    public int getBannerType() {
        return this.hmu;
    }

    public String getBidAdm() {
        return this.prr;
    }

    public String getCodeId() {
        return this.jpo;
    }

    public String getCreativeId() {
        return this.f19113sq;
    }

    public int getDurationSlotType() {
        return this.f19104dt;
    }

    public float getExpressViewAcceptedHeight() {
        return this.my;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f19103cm;
    }

    public String getExt() {
        return this.opi;
    }

    public int getImgAcceptedHeight() {
        return this.wqx;
    }

    public int getImgAcceptedWidth() {
        return this.f19105jd;
    }

    public int getIsRotateBanner() {
        return this.nmd;
    }

    public String getMediaExtra() {
        return this.f19115yd;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.f19112se;
    }

    public int getRewardAmount() {
        return this.zz;
    }

    public String getRewardName() {
        return this.xyk;
    }

    public int getRotateOrder() {
        return this.f19114tu;
    }

    public int getRotateTime() {
        return this.f19111rq;
    }

    public String getUserData() {
        return this.f19107jr;
    }

    public String getUserID() {
        return this.f19108ju;
    }

    public boolean isAutoPlay() {
        return this.f19102au;
    }

    public boolean isExpressAd() {
        return this.oya;
    }

    public boolean isPreload() {
        return this.f19109nq;
    }

    public boolean isSupportDeepLink() {
        return this.f19110qk;
    }

    public void setAdCount(int i10) {
        this.f19106jj = i10;
    }

    public void setDurationSlotType(int i10) {
        this.f19104dt = i10;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.f19103cm = f10;
        this.my = f11;
    }

    public void setIsRotateBanner(int i10) {
        this.nmd = i10;
    }

    public void setPreload(boolean z10) {
        this.f19109nq = z10;
    }

    public void setRotateOrder(int i10) {
        this.f19114tu = i10;
    }

    public void setRotateTime(int i10) {
        this.f19111rq = i10;
    }

    public void setUserData(String str) {
        this.f19107jr = str;
    }

    public JSONObject toJsonObj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.jpo);
            jSONObject.put("mAdCount", this.f19106jj);
            jSONObject.put("mIsAutoPlay", this.f19102au);
            jSONObject.put("mImgAcceptedWidth", this.f19105jd);
            jSONObject.put("mImgAcceptedHeight", this.wqx);
            jSONObject.put("mExpressViewAcceptedWidth", this.f19103cm);
            jSONObject.put("mExpressViewAcceptedHeight", this.my);
            jSONObject.put("mSupportDeepLink", this.f19110qk);
            jSONObject.put("mRewardName", this.xyk);
            jSONObject.put("mRewardAmount", this.zz);
            jSONObject.put("mMediaExtra", this.f19115yd);
            jSONObject.put("mUserID", this.f19108ju);
            jSONObject.put("mNativeAdType", this.f82if);
            jSONObject.put("mIsExpressAd", this.oya);
            jSONObject.put("mAdId", this.hna);
            jSONObject.put("mCreativeId", this.f19113sq);
            jSONObject.put("mExt", this.opi);
            jSONObject.put("mBidAdm", this.prr);
            jSONObject.put("mUserData", this.f19107jr);
            jSONObject.put("mDurationSlotType", this.f19104dt);
            jSONObject.put("mBannerType", this.hmu);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.f19102au = true;
        this.oya = false;
        this.nmd = 0;
        this.f19111rq = 0;
        this.f19114tu = 0;
        this.hmu = 1;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: au, reason: collision with root package name */
        private boolean f19116au;
        private String hna;

        /* renamed from: if, reason: not valid java name */
        private float f83if;
        private String jpo;

        /* renamed from: ju, reason: collision with root package name */
        private float f19121ju;
        private String opi;
        private String oya;
        private String prr;

        /* renamed from: rq, reason: collision with root package name */
        private int f19123rq;

        /* renamed from: sq, reason: collision with root package name */
        private String f19124sq;
        private String xyk;

        /* renamed from: yd, reason: collision with root package name */
        private int f19126yd;

        /* renamed from: jd, reason: collision with root package name */
        private int f19118jd = 640;
        private int wqx = 320;

        /* renamed from: cm, reason: collision with root package name */
        private final boolean f19117cm = true;
        private int my = 1;

        /* renamed from: jj, reason: collision with root package name */
        private final String f19119jj = "";

        /* renamed from: qk, reason: collision with root package name */
        private final int f19122qk = 0;
        private String zz = "defaultUser";

        /* renamed from: jr, reason: collision with root package name */
        private boolean f19120jr = true;
        private Map<String, Object> nmd = null;

        /* renamed from: tu, reason: collision with root package name */
        private int f19125tu = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.jpo = this.jpo;
            adSlot.f19106jj = this.my;
            adSlot.f19110qk = true;
            adSlot.f19105jd = this.f19118jd;
            adSlot.wqx = this.wqx;
            float f10 = this.f19121ju;
            if (f10 <= 0.0f) {
                adSlot.f19103cm = this.f19118jd;
                adSlot.my = this.wqx;
            } else {
                adSlot.f19103cm = f10;
                adSlot.my = this.f83if;
            }
            adSlot.xyk = "";
            adSlot.zz = 0;
            adSlot.f19115yd = this.xyk;
            adSlot.f19108ju = this.zz;
            adSlot.f82if = this.f19126yd;
            adSlot.f19102au = this.f19120jr;
            adSlot.oya = this.f19116au;
            adSlot.prr = this.oya;
            adSlot.hna = this.prr;
            adSlot.f19113sq = this.hna;
            adSlot.opi = this.f19124sq;
            adSlot.f19107jr = this.opi;
            adSlot.f19112se = this.nmd;
            adSlot.f19104dt = this.f19123rq;
            adSlot.hmu = this.f19125tu;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.f19116au = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.my = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.prr = str;
            return this;
        }

        public Builder setBannerType(int i10) {
            this.f19125tu = i10;
            return this;
        }

        public Builder setCodeId(String str) {
            this.jpo = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.hna = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.f19123rq = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.f19121ju = f10;
            this.f83if = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.f19124sq = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.f19118jd = i10;
            this.wqx = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.f19120jr = z10;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.xyk = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.f19126yd = i10;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.nmd = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.opi = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.zz = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (prr.cm()) {
                jd.jpo(str);
            }
            this.oya = str;
            return this;
        }

        public Builder setRewardAmount(int i10) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }
    }
}
