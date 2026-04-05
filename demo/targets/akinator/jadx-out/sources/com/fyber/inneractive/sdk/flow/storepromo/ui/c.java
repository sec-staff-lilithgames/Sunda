package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import b0.e2;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public View f23882a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f23883b;

    /* renamed from: c, reason: collision with root package name */
    public final Animation f23884c;

    /* renamed from: d, reason: collision with root package name */
    public final Animation f23885d;

    /* renamed from: e, reason: collision with root package name */
    public b f23886e;

    /* renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f23887f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23888g;

    /* renamed from: h, reason: collision with root package name */
    public int f23889h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final a f23890i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) throws Resources.NotFoundException {
        float f10;
        this.f23882a = view;
        this.f23884c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.f23885d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        o oVar = IAConfigManager.O.f23226u.f23394b;
        oVar.getClass();
        try {
            f10 = Float.parseFloat(oVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f10 = 0.7f;
        }
        this.f23888g = Math.max(f10, 0.7f);
        this.f23887f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f23883b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f23883b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.f23882a.setLayoutParams(e2.e(-1, -2, 12));
        this.f23883b.setVisibility(8);
        ViewGroup viewGroup2 = this.f23883b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f23883b.addView(this.f23882a);
        }
        if (this.f23886e == null) {
            b bVar2 = new b(this);
            this.f23886e = bVar2;
            com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iC = com.fyber.inneractive.sdk.util.o.c();
        if (iC == this.f23889h || (view = this.f23882a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.f23889h = iC;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23882a.getLayoutParams();
        layoutParams.height = iC == 2 ? com.fyber.inneractive.sdk.util.o.e() : (int) (com.fyber.inneractive.sdk.util.o.d() * this.f23888g);
        this.f23882a.setLayoutParams(layoutParams);
    }
}
