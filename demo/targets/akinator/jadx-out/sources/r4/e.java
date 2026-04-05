package r4;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f83745a = Choreographer.getInstance();

    /* renamed from: b, reason: collision with root package name */
    public final Looper f83746b = Looper.myLooper();

    @Override // r4.d0
    public boolean isCurrentThread() {
        return Thread.currentThread() == this.f83746b.getThread();
    }

    @Override // r4.d0
    public void postFrameCallback(Runnable runnable) {
        this.f83745a.postFrameCallback(new kotlinx.coroutines.android.a(runnable, 2));
    }
}
