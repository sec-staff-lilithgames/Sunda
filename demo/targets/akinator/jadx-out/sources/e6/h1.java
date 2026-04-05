package e6;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h1 extends f1 {

    /* renamed from: j, reason: collision with root package name */
    public static boolean f53819j = true;

    @Override // e6.d1
    public void setLeftTopRightBottom(View view, int i10, int i11, int i12, int i13) {
        if (f53819j) {
            try {
                g1.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f53819j = false;
            }
        }
    }
}
