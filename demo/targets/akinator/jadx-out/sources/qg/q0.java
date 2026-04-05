package qg;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class q0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f83221a;

    public q0(View view) {
        this.f83221a = view;
    }

    @Override // qg.m0
    public void add(Drawable drawable) {
        this.f83221a.getOverlay().add(drawable);
    }

    @Override // qg.m0
    public void remove(Drawable drawable) {
        this.f83221a.getOverlay().remove(drawable);
    }
}
