package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcij {
    private final zzcii zza;
    private final zzcik zzb;

    public zzcij(zzcik zzcikVar, zzcii zzciiVar) {
        this.zza = zzciiVar;
        this.zzb = zzcikVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcik zzcikVar = this.zzb;
        zzaxa zzaxaVarZzS = ((zzcir) zzcikVar).zzS();
        if (zzaxaVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzawv zzawvVarZzb = zzaxaVarZzS.zzb();
        if (zzawvVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcikVar.getContext() != null) {
            return zzawvVarZzb.zzf(zzcikVar.getContext(), str, ((zzcit) zzcikVar).zzE(), zzcikVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcik zzcikVar = this.zzb;
        zzaxa zzaxaVarZzS = ((zzcir) zzcikVar).zzS();
        if (zzaxaVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzawv zzawvVarZzb = zzaxaVarZzS.zzb();
        if (zzawvVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcikVar.getContext() != null) {
            return zzawvVarZzb.zzj(zzcikVar.getContext(), ((zzcit) zzcikVar).zzE(), zzcikVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
