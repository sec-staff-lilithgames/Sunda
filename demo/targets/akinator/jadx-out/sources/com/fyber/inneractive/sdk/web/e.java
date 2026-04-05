package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.e f26856c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d f26857d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f26860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f26861h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f26862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f26863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f26864k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f26865l;

    /* renamed from: b, reason: collision with root package name */
    public Handler f26855b = null;

    /* renamed from: e, reason: collision with root package name */
    public final Object f26858e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f26859f = false;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f26854a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(i1 i1Var, String str, boolean z10, String str2, String str3, String str4) {
        this.f26865l = i1Var;
        this.f26860g = str;
        this.f26861h = z10;
        this.f26862i = str2;
        this.f26863j = str3;
        this.f26864k = str4;
    }

    public final Handler a() {
        if (this.f26855b == null) {
            synchronized (this.f26858e) {
                this.f26855b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f26855b;
    }
}
