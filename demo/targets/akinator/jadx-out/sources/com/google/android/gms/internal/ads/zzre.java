package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzre extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzrg zza;

    public zzre(zzrg zzrgVar) {
        Objects.requireNonNull(zzrgVar);
        this.zza = zzrgVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        zzrh zzrhVar = this.zza.zza;
        if (audioTrack.equals(zzrhVar.zzJ()) && zzrhVar.zzI() != null && zzrhVar.zzL()) {
            zzrhVar.zzI().zza();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzrh zzrhVar = this.zza.zza;
        if (audioTrack.equals(zzrhVar.zzJ())) {
            zzrhVar.zzK(true);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzrh zzrhVar = this.zza.zza;
        if (audioTrack.equals(zzrhVar.zzJ()) && zzrhVar.zzI() != null && zzrhVar.zzL()) {
            zzrhVar.zzI().zza();
        }
    }
}
