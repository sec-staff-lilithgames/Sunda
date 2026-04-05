package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class CallableC3557z3 implements Callable<D3> {

    /* renamed from: a, reason: collision with root package name */
    private final int f39332a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39333b;

    /* renamed from: c, reason: collision with root package name */
    private final AdData f39334c;

    /* renamed from: d, reason: collision with root package name */
    private final B3 f39335d;

    /* renamed from: e, reason: collision with root package name */
    private final A3 f39336e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkSettings f39337f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.z3$a */
    public class a implements BiddingDataCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3317l5 f39338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f39339b;

        public a(C3317l5 c3317l5, BlockingQueue blockingQueue) {
            this.f39338a = c3317l5;
            this.f39339b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f39339b.add(new D3(CallableC3557z3.this.d(), CallableC3557z3.this.c(), null, C3317l5.a(this.f39338a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f39339b.add(new D3(CallableC3557z3.this.d(), CallableC3557z3.this.c(), map, C3317l5.a(this.f39338a), null));
        }
    }

    public CallableC3557z3(int i10, String str, AdData adData, B3 b32, A3 a32, NetworkSettings networkSettings) {
        this.f39332a = i10;
        this.f39333b = str;
        this.f39334c = adData;
        this.f39335d = b32;
        this.f39336e = a32;
        this.f39337f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public D3 call() throws Exception {
        C3317l5 c3317l5 = new C3317l5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f39334c, ContextProvider.getInstance().getActiveContext(), new a(c3317l5, arrayBlockingQueue));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            String strL = b0.e2.l(e10, new StringBuilder("Exception while calling collectBiddingData - "));
            IronLog.INTERNAL.error(strL);
            A3 a32 = this.f39336e;
            if (a32 != null) {
                a32.a(strL);
            }
        } catch (NoClassDefFoundError e11) {
            C3422r4.d().a(e11);
            String str = "Error while calling collectBiddingData - " + e11.getMessage();
            IronLog.INTERNAL.error(str);
            A3 a33 = this.f39336e;
            if (a33 != null) {
                a33.a(str);
            }
        }
        A3 a34 = this.f39336e;
        if (a34 != null) {
            a34.a(this.f39337f);
        }
        return (D3) arrayBlockingQueue.take();
    }

    public B3 b() {
        return this.f39335d;
    }

    public String c() {
        return this.f39333b;
    }

    public int d() {
        return this.f39332a;
    }
}
