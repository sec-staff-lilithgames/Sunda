package e6;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j1 extends h1 {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f53829k = true;

    @Override // e6.d1
    public void setTransitionVisibility(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i10);
        } else if (f53829k) {
            try {
                i1.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f53829k = false;
            }
        }
    }
}
