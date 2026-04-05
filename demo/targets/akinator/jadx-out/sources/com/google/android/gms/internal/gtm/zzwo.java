package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwo extends zzacf implements zzadm {
    private static final zzwo zza;
    private int zzd;
    private zzwr zze;
    private byte zzf = 2;

    static {
        zzwo zzwoVar = new zzwo();
        zza = zzwoVar;
        zzacf.zzao(zzwo.class, zzwoVar);
    }

    private zzwo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzwo();
        }
        zzwp zzwpVar = null;
        if (i11 == 4) {
            return new zzwn(zzwpVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
