package x3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public e3 f91643a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f91644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f91645c;

    public m1(View view, q0 q0Var) {
        this.f91644b = view;
        this.f91645c = q0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(windowInsets, view);
        int i10 = Build.VERSION.SDK_INT;
        q0 q0Var = this.f91645c;
        if (i10 < 30) {
            n1.a(windowInsets, this.f91644b);
            if (windowInsetsCompat.equals(this.f91643a)) {
                return q0Var.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
            }
        }
        this.f91643a = windowInsetsCompat;
        e3 e3VarOnApplyWindowInsets = q0Var.onApplyWindowInsets(view, windowInsetsCompat);
        if (i10 >= 30) {
            return e3VarOnApplyWindowInsets.toWindowInsets();
        }
        z1.requestApplyInsets(view);
        return e3VarOnApplyWindowInsets.toWindowInsets();
    }
}
