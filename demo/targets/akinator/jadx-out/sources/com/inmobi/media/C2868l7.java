package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2868l7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33047a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33048b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33049c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33050d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33051e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f33052f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f33053g;

    public C2868l7(Context context, String url, long j10, long j11, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f33047a = url;
        this.f33048b = j10;
        this.f33049c = j11;
        this.f33050d = i10;
        this.f33051e = i11;
        this.f33052f = new WeakReference(context);
        this.f33053g = new AtomicBoolean(false);
        a();
    }

    public final void a() {
        Context context = (Context) this.f33052f.get();
        if (context != null) {
            ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
            zk.n runnable = new zk.n(26, this, context);
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            AbstractC2969r7.f33307a.submit(runnable);
        }
    }

    public static final void a(C2868l7 this$0, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        if (this$0.f33053g.get()) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (!this$0.f33053g.get()) {
            int iA = V1.a(AbstractC2807hd.d(), null, null, 63);
            C2767f7 c2767f7D = AbstractC2807hd.d();
            c2767f7D.getClass();
            ArrayList arrayListA = V1.a(c2767f7D, "hasLoggerFinished=1", null, null, null, null, Integer.valueOf(iA), 30);
            C2851k7 action = new C2851k7(this$0, context);
            kotlin.jvm.internal.e0.checkNotNullParameter(arrayListA, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
            Iterator it = uu.y0.filterNotNull(arrayListA).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
        }
        ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
        AbstractC2953q7.a(AbstractC2807hd.d(), Calendar.getInstance().getTimeInMillis() - this$0.f33049c, this$0.f33051e);
    }

    public final void a(Context context, String str, C2750e7 c2750e7) {
        List<String> listEmptyList;
        String[] list;
        int i10;
        if (this.f33053g.get()) {
            return;
        }
        if (c2750e7.f32810d == 0 || System.currentTimeMillis() - c2750e7.f32810d >= this.f33048b) {
            Z9 z9B = new C2885m7(str, c2750e7).b();
            if (z9B.b() && (i10 = c2750e7.f32809c + 1) < this.f33050d) {
                S9 s92 = z9B.f32602d;
                if ((s92 != null ? s92.f32266a : null) != EnumC3017u4.f33436s) {
                    C2750e7 c2750e72 = new C2750e7(c2750e7.f32807a, c2750e7.f32808b, i10, System.currentTimeMillis(), false, 0, 48);
                    AbstractC2807hd.d().b(c2750e72);
                    ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
                    long j10 = this.f33048b;
                    zk.p0 runnable = new zk.p0(0, this, context, str, c2750e72);
                    kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
                    AbstractC2969r7.f33307a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            AbstractC2986s7.a(c2750e7.f32807a);
            AbstractC2807hd.d().a(c2750e7);
            Context context2 = (Context) this.f33052f.get();
            if (context2 != null) {
                ScheduledExecutorService scheduledExecutorService2 = AbstractC2969r7.f33307a;
                kotlin.jvm.internal.e0.checkNotNullParameter(context2, "context");
                String directoryPath = context2.getFilesDir() + "/logging";
                kotlin.jvm.internal.e0.checkNotNullParameter(directoryPath, "directoryPath");
                File file = new File(directoryPath);
                if (!file.exists() || !file.isDirectory() || (list = file.list()) == null || (listEmptyList = uu.k0.toList(list)) == null) {
                    listEmptyList = uu.p0.emptyList();
                }
                for (String fileName : listEmptyList) {
                    C2767f7 c2767f7D = AbstractC2807hd.d();
                    c2767f7D.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(fileName, "fileName");
                    if (V1.a(c2767f7D, j1.o2.f(AbstractJsonLexerKt.STRING, "filename=\"", fileName), null, null, null, null, null, 62).isEmpty()) {
                        AbstractC2986s7.a(fileName);
                    }
                }
            }
        }
    }

    public static final void a(C2868l7 this$0, Context context, String url, C2750e7 updatedData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        kotlin.jvm.internal.e0.checkNotNullParameter(updatedData, "$updatedData");
        this$0.a(context, url, updatedData);
    }
}
