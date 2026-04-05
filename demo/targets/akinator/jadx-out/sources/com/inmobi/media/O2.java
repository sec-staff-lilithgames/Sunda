package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class O2 {
    public static void a() {
        if (Q2.f32151c.getAndSet(true)) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        b();
        a("root", C2925od.b(), null);
    }

    public static void b() {
        ArrayList arrayList = new ArrayList();
        S2 s22 = (S2) Q2.f32154f.getValue();
        s22.getClass();
        for (Config config : uu.y0.filterNotNull(V1.a(s22, null, null, null, null, null, null, 63))) {
            ConcurrentHashMap concurrentHashMap = Q2.f32153e;
            kotlin.jvm.internal.e0.checkNotNullParameter(config, "<this>");
            HashMap map = F3.f31768a;
            Config config2 = (Config) concurrentHashMap.put(F3.b(config.getAccountId$media_release(), config.getType()), config);
            if (config2 == null || config2.getLastUpdateTimeStamp() != config.getLastUpdateTimeStamp()) {
                kotlin.jvm.internal.e0.checkNotNullParameter(config, "<this>");
                arrayList.add(F3.b(config.getAccountId$media_release(), config.getType()));
            }
        }
        ((K2) Q2.f32150b.getValue()).post(new o9.n7(3, arrayList));
    }

    public static final void a(List changedConfigKeys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changedConfigKeys, "$changedConfigKeys");
        try {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
            Iterator it = changedConfigKeys.iterator();
            while (it.hasNext()) {
                Config config = (Config) Q2.f32153e.get((String) it.next());
                if (config != null) {
                    b(config);
                }
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.commons.core.configs.Config a(java.lang.String r3, java.lang.String r4, com.inmobi.media.P2 r5) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            java.lang.String r0 = com.inmobi.media.Q2.f()
            java.lang.String r1 = "access$getTAG$cp(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            java.util.Objects.toString(r5)
            com.inmobi.commons.core.configs.Config r3 = com.inmobi.media.F3.a(r4, r3)
            if (r4 != 0) goto L1f
            java.lang.String r4 = com.inmobi.media.Q2.f()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r1)
            return r3
        L1f:
            tu.o r4 = com.inmobi.media.Q2.d()
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.K2 r4 = (com.inmobi.media.K2) r4
            android.os.Message r4 = r4.obtainMessage()
            java.lang.String r0 = "obtainMessage(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r0)
            r0 = 0
            r4.what = r0
            com.inmobi.media.U2 r0 = new com.inmobi.media.U2
            r0.<init>(r3, r5)
            r4.obj = r0
            tu.o r5 = com.inmobi.media.Q2.d()
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.K2 r5 = (com.inmobi.media.K2) r5
            r5.sendMessage(r4)
            java.lang.String r4 = com.inmobi.media.Q2.f()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r1)
            java.util.Objects.toString(r3)
            java.lang.String r4 = r3.getAccountId$media_release()
            if (r4 == 0) goto L82
            java.lang.String r5 = r3.getType()
            java.lang.String r0 = com.inmobi.media.Q2.f()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = com.inmobi.media.Q2.f32153e
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r2)
            java.lang.String r4 = com.inmobi.media.F3.b(r4, r5)
            java.lang.Object r4 = r0.get(r4)
            com.inmobi.commons.core.configs.Config r4 = (com.inmobi.commons.core.configs.Config) r4
            if (r4 == 0) goto L82
            java.lang.String r5 = com.inmobi.media.Q2.f()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r1)
            r4.getLastUpdateTimeStamp()
            goto L83
        L82:
            r4 = 0
        L83:
            if (r4 != 0) goto L86
            return r3
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.O2.a(java.lang.String, java.lang.String, com.inmobi.media.P2):com.inmobi.commons.core.configs.Config");
    }

    public static void b(Config config) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        ArrayList arrayList = (ArrayList) Q2.f32149a.get(config);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) next).get() == null) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) Q2.f32149a.get(config);
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                P2 p22 = (P2) ((WeakReference) it2.next()).get();
                if (p22 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
                    p22.getClass().toString();
                    p22.a(config);
                }
            }
        }
    }

    public static Config a(String accountId, String type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        ConcurrentHashMap concurrentHashMap = Q2.f32153e;
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "<this>");
        Config config = (Config) concurrentHashMap.get(F3.b(accountId, type));
        Config config2 = null;
        if (config != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
            config.getLastUpdateTimeStamp();
        } else {
            config = null;
        }
        if (config != null) {
            return config;
        }
        S2 s22 = (S2) Q2.f32154f.getValue();
        s22.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        Config config3 = (Config) s22.b("account_id=? AND config_type=?", new String[]{accountId, type});
        if (config3 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
            config3.toString();
            if (D2.a(config3.getAccountId$media_release()) && config3.getType().length() > 0) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
                kotlin.jvm.internal.e0.checkNotNullParameter(config3, "<this>");
                concurrentHashMap.put(F3.b(config3.getAccountId$media_release(), config3.getType()), config3);
                b(config3);
            }
            config2 = config3;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        if (config2 != null) {
            config2.getLastUpdateTimeStamp();
        }
        return config2;
    }

    public static Config a(String accountId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
        kotlin.jvm.internal.e0.checkNotNullParameter("root", "type");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        Config configA = a(accountId, "root");
        return configA == null ? F3.a(accountId, "root") : configA;
    }

    public static void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
        Message messageObtainMessage = ((K2) Q2.f32150b.getValue()).obtainMessage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = config;
        ((K2) Q2.f32150b.getValue()).sendMessage(messageObtainMessage);
    }
}
