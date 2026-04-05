package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f26280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f26281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f26283d;

    public q(s sVar, View view, int[] iArr, int i10) {
        this.f26283d = sVar;
        this.f26280a = view;
        this.f26281b = iArr;
        this.f26282c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) throws JSONException {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) throws JSONException {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) throws JSONException {
        if (motionEvent.getAction() == 0) {
            this.f26280a.getRootView().getLocationOnScreen(this.f26281b);
            float rawX = motionEvent.getRawX() - this.f26281b[0];
            float rawY = motionEvent.getRawY() - this.f26281b[1];
            g1 g1Var = this.f26283d.f26264a;
            g1Var.f26776a = rawX;
            g1Var.f26777b = rawY;
        }
        s sVar = this.f26283d;
        n nVar = sVar.f26270g;
        if (nVar != null) {
            ((z) nVar).a(this.f26282c, sVar.f26264a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
