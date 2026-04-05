package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqm extends zzfqi {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfqm(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfqi
    public final void zza() {
        WebView webView = new WebView(zzfpx.zza().zzb());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfqk(this));
        zzc(this.zza);
        zzfpz.zzk(this.zza, null);
        Map map = this.zzc;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.zzb = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzfqi
    public final void zzb() {
        super.zzb();
        new Handler().postDelayed(new zzfql(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqi
    public final void zzk(zzfoy zzfoyVar, zzfow zzfowVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZze = zzfowVar.zze();
        Iterator it = mapZze.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzl(zzfoyVar, zzfowVar, jSONObject);
    }

    public final /* synthetic */ WebView zzq() {
        return this.zza;
    }
}
