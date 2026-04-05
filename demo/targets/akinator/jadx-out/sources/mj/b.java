package mj;

import android.view.View;
import hj.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {
    public static void a(View view, int i10, int i11, int i12, int i13) {
        t.logdPair("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i10 = 0;
            i11 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, i12), View.MeasureSpec.makeMeasureSpec(i11, i13));
        t.logdPair("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void measureAtMost(View view, int i10, int i11) {
        a(view, i10, i11, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static void measureExactly(View view, int i10, int i11) {
        a(view, i10, i11, 1073741824, 1073741824);
    }

    public static void measureFullHeight(View view, int i10, int i11) {
        a(view, i10, i11, Integer.MIN_VALUE, 1073741824);
    }

    public static void measureFullWidth(View view, int i10, int i11) {
        a(view, i10, i11, 1073741824, Integer.MIN_VALUE);
    }
}
