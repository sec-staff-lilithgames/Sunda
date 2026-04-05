package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzabs extends zzabr {
    @Override // com.google.android.gms.internal.gtm.zzabr
    public final void zza(Object obj) {
        ((zzacc) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzabr
    public final void zzb(zzadw zzadwVar, Object obj, zzabq zzabqVar, zzabv zzabvVar) throws IOException {
        zzace zzaceVar = (zzace) obj;
        zzabvVar.zzk(zzaceVar.zzd, zzadwVar.zzs(zzaceVar.zzc.getClass(), zzabqVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzabr
    public final void zzc(zzaez zzaezVar, Map.Entry entry) throws IOException {
        zzacd zzacdVar = (zzacd) entry.getKey();
        if (!zzacdVar.zzd) {
            zzaex zzaexVar = zzaex.zza;
            switch (zzacdVar.zzc.ordinal()) {
                case 0:
                    zzaezVar.zzf(zzacdVar.zzb, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzaezVar.zzo(zzacdVar.zzb, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzaezVar.zzt(zzacdVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzaezVar.zzK(zzacdVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzaezVar.zzr(zzacdVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzaezVar.zzm(zzacdVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzaezVar.zzk(zzacdVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzaezVar.zzb(zzacdVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzaezVar.zzG(zzacdVar.zzb, (String) entry.getValue());
                    break;
                case 9:
                    zzaezVar.zzq(zzacdVar.zzb, entry.getValue(), zzadt.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzaezVar.zzv(zzacdVar.zzb, entry.getValue(), zzadt.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzaezVar.zzd(zzacdVar.zzb, (zzyx) entry.getValue());
                    break;
                case 12:
                    zzaezVar.zzI(zzacdVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzaezVar.zzr(zzacdVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzaezVar.zzx(zzacdVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzaezVar.zzz(zzacdVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzaezVar.zzB(zzacdVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzaezVar.zzD(zzacdVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzaex zzaexVar2 = zzaex.zza;
        switch (zzacdVar.zzc.ordinal()) {
            case 0:
                zzadz.zzt(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 1:
                zzadz.zzx(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 2:
                zzadz.zzA(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 3:
                zzadz.zzI(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 4:
                zzadz.zzz(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 5:
                zzadz.zzw(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 6:
                zzadz.zzv(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 7:
                zzadz.zzr(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 8:
                zzadz.zzG(zzacdVar.zzb, (List) entry.getValue(), zzaezVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzadz.zzy(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, zzadt.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzadz.zzB(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, zzadt.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzadz.zzs(zzacdVar.zzb, (List) entry.getValue(), zzaezVar);
                break;
            case 12:
                zzadz.zzH(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 13:
                zzadz.zzz(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 14:
                zzadz.zzC(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 15:
                zzadz.zzD(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 16:
                zzadz.zzE(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
            case 17:
                zzadz.zzF(zzacdVar.zzb, (List) entry.getValue(), zzaezVar, false);
                break;
        }
    }
}
