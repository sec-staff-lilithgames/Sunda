package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f6384a = new o2();

    /* renamed from: b, reason: collision with root package name */
    public static final q2 f6385b;

    static {
        q2 q2Var = null;
        try {
            q2Var = (q2) e6.s.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6385b = q2Var;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z10, z.f fVar, boolean z11) {
        k3.i1 enterTransitionCallback = z10 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = fVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add((String) fVar.keyAt(i10));
                arrayList.add((View) fVar.valueAt(i10));
            }
            if (z11) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static void b(int i10, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }
}
