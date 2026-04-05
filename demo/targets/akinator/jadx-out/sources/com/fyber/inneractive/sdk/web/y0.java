package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f26995a;

    /* renamed from: b, reason: collision with root package name */
    public float f26996b;

    /* renamed from: c, reason: collision with root package name */
    public float f26997c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26998d;

    public y0(x0 x0Var, Context context) {
        this.f26995a = x0Var;
        this.f26998d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f26995a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((i) this.f26995a).i();
                this.f26996b = motionEvent.getX();
                this.f26997c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((i) this.f26995a).i();
                this.f26997c = -1.0f;
                this.f26996b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f10 = this.f26996b;
                if (f10 >= 0.0f && this.f26997c >= 0.0f) {
                    float fRound = Math.round(Math.abs(f10 - motionEvent.getX()));
                    float fRound2 = Math.round(Math.abs(this.f26997c - motionEvent.getY()));
                    float f11 = this.f26998d;
                    if (fRound < f11 && fRound2 < f11) {
                        i iVar = (i) this.f26995a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.f26889l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.f26889l.d();
                            d dVar = iVar.f26890m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar);
                            }
                            iVar.f26889l = null;
                            iVar.i();
                        } else {
                            if (iVar.f26891n != null) {
                                com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(iVar.f26891n, IAConfigManager.O.f23226u.f23394b.a(PcrIk.LRdyko, 1000, 1000));
                            }
                            iVar.f26887j = true;
                        }
                    }
                    this.f26996b = -1.0f;
                    this.f26997c = -1.0f;
                }
            }
        }
        return false;
    }
}
