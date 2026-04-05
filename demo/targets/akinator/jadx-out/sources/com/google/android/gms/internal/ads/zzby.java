package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzby implements AudioManager.OnAudioFocusChangeListener {
    private final Handler zza;
    private final AudioManager.OnAudioFocusChangeListener zzb;

    public zzby(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzep.zza;
        this.zza = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        zzep.zzd(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzbx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i10);
            }
        });
    }

    public final /* synthetic */ void zza(int i10) {
        this.zzb.onAudioFocusChange(i10);
    }
}
