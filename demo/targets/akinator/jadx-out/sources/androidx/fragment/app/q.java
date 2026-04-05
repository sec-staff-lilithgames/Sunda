package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends b3 {
    public static void j(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (x3.c2.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                j(childAt, arrayList);
            }
        }
    }

    public static void k(z.f fVar, View view) {
        String transitionName = x3.z1.getTransitionName(view);
        if (transitionName != null) {
            fVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(fVar, childAt);
                }
            }
        }
    }

    public static void l(z.f fVar, Collection collection) {
        Iterator<Map.Entry<Object, Object>> it = fVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(x3.z1.getTransitionName((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x09a5 A[LOOP:7: B:318:0x099f->B:320:0x09a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r40, boolean r41) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.b(java.util.ArrayList, boolean):void");
    }
}
