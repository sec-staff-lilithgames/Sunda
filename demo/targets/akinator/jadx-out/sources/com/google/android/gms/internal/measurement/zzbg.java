package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbg extends zzav {
    public zzbg() {
        this.zza.add(zzbk.FOR_IN);
        this.zza.add(zzbk.FOR_IN_CONST);
        this.zza.add(zzbk.FOR_IN_LET);
        this.zza.add(zzbk.FOR_LET);
        this.zza.add(zzbk.FOR_OF);
        this.zza.add(zzbk.FOR_OF_CONST);
        this.zza.add(zzbk.FOR_OF_LET);
        this.zza.add(zzbk.WHILE);
    }

    private static zzao zzc(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        return zze(zzbeVar, zzaoVar.zzf(), zzaoVar2);
    }

    private static zzao zzd(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return zze(zzbeVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static zzao zze(zzbe zzbeVar, Iterator it, zzao zzaoVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzao zzaoVarZzb = zzbeVar.zza((zzao) it.next()).zzb((zzae) zzaoVar);
                if (zzaoVarZzb instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarZzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 65) {
            zzao zzaoVar = (zzao) a.l(zzbk.WHILE, 4, list, 0);
            zzao zzaoVar2 = (zzao) list.get(1);
            zzao zzaoVar3 = (zzao) list.get(2);
            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(3));
            if (zzgVar.zza(zzaoVar3).zze().booleanValue()) {
                zzao zzaoVarZzb = zzgVar.zzb((zzae) zzaoVarZza);
                if (zzaoVarZzb instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarZzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
            }
            while (zzgVar.zza(zzaoVar).zze().booleanValue()) {
                zzao zzaoVarZzb2 = zzgVar.zzb((zzae) zzaoVarZza);
                if (zzaoVarZzb2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzaoVarZzb2;
                    if ("break".equals(zzagVar2.zzg())) {
                        return zzao.zzf;
                    }
                    if ("return".equals(zzagVar2.zzg())) {
                        return zzagVar2;
                    }
                }
                zzgVar.zza(zzaoVar2);
            }
            return zzao.zzf;
        }
        switch (iOrdinal) {
            case 26:
                if (!(a.l(zzbk.FOR_IN, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return zzc(new zzbf(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 27:
                if (!(a.l(zzbk.FOR_IN_CONST, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return zzc(new zzbc(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 28:
                if (!(a.l(zzbk.FOR_IN_LET, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return zzc(new zzbd(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 29:
                zzao zzaoVarZza2 = zzgVar.zza((zzao) a.l(zzbk.FOR_LET, 4, list, 0));
                if (!(zzaoVarZza2 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zzaoVarZza2;
                zzao zzaoVar4 = (zzao) list.get(1);
                zzao zzaoVar5 = (zzao) list.get(2);
                zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(3));
                zzg zzgVarZzc = zzgVar.zzc();
                for (int i10 = 0; i10 < zzaeVar.zzh(); i10++) {
                    String strZzc = zzaeVar.zzl(i10).zzc();
                    zzgVarZzc.zze(strZzc, zzgVar.zzh(strZzc));
                }
                while (zzgVar.zza(zzaoVar4).zze().booleanValue()) {
                    zzao zzaoVarZzb3 = zzgVar.zzb((zzae) zzaoVarZza3);
                    if (zzaoVarZzb3 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzaoVarZzb3;
                        if ("break".equals(zzagVar3.zzg())) {
                            return zzao.zzf;
                        }
                        if ("return".equals(zzagVar3.zzg())) {
                            return zzagVar3;
                        }
                    }
                    zzg zzgVarZzc2 = zzgVar.zzc();
                    for (int i11 = 0; i11 < zzaeVar.zzh(); i11++) {
                        String strZzc2 = zzaeVar.zzl(i11).zzc();
                        zzgVarZzc2.zze(strZzc2, zzgVarZzc.zzh(strZzc2));
                    }
                    zzgVarZzc2.zza(zzaoVar5);
                    zzgVarZzc = zzgVarZzc2;
                }
                return zzao.zzf;
            case 30:
                if (!(a.l(zzbk.FOR_OF, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return zzd(new zzbf(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 31:
                if (!(a.l(zzbk.FOR_OF_CONST, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return zzd(new zzbc(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 32:
                if (!(a.l(zzbk.FOR_OF_LET, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return zzd(new zzbd(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            default:
                return zzb(str);
        }
    }
}
