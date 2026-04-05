package j1;

import a2.t3;
import a2.w3;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f68989e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f68989e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "graphicsLayer").set("block", this.f68989e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f68990e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f68991f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f68992g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f68993h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f68994i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f68995j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ float f68996k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f68997l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f68998m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f68999n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f69000o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f2 f69001p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f69002q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ z1 f69003r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f69004s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f69005t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 f2Var, boolean z10, z1 z1Var, long j11, long j12) {
            super(1);
            this.f68990e = f10;
            this.f68991f = f11;
            this.f68992g = f12;
            this.f68993h = f13;
            this.f68994i = f14;
            this.f68995j = f15;
            this.f68996k = f16;
            this.f68997l = f17;
            this.f68998m = f18;
            this.f68999n = f19;
            this.f69000o = j10;
            this.f69001p = f2Var;
            this.f69002q = z10;
            this.f69003r = z1Var;
            this.f69004s = j11;
            this.f69005t = j12;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "graphicsLayer").set("scaleX", Float.valueOf(this.f68990e));
            w3Var.getProperties().set("scaleY", Float.valueOf(this.f68991f));
            w3Var.getProperties().set("alpha", Float.valueOf(this.f68992g));
            w3Var.getProperties().set("translationX", Float.valueOf(this.f68993h));
            w3Var.getProperties().set("translationY", Float.valueOf(this.f68994i));
            w3Var.getProperties().set("shadowElevation", Float.valueOf(this.f68995j));
            w3Var.getProperties().set("rotationX", Float.valueOf(this.f68996k));
            w3Var.getProperties().set("rotationY", Float.valueOf(this.f68997l));
            w3Var.getProperties().set("rotationZ", Float.valueOf(this.f68998m));
            w3Var.getProperties().set("cameraDistance", Float.valueOf(this.f68999n));
            w3Var.getProperties().set("transformOrigin", u2.m5005boximpl(this.f69000o));
            w3Var.getProperties().set("shape", this.f69001p);
            com.google.android.gms.internal.play_billing.a.d(this.f69002q, w3Var.getProperties(), "clip", w3Var).set("renderEffect", this.f69003r);
            w3Var.getProperties().set("ambientShadowColor", m0.m4848boximpl(this.f69004s));
            w3Var.getProperties().set("spotShadowColor", m0.m4848boximpl(this.f69005t));
        }
    }

    public static final e1.v graphicsLayer(e1.v vVar, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return vVar.then(new a0(block, t3.isDebugInspectorInfoEnabled() ? new a(block) : t3.getNoInspectorInfo()));
    }

    @tu.f
    /* renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ e1.v m4992graphicsLayer2Xn7asI(e1.v graphicsLayer, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 shape, boolean z10, z1 z1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return m4994graphicsLayerpANQ8Wg(graphicsLayer, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, z1Var, w0.getDefaultShadowColor(), w0.getDefaultShadowColor());
    }

    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final e1.v m4994graphicsLayerpANQ8Wg(e1.v graphicsLayer, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 shape, boolean z10, z1 z1Var, long j11, long j12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return graphicsLayer.then(new i2(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, z1Var, j11, j12, t3.isDebugInspectorInfoEnabled() ? new b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, z1Var, j11, j12) : t3.getNoInspectorInfo(), null));
    }

    /* renamed from: graphicsLayer-pANQ8Wg$default, reason: not valid java name */
    public static /* synthetic */ e1.v m4995graphicsLayerpANQ8Wg$default(e1.v vVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 f2Var, boolean z10, z1 z1Var, long j11, long j12, int i10, Object obj) {
        return m4994graphicsLayerpANQ8Wg(vVar, (i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) == 0 ? f12 : 1.0f, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? f18 : 0.0f, (i10 & 512) != 0 ? 8.0f : f19, (i10 & 1024) != 0 ? u2.f69011b.m4991getCenterSzJe1aQ() : j10, (i10 & 2048) != 0 ? y1.getRectangleShape() : f2Var, (i10 & 4096) != 0 ? false : z10, (i10 & Segment.SIZE) != 0 ? null : z1Var, (i10 & 16384) != 0 ? w0.getDefaultShadowColor() : j11, (i10 & 32768) != 0 ? w0.getDefaultShadowColor() : j12);
    }

    @tu.f
    /* renamed from: graphicsLayer-sKFY_QE, reason: not valid java name */
    public static final /* synthetic */ e1.v m4996graphicsLayersKFY_QE(e1.v graphicsLayer, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 shape, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return m4995graphicsLayerpANQ8Wg$default(graphicsLayer, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, null, 0L, 0L, 49152, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ e1.v m4997graphicsLayersKFY_QE$default(e1.v vVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 f2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return m4996graphicsLayersKFY_QE(vVar, f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) == 0 ? f12 : 1.0f, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? f18 : 0.0f, (i10 & 512) != 0 ? 8.0f : f19, (i10 & 1024) != 0 ? u2.f69011b.m4991getCenterSzJe1aQ() : j10, (i10 & 2048) != 0 ? y1.getRectangleShape() : f2Var, (i10 & 4096) != 0 ? false : z10);
    }

    public static final e1.v toolingGraphicsLayer(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return t3.isDebugInspectorInfoEnabled() ? vVar.then(m4995graphicsLayerpANQ8Wg$default(e1.t.f53496b, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null)) : vVar;
    }
}
