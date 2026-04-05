package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Xe {

    /* renamed from: a, reason: collision with root package name */
    public final C2690af f32518a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f32519b;

    public Xe(C2690af networkRequest, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkRequest, "networkRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f32518a = networkRequest;
        this.f32519b = inMobiUnifiedIdInterfaceSet;
    }

    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        synchronized (We.class) {
            try {
                if (this.f32518a.A.get()) {
                    return;
                }
                We.a();
                W5.b(Ye.a(jSONObject, W5.b()));
                JSONObject jSONObjectA = Ye.a(W5.b());
                for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f32519b) {
                    if (jSONObjectA == null) {
                        Ye.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                    } else {
                        Ye.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                    }
                }
                this.f32519b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(S9 s92) {
        EnumC3017u4 enumC3017u4;
        synchronized (We.class) {
            if (s92 != null) {
                try {
                    enumC3017u4 = s92.f32266a;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                enumC3017u4 = null;
            }
            Objects.toString(enumC3017u4);
            Objects.toString(s92 != null ? s92.f32266a : null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (s92 != null) {
                linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, s92.f32266a);
            }
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC2993se.f33373a);
            if (this.f32518a.A.get()) {
                return;
            }
            We.a();
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0033, JSONException -> 0x0035, TryCatch #1 {JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043), top: B:27:0x000d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.String r0 = "ufids"
            org.json.JSONObject r1 = com.inmobi.media.W5.b()
            org.json.JSONObject r1 = com.inmobi.media.Ye.a(r1)
            r2 = 0
            if (r1 == 0) goto L37
            boolean r3 = r1.has(r0)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r3 == 0) goto L37
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r0 <= 0) goto L37
            java.util.LinkedHashSet r0 = r5.f32519b     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
        L23:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r3 == 0) goto L57
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r3 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r3     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.media.Ye.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            goto L23
        L33:
            r0 = move-exception
            goto L5d
        L35:
            r0 = move-exception
            goto L54
        L37:
            java.util.LinkedHashSet r0 = r5.f32519b     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
        L3d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r1 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r1     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.lang.Error r3 = new java.lang.Error     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.lang.String r4 = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.media.Ye.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            goto L3d
        L54:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L33
        L57:
            java.util.LinkedHashSet r0 = r5.f32519b
            r0.clear()
            return
        L5d:
            java.util.LinkedHashSet r1 = r5.f32519b
            r1.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Xe.a():void");
    }
}
