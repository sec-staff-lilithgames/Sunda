package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s extends e {

    /* renamed from: i, reason: collision with root package name */
    public final int f26317i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26318j;

    /* renamed from: k, reason: collision with root package name */
    public final int f26319k;

    /* renamed from: l, reason: collision with root package name */
    public ViewGroup f26320l;

    /* renamed from: m, reason: collision with root package name */
    public Button f26321m;

    /* renamed from: n, reason: collision with root package name */
    public int f26322n;

    /* renamed from: o, reason: collision with root package name */
    public int f26323o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26324p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup f26325q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup f26326r;

    /* renamed from: s, reason: collision with root package name */
    public final h1 f26327s;

    /* renamed from: t, reason: collision with root package name */
    public h1 f26328t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f26329u;

    /* renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f26330v;

    /* renamed from: w, reason: collision with root package name */
    public final String f26331w;

    /* renamed from: x, reason: collision with root package name */
    public final h1 f26332x;

    public s(Context context, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context);
        this.f26322n = -1;
        this.f26323o = -1;
        this.f26324p = false;
        this.f26327s = new h1(0, 0);
        this.f26332x = new h1(0, 0);
        IAlog.a("%sctor called", IAlog.a(this));
        int tickFractions = getTickFractions();
        this.f26318j = tickFractions;
        this.f26317i = getMaxTickFactor();
        this.f26319k = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f26330v = rVar;
        this.f26331w = str;
    }

    public abstract void a(int i10, int i11);

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2);

    public abstract void a(boolean z10);

    public void a(boolean z10, int i10, int i11) {
        this.f26322n = i10;
        this.f26323o = i11;
        this.f26324p = z10;
    }

    public abstract void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z10, String str);

    public abstract void b(boolean z10);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean b() {
        return this.f26325q.getVisibility() == 0 || this.f26326r.getChildCount() > 0;
    }

    public abstract void c(boolean z10);

    public abstract void d(boolean z10);

    public void destroy() {
        h();
        setVisibility(8);
        if (this.f26270g != null) {
            this.f26270g = null;
        }
        IAlog.a("%sdestroyed called", IAlog.a(this));
    }

    public abstract void e(boolean z10);

    public abstract void f();

    public abstract void f(boolean z10);

    public abstract void g();

    public abstract void g(boolean z10);

    public ViewGroup getDefaultEndCardContainer() {
        return this.f26325q;
    }

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public ViewGroup getTextureHost() {
        return this.f26320l;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.f26323o;
    }

    public int getVideoWidth() {
        return this.f26322n;
    }

    public abstract void h();

    public abstract boolean i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        a(this.f26332x, size, size2);
        h1 h1Var = this.f26332x;
        int i12 = h1Var.f26780a;
        if (i12 <= 0 || h1Var.f26781b <= 0) {
            h1Var.f26780a = size;
            h1Var.f26781b = size2;
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(this.f26332x.f26781b, 1073741824);
            i10 = iMakeMeasureSpec;
        }
        if (!this.f26327s.equals(this.f26332x)) {
            h1 h1Var2 = this.f26327s;
            h1 h1Var3 = this.f26332x;
            h1Var2.getClass();
            h1Var2.f26780a = h1Var3.f26780a;
            h1Var2.f26781b = h1Var3.f26781b;
            o();
        }
        super.onMeasure(i10, i11);
    }

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z10);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            n nVar = this.f26270g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            ViewGroup viewGroup = fVar.f23566c;
            v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.f23559e, dVar.f23557c);
        }
    }

    public final void a(View view, int i10) {
        if (view != null) {
            view.setOnTouchListener(new r(new GestureDetector(view.getContext(), new q(this, view, new int[2], i10))));
        }
    }
}
