package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfwy extends zzfww {
    private static zzfwy zzd;

    private zzfwy(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfwy zzh(Context context) {
        zzfwy zzfwyVar;
        synchronized (zzfwy.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfwy(context);
                }
                zzfwyVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfwyVar;
    }

    public final zzfwt zzi(long j10, boolean z10) throws IOException {
        synchronized (zzfwy.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j10, z10);
                }
                return new zzfwt();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfwy.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
