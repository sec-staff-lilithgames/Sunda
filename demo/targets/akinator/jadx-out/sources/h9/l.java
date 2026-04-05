package h9;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final k f58709a;

    public l(k kVar) {
        this.f58709a = kVar;
    }

    @Override // h9.c
    public boolean transition(Object obj, b bVar) {
        View view = bVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f58709a.build(view.getContext()));
        return false;
    }
}
