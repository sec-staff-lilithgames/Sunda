package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.l3;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j3 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private l3 f14166a;

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f14167b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f14168c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f14169d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f14170e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            j3.this.a();
            j3 j3Var = j3.this;
            j3Var.b((Context) j3Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements p2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f14172a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.j3$b$b, reason: collision with other inner class name */
        public class C0032b implements d.b {
            public C0032b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(j3.this.f14166a.d(), j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class c implements d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(j3.this.f14166a.d(), j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class d implements d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(j3.this.f14166a.f(), false, j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class e implements d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(j3.this.f14166a.k(), j3.this.f14166a.w(), j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class f implements d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(j3.this.f14166a.v(), j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class g implements d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(j3.this.f14166a.o(), true, j3.this.f14166a.t());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class h implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o2 f14181a;

            public h(o2 o2Var) {
                this.f14181a = o2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((w3) this.f14181a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.f14172a = cVar;
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            int iB = i2Var.b();
            if (iB == l3.e.APP_INFO.ordinal()) {
                k7.a(o2Var.c(), o2Var.b(), j3.this);
                return;
            }
            if (iB == l3.e.MAX.ordinal()) {
                if (j3.this.f14166a.a(o2Var)) {
                    com.applovin.impl.d.a(j3.this, MaxDebuggerUnifiedFlowActivity.class, this.f14172a, new a());
                    return;
                } else {
                    k7.a(o2Var.c(), o2Var.b(), j3.this);
                    return;
                }
            }
            if (iB == l3.e.PRIVACY.ordinal()) {
                if (i2Var.a() != l3.d.CMP.ordinal()) {
                    if (i2Var.a() == l3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(j3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f14172a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(j3.this.f14166a.t().s0().j())) {
                    com.applovin.impl.d.a(j3.this, MaxDebuggerTcfInfoListActivity.class, this.f14172a, new C0032b());
                    return;
                } else {
                    k7.a(o2Var.c(), o2Var.b(), j3.this);
                    return;
                }
            }
            if (iB != l3.e.ADS.ordinal()) {
                if ((iB == l3.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || iB == l3.e.INCOMPLETE_NETWORKS.ordinal() || iB == l3.e.COMPLETED_NETWORKS.ordinal()) && (o2Var instanceof w3)) {
                    com.applovin.impl.d.a(j3.this, MaxDebuggerDetailActivity.class, this.f14172a, new h(o2Var));
                    return;
                }
                return;
            }
            if (i2Var.a() == l3.b.AD_UNITS.ordinal()) {
                if (j3.this.f14166a.f().size() > 0) {
                    com.applovin.impl.d.a(j3.this, MaxDebuggerAdUnitsListActivity.class, this.f14172a, new d());
                    return;
                } else {
                    k7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", j3.this);
                    return;
                }
            }
            if (i2Var.a() == l3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (j3.this.f14166a.k().size() <= 0 && j3.this.f14166a.w().size() <= 0) {
                    k7.a("Complete Integrations", "Please complete integrations in order to access this.", j3.this);
                    return;
                } else if (j3.this.f14166a.t().t0().c()) {
                    k7.a("Restart Required", o2Var.b(), j3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(j3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f14172a, new e());
                    return;
                }
            }
            if (i2Var.a() != l3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (i2Var.a() == l3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(j3.this, MaxDebuggerAdUnitsListActivity.class, this.f14172a, new g());
                }
            } else if (!j3.this.f14166a.t().t0().c()) {
                j3.this.getSdk().t0().a();
                k7.a("Restart Required", o2Var.b(), j3.this);
            } else if (j3.this.f14166a.v().size() > 0) {
                com.applovin.impl.d.a(j3.this, MaxDebuggerTestModeNetworkActivity.class, this.f14172a, new f());
            } else {
                k7.a("Complete Integrations", "Please complete integrations in order to access this.", j3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f14170e = aVar;
        aVar.setColor(-3355444);
        this.f14168c.addView(this.f14170e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f14168c.bringChildToFront(this.f14170e);
        this.f14170e.a();
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        l3 l3Var = this.f14166a;
        if (l3Var != null) {
            return l3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f14168c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f14169d = listView;
        listView.setAdapter((ListAdapter) this.f14166a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l3 l3Var = this.f14166a;
        if (l3Var != null) {
            l3Var.unregisterDataSetObserver(this.f14167b);
            this.f14166a.a((p2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        l3 l3Var = this.f14166a;
        if (l3Var == null || l3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(l3 l3Var, c cVar) {
        DataSetObserver dataSetObserver;
        l3 l3Var2 = this.f14166a;
        if (l3Var2 != null && (dataSetObserver = this.f14167b) != null) {
            l3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f14166a = l3Var;
        this.f14167b = new a();
        b((Context) this);
        this.f14166a.registerDataSetObserver(this.f14167b);
        this.f14166a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f14170e;
        if (aVar != null) {
            aVar.b();
            this.f14168c.removeView(this.f14170e);
            this.f14170e = null;
        }
    }

    private void b() {
        l3 l3Var = this.f14166a;
        if (l3Var == null) {
            return;
        }
        String strP = l3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        k7.a(this.f14166a.i(), this.f14166a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.f14166a.h()) || this.f14166a.x()) {
            return;
        }
        this.f14166a.b(true);
        runOnUiThread(new s8(11, this, context));
    }
}
