package yr;

import mh.p1;
import wr.e4;
import wr.h4;
import wr.k4;
import xr.ff;
import xr.te;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x extends xr.e {

    /* renamed from: p, reason: collision with root package name */
    public static final pw.g f95110p = new pw.g();

    /* renamed from: h, reason: collision with root package name */
    public final k4 f95111h;

    /* renamed from: i, reason: collision with root package name */
    public final String f95112i;

    /* renamed from: j, reason: collision with root package name */
    public final te f95113j;

    /* renamed from: k, reason: collision with root package name */
    public String f95114k;

    /* renamed from: l, reason: collision with root package name */
    public final w f95115l;

    /* renamed from: m, reason: collision with root package name */
    public final v f95116m;

    /* renamed from: n, reason: collision with root package name */
    public final wr.c f95117n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95118o;

    public x(k4 k4Var, e4 e4Var, h hVar, d0 d0Var, g1 g1Var, Object obj, int i10, int i11, String str, String str2, te teVar, ff ffVar, wr.i iVar) {
        super(new c1(), teVar, ffVar, e4Var, iVar, false);
        this.f95116m = new v(this);
        this.f95118o = false;
        this.f95113j = (te) p1.checkNotNull(teVar, "statsTraceCtx");
        this.f95111h = k4Var;
        this.f95114k = str;
        this.f95112i = str2;
        this.f95117n = d0Var.getAttributes();
        this.f95115l = new w(this, i10, teVar, obj, hVar, g1Var, d0Var, i11, k4Var.getFullMethodName());
    }

    @Override // xr.n
    public final xr.m b() {
        return this.f95115l;
    }

    @Override // xr.e, xr.k1
    public wr.c getAttributes() {
        return this.f95117n;
    }

    public h4 getType() {
        return this.f95111h.getType();
    }

    @Override // xr.e, xr.k1
    public void setAuthority(String str) {
        this.f95114k = (String) p1.checkNotNull(str, "authority");
    }
}
