package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfn extends zzmf implements zznn {
    private static final zzfn zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private zzfh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfn zzfnVar = new zzfn();
        zzj = zzfnVar;
        zzmf.zzcp(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    public static zzfm zzi() {
        return (zzfm) zzj.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final zzfh zzd() {
        zzfh zzfhVar = this.zzf;
        return zzfhVar == null ? zzfh.zzi() : zzfhVar;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final /* synthetic */ void zzj(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", TJzY.SLCIKrtXeAt, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzfn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfm(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }
}
