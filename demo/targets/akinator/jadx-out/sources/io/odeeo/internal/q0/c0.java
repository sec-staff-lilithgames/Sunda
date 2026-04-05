package io.odeeo.internal.q0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.odeeo.internal.q0.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final List<b> f65840b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f65841a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        public Message f65842a;

        /* renamed from: b, reason: collision with root package name */
        public c0 f65843b;

        public b() {
        }

        public final void a() {
            this.f65842a = null;
            this.f65843b = null;
            c0.b(this);
        }

        @Override // io.odeeo.internal.q0.n.a
        public n getTarget() {
            return (n) io.odeeo.internal.q0.a.checkNotNull(this.f65843b);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) io.odeeo.internal.q0.a.checkNotNull(this.f65842a));
            a();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // io.odeeo.internal.q0.n.a
        public void sendToTarget() {
            ((Message) io.odeeo.internal.q0.a.checkNotNull(this.f65842a)).sendToTarget();
            a();
        }

        public b setMessage(Message message, c0 c0Var) {
            this.f65842a = message;
            this.f65843b = c0Var;
            return this;
        }
    }

    public c0(Handler handler) {
        this.f65841a = handler;
    }

    public static void b(b bVar) {
        List<b> list = f65840b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.odeeo.internal.q0.n
    public Looper getLooper() {
        return this.f65841a.getLooper();
    }

    @Override // io.odeeo.internal.q0.n
    public boolean hasMessages(int i10) {
        return this.f65841a.hasMessages(i10);
    }

    @Override // io.odeeo.internal.q0.n
    public n.a obtainMessage(int i10) {
        return a().setMessage(this.f65841a.obtainMessage(i10), this);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean post(Runnable runnable) {
        return this.f65841a.post(runnable);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f65841a.postAtFrontOfQueue(runnable);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.f65841a.postDelayed(runnable, j10);
    }

    @Override // io.odeeo.internal.q0.n
    public void removeCallbacksAndMessages(Object obj) {
        this.f65841a.removeCallbacksAndMessages(obj);
    }

    @Override // io.odeeo.internal.q0.n
    public void removeMessages(int i10) {
        this.f65841a.removeMessages(i10);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean sendEmptyMessage(int i10) {
        return this.f65841a.sendEmptyMessage(i10);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f65841a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean sendEmptyMessageDelayed(int i10, int i11) {
        return this.f65841a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // io.odeeo.internal.q0.n
    public boolean sendMessageAtFrontOfQueue(n.a aVar) {
        return ((b) aVar).sendAtFrontOfQueue(this.f65841a);
    }

    public static b a() {
        b bVar;
        List<b> list = f65840b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // io.odeeo.internal.q0.n
    public n.a obtainMessage(int i10, Object obj) {
        return a().setMessage(this.f65841a.obtainMessage(i10, obj), this);
    }

    @Override // io.odeeo.internal.q0.n
    public n.a obtainMessage(int i10, int i11, int i12) {
        return a().setMessage(this.f65841a.obtainMessage(i10, i11, i12), this);
    }

    @Override // io.odeeo.internal.q0.n
    public n.a obtainMessage(int i10, int i11, int i12, Object obj) {
        return a().setMessage(this.f65841a.obtainMessage(i10, i11, i12, obj), this);
    }
}
