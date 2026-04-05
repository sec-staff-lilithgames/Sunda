package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlr {
    private final zzln zza;
    private final int zzb;
    private final zzln zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzlr(zzln zzlnVar, zzln zzlnVar2, int i10) {
        this.zza = zzlnVar;
        this.zzb = i10;
        this.zzc = zzlnVar2;
    }

    private final boolean zzN() {
        int i10 = this.zzd;
        return i10 == 2 || i10 == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzkp zzkpVar, zzln zzlnVar) {
        if (zzlnVar == null) {
            return true;
        }
        zzwk[] zzwkVarArr = zzkpVar.zzc;
        int i10 = this.zzb;
        zzwk zzwkVar = zzwkVarArr[i10];
        if (zzlnVar.zzda() != null) {
            if (zzlnVar.zzda() == zzwkVar) {
                if (zzwkVar != null && !zzlnVar.zzdb()) {
                    zzkpVar.zzp();
                    boolean z10 = zzkpVar.zzg.zzg;
                }
            }
            zzkp zzkpVarZzp = zzkpVar.zzp();
            return zzkpVarZzp != null && zzkpVarZzp.zzc[i10] == zzlnVar.zzda();
        }
        return true;
    }

    private final void zzQ(boolean z10) throws zzib {
        if (z10) {
            zzln zzlnVar = this.zzc;
            zzlnVar.getClass();
            zzlnVar.zzx(17, this.zza);
        } else {
            zzln zzlnVar2 = this.zza;
            zzln zzlnVar3 = this.zzc;
            zzlnVar3.getClass();
            zzlnVar2.zzx(17, zzlnVar3);
        }
    }

    private final void zzR(zzln zzlnVar, zzwk zzwkVar, zzhz zzhzVar, long j10, boolean z10) throws zzib {
        if (zzW(zzlnVar)) {
            if (zzwkVar != zzlnVar.zzda()) {
                zzS(zzlnVar, zzhzVar);
            } else if (z10) {
                zzlnVar.zzp(j10, true);
            }
        }
    }

    private final void zzS(zzln zzlnVar, zzhz zzhzVar) {
        boolean z10 = true;
        if (this.zza != zzlnVar && this.zzc != zzlnVar) {
            z10 = false;
        }
        zzgmd.zzh(z10);
        if (zzW(zzlnVar)) {
            zzhzVar.zze(zzlnVar);
            zzY(zzlnVar);
            zzlnVar.zzr();
        }
    }

    private final void zzT(boolean z10) {
        if (z10) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzln zzlnVar = this.zzc;
            zzlnVar.getClass();
            zzlnVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzln zzlnVar, zzkp zzkpVar, zzys zzysVar, zzhz zzhzVar) throws zzib {
        if (zzlnVar != null && zzW(zzlnVar)) {
            zzln zzlnVar2 = this.zza;
            boolean z10 = zzlnVar != zzlnVar2;
            if ((zzlnVar != zzlnVar2 || !zzN()) && (zzlnVar != this.zzc || !zzO())) {
                zzwk zzwkVarZzda = zzlnVar.zzda();
                zzwk[] zzwkVarArr = zzkpVar.zzc;
                int i10 = this.zzb;
                zzwk zzwkVar = zzwkVarArr[i10];
                boolean zZza = zzysVar.zza(i10);
                if (zZza && zzwkVarZzda == zzwkVar) {
                    return 1;
                }
                if (!zzlnVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzysVar.zzc[i10]);
                    zzwk zzwkVar2 = zzwkVarArr[i10];
                    zzwkVar2.getClass();
                    zzlnVar.zzcZ(zzvVarArrZzV, zzwkVar2, zzkpVar.zzc(), zzkpVar.zza(), zzkpVar.zzg.zza);
                    return 3;
                }
                if (!zzlnVar.zzZ()) {
                    return 0;
                }
                zzS(zzlnVar, zzhzVar);
                if (!zZza || zzc()) {
                    zzT(!z10);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzyk zzykVar) {
        int iZze = zzykVar != null ? zzykVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i10 = 0; i10 < iZze; i10++) {
            zzykVar.getClass();
            zzvVarArr[i10] = zzykVar.zzb(i10);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzln zzlnVar) {
        return zzlnVar.zze() != 0;
    }

    private final zzln zzX(zzkp zzkpVar) {
        if (zzkpVar != null) {
            int i10 = this.zzb;
            zzwk[] zzwkVarArr = zzkpVar.zzc;
            if (zzwkVarArr[i10] != null) {
                zzln zzlnVar = this.zza;
                zzwk zzwkVarZzda = zzlnVar.zzda();
                zzwk zzwkVar = zzwkVarArr[i10];
                if (zzwkVarZzda == zzwkVar) {
                    return zzlnVar;
                }
                zzln zzlnVar2 = this.zzc;
                if (zzlnVar2 != null && zzlnVar2.zzda() == zzwkVar) {
                    return zzlnVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzln zzlnVar) {
        if (zzlnVar.zze() == 2) {
            zzlnVar.zzq();
        }
    }

    private static final void zzZ(zzln zzlnVar, long j10) {
        zzlnVar.zzl();
        if (zzlnVar instanceof zzwz) {
            throw null;
        }
    }

    public final void zzA(zzhz zzhzVar) throws zzib {
        zzS(this.zza, zzhzVar);
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            boolean z10 = zzW(zzlnVar) && this.zzd != 3;
            zzS(zzlnVar, zzhzVar);
            zzT(false);
            if (z10) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzib {
        int i10 = this.zzd;
        if (i10 == 3 || i10 == 4) {
            zzQ(i10 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zzhz zzhzVar) {
        boolean z10;
        zzln zzlnVar;
        if (zzc()) {
            int i10 = this.zzd;
            if (i10 == 4) {
                z10 = true;
            } else if (i10 == 2) {
                i10 = 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zzlnVar = this.zza;
            } else {
                zzlnVar = this.zzc;
                zzlnVar.getClass();
            }
            zzS(zzlnVar, zzhzVar);
            zzT(z10);
            this.zzd = i10 == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzwk zzwkVar, zzhz zzhzVar, long j10, boolean z10) throws zzib {
        zzR(this.zza, zzwkVar, zzhzVar, j10, z10);
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            zzR(zzlnVar, zzwkVar, zzhzVar, j10, z10);
        }
    }

    public final void zzE(zzkp zzkpVar, long j10, boolean z10) throws zzib {
        zzln zzlnVarZzX = zzX(zzkpVar);
        if (zzlnVarZzX != null) {
            zzlnVarZzX.zzp(j10, z10);
        }
    }

    public final boolean zzF(zzkp zzkpVar, long j10) {
        zzln zzlnVarZzX = zzX(zzkpVar);
        return zzlnVarZzX != null && zzlnVarZzX.zzU(j10);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzln zzlnVar = this.zzc;
        if (zzlnVar == null || zzW(zzlnVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzkp zzkpVar, zzys zzysVar, zzhz zzhzVar) throws zzib {
        int iZzU = zzU(this.zza, zzkpVar, zzysVar, zzhzVar);
        return iZzU == 1 ? zzU(this.zzc, zzkpVar, zzysVar, zzhzVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            zzlnVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zzib {
        if (zze() != 2) {
            return;
        }
        int i10 = this.zzd;
        if (i10 != 4 && i10 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzln zzlnVar = this.zzc;
        zzlnVar.getClass();
        zzlnVar.zzx(1, obj);
    }

    public final void zzK(zzaax zzaaxVar) throws zzib {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzaaxVar);
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            zzlnVar.zzx(7, zzaaxVar);
        }
    }

    public final void zzL(float f10) throws zzib {
        if (zze() != 1) {
            return;
        }
        zzln zzlnVar = this.zza;
        Float fValueOf = Float.valueOf(f10);
        zzlnVar.zzx(2, fValueOf);
        zzln zzlnVar2 = this.zzc;
        if (zzlnVar2 != null) {
            zzlnVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzM() {
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return zzW(this.zza);
        }
        zzln zzlnVar = this.zzc;
        zzlnVar.getClass();
        return zzW(zzlnVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i10;
        zzgmd.zzh(!zzc());
        if (zzW(this.zza)) {
            i10 = 3;
        } else {
            zzln zzlnVar = this.zzc;
            i10 = (zzlnVar == null || !zzW(zzlnVar)) ? 2 : 4;
        }
        this.zzd = i10;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzln zzlnVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i10 = 0;
        if (zzlnVar != null && zzW(zzlnVar)) {
            i10 = 1;
        }
        return (zZzW ? 1 : 0) + i10;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzkp zzkpVar) {
        zzln zzlnVarZzX = zzX(zzkpVar);
        Objects.requireNonNull(zzlnVarZzX);
        return zzlnVarZzX.zzk();
    }

    public final boolean zzg(zzkp zzkpVar) {
        zzln zzlnVarZzX = zzX(zzkpVar);
        zzlnVarZzX.getClass();
        return zzlnVarZzX.zzdb();
    }

    public final void zzh(zzkp zzkpVar, long j10) {
        zzln zzlnVarZzX = zzX(zzkpVar);
        zzlnVarZzX.getClass();
        zzZ(zzlnVarZzX, j10);
    }

    public final void zzi(zzys zzysVar, zzys zzysVar2, long j10) {
        int i10;
        int i11 = this.zzb;
        boolean zZza = zzysVar.zza(i11);
        boolean zZza2 = zzysVar2.zza(i11);
        zzln zzlnVar = this.zzc;
        if (zzlnVar == null || (i10 = this.zzd) == 3 || (i10 == 0 && zzW(this.zza))) {
            zzlnVar = this.zza;
        }
        if (!zZza || zzlnVar.zzm()) {
            return;
        }
        zze();
        zzlq zzlqVar = zzysVar.zzb[i11];
        zzlq zzlqVar2 = zzysVar2.zzb[i11];
        if (zZza2 && Objects.equals(zzlqVar2, zzlqVar) && !zzc()) {
            return;
        }
        zzZ(zzlnVar, j10);
    }

    public final void zzj(long j10) {
        int i10;
        zzln zzlnVar = this.zza;
        if (zzW(zzlnVar) && (i10 = this.zzd) != 4 && i10 != 2) {
            zzZ(zzlnVar, j10);
        }
        zzln zzlnVar2 = this.zzc;
        if (zzlnVar2 == null || !zzW(zzlnVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzlnVar2, j10);
    }

    public final long zzk(long j10, long j11) {
        zzln zzlnVar = this.zza;
        long jZzT = zzW(zzlnVar) ? zzlnVar.zzT(j10, j11) : Long.MAX_VALUE;
        zzln zzlnVar2 = this.zzc;
        return (zzlnVar2 == null || !zzW(zzlnVar2)) ? jZzT : Math.min(jZzT, zzlnVar2.zzT(j10, j11));
    }

    public final void zzl() {
        zzln zzlnVar = this.zza;
        if (zzW(zzlnVar)) {
            zzlnVar.zzW();
            return;
        }
        zzln zzlnVar2 = this.zzc;
        if (zzlnVar2 == null || !zzW(zzlnVar2)) {
            return;
        }
        zzlnVar2.zzW();
    }

    public final void zzm(float f10, float f11) throws zzib {
        this.zza.zzV(f10, f11);
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            zzlnVar.zzV(f10, f11);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            zzlnVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzln zzlnVar = this.zza;
        boolean zZzZ = zzW(zzlnVar) ? zzlnVar.zzZ() : true;
        zzln zzlnVar2 = this.zzc;
        return (zzlnVar2 == null || !zzW(zzlnVar2)) ? zZzZ : zZzZ & zzlnVar2.zzZ();
    }

    public final boolean zzp(zzkp zzkpVar) {
        return zzX(zzkpVar) != null;
    }

    public final boolean zzq(zzkp zzkpVar) {
        return (zzN() && zzX(zzkpVar) == this.zza) || (zzO() && zzX(zzkpVar) == this.zzc);
    }

    public final boolean zzr(zzkp zzkpVar) {
        return zzP(zzkpVar, this.zza) && zzP(zzkpVar, this.zzc);
    }

    public final void zzs(long j10, long j11) throws zzib {
        zzln zzlnVar = this.zza;
        if (zzW(zzlnVar)) {
            zzlnVar.zzX(j10, j11);
        }
        zzln zzlnVar2 = this.zzc;
        if (zzlnVar2 == null || !zzW(zzlnVar2)) {
            return;
        }
        zzlnVar2.zzX(j10, j11);
    }

    public final boolean zzt(zzkp zzkpVar) {
        zzln zzlnVarZzX = zzX(zzkpVar);
        return zzlnVarZzX == null || zzlnVarZzX.zzdb() || zzlnVarZzX.zzY() || zzlnVarZzX.zzZ();
    }

    public final void zzu(zzkp zzkpVar) throws IOException {
        zzln zzlnVarZzX = zzX(zzkpVar);
        zzlnVarZzX.getClass();
        zzlnVarZzX.zzn();
    }

    public final void zzv() throws zzib {
        zzln zzlnVar = this.zza;
        if (zzlnVar.zze() == 1 && this.zzd != 4) {
            zzlnVar.zzcY();
            return;
        }
        zzln zzlnVar2 = this.zzc;
        if (zzlnVar2 == null || zzlnVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzlnVar2.zzcY();
    }

    public final void zzw() {
        zzln zzlnVar = this.zza;
        if (zzW(zzlnVar)) {
            zzY(zzlnVar);
        }
        zzln zzlnVar2 = this.zzc;
        if (zzlnVar2 == null || !zzW(zzlnVar2)) {
            return;
        }
        zzY(zzlnVar2);
    }

    public final void zzx(zzlq zzlqVar, zzyk zzykVar, zzwk zzwkVar, long j10, boolean z10, boolean z11, long j11, long j12, zzuu zzuuVar, zzhz zzhzVar) throws zzib {
        zzv[] zzvVarArrZzV = zzV(zzykVar);
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.zze = true;
            zzln zzlnVar = this.zza;
            zzlnVar.zzf(zzlqVar, zzvVarArrZzV, zzwkVar, j10, z10, z11, j11, j12, zzuuVar);
            zzhzVar.zzd(zzlnVar);
            return;
        }
        this.zzf = true;
        zzln zzlnVar2 = this.zzc;
        zzlnVar2.getClass();
        zzlnVar2.zzf(zzlqVar, zzvVarArrZzV, zzwkVar, j10, z10, z11, j11, j12, zzuuVar);
        zzhzVar.zzd(zzlnVar2);
    }

    public final void zzy(int i10, Object obj, zzkp zzkpVar) throws zzib {
        zzln zzlnVarZzX = zzX(zzkpVar);
        zzlnVarZzX.getClass();
        zzlnVarZzX.zzx(11, obj);
    }

    public final void zzz(zzlu zzluVar) throws zzib {
        this.zza.zzx(18, zzluVar);
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null) {
            zzlnVar.zzx(18, zzluVar);
        }
    }
}
