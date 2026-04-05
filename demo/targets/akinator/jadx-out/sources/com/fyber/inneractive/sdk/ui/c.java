package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f26737a;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f26737a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f26737a.f26715q = this.f26737a.f26712n.getWidth() + r1.f26712n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f26737a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.f26733k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.f26715q *= -1.0f;
        }
        fyberAdIdentifierLocal.f26712n.setTranslationX(fyberAdIdentifierLocal.f26715q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f26737a;
        if (fyberAdIdentifierLocal2.f26713o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
