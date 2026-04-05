package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import nh.k6;
import nh.l6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a {
    public static boolean isBluetoothConnected(AudioManager audioManager, h hVar) {
        AudioDeviceInfo[] devices = hVar == null ? ((AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(audioManager)).getDevices(2) : new AudioDeviceInfo[]{hVar.f60946a};
        k6 k6VarAdd = new k6().add((Object[]) new Integer[]{8, 7});
        int i10 = io.bidmachine.media3.common.util.a1.f60679a;
        if (i10 >= 31) {
            k6VarAdd.add((Object[]) new Integer[]{26, 27});
        }
        if (i10 >= 33) {
            k6VarAdd.add((Object) 30);
        }
        l6 l6VarBuild = k6VarAdd.build();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (l6VarBuild.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
