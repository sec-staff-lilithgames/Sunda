package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* renamed from: ln, reason: collision with root package name */
    protected String f41608ln;
    private String price;

    /* renamed from: wn, reason: collision with root package name */
    protected String f41609wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.f41608ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.f41609wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (TextUtils.isEmpty(this.f41608ln) || context == null || bidLossCode == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(this.f41608ln);
        if (this.f41608ln.contains("?")) {
            sb2.append(C3191e4.i.f36527c);
        } else {
            sb2.append("?");
        }
        sb2.append("reason=");
        sb2.append(bidLossCode.getCurrentCode());
        a.a(context, (CampaignEx) null, "", sb2.toString(), false, false);
    }

    public void sendWinNotice(Context context) {
        if (TextUtils.isEmpty(this.f41609wn) || context == null) {
            return;
        }
        a.a(context, (CampaignEx) null, "", this.f41609wn, false, false);
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCur(String str) {
        this.cur = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }
}
