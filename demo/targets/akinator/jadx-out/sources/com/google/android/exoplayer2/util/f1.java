package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 implements z {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f28450b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f28451a;

    public f1(Handler handler) {
        this.f28451a = handler;
    }

    public static e1 a() {
        e1 e1Var;
        ArrayList arrayList = f28450b;
        synchronized (arrayList) {
            try {
                e1Var = arrayList.isEmpty() ? new e1() : (e1) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e1Var;
    }

    @Override // com.google.android.exoplayer2.util.z
    public Looper getLooper() {
        return this.f28451a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean hasMessages(int i10) {
        return this.f28451a.hasMessages(i10);
    }

    @Override // com.google.android.exoplayer2.util.z
    public y obtainMessage(int i10) {
        return a().setMessage(this.f28451a.obtainMessage(i10), this);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean post(Runnable runnable) {
        return this.f28451a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f28451a.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.f28451a.postDelayed(runnable, j10);
    }

    @Override // com.google.android.exoplayer2.util.z
    public void removeCallbacksAndMessages(Object obj) {
        this.f28451a.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.z
    public void removeMessages(int i10) {
        this.f28451a.removeMessages(i10);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean sendEmptyMessage(int i10) {
        return this.f28451a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f28451a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean sendEmptyMessageDelayed(int i10, int i11) {
        return this.f28451a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.exoplayer2.util.z
    public boolean sendMessageAtFrontOfQueue(y yVar) {
        return ((e1) yVar).sendAtFrontOfQueue(this.f28451a);
    }

    @Override // com.google.android.exoplayer2.util.z
    public y obtainMessage(int i10, Object obj) {
        return a().setMessage(this.f28451a.obtainMessage(i10, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.z
    public y obtainMessage(int i10, int i11, int i12) {
        return a().setMessage(this.f28451a.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.google.android.exoplayer2.util.z
    public y obtainMessage(int i10, int i11, int i12, Object obj) {
        return a().setMessage(this.f28451a.obtainMessage(i10, i11, i12, obj), this);
    }
}
