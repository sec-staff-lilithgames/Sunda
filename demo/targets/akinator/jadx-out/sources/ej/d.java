package ej;

import android.view.MotionEvent;
import android.view.View;
import bj.b1;
import bj.z0;
import nj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f54415b;

    public d(h hVar) {
        this.f54415b = hVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        h hVar = this.f54415b;
        b1 b1Var = hVar.f54422j.f54435n;
        if (b1Var != null) {
            ((q) b1Var).messageDismissed(z0.f9689b);
        }
        j.a(hVar.f54422j, hVar.f54420h);
        return true;
    }
}
