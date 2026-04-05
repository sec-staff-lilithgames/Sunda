package ar;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import br.h0;
import cr.t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7924b;

    public a(List<e> list) {
        this.f7924b = new CopyOnWriteArrayList(list);
    }

    @Override // ar.e
    public void destroy(Runnable runnable) {
        Handler handlerCreateHandlerWithMyOrMainLooper = t.createHandlerWithMyOrMainLooper();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7924b;
        cr.c cVar = runnable != null ? new cr.c(copyOnWriteArrayList.size(), new androidx.browser.customtabs.g(this, 1, handlerCreateHandlerWithMyOrMainLooper, runnable)) : null;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((e) it.next()).destroy(cVar);
        }
    }

    @Override // ar.e
    public void onClicked() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onClicked();
        }
    }

    @Override // ar.e
    public void onError(h0 h0Var) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onError(h0Var);
        }
    }

    @Override // ar.e
    public void onShown() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onShown();
        }
    }

    @Override // ar.e
    public void onViewAddedToContainer(View view, ViewGroup viewGroup) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onViewAddedToContainer(view, viewGroup);
        }
    }

    @Override // ar.e
    public void onViewCreated(View view) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onViewCreated(view);
        }
    }

    @Override // ar.e
    public void onViewReady(View view) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onViewReady(view);
        }
    }
}
