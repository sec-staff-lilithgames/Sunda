package io.bidmachine.media3.common.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: f, reason: collision with root package name */
    public static k0 f60731f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f60732a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f60733b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f60734c;

    /* renamed from: d, reason: collision with root package name */
    public int f60735d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f60736e;

    public k0(Context context) {
        Executor executor = b.get();
        this.f60732a = executor;
        this.f60733b = new CopyOnWriteArrayList();
        this.f60734c = new Object();
        this.f60735d = 0;
        executor.execute(new f0(0, this, context));
    }

    public static synchronized k0 getInstance(Context context) {
        try {
            if (f60731f == null) {
                f60731f = new k0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f60731f;
    }

    public static synchronized void resetForTests() {
        f60731f = null;
    }

    public final void a(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f60733b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.canBeRemoved()) {
                copyOnWriteArrayList.remove(j0Var);
            }
        }
        synchronized (this.f60734c) {
            try {
                if (this.f60736e && this.f60735d == i10) {
                    return;
                }
                this.f60736e = true;
                this.f60735d = i10;
                Iterator it2 = this.f60733b.iterator();
                while (it2.hasNext()) {
                    ((j0) it2.next()).callOnNetworkTypeChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getNetworkType() {
        int i10;
        synchronized (this.f60734c) {
            i10 = this.f60735d;
        }
        return i10;
    }

    @Deprecated
    public void register(i0 i0Var) {
        register(i0Var, new androidx.browser.customtabs.i(new Handler(Looper.getMainLooper()), 0));
    }

    public void register(i0 i0Var, Executor executor) {
        boolean z10;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f60733b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.canBeRemoved()) {
                copyOnWriteArrayList.remove(j0Var);
            }
        }
        j0 j0Var2 = new j0(this, i0Var, executor);
        synchronized (this.f60734c) {
            this.f60733b.add(j0Var2);
            z10 = this.f60736e;
        }
        if (z10) {
            j0Var2.callOnNetworkTypeChanged();
        }
    }
}
