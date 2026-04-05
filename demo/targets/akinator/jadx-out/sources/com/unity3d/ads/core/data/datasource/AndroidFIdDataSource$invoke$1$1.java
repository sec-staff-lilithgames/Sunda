package com.unity3d.ads.core.data.datasource;

import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;
import zu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends n implements p {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, d<? super AndroidFIdDataSource$invoke$1$1> dVar) {
        super(2, dVar);
        this.$task = task;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final o oVar = new o(b.intercepted(this));
        final AndroidFIdDataSource$invoke$1$1$1$1 androidFIdDataSource$invoke$1$1$1$1 = new AndroidFIdDataSource$invoke$1$1$1$1(oVar);
        task.addOnSuccessListener(new OnSuccessListener(androidFIdDataSource$invoke$1$1$1$1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ l function;

            {
                e0.checkNotNullParameter(androidFIdDataSource$invoke$1$1$1$1, "function");
                this.function = androidFIdDataSource$invoke$1$1$1$1;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                e0.checkNotNullParameter(it, "it");
                d<String> dVar = oVar;
                int i11 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(it)));
            }
        });
        Object orThrow = oVar.getOrThrow();
        if (orThrow == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(this);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super String> dVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
