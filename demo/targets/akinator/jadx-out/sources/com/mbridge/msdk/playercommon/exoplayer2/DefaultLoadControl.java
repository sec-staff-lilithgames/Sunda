package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultAllocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_MS = 15000;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = true;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    private final DefaultAllocator allocator;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isBuffering;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final PriorityTaskManager priorityTaskManager;
    private final int targetBufferBytesOverwrite;
    private int targetBufferSize;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private DefaultAllocator allocator = null;
        private int minBufferMs = 15000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = 2500;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = true;
        private PriorityTaskManager priorityTaskManager = null;

        public DefaultLoadControl createDefaultLoadControl() {
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.priorityTaskManager);
        }

        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            this.allocator = defaultAllocator;
            return this;
        }

        public Builder setBufferDurationsMs(int i10, int i11, int i12, int i13) {
            this.minBufferMs = i10;
            this.maxBufferMs = i11;
            this.bufferForPlaybackMs = i12;
            this.bufferForPlaybackAfterRebufferMs = i13;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean z10) {
            this.prioritizeTimeOverSizeThresholds = z10;
            return this;
        }

        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setTargetBufferBytes(int i10) {
            this.targetBufferBytes = i10;
            return this;
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE));
    }

    private static void assertGreaterOrEqual(int i10, int i11, String str, String str2) {
        Assertions.checkArgument(i10 >= i11, str + " cannot be less than " + str2);
    }

    private void reset(boolean z10) {
        this.targetBufferSize = 0;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null && this.isBuffering) {
            priorityTaskManager.remove(0);
        }
        this.isBuffering = false;
        if (z10) {
            this.allocator.reset();
        }
    }

    public int calculateTargetBufferSize(Renderer[] rendererArr, TrackSelectionArray trackSelectionArray) {
        int defaultBufferSize = 0;
        for (int i10 = 0; i10 < rendererArr.length; i10++) {
            if (trackSelectionArray.get(i10) != null) {
                defaultBufferSize = Util.getDefaultBufferSize(rendererArr[i10].getTrackType()) + defaultBufferSize;
            }
        }
        return defaultBufferSize;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onPrepared() {
        reset(false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onReleased() {
        reset(true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onStopped() {
        reset(true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        int iCalculateTargetBufferSize = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferSize == -1) {
            iCalculateTargetBufferSize = calculateTargetBufferSize(rendererArr, trackSelectionArray);
        }
        this.targetBufferSize = iCalculateTargetBufferSize;
        this.allocator.setTargetBufferSize(iCalculateTargetBufferSize);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j10, float f10) {
        boolean z10;
        boolean z11 = true;
        boolean z12 = this.allocator.getTotalBytesAllocated() >= this.targetBufferSize;
        boolean z13 = this.isBuffering;
        long jMin = this.minBufferUs;
        if (f10 > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, f10), this.maxBufferUs);
        }
        if (j10 < jMin) {
            if (!this.prioritizeTimeOverSizeThresholds && z12) {
                z11 = false;
            }
            this.isBuffering = z11;
        } else if (j10 > this.maxBufferUs || z12) {
            this.isBuffering = false;
        }
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null && (z10 = this.isBuffering) != z13) {
            if (z10) {
                priorityTaskManager.add(0);
            } else {
                priorityTaskManager.remove(0);
            }
        }
        return this.isBuffering;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long j10, float f10, boolean z10) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j10, f10);
        long j11 = z10 ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        if (j11 <= 0 || playoutDurationForMediaDuration >= j11) {
            return true;
        }
        return !this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= this.targetBufferSize;
    }

    @Deprecated
    public DefaultLoadControl(DefaultAllocator defaultAllocator) {
        this(defaultAllocator, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this(defaultAllocator, i10, i11, i12, i13, i14, z10, null);
    }

    @Deprecated
    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i10, int i11, int i12, int i13, int i14, boolean z10, PriorityTaskManager priorityTaskManager) {
        assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i11, i10, "maxBufferMs", "minBufferMs");
        this.allocator = defaultAllocator;
        this.minBufferUs = i10 * 1000;
        this.maxBufferUs = i11 * 1000;
        this.bufferForPlaybackUs = i12 * 1000;
        this.bufferForPlaybackAfterRebufferUs = i13 * 1000;
        this.targetBufferBytesOverwrite = i14;
        this.prioritizeTimeOverSizeThresholds = z10;
        this.priorityTaskManager = priorityTaskManager;
    }
}
