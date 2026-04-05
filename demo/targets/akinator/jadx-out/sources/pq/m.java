package pq;

import android.content.Context;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import ao.kwoC.zAQQWzBxnS;
import br.g1;
import br.h0;
import br.p1;
import br.y;
import br.z;
import com.ironsource.C3352n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import cr.f;
import dq.c0;
import dq.d0;
import dq.f0;
import dq.g0;
import dq.k0;
import dq.l0;
import dq.m0;
import dq.p0;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import sv.n0;
import tu.a0;
import tu.x0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements pq.i {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f81647s = 0;

    /* renamed from: a, reason: collision with root package name */
    public final cr.p f81648a;

    /* renamed from: b, reason: collision with root package name */
    public final xq.f f81649b;

    /* renamed from: c, reason: collision with root package name */
    public final pq.j f81650c;

    /* renamed from: d, reason: collision with root package name */
    public final oq.b f81651d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f81652e;

    /* renamed from: f, reason: collision with root package name */
    public final vq.c f81653f;

    /* renamed from: g, reason: collision with root package name */
    public final dq.i f81654g;

    /* renamed from: h, reason: collision with root package name */
    public pq.k f81655h;

    /* renamed from: i, reason: collision with root package name */
    public final f f81656i;

    /* renamed from: j, reason: collision with root package name */
    public final c f81657j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.o f81658k;

    /* renamed from: l, reason: collision with root package name */
    public final tu.o f81659l;

    /* renamed from: m, reason: collision with root package name */
    public final nr.b f81660m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f81661n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f81662o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f81663p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f81664q;

    /* renamed from: r, reason: collision with root package name */
    public final tu.o f81665r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class b implements eq.c {
        public b() {
        }

        @Override // eq.c
        public void a(eq.a adForm) {
            e0.checkNotNullParameter(adForm, "adForm");
            d0.b(m.this.f81648a, "AdsElement (" + adForm + ") - onAdFormShown", new Object[0]);
        }

        @Override // eq.c
        public void b(eq.a adForm) {
            e0.checkNotNullParameter(adForm, "adForm");
            m mVar = m.this;
            d0.b(mVar.f81648a, "AdsElement (" + adForm + ") - onAdFormLoaded", new Object[0]);
            mVar.f81661n.remove(adForm);
        }

        @Override // eq.c
        public void c(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            m mVar = m.this;
            d0.a(mVar.f81648a, "AdsElement (" + adForm + ") - onAdFormFailToLoad - " + error, new Object[0]);
            mVar.f81661n.remove(adForm);
        }

        @Override // eq.c
        public void a(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            d0.a(m.this.f81648a, "AdsElement (" + adForm + ") - onAdFormFailToShow - " + error, new Object[0]);
        }

        @Override // eq.c
        public void b(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            d0.a(m.this.f81648a, "AdsElement (" + adForm + ") - onAdFormExpired - " + error, new Object[0]);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements rq.e {
        public c() {
        }

        @Override // rq.e
        public void a(z brokenCreativeEvent) {
            e0.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            m.a(m.this, brokenCreativeEvent);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {
        public d(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class f implements tq.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f81670a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f81671b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81672b;

            public a(Object obj) {
                this.f81672b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((dq.l) this.f81672b).b();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81673b;

            public b(Object obj) {
                this.f81673b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((dq.l) this.f81673b).b();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81674b;

            public c(Object obj) {
                this.f81674b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((dq.l) this.f81674b).b();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class d implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81675b;

            public d(Object obj) {
                this.f81675b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((dq.l) this.f81675b).b();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class e extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81676i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81677j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81678k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81679l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81680m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ m f81681n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Integer f81682o;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81683b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m f81684c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Integer f81685e;

                public a(Object obj, m mVar, Integer num) {
                    this.f81683b = obj;
                    this.f81684c = mVar;
                    this.f81685e = num;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    cr.u uVar = (cr.u) this.f81683b;
                    m.a(this.f81684c, uVar, false, this.f81685e != null, (Runnable) new pq.n(uVar));
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, m mVar2, Integer num) {
                super(2, dVar);
                this.f81676i = mVar;
                this.f81677j = str;
                this.f81678k = str2;
                this.f81679l = cls;
                this.f81680m = str3;
                this.f81681n = mVar2;
                this.f81682o = num;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new e(this.f81676i, this.f81677j, this.f81678k, this.f81679l, this.f81680m, dVar, this.f81681n, this.f81682o);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81676i;
                String str = this.f81677j;
                Object objB = mVar.b(str);
                String str2 = this.f81678k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81679l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81680m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81681n, this.f81682o));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: pq.m$f$f, reason: collision with other inner class name */
        public static final class C0765f extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81686i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81687j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81688k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81689l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81690m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ boolean f81691n;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: pq.m$f$f$a */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81692b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f81693c;

                public a(Object obj, boolean z10) {
                    this.f81692b = obj;
                    this.f81693c = z10;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((cr.u) this.f81692b).lockVisibility(this.f81693c);
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0765f(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, boolean z10) {
                super(2, dVar);
                this.f81686i = mVar;
                this.f81687j = str;
                this.f81688k = str2;
                this.f81689l = cls;
                this.f81690m = str3;
                this.f81691n = z10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0765f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0765f(this.f81686i, this.f81687j, this.f81688k, this.f81689l, this.f81690m, dVar, this.f81691n);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81686i;
                String str = this.f81687j;
                Object objB = mVar.b(str);
                String str2 = this.f81688k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81689l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81690m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81691n));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class g extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81694i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81695j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81696k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81697l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81698m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Integer f81699n;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81700b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Integer f81701c;

                public a(Object obj, Integer num) {
                    this.f81700b = obj;
                    this.f81701c = num;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((f0) this.f81700b).b(this.f81701c);
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, Integer num) {
                super(2, dVar);
                this.f81694i = mVar;
                this.f81695j = str;
                this.f81696k = str2;
                this.f81697l = cls;
                this.f81698m = str3;
                this.f81699n = num;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new g(this.f81694i, this.f81695j, this.f81696k, this.f81697l, this.f81698m, dVar, this.f81699n);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81694i;
                String str = this.f81695j;
                Object objB = mVar.b(str);
                String str2 = this.f81696k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81697l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81698m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81699n));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class h extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81702i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81703j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81704k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81705l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81706m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f81707n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ long f81708o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ float f81709p;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81710b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f81711c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f81712e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f81713f;

                public a(Object obj, long j10, long j11, float f10) {
                    this.f81710b = obj;
                    this.f81711c = j10;
                    this.f81712e = j11;
                    this.f81713f = f10;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((g0) this.f81710b).a(this.f81711c, this.f81712e, this.f81713f);
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, long j10, long j11, float f10) {
                super(2, dVar);
                this.f81702i = mVar;
                this.f81703j = str;
                this.f81704k = str2;
                this.f81705l = cls;
                this.f81706m = str3;
                this.f81707n = j10;
                this.f81708o = j11;
                this.f81709p = f10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new h(this.f81702i, this.f81703j, this.f81704k, this.f81705l, this.f81706m, dVar, this.f81707n, this.f81708o, this.f81709p);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81702i;
                String str = this.f81703j;
                Object objB = mVar.b(str);
                String str2 = this.f81704k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81705l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81706m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81707n, this.f81708o, this.f81709p));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class i extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81714i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81715j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81716k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81717l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81718m;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81719b;

                public a(Object obj) {
                    this.f81719b = obj;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((dq.h0) this.f81719b).k();
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(m mVar, String str, String str2, Class cls, String str3, zu.d dVar) {
                super(2, dVar);
                this.f81714i = mVar;
                this.f81715j = str;
                this.f81716k = str2;
                this.f81717l = cls;
                this.f81718m = str3;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((i) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new i(this.f81714i, this.f81715j, this.f81716k, this.f81717l, this.f81718m, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81714i;
                String str = this.f81715j;
                Object objB = mVar.b(str);
                String str2 = this.f81716k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81717l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81718m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class j extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81720i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81721j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81722k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81723l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81724m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f81725n;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81726b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f81727c;

                public a(Object obj, long j10) {
                    this.f81726b = obj;
                    this.f81727c = j10;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((k0) this.f81726b).a(this.f81727c);
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, long j10) {
                super(2, dVar);
                this.f81720i = mVar;
                this.f81721j = str;
                this.f81722k = str2;
                this.f81723l = cls;
                this.f81724m = str3;
                this.f81725n = j10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((j) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new j(this.f81720i, this.f81721j, this.f81722k, this.f81723l, this.f81724m, dVar, this.f81725n);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81720i;
                String str = this.f81721j;
                Object objB = mVar.b(str);
                String str2 = this.f81722k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81723l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81724m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81725n));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class k extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81728i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81729j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81730k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81731l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81732m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ m f81733n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Integer f81734o;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81735b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m f81736c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Integer f81737e;

                public a(Object obj, m mVar, Integer num) {
                    this.f81735b = obj;
                    this.f81736c = mVar;
                    this.f81737e = num;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    cr.u uVar = (cr.u) this.f81735b;
                    m.a(this.f81736c, uVar, true, this.f81737e != null, (Runnable) new pq.p(uVar));
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, m mVar2, Integer num) {
                super(2, dVar);
                this.f81728i = mVar;
                this.f81729j = str;
                this.f81730k = str2;
                this.f81731l = cls;
                this.f81732m = str3;
                this.f81733n = mVar2;
                this.f81734o = num;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((k) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new k(this.f81728i, this.f81729j, this.f81730k, this.f81731l, this.f81732m, dVar, this.f81733n, this.f81734o);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81728i;
                String str = this.f81729j;
                Object objB = mVar.b(str);
                String str2 = this.f81730k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81731l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81732m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81733n, this.f81734o));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class l extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81738i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81739j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81740k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81741l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81742m;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81743b;

                public a(Object obj) {
                    this.f81743b = obj;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((dq.h) this.f81743b).m();
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(m mVar, String str, String str2, Class cls, String str3, zu.d dVar) {
                super(2, dVar);
                this.f81738i = mVar;
                this.f81739j = str;
                this.f81740k = str2;
                this.f81741l = cls;
                this.f81742m = str3;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((l) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new l(this.f81738i, this.f81739j, this.f81740k, this.f81741l, this.f81742m, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81738i;
                String str = this.f81739j;
                Object objB = mVar.b(str);
                String str2 = this.f81740k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81741l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81742m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: pq.m$f$m, reason: collision with other inner class name */
        public static final class C0766m implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81744b;

            public C0766m(Object obj) {
                this.f81744b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((l0) this.f81744b).e();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class n implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81745b;

            public n(Object obj) {
                this.f81745b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((l0) this.f81745b).e();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class o implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81746b;

            public o(Object obj) {
                this.f81746b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((l0) this.f81746b).e();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class p implements c0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f81747b;

            public p(Object obj) {
                this.f81747b = obj;
            }

            @Override // dq.c0, ir.k
            public final void onRun() {
                ((l0) this.f81747b).e();
            }

            @Override // dq.c0, ir.k
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // dq.c0, ir.k, java.lang.Runnable
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class q extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81748i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81749j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81750k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81751l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81752m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f81753n;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81754b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f81755c;

                public a(Object obj, String str) {
                    this.f81754b = obj;
                    this.f81755c = str;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((m0) this.f81754b).a(this.f81755c);
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, String str4) {
                super(2, dVar);
                this.f81748i = mVar;
                this.f81749j = str;
                this.f81750k = str2;
                this.f81751l = cls;
                this.f81752m = str3;
                this.f81753n = str4;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((q) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new q(this.f81748i, this.f81749j, this.f81750k, this.f81751l, this.f81752m, dVar, this.f81753n);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81748i;
                String str = this.f81749j;
                Object objB = mVar.b(str);
                String str2 = this.f81750k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81751l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81752m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81753n));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class r extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81756i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81757j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81758k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81759l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81760m;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81761b;

                public a(Object obj) {
                    this.f81761b = obj;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((cr.u) this.f81761b).unlockVisibility();
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(m mVar, String str, String str2, Class cls, String str3, zu.d dVar) {
                super(2, dVar);
                this.f81756i = mVar;
                this.f81757j = str;
                this.f81758k = str2;
                this.f81759l = cls;
                this.f81760m = str3;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((r) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new r(this.f81756i, this.f81757j, this.f81758k, this.f81759l, this.f81760m, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81756i;
                String str = this.f81757j;
                Object objB = mVar.b(str);
                String str2 = this.f81758k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81759l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81760m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB));
                    }
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class s extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ m f81762i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f81763j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f81764k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Class f81765l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f81766m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Integer f81767n;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements c0 {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f81768b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Integer f81769c;

                public a(Object obj, Integer num) {
                    this.f81768b = obj;
                    this.f81769c = num;
                }

                @Override // dq.c0, ir.k
                public final void onRun() {
                    ((f0) this.f81768b).a(this.f81769c);
                }

                @Override // dq.c0, ir.k
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // dq.c0, ir.k, java.lang.Runnable
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(m mVar, String str, String str2, Class cls, String str3, zu.d dVar, Integer num) {
                super(2, dVar);
                this.f81762i = mVar;
                this.f81763j = str;
                this.f81764k = str2;
                this.f81765l = cls;
                this.f81766m = str3;
                this.f81767n = num;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((s) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new s(this.f81762i, this.f81763j, this.f81764k, this.f81765l, this.f81766m, dVar, this.f81767n);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                m mVar = this.f81762i;
                String str = this.f81763j;
                Object objB = mVar.b(str);
                String str2 = this.f81764k;
                if (objB == null) {
                    m.a(mVar, str2, str);
                } else {
                    Class cls = this.f81765l;
                    if (!cls.isInstance(objB)) {
                        m.a(mVar, str2, str, this.f81766m);
                    } else if (cls.isInstance(objB)) {
                        cr.q.onUiThread(new a(objB, this.f81767n));
                    }
                }
                return x0.f87415a;
            }
        }

        public f(m mVar, Context context) {
            e0.checkNotNullParameter(context, "context");
            this.f81671b = mVar;
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f81670a = applicationContext;
        }

        @Override // tq.g
        public void a(String targetElementName, Integer num) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new e(mVar, targetElementName, "hide", cr.u.class, "VisibilityChanger", null, mVar, num), 2, null);
        }

        @Override // tq.g
        public void b(String url) {
            e0.checkNotNullParameter(url, "url");
            m mVar = this.f81671b;
            pq.k kVarM = mVar.m();
            if (kVarM != null) {
                kVarM.a();
            }
            cr.r.openUrl(this.f81670a, url, new pq.o(mVar));
        }

        @Override // tq.g
        public void c(String targetElementName, Integer num) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new g(mVar, targetElementName, CampaignEx.JSON_NATIVE_VIDEO_MUTE, f0.class, "Mutable", null, num), 2, null);
        }

        @Override // tq.g
        public void d(String url) {
            e0.checkNotNullParameter(url, "url");
            m mVar = this.f81671b;
            pq.k kVarM = mVar.m();
            if (kVarM != null) {
                kVarM.d();
            }
            pq.k kVarM2 = mVar.m();
            if (kVarM2 != null) {
                kVarM2.a();
            }
            cr.r.openUrl(this.f81670a, url, new pq.o(mVar));
        }

        @Override // tq.g
        public void e() {
            m mVar = this.f81671b;
            for (dq.h hVar : mVar.i()) {
                if (l0.class.isInstance(hVar)) {
                    cr.q.onUiThread(new C0766m(hVar));
                }
            }
            for (dq.h hVar2 : mVar.j()) {
                if (l0.class.isInstance(hVar2)) {
                    cr.q.onUiThread(new n(hVar2));
                }
            }
            for (dq.e0 e0Var : mVar.l()) {
                if (l0.class.isInstance(e0Var)) {
                    cr.q.onUiThread(new o(e0Var));
                }
            }
            p0 p0VarB = m.b(mVar);
            if (l0.class.isInstance(p0VarB)) {
                cr.q.onUiThread(new p(p0VarB));
            }
        }

        @Override // tq.g
        public void f(String targetElementName) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new l(mVar, targetElementName, "simulateClick", dq.h.class, "AdElement", null), 2, null);
        }

        @Override // tq.g
        public void g(String url) {
            e0.checkNotNullParameter(url, "url");
            new f.a(url, cr.i.Get).setUserAgent(zp.a.getUserAgent()).send();
        }

        @Override // tq.g
        public void a(String targetElementName, long j10, long j11, float f10) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new h(mVar, targetElementName, NotificationCompat.CATEGORY_PROGRESS, g0.class, "Progress", null, j10, j11, f10), 2, null);
        }

        @Override // tq.g
        public void c(String str) {
            e0.checkNotNullParameter(str, zAQQWzBxnS.pRFyXk);
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new i(mVar, str, "repeat", dq.h0.class, "Repeatable", null), 2, null);
        }

        @Override // tq.g
        public void a(String targetElementName, long j10) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new j(mVar, targetElementName, "schedule", k0.class, "Schedule", null, j10), 2, null);
        }

        @Override // tq.g
        public void b() {
            m mVar = this.f81671b;
            for (dq.h hVar : mVar.i()) {
                if (dq.l.class.isInstance(hVar)) {
                    cr.q.onUiThread(new a(hVar));
                }
            }
            for (dq.h hVar2 : mVar.j()) {
                if (dq.l.class.isInstance(hVar2)) {
                    cr.q.onUiThread(new b(hVar2));
                }
            }
            for (dq.e0 e0Var : mVar.l()) {
                if (dq.l.class.isInstance(e0Var)) {
                    cr.q.onUiThread(new c(e0Var));
                }
            }
            p0 p0VarB = m.b(mVar);
            if (dq.l.class.isInstance(p0VarB)) {
                cr.q.onUiThread(new d(p0VarB));
            }
        }

        @Override // tq.g
        public void a(String targetElementName, String str) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new q(mVar, targetElementName, "start", m0.class, "Startable", null, str), 2, null);
        }

        @Override // tq.g
        public void d(String targetElementName, Integer num) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new s(mVar, targetElementName, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, f0.class, "Mutable", null, num), 2, null);
        }

        @Override // tq.g
        public void a(String targetElementName, boolean z10) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new C0765f(mVar, targetElementName, "lockVisibility", cr.u.class, "VisibilityChanger", null, z10), 2, null);
        }

        @Override // tq.g
        public void a(p1 privacySheetParams) {
            e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            pq.k kVarM = this.f81671b.m();
            if (kVarM != null) {
                kVarM.a(privacySheetParams);
            }
        }

        @Override // tq.g
        public void a(String stateGroups) {
            e0.checkNotNullParameter(stateGroups, "stateGroups");
            m.e(this.f81671b).a(stateGroups);
        }

        @Override // tq.g
        public void e(String targetElementName) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new r(mVar, targetElementName, "unlockVisibility", cr.u.class, "VisibilityChanger", null), 2, null);
        }

        @Override // tq.g
        public void b(String targetElementName, Integer num) {
            e0.checkNotNullParameter(targetElementName, "targetElementName");
            m mVar = this.f81671b;
            BuildersKt__Builders_commonKt.launch$default(m.b(mVar, mVar), m.a(mVar, mVar).b(), null, new k(mVar, targetElementName, C3352n2.f37928v, cr.u.class, "VisibilityChanger", null, mVar, num), 2, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class g extends p0 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f81770e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m mVar, tq.b eventCallback) {
            super(eventCallback);
            e0.checkNotNullParameter(eventCallback, "eventCallback");
            this.f81770e = mVar;
        }

        @Override // dq.p0, dq.f0
        public void a(Integer num) {
            o().a(num);
        }

        @Override // dq.p0, dq.f0
        public void b(Integer num) {
            o().b(num);
        }

        @Override // dq.p0, dq.l0
        public void e() {
            pq.k kVarM = this.f81770e.m();
            if (kVarM != null) {
                kVarM.e();
            }
        }

        @Override // dq.p0
        public String p() {
            return o().e();
        }

        @Override // dq.p0, dq.l
        public void b() {
            pq.k kVarM = this.f81770e.m();
            if (kVarM != null) {
                kVarM.b();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81771b;

        public h(Object obj) {
            this.f81771b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81771b).pause();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81772b;

        public i(Object obj) {
            this.f81772b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81772b).pause();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81773b;

        public j(Object obj) {
            this.f81773b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81773b).pause();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81774b;

        public k(Object obj) {
            this.f81774b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81774b).pause();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81775b;

        public l(Object obj) {
            this.f81775b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81775b).l();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: pq.m$m, reason: collision with other inner class name */
    public static final class C0767m implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81776b;

        public C0767m(Object obj) {
            this.f81776b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81776b).l();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81777b;

        public n(Object obj) {
            this.f81777b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81777b).l();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f81778b;

        public o(Object obj) {
            this.f81778b = obj;
        }

        @Override // dq.c0, ir.k
        public final void onRun() {
            ((k0) this.f81778b).l();
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    static {
        new d(null);
    }

    public m(Context context, br.e adPhaseParams, cr.p tag, xq.f adState, pq.j adPhaseControllerListener, oq.b adAnimationController) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adPhaseParams, "adPhaseParams");
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(adState, "adState");
        e0.checkNotNullParameter(adPhaseControllerListener, "adPhaseControllerListener");
        e0.checkNotNullParameter(adAnimationController, "adAnimationController");
        this.f81648a = tag;
        this.f81649b = adState;
        this.f81650c = adPhaseControllerListener;
        this.f81651d = adAnimationController;
        Context applicationContext = context.getApplicationContext();
        this.f81652e = applicationContext;
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        vq.c cVar = new vq.c(applicationContext, adState.o(), adState.n());
        this.f81653f = cVar;
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        this.f81654g = new dq.i(applicationContext, cVar, adPhaseParams);
        this.f81656i = new f(this, context);
        this.f81657j = new c();
        this.f81658k = tu.q.lazy(new u(adPhaseParams));
        this.f81659l = tu.q.lazy(new s(this));
        this.f81660m = new nr.b(adState.o().getCoroutineContext().plus(adState.n().c()));
        this.f81661n = new ConcurrentHashMap();
        this.f81662o = new CopyOnWriteArrayList();
        this.f81663p = new CopyOnWriteArrayList();
        this.f81664q = new CopyOnWriteArrayList();
        this.f81665r = tu.q.lazy(new q(this));
    }

    public static final p0 b(m mVar) {
        return (p0) mVar.f81659l.getValue();
    }

    public static final uq.b e(m mVar) {
        return (uq.b) mVar.f81658k.getValue();
    }

    public final void g() {
        d0.b(this.f81648a, "Destroy AdPhase", new Object[0]);
        this.f81651d.a(e());
        cr.q.onUiThread(new cq.b(e(), 4));
    }

    public final eq.b h() {
        return (eq.b) this.f81665r.getValue();
    }

    public final List<dq.h> i() {
        return this.f81662o;
    }

    public final List<dq.h> j() {
        return this.f81663p;
    }

    public final List<dq.e0> l() {
        return this.f81664q;
    }

    public pq.k m() {
        return this.f81655h;
    }

    public final boolean o() {
        List<br.a> adsList = e().b().getAdsList();
        if (adsList.isEmpty()) {
            a(new h0("AdPhase does not contain any ads part"));
            return false;
        }
        if (b()) {
            r();
            return false;
        }
        if (!this.f81649b.c()) {
            return false;
        }
        List<dq.h> listA = a(adsList, new a());
        CopyOnWriteArrayList copyOnWriteArrayList = this.f81662o;
        copyOnWriteArrayList.addAll(listA);
        if (!copyOnWriteArrayList.isEmpty()) {
            return true;
        }
        a(new h0("No supported ads found for the given parameters"));
        return false;
    }

    @Override // pq.i
    public void onShown() {
        if (this.f81649b.i()) {
            d0.b(this.f81648a, "AdPhase - onShown", new Object[0]);
            b((List<? extends dq.h>) this.f81662o, true);
            b((List<? extends dq.h>) this.f81663p, true);
            ((p0) this.f81659l.getValue()).o().k();
        }
    }

    public final void p() {
        this.f81663p.addAll(a(e().b().getControlsList(), new e()));
    }

    public final void q() {
        List<g1> methodParamsList = e().b().getMethodParamsList();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(methodParamsList, 10));
        for (g1 g1Var : methodParamsList) {
            arrayList.add(new dq.e0(g1Var, a(g1Var.getName())));
        }
        this.f81664q.addAll(arrayList);
    }

    public final void r() {
        if (this.f81649b.a(true)) {
            this.f81650c.a(this);
        }
    }

    public String toString() {
        String string = this.f81648a.toString();
        e0.checkNotNullExpressionValue(string, "tag.toString()");
        return string;
    }

    public static final dq.q a(m mVar, m mVar2) {
        mVar.getClass();
        return mVar2.f81649b.n();
    }

    @Override // pq.i
    public void c() {
        d0.b(this.f81648a, "AdPhase - load", new Object[0]);
        xq.f fVar = this.f81649b;
        BuildersKt__Builders_commonKt.launch$default(fVar.o(), fVar.n().c(), null, new t(this, null), 2, null);
    }

    @Override // pq.i
    public void d() {
        d0.b(this.f81648a, "AdPhase - performShow", new Object[0]);
        for (dq.h hVar : i()) {
            if (k0.class.isInstance(hVar)) {
                cr.q.onUiThread(new l(hVar));
            }
        }
        for (dq.h hVar2 : j()) {
            if (k0.class.isInstance(hVar2)) {
                cr.q.onUiThread(new C0767m(hVar2));
            }
        }
        for (dq.e0 e0Var : l()) {
            if (k0.class.isInstance(e0Var)) {
                cr.q.onUiThread(new n(e0Var));
            }
        }
        p0 p0VarB = b(this);
        if (k0.class.isInstance(p0VarB)) {
            cr.q.onUiThread(new o(p0VarB));
        }
        xq.f fVar = this.f81649b;
        if (fVar.m()) {
            b((List<? extends dq.h>) this.f81662o, false);
            b((List<? extends dq.h>) this.f81663p, false);
        }
        fVar.l();
    }

    public final void f() {
        d0.b(this.f81648a, "Cancel loading AdElements", new Object[0]);
        ConcurrentHashMap concurrentHashMap = this.f81661n;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.f81660m.cancel((Runnable) ((Map.Entry) it.next()).getValue());
        }
        concurrentHashMap.clear();
    }

    public static final CoroutineScope b(m mVar, m mVar2) {
        mVar.getClass();
        return mVar2.f81649b.o();
    }

    @Override // pq.i
    public dq.i e() {
        return this.f81654g;
    }

    @Override // pq.i
    public void a(pq.k kVar) {
        this.f81655h = kVar;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends b {
        public a() {
            super();
        }

        @Override // pq.m.b, eq.c
        public void b(eq.a adForm) {
            e0.checkNotNullParameter(adForm, "adForm");
            super.b(adForm);
            m mVar = m.this;
            if (m.a(mVar, adForm, false, 2, (Object) null)) {
                if (mVar.f81661n.isEmpty()) {
                    mVar.r();
                }
            } else {
                c(adForm, new h0("Failed to setup ad element (" + adForm + ')'));
            }
        }

        @Override // pq.m.b, eq.c
        public void c(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            super.c(adForm, error);
            m.this.a(error);
        }

        @Override // pq.m.b, eq.c
        public void b(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            super.b(adForm, error);
            m.this.a(error);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class e extends b {
        public e() {
            super();
        }

        @Override // pq.m.b, eq.c
        public void b(eq.a adForm) {
            e0.checkNotNullParameter(adForm, "adForm");
            super.b(adForm);
            m mVar = m.this;
            if (!mVar.a(adForm, true)) {
                c(adForm, new h0("Failed to setup ad element (" + adForm + ')'));
            }
            if (mVar.f81661n.isEmpty()) {
                mVar.r();
            }
        }

        @Override // pq.m.b, eq.c
        public void c(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            super.c(adForm, error);
            m mVar = m.this;
            mVar.a((dq.h) adForm, mVar.j());
        }

        @Override // pq.m.b, eq.c
        public void b(eq.a adForm, h0 error) {
            e0.checkNotNullParameter(adForm, "adForm");
            e0.checkNotNullParameter(error, "error");
            super.b(adForm, error);
            m mVar = m.this;
            mVar.a((dq.h) adForm, mVar.j());
        }
    }

    @Override // pq.i
    public boolean a(ViewGroup container) {
        e0.checkNotNullParameter(container, "container");
        return e().a(container, this.f81662o, this.f81663p);
    }

    @Override // pq.i
    public boolean b() {
        return this.f81649b.b();
    }

    @Override // pq.i
    public void a(boolean z10) {
        d0.b(this.f81648a, o2.n("AdPhase - performHide, isFinishing: ", z10), new Object[0]);
        for (dq.h hVar : i()) {
            if (k0.class.isInstance(hVar)) {
                cr.q.onUiThread(new h(hVar));
            }
        }
        for (dq.h hVar2 : j()) {
            if (k0.class.isInstance(hVar2)) {
                cr.q.onUiThread(new i(hVar2));
            }
        }
        for (dq.e0 e0Var : l()) {
            if (k0.class.isInstance(e0Var)) {
                cr.q.onUiThread(new j(e0Var));
            }
        }
        p0 p0VarB = b(this);
        if (k0.class.isInstance(p0VarB)) {
            cr.q.onUiThread(new k(p0VarB));
        }
        a(this.f81662o, z10);
        a(this.f81663p, z10);
    }

    public final void b(dq.h item, boolean z10) {
        e0.checkNotNullParameter(item, "item");
        d0.b(this.f81648a, "Show AdElement - " + item.h().getName() + ", animated: " + z10, new Object[0]);
        pq.l lVar = new pq.l(item, 1);
        if (z10) {
            oq.b.a(this.f81651d, item, br.i.Appear, false, lVar, null, 20, null);
        } else {
            lVar.run();
        }
    }

    public final void b(List<? extends dq.h> items, boolean z10) {
        e0.checkNotNullParameter(items, "items");
        d0.b(this.f81648a, o2.n("Show AdElements, animated: ", z10), new Object[0]);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            b((dq.h) it.next(), z10);
        }
    }

    public final <T extends p0> void b(List<T> items) {
        e0.checkNotNullParameter(items, "items");
        d0.b(this.f81648a, "Destroy TargetObjects", new Object[0]);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            a((p0) it.next(), items);
        }
        items.clear();
    }

    public final Object b(String name) {
        Object next;
        Object next2;
        e0.checkNotNullParameter(name, "name");
        if (!n0.isBlank(name)) {
            Iterator it = this.f81662o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (sv.k0.equals(((dq.h) next).h().getName(), name, true)) {
                    break;
                }
            }
            Object next3 = (dq.h) next;
            if (next3 == null) {
                Iterator it2 = this.f81663p.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (sv.k0.equals(((dq.h) next2).h().getName(), name, true)) {
                        break;
                    }
                }
                next3 = (dq.h) next2;
                if (next3 == null) {
                    Iterator it3 = this.f81664q.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        if (sv.k0.equals(((dq.e0) next3).q().getName(), name, true)) {
                            break;
                        }
                    }
                }
            }
            if (next3 != null) {
                return next3;
            }
            tu.o oVar = this.f81659l;
            if (e0.areEqual(((p0) oVar.getValue()).p(), name)) {
                return (p0) oVar.getValue();
            }
        }
        return null;
    }

    @Override // pq.i
    public void a() {
        d0.b(this.f81648a, "AdPhase - destroy", new Object[0]);
        f();
        a(this.f81662o);
        a(this.f81663p);
        g();
        b(this.f81664q);
        a(this, (p0) this.f81659l.getValue(), (List) null, 2, (Object) null);
        a((pq.k) null);
        this.f81649b.a();
    }

    public final tq.b a(String sourceName) {
        e0.checkNotNullParameter(sourceName, "sourceName");
        uq.c cVar = new uq.c((uq.b) this.f81658k.getValue());
        oq.c cVar2 = new oq.c(this.f81651d, new r(this));
        tq.a aVar = new tq.a(this.f81656i, sourceName);
        xq.f fVar = this.f81649b;
        return new tq.d(sourceName, cVar, cVar2, aVar, fVar.o(), fVar.n(), e().b().getEventTypeMap(sourceName));
    }

    public final eq.a a(br.a elementParams, eq.c adFormListener) {
        e0.checkNotNullParameter(elementParams, "elementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        d0.b(this.f81648a, "Create AdElement - " + elementParams.getName(), new Object[0]);
        eq.b bVarH = h();
        tq.b bVarA = a(elementParams.getName());
        y brokenCreativeDetectorParams = elementParams.getBrokenCreativeDetectorParams();
        return bVarH.a(elementParams, adFormListener, bVarA, brokenCreativeDetectorParams != null ? new rq.a(e().b().getSequence(), elementParams.getName(), brokenCreativeDetectorParams, this.f81657j) : null);
    }

    public final void a(eq.a adForm, eq.c adFormListener) {
        e0.checkNotNullParameter(adForm, "adForm");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        d0.b(this.f81648a, "Load AdElement - " + adForm.h().getName(), new Object[0]);
        pq.h hVar = new pq.h(adForm);
        this.f81661n.put(adForm, hVar);
        try {
            this.f81660m.execute(hVar);
        } catch (Throwable th2) {
            adFormListener.c(adForm, h0.f9867b.create(th2));
        }
    }

    public static /* synthetic */ boolean a(m mVar, eq.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return mVar.a(aVar, z10);
    }

    public final boolean a(eq.a item, boolean z10) {
        e0.checkNotNullParameter(item, "item");
        boolean zB = item.B();
        if (zB) {
            this.f81651d.a(item, z10, br.i.Appear);
        }
        return zB;
    }

    public final void a(dq.h item, boolean z10) {
        e0.checkNotNullParameter(item, "item");
        d0.b(this.f81648a, "Hide AdElement - " + item.h().getName() + ", animated: " + z10, new Object[0]);
        pq.l lVar = new pq.l(item, 2);
        if (z10) {
            oq.b.a(this.f81651d, item, br.i.Disappear, false, null, lVar, 12, null);
        } else {
            lVar.run();
        }
    }

    public final void a(List<? extends dq.h> items, boolean z10) {
        e0.checkNotNullParameter(items, "items");
        d0.b(this.f81648a, o2.n("Hide AdElements, animated: ", z10), new Object[0]);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            a((dq.h) it.next(), z10);
        }
    }

    public static final void a(m mVar, cr.u uVar, boolean z10, boolean z11, Runnable runnable) {
        xq.f fVar = mVar.f81649b;
        if ((uVar instanceof dq.h) && fVar.d() && !fVar.h()) {
            mVar.f81651d.b((dq.h) uVar, z10 ? br.i.Appear : br.i.Disappear, z11, z10 ? runnable : null, z10 ? null : runnable);
        } else {
            runnable.run();
        }
    }

    public final void a(dq.h item, List<dq.h> list) {
        e0.checkNotNullParameter(item, "item");
        d0.b(this.f81648a, "Destroy AdElement - " + item.h().getName(), new Object[0]);
        this.f81651d.a(item);
        if (list != null) {
            list.remove(item);
        }
        cr.q.onUiThread(new pq.l(item, 0));
    }

    public final void a(List<dq.h> item) {
        e0.checkNotNullParameter(item, "item");
        d0.b(this.f81648a, "Destroy AdElements", new Object[0]);
        Iterator<T> it = item.iterator();
        while (it.hasNext()) {
            a((dq.h) it.next(), item);
        }
        item.clear();
    }

    public static /* synthetic */ void a(m mVar, p0 p0Var, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        mVar.a(p0Var, list);
    }

    public final <T extends p0> void a(p0 item, List<T> list) {
        e0.checkNotNullParameter(item, "item");
        d0.b(this.f81648a, "Destroy TargetObject - " + item.p(), new Object[0]);
        if (list != null) {
            h1.asMutableCollection(list).remove(item);
        }
        cr.q.onUiThread(new cq.b(item, 3));
    }

    public final void a(h0 error) {
        e0.checkNotNullParameter(error, "error");
        if (this.f81649b.a(false)) {
            this.f81650c.a(this, error);
        }
    }

    public static final void a(m mVar, z zVar) {
        pq.k kVarM;
        if (mVar.f81649b.h() || (kVarM = mVar.m()) == null) {
            return;
        }
        kVarM.a(zVar);
    }

    public static final void a(m mVar, String str, String str2) {
        d0.a(mVar.f81648a, e3.g.l("EventTask - ", str, ", target object (", str2, ") not found"), new Object[0]);
    }

    public static final void a(m mVar, String str, String str2, String str3) {
        cr.p pVar = mVar.f81648a;
        StringBuilder sbB = b3.h.b("EventTask - ", str, ", target object (", str2, ") not ");
        sbB.append(str3);
        d0.a(pVar, sbB.toString(), new Object[0]);
    }

    public final List<dq.h> a(List<br.a> elementsParams, eq.c adFormListener) {
        e0.checkNotNullParameter(elementsParams, "elementsParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(elementsParams, 10));
        Iterator<T> it = elementsParams.iterator();
        while (it.hasNext()) {
            arrayList.add(a((br.a) it.next(), adFormListener));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((eq.a) it2.next(), adFormListener);
        }
        return arrayList;
    }
}
