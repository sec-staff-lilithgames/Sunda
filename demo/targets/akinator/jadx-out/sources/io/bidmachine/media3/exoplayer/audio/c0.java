package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60911a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f60912b;

    public c0() {
        this(null);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.g0
    public j getAudioOffloadSupport(io.bidmachine.media3.common.b bVar, gn.h hVar) {
        boolean zBooleanValue;
        io.bidmachine.media3.common.util.a.checkNotNull(bVar);
        io.bidmachine.media3.common.util.a.checkNotNull(hVar);
        int i10 = io.bidmachine.media3.common.util.a1.f60679a;
        if (i10 < 29 || bVar.F == -1) {
            return j.f60951d;
        }
        Boolean bool = this.f60912b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f60911a;
            if (context != null) {
                String parameters = hn.d.getAudioManager(context).getParameters("offloadVariableRateSupported");
                this.f60912b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f60912b = Boolean.FALSE;
            }
            zBooleanValue = this.f60912b.booleanValue();
        }
        int encoding = gn.x0.getEncoding((String) io.bidmachine.media3.common.util.a.checkNotNull(bVar.f60665o), bVar.f60661k);
        if (encoding == 0 || i10 < io.bidmachine.media3.common.util.a1.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return j.f60951d;
        }
        int audioTrackChannelConfig = io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(bVar.E);
        if (audioTrackChannelConfig == 0) {
            return j.f60951d;
        }
        try {
            AudioFormat audioFormat = io.bidmachine.media3.common.util.a1.getAudioFormat(bVar.F, audioTrackChannelConfig, encoding);
            return i10 >= 31 ? b0.getOffloadedPlaybackSupport(audioFormat, hVar.getAudioAttributesV21().f57876a, zBooleanValue) : a0.getOffloadedPlaybackSupport(audioFormat, hVar.getAudioAttributesV21().f57876a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return j.f60951d;
        }
    }

    public c0(Context context) {
        this.f60911a = context;
    }
}
