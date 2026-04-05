package com.google.android.gms.internal.ads;

import b0.e2;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzba {
    public final Object zza;
    public final int zzb;
    public final zzak zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(Object obj, int i10, zzak zzakVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i11;
        this.zzf = j10;
        this.zzg = j11;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zze;
        int length2 = String.valueOf(i11).length();
        long j10 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j10).length());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i10, i11, "mediaItem=", ", period=", sb2);
        String strI = e2.i(j10, ", pos=", sb2);
        int i12 = this.zzh;
        if (i12 == -1) {
            return strI;
        }
        long j11 = this.zzg;
        int i13 = this.zzi;
        int length3 = strI.length();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + length3 + 13 + String.valueOf(j11).length() + 10 + 5 + String.valueOf(i13).length());
        sb3.append(strI);
        sb3.append(", contentPos=");
        sb3.append(j11);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i12, i13, ", adGroup=", ", ad=", sb3);
    }
}
