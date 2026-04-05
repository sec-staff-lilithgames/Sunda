package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f29573d;

    public c(ClockFaceView clockFaceView) {
        this.f29573d = clockFaceView;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            cVar.setTraversalAfter((View) this.f29573d.f29530j.get(iIntValue - 1));
        }
        cVar.setCollectionItemInfo(y3.k.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        cVar.setClickable(true);
        cVar.addAction(c.a.f94039g);
    }

    @Override // x3.b
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.performAccessibilityAction(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f29573d;
        view.getHitRect(clockFaceView.f29527g);
        float fCenterX = clockFaceView.f29527g.centerX();
        float fCenterY = clockFaceView.f29527g.centerY();
        clockFaceView.f29526f.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f29526f.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
