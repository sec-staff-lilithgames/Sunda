package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.ironsource.Q6;
import com.moloco.sdk.acm.db.MetricsDb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DBRequestWorker extends CoroutineWorker {

    /* renamed from: b, reason: collision with root package name */
    public final String f45548b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.e f45549c;

    /* renamed from: e, reason: collision with root package name */
    public final String f45550e;

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f45551f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public DBRequestWorker f45552i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f45553j;

        /* renamed from: l, reason: collision with root package name */
        public int f45555l;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45553j = obj;
            this.f45555l |= Integer.MIN_VALUE;
            return DBRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBRequestWorker(Context context, WorkerParameters params) {
        super(context, params);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(params, "params");
        this.f45548b = "DBRequestWorker";
        this.f45549c = MetricsDb.f45510m.b(context).b();
        this.f45550e = getInputData().getString("url");
        Map mapMapOf = p1.mapOf(tu.e0.to("AppKey", getInputData().getString("AppKey")), tu.e0.to("AppBundle", getInputData().getString("AppBundle")), tu.e0.to("AppVersion", getInputData().getString("AppVersion")), tu.e0.to("OS", getInputData().getString("OS")), tu.e0.to(Q6.G, getInputData().getString(Q6.G)), tu.e0.to("SdkVersion", getInputData().getString("SdkVersion")), tu.e0.to("Mediator", getInputData().getString("Mediator")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f45551f = new com.moloco.sdk.acm.http.b().a((String) linkedHashMap.get("SdkVersion"), (String) linkedHashMap.get(Q6.G), (String) linkedHashMap.get("AppKey"), (String) linkedHashMap.get("AppBundle"), (String) linkedHashMap.get("AppVersion"), (String) linkedHashMap.get("Mediator"));
    }

    public final kv.l a() {
        return this.f45551f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(zu.d<? super n6.a0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a r0 = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a) r0
            int r1 = r0.f45555l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45555l = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a r0 = new com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f45553j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45555l
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker r1 = r0.f45552i
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Exception -> L30
            tu.z r10 = (tu.z) r10     // Catch: java.lang.Exception -> L30
            r10.m7139unboximpl()     // Catch: java.lang.Exception -> L30
            goto L74
        L30:
            r0 = move-exception
            r10 = r0
            goto L79
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            tu.a0.throwOnFailure(r10)
            java.lang.String r10 = r9.f45550e
            if (r10 == 0) goto L73
            com.moloco.sdk.acm.http.c r2 = com.moloco.sdk.acm.http.c.f45621a     // Catch: java.lang.Exception -> L6f
            io.ktor.client.HttpClient r4 = com.moloco.sdk.acm.http.d.c()     // Catch: java.lang.Exception -> L6f
            r2.a(r4, r10)     // Catch: java.lang.Exception -> L6f
            com.moloco.sdk.acm.eventprocessing.k r10 = new com.moloco.sdk.acm.eventprocessing.k     // Catch: java.lang.Exception -> L6f
            com.moloco.sdk.acm.http.f r2 = r2.a()     // Catch: java.lang.Exception -> L6f
            com.moloco.sdk.acm.db.e r4 = r9.f45549c     // Catch: java.lang.Exception -> L6f
            com.moloco.sdk.acm.eventprocessing.g r5 = new com.moloco.sdk.acm.eventprocessing.g     // Catch: java.lang.Exception -> L6f
            com.moloco.sdk.acm.services.i r6 = new com.moloco.sdk.acm.services.i     // Catch: java.lang.Exception -> L6f
            r6.<init>()     // Catch: java.lang.Exception -> L6f
            r7 = 720(0x2d0, double:3.557E-321)
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L6f
            kv.l r6 = r9.f45551f     // Catch: java.lang.Exception -> L6f
            r10.<init>(r2, r4, r5, r6)     // Catch: java.lang.Exception -> L6f
            r0.f45552i = r9     // Catch: java.lang.Exception -> L6f
            r0.f45555l = r3     // Catch: java.lang.Exception -> L6f
            java.lang.Object r10 = r10.a(r0)     // Catch: java.lang.Exception -> L6f
            if (r10 != r1) goto L73
            return r1
        L6f:
            r0 = move-exception
            r10 = r0
            r1 = r9
            goto L79
        L73:
            r1 = r9
        L74:
            n6.a0 r10 = n6.a0.success()     // Catch: java.lang.Exception -> L30
            return r10
        L79:
            com.moloco.sdk.acm.services.f r2 = com.moloco.sdk.acm.services.f.f45659a
            java.lang.String r3 = r1.f45548b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Work Manager failure: "
            r0.<init>(r1)
            java.lang.String r4 = b0.e2.l(r10, r0)
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            com.moloco.sdk.acm.services.f.a(r2, r3, r4, r5, r6, r7, r8)
            n6.a0 r10 = n6.a0.failure()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.DBRequestWorker.doWork(zu.d):java.lang.Object");
    }
}
