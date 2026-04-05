package com.fyber.inneractive.sdk.util;

import com.ironsource.Q6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f26802b;

    public q1(s1 s1Var, String str) {
        this.f26802b = s1Var;
        this.f26801a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26802b.f26813c.getSharedPreferences("fyber.ua", 0).edit().putString(Q6.f35252d0, this.f26801a).apply();
    }
}
