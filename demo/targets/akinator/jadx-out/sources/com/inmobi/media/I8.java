package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I8 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N8 f31869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2903n8 f31871c;

    public I8(N8 n82, ArrayList arrayList, C2903n8 c2903n8) {
        this.f31869a = n82;
        this.f31870b = arrayList;
        this.f31871c = c2903n8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        this.f31869a.f32062l.a(this.f31870b);
        C2734d8 c2734d8 = this.f31869a.f32052b;
        C2903n8 c2903n8A = c2734d8.a(c2734d8.f32741b, this.f31871c);
        C2903n8 c2903n8 = this.f31871c;
        C2734d8 c2734d82 = this.f31869a.f32052b;
        if (c2903n8A == null) {
            c2903n8A = c2903n8;
        }
        c2903n8.a("creativeView", c2734d82.a(c2903n8A), (V7) null, this.f31869a.f32056f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        v10.removeOnAttachStateChangeListener(this);
        C2727d1 c2727d1 = this.f31869a.f32062l;
        ArrayList arrayList = this.f31870b;
        c2727d1.getClass();
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C2710c1) it.next()).f32697a.cancel();
        }
        c2727d1.f32729b.removeAll(arrayList);
    }
}
