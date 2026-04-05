package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import i4.m;
import x3.z1;
import y3.c;
import yf.i;
import yf.j;
import yf.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.a {

    /* renamed from: b, reason: collision with root package name */
    public m f28939b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28940c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28941e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28943g;

    /* renamed from: f, reason: collision with root package name */
    public float f28942f = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f28944h = 2;

    /* renamed from: i, reason: collision with root package name */
    public float f28945i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    public float f28946j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f28947k = 0.5f;

    /* renamed from: l, reason: collision with root package name */
    public final i f28948l = new i(this);

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        m mVar = this.f28939b;
        if (mVar != null) {
            return mVar.getViewDragState();
        }
        return 0;
    }

    public k getListener() {
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f28940c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f28940c = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f28940c = false;
        }
        if (zIsPointInChildBounds) {
            if (this.f28939b == null) {
                boolean z10 = this.f28943g;
                i iVar = this.f28948l;
                this.f28939b = z10 ? m.create(coordinatorLayout, this.f28942f, iVar) : m.create(coordinatorLayout, iVar);
            }
            if (!this.f28941e && this.f28939b.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v10, i10);
        if (v10.getImportantForAccessibility() == 0) {
            v10.setImportantForAccessibility(1);
            z1.removeAccessibilityAction(v10, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            if (canSwipeDismissView(v10)) {
                z1.replaceAccessibilityAction(v10, c.a.f94046n, null, new j(this));
            }
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f28939b == null) {
            return false;
        }
        if (this.f28941e && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f28939b.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f10) {
        this.f28945i = Math.min(Math.max(0.0f, f10), 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f10) {
        this.f28947k = Math.min(Math.max(0.0f, f10), 1.0f);
    }

    public void setSensitivity(float f10) {
        this.f28942f = f10;
        this.f28943g = true;
    }

    public void setStartAlphaSwipeDistance(float f10) {
        this.f28946j = Math.min(Math.max(0.0f, f10), 1.0f);
    }

    public void setSwipeDirection(int i10) {
        this.f28944h = i10;
    }

    public void setListener(k kVar) {
    }
}
