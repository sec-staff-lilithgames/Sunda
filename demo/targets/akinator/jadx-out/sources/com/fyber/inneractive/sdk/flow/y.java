package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.util.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f23959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f23960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f23961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f23962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f23963g;

    public y(b0 b0Var, Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z10, com.fyber.inneractive.sdk.click.o oVar) {
        this.f23963g = b0Var;
        this.f23957a = context;
        this.f23958b = str;
        this.f23959c = g1Var;
        this.f23960d = gVar;
        this.f23961e = z10;
        this.f23962f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23963g.a(this.f23957a, this.f23958b, this.f23959c, this.f23960d, this.f23961e, this.f23962f);
    }
}
