package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcbk {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzcbk(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzk = zzgVar;
    }

    private final void zzi() {
        if (((Boolean) zzbhb.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i10;
        synchronized (this.zzj) {
            i10 = this.zzi;
        }
        return i10;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar, long j10) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzk;
                long jZzm = zzgVar.zzm();
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzb == -1) {
                    if (jCurrentTimeMillis - jZzm > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbm)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = zzgVar.zzo();
                    }
                    this.zzb = j10;
                    this.zza = j10;
                } else {
                    this.zza = j10;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzef)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i10 = this.zzd + 1;
                    this.zzd = i10;
                    if (i10 == 0) {
                        this.zze = 0L;
                        zzgVar.zzp(jCurrentTimeMillis);
                    } else {
                        this.zze = jCurrentTimeMillis - zzgVar.zzq();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg() {
        zzi();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzk.zzx()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzbxt.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
                boolean z10 = false;
                if (identifier == 0) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z10 = true;
                        } else {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z10);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }
}
