package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhwa extends zzhvz {
    @Override // com.google.android.gms.internal.ads.zzhvz
    public final void zza(Object obj) {
        ((zzhwk) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhvz
    public final void zzb(zzhzr zzhzrVar, Map.Entry entry) throws IOException {
        zzhwl zzhwlVar = (zzhwl) entry.getKey();
        if (!zzhwlVar.zzc) {
            zzhzp zzhzpVar = zzhzp.zza;
            switch (zzhwlVar.zzb.ordinal()) {
                case 0:
                    zzhzrVar.zzf(zzhwlVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzhzrVar.zze(zzhwlVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzhzrVar.zzc(zzhwlVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzhzrVar.zzh(zzhwlVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzhzrVar.zzi(zzhwlVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzhzrVar.zzj(zzhwlVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzhzrVar.zzk(zzhwlVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzhzrVar.zzl(zzhwlVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzhzrVar.zzm(zzhwlVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzhzrVar.zzs(zzhwlVar.zza, entry.getValue(), zzhyj.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzhzrVar.zzr(zzhwlVar.zza, entry.getValue(), zzhyj.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzhzrVar.zzn(zzhwlVar.zza, (zzhvi) entry.getValue());
                    break;
                case 12:
                    zzhzrVar.zzo(zzhwlVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzhzrVar.zzi(zzhwlVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzhzrVar.zzb(zzhwlVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzhzrVar.zzd(zzhwlVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzhzrVar.zzp(zzhwlVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzhzrVar.zzq(zzhwlVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhzp zzhzpVar2 = zzhzp.zza;
        switch (zzhwlVar.zzb.ordinal()) {
            case 0:
                zzhyt.zza(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 1:
                zzhyt.zzb(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 2:
                zzhyt.zzc(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 3:
                zzhyt.zzd(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 4:
                zzhyt.zzh(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 5:
                zzhyt.zzf(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 6:
                zzhyt.zzk(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 7:
                zzhyt.zzn(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 8:
                zzhyt.zzo(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhyt.zzr(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhyj.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhyt.zzq(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhyj.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzhyt.zzp(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar);
                break;
            case 12:
                zzhyt.zzi(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 13:
                zzhyt.zzh(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 14:
                zzhyt.zzl(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 15:
                zzhyt.zzg(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 16:
                zzhyt.zzj(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
            case 17:
                zzhyt.zze(zzhwlVar.zza, (List) entry.getValue(), zzhzrVar, zzhwlVar.zzd);
                break;
        }
    }
}
