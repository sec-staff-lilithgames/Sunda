package com.applovin.impl.sdk.ad;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.f5;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import x3.e3;
import x3.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements t.a, q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15367c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15369f;

    public /* synthetic */ f(b bVar, MotionEvent motionEvent, boolean z10, boolean z11) {
        this.f15368e = bVar;
        this.f15369f = motionEvent;
        this.f15366b = z10;
        this.f15367c = z11;
    }

    @Override // t.a, jd.j
    public Object apply(Object obj) {
        return ((b) this.f15368e).a((MotionEvent) this.f15369f, this.f15366b, this.f15367c, (f5) obj);
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        return AppConsentActivity.applyWindowInsetsListener$lambda$3((AppConsentActivity) this.f15368e, this.f15366b, (AppConsentTheme) this.f15369f, this.f15367c, view, e3Var);
    }

    public /* synthetic */ f(AppConsentActivity appConsentActivity, boolean z10, AppConsentTheme appConsentTheme, boolean z11) {
        this.f15368e = appConsentActivity;
        this.f15366b = z10;
        this.f15369f = appConsentTheme;
        this.f15367c = z11;
    }
}
