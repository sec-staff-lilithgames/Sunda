package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import nh.b5;
import nh.ej;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f27204a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static b5 getDirectPlaybackSupportedEncodings() {
        x4 x4VarBuilder = b5.builder();
        ej it = n.f27214e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (com.google.android.exoplayer2.util.n1.f28506a >= 34 || iIntValue != 30) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f27204a)) {
                    x4VarBuilder.add((Object) num);
                }
            }
        }
        x4VarBuilder.add((Object) 2);
        return x4VarBuilder.build();
    }

    public static int getMaxSupportedChannelCountForPassthrough(int i10, int i11) {
        for (int i12 = 10; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(com.google.android.exoplayer2.util.n1.getAudioTrackChannelConfig(i12)).build(), f27204a)) {
                return i12;
            }
        }
        return 0;
    }
}
