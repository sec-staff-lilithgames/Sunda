package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpu;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzac extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzad zzadVar, String str, int i10, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i10);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l9, Long l10, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z10) {
        zzpu.zza();
        zzic zzicVar = this.zza.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zzb, zzfy.zzaD);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.zzh;
        boolean zZze = zzfnVar.zze();
        boolean zZzf = zzfnVar.zzf();
        boolean zZzh = zzfnVar.zzh();
        Object[] objArr = zZze || zZzf || zZzh;
        Boolean boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        if (z10 && objArr != true) {
            zzicVar.zzaV().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfnVar.zzd();
        boolean zZzf2 = zzfhVarZzd.zzf();
        if (zziuVar.zzf()) {
            if (zzfhVarZzd.zzc()) {
                boolZze = zzab.zze(zzab.zzg(zziuVar.zzg(), zzfhVarZzd.zzd()), zZzf2);
            } else {
                zzicVar.zzaV().zze().zzb("No number filter for long property. property", zzicVar.zzl().zzc(zziuVar.zzc()));
            }
        } else if (zziuVar.zzj()) {
            if (zzfhVarZzd.zzc()) {
                boolZze = zzab.zze(zzab.zzh(zziuVar.zzk(), zzfhVarZzd.zzd()), zZzf2);
            } else {
                zzicVar.zzaV().zze().zzb("No number filter for double property. property", zzicVar.zzl().zzc(zziuVar.zzc()));
            }
        } else if (!zziuVar.zzd()) {
            zzicVar.zzaV().zze().zzb("User property has no value, property", zzicVar.zzl().zzc(zziuVar.zzc()));
        } else if (zzfhVarZzd.zza()) {
            boolZze = zzab.zze(zzab.zzf(zziuVar.zze(), zzfhVarZzd.zzb(), zzicVar.zzaV()), zZzf2);
        } else if (!zzfhVarZzd.zzc()) {
            zzicVar.zzaV().zze().zzb("No string or number filter defined. property", zzicVar.zzl().zzc(zziuVar.zzc()));
        } else if (zzpk.zzm(zziuVar.zze())) {
            boolZze = zzab.zze(zzab.zzi(zziuVar.zze(), zzfhVarZzd.zzd()), zZzf2);
        } else {
            zzicVar.zzaV().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzicVar.zzl().zzc(zziuVar.zzc()), zziuVar.zze());
        }
        zzicVar.zzaV().zzk().zzb("Property filter result", boolZze == null ? AbstractJsonLexerKt.NULL : boolZze);
        if (boolZze == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zZzh && !boolZze.booleanValue()) {
            return true;
        }
        if (!z10 || zzfnVar.zze()) {
            this.zze = boolZze;
        }
        if (boolZze.booleanValue() && objArr != false && zziuVar.zza()) {
            long jZzb = zziuVar.zzb();
            if (l9 != null) {
                jZzb = l9.longValue();
            }
            if (zZzp && zzfnVar.zze() && !zzfnVar.zzf() && l10 != null) {
                jZzb = l10.longValue();
            }
            if (zzfnVar.zzf()) {
                this.zzg = Long.valueOf(jZzb);
            } else {
                this.zzf = Long.valueOf(jZzb);
            }
        }
        return true;
    }
}
