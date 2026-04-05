package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbbs implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbbk zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbbu zze;

    public zzbbs(zzbbu zzbbuVar, final zzbbk zzbbkVar, final WebView webView, final boolean z10) {
        this.zzb = zzbbkVar;
        this.zzc = webView;
        this.zzd = z10;
        Objects.requireNonNull(zzbbuVar);
        this.zze = zzbbuVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbbr
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbbkVar, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
