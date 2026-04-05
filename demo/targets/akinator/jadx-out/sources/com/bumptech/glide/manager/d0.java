package com.bumptech.glide.manager;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import ph.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile d0 f16628d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16629a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16630b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16631c;

    public d0(Object obj) {
        this.f16630b = obj;
    }

    public static d0 b(Context context) {
        if (f16628d == null) {
            synchronized (d0.class) {
                try {
                    if (f16628d == null) {
                        Context applicationContext = context.getApplicationContext();
                        d0 d0Var = new d0();
                        d0Var.f16631c = new HashSet();
                        d0Var.f16630b = new c0(j9.k.memorize(new x(applicationContext)), new y(d0Var));
                        f16628d = d0Var;
                    }
                } finally {
                }
            }
        }
        return f16628d;
    }

    public void a(boolean z10) {
        ((u0) this.f16631c).f81355e.add(((StringBuilder) this.f16630b).toString());
        this.f16630b = new StringBuilder();
        this.f16629a = false;
    }

    public void c(ScheduledFuture scheduledFuture) {
        synchronized (this.f16630b) {
            try {
                if (!this.f16629a) {
                    this.f16631c = scheduledFuture;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
