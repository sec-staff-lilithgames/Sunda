package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n2 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f14845a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f14846b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f14847c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f14848d;

    /* renamed from: e, reason: collision with root package name */
    private o2 f14849e;

    /* renamed from: f, reason: collision with root package name */
    private int f14850f;

    public void a(int i10) {
        this.f14850f = i10;
    }

    public o2 b() {
        return this.f14849e;
    }

    public int a() {
        return this.f14850f;
    }

    public void a(o2 o2Var) {
        this.f14849e = o2Var;
        this.f14845a.setText(o2Var.k());
        this.f14845a.setTextColor(o2Var.l());
        if (this.f14846b != null) {
            if (!TextUtils.isEmpty(o2Var.f())) {
                this.f14846b.setTypeface(null, 0);
                this.f14846b.setVisibility(0);
                this.f14846b.setText(o2Var.f());
                this.f14846b.setTextColor(o2Var.g());
                if (o2Var.p()) {
                    this.f14846b.setTypeface(null, 1);
                }
            } else {
                this.f14846b.setVisibility(8);
            }
        }
        if (this.f14847c != null) {
            if (o2Var.h() > 0) {
                this.f14847c.setImageResource(o2Var.h());
                this.f14847c.setColorFilter(o2Var.i());
                this.f14847c.setVisibility(0);
            } else {
                this.f14847c.setVisibility(8);
            }
        }
        if (this.f14848d != null) {
            if (o2Var.d() > 0) {
                this.f14848d.setImageResource(o2Var.d());
                this.f14848d.setColorFilter(o2Var.e());
                this.f14848d.setVisibility(0);
                return;
            }
            this.f14848d.setVisibility(8);
        }
    }
}
