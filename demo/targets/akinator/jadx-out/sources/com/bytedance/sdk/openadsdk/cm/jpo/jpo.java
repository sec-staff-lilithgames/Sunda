package com.bytedance.sdk.openadsdk.cm.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static final jd jpo = new jd(0);

    /* renamed from: jd, reason: collision with root package name */
    public static final jd f19553jd = new jd(1);
    public static final jd wqx = new jd(2);

    /* renamed from: cm, reason: collision with root package name */
    public static final jd f19552cm = new jd(0);
    public static final jd my = new jd(1);

    /* renamed from: jj, reason: collision with root package name */
    public static final jd f19554jj = new jd(2);

    public static void jd() {
        try {
            com.bytedance.sdk.openadsdk.prr.wqx.jd("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.prr.wqx.jd("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.prr.wqx.jd("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.prr.wqx.jd("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.prr.wqx.jd("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.prr.wqx.jd("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    public static void jpo(jd jdVar, boolean z10, int i10, long j10) {
        try {
            jdVar.f19547qk.getAndSet(true);
            if (z10) {
                jdVar.jpo.incrementAndGet();
                jdVar.wqx.addAndGet(j10);
                return;
            }
            jdVar.f19545jd.incrementAndGet();
            Integer num = jdVar.f19546jj.get(Integer.valueOf(i10));
            if (num != null) {
                jdVar.f19546jj.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
            } else {
                jdVar.f19546jj.put(Integer.valueOf(i10), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(jd jdVar, boolean z10) {
        try {
            jdVar.f19547qk.getAndSet(true);
            if (z10) {
                jdVar.jpo.incrementAndGet();
            } else {
                jdVar.f19545jd.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(jd jdVar) {
        try {
            jdVar.f19547qk.getAndSet(true);
            jdVar.my.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void jpo() {
        try {
            jd jdVar = jpo;
            if (jdVar.f19547qk.get()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", jdVar.jpo().toString());
            }
            jd jdVar2 = f19553jd;
            if (jdVar2.f19547qk.get()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_net_state", "tt_sdk_event_net_state", jdVar2.jpo().toString());
            }
            jd jdVar3 = wqx;
            if (jdVar3.f19547qk.get()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", jdVar3.jpo().toString());
            }
            jd jdVar4 = f19552cm;
            if (jdVar4.f19547qk.get()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", jdVar4.jd().toString());
            }
            jd jdVar5 = my;
            if (jdVar5.f19547qk.get()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_db_state", "tt_sdk_event_db_state", jdVar5.jd().toString());
            }
            jd jdVar6 = f19554jj;
            if (jdVar6.f19547qk.get()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", jdVar6.jd().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
