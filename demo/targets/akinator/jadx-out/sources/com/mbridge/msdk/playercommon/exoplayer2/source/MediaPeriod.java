package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    void prepare(Callback callback, long j10);

    long readDiscontinuity();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10);
}
