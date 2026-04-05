package com.google.android.gms.internal.measurement;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.zza.add(zzbk.ASSIGN);
        this.zza.add(zzbk.CONST);
        this.zza.add(zzbk.CREATE_ARRAY);
        this.zza.add(zzbk.CREATE_OBJECT);
        this.zza.add(zzbk.EXPRESSION_LIST);
        this.zza.add(zzbk.GET);
        this.zza.add(zzbk.GET_INDEX);
        this.zza.add(zzbk.GET_PROPERTY);
        this.zza.add(zzbk.NULL);
        this.zza.add(zzbk.SET_PROPERTY);
        this.zza.add(zzbk.TYPEOF);
        this.zza.add(zzbk.UNDEFINED);
        this.zza.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        String str2;
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            zzao zzaoVarZza = zzgVar.zza((zzao) a.l(zzbk.ASSIGN, 2, list, 0));
            if (!(zzaoVarZza instanceof zzas)) {
                throw new IllegalArgumentException(b.k("Expected string for assign var. got ", zzaoVarZza.getClass().getCanonicalName()));
            }
            if (!zzgVar.zzd(zzaoVarZza.zzc())) {
                throw new IllegalArgumentException(b.k("Attempting to assign undefined value ", zzaoVarZza.zzc()));
            }
            zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
            zzgVar.zze(zzaoVarZza.zzc(), zzaoVarZza2);
            return zzaoVarZza2;
        }
        if (iOrdinal == 14) {
            zzh.zzb(zzbk.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(b.e(list.size(), "CONST requires an even number of arguments, found "));
            }
            while (i10 < list.size() - 1) {
                zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(i10));
                if (!(zzaoVarZza3 instanceof zzas)) {
                    throw new IllegalArgumentException(b.k("Expected string for const name. got ", zzaoVarZza3.getClass().getCanonicalName()));
                }
                zzgVar.zzg(zzaoVarZza3.zzc(), zzgVar.zza((zzao) list.get(i10 + 1)));
                i10 += 2;
            }
            return zzao.zzf;
        }
        if (iOrdinal == 24) {
            zzh.zzb(zzbk.EXPRESSION_LIST.name(), 1, list);
            zzao zzaoVarZza4 = zzao.zzf;
            while (i10 < list.size()) {
                zzaoVarZza4 = zzgVar.zza((zzao) list.get(i10));
                if (zzaoVarZza4 instanceof zzag) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return zzaoVarZza4;
        }
        if (iOrdinal == 33) {
            zzao zzaoVarZza5 = zzgVar.zza((zzao) a.l(zzbk.GET, 1, list, 0));
            if (zzaoVarZza5 instanceof zzas) {
                return zzgVar.zzh(zzaoVarZza5.zzc());
            }
            throw new IllegalArgumentException(b.k("Expected string for get var. got ", zzaoVarZza5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            zzh.zza(zzbk.NULL.name(), 0, list);
            return zzao.zzg;
        }
        if (iOrdinal == 58) {
            zzao zzaoVarZza6 = zzgVar.zza((zzao) a.l(zzbk.SET_PROPERTY, 3, list, 0));
            zzao zzaoVarZza7 = zzgVar.zza((zzao) list.get(1));
            zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(2));
            if (zzaoVarZza6 == zzao.zzf || zzaoVarZza6 == zzao.zzg) {
                throw new IllegalStateException(b.m("Can't set property ", zzaoVarZza7.zzc(), " of ", zzaoVarZza6.zzc()));
            }
            if ((zzaoVarZza6 instanceof zzae) && (zzaoVarZza7 instanceof zzah)) {
                ((zzae) zzaoVarZza6).zzn(zzaoVarZza7.zzd().intValue(), zzaoVarZza8);
                return zzaoVarZza8;
            }
            if (!(zzaoVarZza6 instanceof zzak)) {
                return zzaoVarZza8;
            }
            ((zzak) zzaoVarZza6).zzm(zzaoVarZza7.zzc(), zzaoVarZza8);
            return zzaoVarZza8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzao zzaoVarZza9 = zzgVar.zza((zzao) it.next());
                if (zzaoVarZza9 instanceof zzag) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                zzaeVar.zzn(i10, zzaoVarZza9);
                i10++;
            }
            return zzaeVar;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new zzal();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(b.e(list.size(), "CREATE_OBJECT requires an even number of arguments, found "));
            }
            zzal zzalVar = new zzal();
            while (i10 < list.size() - 1) {
                zzao zzaoVarZza10 = zzgVar.zza((zzao) list.get(i10));
                zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(i10 + 1));
                if ((zzaoVarZza10 instanceof zzag) || (zzaoVarZza11 instanceof zzag)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                zzalVar.zzm(zzaoVarZza10.zzc(), zzaoVarZza11);
                i10 += 2;
            }
            return zzalVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            zzao zzaoVarZza12 = zzgVar.zza((zzao) a.l(zzbk.GET_PROPERTY, 2, list, 0));
            zzao zzaoVarZza13 = zzgVar.zza((zzao) list.get(1));
            if ((zzaoVarZza12 instanceof zzae) && zzh.zzd(zzaoVarZza13)) {
                return ((zzae) zzaoVarZza12).zzl(zzaoVarZza13.zzd().intValue());
            }
            if (zzaoVarZza12 instanceof zzak) {
                return ((zzak) zzaoVarZza12).zzk(zzaoVarZza13.zzc());
            }
            if (zzaoVarZza12 instanceof zzas) {
                if ("length".equals(zzaoVarZza13.zzc())) {
                    return new zzah(Double.valueOf(zzaoVarZza12.zzc().length()));
                }
                if (zzh.zzd(zzaoVarZza13) && zzaoVarZza13.zzd().doubleValue() < zzaoVarZza12.zzc().length()) {
                    return new zzas(String.valueOf(zzaoVarZza12.zzc().charAt(zzaoVarZza13.zzd().intValue())));
                }
            }
            return zzao.zzf;
        }
        switch (iOrdinal) {
            case 62:
                zzao zzaoVarZza14 = zzgVar.zza((zzao) a.l(zzbk.TYPEOF, 1, list, 0));
                if (zzaoVarZza14 instanceof zzat) {
                    str2 = AdError.UNDEFINED_DOMAIN;
                } else if (zzaoVarZza14 instanceof zzaf) {
                    str2 = "boolean";
                } else if (zzaoVarZza14 instanceof zzah) {
                    str2 = "number";
                } else if (zzaoVarZza14 instanceof zzas) {
                    str2 = "string";
                } else if (zzaoVarZza14 instanceof zzan) {
                    str2 = "function";
                } else {
                    if ((zzaoVarZza14 instanceof zzap) || (zzaoVarZza14 instanceof zzag)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzaoVarZza14));
                    }
                    str2 = "object";
                }
                return new zzas(str2);
            case 63:
                zzh.zza(zzbk.UNDEFINED.name(), 0, list);
                return zzao.zzf;
            case 64:
                zzh.zzb(zzbk.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    zzao zzaoVarZza15 = zzgVar.zza((zzao) it2.next());
                    if (!(zzaoVarZza15 instanceof zzas)) {
                        throw new IllegalArgumentException(b.k("Expected string for var name. got ", zzaoVarZza15.getClass().getCanonicalName()));
                    }
                    zzgVar.zzf(zzaoVarZza15.zzc(), zzao.zzf);
                }
                return zzao.zzf;
            default:
                return zzb(str);
        }
    }
}
