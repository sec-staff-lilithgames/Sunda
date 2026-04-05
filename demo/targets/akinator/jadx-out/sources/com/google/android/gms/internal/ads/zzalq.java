package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzalq implements zzaki {
    private final zzeg zza = new zzeg();

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        zzcm zzcmVarZzr;
        zzeg zzegVar = this.zza;
        zzegVar.zzb(bArr, i11 + i10);
        zzegVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        while (zzegVar.zzd() > 0) {
            zzgmd.zzb(zzegVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzegVar.zzB() - 8;
            if (zzegVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcl zzclVarZzb = null;
                while (iZzB > 0) {
                    zzgmd.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzegVar.zzB();
                    int iZzB3 = zzegVar.zzB();
                    int i12 = iZzB - 8;
                    int i13 = iZzB2 - 8;
                    String strZzj = zzep.zzj(zzegVar.zzi(), zzegVar.zzg(), i13);
                    zzegVar.zzk(i13);
                    if (iZzB3 == 1937011815) {
                        zzclVarZzb = zzalz.zzb(strZzj);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzalz.zzc(null, strZzj.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i12 - i13;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzclVarZzb != null) {
                    zzclVarZzb.zza(charSequenceZzc);
                    zzcmVarZzr = zzclVarZzb.zzr();
                } else {
                    Pattern pattern = zzalz.zza;
                    zzaly zzalyVar = new zzaly();
                    zzalyVar.zzc = charSequenceZzc;
                    zzcmVarZzr = zzalyVar.zza().zzr();
                }
                arrayList.add(zzcmVarZzr);
            } else {
                zzegVar.zzk(iZzB);
            }
        }
        zzdgVar.zza(new zzaka(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
