package com.inmobi.media;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f31609a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f31610b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f31611c;

    static {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        AdConfig adConfig = (AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(adConfig.getMaxPoolSize(), adConfig.getMaxPoolSize(), 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Q5("A".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f31611c = threadPoolExecutor;
    }

    public static void a(int i10, I1 task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        if (kotlin.jvm.internal.e0.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            c(i10, task);
            return;
        }
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        com.applovin.impl.adview.p runnable = new com.applovin.impl.adview.p(i10, task, 9);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    public static final void b(int i10, I1 task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "$task");
        c(i10, task);
    }

    public static void c(int i10, I1 i12) {
        try {
            SparseArray sparseArray = f31610b;
            Queue linkedList = (Queue) sparseArray.get(i10);
            if (linkedList == null) {
                linkedList = new LinkedList();
                sparseArray.put(i10, linkedList);
            }
            linkedList.add(i12);
            I1 i13 = (I1) linkedList.peek();
            if (linkedList.size() != 1 || i13 == null) {
                return;
            }
            try {
                f31611c.execute(i13);
            } catch (OutOfMemoryError unused) {
                i13.c();
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
