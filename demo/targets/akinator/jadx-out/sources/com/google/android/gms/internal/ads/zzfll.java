package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfll {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjH), str);
    }

    public static void zzb(n1 n1Var, zzflc zzflcVar) {
        if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
            zzgui.zzr(zzgua.zzw(n1Var), new zzflh(zzflcVar), zzcbv.zzg);
        }
    }

    public static zzfjx zzc(final zzflc zzflcVar) {
        return new zzfjx() { // from class: com.google.android.gms.internal.ads.zzflk
            @Override // com.google.android.gms.internal.ads.zzfjx
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
                    zzflcVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(n1 n1Var, zzflm zzflmVar, zzflc zzflcVar) {
        zzh(n1Var, zzflmVar, zzflcVar, false);
    }

    public static void zze(n1 n1Var, zzflm zzflmVar, zzflc zzflcVar) {
        zzh(n1Var, zzflmVar, zzflcVar, true);
    }

    public static void zzf(n1 n1Var, zzflm zzflmVar, zzflc zzflcVar) {
        if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
            zzgui.zzr(zzgua.zzw(n1Var), new zzflj(zzflmVar, zzflcVar), zzcbv.zzg);
        }
    }

    public static int zzg(zzfgn zzfgnVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfgnVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(n1 n1Var, zzflm zzflmVar, zzflc zzflcVar, boolean z10) {
        if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
            zzgui.zzr(zzgua.zzw(n1Var), new zzfli(zzflmVar, zzflcVar, z10), zzcbv.zzg);
        }
    }
}
