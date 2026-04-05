package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzpf extends AudioDeviceCallback {
    final /* synthetic */ zzpj zza;

    public /* synthetic */ zzpf(zzpj zzpjVar, byte[] bArr) {
        Objects.requireNonNull(zzpjVar);
        this.zza = zzpjVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpj zzpjVar = this.zza;
        zzpjVar.zzf(zzpe.zza(zzpjVar.zzg(), zzpjVar.zzj(), zzpjVar.zzh()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzep.zza;
        int length = audioDeviceInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            zzpj zzpjVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i10], zzpjVar.zzh())) {
                zzpjVar.zzi(null);
                break;
            }
            i10++;
        }
        zzpj zzpjVar2 = this.zza;
        zzpjVar2.zzf(zzpe.zza(zzpjVar2.zzg(), zzpjVar2.zzj(), zzpjVar2.zzh()));
    }
}
