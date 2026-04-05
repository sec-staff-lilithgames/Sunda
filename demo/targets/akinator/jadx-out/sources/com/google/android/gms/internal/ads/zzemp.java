package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzemp extends zzcrn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzemp(zzemt zzemtVar, View view, zzcgy zzcgyVar, zzctm zzctmVar, zzffv zzffvVar) {
        super(view, null, zzctmVar, zzffvVar);
        Objects.requireNonNull(zzemtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcrn
    public final zzdaa zze(Set set) {
        return new zzdaa(Collections.EMPTY_SET);
    }
}
