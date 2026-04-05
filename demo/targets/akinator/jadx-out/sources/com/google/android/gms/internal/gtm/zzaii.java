package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaii extends zzacc implements zzadm {
    private static final zzaii zzd;
    private byte zze = 2;

    static {
        zzaii zzaiiVar = new zzaii();
        zzd = zzaiiVar;
        zzacf.zzao(zzaii.class, zzaiiVar);
    }

    private zzaii() {
    }

    public static zzaii zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        zzaih zzaihVar = null;
        if (i11 == 2) {
            return zzacf.zzal(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new zzaii();
        }
        if (i11 == 4) {
            return new zzaig(zzaihVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
