package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import j5.h;
import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzehg {
    private h zza;
    private final Context zzb;

    public zzehg(Context context) {
        this.zzb = context;
    }

    public final n1 zza() {
        try {
            h hVarFrom = h.from(this.zzb);
            this.zza = hVarFrom;
            return hVarFrom == null ? zzgui.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : hVarFrom.getMeasurementApiStatusAsync();
        } catch (Exception e10) {
            return zzgui.zzc(e10);
        }
    }

    public final n1 zzb(Uri uri, InputEvent inputEvent) {
        try {
            h hVar = this.zza;
            Objects.requireNonNull(hVar);
            return hVar.registerSourceAsync(uri, inputEvent);
        } catch (Exception e10) {
            return zzgui.zzc(e10);
        }
    }
}
