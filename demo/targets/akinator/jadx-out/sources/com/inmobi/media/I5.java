package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I5 {
    public static void a() {
        try {
            Iterator it = J5.f31902a.iterator();
            while (it.hasNext()) {
                C2868l7 c2868l7 = (C2868l7) ((WeakReference) it.next()).get();
                if (c2868l7 != null) {
                    c2868l7.a();
                }
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
