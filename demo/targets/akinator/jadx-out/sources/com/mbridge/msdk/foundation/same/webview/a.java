package com.mbridge.msdk.foundation.same.webview;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private String f41024a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f41025b;

    public a(CampaignEx campaignEx) {
        this.f41025b = campaignEx;
    }

    public void a(String str) {
        this.f41024a = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
    }
}
