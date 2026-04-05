package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface s0 extends v {
    @Override // com.google.android.exoplayer2.audio.v
    /* synthetic */ l2 applyPlaybackParameters(l2 l2Var);

    @Override // com.google.android.exoplayer2.audio.v
    /* synthetic */ boolean applySkipSilenceEnabled(boolean z10);

    @Override // com.google.android.exoplayer2.audio.v
    /* synthetic */ u[] getAudioProcessors();

    @Override // com.google.android.exoplayer2.audio.v
    /* synthetic */ long getMediaDuration(long j10);

    @Override // com.google.android.exoplayer2.audio.v
    /* synthetic */ long getSkippedOutputFrameCount();
}
