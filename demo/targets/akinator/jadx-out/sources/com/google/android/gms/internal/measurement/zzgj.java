package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgj extends zzmf implements zznn {
    private static final zzgj zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzgj zzgjVar = new zzgj();
        zzh = zzgjVar;
        zzmf.zzcp(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    public final String zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    public final int zzg() {
        return this.zzg;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgi(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }
}
