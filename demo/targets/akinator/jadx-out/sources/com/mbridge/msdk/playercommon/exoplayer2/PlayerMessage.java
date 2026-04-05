package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PlayerMessage {
    private Handler handler;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private int windowIndex;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Target {
        void handleMessage(int i10, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i10, Handler handler) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.handler = handler;
        this.windowIndex = i10;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.handler.getLooper().getThread() != Thread.currentThread());
            long jElapsedRealtime = 500;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() + 500;
            while (true) {
                z10 = this.isProcessed;
                if (z10 || jElapsedRealtime <= 0) {
                    break;
                }
                wait(jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime2 - SystemClock.elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery time out");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isDelivered;
    }

    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public int getWindowIndex() {
        return this.windowIndex;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z10) {
        this.isDelivered = z10 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z10) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z10;
        return this;
    }

    public PlayerMessage setHandler(Handler handler) {
        Assertions.checkState(!this.isSent);
        this.handler = handler;
        return this;
    }

    public PlayerMessage setPayload(Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public PlayerMessage setPosition(long j10) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j10;
        return this;
    }

    public PlayerMessage setType(int i10) {
        Assertions.checkState(!this.isSent);
        this.type = i10;
        return this;
    }

    public PlayerMessage setPosition(int i10, long j10) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j10 != C.TIME_UNSET);
        if (i10 >= 0 && (this.timeline.isEmpty() || i10 < this.timeline.getWindowCount())) {
            this.windowIndex = i10;
            this.positionMs = j10;
            return this;
        }
        throw new IllegalSeekPositionException(this.timeline, i10, j10);
    }
}
