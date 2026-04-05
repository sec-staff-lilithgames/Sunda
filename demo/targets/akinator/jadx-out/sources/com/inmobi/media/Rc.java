package com.inmobi.media;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Rc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Oc f32217a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc f32218b;

    public Rc(Oc request, Pc pc2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        this.f32217a = request;
        this.f32218b = pc2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.f0, kv.l] */
    public static final void a(Rc this$0, Sc response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "$response");
        Oc request = this$0.f32217a;
        request.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        W9 w92 = request.f32111l;
        if (w92 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
            Z9 response2 = J4.a(response);
            X9 request2 = w92.f32450a;
            kotlin.jvm.internal.e0.checkNotNullParameter(response2, "response");
            kotlin.jvm.internal.e0.checkNotNullParameter(request2, "request");
            w92.f32451b.invoke(response2);
        }
        request.f32111l = null;
        Set set = Qc.f32173a;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        try {
            Qc.f32173a.remove(request);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32217a.getClass();
        int i10 = R9.f32214a;
        Sc scA = R9.a(this.f32217a, this.f32218b);
        S9 s92 = scA.f32272a;
        if ((s92 != null ? s92.f32266a : null) != EnumC3017u4.f33430m) {
            ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
            zk.n runnable = new zk.n(8, this, scA);
            executorC3020u7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            executorC3020u7.f33447a.post(runnable);
            this.f32217a.getClass();
        }
    }
}
