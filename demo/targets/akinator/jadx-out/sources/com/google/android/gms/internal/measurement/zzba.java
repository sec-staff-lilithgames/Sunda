package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzba {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzao zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        double dZzh;
        Double dValueOf = Double.valueOf(-1.0d);
        String strZzc = ",";
        double dZzh2 = 0.0d;
        zzai zzaiVar = null;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zza("toString", 0, list);
                    return new zzas(zzaeVar.zzs(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    zzae zzaeVar2 = (zzae) zzaeVar.zzt();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zzao zzaoVarZza = zzgVar.zza((zzao) it.next());
                            if (zzaoVarZza instanceof zzag) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int iZzh = zzaeVar2.zzh();
                            if (zzaoVarZza instanceof zzae) {
                                zzae zzaeVar3 = (zzae) zzaoVarZza;
                                Iterator itZzg = zzaeVar3.zzg();
                                while (itZzg.hasNext()) {
                                    Integer num = (Integer) itZzg.next();
                                    zzaeVar2.zzn(num.intValue() + iZzh, zzaeVar3.zzl(num.intValue()));
                                }
                            } else {
                                zzaeVar2.zzn(iZzh, zzaoVarZza);
                            }
                        }
                    }
                    return zzaeVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    zzh.zza("filter", 1, list);
                    zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
                    if (!(zzaoVarZza2 instanceof zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzi() == 0) {
                        return new zzae();
                    }
                    zzae zzaeVar4 = (zzae) zzaeVar.zzt();
                    zzae zzaeVarZzc = zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza2, null, Boolean.TRUE);
                    zzae zzaeVar5 = new zzae();
                    Iterator itZzg2 = zzaeVarZzc.zzg();
                    while (itZzg2.hasNext()) {
                        zzaeVar5.zzn(zzaeVar5.zzh(), zzaeVar4.zzl(((Integer) itZzg2.next()).intValue()));
                    }
                    return zzaeVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return zzb(zzaeVar, zzgVar, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new zzae();
                    }
                    int iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    if (iZzi < 0) {
                        iZzi = Math.max(0, zzaeVar.zzh() + iZzi);
                    } else if (iZzi > zzaeVar.zzh()) {
                        iZzi = zzaeVar.zzh();
                    }
                    int iZzh2 = zzaeVar.zzh();
                    zzae zzaeVar6 = new zzae();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
                        if (iMax > 0) {
                            for (int i11 = iZzi; i11 < Math.min(iZzh2, iZzi + iMax); i11++) {
                                zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(iZzi));
                                zzaeVar.zzr(iZzi);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i12 = 2; i12 < list.size(); i12++) {
                                zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(i12));
                                if (zzaoVarZza3 instanceof zzag) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                zzaeVar.zzq((iZzi + i12) - 2, zzaoVarZza3);
                            }
                        }
                    } else {
                        while (iZzi < iZzh2) {
                            zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(iZzi));
                            zzaeVar.zzn(iZzi, null);
                            iZzi++;
                        }
                    }
                    return zzaeVar6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    zzh.zza("forEach", 1, list);
                    zzao zzaoVarZza4 = zzgVar.zza((zzao) list.get(0));
                    if (!(zzaoVarZza4 instanceof zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzi() == 0) {
                        return zzao.zzf;
                    }
                    zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza4, null, null);
                    return zzao.zzf;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzc("lastIndexOf", 2, list);
                    zzao zzaoVarZza5 = zzao.zzf;
                    if (!list.isEmpty()) {
                        zzaoVarZza5 = zzgVar.zza((zzao) list.get(0));
                    }
                    int iZzh3 = zzaeVar.zzh() - 1;
                    if (list.size() > 1) {
                        zzao zzaoVarZza6 = zzgVar.zza((zzao) list.get(1));
                        dZzh = Double.isNaN(zzaoVarZza6.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zzaoVarZza6.zzd().doubleValue());
                        if (dZzh < 0.0d) {
                            dZzh += zzaeVar.zzh();
                        }
                    } else {
                        dZzh = iZzh3;
                    }
                    if (dZzh < 0.0d) {
                        return new zzah(dValueOf);
                    }
                    for (int iMin = (int) Math.min(zzaeVar.zzh(), dZzh); iMin >= 0; iMin--) {
                        if (zzaeVar.zzo(iMin) && zzh.zzf(zzaeVar.zzl(iMin), zzaoVarZza5)) {
                            return new zzah(Double.valueOf(iMin));
                        }
                    }
                    return new zzah(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        zzae zzaeVar7 = new zzae();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            zzao zzaoVarZza7 = zzgVar.zza((zzao) it2.next());
                            if (zzaoVarZza7 instanceof zzag) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            zzaeVar7.zzn(zzaeVar7.zzh(), zzaoVarZza7);
                        }
                        int iZzh4 = zzaeVar7.zzh();
                        Iterator itZzg3 = zzaeVar.zzg();
                        while (itZzg3.hasNext()) {
                            Integer num2 = (Integer) itZzg3.next();
                            zzaeVar7.zzn(num2.intValue() + iZzh4, zzaeVar.zzl(num2.intValue()));
                        }
                        zzaeVar.zzp();
                        Iterator itZzg4 = zzaeVar7.zzg();
                        while (itZzg4.hasNext()) {
                            Integer num3 = (Integer) itZzg4.next();
                            zzaeVar.zzn(num3.intValue(), zzaeVar7.zzl(num3.intValue()));
                        }
                    }
                    return new zzah(Double.valueOf(zzaeVar.zzh()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    zzh.zza("map", 1, list);
                    zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(0));
                    if (zzaoVarZza8 instanceof zzan) {
                        return zzaeVar.zzh() == 0 ? new zzae() : zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    zzh.zza("pop", 0, list);
                    int iZzh5 = zzaeVar.zzh();
                    if (iZzh5 == 0) {
                        return zzao.zzf;
                    }
                    int i13 = iZzh5 - 1;
                    zzao zzaoVarZzl = zzaeVar.zzl(i13);
                    zzaeVar.zzr(i13);
                    return zzaoVarZzl;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    zzh.zzc("join", 1, list);
                    if (zzaeVar.zzh() == 0) {
                        return zzao.zzm;
                    }
                    if (!list.isEmpty()) {
                        zzao zzaoVarZza9 = zzgVar.zza((zzao) list.get(0));
                        strZzc = ((zzaoVarZza9 instanceof zzam) || (zzaoVarZza9 instanceof zzat)) ? "" : zzaoVarZza9.zzc();
                    }
                    return new zzas(zzaeVar.zzs(strZzc));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            zzaeVar.zzn(zzaeVar.zzh(), zzgVar.zza((zzao) it3.next()));
                        }
                    }
                    return new zzah(Double.valueOf(zzaeVar.zzh()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    zzh.zza("some", 1, list);
                    zzao zzaoVarZza10 = zzgVar.zza((zzao) list.get(0));
                    if (!(zzaoVarZza10 instanceof zzai)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzh() == 0) {
                        return zzao.zzl;
                    }
                    zzai zzaiVar2 = (zzai) zzaoVarZza10;
                    Iterator itZzg5 = zzaeVar.zzg();
                    while (itZzg5.hasNext()) {
                        int iIntValue = ((Integer) itZzg5.next()).intValue();
                        if (zzaeVar.zzo(iIntValue) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar)).zze().booleanValue()) {
                            return zzao.zzk;
                        }
                    }
                    return zzao.zzl;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    zzh.zzc("sort", 1, list);
                    if (zzaeVar.zzh() >= 2) {
                        List listZzb = zzaeVar.zzb();
                        if (!list.isEmpty()) {
                            zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(0));
                            if (!(zzaoVarZza11 instanceof zzai)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            zzaiVar = (zzai) zzaoVarZza11;
                        }
                        Collections.sort(listZzb, new zzaz(zzaiVar, zzgVar));
                        zzaeVar.zzp();
                        Iterator it4 = listZzb.iterator();
                        while (it4.hasNext()) {
                            zzaeVar.zzn(i10, (zzao) it4.next());
                            i10++;
                        }
                    }
                    return zzaeVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    zzh.zza("every", 1, list);
                    zzao zzaoVarZza12 = zzgVar.zza((zzao) list.get(0));
                    if (zzaoVarZza12 instanceof zzan) {
                        return zzaeVar.zzh() == 0 ? zzao.zzk : zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza12, Boolean.FALSE, Boolean.TRUE).zzh() != zzaeVar.zzh() ? zzao.zzl : zzao.zzk;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    zzh.zza("shift", 0, list);
                    if (zzaeVar.zzh() == 0) {
                        return zzao.zzf;
                    }
                    zzao zzaoVarZzl2 = zzaeVar.zzl(0);
                    zzaeVar.zzr(0);
                    return zzaoVarZzl2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzc("slice", 2, list);
                    if (list.isEmpty()) {
                        return zzaeVar.zzt();
                    }
                    double dZzh3 = zzaeVar.zzh();
                    double dZzi = zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    double dMax = dZzi < 0.0d ? Math.max(dZzi + dZzh3, 0.0d) : Math.min(dZzi, dZzh3);
                    if (list.size() == 2) {
                        double dZzi2 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                        dZzh3 = dZzi2 < 0.0d ? Math.max(dZzh3 + dZzi2, 0.0d) : Math.min(dZzh3, dZzi2);
                    }
                    zzae zzaeVar8 = new zzae();
                    for (int i14 = (int) dMax; i14 < dZzh3; i14++) {
                        zzaeVar8.zzn(zzaeVar8.zzh(), zzaeVar.zzl(i14));
                    }
                    return zzaeVar8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return zzb(zzaeVar, zzgVar, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    zzh.zza("reverse", 0, list);
                    int iZzh6 = zzaeVar.zzh();
                    if (iZzh6 != 0) {
                        while (i10 < iZzh6 / 2) {
                            if (zzaeVar.zzo(i10)) {
                                zzao zzaoVarZzl3 = zzaeVar.zzl(i10);
                                zzaeVar.zzn(i10, null);
                                int i15 = (iZzh6 - 1) - i10;
                                if (zzaeVar.zzo(i15)) {
                                    zzaeVar.zzn(i10, zzaeVar.zzl(i15));
                                }
                                zzaeVar.zzn(i15, zzaoVarZzl3);
                            }
                            i10++;
                        }
                    }
                    return zzaeVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzc("indexOf", 2, list);
                    zzao zzaoVarZza13 = zzao.zzf;
                    if (!list.isEmpty()) {
                        zzaoVarZza13 = zzgVar.zza((zzao) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dZzi3 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                        if (dZzi3 >= zzaeVar.zzh()) {
                            return new zzah(dValueOf);
                        }
                        dZzh2 = dZzi3 < 0.0d ? zzaeVar.zzh() + dZzi3 : dZzi3;
                    }
                    Iterator itZzg6 = zzaeVar.zzg();
                    while (itZzg6.hasNext()) {
                        int iIntValue2 = ((Integer) itZzg6.next()).intValue();
                        double d10 = iIntValue2;
                        if (d10 >= dZzh2 && zzh.zzf(zzaeVar.zzl(iIntValue2), zzaoVarZza13)) {
                            return new zzah(Double.valueOf(d10));
                        }
                    }
                    return new zzah(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzae zzc(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itZzg = zzaeVar.zzg();
        while (itZzg.hasNext()) {
            int iIntValue = ((Integer) itZzg.next()).intValue();
            if (zzaeVar.zzo(iIntValue)) {
                zzao zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzaoVarZza.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaoVarZza.zze().equals(bool2)) {
                    zzaeVar2.zzn(iIntValue, zzaoVarZza);
                }
            }
        }
        return zzaeVar2;
    }

    private static zzao zzb(zzae zzaeVar, zzg zzgVar, List list, boolean z10) {
        zzao zzaoVarZza;
        zzh.zzb("reduce", 1, list);
        zzh.zzc("reduce", 2, list);
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
        if (!(zzaoVarZza2 instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaoVarZza = zzgVar.zza((zzao) list.get(1));
            if (zzaoVarZza instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzh() == 0) {
                throw new IllegalStateException(QpyI.wejynld);
            }
            zzaoVarZza = null;
        }
        zzai zzaiVar = (zzai) zzaoVarZza2;
        int iZzh = zzaeVar.zzh();
        int i10 = z10 ? 0 : iZzh - 1;
        int i11 = z10 ? iZzh - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (zzaoVarZza == null) {
            zzaoVarZza = zzaeVar.zzl(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (zzaeVar.zzo(i10)) {
                zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaoVarZza, zzaeVar.zzl(i10), new zzah(Double.valueOf(i10)), zzaeVar));
                if (zzaoVarZza instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return zzaoVarZza;
    }
}
