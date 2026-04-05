package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class m extends p2 {

    /* renamed from: e, reason: collision with root package name */
    private final n f14405e;

    /* renamed from: f, reason: collision with root package name */
    private final o f14406f;

    /* renamed from: g, reason: collision with root package name */
    private final f8 f14407g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14408h;

    /* renamed from: i, reason: collision with root package name */
    private final List f14409i;

    /* renamed from: j, reason: collision with root package name */
    private final List f14410j;

    /* renamed from: k, reason: collision with root package name */
    private final List f14411k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends w3 {

        /* renamed from: p, reason: collision with root package name */
        private final f8 f14417p;

        public b(f8 f8Var, String str, boolean z10) {
            super(f8Var.b().d(), m.this.f15022a);
            this.f14417p = f8Var;
            this.f14906c = StringUtils.createSpannedString(f8Var.b().a(), -16777216, 18, 1);
            this.f14907d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f14905b = z10;
        }

        @Override // com.applovin.impl.o2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.w3, com.applovin.impl.o2
        public boolean o() {
            return this.f14905b;
        }

        public f8 v() {
            return this.f14417p;
        }
    }

    public m(n nVar, o oVar, f8 f8Var, Context context) {
        super(context);
        this.f14405e = nVar;
        this.f14407g = f8Var;
        this.f14406f = oVar != null ? oVar : nVar.f();
        this.f14408h = oVar != null ? oVar.c() : nVar.d();
        this.f14409i = h();
        this.f14410j = e();
        this.f14411k = l();
        notifyDataSetChanged();
    }

    private o2 f() {
        return o2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private o2 g() {
        return o2.a().d("ID").c(this.f14405e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f14406f.b() != null) {
            arrayList.add(f());
        }
        if (this.f14407g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private o2 i() {
        return o2.a().d("Selected Network").c(this.f14407g.b().a()).a();
    }

    private List l() {
        f8 f8Var = this.f14407g;
        if (f8Var != null && f8Var.d()) {
            return new ArrayList();
        }
        List<f8> listE = this.f14406f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (f8 f8Var2 : listE) {
            f8 f8Var3 = this.f14407g;
            if (f8Var3 == null || f8Var3.b().c().equals(f8Var2.b().c())) {
                arrayList.add(new b(f8Var2, null, this.f14407g == null));
                for (x3 x3Var : f8Var2.c()) {
                    arrayList.add(o2.a().d(x3Var.a()).c(x3Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.p2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.p2
    public List c(int i10) {
        return i10 == a.INFO.ordinal() ? this.f14409i : i10 == a.BIDDERS.ordinal() ? this.f14410j : this.f14411k;
    }

    @Override // com.applovin.impl.p2
    public int d(int i10) {
        return i10 == a.INFO.ordinal() ? this.f14409i.size() : i10 == a.BIDDERS.ordinal() ? this.f14410j.size() : this.f14411k.size();
    }

    @Override // com.applovin.impl.p2
    public o2 e(int i10) {
        return i10 == a.INFO.ordinal() ? new t4("INFO") : i10 == a.BIDDERS.ordinal() ? new t4("BIDDERS") : new t4("WATERFALL");
    }

    public o j() {
        return this.f14406f;
    }

    public String k() {
        return this.f14408h;
    }

    private o2 d() {
        return o2.a().d("Ad Format").c(this.f14405e.b()).a();
    }

    private List e() {
        f8 f8Var = this.f14407g;
        if (f8Var != null && !f8Var.d()) {
            return new ArrayList();
        }
        List<f8> listA = this.f14406f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (f8 f8Var2 : listA) {
            f8 f8Var3 = this.f14407g;
            if (f8Var3 == null || f8Var3.b().c().equals(f8Var2.b().c())) {
                arrayList.add(new b(f8Var2, f8Var2.a() != null ? f8Var2.a().a() : "", this.f14407g == null));
            }
        }
        return arrayList;
    }
}
