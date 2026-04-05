package com.moloco.sdk.internal.publisher.nativead.ui;

import a1.o;
import androidx.core.app.NotificationCompat;
import b0.q0;
import com.digidust.elokence.akinator.freemium.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0;
import e1.t;
import e1.v;
import e2.r0;
import e2.u0;
import g0.e0;
import g0.f0;
import g0.f2;
import j1.m0;
import kv.l;
import kv.q;
import kv.s;
import p0.d0;
import p0.w;
import s2.i;
import tu.x0;
import z0.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f46620a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f46621b = u.composableLambdaInstance(1019496058, false, C0382a.f46622b);

    public final s a() {
        return f46621b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.ui.a$a, reason: collision with other inner class name */
    public static final class C0382a implements s {

        /* renamed from: b, reason: collision with root package name */
        public static final C0382a f46622b = new C0382a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.ui.a$a$a, reason: collision with other inner class name */
        public static final class C0383a implements q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kv.a f46623b;

            public C0383a(kv.a aVar) {
                this.f46623b = aVar;
            }

            public final void a(boolean z10, w wVar, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (wVar.changed(z10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (d0.isTraceInProgress()) {
                    d0.traceEventStart(1776469658, i11, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous>.<anonymous> (NativeVideoPlaybackControlUI.kt:30)");
                }
                c0.a(d2.c.painterResource(z10 ? R.drawable.moloco_twotone_pause_24 : R.drawable.moloco_twotone_play_arrow_24, wVar, 0), this.f46623b, null, false, "play/pause", m0.f68918b.m4836getWhite0d7_KjU(), 0L, 0L, null, 0L, wVar, 221184, 972);
                if (d0.isTraceInProgress()) {
                    d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((Boolean) obj).booleanValue(), (w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public final void a(e0 e0Var, boolean z10, kv.a onClick, w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(e0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= wVar.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= wVar.changed(onClick) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i11 & 1171) == 1170 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1019496058, i11, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous> (NativeVideoPlaybackControlUI.kt:17)");
            }
            v vVarM3877padding3ABfNKs = f2.m3877padding3ABfNKs(((f0) e0Var).align(t.f53496b, e1.d.f53469a.getBottomCenter()), i.m6817constructorimpl(4));
            wVar.startReplaceableGroup(277443603);
            boolean zChanged = wVar.changed("playback_control_button");
            Object objRememberedValue = wVar.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new o(9);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            q0.Crossfade(Boolean.valueOf(z10), e2.v.semantics$default(vVarM3877padding3ABfNKs, false, (l) objRememberedValue, 1, null), null, u.composableLambda(wVar, 1776469658, true, new C0383a(onClick)), wVar, ((i11 >> 3) & 14) | 3072, 4);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((e0) obj, ((Boolean) obj2).booleanValue(), (kv.a) obj3, (w) obj4, ((Number) obj5).intValue());
            return x0.f87415a;
        }

        public static final x0 a(String str, u0 semantics) {
            kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
            r0.setContentDescription(semantics, str);
            r0.setTestTag(semantics, str);
            return x0.f87415a;
        }
    }
}
