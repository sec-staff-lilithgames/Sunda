package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzccm implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzccv zzb;

    public zzccm(zzccv zzccvVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzccvVar);
        this.zzb = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccv zzccvVar = this.zzb;
        zzccvVar.zzs(this.zza);
        if (zzccvVar.zzt() != null) {
            zzccvVar.zzt().zzb();
        }
    }
}
