package com.google.android.material.floatingactionbutton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import pg.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton.a f29280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f29281b;

    public c(FloatingActionButton floatingActionButton, FloatingActionButton.a aVar) {
        this.f29281b = floatingActionButton;
        this.f29280a = aVar;
    }

    @Override // pg.x
    public void onHidden() {
        this.f29280a.onHidden(this.f29281b);
    }

    @Override // pg.x
    public void onShown() {
        this.f29280a.onShown(this.f29281b);
    }
}
