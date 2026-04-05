package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import io.bidmachine.media3.exoplayer.audio.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c {
    public static d getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, gn.h hVar) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(hVar.getAudioAttributesV21().f57876a);
        HashMap map = new HashMap();
        map.put(2, new HashSet(rh.w.asList(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile audioProfileB = com.google.android.gms.internal.ads.a.b(directProfilesForAttributes.get(i10));
            if (audioProfileB.getEncapsulationType() != 1) {
                int format = audioProfileB.getFormat();
                if (io.bidmachine.media3.common.util.a1.isEncodingLinearPcm(format) || d.f60915e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) io.bidmachine.media3.common.util.a.checkNotNull((Set) map.get(Integer.valueOf(format)))).addAll(rh.w.asList(audioProfileB.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(rh.w.asList(audioProfileB.getChannelMasks())));
                    }
                }
            }
        }
        x4 x4VarBuilder = b5.builder();
        for (Map.Entry entry : map.entrySet()) {
            x4VarBuilder.add((Object) new d.a(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return new d(x4VarBuilder.build());
    }

    public static h getDefaultRoutedDeviceForAttributes(AudioManager audioManager, gn.h hVar) {
        try {
            List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(audioManager)).getAudioDevicesForAttributes(hVar.getAudioAttributesV21().f57876a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new h(audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
