package com.google.firebase.messaging;

import android.os.Bundle;
import com.applovin.impl.ga;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f29892a;

    /* renamed from: b, reason: collision with root package name */
    public final y f29893b;

    /* renamed from: c, reason: collision with root package name */
    public final Rpc f29894c;

    /* renamed from: d, reason: collision with root package name */
    public final sj.c f29895d;

    /* renamed from: e, reason: collision with root package name */
    public final sj.c f29896e;

    /* renamed from: f, reason: collision with root package name */
    public final tj.f f29897f;

    public v(com.google.firebase.g gVar, y yVar, sj.c cVar, sj.c cVar2, tj.f fVar) {
        Rpc rpc = new Rpc(gVar.getApplicationContext());
        this.f29892a = gVar;
        this.f29893b = yVar;
        this.f29894c = rpc;
        this.f29895d = cVar;
        this.f29896e = cVar2;
        this.f29897f = fVar;
    }

    public final Task a(Task task) {
        return task.continueWith(new ga(2), new af.g(this, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.v.b(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final Task c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f29894c.send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }
}
