package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zza {
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzak[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final String[] zzg;
    public final zzb[] zzh;
    public final long zzi;
    public final boolean zzj;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public zza(long j10) {
        this(0L, -1, -1, new int[0], new zzak[0], new long[0], 0L, false, new String[0], new zzb[0], false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf) && Arrays.equals(this.zzg, zzaVar.zzg) && Arrays.equals(this.zzh, zzaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzh) + ((((Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + ((Arrays.hashCode(this.zzd) + (((this.zzb * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.zzg)) * 31)) * 31;
    }

    public final int zza(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final zza zzb(int i10) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, C.TIME_UNSET);
        zzak[] zzakVarArr = (zzak[]) Arrays.copyOf(this.zzd, 0);
        String[] strArr = (String[]) Arrays.copyOf(this.zzg, 0);
        zzb[] zzbVarArr = this.zzh;
        return new zza(0L, 0, -1, iArrCopyOf, zzakVarArr, jArrCopyOf, 0L, false, strArr, (zzb[]) Arrays.copyOf(zzbVarArr, Math.max(0, zzbVarArr.length)), false);
    }

    private zza(long j10, int i10, int i11, int[] iArr, zzak[] zzakVarArr, long[] jArr, long j11, boolean z10, String[] strArr, zzb[] zzbVarArr, boolean z11) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzakVarArr.length;
        int i12 = 0;
        zzgmd.zza(length == length2);
        zzgmd.zza(length == zzbVarArr.length);
        this.zza = 0L;
        this.zzb = i10;
        this.zze = iArr;
        this.zzd = zzakVarArr;
        this.zzf = jArr;
        this.zzi = 0L;
        this.zzj = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i12 >= uriArr.length) {
                this.zzg = strArr;
                this.zzh = zzbVarArr;
                return;
            }
            zzak zzakVar = zzakVarArr[i12];
            if (zzakVar == null) {
                uri = null;
            } else {
                zzag zzagVar = zzakVar.zzb;
                zzagVar.getClass();
                uri = zzagVar.zza;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }
}
