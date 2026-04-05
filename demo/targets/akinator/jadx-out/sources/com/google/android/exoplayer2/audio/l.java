package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import nh.k6;
import nh.l6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l {
    private static final l6 a() {
        k6 k6VarAdd = new k6().add((Object[]) new Integer[]{8, 7});
        int i10 = com.google.android.exoplayer2.util.n1.f28506a;
        if (i10 >= 31) {
            k6VarAdd.add((Object[]) new Integer[]{26, 27});
        }
        if (i10 >= 33) {
            k6VarAdd.add((Object) 30);
        }
        return k6VarAdd.build();
    }

    public static final boolean isBluetoothConnected(Context context) {
        AudioDeviceInfo[] devices = ((AudioManager) com.google.android.exoplayer2.util.a.checkNotNull((AudioManager) context.getSystemService("audio"))).getDevices(2);
        l6 l6VarA = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (l6VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
