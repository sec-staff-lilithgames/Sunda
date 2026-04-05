package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioFormat;
import android.media.AudioTrack;
import nh.b5;
import nh.ej;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {
    public static b5 getDirectPlaybackSupportedEncodings(gn.h hVar) {
        x4 x4VarBuilder = b5.builder();
        ej it = d.f60915e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (io.bidmachine.media3.common.util.a1.f60679a >= io.bidmachine.media3.common.util.a1.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), hVar.getAudioAttributesV21().f57876a)) {
                x4VarBuilder.add((Object) num);
            }
        }
        x4VarBuilder.add((Object) 2);
        return x4VarBuilder.build();
    }

    public static int getMaxSupportedChannelCountForPassthrough(int i10, int i11, gn.h hVar) {
        for (int i12 = 10; i12 > 0; i12--) {
            int audioTrackChannelConfig = io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(i12);
            if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(audioTrackChannelConfig).build(), hVar.getAudioAttributesV21().f57876a)) {
                return i12;
            }
        }
        return 0;
    }
}
