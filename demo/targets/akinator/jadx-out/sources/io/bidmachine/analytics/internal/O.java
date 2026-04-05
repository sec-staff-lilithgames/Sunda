package io.bidmachine.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import io.bidmachine.analytics.internal.AbstractC3872e;
import io.bidmachine.analytics.internal.AbstractC3874g;
import io.bidmachine.analytics.internal.q0;
import java.util.Map;
import java.util.UUID;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class O extends AbstractC3872e {

    /* renamed from: k, reason: collision with root package name */
    public static final a f59919k = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private d f59921i;

    /* renamed from: h, reason: collision with root package name */
    private final String f59920h = "mimp";

    /* renamed from: j, reason: collision with root package name */
    private final tu.o f59922j = tu.q.lazy(e.f59928a);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements AppLovinCommunicatorSubscriber {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3873f f59923a;

        /* renamed from: b, reason: collision with root package name */
        private final tu.o f59924b = tu.q.lazy(a.f59925a);

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f59925a = new a();

            public a() {
                super(0);
            }

            @Override // kv.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }

        public c(InterfaceC3873f interfaceC3873f) {
            this.f59923a = interfaceC3873f;
        }

        private final String a() {
            return (String) this.f59924b.getValue();
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return a();
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            Object q0Var;
            try {
                int i10 = tu.z.f87419c;
                if (appLovinCommunicatorMessage != null && kotlin.jvm.internal.e0.areEqual("max_revenue_events", appLovinCommunicatorMessage.getTopic())) {
                    Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                    if (messageData == null || messageData.size() <= 0) {
                        this.f59923a.a(new q0("mimp", q0.a.MONITOR_NO_CONTENT, null, 4, null));
                        return;
                    }
                    try {
                        this.f59923a.a(s0.a(messageData));
                        q0Var = x0.f87415a;
                    } catch (Throwable th2) {
                        q0Var = new q0("mimp", q0.a.MONITOR_BAD_CONTENT, s0.a(th2));
                    }
                    tu.z.m7131constructorimpl(q0Var);
                }
            } catch (Throwable th3) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements AppLovinBroadcastManager.Receiver {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f59926a;

        /* renamed from: b, reason: collision with root package name */
        private volatile AppLovinCommunicatorSubscriber f59927b;

        public final void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
            this.f59927b = appLovinCommunicatorSubscriber;
        }

        @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
        public void onReceive(Intent intent, Map map) {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber;
            if (this.f59926a && (intent instanceof AppLovinCommunicatorMessage) && (appLovinCommunicatorSubscriber = this.f59927b) != null) {
                appLovinCommunicatorSubscriber.onMessageReceived((AppLovinCommunicatorMessage) intent);
            }
        }

        public final void a(boolean z10) {
            this.f59926a = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f59928a = new e();

        public e() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b();
        }
    }

    private final AppLovinCommunicatorSubscriber c() {
        return (AppLovinCommunicatorSubscriber) this.f59922j.getValue();
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public String a() {
        return this.f59920h;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void d(Context context) {
        d dVar = new d();
        AppLovinBroadcastManager.registerReceiver(dVar, new IntentFilter("max_revenue_events"));
        this.f59921i = dVar;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void e(Context context) {
        d dVar = this.f59921i;
        if (dVar != null) {
            dVar.a(false);
        }
        AppLovinCommunicator.getInstance(context).unsubscribe(c(), "max_revenue_events");
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3872e, io.bidmachine.analytics.internal.AbstractC3877j
    public void f(Context context) {
        super.f(context);
        d dVar = this.f59921i;
        if (dVar != null) {
            dVar.a(true);
        }
        AppLovinCommunicator.getInstance(context).subscribe(c(), "max_revenue_events");
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    /* renamed from: a */
    public void b(AbstractC3874g.a aVar) {
        super.b(aVar);
        d dVar = this.f59921i;
        if (dVar == null) {
            return;
        }
        dVar.a(new c(this));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3872e
    public AbstractC3872e.b b(Map map) {
        String string;
        Float fA = a0.a(map.get("revenue"));
        if (fA != null) {
            float fFloatValue = fA.floatValue();
            Object obj = map.get("network_name");
            if (obj != null && (string = obj.toString()) != null) {
                return new AbstractC3872e.b(0, fFloatValue, string, 1, null);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r3.equals(com.ironsource.mediationsdk.l.f37554a) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r3.equals("REWARDED_INTERSTITIAL") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r3.equals("REWARDED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        return io.bidmachine.analytics.internal.AbstractC3872e.a.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r3.equals("INTER") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r3.equals("MREC") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r3.equals("INTERSTITIAL") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        return io.bidmachine.analytics.internal.AbstractC3872e.a.INTERSTITIAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        if (r3.equals("LEADER") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        return io.bidmachine.analytics.internal.AbstractC3872e.a.BANNER;
     */
    @Override // io.bidmachine.analytics.internal.AbstractC3872e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.bidmachine.analytics.internal.AbstractC3872e.a c(java.util.Map r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ad_format"
            java.lang.Object r3 = r3.get(r0)
            r0 = 0
            if (r3 == 0) goto L74
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L74
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r1)
            if (r3 != 0) goto L18
            goto L74
        L18:
            int r1 = r3.hashCode()
            switch(r1) {
                case -2053424887: goto L68;
                case -1999289321: goto L5c;
                case -1372958932: goto L50;
                case 2374915: goto L47;
                case 69823676: goto L3e;
                case 543046670: goto L32;
                case 1854800829: goto L29;
                case 1951953708: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L70
        L20:
            java.lang.String r1 = "BANNER"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L71
            goto L70
        L29:
            java.lang.String r1 = "REWARDED_INTERSTITIAL"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3b
            goto L70
        L32:
            java.lang.String r1 = "REWARDED"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3b
            goto L70
        L3b:
            io.bidmachine.analytics.internal.e$a r3 = io.bidmachine.analytics.internal.AbstractC3872e.a.REWARDED
            return r3
        L3e:
            java.lang.String r1 = "INTER"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L59
            goto L70
        L47:
            java.lang.String r1 = "MREC"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L70
            goto L71
        L50:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L59
            goto L70
        L59:
            io.bidmachine.analytics.internal.e$a r3 = io.bidmachine.analytics.internal.AbstractC3872e.a.INTERSTITIAL
            return r3
        L5c:
            java.lang.String r1 = "NATIVE"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L65
            goto L70
        L65:
            io.bidmachine.analytics.internal.e$a r3 = io.bidmachine.analytics.internal.AbstractC3872e.a.NATIVE
            return r3
        L68:
            java.lang.String r1 = "LEADER"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L71
        L70:
            return r0
        L71:
            io.bidmachine.analytics.internal.e$a r3 = io.bidmachine.analytics.internal.AbstractC3872e.a.BANNER
            return r3
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.O.c(java.util.Map):io.bidmachine.analytics.internal.e$a");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements AppLovinCommunicatorSubscriber {
        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        }
    }
}
