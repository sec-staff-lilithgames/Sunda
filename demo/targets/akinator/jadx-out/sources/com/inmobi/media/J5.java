package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class J5 {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f31902a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f31903b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final I5 f31904c = new I5();

    public static void a(C2868l7 finishListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(finishListener, "finishListener");
        if (!f31903b.getAndSet(true)) {
            b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = f31902a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    f31902a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static void b() {
        al.b runnable = new al.b(13);
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2809hf.f32906a.execute(runnable);
    }

    public static final void c() {
        C2767f7 c2767f7D = AbstractC2807hd.d();
        I5 listener = f31904c;
        c2767f7D.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        c2767f7D.f32838b = listener;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC2936p7.f33260a;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = AbstractC2936p7.f33260a.iterator();
            while (it.hasNext()) {
                Ub ub2 = (Ub) ((WeakReference) it.next()).get();
                if (ub2 != null) {
                    arrayList2.add(ub2);
                }
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = AbstractC2936p7.f33260a;
        arrayList2.toString();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Zc((Ub) it2.next()));
        }
        return arrayList;
    }
}
