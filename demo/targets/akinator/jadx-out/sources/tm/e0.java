package tm;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f87016a;

    /* renamed from: b, reason: collision with root package name */
    public qm.a f87017b;

    /* renamed from: c, reason: collision with root package name */
    public String f87018c;

    /* renamed from: d, reason: collision with root package name */
    public String f87019d;

    /* renamed from: e, reason: collision with root package name */
    public String f87020e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f87021f;

    /* renamed from: g, reason: collision with root package name */
    public m0 f87022g;

    /* renamed from: h, reason: collision with root package name */
    public sm.b f87023h;

    /* renamed from: i, reason: collision with root package name */
    public um.p f87024i;

    /* renamed from: j, reason: collision with root package name */
    public um.p f87025j;

    /* renamed from: k, reason: collision with root package name */
    public um.p f87026k;

    /* renamed from: l, reason: collision with root package name */
    public um.p f87027l;

    /* renamed from: m, reason: collision with root package name */
    public float f87028m;

    /* renamed from: n, reason: collision with root package name */
    public float f87029n;

    /* renamed from: o, reason: collision with root package name */
    public float f87030o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f87031p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f87032q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f87033r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f87034s;

    public e0() {
        this(y.f87150b);
    }

    public l0 build(Context context) {
        return new l0(context, this);
    }

    public e0 forceUseNativeCloseButton(boolean z10) {
        this.f87032q = z10;
        return this;
    }

    public e0 setAdMeasurer(sm.b bVar) {
        this.f87023h = bVar;
        return this;
    }

    public e0 setAllowedNativeFeatures(String[] strArr) {
        this.f87021f = strArr;
        return this;
    }

    public e0 setBaseUrl(String str) {
        this.f87018c = str;
        return this;
    }

    public e0 setCacheControl(qm.a aVar) {
        this.f87017b = aVar;
        return this;
    }

    public e0 setCloseStyle(um.p pVar) {
        this.f87024i = pVar;
        return this;
    }

    public e0 setCloseTimeSec(float f10) {
        this.f87029n = f10;
        return this;
    }

    public e0 setCountDownStyle(um.p pVar) {
        this.f87025j = pVar;
        return this;
    }

    public e0 setDurationSec(float f10) {
        this.f87030o = f10;
        return this;
    }

    public e0 setIsTag(boolean z10) {
        this.f87031p = z10;
        return this;
    }

    public e0 setListener(m0 m0Var) {
        this.f87022g = m0Var;
        return this;
    }

    public e0 setLoadingStyle(um.p pVar) {
        this.f87026k = pVar;
        return this;
    }

    public e0 setPageFinishedScript(String str) {
        this.f87020e = str;
        return this;
    }

    public e0 setPlaceholderTimeoutSec(float f10) {
        this.f87028m = f10;
        return this;
    }

    public e0 setProductLink(String str) {
        this.f87019d = str;
        return this;
    }

    public e0 setProgressStyle(um.p pVar) {
        this.f87027l = pVar;
        return this;
    }

    public e0 setR1(boolean z10) {
        this.f87033r = z10;
        return this;
    }

    public e0 setR2(boolean z10) {
        this.f87034s = z10;
        return this;
    }

    public e0(y yVar) {
        this.f87021f = null;
        this.f87028m = 3.0f;
        this.f87029n = 0.0f;
        this.f87030o = 0.0f;
        this.f87016a = yVar;
        this.f87017b = qm.a.f83288b;
        this.f87018c = "https://localhost";
    }
}
