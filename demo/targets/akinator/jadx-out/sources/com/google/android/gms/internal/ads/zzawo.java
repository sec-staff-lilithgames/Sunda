package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzawo {
    public static final String zza(Context context, String str, long j10, boolean z10) {
        try {
            zzavi zzaviVarZza = zzavj.zza();
            zzaviVarZza.zzb(str);
            zzaviVarZza.zza("0.460000000");
            zzaviVarZza.zzd(context.getPackageName());
            zzaviVarZza.zzf((System.currentTimeMillis() - j10) / 1000);
            zzaviVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzaviVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzaviVarZza.zze(-1L);
            }
            zzavp zzavpVarZzc = zzavz.zzc(((zzavj) zzaviVarZza.zzbu()).zzaN(), null);
            zzavpVarZzc.zzc(5);
            zzavpVarZzc.zzd(2);
            return Base64.encodeToString(((zzavq) zzavpVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
