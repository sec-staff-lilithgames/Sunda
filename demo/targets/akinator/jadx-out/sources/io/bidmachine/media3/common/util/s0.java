package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s0 implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f60792b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f60793a;

    public s0(Handler handler) {
        this.f60793a = handler;
    }

    public static r0 a() {
        r0 r0Var;
        ArrayList arrayList = f60792b;
        synchronized (arrayList) {
            try {
                r0Var = arrayList.isEmpty() ? new r0() : (r0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0Var;
    }

    @Override // io.bidmachine.media3.common.util.v
    public Looper getLooper() {
        return this.f60793a.getLooper();
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean hasMessages(int i10) {
        a.checkArgument(i10 != 0);
        return this.f60793a.hasMessages(i10);
    }

    @Override // io.bidmachine.media3.common.util.v
    public u obtainMessage(int i10) {
        return a().setMessage(this.f60793a.obtainMessage(i10), this);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean post(Runnable runnable) {
        return this.f60793a.post(runnable);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f60793a.postAtFrontOfQueue(runnable);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.f60793a.postDelayed(runnable, j10);
    }

    @Override // io.bidmachine.media3.common.util.v
    public void removeCallbacksAndMessages(Object obj) {
        this.f60793a.removeCallbacksAndMessages(obj);
    }

    @Override // io.bidmachine.media3.common.util.v
    public void removeMessages(int i10) {
        a.checkArgument(i10 != 0);
        this.f60793a.removeMessages(i10);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean sendEmptyMessage(int i10) {
        return this.f60793a.sendEmptyMessage(i10);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f60793a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean sendEmptyMessageDelayed(int i10, int i11) {
        return this.f60793a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // io.bidmachine.media3.common.util.v
    public boolean sendMessageAtFrontOfQueue(u uVar) {
        return ((r0) uVar).sendAtFrontOfQueue(this.f60793a);
    }

    @Override // io.bidmachine.media3.common.util.v
    public u obtainMessage(int i10, Object obj) {
        return a().setMessage(this.f60793a.obtainMessage(i10, obj), this);
    }

    @Override // io.bidmachine.media3.common.util.v
    public u obtainMessage(int i10, int i11, int i12) {
        return a().setMessage(this.f60793a.obtainMessage(i10, i11, i12), this);
    }

    @Override // io.bidmachine.media3.common.util.v
    public u obtainMessage(int i10, int i11, int i12, Object obj) {
        return a().setMessage(this.f60793a.obtainMessage(i10, i11, i12, obj), this);
    }
}
