package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2816i5 implements Gf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2883m5 f32925a;

    public C2816i5(C2883m5 c2883m5) {
        this.f32925a = c2883m5;
    }

    @Override // com.inmobi.media.Gf
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.e0.checkNotNullParameter(visibleViews, "visibleViews");
        kotlin.jvm.internal.e0.checkNotNullParameter(invisibleViews, "invisibleViews");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32925a.f33083d, "access$getTAG$p(...)");
        Objects.toString(visibleViews);
        Objects.toString(invisibleViews);
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C2849k5 c2849k5 = (C2849k5) this.f32925a.f33080a.get(view);
            if (c2849k5 == null) {
                this.f32925a.a(view);
            } else {
                C2849k5 c2849k52 = (C2849k5) this.f32925a.f33081b.get(view);
                if (!kotlin.jvm.internal.e0.areEqual(c2849k5.f33007a, c2849k52 != null ? c2849k52.f33007a : null)) {
                    c2849k5.f33010d = SystemClock.uptimeMillis();
                    this.f32925a.f33081b.put(view, c2849k5);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f32925a.f33081b.remove((View) it2.next());
        }
        C2883m5 c2883m5 = this.f32925a;
        if (c2883m5.f33084e.hasMessages(0)) {
            return;
        }
        c2883m5.f33084e.postDelayed(c2883m5.f33085f, c2883m5.f33086g);
    }
}
