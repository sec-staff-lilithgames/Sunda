package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzawu {
    protected volatile Boolean zzb;
    private final zzayd zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfto zza = null;
    private static volatile Random zze = null;

    public zzawu(zzayd zzaydVar) {
        this.zzc = zzaydVar;
        zzaydVar.zzd().execute(new zzawt(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzawu.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzati zzatiVarZza = zzatm.zza();
            zzatiVarZza.zza(this.zzc.zza.getPackageName());
            zzatiVarZza.zzb(j10);
            if (str != null) {
                zzatiVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzatiVarZza.zzc(stringWriter.toString());
                zzatiVarZza.zzd(exc.getClass().getName());
            }
            zzftn zzftnVarZza = zza.zza(((zzatm) zzatiVarZza.zzbu()).zzaN());
            zzftnVarZza.zzc(i10);
            if (i11 != -1) {
                zzftnVarZza.zzb(i11);
            }
            zzftnVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzayd zzb() {
        return this.zzc;
    }
}
