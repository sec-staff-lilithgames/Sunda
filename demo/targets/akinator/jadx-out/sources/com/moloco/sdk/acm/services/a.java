package com.moloco.sdk.acm.services;

import androidx.lifecycle.b1;
import androidx.lifecycle.r;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements r {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.eventprocessing.d f45651b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f45652c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.acm.services.a$a, reason: collision with other inner class name */
    public static final class C0362a extends n implements p {
        public C0362a(zu.d<? super C0362a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C0362a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return a.this.new C0362a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            a.this.f45651b.a();
            return x0.f87415a;
        }
    }

    public a(com.moloco.sdk.acm.eventprocessing.d dbWorkRequest, CoroutineScope scope) {
        e0.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        e0.checkNotNullParameter(scope, "scope");
        this.f45651b = dbWorkRequest;
        this.f45652c = scope;
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStart(b1 b1Var) {
        super.onStart(b1Var);
    }

    @Override // androidx.lifecycle.r
    public void onStop(b1 owner) {
        e0.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        f.a(f.f45659a, "ApplicationLifecycleObserver", "Application onStop", false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(this.f45652c, null, null, new C0362a(null), 3, null);
    }
}
