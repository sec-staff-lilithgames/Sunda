package com.bytedance.sdk.openadsdk.core.ju.jj;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.cm.au;
import com.bytedance.adsdk.ugeno.cm.ju;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements au {
    @Override // com.bytedance.adsdk.ugeno.cm.au
    public boolean jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, MotionEvent motionEvent, ju juVar, com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar2) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (jpo(wqxVar.ju(), motionEvent.getX(), motionEvent.getY()) && juVar != null) {
                juVar.jpo(wqxVar, wqxVar2.cm(), wqxVar2.jj().jd());
            }
        }
        return true;
    }

    private boolean jpo(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
