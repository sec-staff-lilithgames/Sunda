package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Wa {

    /* renamed from: a, reason: collision with root package name */
    public final Za f32452a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f32453b;

    /* renamed from: c, reason: collision with root package name */
    public final AdConfig.PingsV2Config f32454c;

    /* renamed from: d, reason: collision with root package name */
    public final Ua f32455d;

    public Wa(Za dao) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        this.f32452a = dao;
        this.f32453b = new ConcurrentHashMap();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        AdConfig.PingsV2Config pingsV2Config = ((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getPingsV2Config();
        this.f32454c = pingsV2Config;
        this.f32455d = new Ua(pingsV2Config);
    }

    public static void a(Ja ja2, short s10) {
        tu.x0 x0Var;
        Bc bc2 = ja2.f31923k;
        if (bc2 != null) {
            Hc hc2 = new Hc(bc2);
            String priority = ja2.f31917e;
            int i10 = ja2.f31919g;
            kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
            Map mapA = hc2.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            mapA.put("trigger", priority);
            mapA.put("retryCount", String.valueOf(i10));
            Ya.a("PingFailed", mapA);
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            TelemetryConfig telemetryConfig = Ya.f32581a;
            Ya.a("PingFailed", uu.p1.mutableMapOf(tu.e0.to("trigger", ja2.f31917e), tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)), tu.e0.to("retryCount", Integer.valueOf(ja2.f31919g))));
        }
    }

    public abstract void a(Ja ja2);

    public final void b(Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).execute(new zk.n(19, this, ping));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.inmobi.media.Na r19, com.inmobi.media.Va r20) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "pingResult"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "Wa"
            java.lang.String r2 = "getSimpleName(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            com.inmobi.media.Ja r1 = r0.f32074a
            java.lang.String r1 = r1.f31913a
            java.util.Objects.toString(r20)
            tu.x0 r2 = tu.x0.f87415a
            java.lang.String r3 = "latency"
            java.lang.String r4 = "priority"
            java.lang.String r5 = "ping"
            java.lang.String r6 = "PingSuccess"
            java.lang.String r7 = "trigger"
            if (r20 == 0) goto L81
            com.inmobi.media.Ja r8 = r0.f32074a
            int r11 = r0.f32075b
            long r13 = r0.f32077d
            r9 = r20
            com.inmobi.media.Sa r9 = (com.inmobi.media.Sa) r9
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r5)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f32271d
            boolean r10 = r10.get()
            if (r10 == 0) goto L39
            goto L7f
        L39:
            java.lang.String r10 = r8.f31913a
            java.lang.String r10 = r8.f31917e
            java.lang.String r12 = "high"
            boolean r10 = kotlin.jvm.internal.e0.areEqual(r12, r10)
            if (r10 == 0) goto L5d
            boolean r10 = r8.f31918f
            if (r10 == 0) goto L5d
            java.lang.String r10 = r8.f31914b
            com.inmobi.media.Ra r12 = r9.f32268a
            if (r12 == 0) goto L5d
            int r15 = r8.f31919g
            com.inmobi.media.sc r12 = (com.inmobi.media.C2991sc) r12
            r16 = r9
            r9 = r12
            r12 = 0
            r1 = r16
            r9.a(r10, r11, r12, r13, r15)
            goto L5e
        L5d:
            r1 = r9
        L5e:
            java.lang.String r9 = r8.f31917e
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r8.f31921i
            long r10 = r10 - r12
            com.inmobi.media.Hc r1 = r1.f32269b
            if (r1 == 0) goto L7f
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r4)
            java.util.Map r1 = r1.a()
            r1.put(r7, r9)
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r1.put(r3, r8)
            com.inmobi.media.Ya.a(r6, r1)
        L7f:
            r1 = r2
            goto L82
        L81:
            r1 = 0
        L82:
            if (r1 != 0) goto Lcd
            com.inmobi.media.Ja r1 = r0.f32074a
            com.inmobi.media.Bc r8 = r1.f31923k
            if (r8 == 0) goto Laa
            com.inmobi.media.Hc r9 = new com.inmobi.media.Hc
            r9.<init>(r8)
            java.lang.String r8 = r1.f31917e
            long r10 = r1.f31921i
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r4)
            java.util.Map r4 = r9.a()
            r4.put(r7, r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r4.put(r3, r8)
            com.inmobi.media.Ya.a(r6, r4)
            r17 = r2
            goto Lac
        Laa:
            r17 = 0
        Lac:
            if (r17 != 0) goto Lcd
            com.inmobi.commons.core.configs.TelemetryConfig r2 = com.inmobi.media.Ya.f32581a
            java.lang.String r2 = r1.f31917e
            tu.v r2 = tu.e0.to(r7, r2)
            int r1 = r1.f31919g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "retryCount"
            tu.v r1 = tu.e0.to(r3, r1)
            tu.v[] r1 = new tu.v[]{r2, r1}
            java.util.Map r1 = uu.p1.mutableMapOf(r1)
            com.inmobi.media.Ya.a(r6, r1)
        Lcd:
            r1 = r18
            com.inmobi.media.Za r2 = r1.f32452a
            com.inmobi.media.Ja r0 = r0.f32074a
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r5)
            java.lang.String r0 = r0.f31914b
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r3 = "id = ?"
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wa.b(com.inmobi.media.Na, com.inmobi.media.Va):void");
    }

    public final boolean a(String priority) {
        Ja jaA;
        kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
        if (V1.a(this.f32452a, null, null, 63) < this.f32454c.getMaxEntries()) {
            return true;
        }
        TelemetryConfig telemetryConfig = Ya.f32581a;
        Ya.a("PingDBMaxLimitReached", new LinkedHashMap());
        if (kotlin.jvm.internal.e0.areEqual(priority, "high")) {
            jaA = this.f32452a.a("normal");
            if (jaA == null) {
                jaA = this.f32452a.a("high");
            }
        } else {
            jaA = this.f32452a.a("normal");
        }
        if (jaA == null) {
            return false;
        }
        a(jaA, kotlin.jvm.internal.e0.areEqual(priority, "high") ? (short) 2259 : (short) 2260);
        return true;
    }

    public final void a(Na pingResult, Va va2) {
        int maxRetries;
        tu.v vVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(pingResult, "pingResult");
        Ja ping = pingResult.f32074a;
        String str = ping.f31913a;
        int i10 = pingResult.f32075b;
        C2950q4 c2950q4 = EnumC2983s4.f33355b;
        if (i10 != -22) {
            C2966r4 c2966r4 = EnumC3017u4.f33419b;
            if (i10 != -22) {
                int i11 = ping.f31919g + 1;
                if (kotlin.jvm.internal.e0.areEqual(ping.f31917e, "high")) {
                    maxRetries = this.f32454c.getRetryConfig().getHigh().getMaxRetries();
                } else {
                    maxRetries = this.f32454c.getRetryConfig().getNormal().getMaxRetries();
                }
                if (i11 > maxRetries) {
                    Za za2 = this.f32452a;
                    kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
                    za2.a("id = ?", new String[]{ping.f31914b});
                    a(pingResult.f32075b, pingResult.f32076c, (short) 2249, ping, pingResult.f32077d, va2);
                    return;
                }
                if (kotlin.jvm.internal.e0.areEqual(ping.f31917e, "high")) {
                    vVar = new tu.v(Long.valueOf(this.f32454c.getRetryConfig().getHigh().getRetryInterval()), Double.valueOf(this.f32454c.getRetryConfig().getHigh().getFactor()));
                } else {
                    vVar = new tu.v(Long.valueOf(this.f32454c.getRetryConfig().getNormal().getRetryInterval()), Double.valueOf(this.f32454c.getRetryConfig().getNormal().getFactor()));
                }
                Long lValueOf = Long.valueOf(System.currentTimeMillis() + ((long) (Math.pow(((Number) vVar.component2()).doubleValue(), i11) * ((Number) vVar.component1()).longValue() * 1000)));
                String url = ping.f31913a;
                String id2 = ping.f31914b;
                Map headers = ping.f31915c;
                boolean z10 = ping.f31916d;
                String priority = ping.f31917e;
                boolean z11 = ping.f31918f;
                String ownerId = ping.f31920h;
                long j10 = ping.f31921i;
                Bc bc2 = ping.f31923k;
                kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
                kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
                kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
                kotlin.jvm.internal.e0.checkNotNullParameter(ownerId, "ownerId");
                Ja ping2 = new Ja(url, id2, headers, z10, priority, z11, i11, ownerId, j10, lValueOf, bc2);
                Za za3 = this.f32452a;
                kotlin.jvm.internal.e0.checkNotNullParameter(ping2, "ping");
                za3.b(ping2, "id = ?", new String[]{id2});
                a(pingResult.f32075b, pingResult.f32076c, (short) 2247, ping, pingResult.f32077d, va2);
                return;
            }
        }
        Za za4 = this.f32452a;
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        za4.a("id = ?", new String[]{ping.f31914b});
        a(pingResult.f32075b, "Redirect URL is malformed", (short) 2258, pingResult.f32074a, pingResult.f32077d, va2);
    }

    public static void a(int i10, String str, short s10, Ja ping, long j10, Va va2) {
        tu.x0 x0Var;
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Wa", "getSimpleName(...)");
        String str2 = ping.f31913a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Wa", "getSimpleName(...)");
        Objects.toString(va2);
        int i12 = ping.f31919g;
        if (va2 != null) {
            Sa sa2 = (Sa) va2;
            kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
            if (!sa2.f32271d.get()) {
                if (kotlin.jvm.internal.e0.areEqual("high", ping.f31917e) && ping.f31918f && (i11 = ping.f31919g) < 1) {
                    String str3 = ping.f31914b;
                    Ra ra2 = sa2.f32268a;
                    if (ra2 != null) {
                        ((C2991sc) ra2).a(str3, i10, str, j10, i11);
                    }
                }
                String priority = ping.f31917e;
                Hc hc2 = sa2.f32269b;
                if (hc2 != null) {
                    if (priority == null) {
                        priority = "unknown";
                    }
                    kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
                    Map mapA = hc2.a();
                    mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2247);
                    mapA.put(GalEuEfxjome.VzZVcjVUKSA, priority);
                    mapA.put("retryCount", String.valueOf(i12));
                    Ya.a("PingFailed", mapA);
                }
            }
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            a(ping, s10);
        }
    }

    public static final void a(Wa this$0, Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "$ping");
        this$0.a(ping);
    }
}
