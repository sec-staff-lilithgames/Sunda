package com.inmobi.media;

import android.content.ComponentName;
import io.odeeo.sdk.AdUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3033v3 extends androidx.browser.customtabs.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3067x3 f33483a;

    public C3033v3(C3067x3 c3067x3) {
        this.f33483a = c3067x3;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f33483a.f33558a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCustomTabsServiceConnected(android.content.ComponentName r5, androidx.browser.customtabs.v r6) {
        /*
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            java.lang.String r5 = "client"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r5)
            com.inmobi.media.x3 r5 = r4.f33483a
            r5.f33558a = r6
            com.inmobi.media.m2 r5 = r5.f33560c
            if (r5 == 0) goto L99
            r6 = 0
            com.inmobi.media.x3 r0 = r5.f33073e     // Catch: java.lang.Throwable -> L3c
            androidx.browser.customtabs.k0 r1 = r0.f33561d     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L2a
            androidx.browser.customtabs.v r1 = r0.f33558a     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L27
            com.inmobi.media.w3 r2 = new com.inmobi.media.w3     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            androidx.browser.customtabs.k0 r1 = r1.newSession(r2)     // Catch: java.lang.Throwable -> L3c
            goto L28
        L27:
            r1 = r6
        L28:
            r0.f33561d = r1     // Catch: java.lang.Throwable -> L3c
        L2a:
            if (r1 == 0) goto L3c
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1.isEngagementSignalsApiAvailable(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3c
            com.inmobi.media.l2 r2 = new com.inmobi.media.l2     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3c
            r1.setEngagementSignalsCallback(r2, r0)     // Catch: java.lang.Throwable -> L3c
        L3c:
            java.lang.String r0 = r5.f33069a     // Catch: java.lang.Error -> L4b
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Error -> L4b
            java.lang.String r1 = "parse(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Error -> L4b
            r5.a(r0)     // Catch: java.lang.Error -> L4b
            goto L99
        L4b:
            android.content.Context r0 = r5.f33074f     // Catch: java.lang.Exception -> L61
            java.lang.String r1 = r5.f33069a     // Catch: java.lang.Exception -> L61
            java.lang.ref.WeakReference r2 = r5.f33078j     // Catch: java.lang.Exception -> L61
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L61
            kotlin.jvm.internal.e0.checkNotNull(r2)     // Catch: java.lang.Exception -> L61
            com.inmobi.media.Sb r2 = (com.inmobi.media.Sb) r2     // Catch: java.lang.Exception -> L61
            java.lang.String r3 = r5.f33072d     // Catch: java.lang.Exception -> L61
            int r0 = com.inmobi.media.B2.a(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L61
            goto L63
        L61:
            r0 = 9
        L63:
            com.inmobi.media.X6 r1 = r5.f33071c
            if (r1 != 0) goto L68
            goto L6c
        L68:
            java.lang.String r2 = "EX_NATIVE"
            r1.f32490g = r2
        L6c:
            if (r0 == 0) goto L88
            r1 = 1
            if (r0 != r1) goto L72
            goto L88
        L72:
            java.lang.ref.WeakReference r6 = r5.f33077i
            java.lang.Object r6 = r6.get()
            com.inmobi.media.g2 r6 = (com.inmobi.media.InterfaceC2779g2) r6
            if (r6 == 0) goto L99
            com.inmobi.media.L6 r1 = com.inmobi.media.L6.f31993g
            com.inmobi.media.X6 r5 = r5.f33071c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.a(r1, r5, r0)
            goto L99
        L88:
            java.lang.ref.WeakReference r0 = r5.f33077i
            java.lang.Object r0 = r0.get()
            com.inmobi.media.g2 r0 = (com.inmobi.media.InterfaceC2779g2) r0
            if (r0 == 0) goto L99
            com.inmobi.media.L6 r1 = com.inmobi.media.L6.f31992f
            com.inmobi.media.X6 r5 = r5.f33071c
            r0.a(r1, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3033v3.onCustomTabsServiceConnected(android.content.ComponentName, androidx.browser.customtabs.v):void");
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C3067x3 c3067x3 = this.f33483a;
        c3067x3.f33558a = null;
        C2880m2 c2880m2 = c3067x3.f33560c;
        if (c2880m2 != null) {
            X6 x62 = c2880m2.f33071c;
            if (x62 != null) {
                x62.f32490g = "IN_NATIVE";
            }
            InterfaceC2779g2 interfaceC2779g2 = (InterfaceC2779g2) c2880m2.f33077i.get();
            if (interfaceC2779g2 != null) {
                interfaceC2779g2.a(L6.f31993g, c2880m2.f33071c, Integer.valueOf(AdUnit.ERROR_UNSUPPORTED_MIME_TYPE));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f33483a.f33558a = null;
    }
}
