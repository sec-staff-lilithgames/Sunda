package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f24402a;

    public d0(f0 f0Var) {
        this.f24402a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        this.f24402a.f24417b.dismiss();
        v vVar = this.f24402a.f24416a;
        vVar.f24450b.d(vVar.f24449a);
    }
}
