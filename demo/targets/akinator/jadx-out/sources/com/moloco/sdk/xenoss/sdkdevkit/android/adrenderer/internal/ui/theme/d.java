package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import j1.l0;
import j1.m0;
import kv.p;
import n0.i;
import n0.k;
import p0.w;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final i f48759a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f48760b;

    static {
        long jF = a.f();
        long jF2 = a.f();
        l0 l0Var = m0.f68918b;
        f48759a = k.m5697darkColors2qZNXz8$default(jF, jF2, l0Var.m4836getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4088, null);
        f48760b = k.m5699lightColors2qZNXz8$default(a.f(), a.f(), l0Var.m4836getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4088, null);
    }

    public static final x0 a(boolean z10, p pVar, int i10, int i11, w wVar, int i12) {
        a(z10, pVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r8, kv.p r9, p0.w r10, int r11, int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            r0 = 156854067(0x9596733, float:2.6168949E-33)
            p0.w r4 = r10.startRestartGroup(r0)
            r1 = r11 & 6
            if (r1 != 0) goto L1f
            r1 = r12 & 1
            if (r1 != 0) goto L1c
            boolean r3 = r4.changed(r8)
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r3 = r3 | r11
            goto L20
        L1f:
            r3 = r11
        L20:
            r5 = r12 & 2
            if (r5 == 0) goto L27
            r3 = r3 | 48
            goto L37
        L27:
            r5 = r11 & 48
            if (r5 != 0) goto L37
            boolean r5 = r4.changed(r9)
            if (r5 == 0) goto L34
            r5 = 32
            goto L36
        L34:
            r5 = 16
        L36:
            r3 = r3 | r5
        L37:
            r5 = r3 & 19
            r6 = 18
            if (r5 != r6) goto L49
            boolean r5 = r4.getSkipping()
            if (r5 != 0) goto L44
            goto L49
        L44:
            r4.skipToGroupEnd()
            r1 = r8
            goto La1
        L49:
            r4.startDefaults()
            r5 = r11 & 1
            if (r5 == 0) goto L62
            boolean r5 = r4.getDefaultsInvalid()
            if (r5 == 0) goto L57
            goto L62
        L57:
            r4.skipToGroupEnd()
            r5 = r12 & 1
            if (r5 == 0) goto L60
            r3 = r3 & (-15)
        L60:
            r7 = r8
            goto L6e
        L62:
            r5 = r12 & 1
            if (r5 == 0) goto L60
            r1 = 0
            boolean r1 = d0.g1.isSystemInDarkTheme(r4, r1)
            r3 = r3 & (-15)
            r7 = r1
        L6e:
            r4.endDefaults()
            boolean r1 = p0.d0.isTraceInProgress()
            if (r1 == 0) goto L7d
            r1 = -1
            java.lang.String r5 = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.Theme (Theme.kt:31)"
            p0.d0.traceEventStart(r0, r3, r1, r5)
        L7d:
            if (r7 == 0) goto L82
            n0.i r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.f48759a
            goto L84
        L82:
            n0.i r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.f48760b
        L84:
            n0.r1 r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.e.a()
            n0.r0 r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a()
            int r3 = r3 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = r3 | 432(0x1b0, float:6.05E-43)
            r6 = 0
            r3 = r9
            n0.m0.MaterialTheme(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = p0.d0.isTraceInProgress()
            if (r0 == 0) goto La0
            p0.d0.traceEventEnd()
        La0:
            r1 = r7
        La1:
            p0.o4 r6 = r4.endRestartGroup()
            if (r6 == 0) goto Lb3
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c
            r5 = 0
            r2 = r9
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(boolean, kv.p, p0.w, int, int):void");
    }
}
