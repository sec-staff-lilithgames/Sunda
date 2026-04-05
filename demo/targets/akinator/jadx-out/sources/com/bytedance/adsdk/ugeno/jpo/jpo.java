package com.bytedance.adsdk.ugeno.jpo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.jpo.jpo.jpo;
import com.bytedance.adsdk.ugeno.jpo.wqx;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends AnimatorListenerAdapter {

    /* renamed from: cm, reason: collision with root package name */
    private Context f17876cm;

    /* renamed from: jd, reason: collision with root package name */
    private wqx f17877jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f17878jj = 1;
    private com.bytedance.adsdk.ugeno.jd.wqx jpo;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jpo.jpo.jpo f17879qk;
    private ValueAnimator wqx;
    private String xyk;
    private jd zz;

    public jpo(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, wqx wqxVar2) {
        this.jpo = wqxVar;
        this.f17877jd = wqxVar2;
        this.f17876cm = context;
    }

    public ValueAnimator cm() {
        String key;
        com.bytedance.adsdk.ugeno.jpo.jd.jpo wqxVar;
        wqx wqxVar2 = this.f17877jd;
        if (wqxVar2 == null || this.jpo == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapJd = wqxVar2.jd();
        ArrayList arrayList = new ArrayList();
        if (mapJd != null && !mapJd.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapJd.entrySet()) {
                if (entry != null) {
                    key = entry.getKey();
                    String strWqx = my.jpo(key).wqx();
                    strWqx.getClass();
                    switch (strWqx) {
                        case "int":
                            wqxVar = new com.bytedance.adsdk.ugeno.jpo.jd.wqx(this.f17876cm, this.jpo, key, entry.getValue());
                            break;
                        case "float":
                            wqxVar = new com.bytedance.adsdk.ugeno.jpo.jd.jd(this.f17876cm, this.jpo, key, entry.getValue());
                            break;
                        case "point":
                            wqxVar = new com.bytedance.adsdk.ugeno.jpo.jd.cm(this.f17876cm, this.jpo, key, entry.getValue());
                            break;
                        default:
                            wqxVar = null;
                            break;
                    }
                    if (wqxVar != null) {
                        arrayList.addAll(wqxVar.my());
                    }
                }
            }
        }
        JSONObject jSONObjectJpo = this.f17877jd.jpo();
        if (jSONObjectJpo != null) {
            com.bytedance.adsdk.ugeno.jpo.jpo.jpo jpoVarJpo = jpo.C0065jpo.jpo(this.jpo, jSONObjectJpo);
            this.f17879qk = jpoVarJpo;
            if (jpoVarJpo != null) {
                arrayList.addAll(jpoVarJpo.wqx());
            }
        }
        final View viewJu = this.jpo.ju();
        if (viewJu == null) {
            return null;
        }
        final wqx.jpo jpoVarQk = this.f17877jd.qk();
        if (jpoVarQk != null) {
            viewJu.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jpo.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewJu.getWidth();
                    int height = viewJu.getHeight();
                    viewJu.setPivotX(cm.jpo(jpoVarQk.jpo, width));
                    viewJu.setPivotY(cm.jpo(jpoVarQk.f17915jd, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewJu, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.my = cm.jpo(this.f17877jd.cm());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f17877jd.wqx());
        int i10 = this.my;
        if (i10 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i10);
        }
        this.f17878jj = this.f17877jd.yd();
        this.xyk = this.f17877jd.zz();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.f17877jd.jj());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(cm.jpo(this.f17877jd.my()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(cm.jd(this.f17877jd.xyk()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.wqx = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void jd() {
        ValueAnimator valueAnimator = this.wqx;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void jpo() {
        ValueAnimator valueAnimator = this.wqx;
        if (valueAnimator == null || this.f17878jj == 0 || this.my == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public String my() {
        return this.xyk;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        jd jdVar = this.zz;
        if (jdVar != null) {
            jdVar.jd();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        jd jdVar = this.zz;
        if (jdVar != null) {
            jdVar.jpo();
        }
    }

    public void wqx() {
        ValueAnimator valueAnimator = this.wqx;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void jd(Canvas canvas) {
        com.bytedance.adsdk.ugeno.jpo.jpo.jpo jpoVar = this.f17879qk;
        if (jpoVar != null) {
            jpoVar.jd(canvas);
        }
    }

    public void jpo(jd jdVar) {
        this.zz = jdVar;
    }

    public void jpo(Canvas canvas) {
        com.bytedance.adsdk.ugeno.jpo.jpo.jpo jpoVar = this.f17879qk;
        if (jpoVar != null) {
            jpoVar.jpo(canvas);
        }
    }

    public void jpo(int i10, int i11) {
        com.bytedance.adsdk.ugeno.jpo.jpo.jpo jpoVar = this.f17879qk;
        if (jpoVar != null) {
            jpoVar.jpo(i10, i11);
        }
    }
}
