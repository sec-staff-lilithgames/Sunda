package fo;

import gn.v1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface l extends p {
    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends co.p> list);

    boolean excludeTrack(int i10, long j10);

    @Override // fo.p
    /* synthetic */ io.bidmachine.media3.common.b getFormat(int i10);

    @Override // fo.p
    /* synthetic */ int getIndexInTrackGroup(int i10);

    default long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    io.bidmachine.media3.common.b getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    @Override // fo.p
    /* synthetic */ v1 getTrackGroup();

    @Override // fo.p
    /* synthetic */ int getType();

    @Override // fo.p
    /* synthetic */ int indexOf(int i10);

    @Override // fo.p
    /* synthetic */ int indexOf(io.bidmachine.media3.common.b bVar);

    boolean isTrackExcluded(int i10, long j10);

    @Override // fo.p
    /* synthetic */ int length();

    void onPlaybackSpeed(float f10);

    default boolean shouldCancelChunkLoad(long j10, co.e eVar, List<? extends co.p> list) {
        return false;
    }

    void updateSelectedTrack(long j10, long j11, long j12, List<? extends co.p> list, co.r[] rVarArr);

    default void onDiscontinuity() {
    }

    default void onRebuffer() {
    }

    default void onPlayWhenReadyChanged(boolean z10) {
    }
}
