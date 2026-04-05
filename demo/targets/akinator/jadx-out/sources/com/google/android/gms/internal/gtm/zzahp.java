package com.google.android.gms.internal.gtm;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahp extends zzacc implements zzadm {
    private static final zzahp zzd;
    private int zze;
    private zzahr zzf;
    private byte zzg = 2;

    static {
        zzahp zzahpVar = new zzahp();
        zzd = zzahpVar;
        zzacf.zzao(zzahp.class, zzahpVar);
    }

    private zzahp() {
    }

    public static zzahp zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzacf.zzal(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", duhsDlGWdBkekB.GMHbT});
        }
        if (i11 == 3) {
            return new zzahp();
        }
        zzahs zzahsVar = null;
        if (i11 == 4) {
            return new zzaho(zzahsVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
