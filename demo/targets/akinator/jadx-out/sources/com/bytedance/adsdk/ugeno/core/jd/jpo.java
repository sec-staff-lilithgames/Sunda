package com.bytedance.adsdk.ugeno.core.jd;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public String jpo = "GesThrough_";

    /* renamed from: jd, reason: collision with root package name */
    private List<MotionEvent> f17722jd = new ArrayList();
    private Set<String> wqx = Collections.synchronizedSet(new HashSet());

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, MotionEvent motionEvent) {
        if (wqxVar == null || motionEvent == null || this.f17722jd == null) {
            return;
        }
        this.jpo = "GesThrough_" + wqxVar.ef();
        int[] iArr = new int[2];
        wqxVar.ju().getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.f17722jd.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i10, i11);
        this.f17722jd.add(motionEventObtain);
    }

    public boolean jpo(MotionEvent motionEvent) {
        if (motionEvent == null || this.wqx == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.wqx.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        if (this.f17722jd.isEmpty() || this.wqx == null || wqxVar == null || wqxVar.ju() == null || wqxVar.ju().getRootView() == null) {
            return;
        }
        final View rootView = wqxVar.ju().getRootView();
        Log.d(this.jpo, "Re-dispatch motionEvents.size(): " + this.f17722jd.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.jd.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : jpo.this.f17722jd) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        jpo.this.wqx.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                jpo.this.f17722jd.clear();
            }
        }, 300L);
    }
}
