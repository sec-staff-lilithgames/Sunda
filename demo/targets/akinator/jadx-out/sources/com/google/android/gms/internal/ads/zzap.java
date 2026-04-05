package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j10, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    private static final zzao zzh(zzao zzaoVar, Class cls, zzgme zzgmeVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgmeVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return Long.hashCode(C.TIME_UNSET) + (Arrays.hashCode(this.zza) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        return a.b.o(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i10) {
        return this.zza[i10];
    }

    public final zzao zzc(Class cls, zzgme zzgmeVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgmeVar);
            if (zzaoVarZzh != null) {
                return zzaoVarZzh;
            }
        }
        return null;
    }

    public final zzgpe zzd(Class cls) {
        int i10 = zzgpe.zzd;
        zzgpb zzgpbVar = new zzgpb();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgpbVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgpbVar.zzi();
    }

    public final zzgpe zze(Class cls, zzgme zzgmeVar) {
        int i10 = zzgpe.zzd;
        zzgpb zzgpbVar = new zzgpb();
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgmeVar);
            if (zzaoVarZzh != null) {
                zzgpbVar.zzf(zzaoVarZzh);
            }
        }
        return zzgpbVar.zzi();
    }

    public final zzap zzf(zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzep.zza;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap(C.TIME_UNSET, (zzao[]) objArrCopyOf);
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }
}
