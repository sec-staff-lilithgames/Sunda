package ej;

import android.app.Activity;
import android.view.View;
import bj.b1;
import bj.z0;
import nj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f54410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f54411c;

    public b(j jVar, Activity activity) {
        this.f54411c = jVar;
        this.f54410b = activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j jVar = this.f54411c;
        b1 b1Var = jVar.f54435n;
        if (b1Var != null) {
            ((q) b1Var).messageDismissed(z0.f9691e);
        }
        j.a(jVar, this.f54410b);
    }
}
