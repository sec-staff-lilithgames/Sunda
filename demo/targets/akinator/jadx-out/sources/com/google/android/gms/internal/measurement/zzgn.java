package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgn extends zzmf implements zznn {
    private static final zzgn zzd;
    private zzmo zzb = zzmf.zzcv();

    static {
        zzgn zzgnVar = new zzgn();
        zzd = zzgnVar;
        zzmf.zzcp(zzgn.class, zzgnVar);
    }

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new zzgn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgm(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
