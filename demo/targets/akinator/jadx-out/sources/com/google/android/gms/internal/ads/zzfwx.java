package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfwx extends zzfww {
    private static zzfwx zzd;

    private zzfwx(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfwx zzh(Context context) {
        zzfwx zzfwxVar;
        synchronized (zzfwx.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfwx(context);
                }
                zzfwxVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfwxVar;
    }

    public final zzfwt zzi(long j10, boolean z10) throws IOException {
        zzfwt zzfwtVarZza;
        synchronized (zzfwx.class) {
            zzfwtVarZza = zza(null, null, j10, z10);
        }
        return zzfwtVarZza;
    }

    public final zzfwt zzj(String str, String str2, long j10, boolean z10) throws IOException {
        zzfwt zzfwtVarZza;
        synchronized (zzfwx.class) {
            zzfwtVarZza = zza(str, str2, j10, z10);
        }
        return zzfwtVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzfwx.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfwx.class) {
            zzc(true);
        }
    }
}
