package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbuf implements View.OnClickListener {
    final /* synthetic */ zzbuh zza;

    public zzbuf(zzbuh zzbuhVar) {
        Objects.requireNonNull(zzbuhVar);
        this.zza = zzbuhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
