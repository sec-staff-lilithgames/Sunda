package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2819i8 implements Gf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2835j8 f32928a;

    public C2819i8(C2835j8 c2835j8) {
        this.f32928a = c2835j8;
    }

    @Override // com.inmobi.media.Gf
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.e0.checkNotNullParameter(visibleViews, "visibleViews");
        kotlin.jvm.internal.e0.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Df df2 = (Df) this.f32928a.f32969f.get(view);
            if (df2 != null) {
                df2.a(view, true);
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            Df df3 = (Df) this.f32928a.f32969f.get(view2);
            if (df3 != null) {
                df3.a(view2, false);
            }
        }
    }
}
