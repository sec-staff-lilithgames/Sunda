package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgdo {
    private final Context zza;
    private final zzgjd zzb;
    private final zzgbk zzc;
    private final String zzd;

    public zzgdo(Context context, zzgjd zzgjdVar, zzgbk zzgbkVar, zzfxt zzfxtVar) {
        this.zza = context;
        this.zzb = zzgjdVar;
        this.zzc = zzgbkVar;
        this.zzd = zzfxtVar.zzb();
    }

    public final String zza(boolean z10, long j10) {
        String string;
        zzgjb zzgjbVarZza = this.zzb.zza(55);
        try {
            try {
                try {
                    zzgjbVarZza.zza();
                    zzavi zzaviVarZza = zzavj.zza();
                    zzaviVarZza.zzb(this.zzd);
                    zzaviVarZza.zza("0.808261137");
                    zzaviVarZza.zzd(this.zza.getPackageName());
                    zzaviVarZza.zzc(System.currentTimeMillis() / 1000);
                    zzaviVarZza.zzf((System.currentTimeMillis() - j10) / 1000);
                    try {
                        zzaviVarZza.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzaviVarZza.zze(-1L);
                    }
                    zzgbk zzgbkVar = this.zzc;
                    if (!zzgbkVar.zzc()) {
                        zzgbkVar.zza();
                    }
                    zzavp zzavpVarZzf = zzgbkVar.zzf(((zzavj) zzaviVarZza.zzbu()).zzaN(), null);
                    zzavpVarZzf.zzc(5);
                    zzavpVarZzf.zzd(2);
                    string = zzfyo.zza(((zzavq) zzavpVarZzf.zzbu()).zzaN(), true);
                } catch (UnsupportedEncodingException e10) {
                    zzgjbVarZza.zzb(e10);
                    string = Integer.toString(7);
                }
                zzgjbVarZza.zzc();
                return string;
            } catch (Throwable th2) {
                zzgjbVarZza.zzb(th2);
                throw th2;
            }
        } catch (Throwable th3) {
            zzgjbVarZza.zzc();
            throw th3;
        }
    }
}
