package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzdvn;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzgus;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaxa zzc;
    private final zzfgr zzd;
    private final int zze;
    private final zzdvn zzf;
    private final boolean zzg;
    private final zzgus zzh = zzcbv.zzf;
    private final zzfng zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    public TaggingLibraryJsInterface(WebView webView, zzaxa zzaxaVar, zzdvn zzdvnVar, zzfng zzfngVar, zzfgr zzfgrVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaxaVar;
        this.zzf = zzdvnVar;
        zzbeu.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkD)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkE)).booleanValue();
        this.zzi = zzfngVar;
        this.zzd = zzfgrVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (!this.zzg) {
                return strZzg;
            }
            zzaa.zze(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzg;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            String strL = o2.l(i10, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i10).length() + 51));
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strL);
            return "";
        }
        try {
            return (String) zzcbv.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbp zzbpVar = new zzbp(this, string);
        if (((Boolean) zzbgz.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbpVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkG)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(bundle, zzbpVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbpVar);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (!this.zzg) {
                return strZzj;
            }
            zzaa.zze(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzj;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            String strL = o2.l(i10, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i10).length() + 50));
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strL);
            return "";
        }
        try {
            return (String) zzcbv.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkI)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("x");
            int i12 = jSONObject.getInt("y");
            int i13 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            if (i14 != 0) {
                i10 = 1;
                if (i14 != 1) {
                    i10 = 2;
                    if (i14 != 2) {
                        i10 = 3;
                        if (i14 != 3) {
                            i10 = -1;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            try {
                this.zzc.zzc(MotionEvent.obtain(0L, i13, i10, i11, i12, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e10) {
                e = e10;
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e11) {
                e = e11;
                int i152 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e12) {
            e = e12;
        }
    }

    public final /* synthetic */ void zza(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        CookieManager cookieManagerZza = zzzVarZzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzb(String str) {
        zzfgr zzfgrVar;
        Uri uriZzd = Uri.parse(str);
        try {
            uriZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmY)).booleanValue() || (zzfgrVar = this.zzd) == null) ? this.zzc.zzd(uriZzd, this.zza, this.zzb, null) : zzfgrVar.zza(uriZzd, this.zza, this.zzb, null);
        } catch (zzaxb e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(uriZzd.toString(), null, null, null);
    }

    public final /* synthetic */ WebView zzc() {
        return this.zzb;
    }

    public final /* synthetic */ zzgus zzd() {
        return this.zzh;
    }

    public final /* synthetic */ zzf zze() {
        return this.zzk;
    }

    public final /* synthetic */ zzj zzf() {
        return this.zzl;
    }
}
