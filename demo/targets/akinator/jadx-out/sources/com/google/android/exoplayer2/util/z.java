package com.google.android.exoplayer2.util;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface z {
    Looper getLooper();

    boolean hasMessages(int i10);

    y obtainMessage(int i10);

    y obtainMessage(int i10, int i11, int i12);

    y obtainMessage(int i10, int i11, int i12, Object obj);

    y obtainMessage(int i10, Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j10);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i10);

    boolean sendEmptyMessage(int i10);

    boolean sendEmptyMessageAtTime(int i10, long j10);

    boolean sendEmptyMessageDelayed(int i10, int i11);

    boolean sendMessageAtFrontOfQueue(y yVar);
}
