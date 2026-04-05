package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import av.e;
import bv.d;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.u;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.l;
import kv.p;
import kv.w;
import p0.d0;
import p0.v;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StaticAdActivity extends ComponentActivity {

    /* renamed from: e, reason: collision with root package name */
    public static w f48259e;

    /* renamed from: f, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f48260f;

    /* renamed from: g, reason: collision with root package name */
    public static StaticAdActivity f48261g;

    /* renamed from: h, reason: collision with root package name */
    public static kv.a f48262h;

    /* renamed from: j, reason: collision with root package name */
    public static e0 f48264j;

    /* renamed from: c, reason: collision with root package name */
    public static final a f48258c = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final MutableStateFlow f48263i = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a, reason: collision with other inner class name */
        public static final class C0422a extends d {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f48265i;

            /* renamed from: k, reason: collision with root package name */
            public int f48267k;

            public C0422a(zu.d<? super C0422a> dVar) {
                super(dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                this.f48265i = obj;
                this.f48267k |= Integer.MIN_VALUE;
                return a.this.a(null, null, null, null, null, this);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ boolean f48268i;

            public b(zu.d<? super b> dVar) {
                super(2, dVar);
            }

            public final Object a(boolean z10, zu.d<? super Boolean> dVar) {
                return ((b) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f48268i = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                return bv.b.boxBoolean(this.f48268i);
            }
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }

        public final void a() {
            StaticAdActivity.f48263i.setValue(Boolean.TRUE);
        }

        public final void a(a.c cVar) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = StaticAdActivity.f48260f;
            if (aVar != null) {
                aVar.a(cVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(android.content.Context r7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a r8, kv.a r9, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l r10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 r11, zu.d<? super tu.x0> r12) {
            /*
                r6 = this;
                boolean r0 = r12 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a.C0422a
                if (r0 == 0) goto L13
                r0 = r12
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a.C0422a) r0
                int r1 = r0.f48267k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f48267k = r1
                goto L18
            L13:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f48265i
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f48267k
                r3 = 0
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L35
                if (r2 != r4) goto L2d
                tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L2b
                goto L70
            L2b:
                r7 = move-exception
                goto L95
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                tu.a0.throwOnFailure(r12)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r11)     // Catch: java.lang.Throwable -> L2b
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r8)     // Catch: java.lang.Throwable -> L2b
                kv.w r8 = r10.a()     // Catch: java.lang.Throwable -> L2b
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r8)     // Catch: java.lang.Throwable -> L2b
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r9)     // Catch: java.lang.Throwable -> L2b
                android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b
                java.lang.Class<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity> r9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.class
                r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L2b
                int r9 = r10.b()     // Catch: java.lang.Throwable -> L2b
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0.a(r8, r9)     // Catch: java.lang.Throwable -> L2b
                r9 = 268435456(0x10000000, float:2.524355E-29)
                r8.setFlags(r9)     // Catch: java.lang.Throwable -> L2b
                r7.startActivity(r8)     // Catch: java.lang.Throwable -> L2b
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b()     // Catch: java.lang.Throwable -> L2b
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b r8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b     // Catch: java.lang.Throwable -> L2b
                r8.<init>(r5)     // Catch: java.lang.Throwable -> L2b
                r0.f48267k = r4     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.first(r7, r8, r0)     // Catch: java.lang.Throwable -> L2b
                if (r12 != r1) goto L70
                return r1
            L70:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2b
                r12.getClass()     // Catch: java.lang.Throwable -> L2b
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b()
                java.lang.Boolean r8 = bv.b.boxBoolean(r3)
                r7.setValue(r8)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a()
                if (r7 == 0) goto L92
                r7.finish()
            L92:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            L95:
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b()
                java.lang.Boolean r9 = bv.b.boxBoolean(r3)
                r8.setValue(r9)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a()
                if (r8 == 0) goto Lb2
                r8.finish()
            Lb2:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a.a(android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a, kv.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements p {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f48270c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ w f48271e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements l {
            public a(Object obj) {
                super(1, obj, a.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.c p02) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
                ((a) this.receiver).a(p02);
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.c) obj);
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0423b extends kotlin.jvm.internal.a0 implements kv.a {
            public C0423b(Object obj) {
                super(0, obj, a.class, "dismiss", "dismiss()V", 0);
            }

            public final void a() {
                ((a) this.receiver).a();
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, w wVar) {
            this.f48270c = aVar;
            this.f48271e = wVar;
        }

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1193619358, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.onCreate.<anonymous> (StaticAdActivity.kt:38)");
            }
            StaticAdActivity staticAdActivity = StaticAdActivity.this;
            Intent intent = staticAdActivity.getIntent();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent, "getIntent(...)");
            int iC = j0.c(intent);
            a aVar = StaticAdActivity.f48258c;
            wVar.startReplaceableGroup(-1212657475);
            boolean zChanged = wVar.changed(aVar);
            Object objRememberedValue = wVar.rememberedValue();
            v vVar = v.f80515a;
            if (zChanged || objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = new a(aVar);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            l lVar = (l) ((KFunction) objRememberedValue);
            wVar.startReplaceableGroup(-1212655916);
            boolean zChanged2 = wVar.changed(aVar);
            Object objRememberedValue2 = wVar.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new C0423b(aVar);
                wVar.updateRememberedValue(objRememberedValue2);
            }
            wVar.endReplaceableGroup();
            e0 e0Var = StaticAdActivity.f48264j;
            i.a(staticAdActivity, this.f48270c, iC, lVar, (kv.a) ((KFunction) objRememberedValue2), this.f48271e, e0Var, wVar, 0);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p0.w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        f48261g = this;
        w wVar = f48259e;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = f48260f;
        a aVar2 = f48258c;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: WebView is missing", null, false, 12, null);
            aVar2.a();
        } else if (wVar != null) {
            g.d.setContent$default(this, null, z0.u.composableLambdaInstance(1193619358, true, new b(aVar, wVar)), 1, null);
        } else {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: StaticRenderer is missing", null, false, 12, null);
            aVar2.a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kv.a aVar = f48262h;
        if (aVar != null) {
            aVar.invoke();
        }
        f48261g = null;
    }
}
