package yq;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import br.g0;
import br.x1;
import br.z1;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j extends RelativeLayout {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends RelativeLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f94819a;

        /* renamed from: b, reason: collision with root package name */
        public final int f94820b;

        /* renamed from: c, reason: collision with root package name */
        public float f94821c;

        /* renamed from: d, reason: collision with root package name */
        public float f94822d;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f94821c = 1.0f;
            this.f94822d = 1.0f;
            this.f94819a = i10;
            this.f94820b = i11;
        }

        public void a(float f10) {
            this.f94822d = f10;
        }

        public void b(float f10) {
            this.f94821c = f10;
        }

        public void a(Context context, g0 g0Var, List<dq.h> list) {
            b(g0Var.getWidthPercent());
            a(g0Var.getHeightPercent());
            setMargins(g0Var.getMarginLeftPx(context), g0Var.getMarginTopPx(context), -g0Var.getMarginRightPx(context), -g0Var.getMarginBottomPx(context));
            x1 topSideBindParams = g0Var.getTopSideBindParams();
            x1 bottomSideBindParams = g0Var.getBottomSideBindParams();
            if (g0Var.getWidthPx(context) <= 0 || topSideBindParams == null || bottomSideBindParams == null) {
                b(topSideBindParams, z1.Top, 6, 3, 10, list);
                b(bottomSideBindParams, z1.Bottom, 8, 2, 12, list);
            } else {
                addRule(15);
            }
            x1 leftSideBindParams = g0Var.getLeftSideBindParams();
            x1 rightSideBindParams = g0Var.getRightSideBindParams();
            if (g0Var.getHeightPx(context) > 0 && leftSideBindParams != null && rightSideBindParams != null) {
                addRule(14);
            } else {
                b(leftSideBindParams, z1.Left, 5, 1, 9, list);
                b(rightSideBindParams, z1.Right, 7, 0, 11, list);
            }
        }

        public final void b(x1 x1Var, z1 z1Var, int i10, int i11, int i12, List list) {
            if (x1Var == null) {
                return;
            }
            String targetName = x1Var.getTargetName();
            View viewJ = null;
            if (!TextUtils.isEmpty(targetName)) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dq.h hVar = (dq.h) it.next();
                    if (hVar.h().getName().equals(targetName)) {
                        viewJ = hVar.j();
                        break;
                    }
                }
            }
            if (viewJ == null) {
                addRule(i12);
                return;
            }
            if (x1Var.getTargetSideType() != z1Var) {
                i10 = i11;
            }
            addRule(i10, viewJ.getId());
        }
    }

    public j(Context context) {
        super(context);
    }

    public static Integer a(int i10, float f10, int i11, int i12) {
        if (i10 <= 0) {
            if (i10 == -1) {
                i10 = i11;
            } else {
                if (i10 != -2 || i12 == 0) {
                    return null;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return Integer.valueOf(Math.round(i10 * f10));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Integer numA;
        Integer numA2;
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                float f10 = aVar.f94821c;
                if (f10 > 0.0f && f10 < 1.0f && (numA2 = a(aVar.f94819a, f10, size, childAt.getMeasuredWidth())) != null) {
                    ((RelativeLayout.LayoutParams) aVar).width = numA2.intValue();
                }
                float f11 = aVar.f94822d;
                if (f11 > 0.0f && f11 < 1.0f && (numA = a(aVar.f94820b, f11, size2, childAt.getMeasuredHeight())) != null) {
                    ((RelativeLayout.LayoutParams) aVar).height = numA.intValue();
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
