package io.bidmachine.media3.exoplayer;

import android.media.MediaFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 implements io.v, jo.a, n1 {

    /* renamed from: b, reason: collision with root package name */
    public io.v f61298b;

    /* renamed from: c, reason: collision with root package name */
    public jo.a f61299c;

    /* renamed from: e, reason: collision with root package name */
    public io.v f61300e;

    /* renamed from: f, reason: collision with root package name */
    public jo.a f61301f;

    @Override // io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.f61298b = (io.v) obj;
            return;
        }
        if (i10 == 8) {
            this.f61299c = (jo.a) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        jo.k kVar = (jo.k) obj;
        if (kVar == null) {
            this.f61300e = null;
            this.f61301f = null;
        } else {
            this.f61300e = kVar.getVideoFrameMetadataListener();
            this.f61301f = kVar.getCameraMotionListener();
        }
    }

    @Override // jo.a
    public void onCameraMotion(long j10, float[] fArr) {
        jo.a aVar = this.f61301f;
        if (aVar != null) {
            aVar.onCameraMotion(j10, fArr);
        }
        jo.a aVar2 = this.f61299c;
        if (aVar2 != null) {
            aVar2.onCameraMotion(j10, fArr);
        }
    }

    @Override // jo.a
    public void onCameraMotionReset() {
        jo.a aVar = this.f61301f;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
        jo.a aVar2 = this.f61299c;
        if (aVar2 != null) {
            aVar2.onCameraMotionReset();
        }
    }

    @Override // io.v
    public void onVideoFrameAboutToBeRendered(long j10, long j11, io.bidmachine.media3.common.b bVar, MediaFormat mediaFormat) {
        long j12;
        long j13;
        io.bidmachine.media3.common.b bVar2;
        MediaFormat mediaFormat2;
        io.v vVar = this.f61300e;
        if (vVar != null) {
            vVar.onVideoFrameAboutToBeRendered(j10, j11, bVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            bVar2 = bVar;
            j13 = j11;
            j12 = j10;
        } else {
            j12 = j10;
            j13 = j11;
            bVar2 = bVar;
            mediaFormat2 = mediaFormat;
        }
        io.v vVar2 = this.f61298b;
        if (vVar2 != null) {
            vVar2.onVideoFrameAboutToBeRendered(j12, j13, bVar2, mediaFormat2);
        }
    }
}
