package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzajj implements zzaeh {
    public final int zza;
    public final zzgsr zzb;

    public zzajj(int i10, int[] iArr) {
        this.zza = i10;
        this.zzb = iArr != null ? zzgsr.zzb(iArr) : zzgsr.zza();
    }

    public final String toString() {
        zzgsr zzgsrVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgsrVar.zzc());
        for (int i10 = 0; i10 < zzgsrVar.zzc(); i10++) {
            arrayList.add(zzep.zzx(zzgsrVar.zzd(i10)));
        }
        String strZzx = zzep.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(o2.C(strZzx.length() + 37, 1, string));
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzx);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
