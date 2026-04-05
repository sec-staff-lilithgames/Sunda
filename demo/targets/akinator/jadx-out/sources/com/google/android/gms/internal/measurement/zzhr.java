package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhr extends zzmb implements zznn {
    private zzhr() {
        throw null;
    }

    public final List zza() {
        return Collections.unmodifiableList(((zzhs) this.zza).zza());
    }

    public final int zzb() {
        return ((zzhs) this.zza).zzb();
    }

    public final zzhw zzc(int i10) {
        return ((zzhs) this.zza).zzc(i10);
    }

    public final zzhr zzd(int i10, zzhw zzhwVar) {
        zzaX();
        ((zzhs) this.zza).zzm(i10, zzhwVar);
        return this;
    }

    public final zzhr zze(int i10, zzhv zzhvVar) {
        zzaX();
        ((zzhs) this.zza).zzm(i10, (zzhw) zzhvVar.zzbc());
        return this;
    }

    public final zzhr zzf(zzhw zzhwVar) {
        zzaX();
        ((zzhs) this.zza).zzn(zzhwVar);
        return this;
    }

    public final zzhr zzg(zzhv zzhvVar) {
        zzaX();
        ((zzhs) this.zza).zzn((zzhw) zzhvVar.zzbc());
        return this;
    }

    public final zzhr zzh(Iterable iterable) {
        zzaX();
        ((zzhs) this.zza).zzo(iterable);
        return this;
    }

    public final zzhr zzi() {
        zzaX();
        ((zzhs) this.zza).zzp();
        return this;
    }

    public final zzhr zzj(int i10) {
        zzaX();
        ((zzhs) this.zza).zzq(i10);
        return this;
    }

    public final String zzk() {
        return ((zzhs) this.zza).zzd();
    }

    public final zzhr zzl(String str) {
        zzaX();
        ((zzhs) this.zza).zzr(str);
        return this;
    }

    public final boolean zzm() {
        return ((zzhs) this.zza).zze();
    }

    public final long zzn() {
        return ((zzhs) this.zza).zzf();
    }

    public final zzhr zzo(long j10) {
        zzaX();
        ((zzhs) this.zza).zzs(j10);
        return this;
    }

    public final long zzp() {
        return ((zzhs) this.zza).zzh();
    }

    public final zzhr zzq(long j10) {
        zzaX();
        ((zzhs) this.zza).zzt(j10);
        return this;
    }

    public final zzhr zzr(long j10) {
        zzaX();
        ((zzhs) this.zza).zzu(j10);
        return this;
    }

    public /* synthetic */ zzhr(byte[] bArr) {
        super(zzhs.zzj);
    }
}
