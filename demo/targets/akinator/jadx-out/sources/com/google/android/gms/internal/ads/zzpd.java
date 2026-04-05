package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.ironsource.C3191e4;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzpd {
    public static final zzpd zza;
    public final int zzb;
    public final int zzc;
    private final zzgpo zzd;

    static {
        zzpd zzpdVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgpn zzgpnVar = new zzgpn();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzgpnVar.zzf(Integer.valueOf(zzep.zzB(i10)));
            }
            zzpdVar = new zzpd(2, zzgpnVar.zzi());
        } else {
            zzpdVar = new zzpd(2, 10);
        }
        zza = zzpdVar;
    }

    public zzpd(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpd)) {
            return false;
        }
        zzpd zzpdVar = (zzpd) obj;
        return this.zzb == zzpdVar.zzb && this.zzc == zzpdVar.zzc && Objects.equals(this.zzd, zzpdVar.zzd);
    }

    public final int hashCode() {
        zzgpo zzgpoVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgpoVar == null ? 0 : zzgpoVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i11).length() + 15 + strValueOf.length() + 1);
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i10, i11, "AudioProfile[format=", ", maxChannelCount=", sb2);
        return a.b.o(sb2, ", channelMasks=", strValueOf, C3191e4.i.f36531e);
    }

    public final boolean zza(int i10) {
        zzgpo zzgpoVar = this.zzd;
        if (zzgpoVar == null) {
            return i10 <= this.zzc;
        }
        int iZzB = zzep.zzB(i10);
        if (iZzB == 0) {
            return false;
        }
        return zzgpoVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i10, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzpe.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i11 = this.zzb;
        for (int i12 = 10; i12 > 0; i12--) {
            int iZzB = zzep.zzB(i12);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(iZzB).build(), zzdVar.zza())) {
                return i12;
            }
        }
        return 0;
    }

    public zzpd(int i10, Set set) {
        this.zzb = i10;
        zzgpo zzgpoVarZzo = zzgpo.zzo(set);
        this.zzd = zzgpoVarZzo;
        zzgrs it = zzgpoVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
