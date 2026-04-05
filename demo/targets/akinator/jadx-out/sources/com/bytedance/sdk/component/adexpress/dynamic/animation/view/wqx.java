package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ju;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private int f18126cm;

    /* renamed from: jj, reason: collision with root package name */
    private int f18128jj;
    Paint jpo;
    private int my;

    /* renamed from: jd, reason: collision with root package name */
    Path f18127jd = new Path();
    Path wqx = new Path();

    public wqx() {
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(android.graphics.Canvas r21, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.wqx.jpo(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public void jpo(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.f18128jj * f10);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof ju) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i10).setTranslationX((-(this.f18128jj - layoutParams.width)) / 2);
                i10++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void jpo(View view, int i10, int i11) {
        String str;
        this.f18126cm = i10 / 2;
        this.my = i11 / 2;
        if (this.f18128jj == 0 && view.getLayoutParams().width > 0) {
            this.f18128jj = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.wqx.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.f18126cm * 2);
            view.setPivotY(this.my);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.my);
        } else {
            view.setPivotX(this.f18126cm);
            view.setPivotY(this.my);
        }
    }
}
