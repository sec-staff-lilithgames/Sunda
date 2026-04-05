package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f61013a;

    public s0(t0 t0Var) {
        this.f61013a = t0Var;
    }

    public void onDataRequest(AudioTrack audioTrack, int i10) {
        u0 u0Var;
        s sVar;
        if (audioTrack.equals(this.f61013a.f61016c.f61057x) && (sVar = (u0Var = this.f61013a.f61016c).f61053t) != null && u0Var.X) {
            ((z0) sVar).onOffloadBufferEmptying();
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f61013a.f61016c.f61057x)) {
            this.f61013a.f61016c.W = true;
        }
    }

    public void onTearDown(AudioTrack audioTrack) {
        u0 u0Var;
        s sVar;
        if (audioTrack.equals(this.f61013a.f61016c.f61057x) && (sVar = (u0Var = this.f61013a.f61016c).f61053t) != null && u0Var.X) {
            ((z0) sVar).onOffloadBufferEmptying();
        }
    }
}
