package p2;

import android.text.Spannable;
import g2.a0;
import g2.b;
import g2.z;
import java.util.List;
import kotlin.jvm.internal.e0;
import s2.b0;
import s2.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final void setPlaceholders(Spannable spannable, List<b.C0570b> list, s2.e density) {
        int i10;
        int i11;
        List<b.C0570b> placeholders = list;
        e0.checkNotNullParameter(spannable, "<this>");
        e0.checkNotNullParameter(placeholders, "placeholders");
        e0.checkNotNullParameter(density, "density");
        int size = placeholders.size();
        int i12 = 0;
        while (i12 < size) {
            b.C0570b c0570b = placeholders.get(i12);
            z zVar = (z) c0570b.component1();
            int iComponent2 = c0570b.component2();
            int iComponent3 = c0570b.component3();
            float fM6994getValueimpl = s2.z.m6994getValueimpl(zVar.m4050getWidthXSAIIZE());
            long jM6993getTypeUIouoOA = s2.z.m6993getTypeUIouoOA(zVar.m4050getWidthXSAIIZE());
            b0 b0Var = c0.f85325b;
            int i13 = 2;
            if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA())) {
                i10 = i12;
                i11 = 0;
            } else {
                i10 = i12;
                i11 = c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA()) ? 1 : 2;
            }
            float fM6994getValueimpl2 = s2.z.m6994getValueimpl(zVar.m4048getHeightXSAIIZE());
            long jM6993getTypeUIouoOA2 = s2.z.m6993getTypeUIouoOA(zVar.m4048getHeightXSAIIZE());
            int i14 = size;
            int i15 = c0.m6765equalsimpl0(jM6993getTypeUIouoOA2, b0Var.m6742getSpUIouoOA()) ? 0 : c0.m6765equalsimpl0(jM6993getTypeUIouoOA2, b0Var.m6741getEmUIouoOA()) ? 1 : 2;
            float density2 = density.getDensity() * density.getFontScale();
            int iM4049getPlaceholderVerticalAlignJ6kI3mc = zVar.m4049getPlaceholderVerticalAlignJ6kI3mc();
            a0 a0Var = g2.b0.f56726b;
            if (g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3941getAboveBaselineJ6kI3mc())) {
                i13 = 0;
            } else if (g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3947getTopJ6kI3mc())) {
                i13 = 1;
            } else if (g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3942getBottomJ6kI3mc())) {
                continue;
            } else if (g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3943getCenterJ6kI3mc())) {
                i13 = 3;
            } else if (g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3946getTextTopJ6kI3mc())) {
                i13 = 4;
            } else if (g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3944getTextBottomJ6kI3mc())) {
                i13 = 5;
            } else {
                if (!g2.b0.m3969equalsimpl0(iM4049getPlaceholderVerticalAlignJ6kI3mc, a0Var.m3945getTextCenterJ6kI3mc())) {
                    throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                }
                i13 = 6;
            }
            f.setSpan(spannable, new j2.h(fM6994getValueimpl, i11, fM6994getValueimpl2, i15, density2, i13), iComponent2, iComponent3);
            i12 = i10 + 1;
            placeholders = list;
            size = i14;
        }
    }
}
