package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr {

    /* renamed from: cm, reason: collision with root package name */
    private float f20939cm;

    /* renamed from: jj, reason: collision with root package name */
    private int f20941jj;
    private final jpo jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f20942ju;
    private float my;

    /* renamed from: qk, reason: collision with root package name */
    private int f20943qk;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f20940jd = false;
    private boolean wqx = false;
    private boolean xyk = true;
    private boolean zz = false;

    /* renamed from: yd, reason: collision with root package name */
    private final View.OnTouchListener f20944yd = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jr.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (jr.this.jpo.dt()) {
                return !jr.this.wqx;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                jr jrVar = jr.this;
                jrVar.f20942ju = jrVar.jpo(motionEvent);
                jr.this.f20939cm = x10;
                jr.this.my = y10;
                jr.this.f20941jj = (int) x10;
                jr.this.f20943qk = (int) y10;
                jr.this.xyk = true;
                if (jr.this.jpo != null && jr.this.wqx) {
                    jr.this.jpo.jpo(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - jr.this.f20941jj) > 20.0f || Math.abs(y10 - jr.this.f20943qk) > 20.0f) {
                    jr.this.xyk = false;
                }
                jr.this.xyk = true;
                jr.this.zz = false;
                jr.this.f20939cm = 0.0f;
                jr.this.my = 0.0f;
                jr.this.f20941jj = 0;
                if (jr.this.jpo != null) {
                    jr.this.jpo.jpo(view, jr.this.xyk);
                }
                jr.this.f20942ju = false;
            } else if (action == 3) {
                jr.this.f20942ju = false;
            }
            return !jr.this.wqx;
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        boolean dt();

        void jpo(View view, boolean z10);
    }

    public jr(jpo jpoVar) {
        this.jpo = jpoVar;
    }

    public void jpo(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f20944yd);
        }
    }

    public void jpo(boolean z10) {
        this.wqx = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iWqx = va.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo().getApplicationContext());
        int iMy = va.my(com.bytedance.sdk.openadsdk.core.sq.jpo().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iWqx;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iMy;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
