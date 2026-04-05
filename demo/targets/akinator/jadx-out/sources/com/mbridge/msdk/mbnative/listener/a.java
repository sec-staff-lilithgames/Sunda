package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a implements NativeListener.NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    private NativeListener.NativeAdListener f41782a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41783b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f41784c;

    /* renamed from: d, reason: collision with root package name */
    private Context f41785d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41786e;

    public a() {
    }

    public void a(boolean z10) {
        this.f41786e = z10;
    }

    public void b() {
        this.f41783b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f41782a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f41782a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f41783b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f41782a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f41785d == null) {
                this.f41785d = c.m().d();
            }
            if (TextUtils.isEmpty(this.f41784c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f41785d, str, this.f41784c, this.f41786e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f41783b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f41782a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f41782a.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f41782a.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f41782a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }

    public void a(String str) {
        this.f41784c = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f41782a = nativeAdListener;
    }

    public boolean a() {
        return this.f41783b;
    }

    public void a(CampaignEx campaignEx, String str) {
        this.f41783b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f41782a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f41785d == null) {
                this.f41785d = c.m().d();
            }
            if (TextUtils.isEmpty(this.f41784c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f41785d, str, this.f41784c, this.f41786e, campaignEx);
        }
    }
}
