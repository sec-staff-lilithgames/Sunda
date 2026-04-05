package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzakc {
    public static void zza(zzakd zzakdVar, zzakh zzakhVar, zzdg zzdgVar) {
        for (int i10 = 0; i10 < zzakdVar.zza(); i10++) {
            long jZzb = zzakdVar.zzb(i10);
            List listZzc = zzakdVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == zzakdVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzakdVar.zzb(i10 + 1) - zzakdVar.zzb(i10);
                if (jZzb2 > 0) {
                    zzdgVar.zza(new zzaka(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
