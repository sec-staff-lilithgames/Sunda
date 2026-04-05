package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.ironsource.C3227g4;
import g0.h3;
import g0.l3;
import g0.v2;
import n0.n1;
import p0.o4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final float f49729a = s2.i.m6817constructorimpl(4);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f49730b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49731c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f49732e;

        public a(String str, String str2, long j10) {
            this.f49730b = str;
            this.f49731c = str2;
            this.f49732e = j10;
        }

        public final void a(v2 OutlinedButton, p0.w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 17) == 16 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1553541117, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA.<anonymous> (VastCTA.kt:38)");
            }
            wVar.startReplaceableGroup(-1632172008);
            if (this.f49730b != null) {
                k0.h hVarM5094RoundedCornerShape0680j_4 = k0.i.m5094RoundedCornerShape0680j_4(q.f49729a);
                e1.t tVar = e1.t.f53496b;
                b7.c0.m132AsyncImage3HmZ8SU(this.f49730b, null, h3.m3905size3ABfNKs(g1.e.clip(tVar, hVarM5094RoundedCornerShape0680j_4), s2.i.m6817constructorimpl(36)), null, null, null, null, 0.0f, null, 0, wVar, 48, C3227g4.f36758l);
                l3.Spacer(h3.m3910width3ABfNKs(tVar, q.f49729a), wVar, 6);
            }
            wVar.endReplaceableGroup();
            n1.m5701TextfLXpl1I(this.f49731c, null, this.f49732e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, wVar, 0, 3072, 57338);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v2) obj, (p0.w) obj2, ((Number) obj3).intValue());
            return x0.f87415a;
        }
    }

    public static final x0 a(int i10, p0.w wVar, int i11) {
        a(wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final x0 a(e1.v vVar, String str, String str2, long j10, kv.a aVar, int i10, int i11, p0.w wVar, int i12) {
        a(vVar, str, str2, j10, aVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(e1.v r20, java.lang.String r21, final java.lang.String r22, long r23, final kv.a r25, p0.w r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(e1.v, java.lang.String, java.lang.String, long, kv.a, p0.w, int, int):void");
    }

    public static final void a(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-838285503);
        if (i10 == 0 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-838285503, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTAPreview (VastCTA.kt:58)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, f.f49637a.a(), wVarStartRestartGroup, 48, 1);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(i10, 4));
        }
    }
}
