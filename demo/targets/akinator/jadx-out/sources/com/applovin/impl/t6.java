package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.x6;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class t6 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f15747a;

    /* renamed from: b, reason: collision with root package name */
    private p2 f15748b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f15749e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f15750f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15751g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f15749e = arrayList;
            this.f15750f = arrayList2;
            this.f15751g = z10;
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f15749e : this.f15750f;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f15749e.size() : this.f15750f.size();
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new t4("TCF VENDORS (TC STRING)");
            }
            return new t4(this.f15751g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private o2 a(String str, String str2) {
        return o2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f15747a;
    }

    public void initialize(List<x6> list, com.applovin.impl.sdk.k kVar) {
        this.f15747a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = p0.b().a(this);
        boolean zB = kVar.s0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (x6 x6Var : list) {
            Boolean boolA = x6Var.a();
            if (boolA != null) {
                if (x6Var.f() == x6.a.TCF_VENDOR) {
                    arrayList.add(a(x6Var.b(), String.valueOf(boolA)));
                } else if (x6Var.f() == x6.a.ATP_NETWORK) {
                    arrayList2.add(a(x6Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && x6Var.f() == x6.a.ATP_NETWORK) {
                arrayList2.add(a(x6Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f15748b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f15748b);
    }
}
