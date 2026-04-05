package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcaw;
import com.ironsource.mediationsdk.l;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzay {
    private final String zza;
    private final String zzb;
    private final zzcaw zzc;

    public /* synthetic */ zzay(zzax zzaxVar, byte[] bArr) {
        this.zza = zzaxVar.zzd();
        this.zzb = zzaxVar.zze();
        this.zzc = zzaxVar.zzf();
    }

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final zzbdz.zza.EnumC0159zza zzc() {
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return zzbdz.zza.EnumC0159zza.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return zzbdz.zza.EnumC0159zza.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return zzbdz.zza.EnumC0159zza.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals(l.f37554a)) {
                    return zzbdz.zza.EnumC0159zza.zzb;
                }
                break;
        }
        return zzbdz.zza.EnumC0159zza.AD_INITIATER_UNSPECIFIED;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final zzcaw zze() {
        return this.zzc;
    }
}
