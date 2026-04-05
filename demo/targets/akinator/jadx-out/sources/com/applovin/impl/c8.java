package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13785a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13786b;

    /* renamed from: c, reason: collision with root package name */
    private final View f13787c;

    public c8(View view, com.applovin.impl.sdk.k kVar) {
        this.f13785a = kVar;
        this.f13786b = kVar.O();
        this.f13787c = view;
    }

    public long a(e3 e3Var) {
        long j10;
        if (com.applovin.impl.sdk.o.a()) {
            this.f13786b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = o0.b(this.f13787c.getContext());
        if (this.f13787c.isShown()) {
            j10 = 0;
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f13787c.getAlpha() < e3Var.d0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f13787c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f13787c.getParent() == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f13787c.getContext(), this.f13787c.getWidth());
        if (iPxToDp < Math.min(e3Var.j0(), pointB.x)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f13787c.getContext(), this.f13787c.getHeight());
        if (iPxToDp2 < e3Var.f0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f13787c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f13787c.getWidth() + i10, this.f13787c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity activityB = this.f13785a.e().b();
        if (activityB != null && !b8.a(this.f13787c, activityB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13786b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13786b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
