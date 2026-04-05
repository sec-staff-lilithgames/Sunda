package com.moloco.sdk.internal.publisher;

import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f f46689a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.r f46690b;

    /* renamed from: c, reason: collision with root package name */
    public u f46691c;

    /* renamed from: d, reason: collision with root package name */
    public Job f46692d;

    /* renamed from: e, reason: collision with root package name */
    public String f46693e;

    /* renamed from: f, reason: collision with root package name */
    public String f46694f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46695g;

    public v() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar) {
        this.f46689a = fVar;
    }

    public final u b() {
        return this.f46691c;
    }

    public final String c() {
        return this.f46694f;
    }

    public final String d() {
        return this.f46693e;
    }

    public final com.moloco.sdk.internal.ortb.model.r e() {
        return this.f46690b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f f() {
        return this.f46689a;
    }

    public final boolean g() {
        return this.f46695g;
    }

    public v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar, com.moloco.sdk.internal.ortb.model.r rVar, u uVar, Job job, String str, String str2, boolean z10) {
        this.f46689a = fVar;
        this.f46690b = rVar;
        this.f46691c = uVar;
        this.f46692d = job;
        this.f46693e = str;
        this.f46694f = str2;
        this.f46695g = z10;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.r rVar) {
        this.f46690b = rVar;
    }

    public final void b(String str) {
        this.f46693e = str;
    }

    public final void a(u uVar) {
        this.f46691c = uVar;
    }

    public final Job a() {
        return this.f46692d;
    }

    public final void a(Job job) {
        this.f46692d = job;
    }

    public final void a(String str) {
        this.f46694f = str;
    }

    public final void a(boolean z10) {
        this.f46695g = z10;
    }

    public /* synthetic */ v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar, com.moloco.sdk.internal.ortb.model.r rVar, u uVar, Job job, String str, String str2, boolean z10, int i10, kotlin.jvm.internal.u uVar2) {
        this((i10 & 1) != 0 ? null : fVar, (i10 & 2) != 0 ? null : rVar, (i10 & 4) != 0 ? null : uVar, (i10 & 8) != 0 ? null : job, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? false : z10);
    }
}
