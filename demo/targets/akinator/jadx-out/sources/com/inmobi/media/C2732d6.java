package com.inmobi.media;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2732d6 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32733a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2732d6(C2749e6 c2749e6, ArrayList arrayList) {
        super(1);
        this.f32733a = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // kv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5) throws org.json.JSONException {
        /*
            r4 = this;
            com.inmobi.media.e7 r5 = (com.inmobi.media.C2750e7) r5
            java.lang.String r0 = "dbData"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = com.inmobi.media.AbstractC2936p7.f33260a
            java.lang.String r0 = r5.f32807a
            java.lang.String r1 = "fileName"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList r2 = com.inmobi.media.AbstractC2936p7.f33260a     // Catch: java.lang.Exception -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L2e
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L2e
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L2e
            com.inmobi.media.Ub r3 = (com.inmobi.media.Ub) r3     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.f32372j     // Catch: java.lang.Exception -> L2e
            goto L31
        L2e:
            r0 = move-exception
            goto L38
        L30:
            r3 = r1
        L31:
            boolean r3 = kotlin.jvm.internal.e0.areEqual(r3, r0)     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L17
            goto L8b
        L38:
            com.inmobi.media.Y5 r2 = com.inmobi.media.Y5.f32563a
            java.lang.String r2 = "event"
            com.inmobi.media.h2 r0 = com.inmobi.media.C5.a(r0, r2)
            com.inmobi.media.K6 r2 = com.inmobi.media.Y5.f32566d
            r2.a(r0)
        L45:
            java.lang.String r0 = r5.f32807a
            java.lang.String r2 = "filePath"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L64
            boolean r0 = r2.isFile()
            if (r0 != 0) goto L5e
            goto L64
        L5e:
            r0 = 1
            java.lang.String r0 = gv.o.readText$default(r2, r1, r0, r1)     // Catch: java.lang.Exception -> L64
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 == 0) goto L84
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "vitals"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.lang.String r2 = "log"
            org.json.JSONArray r1 = r1.getJSONArray(r2)
            com.inmobi.media.f6 r2 = new com.inmobi.media.f6
            kotlin.jvm.internal.e0.checkNotNull(r0)
            kotlin.jvm.internal.e0.checkNotNull(r1)
            r2.<init>(r0, r1, r5)
            r1 = r2
        L84:
            if (r1 == 0) goto L8b
            java.util.ArrayList r5 = r4.f32733a
            r5.add(r1)
        L8b:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2732d6.invoke(java.lang.Object):java.lang.Object");
    }
}
