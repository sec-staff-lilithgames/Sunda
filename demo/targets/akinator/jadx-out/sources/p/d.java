package p;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f79981b;

    public d(h hVar) {
        this.f79981b = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        h hVar = this.f79981b;
        ArrayList arrayList = hVar.f79998k;
        if (!hVar.isShowing() || arrayList.size() <= 0 || ((h.a) arrayList.get(0)).f80014a.isModal()) {
            return;
        }
        View view = hVar.f80005r;
        if (view == null || !view.isShown()) {
            hVar.dismiss();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h.a) it.next()).f80014a.show();
        }
    }
}
