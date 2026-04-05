package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x;
import g0.v2;
import g2.c2;
import n0.n1;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class w {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.a f48782b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f48783c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f48784e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f48785f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f48786g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$a$a, reason: collision with other inner class name */
        public static final class C0450a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f48787b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f48788c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c2 f48789e;

            public C0450a(x xVar, long j10, c2 c2Var) {
                this.f48787b = xVar;
                this.f48788c = j10;
                this.f48789e = c2Var;
            }

            public final void a(v2 TextButton, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i10 & 17) == 16 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(-291791758, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous>.<anonymous> (CountdownButton.kt:84)");
                }
                n1.m5701TextfLXpl1I(((x.c) this.f48787b).a(), null, 0L, this.f48788c, null, null, null, 0L, null, r2.m.m6072boximpl(r2.m.f83701b.m6066getCentere0LSkKk()), 0L, 0, false, 1, null, this.f48789e, wVar, 0, 3072, 24054);
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

        public a(kv.a aVar, boolean z10, long j10, long j11, long j12) {
            this.f48782b = aVar;
            this.f48783c = z10;
            this.f48784e = j10;
            this.f48785f = j11;
            this.f48786g = j12;
        }

        public final void a(x buttonPart, p0.w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(buttonPart, "buttonPart");
            if ((i10 & 6) == 0) {
                i11 = i10 | (wVar.changed(buttonPart) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1264027403, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:56)");
            }
            c2 h62 = n0.i0.f75090a.getTypography(wVar, 0).getH6();
            if (buttonPart instanceof x.a) {
                wVar.startReplaceableGroup(1000154410);
                wVar.endReplaceableGroup();
            } else if (buttonPart instanceof x.b) {
                wVar.startReplaceableGroup(1000496526);
                x.b bVar = (x.b) buttonPart;
                c0.a(bVar.e(), this.f48782b, null, this.f48783c, bVar.c(), this.f48784e, this.f48785f, bVar.d(), bVar.b(), bVar.a(), wVar, 0, 4);
                wVar.endReplaceableGroup();
            } else {
                if (!(buttonPart instanceof x.c)) {
                    wVar.startReplaceableGroup(-1491758567);
                    wVar.endReplaceableGroup();
                    throw new tu.t();
                }
                wVar.startReplaceableGroup(-1491726713);
                n0.b bVar2 = n0.b.f74975a;
                long j10 = this.f48784e;
                n0.h.TextButton(this.f48782b, null, this.f48783c, null, null, null, null, bVar2.m5652textButtonColorsRGew2ao(0L, j10, j10, wVar, 0, 1), null, z0.u.composableLambda(wVar, -291791758, true, new C0450a(buttonPart, this.f48786g, h62)), wVar, 805306368, 378);
                wVar.endReplaceableGroup();
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((x) obj, (p0.w) obj2, ((Number) obj3).intValue());
            return x0.f87415a;
        }
    }

    public static final x0 a(x xVar, e1.v vVar, kv.a aVar, boolean z10, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.i iVar, int i10, int i11, p0.w wVar, int i12) {
        a(xVar, vVar, aVar, z10, j10, j11, j12, iVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x r22, e1.v r23, final kv.a r24, final boolean r25, long r26, long r28, long r30, final com.moloco.sdk.internal.ortb.model.i r32, p0.w r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x, e1.v, kv.a, boolean, long, long, long, com.moloco.sdk.internal.ortb.model.i, p0.w, int, int):void");
    }
}
