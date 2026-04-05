package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3434s;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f48978a = tu.q.lazy(new com.moloco.sdk.service_locator.b(14));

    /* renamed from: b, reason: collision with root package name */
    public static final NumberFormat f48979b = NumberFormat.getPercentInstance();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f48980i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f48981j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f48982k;

        /* renamed from: l, reason: collision with root package name */
        public b1 f48983l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f48984m;

        /* renamed from: n, reason: collision with root package name */
        public ArrayList f48985n;

        /* renamed from: o, reason: collision with root package name */
        public ArrayList f48986o;

        /* renamed from: p, reason: collision with root package name */
        public ArrayList f48987p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f48988q;

        /* renamed from: r, reason: collision with root package name */
        public int f48989r;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48988q = obj;
            this.f48989r |= Integer.MIN_VALUE;
            return l.K(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48990i;

        /* renamed from: j, reason: collision with root package name */
        public int f48991j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48992k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f48993l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kv.p f48994m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kv.q f48995n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kv.p f48996o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(XmlPullParser xmlPullParser, kv.p pVar, kv.q qVar, kv.p pVar2, zu.d<? super a0> dVar) {
            super(2, dVar);
            this.f48993l = xmlPullParser;
            this.f48994m = pVar;
            this.f48995n = qVar;
            this.f48996o = pVar2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((a0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            a0 a0Var = new a0(this.f48993l, this.f48994m, this.f48995n, this.f48996o, dVar);
            a0Var.f48992k = obj;
            return a0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        
            if (r7.f48996o.invoke(r5, r7) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        
            if (r7.f48994m.invoke(r5, r7) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
        
            if (r7.f48995n.invoke(r5, r8, r7) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r5) != false) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:49:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005d -> B:49:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0069 -> B:49:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:49:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ad -> B:49:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00b4 -> B:49:0x00b7). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.f48991j
                r2 = 3
                r3 = 2
                r4 = 1
                org.xmlpull.v1.XmlPullParser r5 = r7.f48993l
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1c
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                int r1 = r7.f48990i
                tu.a0.throwOnFailure(r8)
                goto Lb7
            L23:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.f48992k
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r8)
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r5)
                if (r8 == 0) goto L36
                r5.nextTag()
            L36:
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r5)
                if (r8 == 0) goto L3e
                goto Lbb
            L3e:
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r5)
                if (r8 == 0) goto Lbe
                int r8 = r5.getDepth()
                r1 = r8
            L49:
                int r8 = r5.getDepth()
                if (r8 < r1) goto Lbb
                int r8 = r5.getDepth()
                int r8 = r8 - r1
                if (r8 == 0) goto L6c
                if (r8 == r4) goto L59
                goto Lb7
            L59:
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r5)
                if (r8 == 0) goto Lb7
                r7.f48990i = r1
                r7.f48991j = r2
                kv.p r8 = r7.f48996o
                java.lang.Object r8 = r8.invoke(r5, r7)
                if (r8 != r0) goto Lb7
                goto Laf
            L6c:
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r5)
                if (r8 == 0) goto L7f
                r7.f48990i = r1
                r7.f48991j = r4
                kv.p r8 = r7.f48994m
                java.lang.Object r8 = r8.invoke(r5, r7)
                if (r8 != r0) goto Lb7
                goto Laf
            L7f:
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r5)
                if (r8 == 0) goto Lb0
                java.lang.String r8 = r5.getText()
                if (r8 == 0) goto Lb0
                boolean r8 = sv.n0.isBlank(r8)
                if (r8 == 0) goto L92
                goto Lb0
            L92:
                java.lang.String r8 = r5.getText()
                java.lang.String r6 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r6)
                java.lang.CharSequence r8 = sv.n0.trim(r8)
                java.lang.String r8 = r8.toString()
                r7.f48990i = r1
                r7.f48991j = r3
                kv.q r6 = r7.f48995n
                java.lang.Object r8 = r6.invoke(r5, r8, r7)
                if (r8 != r0) goto Lb7
            Laf:
                return r0
            Lb0:
                boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r5)
                if (r8 == 0) goto Lb7
                goto Lbb
            Lb7:
                r5.next()
                goto L49
            Lbb:
                tu.x0 r8 = tu.x0.f87415a
                return r8
            Lbe:
                org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object a(Object obj) throws XmlPullParserException, IOException {
            String text;
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f48992k);
            XmlPullParser xmlPullParser = this.f48993l;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && l.k(xmlPullParser)) {
                        this.f48996o.invoke(xmlPullParser, this);
                    }
                } else if (l.k(xmlPullParser)) {
                    this.f48994m.invoke(xmlPullParser, this);
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f48995n.invoke(xmlPullParser, sv.n0.trim(text2).toString(), this);
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48997i;

        /* renamed from: j, reason: collision with root package name */
        public int f48998j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48999k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49000l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49001m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49002n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49003o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List f49004p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List f49005q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b1 f49006r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f49007s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List f49008t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, List list, List list2, b1 b1Var4, boolean z10, List list3) {
            super(2, dVar);
            this.f49000l = xmlPullParser;
            this.f49001m = b1Var;
            this.f49002n = b1Var2;
            this.f49003o = b1Var3;
            this.f49004p = list;
            this.f49005q = list2;
            this.f49006r = b1Var4;
            this.f49007s = z10;
            this.f49008t = list3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            b bVar = new b(this.f49000l, dVar, this.f49001m, this.f49002n, this.f49003o, this.f49004p, this.f49005q, this.f49006r, this.f49007s, this.f49008t);
            bVar.f48999k = obj;
            return bVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
        
            if (r7 == r0) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
        
            if (r7 == r0) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x01a4, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r2) != false) goto L97;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0091 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0097 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009d -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a8 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ca -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:48:0x00df). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ec -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x010e -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x012e -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0155 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0173 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x018f -> B:96:0x01a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01a4 -> B:96:0x01a7). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 484
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49009i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49010j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49011k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49012l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2) {
            super(2, dVar);
            this.f49010j = xmlPullParser;
            this.f49011k = b1Var;
            this.f49012l = b1Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((b0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            b0 b0Var = new b0(this.f49010j, dVar, this.f49011k, this.f49012l);
            b0Var.f49009i = obj;
            return b0Var;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49009i);
            XmlPullParser xmlPullParser = this.f49010j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    String strB = l.b(xmlPullParser, "xmlEncoded");
                    this.f49011k.f71816b = strB != null ? bv.b.boxBoolean(Boolean.parseBoolean(strB)) : null;
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49012l.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public boolean f49013i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49014j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49015k;

        /* renamed from: l, reason: collision with root package name */
        public b1 f49016l;

        /* renamed from: m, reason: collision with root package name */
        public ArrayList f49017m;

        /* renamed from: n, reason: collision with root package name */
        public ArrayList f49018n;

        /* renamed from: o, reason: collision with root package name */
        public b1 f49019o;

        /* renamed from: p, reason: collision with root package name */
        public ArrayList f49020p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f49021q;

        /* renamed from: r, reason: collision with root package name */
        public int f49022r;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49021q = obj;
            this.f49022r |= Integer.MIN_VALUE;
            return l.g(null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49023i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49024j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49025k;

        /* renamed from: l, reason: collision with root package name */
        public int f49026l;

        public c0(zu.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49025k = obj;
            this.f49026l |= Integer.MIN_VALUE;
            return l.y(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49027i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49028j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49029k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49030l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49031m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49032n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49033o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ b1 f49034p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b1 f49035q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b1 f49036r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b1 f49037s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b1 f49038t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b1 f49039u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b1 f49040v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, b1 b1Var9, b1 b1Var10, b1 b1Var11, b1 b1Var12) {
            super(2, dVar);
            this.f49028j = xmlPullParser;
            this.f49029k = b1Var;
            this.f49030l = b1Var2;
            this.f49031m = b1Var3;
            this.f49032n = b1Var4;
            this.f49033o = b1Var5;
            this.f49034p = b1Var6;
            this.f49035q = b1Var7;
            this.f49036r = b1Var8;
            this.f49037s = b1Var9;
            this.f49038t = b1Var10;
            this.f49039u = b1Var11;
            this.f49040v = b1Var12;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = new d(this.f49028j, dVar, this.f49029k, this.f49030l, this.f49031m, this.f49032n, this.f49033o, this.f49034p, this.f49035q, this.f49036r, this.f49037s, this.f49038t, this.f49039u, this.f49040v);
            dVar2.f49027i = obj;
            return dVar2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49027i);
            XmlPullParser xmlPullParser = this.f49028j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    this.f49029k.f71816b = l.b(xmlPullParser, "id");
                    this.f49030l.f71816b = bv.b.boxBoolean(kotlin.jvm.internal.e0.areEqual(l.b(xmlPullParser, C3434s.f38306g), "progressive"));
                    this.f49031m.f71816b = l.b(xmlPullParser, "type");
                    String strB = l.b(xmlPullParser, "width");
                    this.f49032n.f71816b = strB != null ? sv.j0.toIntOrNull(strB) : null;
                    String strB2 = l.b(xmlPullParser, "height");
                    this.f49033o.f71816b = strB2 != null ? sv.j0.toIntOrNull(strB2) : null;
                    this.f49034p.f71816b = l.b(xmlPullParser, "codec");
                    String strB3 = l.b(xmlPullParser, "bitrate");
                    this.f49035q.f71816b = strB3 != null ? sv.j0.toIntOrNull(strB3) : null;
                    String strB4 = l.b(xmlPullParser, "minBitrate");
                    this.f49036r.f71816b = strB4 != null ? sv.j0.toIntOrNull(strB4) : null;
                    String strB5 = l.b(xmlPullParser, "maxBitrate");
                    this.f49037s.f71816b = strB5 != null ? sv.j0.toIntOrNull(strB5) : null;
                    String strB6 = l.b(xmlPullParser, "scalable");
                    this.f49038t.f71816b = strB6 != null ? bv.b.boxBoolean(Boolean.parseBoolean(strB6)) : null;
                    this.f49039u.f71816b = l.b(xmlPullParser, "apiFramework");
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49040v.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49041i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49042j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49043k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49044l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2) {
            super(2, dVar);
            this.f49042j = xmlPullParser;
            this.f49043k = b1Var;
            this.f49044l = b1Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((d0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            d0 d0Var = new d0(this.f49042j, dVar, this.f49043k, this.f49044l);
            d0Var.f49041i = obj;
            return d0Var;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49041i);
            XmlPullParser xmlPullParser = this.f49042j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    this.f49043k.f71816b = l.b(xmlPullParser, "version");
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49044l.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49045i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49046j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49047k;

        /* renamed from: l, reason: collision with root package name */
        public b1 f49048l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f49049m;

        /* renamed from: n, reason: collision with root package name */
        public b1 f49050n;

        /* renamed from: o, reason: collision with root package name */
        public b1 f49051o;

        /* renamed from: p, reason: collision with root package name */
        public b1 f49052p;

        /* renamed from: q, reason: collision with root package name */
        public b1 f49053q;

        /* renamed from: r, reason: collision with root package name */
        public b1 f49054r;

        /* renamed from: s, reason: collision with root package name */
        public b1 f49055s;

        /* renamed from: t, reason: collision with root package name */
        public b1 f49056t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f49057u;

        /* renamed from: v, reason: collision with root package name */
        public int f49058v;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49057u = obj;
            this.f49058v |= Integer.MIN_VALUE;
            return l.L(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49059i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49060j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49061k;

        /* renamed from: l, reason: collision with root package name */
        public int f49062l;

        public e0(zu.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49061k = obj;
            this.f49062l |= Integer.MIN_VALUE;
            return l.z(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49063i;

        /* renamed from: j, reason: collision with root package name */
        public int f49064j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49065k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49066l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f49067m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(XmlPullParser xmlPullParser, zu.d dVar, List list) {
            super(2, dVar);
            this.f49066l = xmlPullParser;
            this.f49067m = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            f fVar = new f(this.f49066l, dVar, this.f49067m);
            fVar.f49065k = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r3) != false) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004e -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006b -> B:30:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0092 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a7 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49064j
                r2 = 1
                org.xmlpull.v1.XmlPullParser r3 = r5.f49066l
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                int r1 = r5.f49063i
                tu.a0.throwOnFailure(r6)
                goto L6e
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.f49065k
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r3)
                if (r6 == 0) goto L2e
                r3.nextTag()
            L2e:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r3)
                if (r6 == 0) goto L36
                goto Lae
            L36:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Lb1
                int r6 = r3.getDepth()
                r1 = r6
            L41:
                int r6 = r3.getDepth()
                if (r6 < r1) goto Lae
                int r6 = r3.getDepth()
                int r6 = r6 - r1
                if (r6 == 0) goto L78
                if (r6 == r2) goto L51
                goto Laa
            L51:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Laa
                java.lang.String r6 = r3.getName()
                java.lang.String r4 = "MediaFile"
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r4)
                if (r6 == 0) goto Laa
                r5.f49063i = r1
                r5.f49064j = r2
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.n(r3, r5)
                if (r6 != r0) goto L6e
                return r0
            L6e:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s) r6
                if (r6 == 0) goto Laa
                java.util.List r4 = r5.f49067m
                r4.add(r6)
                goto Laa
            L78:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto L7f
                goto Laa
            L7f:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r3)
                if (r6 == 0) goto La3
                java.lang.String r6 = r3.getText()
                if (r6 == 0) goto La3
                boolean r6 = sv.n0.isBlank(r6)
                if (r6 == 0) goto L92
                goto La3
            L92:
                java.lang.String r6 = r3.getText()
                java.lang.String r4 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r4)
                java.lang.CharSequence r6 = sv.n0.trim(r6)
                r6.toString()
                goto Laa
            La3:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r3)
                if (r6 == 0) goto Laa
                goto Lae
            Laa:
                r3.next()
                goto L41
            Lae:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            Lb1:
                org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49068i;

        /* renamed from: j, reason: collision with root package name */
        public int f49069j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49070k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49071l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49072m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49073n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49074o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3) {
            super(2, dVar);
            this.f49071l = xmlPullParser;
            this.f49072m = b1Var;
            this.f49073n = b1Var2;
            this.f49074o = b1Var3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((f0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            f0 f0Var = new f0(this.f49071l, dVar, this.f49072m, this.f49073n, this.f49074o);
            f0Var.f49070k = obj;
            return f0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        
            if (r9 == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r5) != false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00b2, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:59:0x00f9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:59:0x00f9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006f -> B:59:0x00f9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a4 -> B:40:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00bb -> B:59:0x00f9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e1 -> B:59:0x00f9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00f6 -> B:59:0x00f9). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f49075i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49076j;

        /* renamed from: k, reason: collision with root package name */
        public int f49077k;

        public g(zu.d<? super g> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49076j = obj;
            this.f49077k |= Integer.MIN_VALUE;
            return l.M(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49078i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49079j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49080k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f49081l;

        /* renamed from: m, reason: collision with root package name */
        public int f49082m;

        public g0(zu.d<? super g0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49081l = obj;
            this.f49082m |= Integer.MIN_VALUE;
            return l.A(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49083i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49084j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49085k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2) {
            super(2, dVar);
            this.f49084j = xmlPullParser;
            this.f49085k = b1Var;
            this.f49086l = b1Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            h hVar = new h(this.f49084j, dVar, this.f49085k, this.f49086l);
            hVar.f49083i = obj;
            return hVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49083i);
            XmlPullParser xmlPullParser = this.f49084j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    this.f49085k.f71816b = l.b(xmlPullParser, "model");
                    this.f49086l.f71816b = l.b(xmlPullParser, "currency");
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49087i;

        /* renamed from: j, reason: collision with root package name */
        public int f49088j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49089k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49090l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f49091m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(XmlPullParser xmlPullParser, zu.d dVar, List list) {
            super(2, dVar);
            this.f49090l = xmlPullParser;
            this.f49091m = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((h0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            h0 h0Var = new h0(this.f49090l, dVar, this.f49091m);
            h0Var.f49089k = obj;
            return h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r3) != false) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004e -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006b -> B:30:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0092 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a7 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49088j
                r2 = 1
                org.xmlpull.v1.XmlPullParser r3 = r5.f49090l
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                int r1 = r5.f49087i
                tu.a0.throwOnFailure(r6)
                goto L6e
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.f49089k
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r3)
                if (r6 == 0) goto L2e
                r3.nextTag()
            L2e:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r3)
                if (r6 == 0) goto L36
                goto Lae
            L36:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Lb1
                int r6 = r3.getDepth()
                r1 = r6
            L41:
                int r6 = r3.getDepth()
                if (r6 < r1) goto Lae
                int r6 = r3.getDepth()
                int r6 = r6 - r1
                if (r6 == 0) goto L78
                if (r6 == r2) goto L51
                goto Laa
            L51:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Laa
                java.lang.String r6 = r3.getName()
                java.lang.String r4 = "Companion"
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r4)
                if (r6 == 0) goto Laa
                r5.f49087i = r1
                r5.f49088j = r2
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r3, r5)
                if (r6 != r0) goto L6e
                return r0
            L6e:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) r6
                if (r6 == 0) goto Laa
                java.util.List r4 = r5.f49091m
                r4.add(r6)
                goto Laa
            L78:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto L7f
                goto Laa
            L7f:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r3)
                if (r6 == 0) goto La3
                java.lang.String r6 = r3.getText()
                if (r6 == 0) goto La3
                boolean r6 = sv.n0.isBlank(r6)
                if (r6 == 0) goto L92
                goto La3
            L92:
                java.lang.String r6 = r3.getText()
                java.lang.String r4 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r4)
                java.lang.CharSequence r6 = sv.n0.trim(r6)
                r6.toString()
                goto Laa
            La3:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r3)
                if (r6 == 0) goto Laa
                goto Lae
            Laa:
                r3.next()
                goto L41
            Lae:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            Lb1:
                org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49092i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49093j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49094k;

        /* renamed from: l, reason: collision with root package name */
        public int f49095l;

        public i(zu.d<? super i> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49094k = obj;
            this.f49095l |= Integer.MIN_VALUE;
            return l.N(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f49096i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49097j;

        /* renamed from: k, reason: collision with root package name */
        public int f49098k;

        public i0(zu.d<? super i0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49097j = obj;
            this.f49098k |= Integer.MIN_VALUE;
            return l.B(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49099i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49100j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49101k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49102l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2) {
            super(2, dVar);
            this.f49100j = xmlPullParser;
            this.f49101k = b1Var;
            this.f49102l = b1Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            j jVar = new j(this.f49100j, dVar, this.f49101k, this.f49102l);
            jVar.f49099i = obj;
            return jVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49099i);
            XmlPullParser xmlPullParser = this.f49100j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    String strB = l.b(xmlPullParser, "creativeType");
                    this.f49101k.f71816b = strB != null ? l.e(strB) : null;
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49102l.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49103i;

        /* renamed from: j, reason: collision with root package name */
        public int f49104j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49105k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49106l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49107m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49108n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49109o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ b1 f49110p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b1 f49111q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b1 f49112r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f49113s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b1 f49114t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List f49115u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f49116v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, List list, b1 b1Var7, List list2, List list3) {
            super(2, dVar);
            this.f49106l = xmlPullParser;
            this.f49107m = b1Var;
            this.f49108n = b1Var2;
            this.f49109o = b1Var3;
            this.f49110p = b1Var4;
            this.f49111q = b1Var5;
            this.f49112r = b1Var6;
            this.f49113s = list;
            this.f49114t = b1Var7;
            this.f49115u = list2;
            this.f49116v = list3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((j0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            j0 j0Var = new j0(this.f49106l, dVar, this.f49107m, this.f49108n, this.f49109o, this.f49110p, this.f49111q, this.f49112r, this.f49113s, this.f49114t, this.f49115u, this.f49116v);
            j0Var.f49105k = obj;
            return j0Var;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0246, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r3) != false) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x0249, code lost:
        
            r9.f49109o.f71816b = null;
            r9.f49110p.f71816b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r3, "apiFramework");
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
        
            if (r10 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
        
            if (r10 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
        
            if (r10 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0153, code lost:
        
            if (r10 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
        
            if (r10 == r0) goto L105;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01ca -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0231 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0246 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0092 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009a -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a0 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a6 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b1 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c6 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c8 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d8 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e8 -> B:52:0x00ec). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00fd -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x011c -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0130 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0132 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0142 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x017b -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0186 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01a4 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01b8 -> B:128:0x0249). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01ba -> B:128:0x0249). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 658
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49117i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49118j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49119k;

        /* renamed from: l, reason: collision with root package name */
        public int f49120l;

        public k(zu.d<? super k> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49119k = obj;
            this.f49120l |= Integer.MIN_VALUE;
            return l.O(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49121i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49122j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49123k;

        /* renamed from: l, reason: collision with root package name */
        public b1 f49124l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f49125m;

        /* renamed from: n, reason: collision with root package name */
        public b1 f49126n;

        /* renamed from: o, reason: collision with root package name */
        public ArrayList f49127o;

        /* renamed from: p, reason: collision with root package name */
        public ArrayList f49128p;

        /* renamed from: q, reason: collision with root package name */
        public b1 f49129q;

        /* renamed from: r, reason: collision with root package name */
        public ArrayList f49130r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f49131s;

        /* renamed from: t, reason: collision with root package name */
        public int f49132t;

        public k0(zu.d<? super k0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49131s = obj;
            this.f49132t |= Integer.MIN_VALUE;
            return l.C(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$l, reason: collision with other inner class name */
    public static final class C0458l extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49133i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49134j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49135k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0458l(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var) {
            super(2, dVar);
            this.f49134j = xmlPullParser;
            this.f49135k = b1Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((C0458l) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            C0458l c0458l = new C0458l(this.f49134j, dVar, this.f49135k);
            c0458l.f49133i = obj;
            return c0458l;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49133i);
            XmlPullParser xmlPullParser = this.f49134j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    continue;
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49135k.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49136i;

        /* renamed from: j, reason: collision with root package name */
        public int f49137j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49138k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49139l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49140m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49141n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49142o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ b1 f49143p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b1 f49144q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f49145r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, boolean z10) {
            super(2, dVar);
            this.f49139l = xmlPullParser;
            this.f49140m = b1Var;
            this.f49141n = b1Var2;
            this.f49142o = b1Var3;
            this.f49143p = b1Var4;
            this.f49144q = b1Var5;
            this.f49145r = z10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((l0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            l0 l0Var = new l0(this.f49139l, dVar, this.f49140m, this.f49141n, this.f49142o, this.f49143p, this.f49144q, this.f49145r);
            l0Var.f49138k = obj;
            return l0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
        
            if (r9 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        
            if (r9 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0119, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r5) != false) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[PHI: r1 r6
          0x00c0: PHI (r1v2 int) = (r1v3 int), (r1v4 int), (r1v7 int) binds: [B:35:0x008e, B:38:0x009c, B:47:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          0x00c0: PHI (r6v0 kotlin.jvm.internal.b1) = (r6v1 kotlin.jvm.internal.b1), (r6v7 kotlin.jvm.internal.b1), (r6v9 kotlin.jvm.internal.b1) binds: [B:35:0x008e, B:38:0x009c, B:47:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:65:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:65:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006f -> B:65:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0090 -> B:50:0x00c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a8 -> B:42:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c0 -> B:50:0x00c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ca -> B:65:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0104 -> B:65:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0119 -> B:65:0x011c). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49146i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49147j;

        /* renamed from: k, reason: collision with root package name */
        public int f49148k;

        public m(zu.d<? super m> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49147j = obj;
            this.f49148k |= Integer.MIN_VALUE;
            return l.P(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49149i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49150j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49151k;

        /* renamed from: l, reason: collision with root package name */
        public b1 f49152l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f49153m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f49154n;

        /* renamed from: o, reason: collision with root package name */
        public int f49155o;

        public m0(zu.d<? super m0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49154n = obj;
            this.f49155o |= Integer.MIN_VALUE;
            return l.e(null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49156i;

        /* renamed from: j, reason: collision with root package name */
        public int f49157j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49158k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49159l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f49160m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(XmlPullParser xmlPullParser, zu.d dVar, List list) {
            super(2, dVar);
            this.f49159l = xmlPullParser;
            this.f49160m = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((n) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            n nVar = new n(this.f49159l, dVar, this.f49160m);
            nVar.f49158k = obj;
            return nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r3) != false) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004e -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006b -> B:30:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0092 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a7 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49157j
                r2 = 1
                org.xmlpull.v1.XmlPullParser r3 = r5.f49159l
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                int r1 = r5.f49156i
                tu.a0.throwOnFailure(r6)
                goto L6e
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.f49158k
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r3)
                if (r6 == 0) goto L2e
                r3.nextTag()
            L2e:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r3)
                if (r6 == 0) goto L36
                goto Lae
            L36:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Lb1
                int r6 = r3.getDepth()
                r1 = r6
            L41:
                int r6 = r3.getDepth()
                if (r6 < r1) goto Lae
                int r6 = r3.getDepth()
                int r6 = r6 - r1
                if (r6 == 0) goto L78
                if (r6 == r2) goto L51
                goto Laa
            L51:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Laa
                java.lang.String r6 = r3.getName()
                java.lang.String r4 = "Tracking"
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r4)
                if (r6 == 0) goto Laa
                r5.f49156i = r1
                r5.f49157j = r2
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.t(r3, r5)
                if (r6 != r0) goto L6e
                return r0
            L6e:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) r6
                if (r6 == 0) goto Laa
                java.util.List r4 = r5.f49160m
                r4.add(r6)
                goto Laa
            L78:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto L7f
                goto Laa
            L7f:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r3)
                if (r6 == 0) goto La3
                java.lang.String r6 = r3.getText()
                if (r6 == 0) goto La3
                boolean r6 = sv.n0.isBlank(r6)
                if (r6 == 0) goto L92
                goto La3
            L92:
                java.lang.String r6 = r3.getText()
                java.lang.String r4 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r4)
                java.lang.CharSequence r6 = sv.n0.trim(r6)
                r6.toString()
                goto Laa
            La3:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r3)
                if (r6 == 0) goto Laa
                goto Lae
            Laa:
                r3.next()
                goto L41
            Lae:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            Lb1:
                org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49161i;

        /* renamed from: j, reason: collision with root package name */
        public int f49162j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49163k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49164l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f49165m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f49166n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(XmlPullParser xmlPullParser, zu.d dVar, boolean z10, List list) {
            super(2, dVar);
            this.f49164l = xmlPullParser;
            this.f49165m = z10;
            this.f49166n = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((n0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            n0 n0Var = new n0(this.f49164l, dVar, this.f49165m, this.f49166n);
            n0Var.f49163k = obj;
            return n0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r3) != false) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004e -> B:47:0x00ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:47:0x00ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:47:0x00ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006d -> B:30:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007e -> B:47:0x00ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0094 -> B:47:0x00ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a9 -> B:47:0x00ac). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49162j
                r2 = 1
                org.xmlpull.v1.XmlPullParser r3 = r5.f49164l
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                int r1 = r5.f49161i
                tu.a0.throwOnFailure(r6)
                goto L70
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.f49163k
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r3)
                if (r6 == 0) goto L2e
                r3.nextTag()
            L2e:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r3)
                if (r6 == 0) goto L36
                goto Lb0
            L36:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Lb3
                int r6 = r3.getDepth()
                r1 = r6
            L41:
                int r6 = r3.getDepth()
                if (r6 < r1) goto Lb0
                int r6 = r3.getDepth()
                int r6 = r6 - r1
                if (r6 == 0) goto L7a
                if (r6 == r2) goto L51
                goto Lac
            L51:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Lac
                java.lang.String r6 = r3.getName()
                java.lang.String r4 = "Creative"
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r4)
                if (r6 == 0) goto Lac
                r5.f49161i = r1
                r5.f49162j = r2
                boolean r6 = r5.f49165m
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r3, r6, r5)
                if (r6 != r0) goto L70
                return r0
            L70:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) r6
                if (r6 == 0) goto Lac
                java.util.List r4 = r5.f49166n
                r4.add(r6)
                goto Lac
            L7a:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto L81
                goto Lac
            L81:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r3)
                if (r6 == 0) goto La5
                java.lang.String r6 = r3.getText()
                if (r6 == 0) goto La5
                boolean r6 = sv.n0.isBlank(r6)
                if (r6 == 0) goto L94
                goto La5
            L94:
                java.lang.String r6 = r3.getText()
                java.lang.String r4 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r4)
                java.lang.CharSequence r6 = sv.n0.trim(r6)
                r6.toString()
                goto Lac
            La5:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r3)
                if (r6 == 0) goto Lac
                goto Lb0
            Lac:
                r3.next()
                goto L41
            Lb0:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            Lb3:
                org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f49167i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49168j;

        /* renamed from: k, reason: collision with root package name */
        public int f49169k;

        public o(zu.d<? super o> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49168j = obj;
            this.f49169k |= Integer.MIN_VALUE;
            return l.Q(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f49170i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49171j;

        /* renamed from: k, reason: collision with root package name */
        public int f49172k;

        public o0(zu.d<? super o0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49171j = obj;
            this.f49172k |= Integer.MIN_VALUE;
            return l.f(null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49173i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49174j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49175k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49176l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49177m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3) {
            super(2, dVar);
            this.f49174j = xmlPullParser;
            this.f49175k = b1Var;
            this.f49176l = b1Var2;
            this.f49177m = b1Var3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((p) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            p pVar = new p(this.f49174j, dVar, this.f49175k, this.f49176l, this.f49177m);
            pVar.f49173i = obj;
            return pVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49173i);
            XmlPullParser xmlPullParser = this.f49174j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    String strB = l.b(xmlPullParser, NotificationCompat.CATEGORY_EVENT);
                    this.f49175k.f71816b = strB != null ? l.i(strB) : null;
                    String strB2 = l.b(xmlPullParser, "offset");
                    this.f49176l.f71816b = strB2 != null ? l.g(strB2) : null;
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49177m.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49178i;

        /* renamed from: j, reason: collision with root package name */
        public int f49179j;

        public p0(zu.d<? super p0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49178i = obj;
            this.f49179j |= Integer.MIN_VALUE;
            return l.E(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class q extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49180i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49181j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49182k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f49183l;

        /* renamed from: m, reason: collision with root package name */
        public int f49184m;

        public q(zu.d<? super q> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49183l = obj;
            this.f49184m |= Integer.MIN_VALUE;
            return l.R(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class q0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49185i;

        /* renamed from: j, reason: collision with root package name */
        public int f49186j;

        public q0(zu.d<? super q0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49185i = obj;
            this.f49186j |= Integer.MIN_VALUE;
            return l.F(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class r extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49187i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49188j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(XmlPullParser xmlPullParser, zu.d<? super r> dVar) {
            super(2, dVar);
            this.f49188j = xmlPullParser;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> dVar) {
            return ((r) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            return new r(this.f49188j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49187i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                return obj;
            }
            tu.a0.throwOnFailure(obj);
            this.f49187i = 1;
            Object objT = l.T(this.f49188j, this);
            return objT == coroutine_suspended ? coroutine_suspended : objT;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class r0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49189i;

        /* renamed from: j, reason: collision with root package name */
        public int f49190j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49191k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49192l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49193m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f49194n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, List list) {
            super(2, dVar);
            this.f49192l = xmlPullParser;
            this.f49193m = b1Var;
            this.f49194n = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((r0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            r0 r0Var = new r0(this.f49192l, dVar, this.f49193m, this.f49194n);
            r0Var.f49191k = obj;
            return r0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
        
            if (r7 == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r4) != false) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:55:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:55:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:55:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0097 -> B:38:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a8 -> B:55:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00be -> B:55:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00d3 -> B:55:0x00d6). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.f49190j
                r2 = 2
                r3 = 1
                org.xmlpull.v1.XmlPullParser r4 = r6.f49192l
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                int r1 = r6.f49189i
                tu.a0.throwOnFailure(r7)
                goto L9a
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                int r1 = r6.f49189i
                java.lang.Object r5 = r6.f49191k
                kotlin.jvm.internal.b1 r5 = (kotlin.jvm.internal.b1) r5
                tu.a0.throwOnFailure(r7)
                goto L81
            L29:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.f49191k
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r7)
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r4)
                if (r7 == 0) goto L3c
                r4.nextTag()
            L3c:
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r4)
                if (r7 == 0) goto L44
                goto Ldb
            L44:
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r4)
                if (r7 == 0) goto Lde
                int r7 = r4.getDepth()
                r1 = r7
            L4f:
                int r7 = r4.getDepth()
                if (r7 < r1) goto Ldb
                int r7 = r4.getDepth()
                int r7 = r7 - r1
                if (r7 == 0) goto La4
                if (r7 == r3) goto L60
                goto Ld6
            L60:
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r4)
                if (r7 == 0) goto Ld6
                java.lang.String r7 = r4.getName()
                java.lang.String r5 = "IconClickThrough"
                boolean r5 = kotlin.jvm.internal.e0.areEqual(r7, r5)
                if (r5 == 0) goto L84
                kotlin.jvm.internal.b1 r5 = r6.f49193m
                r6.f49191k = r5
                r6.f49189i = r1
                r6.f49190j = r3
                java.lang.Object r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.r(r4, r6)
                if (r7 != r0) goto L81
                goto L99
            L81:
                r5.f71816b = r7
                goto Ld6
            L84:
                java.lang.String r5 = "IconClickTracking"
                boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r5)
                if (r7 == 0) goto Ld6
                r7 = 0
                r6.f49191k = r7
                r6.f49189i = r1
                r6.f49190j = r2
                java.lang.Object r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.r(r4, r6)
                if (r7 != r0) goto L9a
            L99:
                return r0
            L9a:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto Ld6
                java.util.List r5 = r6.f49194n
                r5.add(r7)
                goto Ld6
            La4:
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r4)
                if (r7 == 0) goto Lab
                goto Ld6
            Lab:
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r4)
                if (r7 == 0) goto Lcf
                java.lang.String r7 = r4.getText()
                if (r7 == 0) goto Lcf
                boolean r7 = sv.n0.isBlank(r7)
                if (r7 == 0) goto Lbe
                goto Lcf
            Lbe:
                java.lang.String r7 = r4.getText()
                java.lang.String r5 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
                java.lang.CharSequence r7 = sv.n0.trim(r7)
                r7.toString()
                goto Ld6
            Lcf:
                boolean r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r4)
                if (r7 == 0) goto Ld6
                goto Ldb
            Ld6:
                r4.next()
                goto L4f
            Ldb:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            Lde:
                org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.r0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class s extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49195i;

        /* renamed from: j, reason: collision with root package name */
        public int f49196j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49197k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49198l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49199m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49200n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f49201o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, List list) {
            super(2, dVar);
            this.f49198l = xmlPullParser;
            this.f49199m = b1Var;
            this.f49200n = b1Var2;
            this.f49201o = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((s) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            s sVar = new s(this.f49198l, dVar, this.f49199m, this.f49200n, this.f49201o);
            sVar.f49197k = obj;
            return sVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
        
            if (r7 == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r4) != false) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:55:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:55:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:55:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0097 -> B:38:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00aa -> B:55:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c8 -> B:55:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00dd -> B:55:0x00e0). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class s0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49202i;

        /* renamed from: j, reason: collision with root package name */
        public ArrayList f49203j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49204k;

        /* renamed from: l, reason: collision with root package name */
        public int f49205l;

        public s0(zu.d<? super s0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49204k = obj;
            this.f49205l |= Integer.MIN_VALUE;
            return l.G(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class t extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f49206i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49207j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49208k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f49209l;

        /* renamed from: m, reason: collision with root package name */
        public int f49210m;

        public t(zu.d<? super t> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49209l = obj;
            this.f49210m |= Integer.MIN_VALUE;
            return l.T(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class t0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49211i;

        /* renamed from: j, reason: collision with root package name */
        public int f49212j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49213k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49214l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49215m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49216n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49217o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ b1 f49218p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b1 f49219q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b1 f49220r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b1 f49221s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b1 f49222t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List f49223u;

        /* renamed from: v, reason: collision with root package name */
        public b1 f49224v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, List list) {
            super(2, dVar);
            this.f49214l = xmlPullParser;
            this.f49215m = b1Var;
            this.f49216n = b1Var2;
            this.f49217o = b1Var3;
            this.f49218p = b1Var4;
            this.f49219q = b1Var5;
            this.f49220r = b1Var6;
            this.f49221s = b1Var7;
            this.f49222t = b1Var8;
            this.f49223u = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((t0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            t0 t0Var = new t0(this.f49214l, dVar, this.f49215m, this.f49216n, this.f49217o, this.f49218p, this.f49219q, this.f49220r, this.f49221s, this.f49222t, this.f49223u);
            t0Var.f49213k = obj;
            return t0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:119:0x01fa, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r8) != false) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0161, code lost:
        
            if (r13 == r0) goto L87;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0124 A[PHI: r1 r9 r10
          0x0124: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v7 int), (r1v8 int) binds: [B:71:0x011c, B:61:0x00f9, B:52:0x00d6, B:74:0x0126] A[DONT_GENERATE, DONT_INLINE]
          0x0124: PHI (r9v2 kotlin.jvm.internal.b1) = 
          (r9v0 kotlin.jvm.internal.b1)
          (r9v1 kotlin.jvm.internal.b1)
          (r9v8 kotlin.jvm.internal.b1)
          (r9v17 kotlin.jvm.internal.b1)
         binds: [B:71:0x011c, B:61:0x00f9, B:52:0x00d6, B:74:0x0126] A[DONT_GENERATE, DONT_INLINE]
          0x0124: PHI (r10v2 org.xmlpull.v1.XmlPullParser) = 
          (r10v0 org.xmlpull.v1.XmlPullParser)
          (r10v1 org.xmlpull.v1.XmlPullParser)
          (r10v5 org.xmlpull.v1.XmlPullParser)
          (r10v7 org.xmlpull.v1.XmlPullParser)
         binds: [B:71:0x011c, B:61:0x00f9, B:52:0x00d6, B:74:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01e5 -> B:121:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01fa -> B:121:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:121:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0096 -> B:121:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0153 -> B:121:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0161 -> B:88:0x0164). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 525
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.t0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class u extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49225i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49226j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49227k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2) {
            super(2, dVar);
            this.f49226j = xmlPullParser;
            this.f49227k = b1Var;
            this.f49228l = b1Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((u) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            u uVar = new u(this.f49226j, dVar, this.f49227k, this.f49228l);
            uVar.f49225i = obj;
            return uVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49225i);
            XmlPullParser xmlPullParser = this.f49226j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    this.f49227k.f71816b = l.b(xmlPullParser, "id");
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49228l.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class u0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49229i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49230j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49231k;

        /* renamed from: l, reason: collision with root package name */
        public b1 f49232l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f49233m;

        /* renamed from: n, reason: collision with root package name */
        public b1 f49234n;

        /* renamed from: o, reason: collision with root package name */
        public b1 f49235o;

        /* renamed from: p, reason: collision with root package name */
        public b1 f49236p;

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f49237q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f49238r;

        /* renamed from: s, reason: collision with root package name */
        public int f49239s;

        public u0(zu.d<? super u0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49238r = obj;
            this.f49239s |= Integer.MIN_VALUE;
            return l.H(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class v extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49240i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49241j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49242k;

        /* renamed from: l, reason: collision with root package name */
        public int f49243l;

        public v(zu.d<? super v> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49242k = obj;
            this.f49243l |= Integer.MIN_VALUE;
            return l.U(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class v0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49244i;

        /* renamed from: j, reason: collision with root package name */
        public int f49245j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49246k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49247l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f49248m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(XmlPullParser xmlPullParser, zu.d dVar, List list) {
            super(2, dVar);
            this.f49247l = xmlPullParser;
            this.f49248m = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((v0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            v0 v0Var = new v0(this.f49247l, dVar, this.f49248m);
            v0Var.f49246k = obj;
            return v0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r3) != false) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004e -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006b -> B:30:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0092 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a7 -> B:47:0x00aa). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49245j
                r2 = 1
                org.xmlpull.v1.XmlPullParser r3 = r5.f49247l
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                int r1 = r5.f49244i
                tu.a0.throwOnFailure(r6)
                goto L6e
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.f49246k
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c(r3)
                if (r6 == 0) goto L2e
                r3.nextTag()
            L2e:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(r3)
                if (r6 == 0) goto L36
                goto Lae
            L36:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Lb1
                int r6 = r3.getDepth()
                r1 = r6
            L41:
                int r6 = r3.getDepth()
                if (r6 < r1) goto Lae
                int r6 = r3.getDepth()
                int r6 = r6 - r1
                if (r6 == 0) goto L78
                if (r6 == r2) goto L51
                goto Laa
            L51:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto Laa
                java.lang.String r6 = r3.getName()
                java.lang.String r4 = "Icon"
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r4)
                if (r6 == 0) goto Laa
                r5.f49244i = r1
                r5.f49245j = r2
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.j(r3, r5)
                if (r6 != r0) goto L6e
                return r0
            L6e:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) r6
                if (r6 == 0) goto Laa
                java.util.List r4 = r5.f49248m
                r4.add(r6)
                goto Laa
            L78:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.d(r3)
                if (r6 == 0) goto L7f
                goto Laa
            L7f:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(r3)
                if (r6 == 0) goto La3
                java.lang.String r6 = r3.getText()
                if (r6 == 0) goto La3
                boolean r6 = sv.n0.isBlank(r6)
                if (r6 == 0) goto L92
                goto La3
            L92:
                java.lang.String r6 = r3.getText()
                java.lang.String r4 = "getText(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r4)
                java.lang.CharSequence r6 = sv.n0.trim(r6)
                r6.toString()
                goto Laa
            La3:
                boolean r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.b(r3)
                if (r6 == 0) goto Laa
                goto Lae
            Laa:
                r3.next()
                goto L41
            Lae:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            Lb1:
                org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.v0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class w extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49249i;

        /* renamed from: j, reason: collision with root package name */
        public int f49250j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49251k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49252l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49253m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f49254n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f49255o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, List list, List list2) {
            super(2, dVar);
            this.f49252l = xmlPullParser;
            this.f49253m = b1Var;
            this.f49254n = list;
            this.f49255o = list2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((w) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            w wVar = new w(this.f49252l, dVar, this.f49253m, this.f49254n, this.f49255o);
            wVar.f49251k = obj;
            return wVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
        
            if (r10 == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
        
            if (r10 == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x011a, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r5) != false) goto L78;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0067 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006f -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0075 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0089 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0093 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a6 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00a8 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b5 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c3 -> B:53:0x00c6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d6 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x00ef -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0105 -> B:77:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x011a -> B:77:0x011d). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class w0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f49256i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49257j;

        /* renamed from: k, reason: collision with root package name */
        public int f49258k;

        public w0(zu.d<? super w0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49257j = obj;
            this.f49258k |= Integer.MIN_VALUE;
            return l.I(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class x extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public boolean f49259i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49260j;

        /* renamed from: k, reason: collision with root package name */
        public ArrayList f49261k;

        /* renamed from: l, reason: collision with root package name */
        public ArrayList f49262l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f49263m;

        /* renamed from: n, reason: collision with root package name */
        public int f49264n;

        public x(zu.d<? super x> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49263m = obj;
            this.f49264n |= Integer.MIN_VALUE;
            return l.h(null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class x0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49265i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49266j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b1 f49267k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b1 f49268l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2) {
            super(2, dVar);
            this.f49266j = xmlPullParser;
            this.f49267k = b1Var;
            this.f49268l = b1Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((x0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            x0 x0Var = new x0(this.f49266j, dVar, this.f49267k, this.f49268l);
            x0Var.f49265i = obj;
            return x0Var;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.f49265i);
            XmlPullParser xmlPullParser = this.f49266j;
            if (l.j(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            boolean zH = l.h(xmlPullParser);
            tu.x0 x0Var = tu.x0.f87415a;
            if (zH) {
                return x0Var;
            }
            if (!l.k(xmlPullParser)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        l.k(xmlPullParser);
                    }
                } else if (l.k(xmlPullParser)) {
                    this.f49267k.f71816b = l.b(xmlPullParser, "id");
                } else if (l.l(xmlPullParser) && (text = xmlPullParser.getText()) != null && !sv.n0.isBlank(text)) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f49268l.f71816b = sv.n0.trim(text2).toString();
                } else if (l.i(xmlPullParser)) {
                    return x0Var;
                }
                xmlPullParser.next();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class y extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49269i;

        /* renamed from: j, reason: collision with root package name */
        public int f49270j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49271k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49272l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49273m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49274n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49275o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List f49276p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List f49277q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ List f49278r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, List list, List list2, List list3) {
            super(2, dVar);
            this.f49272l = xmlPullParser;
            this.f49273m = b1Var;
            this.f49274n = b1Var2;
            this.f49275o = b1Var3;
            this.f49276p = list;
            this.f49277q = list2;
            this.f49278r = list3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((y) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            y yVar = new y(this.f49272l, dVar, this.f49273m, this.f49274n, this.f49275o, this.f49276p, this.f49277q, this.f49278r);
            yVar.f49271k = obj;
            return yVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x017c, code lost:
        
            r10.f49273m.f71816b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
        
            if (r11 == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        
            if (r11 == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x012b, code lost:
        
            if (r11 == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0179, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r7) != false) goto L95;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0080 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0088 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008e -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b3 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b5 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c2 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00d5 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00d7 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00e4 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0101 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x011d -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x012b -> B:76:0x012e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0164 -> B:94:0x017c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0179 -> B:94:0x017c). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class y0 extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49279i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49280j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49281k;

        /* renamed from: l, reason: collision with root package name */
        public int f49282l;

        public y0(zu.d<? super y0> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49281k = obj;
            this.f49282l |= Integer.MIN_VALUE;
            return l.J(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class z extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b1 f49283i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f49284j;

        /* renamed from: k, reason: collision with root package name */
        public b1 f49285k;

        /* renamed from: l, reason: collision with root package name */
        public ArrayList f49286l;

        /* renamed from: m, reason: collision with root package name */
        public ArrayList f49287m;

        /* renamed from: n, reason: collision with root package name */
        public ArrayList f49288n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f49289o;

        /* renamed from: p, reason: collision with root package name */
        public int f49290p;

        public z(zu.d<? super z> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49289o = obj;
            this.f49290p |= Integer.MIN_VALUE;
            return l.V(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class z0 extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49291i;

        /* renamed from: j, reason: collision with root package name */
        public int f49292j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49293k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49294l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b1 f49295m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b1 f49296n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b1 f49297o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ b1 f49298p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b1 f49299q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ List f49300r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f49301s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List f49302t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(XmlPullParser xmlPullParser, zu.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, List list, List list2, List list3) {
            super(2, dVar);
            this.f49294l = xmlPullParser;
            this.f49295m = b1Var;
            this.f49296n = b1Var2;
            this.f49297o = b1Var3;
            this.f49298p = b1Var4;
            this.f49299q = b1Var5;
            this.f49300r = list;
            this.f49301s = list2;
            this.f49302t = list3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((z0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            z0 z0Var = new z0(this.f49294l, dVar, this.f49295m, this.f49296n, this.f49297o, this.f49298p, this.f49299q, this.f49300r, this.f49301s, this.f49302t);
            z0Var.f49293k = obj;
            return z0Var;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x01dd, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i(r2) != false) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
        
            if (r8 == r0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0143, code lost:
        
            if (r8 == r0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x01a3, code lost:
        
            if (r8 == r0) goto L96;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01c8 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01dd -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0093 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009b -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a8 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b3 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c8 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ca -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d7 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f6 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0115 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0134 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0148 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x014a -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0157 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0175 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0194 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01a3 -> B:97:0x01a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01b2 -> B:112:0x01e0). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 552
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.z0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(org.xmlpull.v1.XmlPullParser r10, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c> r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.g0
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$g0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.g0) r0
            int r1 = r0.f49082m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49082m = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$g0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$g0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f49081l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49082m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.b1 r10 = r0.f49080k
            kotlin.jvm.internal.b1 r1 = r0.f49079j
            kotlin.jvm.internal.b1 r0 = r0.f49078i
            tu.a0.throwOnFailure(r11)
            goto L5e
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r11)
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            kotlin.jvm.internal.b1 r9 = new kotlin.jvm.internal.b1
            r9.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$f0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$f0
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49078i = r7
            r0.f49079j = r8
            r0.f49080k = r9
            r0.f49082m = r3
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r0 = r7
            r1 = r8
            r10 = r9
        L5e:
            java.lang.Object r10 = r10.f71816b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d r10 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) r10
            if (r10 == 0) goto L72
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c
            java.lang.Object r0 = r0.f71816b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.f71816b
            java.lang.Integer r1 = (java.lang.Integer) r1
            r11.<init>(r0, r1, r10)
            return r11
        L72:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.A(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(org.xmlpull.v1.XmlPullParser r5, zu.d<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i0
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$i0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i0) r0
            int r1 = r0.f49098k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49098k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$i0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$i0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49097j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49098k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r5 = r0.f49096i
            tu.a0.throwOnFailure(r6)
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$h0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$h0
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49096i = r6
            r0.f49098k = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.B(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(org.xmlpull.v1.XmlPullParser r18, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.C(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    public static final Object D(XmlPullParser xmlPullParser, zu.d<? super String> dVar) {
        return P(xmlPullParser, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(org.xmlpull.v1.XmlPullParser r4, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.p0
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$p0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.p0) r0
            int r1 = r0.f49179j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49179j = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$p0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$p0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49178i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49179j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.f49179j = r3
            java.lang.Object r5 = P(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L47
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l
            r4.<init>(r5)
            return r4
        L47:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.E(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(org.xmlpull.v1.XmlPullParser r4, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m> r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.q0
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$q0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.q0) r0
            int r1 = r0.f49186j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49186j = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$q0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$q0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49185i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49186j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.f49186j = r3
            java.lang.Object r5 = P(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L47
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m
            r4.<init>(r5)
            return r4
        L47:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.F(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.s0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$s0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.s0) r0
            int r1 = r0.f49205l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49205l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$s0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$s0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49204k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49205l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.util.ArrayList r6 = r0.f49203j
            kotlin.jvm.internal.b1 r0 = r0.f49202i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$r0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$r0
            r5.<init>(r6, r3, r7, r2)
            r0.f49202i = r7
            r0.f49203j = r2
            r0.f49205l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r7 = r0.f71816b
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L5f
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o
            r0.<init>(r7, r6)
            return r0
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.G(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(org.xmlpull.v1.XmlPullParser r17, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> r18) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.H(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(org.xmlpull.v1.XmlPullParser r5, zu.d<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.w0
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$w0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.w0) r0
            int r1 = r0.f49258k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49258k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$w0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$w0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49257j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49258k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r5 = r0.f49256i
            tu.a0.throwOnFailure(r6)
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$v0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$v0
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49256i = r6
            r0.f49258k = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.I(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.y0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$y0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.y0) r0
            int r1 = r0.f49282l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49282l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$y0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$y0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49281k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49282l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r6 = r0.f49280j
            kotlin.jvm.internal.b1 r0 = r0.f49279i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$x0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$x0
            r5.<init>(r6, r3, r7, r2)
            r0.f49279i = r7
            r0.f49280j = r2
            r0.f49282l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r6 = r6.f71816b
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L63
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p
            java.lang.Object r0 = r0.f71816b
            java.lang.String r0 = (java.lang.String) r0
            r7.<init>(r0, r6)
            return r7
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.J(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(org.xmlpull.v1.XmlPullParser r16, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q> r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$a r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a) r1
            int r2 = r1.f48989r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f48989r = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$a r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$a
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f48988q
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.f48989r
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 != r4) goto L3f
            java.util.ArrayList r2 = r1.f48987p
            java.util.ArrayList r3 = r1.f48986o
            java.util.ArrayList r4 = r1.f48985n
            kotlin.jvm.internal.b1 r5 = r1.f48984m
            kotlin.jvm.internal.b1 r6 = r1.f48983l
            kotlin.jvm.internal.b1 r7 = r1.f48982k
            kotlin.jvm.internal.b1 r8 = r1.f48981j
            kotlin.jvm.internal.b1 r1 = r1.f48980i
            tu.a0.throwOnFailure(r0)
            r10 = r2
            r9 = r3
            r0 = r8
            r8 = r4
            goto L97
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.jvm.internal.b1 r8 = com.google.android.gms.internal.play_billing.a.m(r0)
            kotlin.jvm.internal.b1 r9 = new kotlin.jvm.internal.b1
            r9.<init>()
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            kotlin.jvm.internal.b1 r11 = new kotlin.jvm.internal.b1
            r11.<init>()
            kotlin.jvm.internal.b1 r12 = new kotlin.jvm.internal.b1
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$z0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$z0
            r7 = 0
            r6 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f48980i = r8
            r1.f48981j = r9
            r1.f48982k = r10
            r1.f48983l = r11
            r1.f48984m = r12
            r1.f48985n = r13
            r1.f48986o = r14
            r1.f48987p = r15
            r1.f48989r = r4
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r1)
            if (r0 != r2) goto L8f
            return r2
        L8f:
            r1 = r8
            r0 = r9
            r7 = r10
            r6 = r11
            r5 = r12
            r8 = r13
            r9 = r14
            r10 = r15
        L97:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q
            java.lang.Object r1 = r1.f71816b
            r3 = r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f) r3
            java.lang.Object r0 = r0.f71816b
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r7.f71816b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.f71816b
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r5.f71816b
            r7 = r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u r7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) r7
            r5 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.K(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(org.xmlpull.v1.XmlPullParser r26, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s> r27) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.L(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(org.xmlpull.v1.XmlPullParser r5, zu.d<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.g
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$g r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.g) r0
            int r1 = r0.f49077k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49077k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$g r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49076j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49077k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r5 = r0.f49075i
            tu.a0.throwOnFailure(r6)
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$f r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$f
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49075i = r6
            r0.f49077k = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.M(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$i r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.i) r0
            int r1 = r0.f49095l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49095l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$i r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49094k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49095l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r6 = r0.f49093j
            kotlin.jvm.internal.b1 r0 = r0.f49092i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$h r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$h
            r5.<init>(r6, r3, r7, r2)
            r0.f49092i = r7
            r0.f49093j = r2
            r0.f49095l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r7 = r0.f71816b
            if (r7 != 0) goto L5c
            java.lang.Object r0 = r6.f71816b
            if (r0 != 0) goto L5c
            return r3
        L5c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.f71816b
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>(r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.N(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.k
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$k r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.k) r0
            int r1 = r0.f49120l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49120l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$k r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49119k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49120l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r6 = r0.f49118j
            kotlin.jvm.internal.b1 r0 = r0.f49117i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$j r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$j
            r5.<init>(r6, r3, r2, r7)
            r0.f49117i = r7
            r0.f49118j = r2
            r0.f49120l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r7 = r0.f71816b
            if (r7 == 0) goto L6e
            java.lang.Object r0 = r6.f71816b
            if (r0 != 0) goto L5c
            goto L6e
        L5c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v
            kotlin.jvm.internal.e0.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.f71816b
            kotlin.jvm.internal.e0.checkNotNull(r6)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) r6
            r0.<init>(r7, r6)
            return r0
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.O(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(org.xmlpull.v1.XmlPullParser r5, zu.d<? super java.lang.String> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.m
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$m r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.m) r0
            int r1 = r0.f49148k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49148k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$m r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49147j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49148k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.b1 r5 = r0.f49146i
            tu.a0.throwOnFailure(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.jvm.internal.b1 r6 = com.google.android.gms.internal.play_billing.a.m(r6)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$l r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$l
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49146i = r6
            r0.f49148k = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r5 = r6
        L49:
            java.lang.Object r5 = r5.f71816b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.P(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(org.xmlpull.v1.XmlPullParser r5, zu.d<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.o
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$o r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.o) r0
            int r1 = r0.f49169k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49169k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$o r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49168j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49169k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r5 = r0.f49167i
            tu.a0.throwOnFailure(r6)
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$n r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$n
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49167i = r6
            r0.f49169k = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.Q(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(org.xmlpull.v1.XmlPullParser r10, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.q
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$q r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.q) r0
            int r1 = r0.f49184m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49184m = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$q r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$q
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f49183l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49184m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.b1 r10 = r0.f49182k
            kotlin.jvm.internal.b1 r1 = r0.f49181j
            kotlin.jvm.internal.b1 r0 = r0.f49180i
            tu.a0.throwOnFailure(r11)
            goto L5e
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r11)
            kotlin.jvm.internal.b1 r9 = new kotlin.jvm.internal.b1
            r9.<init>()
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$p r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$p
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49180i = r7
            r0.f49181j = r9
            r0.f49182k = r8
            r0.f49184m = r3
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r0 = r7
            r10 = r8
            r1 = r9
        L5e:
            java.lang.Object r11 = r0.f71816b
            if (r11 == 0) goto L85
            java.lang.Object r0 = r1.f71816b
            if (r0 == 0) goto L85
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49412p
            if (r11 != r0) goto L6f
            java.lang.Object r0 = r10.f71816b
            if (r0 != 0) goto L6f
            goto L85
        L6f:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w
            kotlin.jvm.internal.e0.checkNotNull(r11)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x r11 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x) r11
            java.lang.Object r1 = r1.f71816b
            kotlin.jvm.internal.e0.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r10 = r10.f71816b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r10 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) r10
            r0.<init>(r11, r1, r10)
            return r0
        L85:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.R(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    public static final Object S(XmlPullParser xmlPullParser, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new r(xmlPullParser, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(org.xmlpull.v1.XmlPullParser r10, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.t
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$t r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.t) r0
            int r1 = r0.f49210m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49210m = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$t r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$t
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f49209l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49210m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.b1 r10 = r0.f49208k
            kotlin.jvm.internal.b1 r1 = r0.f49207j
            java.util.ArrayList r0 = r0.f49206i
            tu.a0.throwOnFailure(r11)
            goto L62
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            tu.a0.throwOnFailure(r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            kotlin.jvm.internal.b1 r7 = new kotlin.jvm.internal.b1
            r7.<init>()
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$s r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$s
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49206i = r9
            r0.f49207j = r7
            r0.f49208k = r8
            r0.f49210m = r3
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            r1 = r7
            r10 = r8
            r0 = r9
        L62:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L6e
            java.lang.Object r11 = r10.f71816b
            if (r11 != 0) goto L6e
            r10 = 0
            return r10
        L6e:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y
            java.lang.Object r10 = r10.f71816b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r1.f71816b
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r0, r10, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.T(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.v
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$v r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.v) r0
            int r1 = r0.f49243l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49243l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$v r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$v
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49242k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49243l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r6 = r0.f49241j
            kotlin.jvm.internal.b1 r0 = r0.f49240i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$u r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$u
            r5.<init>(r6, r3, r7, r2)
            r0.f49240i = r7
            r0.f49241j = r2
            r0.f49243l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r6 = r6.f71816b
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L63
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0
            java.lang.Object r0 = r0.f71816b
            java.lang.String r0 = (java.lang.String) r0
            r7.<init>(r0, r6)
            return r7
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.U(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(org.xmlpull.v1.XmlPullParser r14, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b> r15) {
        /*
            boolean r1 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.z
            if (r1 == 0) goto L13
            r1 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$z r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.z) r1
            int r2 = r1.f49290p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.f49290p = r2
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$z r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$z
            r1.<init>(r15)
        L18:
            java.lang.Object r0 = r1.f49289o
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.f49290p
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.util.ArrayList r2 = r1.f49288n
            java.util.ArrayList r3 = r1.f49287m
            java.util.ArrayList r4 = r1.f49286l
            kotlin.jvm.internal.b1 r5 = r1.f49285k
            kotlin.jvm.internal.b1 r6 = r1.f49284j
            kotlin.jvm.internal.b1 r1 = r1.f49283i
            tu.a0.throwOnFailure(r0)
            r8 = r2
            r7 = r3
            r0 = r6
            r6 = r4
            goto L80
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            kotlin.jvm.internal.b1 r9 = com.google.android.gms.internal.play_billing.a.m(r0)
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$y r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$y
            r7 = 0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f49283i = r9
            r1.f49284j = r8
            r1.f49285k = r10
            r1.f49286l = r11
            r1.f49287m = r12
            r1.f49288n = r13
            r1.f49290p = r4
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r1)
            if (r0 != r2) goto L7a
            return r2
        L7a:
            r0 = r8
            r1 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
        L80:
            java.lang.Object r1 = r1.f71816b
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L97
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b
            java.lang.Object r0 = r0.f71816b
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r0 = r5.f71816b
            r5 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f) r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L97:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.V(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    public static /* synthetic */ void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$c0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c0) r0
            int r1 = r0.f49026l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49026l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$c0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$c0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49025k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49026l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r6 = r0.f49024j
            kotlin.jvm.internal.b1 r0 = r0.f49023i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$b0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$b0
            r5.<init>(r6, r3, r2, r7)
            r0.f49023i = r7
            r0.f49024j = r2
            r0.f49026l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r7 = r0.f71816b
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L63
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e
            java.lang.Object r6 = r6.f71816b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r0.<init>(r7, r6)
            return r0
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.y(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(org.xmlpull.v1.XmlPullParser r6, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$e0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e0) r0
            int r1 = r0.f49062l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49062l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$e0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$e0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49061k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49062l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r6 = r0.f49060j
            kotlin.jvm.internal.b1 r0 = r0.f49059i
            tu.a0.throwOnFailure(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r7)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$d0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$d0
            r5.<init>(r6, r3, r2, r7)
            r0.f49059i = r7
            r0.f49060j = r2
            r0.f49062l = r4
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r6 = r2
        L53:
            java.lang.Object r7 = r0.f71816b
            if (r7 != 0) goto L5c
            java.lang.Object r0 = r6.f71816b
            if (r0 != 0) goto L5c
            return r3
        L5c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.f71816b
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>(r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.z(org.xmlpull.v1.XmlPullParser, zu.d):java.lang.Object");
    }

    public static final boolean h(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1;
    }

    public static final boolean i(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static final boolean j(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    public static final boolean k(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static final boolean l(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 4;
    }

    public static final Integer m(XmlPullParser xmlPullParser) {
        String strB = b(xmlPullParser, "sequence");
        if (strB == null) {
            return null;
        }
        Integer intOrNull = sv.j0.toIntOrNull(strB);
        return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 999);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t n(XmlPullParser xmlPullParser) {
        String strB = b(xmlPullParser, "skipoffset");
        if (strB != null) {
            return g(strB);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(org.xmlpull.v1.XmlPullParser r13, boolean r14, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i> r15) {
        /*
            boolean r0 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.m0
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$m0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.m0) r0
            int r1 = r0.f49155o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49155o = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$m0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$m0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f49154n
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49155o
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlin.jvm.internal.b1 r13 = r0.f49153m
            kotlin.jvm.internal.b1 r14 = r0.f49152l
            kotlin.jvm.internal.b1 r1 = r0.f49151k
            kotlin.jvm.internal.b1 r2 = r0.f49150j
            kotlin.jvm.internal.b1 r0 = r0.f49149i
            tu.a0.throwOnFailure(r15)
            goto L73
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r15)
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            kotlin.jvm.internal.b1 r9 = new kotlin.jvm.internal.b1
            r9.<init>()
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            kotlin.jvm.internal.b1 r11 = new kotlin.jvm.internal.b1
            r11.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$l0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$l0
            r6 = 0
            r5 = r13
            r12 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f49149i = r7
            r0.f49150j = r8
            r0.f49151k = r9
            r0.f49152l = r10
            r0.f49153m = r11
            r0.f49155o = r3
            java.lang.Object r13 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r13 != r1) goto L6e
            return r1
        L6e:
            r0 = r7
            r2 = r8
            r1 = r9
            r14 = r10
            r13 = r11
        L73:
            java.lang.Object r13 = r13.f71816b
            r8 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) r8
            if (r8 == 0) goto L94
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i
            java.lang.Object r13 = r0.f71816b
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.f71816b
            r5 = r13
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r13 = r1.f71816b
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r13 = r14.f71816b
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L94:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.e(org.xmlpull.v1.XmlPullParser, boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(org.xmlpull.v1.XmlPullParser r5, boolean r6, zu.d<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i>> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.o0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$o0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.o0) r0
            int r1 = r0.f49172k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49172k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$o0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$o0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49171j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49172k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r5 = r0.f49170i
            tu.a0.throwOnFailure(r7)
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$n0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$n0
            r4 = 0
            r2.<init>(r5, r4, r6, r7)
            r0.f49170i = r7
            r0.f49172k = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.f(org.xmlpull.v1.XmlPullParser, boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(org.xmlpull.v1.XmlPullParser r16, boolean r17, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$c r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.c) r1
            int r2 = r1.f49022r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f49022r = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$c r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f49021q
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.f49022r
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 != r4) goto L3f
            boolean r2 = r1.f49013i
            java.util.ArrayList r3 = r1.f49020p
            kotlin.jvm.internal.b1 r4 = r1.f49019o
            java.util.ArrayList r5 = r1.f49018n
            java.util.ArrayList r6 = r1.f49017m
            kotlin.jvm.internal.b1 r7 = r1.f49016l
            kotlin.jvm.internal.b1 r8 = r1.f49015k
            kotlin.jvm.internal.b1 r1 = r1.f49014j
            tu.a0.throwOnFailure(r0)
            r14 = r2
            r9 = r3
            r10 = r7
            r7 = r5
            goto L92
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.jvm.internal.b1 r8 = com.google.android.gms.internal.play_billing.a.m(r0)
            kotlin.jvm.internal.b1 r9 = new kotlin.jvm.internal.b1
            r9.<init>()
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            kotlin.jvm.internal.b1 r13 = new kotlin.jvm.internal.b1
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$b r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$b
            r7 = 0
            r6 = r16
            r14 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f49014j = r8
            r1.f49015k = r9
            r1.f49016l = r10
            r1.f49017m = r11
            r1.f49018n = r12
            r1.f49019o = r13
            r1.f49020p = r15
            r1.f49013i = r14
            r1.f49022r = r4
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r1)
            if (r0 != r2) goto L8c
            return r2
        L8c:
            r1 = r8
            r8 = r9
            r6 = r11
            r7 = r12
            r4 = r13
            r9 = r15
        L92:
            if (r14 == 0) goto L9c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9c
            r0 = 0
            return r0
        L9c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r
            java.lang.Object r0 = r1.f71816b
            r3 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) r3
            java.lang.Object r0 = r8.f71816b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) r0
            java.lang.Object r1 = r10.f71816b
            r5 = r1
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r1 = r4.f71816b
            r8 = r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a) r8
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.g(org.xmlpull.v1.XmlPullParser, boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer h(java.lang.String r3) {
        /*
            r0 = 0
            int r1 = tu.z.f87419c     // Catch: java.lang.Throwable -> L1f
            java.text.NumberFormat r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.f48979b     // Catch: java.lang.Throwable -> L1f
            java.lang.Number r3 = r1.parse(r3)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L21
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L1f
            r1 = 100
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L1f
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            if (r3 < 0) goto L21
            r2 = 101(0x65, float:1.42E-43)
            if (r3 >= r2) goto L21
            goto L22
        L1f:
            r3 = move-exception
            goto L27
        L21:
            r1 = r0
        L22:
            java.lang.Object r3 = tu.z.m7131constructorimpl(r1)     // Catch: java.lang.Throwable -> L1f
            goto L31
        L27:
            int r1 = tu.z.f87419c
            java.lang.Object r3 = tu.a0.createFailure(r3)
            java.lang.Object r3 = tu.z.m7131constructorimpl(r3)
        L31:
            boolean r1 = tu.z.m7136isFailureimpl(r3)
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r3
        L39:
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.h(java.lang.String):java.lang.Integer");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x i(String str) {
        switch (str.hashCode()) {
            case -1638835128:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49402f;
                }
                return null;
            case -1337830390:
                if (str.equals("thirdQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49403g;
                }
                return null;
            case -1001078227:
                if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49412p;
                }
                return null;
            case -934426579:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49409m;
                }
                return null;
            case -934318917:
                if (str.equals("rewind")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49408l;
                }
                return null;
            case -840405966:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49406j;
                }
                return null;
            case -599445191:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49404h;
                }
                return null;
            case -37683395:
                if (str.equals("closeLinear")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49410n;
                }
                return null;
            case 3363353:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49405i;
                }
                return null;
            case 3532159:
                if (str.equals("skip")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49411o;
                }
                return null;
            case 106440182:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49407k;
                }
                return null;
            case 109757538:
                if (str.equals("start")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49400c;
                }
                return null;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49401e;
                }
                return null;
            case 1778167540:
                if (str.equals(QpyI.rPr)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f49399b;
                }
                return null;
            default:
                return null;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j b() {
        return c();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k) f48978a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k();
    }

    public static final String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || sv.n0.isBlank(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    public static final Long f(String str) {
        Object objM7131constructorimpl;
        Object objM7131constructorimpl2;
        try {
            int i10 = tu.z.f87419c;
            Date date = e().parse(str);
            objM7131constructorimpl = tu.z.m7131constructorimpl(date != null ? Long.valueOf(date.getTime()) : null);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        if (tu.z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        Long l9 = (Long) objM7131constructorimpl;
        if (l9 != null) {
            return l9;
        }
        try {
            Date date2 = f().parse(str);
            objM7131constructorimpl2 = tu.z.m7131constructorimpl(date2 != null ? Long.valueOf(date2.getTime()) : null);
        } catch (Throwable th3) {
            int i12 = tu.z.f87419c;
            objM7131constructorimpl2 = tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
        }
        return (Long) (tu.z.m7136isFailureimpl(objM7131constructorimpl2) ? null : objM7131constructorimpl2);
    }

    public static final Object a(XmlPullParser xmlPullParser, kv.p pVar, kv.q qVar, kv.p pVar2, zu.d<? super tu.x0> dVar) {
        a0 a0Var = new a0(xmlPullParser, pVar, qVar, pVar2, null);
        kotlin.jvm.internal.b0.mark(0);
        CoroutineScopeKt.coroutineScope(a0Var, dVar);
        kotlin.jvm.internal.b0.mark(1);
        return tu.x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(org.xmlpull.v1.XmlPullParser r10, boolean r11, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a> r12) {
        /*
            boolean r0 = r12 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.x
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$x r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.x) r0
            int r1 = r0.f49264n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49264n = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$x r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$x
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f49263m
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49264n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r11 = r0.f49259i
            java.util.ArrayList r10 = r0.f49262l
            java.util.ArrayList r1 = r0.f49261k
            kotlin.jvm.internal.b1 r0 = r0.f49260j
            tu.a0.throwOnFailure(r12)
            goto L62
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.jvm.internal.b1 r7 = com.google.android.gms.internal.play_billing.a.m(r12)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$w r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l$w
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49260j = r7
            r0.f49261k = r8
            r0.f49262l = r9
            r0.f49259i = r11
            r0.f49264n = r3
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            r0 = r7
            r1 = r8
            r10 = r9
        L62:
            if (r11 == 0) goto L6a
            java.lang.Object r11 = r0.f71816b
            if (r11 != 0) goto L6a
            r10 = 0
            return r10
        L6a:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a
            java.lang.Object r12 = r0.f71816b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 r12 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) r12
            r11.<init>(r12, r1, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.h(org.xmlpull.v1.XmlPullParser, boolean, zu.d):java.lang.Object");
    }

    public static final SimpleDateFormat f() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e.a("HH:mm:ss");
    }

    public static final SimpleDateFormat e() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e.a("HH:mm:ss.SSS");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k e(String str) {
        if (sv.k0.startsWith(str, "image/", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f49344b;
        }
        if (sv.n0.contains((CharSequence) str, (CharSequence) "javascript", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f49345c;
        }
        return null;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t g(String str) {
        Long lF = f(str);
        if (lF != null) {
            return new t.b(lF.longValue());
        }
        Integer numH = h(str);
        if (numH != null) {
            return new t.a(numH.intValue());
        }
        return null;
    }
}
