package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzcgy extends com.google.android.gms.ads.internal.client.zza, zzdgv, zzcgp, zzbot, zzcif, zzcik, zzbpf, zzbau, zzcio, com.google.android.gms.ads.internal.zzn, zzcir, zzcis, zzcdr, zzcit {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcdr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcdr
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcgp
    zzffu zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcit
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i10);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzciq
    zzcji zzN();

    String zzO();

    zzciw zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcir
    zzaxa zzS();

    zzfgr zzT();

    zzehf zzU();

    zzehd zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z10, int i10);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcif
    zzffx zzaC();

    void zzaD(zzffu zzffuVar, zzffx zzffxVar);

    void zzaE(boolean z10);

    n1 zzaF();

    void zzaG(boolean z10);

    boolean zzaa();

    void zzab(String str, zzblx zzblxVar);

    void zzac(String str, zzblx zzblxVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(zzcji zzcjiVar);

    void zzag(boolean z10);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z10);

    void zzak(zzehf zzehfVar);

    void zzal(zzehd zzehdVar);

    void zzam(int i10);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z10);

    void zzap();

    void zzaq(zzbhv zzbhvVar);

    zzbhv zzar();

    void zzas(boolean z10);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z10);

    void zzax(zzbhs zzbhsVar);

    void zzay(zzbch zzbchVar);

    zzbch zzaz();

    @Override // com.google.android.gms.internal.ads.zzcdr
    zzcie zzh();

    @Override // com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcdr
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzcdr
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzcdr
    zzbfh zzq();

    @Override // com.google.android.gms.internal.ads.zzcis, com.google.android.gms.internal.ads.zzcdr
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzcdr
    void zzt(String str, zzcfe zzcfeVar);

    @Override // com.google.android.gms.internal.ads.zzcdr
    void zzw(zzcie zzcieVar);
}
