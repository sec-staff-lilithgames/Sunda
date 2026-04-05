package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzz extends zzacf implements zzadm {
    private static final zzz zza;
    private int zzd;
    private zzp zzq;
    private float zzr;
    private boolean zzs;
    private int zzu;
    private byte zzv = 2;
    private zzacn zze = zzacf.zzai();
    private zzacn zzf = zzacf.zzai();
    private zzacn zzg = zzacf.zzai();
    private zzacn zzh = zzacf.zzai();
    private zzacn zzi = zzacf.zzai();
    private zzacn zzj = zzacf.zzai();
    private zzacn zzk = zzacf.zzai();
    private zzacn zzl = zzacf.zzai();
    private String zzm = "";
    private String zzn = "";
    private String zzo = "0";
    private String zzp = "";
    private zzacn zzt = zzacf.zzai();

    static {
        zzz zzzVar = new zzz();
        zza = zzzVar;
        zzacf.zzao(zzz.class, zzzVar);
    }

    private zzz() {
    }

    public static zzz zzk() {
        return zza;
    }

    public static zzz zzl(byte[] bArr, zzabq zzabqVar) throws zzacq {
        return (zzz) zzacf.zzag(zza, bArr, zzabqVar);
    }

    public final int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzv);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\t\u0005\u0001\u001a\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007\u001b\tဈ\u0000\nဈ\u0001\fဈ\u0002\rဈ\u0003\u000eဉ\u0004\u000fခ\u0005\u0010\u001a\u0011င\u0007\u0012ဇ\u0006\u0013\u001a", new Object[]{"zzd", "zzf", "zzg", zzap.class, "zzh", zzx.class, "zzi", zzr.class, "zzj", zzr.class, "zzk", zzr.class, "zzl", zzab.class, "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzt", "zzu", "zzs", "zze"});
        }
        if (i11 == 3) {
            return new zzz();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzy(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzv = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final int zzd() {
        return this.zzu;
    }

    public final int zze() {
        return this.zzj.size();
    }

    public final int zzf() {
        return this.zzg.size();
    }

    public final zzr zzg(int i10) {
        return (zzr) this.zzi.get(i10);
    }

    public final zzr zzh(int i10) {
        return (zzr) this.zzk.get(i10);
    }

    public final zzr zzi(int i10) {
        return (zzr) this.zzj.get(i10);
    }

    public final zzap zzm(int i10) {
        return (zzap) this.zzg.get(i10);
    }

    public final String zzn() {
        return this.zzp;
    }

    public final List zzo() {
        return this.zzf;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzl;
    }

    public final List zzr() {
        return this.zzg;
    }
}
