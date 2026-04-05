package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.y;
import androidx.browser.customtabs.z;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeix implements zzehk {
    private final Context zza;
    private final zzdjd zzb;
    private final Executor zzc;
    private final zzfft zzd;
    private final zzdvi zze;

    public zzeix(Context context, Executor executor, zzdjd zzdjdVar, zzfft zzfftVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzb = zzdjdVar;
        this.zzc = executor;
        this.zzd = zzfftVar;
        this.zze = zzdviVar;
    }

    private static String zze(zzffu zzffuVar) {
        try {
            return zzffuVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final boolean zza(zzfgf zzfgfVar, zzffu zzffuVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbfv.zza(context) && !TextUtils.isEmpty(zze(zzffuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final n1 zzb(final zzfgf zzfgfVar, final zzffu zzffuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoe)).booleanValue()) {
            zzdvh zzdvhVarZza = this.zze.zza();
            zzdvhVarZza.zzc("action", "cstm_tbs_rndr");
            zzdvhVarZza.zzd();
        }
        String strZze = zze(zzffuVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzffx zzffxVar = zzfgfVar.zzb.zzb;
        return zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(uri, zzfgfVar, zzffuVar, zzffxVar, obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ n1 zzc(Uri uri, zzfgf zzfgfVar, zzffu zzffuVar, zzffx zzffxVar, Object obj) {
        try {
            z zVarBuild = new y().build();
            zVarBuild.f5302a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(zVarBuild.f5302a, null);
            zzcca zzccaVar = new zzcca();
            zzdhx zzdhxVarZzd = this.zzb.zzd(new zzcue(zzfgfVar, zzffuVar, null), new zzdia(new zzeiv(this, zzccaVar, zzffuVar), null));
            zzccaVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdhxVarZzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzffxVar.zzb));
            this.zzd.zzd();
            return zzgui.zza(zzdhxVarZzd.zzh());
        } catch (Throwable th2) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }

    public final /* synthetic */ zzdvi zzd() {
        return this.zze;
    }
}
