package com.moloco.sdk.internal.publisher.nativead.ui;

import a2.h2;
import android.content.Context;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import e1.t;
import g0.h3;
import kotlin.jvm.internal.e0;
import kv.p;
import kv.q;
import n0.m0;
import p0.d0;
import p0.w;
import tu.x0;
import z0.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f46624b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.ui.b$a$a, reason: collision with other inner class name */
        public static final class C0384a implements p {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f46625b;

            public C0384a(q qVar) {
                this.f46625b = qVar;
            }

            public final void a(w wVar, int i10) {
                if ((i10 & 3) == 2 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (d0.isTraceInProgress()) {
                    d0.traceEventStart(-964093233, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:15)");
                }
                this.f46625b.invoke(h3.fillMaxSize$default(t.f53496b, 0.0f, 1, null), wVar, 6);
                if (d0.isTraceInProgress()) {
                    d0.traceEventEnd();
                }
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((w) obj, ((Number) obj2).intValue());
                return x0.f87415a;
            }
        }

        public a(q qVar) {
            this.f46624b = qVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }

        public final void a(w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1870157091, i10, -1, QFzuMMDfrzagDN.RWYfyp);
            }
            m0.MaterialTheme(null, null, null, u.composableLambda(wVar, -964093233, true, new C0384a(this.f46624b)), wVar, 3072, 7);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }
    }

    public static final h2 a(Context context, q content) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(content, "content");
        h2 h2Var = new h2(context, null, 0, 6, null);
        h2Var.setContent(u.composableLambdaInstance(1870157091, true, new a(content)));
        return h2Var;
    }
}
