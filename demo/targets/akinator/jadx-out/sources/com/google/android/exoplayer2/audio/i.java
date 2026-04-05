package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f27128a;

    public i(k kVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(kVar.f27158b).setFlags(kVar.f27159c).setUsage(kVar.f27160e);
        int i10 = com.google.android.exoplayer2.util.n1.f28506a;
        if (i10 >= 29) {
            g.setAllowedCapturePolicy(usage, kVar.f27161f);
        }
        if (i10 >= 32) {
            h.setSpatializationBehavior(usage, kVar.f27162g);
        }
        this.f27128a = usage.build();
    }
}
