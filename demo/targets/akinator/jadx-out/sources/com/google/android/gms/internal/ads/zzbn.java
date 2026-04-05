package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgpe.zzi());
    private final zzgpe zzb;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgpe.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgpe zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        int i11 = 0;
        while (true) {
            zzgpe zzgpeVar = this.zzb;
            if (i11 >= zzgpeVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgpeVar.get(i11);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i10) {
                return true;
            }
            i11++;
        }
    }
}
