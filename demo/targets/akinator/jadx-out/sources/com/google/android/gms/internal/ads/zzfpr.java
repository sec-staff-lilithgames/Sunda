package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpr extends zzfpu {
    private static final zzfpr zzb = new zzfpr();

    private zzfpr() {
    }

    public static zzfpr zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final boolean zzb() {
        Iterator it = zzfps.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfoy) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zzc(boolean z10) {
        Iterator it = zzfps.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfoy) it.next()).zzg().zzf(z10);
        }
    }
}
