package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.e;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdum implements zzddq, com.google.android.gms.ads.internal.client.zza, zzczi, zzcys, zzdbj {
    private final Context zzc;
    private final zzfhg zzd;
    private final zzdvi zze;
    private final zzfgf zzf;
    private final zzffu zzg;
    private final zzefy zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhp)).booleanValue();

    public zzdum(Context context, zzfhg zzfhgVar, zzdvi zzdviVar, zzfgf zzfgfVar, zzffu zzffuVar, zzefy zzefyVar, String str) {
        this.zzc = context;
        this.zzd = zzfhgVar;
        this.zze = zzdviVar;
        this.zzf = zzfgfVar;
        this.zzg = zzffuVar;
        this.zzh = zzefyVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strZzt;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbK);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        strZzt = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzt != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzt);
                        } catch (RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdvh zzg(String str) {
        zzfgf zzfgfVar = this.zzf;
        zzfge zzfgeVar = zzfgfVar.zzb;
        zzdvh zzdvhVarZza = this.zze.zza();
        zzdvhVarZza.zza(zzfgeVar.zzb);
        zzffu zzffuVar = this.zzg;
        zzdvhVarZza.zzb(zzffuVar);
        zzdvhVarZza.zzc("action", str);
        zzdvhVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzffuVar.zzt;
        if (!list.isEmpty()) {
            zzdvhVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzffuVar.zzb()) {
            zzdvhVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : e.ONLINE_EXTRAS_KEY);
            zzdvhVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzdvhVarZza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhw)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzfgfVar);
            zzdvhVarZza.zzc("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfgfVar.zza.zza.zzd;
                zzdvhVarZza.zzc("ragent", zzmVar.zzp);
                zzdvhVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdvhVarZza;
    }

    private final void zzi(zzdvh zzdvhVar) {
        if (!this.zzg.zzb()) {
            zzdvhVar.zzd();
            return;
        }
        this.zzh.zze(new zzega(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdvhVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i10 = this.zzg.zzb;
        return i10 == 2 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdvh zzdvhVarZzg = zzg("ifts");
            zzdvhVarZzg.zzc("reason", Q6.F1);
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i10 >= 0) {
                zzdvhVarZzg.zzc("arec", String.valueOf(i10));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdvhVarZzg.zzc("areec", strZza);
            }
            zzdvhVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final void zzd(zzdjk zzdjkVar) {
        if (this.zzl) {
            zzdvh zzdvhVarZzg = zzg("ifts");
            zzdvhVarZzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdjkVar.getMessage())) {
                zzdvhVarZzg.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdjkVar.getMessage());
            }
            zzdvhVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdL() {
        if (zzf()) {
            zzdvh zzdvhVarZzg = zzg("adapter_impression");
            zzdvhVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdvhVarZzg.zzc("po", "1");
                zzdvhVarZzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzdvhVarZzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzov)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdvhVarZzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) ? "1" : "0");
                zzdvhVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzow)).booleanValue() && zzj()) {
                zzdvhVarZzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzdvhVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdM() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        if (zzf() || this.zzg.zzb()) {
            zzdvh zzdvhVarZzg = zzg("impression");
            zzdvhVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdvhVarZzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzov)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdvhVarZzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) ? "1" : "0");
                zzdvhVarZzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzdvhVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final void zze() {
        if (this.zzl) {
            zzdvh zzdvhVarZzg = zzg("ifts");
            zzdvhVarZzg.zzc("reason", "blocked");
            zzdvhVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdvh zzdvhVarZzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzov)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc));
                zzdvhVarZzg.zzc(DownloadService.KEY_FOREGROUND, true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzow)).booleanValue() && zzj()) {
                zzdvhVarZzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzdvhVarZzg.zzd();
        }
    }
}
