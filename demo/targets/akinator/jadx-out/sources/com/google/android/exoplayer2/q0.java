package com.google.android.exoplayer2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 implements sf.l, tf.a, t2 {

    /* renamed from: b, reason: collision with root package name */
    public sf.l f27920b;

    /* renamed from: c, reason: collision with root package name */
    public tf.a f27921c;

    /* renamed from: e, reason: collision with root package name */
    public sf.l f27922e;

    /* renamed from: f, reason: collision with root package name */
    public tf.a f27923f;

    @Override // com.google.android.exoplayer2.t2
    public void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.f27920b = (sf.l) obj;
            return;
        }
        if (i10 == 8) {
            this.f27921c = (tf.a) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        tf.k kVar = (tf.k) obj;
        if (kVar == null) {
            this.f27922e = null;
            this.f27923f = null;
        } else {
            this.f27922e = kVar.getVideoFrameMetadataListener();
            this.f27923f = kVar.getCameraMotionListener();
        }
    }

    @Override // tf.a
    public void onCameraMotion(long j10, float[] fArr) {
        tf.a aVar = this.f27923f;
        if (aVar != null) {
            aVar.onCameraMotion(j10, fArr);
        }
        tf.a aVar2 = this.f27921c;
        if (aVar2 != null) {
            aVar2.onCameraMotion(j10, fArr);
        }
    }

    @Override // tf.a
    public void onCameraMotionReset() {
        tf.a aVar = this.f27923f;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
        tf.a aVar2 = this.f27921c;
        if (aVar2 != null) {
            aVar2.onCameraMotionReset();
        }
    }

    @Override // sf.l
    public void onVideoFrameAboutToBeRendered(long j10, long j11, z0 z0Var, MediaFormat mediaFormat) {
        long j12;
        long j13;
        z0 z0Var2;
        MediaFormat mediaFormat2;
        sf.l lVar = this.f27922e;
        if (lVar != null) {
            lVar.onVideoFrameAboutToBeRendered(j10, j11, z0Var, mediaFormat);
            mediaFormat2 = mediaFormat;
            z0Var2 = z0Var;
            j13 = j11;
            j12 = j10;
        } else {
            j12 = j10;
            j13 = j11;
            z0Var2 = z0Var;
            mediaFormat2 = mediaFormat;
        }
        sf.l lVar2 = this.f27920b;
        if (lVar2 != null) {
            lVar2.onVideoFrameAboutToBeRendered(j12, j13, z0Var2, mediaFormat2);
        }
    }
}
