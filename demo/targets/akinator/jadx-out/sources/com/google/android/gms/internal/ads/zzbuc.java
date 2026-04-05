package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbuc implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbue zza;

    public zzbuc(zzbue zzbueVar) {
        Objects.requireNonNull(zzbueVar);
        this.zza = zzbueVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzbue zzbueVar = this.zza;
        Intent intentZzb = zzbueVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzZ(zzbueVar.zzc(), intentZzb);
    }
}
