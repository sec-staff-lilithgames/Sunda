package com.vungle.ads.internal.ui;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VungleWebClient f50782c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebView f50783e;

    public /* synthetic */ a(VungleWebClient vungleWebClient, WebView webView, int i10) {
        this.f50781b = i10;
        this.f50782c = vungleWebClient;
        this.f50783e = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50781b) {
            case 0:
                VungleWebClient.m3664shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f50782c, this.f50783e);
                break;
            case 1:
                VungleWebClient.m3657shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f50782c, this.f50783e);
                break;
            case 2:
                VungleWebClient.m3660shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f50782c, this.f50783e);
                break;
            case 3:
                VungleWebClient.m3661shouldOverrideUrlLoading$lambda16$lambda6(this.f50782c, this.f50783e);
                break;
            case 4:
                VungleWebClient.m3663shouldOverrideUrlLoading$lambda16$lambda8(this.f50782c, this.f50783e);
                break;
            case 5:
                VungleWebClient.m3656shouldOverrideUrlLoading$lambda16$lambda10(this.f50782c, this.f50783e);
                break;
            default:
                VungleWebClient.m3658shouldOverrideUrlLoading$lambda16$lambda11(this.f50782c, this.f50783e);
                break;
        }
    }
}
