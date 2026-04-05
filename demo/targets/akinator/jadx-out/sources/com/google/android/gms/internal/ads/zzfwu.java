package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfwu {
    private static zzfwu zzb;
    final zzfwv zza;

    private zzfwu(Context context) {
        this.zza = zzfwv.zza(context);
    }

    public static final zzfwu zza(Context context) {
        zzfwu zzfwuVar;
        synchronized (zzfwu.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfwu(context);
                }
                zzfwuVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfwuVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzfwu.class) {
            try {
                zzfwv zzfwvVar = this.zza;
                zzfwvVar.zzb("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    zzfwvVar.zzf("paidv2_creation_time");
                    zzfwvVar.zzf("paidv2_id");
                    zzfwvVar.zzf("vendor_scoped_gpid_v2_id");
                    zzfwvVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzfwu.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z10) throws IOException {
        synchronized (zzfwu.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzfwu.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
