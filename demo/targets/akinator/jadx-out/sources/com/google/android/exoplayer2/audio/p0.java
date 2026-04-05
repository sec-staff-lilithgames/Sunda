package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 {
    public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, r0 r0Var) {
        audioTrack.setPreferredDevice(r0Var == null ? null : r0Var.f27277a);
    }
}
