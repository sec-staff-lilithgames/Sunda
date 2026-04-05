package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.impl.x6;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class l0 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f14284a;

    /* renamed from: b, reason: collision with root package name */
    private p2 f14285b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f14286e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f14287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f14288g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f14289h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f14290i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f14286e = list;
            this.f14287f = list2;
            this.f14288g = list3;
            this.f14289h = list4;
            this.f14290i = list5;
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f14286e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f14287f;
            } else {
                z10 = false;
                list = i10 == c.LISTED_TC_NETWORKS.ordinal() ? this.f14288g : i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f14289h : this.f14290i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((x6) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return i10 == c.MISSING_TC_NETWORKS.ordinal() ? this.f14286e.size() : i10 == c.MISSING_AC_NETWORKS.ordinal() ? this.f14287f.size() : i10 == c.LISTED_TC_NETWORKS.ordinal() ? this.f14288g.size() : i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f14289h.size() : this.f14290i.size();
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return i10 == c.MISSING_TC_NETWORKS.ordinal() ? new t4("MISSING TCF VENDORS (TC STRING)") : i10 == c.MISSING_AC_NETWORKS.ordinal() ? new t4("MISSING ATP NETWORKS (AC STRING)") : i10 == c.LISTED_TC_NETWORKS.ordinal() ? new t4("LISTED TCF VENDORS (TC STRING)") : i10 == c.LISTED_AC_NETWORKS.ordinal() ? new t4("LISTED ATP NETWORKS (AC STRING)") : new t4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements p2.a {
        public b() {
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            k7.a(o2Var.c(), o2Var.b(), l0.this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f14284a;
    }

    public void initialize(List<x6> list, List<x6> list2, List<x6> list3, List<x6> list4, List<x6> list5, com.applovin.impl.sdk.k kVar) {
        this.f14284a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f14285b = aVar;
        aVar.a(new b());
        this.f14285b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f14285b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2 a(x6 x6Var, boolean z10) {
        o2.b bVarA = o2.a();
        boolean zB = this.f14284a.s0().b();
        x6.a aVarF = x6Var.f();
        x6.a aVar = x6.a.TCF_VENDOR;
        if (aVarF == aVar || (x6Var.f() == x6.a.ATP_NETWORK && zB)) {
            String strC = x6Var.c();
            String str = x6Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            o2.b bVarB = bVarA.d(strC).d(z10 ? -65536 : -16777216).b(strC);
            StringBuilder sbU = p0.o2.u(str);
            sbU.append(x6Var.d());
            bVarB.a(sbU.toString()).a(true);
        } else {
            bVarA.d(x6Var.b());
        }
        return bVarA.a();
    }
}
