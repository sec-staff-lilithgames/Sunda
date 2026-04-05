package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzchv implements zzblx {
    final /* synthetic */ zzcib zza;

    public zzchv(zzcib zzcibVar) {
        Objects.requireNonNull(zzcibVar);
        this.zza = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                zzcib zzcibVar = this.zza;
                synchronized (zzcibVar) {
                    try {
                        if (zzcibVar.zzaX() != i10) {
                            zzcibVar.zzaY(i10);
                            zzcibVar.requestLayout();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
