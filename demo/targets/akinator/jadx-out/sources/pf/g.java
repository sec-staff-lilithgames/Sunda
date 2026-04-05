package pf;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Spatializer f81115a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81116b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f81117c;

    /* renamed from: d, reason: collision with root package name */
    public f f81118d;

    public g(Spatializer spatializer) {
        this.f81115a = spatializer;
        this.f81116b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static g tryCreateInstance(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new g(audioManager.getSpatializer());
    }

    public boolean canBeSpatialized(com.google.android.exoplayer2.audio.k kVar, z0 z0Var) throws IllegalArgumentException {
        String str = z0Var.f28802n;
        int i10 = z0Var.A;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(n1.getAudioTrackChannelConfig(i10));
        int i11 = z0Var.B;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.f81115a.canBeSpatialized(kVar.getAudioAttributesV21().f27128a, channelMask.build());
    }

    public void ensureInitialized(c cVar, Looper looper) {
        if (this.f81118d == null && this.f81117c == null) {
            this.f81118d = new f(cVar);
            Handler handler = new Handler(looper);
            this.f81117c = handler;
            this.f81115a.addOnSpatializerStateChangedListener(new androidx.browser.customtabs.i(handler, 0), this.f81118d);
        }
    }

    public boolean isAvailable() {
        return this.f81115a.isAvailable();
    }

    public boolean isEnabled() {
        return this.f81115a.isEnabled();
    }

    public boolean isSpatializationSupported() {
        return this.f81116b;
    }

    public void release() {
        f fVar = this.f81118d;
        if (fVar == null || this.f81117c == null) {
            return;
        }
        this.f81115a.removeOnSpatializerStateChangedListener(fVar);
        ((Handler) n1.castNonNull(this.f81117c)).removeCallbacksAndMessages(null);
        this.f81117c = null;
        this.f81118d = null;
    }
}
