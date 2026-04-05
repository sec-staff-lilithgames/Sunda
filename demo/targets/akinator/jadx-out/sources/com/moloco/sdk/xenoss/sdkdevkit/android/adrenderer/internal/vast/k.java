package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.io.StringReader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k implements j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public StringReader f48974i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f48975j;

        /* renamed from: l, reason: collision with root package name */
        public int f48977l;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48975j = obj;
            this.f48977l |= Integer.MIN_VALUE;
            return k.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: all -> 0x002b, TryCatch #3 {all -> 0x002b, blocks: (B:12:0x0027, B:24:0x005b, B:26:0x005f, B:27:0x0065), top: B:44:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #3 {all -> 0x002b, blocks: (B:12:0x0027, B:24:0x005b, B:26:0x005f, B:27:0x0065), top: B:44:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, zu.d<? super com.moloco.sdk.internal.w> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a
            if (r0 == 0) goto L13
            r0 = r8
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a) r0
            int r1 = r0.f48977l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48977l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f48975j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48977l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.StringReader r7 = r0.f48974i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2b
            goto L5b
        L2b:
            r8 = move-exception
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            tu.a0.throwOnFailure(r8)
            java.io.StringReader r8 = new java.io.StringReader     // Catch: java.lang.Exception -> L7b
            r8.<init>(r7)     // Catch: java.lang.Exception -> L7b
            org.xmlpull.v1.XmlPullParser r7 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r4 = 0
            r7.setFeature(r2, r4)     // Catch: java.lang.Throwable -> L71
            r7.setInput(r8)     // Catch: java.lang.Throwable -> L71
            kotlin.jvm.internal.e0.checkNotNull(r7)     // Catch: java.lang.Throwable -> L71
            r0.f48974i = r8     // Catch: java.lang.Throwable -> L71
            r0.f48977l = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.u(r7, r0)     // Catch: java.lang.Throwable -> L71
            if (r7 != r1) goto L58
            return r1
        L58:
            r5 = r8
            r8 = r7
            r7 = r5
        L5b:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) r8     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L65
            com.moloco.sdk.internal.w$b r0 = new com.moloco.sdk.internal.w$b     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L65:
            com.moloco.sdk.internal.w$a r0 = new com.moloco.sdk.internal.w$a     // Catch: java.lang.Throwable -> L2b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.m r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.m.f47716e     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2b
        L6c:
            r8 = 0
            gv.d.closeFinally(r7, r8)     // Catch: java.lang.Exception -> L7b
            return r0
        L71:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L75:
            throw r8     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            gv.d.closeFinally(r7, r8)     // Catch: java.lang.Exception -> L7b
            throw r0     // Catch: java.lang.Exception -> L7b
        L7b:
            com.moloco.sdk.internal.w$a r7 = new com.moloco.sdk.internal.w$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.m r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.m.f47715c
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a(java.lang.String, zu.d):java.lang.Object");
    }
}
