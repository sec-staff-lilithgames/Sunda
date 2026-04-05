package x3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import x3.e3;
import x3.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final s2.b f91700a;

    /* renamed from: b, reason: collision with root package name */
    public e3 f91701b;

    public w2(View view, s2.b bVar) {
        this.f91700a = bVar;
        e3 rootWindowInsets = z1.getRootWindowInsets(view);
        this.f91701b = rootWindowInsets != null ? new e3.a(rootWindowInsets).build() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.f91701b = e3.toWindowInsetsCompat(windowInsets, view);
            return x2.e(view, windowInsets);
        }
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(windowInsets, view);
        if (this.f91701b == null) {
            this.f91701b = z1.getRootWindowInsets(view);
        }
        if (this.f91701b == null) {
            this.f91701b = windowInsetsCompat;
            return x2.e(view, windowInsets);
        }
        s2.b bVarF = x2.f(view);
        if (bVarF != null && Objects.equals(bVarF.f91671b, windowInsetsCompat)) {
            return x2.e(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        e3 e3Var = this.f91701b;
        int i10 = 1;
        while (i10 <= 512) {
            o3.c insets = windowInsetsCompat.getInsets(i10);
            o3.c insets2 = e3Var.getInsets(i10);
            int i11 = insets.f77432a;
            int i12 = insets.f77435d;
            int i13 = insets.f77434c;
            int i14 = insets.f77433b;
            int i15 = insets2.f77432a;
            int i16 = insets2.f77435d;
            int i17 = insets2.f77434c;
            int i18 = insets2.f77433b;
            if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                iArr = iArr2;
                z10 = true;
            } else {
                iArr = iArr2;
                z10 = false;
            }
            if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z10) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr3[0] = iArr3[0] | i10;
                }
            }
            i10 <<= 1;
            iArr2 = iArr;
        }
        int i19 = iArr2[0];
        int i20 = iArr3[0];
        int i21 = i19 | i20;
        if (i21 == 0) {
            this.f91701b = windowInsetsCompat;
            return x2.e(view, windowInsets);
        }
        e3 e3Var2 = this.f91701b;
        s2 s2Var = new s2(i21, (t3.ime() & i19) != 0 ? x2.f91704f : (t3.ime() & i20) != 0 ? x2.f91705g : (i19 & t3.systemBars()) != 0 ? x2.f91706h : (t3.systemBars() & i20) != 0 ? x2.f91707i : null, (t3.ime() & i21) != 0 ? 160L : 250L);
        s2Var.setFraction(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(s2Var.getDurationMillis());
        o3.c insets3 = windowInsetsCompat.getInsets(i21);
        o3.c insets4 = e3Var2.getInsets(i21);
        int iMin = Math.min(insets3.f77432a, insets4.f77432a);
        int i22 = insets3.f77433b;
        int i23 = insets4.f77433b;
        int iMin2 = Math.min(i22, i23);
        int i24 = insets3.f77434c;
        int i25 = insets4.f77434c;
        int iMin3 = Math.min(i24, i25);
        int i26 = insets3.f77435d;
        int i27 = insets4.f77435d;
        s2.a aVar = new s2.a(o3.c.of(iMin, iMin2, iMin3, Math.min(i26, i27)), o3.c.of(Math.max(insets3.f77432a, insets4.f77432a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
        x2.b(view, s2Var, windowInsetsCompat, false);
        duration.addUpdateListener(new t2(s2Var, windowInsetsCompat, e3Var2, i21, view));
        duration.addListener(new u2(view, s2Var));
        t0.add(view, new v2(view, s2Var, aVar, duration));
        this.f91701b = windowInsetsCompat;
        return x2.e(view, windowInsets);
    }
}
