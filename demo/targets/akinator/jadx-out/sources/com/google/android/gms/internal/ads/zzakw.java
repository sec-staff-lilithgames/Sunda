package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzakw implements zzaki {
    private final zzeg zza = new zzeg();
    private final zzeg zzb = new zzeg();
    private final zzakv zzc = new zzakv();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        zzeg zzegVar = this.zza;
        zzegVar.zzb(bArr, i11 + i10);
        zzegVar.zzh(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzeg zzegVar2 = this.zzb;
        if (zzep.zzM(zzegVar, zzegVar2, this.zzd)) {
            zzegVar.zzb(zzegVar2.zzi(), zzegVar2.zze());
        }
        zzakv zzakvVar = this.zzc;
        zzakvVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzegVar.zzd() >= 3) {
            int iZze = zzegVar.zze();
            int iZzs = zzegVar.zzs();
            int iZzt = zzegVar.zzt();
            int iZzg = zzegVar.zzg() + iZzt;
            zzcm zzcmVarZza = null;
            if (iZzg > iZze) {
                zzegVar.zzh(iZze);
            } else {
                if (iZzs != 128) {
                    switch (iZzs) {
                        case 20:
                            zzakvVar.zzc(zzegVar, iZzt);
                            break;
                        case 21:
                            zzakvVar.zzd(zzegVar, iZzt);
                            break;
                        case 22:
                            zzakvVar.zze(zzegVar, iZzt);
                            break;
                    }
                } else {
                    zzcmVarZza = zzakvVar.zza();
                    zzakvVar.zzb();
                }
                zzegVar.zzh(iZzg);
            }
            if (zzcmVarZza != null) {
                arrayList.add(zzcmVarZza);
            }
        }
        zzdgVar.zza(new zzaka(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
