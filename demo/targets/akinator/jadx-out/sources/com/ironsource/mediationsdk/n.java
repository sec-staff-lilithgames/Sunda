package com.ironsource.mediationsdk;

import com.ironsource.C3249h8;
import com.ironsource.C3471u2;
import com.ironsource.Ed;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: f, reason: collision with root package name */
    private static final n f37629f = new n();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f37630a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f37631b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private int f37632c;

    /* renamed from: d, reason: collision with root package name */
    private int f37633d;

    /* renamed from: e, reason: collision with root package name */
    private int f37634e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSource.a f37635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f37636b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37637c;

        public a(IronSource.a aVar, IronSourceError ironSourceError, String str) {
            this.f37635a = aVar;
            this.f37636b = ironSourceError;
            this.f37637c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f37635a, this.f37636b);
            n.this.f37631b.put(this.f37637c, Boolean.FALSE);
        }
    }

    private n() {
    }

    public static synchronized n a() {
        return f37629f;
    }

    public synchronized void b(IronSource.a aVar, IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        String string = aVar.toString();
        if (!this.f37630a.containsKey(string)) {
            a(aVar, ironSourceError);
            return;
        }
        long jA = a(aVar) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f37630a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(aVar, ironSourceError);
            return;
        }
        this.f37631b.put(string, Boolean.TRUE);
        long j10 = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j10);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(aVar, ironSourceError, string), j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.a aVar, IronSourceError ironSourceError) {
        this.f37630a.put(aVar.toString(), Long.valueOf(System.currentTimeMillis()));
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            Ed.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.f37252c) {
            C3249h8.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            C3471u2.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public void a(IronSource.a aVar, int i10) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f37633d = i10;
            return;
        }
        if (aVar == IronSource.a.f37252c) {
            this.f37632c = i10;
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f37634e = i10;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public synchronized boolean b(IronSource.a aVar) {
        if (!this.f37631b.containsKey(aVar.toString())) {
            return false;
        }
        return this.f37631b.get(aVar.toString()).booleanValue();
    }

    private int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return this.f37633d;
        }
        if (aVar == IronSource.a.f37252c) {
            return this.f37632c;
        }
        if (aVar == IronSource.a.BANNER) {
            return this.f37634e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }
}
