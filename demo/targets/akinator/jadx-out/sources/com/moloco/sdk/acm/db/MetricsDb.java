package com.moloco.sdk.acm.db;

import android.content.Context;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o5.s0;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class MetricsDb extends y0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a f45510m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static volatile MetricsDb f45511n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public final MetricsDb a(Context context) {
            try {
                Context applicationContext = context.getApplicationContext();
                e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return (MetricsDb) s0.databaseBuilder(applicationContext, MetricsDb.class, "metrics-db").build();
            } catch (Exception e10) {
                throw new IllegalStateException("Database creation failed", e10);
            }
        }

        public final MetricsDb b(Context context) {
            MetricsDb metricsDbA;
            e0.checkNotNullParameter(context, "context");
            MetricsDb metricsDb = MetricsDb.f45511n;
            if (metricsDb != null) {
                return metricsDb;
            }
            synchronized (this) {
                metricsDbA = MetricsDb.f45511n;
                if (metricsDbA == null) {
                    metricsDbA = MetricsDb.f45510m.a(context);
                    MetricsDb.f45511n = metricsDbA;
                }
            }
            return metricsDbA;
        }

        public a() {
        }
    }

    public abstract e b();
}
