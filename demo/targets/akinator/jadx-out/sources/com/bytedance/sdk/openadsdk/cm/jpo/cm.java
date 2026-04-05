package com.bytedance.sdk.openadsdk.cm.jpo;

import android.content.Context;
import com.bytedance.sdk.component.jj.jpo.jpo;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.sq;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static AtomicInteger jpo = new AtomicInteger(0);

    /* renamed from: jd, reason: collision with root package name */
    public static final AtomicBoolean f19541jd = new AtomicBoolean(false);

    public static void jd() {
        com.bytedance.sdk.component.jj.jpo.jd.wqx();
    }

    public static void jpo(Context context, boolean z10) {
        if (f19541jd.compareAndSet(false, true)) {
            com.bytedance.sdk.component.jj.jpo.jd.jpo(new jpo.C0084jpo().jpo(new yd()).jd(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo.wqx()).wqx(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo.my()).jpo(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo.cm()).jpo(z10).jpo(new ju()).jpo(xyk.jpo).jd(sq.cm().mo478if()).jpo(sq.cm().au()).jpo(sq.cm().ii()).jpo(), context);
            jd();
        }
    }

    public static void wqx() {
        try {
            com.bytedance.sdk.component.jj.jpo.jd.cm();
            com.bytedance.sdk.component.jj.jpo.jd.my();
        } catch (Throwable th2) {
            nmd.wqx("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.cm.jpo jpoVar) {
        com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo jpoVar2 = new com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo(jpoVar.cm(), jpoVar);
        jpoVar2.jd(jpoVar.my() ? (byte) 1 : (byte) 2);
        jpoVar2.jpo((byte) 0);
        if (com.bytedance.sdk.component.jj.jpo.jd.jd()) {
            jpo(sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx());
        }
        com.bytedance.sdk.component.jj.jpo.jd.jpo(jpoVar2);
    }

    public static com.bytedance.sdk.openadsdk.prr.wqx.wqx jpo() {
        return Cif.jpo;
    }

    public static void jpo(final List<String> list, final int i10, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("track") { // from class: com.bytedance.sdk.openadsdk.cm.jpo.cm.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.jj.jpo.jd.jd()) {
                    cm.jpo(sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx());
                }
                com.bytedance.sdk.component.jj.jpo.jd.jpo(Cif.jpo(sq.jpo()), list, true, i10, str);
            }
        });
    }

    public static void jpo(String str) {
        jpo(str, false);
    }

    public static void jpo(String str, boolean z10) {
        if (com.bytedance.sdk.component.jj.jpo.jd.jd()) {
            jpo(sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx());
        }
        com.bytedance.sdk.component.jj.jpo.jd.jpo(str, z10);
    }
}
