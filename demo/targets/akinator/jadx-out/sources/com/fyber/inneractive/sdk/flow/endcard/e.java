package com.fyber.inneractive.sdk.flow.endcard;

import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f23562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.n f23563b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f23564c = new int[2];

    /* renamed from: d, reason: collision with root package name */
    public final g1 f23565d = new g1();

    public e(int i10, com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.f23562a = i10;
        this.f23563b = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) throws JSONException {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        view.getRootView().getLocationOnScreen(this.f23564c);
        float rawX = motionEvent.getRawX() - this.f23564c[0];
        float rawY = motionEvent.getRawY() - this.f23564c[1];
        g1 g1Var = this.f23565d;
        g1Var.f26776a = rawX;
        g1Var.f26777b = rawY;
        ((z) this.f23563b).a(this.f23562a, g1Var);
        return true;
    }
}
