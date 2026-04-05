package e6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public c0 f53834b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f53835c;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fd A[EDGE_INSN: B:154:0x01fd->B:91:0x01fd BREAK  A[LOOP:1: B:19:0x0088->B:90:0x01f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.l0.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f53835c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        m0.f53844e.remove(viewGroup);
        ArrayList arrayList = (ArrayList) m0.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).resume(viewGroup);
            }
        }
        this.f53834b.e(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
