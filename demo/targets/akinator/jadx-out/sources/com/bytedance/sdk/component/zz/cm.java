package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final Context f19059cm;

    /* renamed from: jd, reason: collision with root package name */
    private final int f19060jd;

    /* renamed from: jj, reason: collision with root package name */
    private View.OnTouchListener f19061jj;
    private final View.OnTouchListener jpo;
    private final jj my;

    /* renamed from: qk, reason: collision with root package name */
    private long f19062qk = -1;
    private final long wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f19063yd;
    private float zz;

    public cm(Context context, View.OnTouchListener onTouchListener, int i10, long j10, jj jjVar) {
        this.f19059cm = context;
        this.jpo = onTouchListener;
        this.f19060jd = i10;
        this.wqx = j10;
        this.my = jjVar;
    }

    private boolean jpo(long j10) {
        long j11 = this.f19062qk;
        if (j11 == -1) {
            this.f19062qk = j10;
            return false;
        }
        int i10 = this.f19060jd;
        if (i10 == 1) {
            if (j10 - j11 <= this.wqx) {
                return true;
            }
            this.f19062qk = j10;
            return false;
        }
        if (i10 == 2) {
            if (j10 - j11 <= this.wqx) {
                this.f19062qk = j10;
                return true;
            }
            this.f19062qk = j10;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        cm cmVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            cmVar = this;
            cmVar.xyk = x10;
            cmVar.zz = y10;
        } else if (action != 1) {
            cmVar = this;
        } else {
            cmVar = this;
            if (cmVar.jpo(x10, y10, this.xyk, this.zz, this.f19059cm)) {
                if (jpo(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    jpo(1, x10, y10);
                } else {
                    jpo(0, x10, y10);
                }
            }
        }
        View.OnTouchListener onTouchListener = cmVar.jpo;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = cmVar.f19061jj;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void jpo(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f19060jd);
            jSONObject.put("lp_click_interval", this.wqx);
        } catch (Throwable th2) {
            nmd.jpo("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.zz.jpo.jpo.jpo().jd() != null) {
            com.bytedance.sdk.component.zz.jpo.jd jdVarJd = com.bytedance.sdk.component.zz.jpo.jpo.jpo().jd();
            jj jjVar = this.my;
            jdVarJd.jpo(jjVar != null ? jjVar.getMaterialMeta() : null, this.f19063yd, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void jpo(String str) {
        this.f19063yd = str;
    }

    @Override // com.bytedance.sdk.component.zz.wqx
    public void jpo(View.OnTouchListener onTouchListener) {
        this.f19061jj = onTouchListener;
    }
}
