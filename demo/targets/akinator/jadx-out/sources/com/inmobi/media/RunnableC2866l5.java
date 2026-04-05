package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC2866l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f33041a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f33042b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f33043c;

    public RunnableC2866l5(C2883m5 impressionTracker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionTracker, "impressionTracker");
        this.f33041a = "l5";
        this.f33042b = new ArrayList();
        this.f33043c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.e0.checkNotNull(this.f33041a);
        C2883m5 c2883m5 = (C2883m5) this.f33043c.get();
        if (c2883m5 != null) {
            for (Map.Entry entry : c2883m5.f33081b.entrySet()) {
                View view = (View) entry.getKey();
                C2849k5 c2849k5 = (C2849k5) entry.getValue();
                kotlin.jvm.internal.e0.checkNotNull(this.f33041a);
                Objects.toString(c2849k5);
                if (SystemClock.uptimeMillis() - c2849k5.f33010d >= c2849k5.f33009c) {
                    kotlin.jvm.internal.e0.checkNotNull(this.f33041a);
                    c2883m5.f33087h.a(view, c2849k5.f33007a);
                    this.f33042b.add(view);
                }
            }
            Iterator it = this.f33042b.iterator();
            while (it.hasNext()) {
                c2883m5.a((View) it.next());
            }
            this.f33042b.clear();
            if (c2883m5.f33081b.isEmpty() || c2883m5.f33084e.hasMessages(0)) {
                return;
            }
            c2883m5.f33084e.postDelayed(c2883m5.f33085f, c2883m5.f33086g);
        }
    }
}
