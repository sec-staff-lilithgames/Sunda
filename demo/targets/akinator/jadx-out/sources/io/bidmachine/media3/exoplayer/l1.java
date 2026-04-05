package io.bidmachine.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f61390a;

    /* renamed from: b, reason: collision with root package name */
    public Looper f61391b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f61392c;

    /* renamed from: d, reason: collision with root package name */
    public int f61393d;

    public l1() {
        this(null);
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.f61390a) {
            try {
                if (this.f61391b == null) {
                    io.bidmachine.media3.common.util.a.checkState(this.f61393d == 0 && this.f61392c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f61392c = handlerThread;
                    handlerThread.start();
                    this.f61391b = this.f61392c.getLooper();
                }
                this.f61393d++;
                looper = this.f61391b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.f61390a) {
            try {
                io.bidmachine.media3.common.util.a.checkState(this.f61393d > 0);
                int i10 = this.f61393d - 1;
                this.f61393d = i10;
                if (i10 == 0 && (handlerThread = this.f61392c) != null) {
                    handlerThread.quit();
                    this.f61392c = null;
                    this.f61391b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l1(Looper looper) {
        this.f61390a = new Object();
        this.f61391b = looper;
        this.f61392c = null;
        this.f61393d = 0;
    }
}
