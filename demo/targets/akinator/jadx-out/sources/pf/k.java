package pf;

import bf.m1;
import com.google.android.exoplayer2.z0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface k extends o {
    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends df.b> list);

    boolean excludeTrack(int i10, long j10);

    @Override // pf.o
    /* synthetic */ z0 getFormat(int i10);

    @Override // pf.o
    /* synthetic */ int getIndexInTrackGroup(int i10);

    default long getLatestBitrateEstimate() {
        return Long.MIN_VALUE;
    }

    z0 getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    @Override // pf.o
    /* synthetic */ m1 getTrackGroup();

    @Override // pf.o
    /* synthetic */ int getType();

    @Override // pf.o
    /* synthetic */ int indexOf(int i10);

    @Override // pf.o
    /* synthetic */ int indexOf(z0 z0Var);

    boolean isTrackExcluded(int i10, long j10);

    @Override // pf.o
    /* synthetic */ int length();

    void onPlaybackSpeed(float f10);

    default boolean shouldCancelChunkLoad(long j10, df.a aVar, List<? extends df.b> list) {
        return false;
    }

    void updateSelectedTrack(long j10, long j11, long j12, List<? extends df.b> list, df.c[] cVarArr);

    default void onDiscontinuity() {
    }

    default void onRebuffer() {
    }

    default void onPlayWhenReadyChanged(boolean z10) {
    }
}
