package com.bytedance.adsdk.jd.wqx.wqx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.jd.nmd;
import com.bytedance.adsdk.jd.yd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends cm {

    /* renamed from: if, reason: not valid java name */
    private String f20if;

    /* renamed from: ju, reason: collision with root package name */
    private final List<TextView> f17571ju;
    private LinearLayout xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final List<String> f17572yd;
    private final LinearLayout.LayoutParams zz;

    public wqx(com.bytedance.adsdk.jd.zz zzVar, my myVar, Context context) {
        List<yd.jpo> listWqx;
        super(zzVar, myVar);
        this.zz = new LinearLayout.LayoutParams(-2, -2);
        this.f17572yd = new ArrayList();
        this.f17571ju = new ArrayList();
        com.bytedance.adsdk.jd.yd ydVar = ((cm) this).f17527qk;
        if (ydVar == null || (listWqx = ydVar.wqx()) == null || listWqx.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.xyk = linearLayout;
        int i10 = 0;
        linearLayout.setOrientation(0);
        jd(listWqx.get(0).f17607qk);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.xyk.addView(linearLayout2);
        List<String> listM386if = m386if();
        while (i10 < listWqx.size()) {
            yd.jpo jpoVar = listWqx.get(i10);
            TextView textView = new TextView(context);
            jpo(textView, jpoVar, (listM386if == null || i10 >= listM386if.size()) ? "" : listM386if.get(i10));
            int i11 = jpoVar.f17606jj;
            if (i11 != 0) {
                this.zz.bottomMargin = (int) (com.bytedance.adsdk.jd.jj.jj.jpo() * i11);
                linearLayout2.addView(textView, this.zz);
            } else {
                linearLayout2.addView(textView);
            }
            i10++;
        }
        float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
        jpo(this.xyk, (int) (((cm) this).f17527qk.jpo() * fJpo), (int) (((cm) this).f17527qk.jd() * fJpo));
    }

    /* renamed from: if, reason: not valid java name */
    private List<String> m386if() {
        com.bytedance.adsdk.jd.zz zzVar;
        nmd nmdVarHmu;
        List<yd.jpo> listWqx;
        if (((cm) this).f17527qk == null || (zzVar = this.f17536jd) == null || (nmdVarHmu = zzVar.hmu()) == null) {
            return null;
        }
        String strCm = ((cm) this).f17527qk.cm();
        if ((!TextUtils.isEmpty(strCm) || !TextUtils.isEmpty(this.f20if)) && (listWqx = ((cm) this).f17527qk.wqx()) != null) {
            String strJpo = this.f20if;
            if (TextUtils.isEmpty(strJpo)) {
                strJpo = nmdVarHmu.jpo(strCm);
            }
            if (!TextUtils.isEmpty(strJpo)) {
                int length = strJpo.length();
                this.f17572yd.clear();
                for (int i10 = 0; i10 < listWqx.size(); i10++) {
                    yd.jpo jpoVar = listWqx.get(i10);
                    int iMax = jpoVar.jpo;
                    int iMax2 = jpoVar.f17605jd;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.f17572yd.add("");
                    } else {
                        if (listWqx.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.f17572yd.add(strJpo.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.f17572yd;
            }
        }
        return null;
    }

    private void jd(String str) {
        if (TextUtils.isEmpty(str)) {
            this.xyk.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals(TtmlNode.LEFT)) {
            this.xyk.setGravity(3);
        } else if (str.equals(TtmlNode.RIGHT)) {
            this.xyk.setGravity(5);
        } else {
            this.xyk.setGravity(17);
        }
    }

    private void jpo(TextView textView, yd.jpo jpoVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(jpoVar.wqx)) {
            textView.setTextColor(Color.parseColor(jpoVar.wqx));
        }
        if (!TextUtils.isEmpty(jpoVar.f17604cm)) {
            textView.setBackgroundColor(Color.parseColor(jpoVar.f17604cm));
        }
        textView.setGravity(17);
        textView.setTextSize(jpoVar.my);
    }

    private void wqx(float f10) {
        List<yd.jpo> listWqx;
        com.bytedance.adsdk.jd.yd ydVar = ((cm) this).f17527qk;
        if (ydVar == null || (listWqx = ydVar.wqx()) == null || listWqx.size() <= 0) {
            return;
        }
        this.xyk.setOrientation(0);
        this.xyk.setGravity(17);
        if (this.xyk.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.xyk.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.xyk.removeAllViews();
        if (linearLayout.getChildCount() != listWqx.size()) {
            return;
        }
        List<String> listM386if = m386if();
        this.f17571ju.clear();
        int i10 = 0;
        while (i10 < listWqx.size()) {
            yd.jpo jpoVar = listWqx.get(i10);
            TextView textView = (TextView) linearLayout.getChildAt(i10);
            this.f17571ju.add(textView);
            jpo(textView, jpoVar, (listM386if == null || i10 >= listM386if.size()) ? "" : listM386if.get(i10));
            i10++;
        }
        linearLayout.removeAllViews();
        for (int i11 = 0; i11 < listWqx.size(); i11++) {
            yd.jpo jpoVar2 = listWqx.get(i11);
            TextView textView2 = this.f17571ju.get(i11);
            textView2.setAlpha(f10);
            linearLayout.setAlpha(f10);
            int i12 = jpoVar2.f17606jj;
            if (i12 != 0) {
                this.zz.bottomMargin = (int) (com.bytedance.adsdk.jd.jj.jj.jpo() * i12);
                linearLayout.addView(textView2, this.zz);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.xyk.setAlpha(f10);
        this.xyk.addView(linearLayout);
        float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
        jpo(this.xyk, (int) (((cm) this).f17527qk.jpo() * fJpo), (int) (((cm) this).f17527qk.jd() * fJpo));
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.cm, com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        if (this.xyk != null) {
            canvas.save();
            canvas.concat(matrix);
            jpo(i10);
            wqx(jj());
            this.xyk.draw(canvas);
            canvas.restore();
            return;
        }
        super.jd(canvas, matrix, i10);
    }

    private static void jpo(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void jpo(String str) {
        this.f20if = str;
    }
}
