package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaam extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaal zzd;
    private boolean zze;

    public /* synthetic */ zzaam(zzaal zzaalVar, SurfaceTexture surfaceTexture, boolean z10, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzaalVar;
        this.zza = z10;
    }

    public static synchronized boolean zza(Context context) {
        if (!zzc) {
            try {
            } catch (zzdj e10) {
                zzdt.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
            }
            int i10 = zzdk.zza(context) ? zzdk.zzb() ? 1 : 2 : 0;
            zzb = i10;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzaam zzb(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zza(context)) {
            z11 = false;
        }
        zzgmd.zzh(z11);
        return new zzaal().zza(z10 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzaal zzaalVar = this.zzd;
        synchronized (zzaalVar) {
            try {
                if (!this.zze) {
                    zzaalVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
