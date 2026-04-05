package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean z10, ShuffleOrder shuffleOrder) {
        this.isAtomic = z10;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    private int getNextChildIndex(int i10, boolean z10) {
        if (z10) {
            return this.shuffleOrder.getNextIndex(i10);
        }
        if (i10 < this.childCount - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i10, boolean z10) {
        if (z10) {
            return this.shuffleOrder.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract int getChildIndexByChildUid(Object obj);

    public abstract int getChildIndexByPeriodIndex(int i10);

    public abstract int getChildIndexByWindowIndex(int i10);

    public abstract Object getChildUidByChildIndex(int i10);

    public abstract int getFirstPeriodIndexByChildIndex(int i10);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z10) {
        if (this.childCount == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z10 = false;
        }
        int firstIndex = z10 ? this.shuffleOrder.getFirstIndex() : 0;
        while (getTimelineByChildIndex(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return getTimelineByChildIndex(firstIndex).getFirstWindowIndex(z10) + getFirstWindowIndexByChildIndex(firstIndex);
    }

    public abstract int getFirstWindowIndexByChildIndex(int i10);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int childIndexByChildUid = getChildIndexByChildUid(obj2);
        if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(obj3)) == -1) {
            return -1;
        }
        return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z10) {
        int i10 = this.childCount;
        if (i10 == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z10 = false;
        }
        int lastIndex = z10 ? this.shuffleOrder.getLastIndex() : i10 - 1;
        while (getTimelineByChildIndex(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return getTimelineByChildIndex(lastIndex).getLastWindowIndex(z10) + getFirstWindowIndexByChildIndex(lastIndex);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (this.isAtomic) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i10);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(i10 - firstWindowIndexByChildIndex, i11 != 2 ? i11 : 0, z10);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z10);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z10);
        }
        if (nextChildIndex != -1) {
            return getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z10) + getFirstWindowIndexByChildIndex(nextChildIndex);
        }
        if (i11 == 2) {
            return getFirstWindowIndex(z10);
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i10 - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, z10);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (z10) {
            period.uid = Pair.create(getChildUidByChildIndex(childIndexByPeriodIndex), period.uid);
        }
        return period;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (this.isAtomic) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i10);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(i10 - firstWindowIndexByChildIndex, i11 != 2 ? i11 : 0, z10);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z10);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z10);
        }
        if (previousChildIndex != -1) {
            return getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z10) + getFirstWindowIndexByChildIndex(previousChildIndex);
        }
        if (i11 == 2) {
            return getLastWindowIndex(z10);
        }
        return -1;
    }

    public abstract Timeline getTimelineByChildIndex(int i10);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i10, Timeline.Window window, boolean z10, long j10) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i10);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i10 - firstWindowIndexByChildIndex, window, z10, j10);
        window.firstPeriodIndex += firstPeriodIndexByChildIndex;
        window.lastPeriodIndex += firstPeriodIndexByChildIndex;
        return window;
    }
}
