package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3281j5 implements C7 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f36994e = 5;

    /* renamed from: f, reason: collision with root package name */
    private static C3281j5 f36995f;

    /* renamed from: a, reason: collision with root package name */
    private HandlerC3264i5 f36996a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f36997b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f36998c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36999d;

    private C3281j5(String str, V7 v72, JSONObject jSONObject) {
        this.f36999d = str;
        this.f36996a = new HandlerC3264i5(v72.a());
        this.f36997b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C3281j5 a(String str, V7 v72, JSONObject jSONObject) {
        try {
            if (f36995f == null) {
                f36995f = new C3281j5(str, v72, jSONObject);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f36995f;
    }

    private Thread b(C8 c82, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f36997b.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f36997b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f36997b.optBoolean(C3227g4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C3228g5(c82, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), zOptBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.f36998c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f36995f = null;
        HandlerC3264i5 handlerC3264i5 = this.f36996a;
        if (handlerC3264i5 != null) {
            handlerC3264i5.a();
            this.f36996a = null;
        }
    }

    @Override // com.ironsource.C7
    public void a(Pc pc2) {
        this.f36996a.a(pc2);
    }

    private Thread a(C3228g5 c3228g5, Handler handler) {
        return new Thread(new RunnableC3417qf(c3228g5, handler));
    }

    @Override // com.ironsource.C7
    public void a(C8 c82, String str, int i10, int i11, Handler handler) {
        b(c82, str, i10, i11, handler).start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f36999d, C3227g4.D);
    }

    @Override // com.ironsource.C7
    public void a(C8 c82, String str, int i10, int i11) {
        b(c82, str, i10, i11, this.f36996a).start();
    }

    @Override // com.ironsource.C7
    public void a(C8 c82, String str) {
        int iOptInt = this.f36997b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f36997b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f36997b.optBoolean(C3227g4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C3228g5(c82, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f36996a);
        this.f36998c = threadA;
        threadA.start();
    }

    public String a() {
        return this.f36999d;
    }
}
