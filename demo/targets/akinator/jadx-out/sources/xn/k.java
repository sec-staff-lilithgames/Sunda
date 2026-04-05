package xn;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import sh.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f92100a;

    /* renamed from: b, reason: collision with root package name */
    public final j f92101b;

    /* renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f92102c;

    public k() {
        this(j.Y8);
    }

    public void addMediaCodec(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f92102c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            io.bidmachine.media3.common.util.a.checkState(this.f92100a.add(mediaCodec));
        }
    }

    public void release() {
        this.f92100a.clear();
        LoudnessCodecController loudnessCodecController = this.f92102c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void removeMediaCodec(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f92100a.remove(mediaCodec) || (loudnessCodecController = this.f92102c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void setAudioSessionId(int i10) {
        LoudnessCodecController loudnessCodecController = this.f92102c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f92102c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, w1.directExecutor(), new i(this));
        this.f92102c = loudnessCodecControllerCreate;
        Iterator it = this.f92100a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public k(j jVar) {
        this.f92100a = new HashSet();
        this.f92101b = jVar;
    }
}
