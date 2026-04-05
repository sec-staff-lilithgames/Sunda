package com.fyber.inneractive.sdk.player.ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f26272a;

    public g(s sVar) {
        super(sVar.getContext());
        this.f26272a = new WeakReference(sVar);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s sVar = (s) v.a(this.f26272a);
        if (sVar instanceof i) {
            sVar = ((i) sVar).f26273y;
        }
        if (sVar != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(sVar.f26328t.f26780a, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(sVar.f26328t.f26781b, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
