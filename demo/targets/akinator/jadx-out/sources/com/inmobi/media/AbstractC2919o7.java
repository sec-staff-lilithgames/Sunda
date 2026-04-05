package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2919o7 {
    public static void a(Ub ub2) {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC2936p7.f33260a;
        Objects.toString(ub2);
        if (ub2 == null) {
            return;
        }
        try {
            Iterator it = AbstractC2936p7.f33260a.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || kotlin.jvm.internal.e0.areEqual(weakReference.get(), ub2)) {
                    AbstractC2936p7.f33260a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
