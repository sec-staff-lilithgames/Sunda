package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhk extends BroadcastReceiver {
    private final zzdm zza;

    public zzhk(zzhm zzhmVar, zzdm zzdmVar, zzhl zzhlVar) {
        Objects.requireNonNull(zzhmVar);
        this.zza = zzdmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                }
            });
        }
    }
}
