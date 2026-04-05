package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.b8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.internal.protos.Sdk;
import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f16420a;

    /* renamed from: b, reason: collision with root package name */
    private View f16421b;

    /* renamed from: c, reason: collision with root package name */
    private int f16422c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i10, Context context) {
        View view = new View(context.getApplicationContext());
        this.f16421b = view;
        view.setBackgroundColor(0);
        addView(this.f16421b);
        this.f16421b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f16422c = getVisibility();
        this.f16420a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f16421b, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f16420a.logApiCall("destroy()");
        this.f16420a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f16420a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f16420a.getAdUnitId();
    }

    public String getPlacement() {
        this.f16420a.logApiCall("getPlacement()");
        return this.f16420a.getPlacement();
    }

    public void loadAd() {
        this.f16420a.logApiCall("loadAd()");
        this.f16420a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        this.f16420a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f16420a != null && b8.a(this.f16422c, i10)) {
            this.f16420a.onWindowVisibilityChanged(i10);
        }
        this.f16422c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f16420a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f16420a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f16420a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f16421b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f16420a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f16420a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f16421b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f16420a.logApiCall("setCustomData(value=" + str + ")");
        this.f16420a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f16420a.logApiCall(g.l("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f16420a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f16420a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f16420a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f16420a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f16420a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f16420a.logApiCall("setPlacement(placement=" + str + ")");
        this.f16420a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f16420a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f16420a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f16420a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f16420a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f16420a.logApiCall("startAutoRefresh()");
        this.f16420a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f16420a.logApiCall("stopAutoRefresh()");
        this.f16420a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f16420a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, s.a(k.o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i10);
        String strA = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = s.a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(strA, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, s.a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        a(str, maxAdFormat, null, 49, context);
    }
}
