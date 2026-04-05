package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b7 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f13664a;

    /* renamed from: b, reason: collision with root package name */
    private List f13665b;

    /* renamed from: c, reason: collision with root package name */
    private p2 f13666c;

    /* renamed from: d, reason: collision with root package name */
    private List f13667d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f13668e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f13669e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f13669e = list;
        }

        @Override // com.applovin.impl.p2
        public o2 a() {
            return new o2.b(o2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return b7.this.f13667d;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return this.f13669e.size();
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return new t4("TEST MODE NETWORKS");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements p2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f13671a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f13672b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.f13671a = list;
            this.f13672b = kVar;
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            List listU = ((b3) this.f13671a.get(i2Var.a())).u();
            if (listU.equals(this.f13672b.t0().b())) {
                this.f13672b.t0().a((List) null);
            } else {
                this.f13672b.t0().a(listU);
            }
            b7.this.f13666c.notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends w3 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ b3 f13674p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b3 b3Var, Context context, b3 b3Var2) {
            super(b3Var, context);
            this.f13674p = b3Var2;
        }

        @Override // com.applovin.impl.w3, com.applovin.impl.o2
        public int d() {
            if (this.f13674p.u().equals(b7.this.f13664a.t0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.w3, com.applovin.impl.o2
        public int e() {
            if (this.f13674p.u().equals(b7.this.f13664a.t0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.o2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f13674p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public b7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f13664a;
    }

    public void initialize(List<b3> list, com.applovin.impl.sdk.k kVar) {
        this.f13664a = kVar;
        this.f13665b = list;
        this.f13667d = a(list);
        a aVar = new a(this, list);
        this.f13666c = aVar;
        aVar.a(new b(list, kVar));
        this.f13666c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f13668e = listView;
        listView.setAdapter((ListAdapter) this.f13666c);
    }

    @Override // com.applovin.impl.k3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f13667d = a(this.f13665b);
        this.f13666c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b3 b3Var = (b3) it.next();
            arrayList.add(new c(b3Var, this, b3Var));
        }
        return arrayList;
    }
}
