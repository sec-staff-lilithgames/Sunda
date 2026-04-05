package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.d;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x6;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class v6 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f16090a;

    /* renamed from: b, reason: collision with root package name */
    private p2 f16091b;

    /* renamed from: c, reason: collision with root package name */
    private final List f16092c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f16093d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f16094e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f16095f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f16096g = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? v6.this.c() : v6.this.a();
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? new t4("IAB TCF Parameters") : new t4("CMP CONFIGURATION");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements p2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w6 f16098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f16099b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16101a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f16102b;

            public a(String str, String str2) {
                this.f16101a = str;
                this.f16102b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f16101a, this.f16102b, b.this.f16099b);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.v6$b$b, reason: collision with other inner class name */
        public class C0044b implements d.b {
            public C0044b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(v6.this.f16094e, v6.this.f16095f, v6.this.f16092c, v6.this.f16093d, v6.this.f16096g, b.this.f16099b);
            }
        }

        public b(w6 w6Var, com.applovin.impl.sdk.k kVar) {
            this.f16098a = w6Var;
            this.f16099b = kVar;
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            String strA;
            String strC;
            if (i2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (i2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(v6.this, MaxDebuggerCmpNetworksListActivity.class, this.f16099b.e(), new C0044b());
                    return;
                } else {
                    k7.a(o2Var.c(), o2Var.b(), v6.this);
                    return;
                }
            }
            if (i2Var.a() == d.TC_STRING.ordinal()) {
                strA = x4.f16195w.a();
                strC = this.f16098a.j();
            } else {
                strA = x4.f16196x.a();
                strC = this.f16098a.c();
            }
            com.applovin.impl.d.a(v6.this, MaxDebuggerTcfStringActivity.class, this.f16099b.e(), new a(strA, strC));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f16090a;
    }

    public void initialize(List<x6> list, com.applovin.impl.sdk.k kVar) {
        this.f16090a = kVar;
        w6 w6VarS0 = kVar.s0();
        a(list);
        a aVar = new a(this);
        this.f16091b = aVar;
        aVar.a(new b(w6VarS0, kVar));
        this.f16091b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f16091b);
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p2 p2Var = this.f16091b;
        if (p2Var != null) {
            p2Var.a((p2.a) null);
        }
    }

    private void a(List list) {
        boolean zB = this.f16090a.s0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x6 x6Var = (x6) it.next();
            if (x6Var.f() == x6.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(x6Var.a())) {
                    a(x6Var, this.f16092c);
                } else {
                    a(x6Var, this.f16094e);
                }
            } else if (x6Var.f() != x6.a.ATP_NETWORK) {
                this.f16096g.add(x6Var);
            } else if (!zB) {
                this.f16096g.add(x6Var);
            } else if (Boolean.TRUE.equals(x6Var.a())) {
                a(x6Var, this.f16093d);
            } else {
                a(x6Var, this.f16095f);
            }
        }
    }

    private o2 b() {
        o2.b bVarA;
        String strA = x4.f16192t.a();
        Integer numE = this.f16090a.s0().e();
        if (StringUtils.isValidString(this.f16090a.s0().d())) {
            bVarA = o2.a(o2.c.RIGHT_DETAIL);
        } else {
            o2.b bVarB = o2.a(o2.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(m0.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? -16777216 : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f16090a.s0().g();
        String strJ = this.f16090a.s0().j();
        String strC = this.f16090a.s0().c();
        arrayList.add(a(x4.f16194v.a(), numG));
        arrayList.add(a(x4.f16195w.a(), strJ, !z6.b(strJ)));
        arrayList.add(a(x4.f16196x.a(), strC, false));
        return arrayList;
    }

    private void a(x6 x6Var, List list) {
        if (x6Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (x6Var.d().equals(((x6) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(x6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String strK;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f16095f.size() + this.f16094e.size();
        arrayList.add(b());
        arrayList.add(a(x4.f16193u.a(), this.f16090a.s0().f()));
        arrayList.add(o2.a(o2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        o2.b bVarD = o2.a(o2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            strK = p0.o2.k(size, "Missing ", " network(s)");
        } else {
            strK = "";
        }
        arrayList.add(bVarD.c(strK).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private o2 a(String str, Integer num) {
        return o2.a(o2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private o2 a(String str, String str2, boolean z10) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        o2.b bVarD = o2.a(o2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        o2.b bVarA = bVarD.c(str2).c(z10 ? -65536 : -16777216).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
