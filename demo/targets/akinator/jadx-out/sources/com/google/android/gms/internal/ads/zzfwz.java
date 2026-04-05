package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfwz {
    private static zzfwz zzb;
    final zzfwv zza;

    private zzfwz(Context context) {
        this.zza = zzfwv.zza(context);
        zzfwu.zza(context);
    }

    public static final zzfwz zza(Context context) {
        zzfwz zzfwzVar;
        synchronized (zzfwz.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfwz(context);
                }
                zzfwzVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfwzVar;
    }

    public final void zzb(zzfwt zzfwtVar) throws IOException {
        synchronized (zzfwz.class) {
            zzfwv zzfwvVar = this.zza;
            zzfwvVar.zzf("vendor_scoped_gpid_v2_id");
            zzfwvVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
