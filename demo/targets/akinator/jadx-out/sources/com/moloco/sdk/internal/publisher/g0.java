package com.moloco.sdk.internal.publisher;

import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f46263a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.r f46264b;

    /* renamed from: c, reason: collision with root package name */
    public u f46265c;

    /* renamed from: d, reason: collision with root package name */
    public Job f46266d;

    /* renamed from: e, reason: collision with root package name */
    public m0 f46267e;

    public g0() {
        this(null, null, null, null, null, 31, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a() {
        return this.f46263a;
    }

    public final Job b() {
        return this.f46266d;
    }

    public final u c() {
        return this.f46265c;
    }

    public final m0 d() {
        return this.f46267e;
    }

    public final com.moloco.sdk.internal.ortb.model.r e() {
        return this.f46264b;
    }

    public g0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar, com.moloco.sdk.internal.ortb.model.r rVar2, u uVar, Job job, m0 m0Var) {
        this.f46263a = rVar;
        this.f46264b = rVar2;
        this.f46265c = uVar;
        this.f46266d = job;
        this.f46267e = m0Var;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar) {
        this.f46263a = rVar;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.r rVar) {
        this.f46264b = rVar;
    }

    public final void a(u uVar) {
        this.f46265c = uVar;
    }

    public final void a(Job job) {
        this.f46266d = job;
    }

    public final void a(m0 m0Var) {
        this.f46267e = m0Var;
    }

    public /* synthetic */ g0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar, com.moloco.sdk.internal.ortb.model.r rVar2, u uVar, Job job, m0 m0Var, int i10, kotlin.jvm.internal.u uVar2) {
        this((i10 & 1) != 0 ? null : rVar, (i10 & 2) != 0 ? null : rVar2, (i10 & 4) != 0 ? null : uVar, (i10 & 8) != 0 ? null : job, (i10 & 16) != 0 ? null : m0Var);
    }
}
