package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f47193a;

    public z(Context context) {
        AudioManager audioManager;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            audioManager = (AudioManager) m3.a.getSystemService(context.getApplicationContext(), AudioManager.class);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e10, false, 8, null);
            audioManager = null;
        }
        this.f47193a = audioManager;
    }

    @Override // com.moloco.sdk.internal.services.y
    public j0 a() {
        AudioManager audioManager = this.f47193a;
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        return (numValueOf != null && numValueOf.intValue() == 0) ? j0.f47152b : (numValueOf != null && numValueOf.intValue() == 1) ? j0.f47153c : (numValueOf != null && numValueOf.intValue() == 2) ? j0.f47154e : j0.f47154e;
    }

    @Override // com.moloco.sdk.internal.services.y
    public int b() {
        AudioManager audioManager = this.f47193a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }

    @Override // com.moloco.sdk.internal.services.y
    public boolean c() {
        AudioManager audioManager = this.f47193a;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isStreamMute(3);
    }
}
