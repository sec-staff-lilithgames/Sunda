package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class I1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f31862b;

    /* renamed from: a, reason: collision with root package name */
    public final String f31861a = "I1";

    /* renamed from: c, reason: collision with root package name */
    public final Handler f31863c = new Handler(Looper.getMainLooper());

    public I1(Object obj) {
        this.f31862b = new WeakReference(obj);
    }

    public static final void a(I1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Object obj = this$0.f31862b.get();
        if (obj != null) {
            A a10 = A.f31609a;
            int iHashCode = obj.hashCode();
            try {
                SparseArray sparseArray = A.f31610b;
                Queue queue = (Queue) sparseArray.get(iHashCode);
                if (queue != null) {
                    queue.poll();
                    I1 i12 = (I1) queue.peek();
                    if (queue.size() > 0 && i12 != null) {
                        try {
                            A.f31611c.execute(i12);
                        } catch (OutOfMemoryError unused) {
                            i12.c();
                        }
                    }
                    if (queue.size() == 0) {
                        sparseArray.remove(iHashCode);
                    }
                }
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }

    public abstract void a();

    public final void b() {
        this.f31863c.post(new zg.h(this, 6));
    }

    public void c() {
        String TAG = this.f31861a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        AbstractC2902n7.a((byte) 1, TAG, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f31862b.get();
        if (obj != null) {
            A a10 = A.f31609a;
            int iHashCode = obj.hashCode();
            SparseArray sparseArray = A.f31610b;
            sparseArray.remove(iHashCode);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("A", "TAG");
            sparseArray.size();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
        b();
    }
}
