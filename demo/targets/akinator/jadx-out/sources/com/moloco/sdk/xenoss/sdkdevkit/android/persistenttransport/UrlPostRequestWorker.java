package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q0;
import kotlin.reflect.KProperty;
import uu.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UrlPostRequestWorker extends CoroutineWorker {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f50271b = {c1.property0(new q0(UrlPostRequestWorker.class, "url", "<v#0>", 0))};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public UrlPostRequestWorker f50272i;

        /* renamed from: j, reason: collision with root package name */
        public Map f50273j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f50274k;

        /* renamed from: m, reason: collision with root package name */
        public int f50276m;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f50274k = obj;
            this.f50276m |= Integer.MIN_VALUE;
            return UrlPostRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlPostRequestWorker(Context context, WorkerParameters params) {
        super(com.moloco.sdk.internal.android_context.b.a(context), params);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(params, "params");
    }

    public static final String a(Map<String, Object> map) {
        e0.checkNotNull(map);
        return (String) n1.getOrImplicitDefaultNullable(map, f50271b[0].getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(zu.d<? super n6.a0> r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlPostRequestWorker.doWork(zu.d):java.lang.Object");
    }
}
