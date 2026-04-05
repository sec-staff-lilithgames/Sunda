package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k f49431a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f49432b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f49433i;

        /* renamed from: j, reason: collision with root package name */
        public a.f f49434j;

        /* renamed from: k, reason: collision with root package name */
        public o f49435k;

        /* renamed from: l, reason: collision with root package name */
        public List f49436l;

        /* renamed from: m, reason: collision with root package name */
        public z f49437m;

        /* renamed from: n, reason: collision with root package name */
        public Integer f49438n;

        /* renamed from: o, reason: collision with root package name */
        public String f49439o;

        /* renamed from: p, reason: collision with root package name */
        public Iterator f49440p;

        /* renamed from: q, reason: collision with root package name */
        public int f49441q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ List f49442r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f49443s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a.f f49444t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ o f49445u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f49446v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ z f49447w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Integer f49448x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f49449y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, a.f fVar, o oVar, List<a.c> list2, z zVar, Integer num, String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49442r = list;
            this.f49443s = bVar;
            this.f49444t = fVar;
            this.f49445u = oVar;
            this.f49446v = list2;
            this.f49447w = zVar;
            this.f49448x = num;
            this.f49449y = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f49442r, this.f49443s, this.f49444t, this.f49445u, this.f49446v, this.f49447w, this.f49448x, this.f49449y, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:19:0x008c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:19:0x008c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:18:0x0082). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r13.f49441q
                r2 = 1
                if (r1 == 0) goto L2a
                if (r1 != r2) goto L22
                java.util.Iterator r1 = r13.f49440p
                java.lang.String r3 = r13.f49439o
                java.lang.Integer r4 = r13.f49438n
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r5 = r13.f49437m
                java.util.List r6 = r13.f49436l
                java.util.List r6 = (java.util.List) r6
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o r7 = r13.f49435k
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$f r8 = r13.f49434j
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b r9 = r13.f49433i
                tu.a0.throwOnFailure(r14)
                goto L82
            L22:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2a:
                tu.a0.throwOnFailure(r14)
                java.util.List r14 = r13.f49442r
                java.util.Iterator r14 = r14.iterator()
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b r1 = r13.f49443s
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$f r3 = r13.f49444t
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o r4 = r13.f49445u
                java.util.List r5 = r13.f49446v
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r6 = r13.f49447w
                java.lang.Integer r7 = r13.f49448x
                java.lang.String r8 = r13.f49449y
                r9 = r5
                r12 = r6
                r11 = r7
                r5 = r1
                r6 = r3
                r3 = r4
                r1 = r14
                r14 = r8
            L49:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto La8
                java.lang.Object r4 = r1.next()
                java.lang.String r4 = (java.lang.String) r4
                if (r5 == 0) goto L8c
                if (r6 == 0) goto L8c
                long r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e.a()
                r13.f49433i = r5
                r13.f49434j = r6
                r13.f49435k = r3
                r10 = r9
                java.util.List r10 = (java.util.List) r10
                r13.f49436l = r10
                r13.f49437m = r12
                r13.f49438n = r11
                r13.f49439o = r14
                r13.f49440p = r1
                r13.f49441q = r2
                r10 = r13
                java.lang.Object r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o.a(r3, r4, r5, r6, r7, r9, r10)
                if (r4 != r0) goto L7a
                return r0
            L7a:
                r7 = r3
                r8 = r6
                r6 = r9
                r3 = r14
                r14 = r4
                r9 = r5
                r4 = r11
                r5 = r12
            L82:
                java.lang.String r14 = (java.lang.String) r14
                r11 = r4
                r12 = r5
                r5 = r9
                r4 = r14
                r14 = r3
                r9 = r6
                r3 = r7
                r6 = r8
            L8c:
                if (r12 == 0) goto L97
                int r7 = r12.c()
                java.lang.Integer r7 = bv.b.boxInt(r7)
                goto L98
            L97:
                r7 = 0
            L98:
                java.lang.String r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p.c()
                java.lang.String r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p.a(r4, r7, r11, r14, r8)
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o.a(r3)
                r7.a(r4)
                goto L49
            La8:
                tu.x0 r14 = tu.x0.f87415a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest) {
        e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f49431a = persistentHttpRequest;
        this.f49432b = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getDefault());
    }

    public final void b(List<String> list, z zVar, Integer num, String str, List<a.c> list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, a.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f49432b, null, null, new a(list, bVar, fVar, this, list2, zVar, num, str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n
    public void a(List<String> urls, z zVar, Integer num, String str, List<a.c> renderedButtons, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, a.f lastClickPosition) {
        e0.checkNotNullParameter(urls, "urls");
        e0.checkNotNullParameter(renderedButtons, "renderedButtons");
        e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        e0.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        b(urls, zVar, num, str, renderedButtons, customUserEventBuilderService, lastClickPosition);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n
    public void a(List<String> urls, z zVar, Integer num, String str) {
        e0.checkNotNullParameter(urls, "urls");
        b(urls, zVar, num, str, p0.emptyList(), null, null);
    }

    public final Object a(String str, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, a.f fVar, long j10, List<a.c> list, zu.d<? super String> dVar) {
        return bVar.a(j10, new a.d(fVar, null, null, list, 6, null), str, dVar);
    }
}
