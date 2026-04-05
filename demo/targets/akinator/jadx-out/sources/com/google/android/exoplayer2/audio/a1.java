package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f27048a;

    public a1(b1 b1Var) {
        this.f27048a = b1Var;
    }

    public void onDataRequest(AudioTrack audioTrack, int i10) {
        c1 c1Var;
        e0 e0Var;
        if (audioTrack.equals(this.f27048a.f27053c.f27093w) && (e0Var = (c1Var = this.f27048a.f27053c).f27089s) != null && c1Var.W) {
            ((h1) e0Var).onOffloadBufferEmptying();
        }
    }

    public void onTearDown(AudioTrack audioTrack) {
        c1 c1Var;
        e0 e0Var;
        if (audioTrack.equals(this.f27048a.f27053c.f27093w) && (e0Var = (c1Var = this.f27048a.f27053c).f27089s) != null && c1Var.W) {
            ((h1) e0Var).onOffloadBufferEmptying();
        }
    }
}
