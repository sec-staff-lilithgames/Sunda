package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.o2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a7 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f13417a;

    /* renamed from: b, reason: collision with root package name */
    private List f13418b;

    /* renamed from: c, reason: collision with root package name */
    private List f13419c;

    /* renamed from: d, reason: collision with root package name */
    private p2 f13420d;

    /* renamed from: e, reason: collision with root package name */
    private List f13421e;

    /* renamed from: f, reason: collision with root package name */
    private List f13422f;

    /* renamed from: g, reason: collision with root package name */
    private ListView f13423g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.p2
        public o2 a() {
            return new o2.b(o2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return i10 == c.BIDDERS.ordinal() ? a7.this.f13421e : a7.this.f13422f;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return i10 == c.BIDDERS.ordinal() ? a7.this.f13421e.size() : a7.this.f13422f.size();
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return i10 == c.BIDDERS.ordinal() ? new t4("BIDDERS") : new t4("WATERFALL");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends w3 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ r2 f13425p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b3 b3Var, Context context, r2 r2Var) {
            super(b3Var, context);
            this.f13425p = r2Var;
        }

        @Override // com.applovin.impl.w3, com.applovin.impl.o2
        public int d() {
            if (a7.this.f13417a.t0().b() == null || !a7.this.f13417a.t0().b().equals(this.f13425p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.w3, com.applovin.impl.o2
        public int e() {
            if (a7.this.f13417a.t0().b() == null || !a7.this.f13417a.t0().b().equals(this.f13425p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.o2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f13425p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public a7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f13417a;
    }

    public void initialize(List<r2> list, List<r2> list2, com.applovin.impl.sdk.k kVar) {
        this.f13417a = kVar;
        this.f13418b = list;
        this.f13419c = list2;
        this.f13421e = a(list);
        this.f13422f = a(list2);
        a aVar = new a(this);
        this.f13420d = aVar;
        aVar.a(new q8(this, kVar));
        this.f13420d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f13423g = listView;
        listView.setAdapter((ListAdapter) this.f13420d);
    }

    @Override // com.applovin.impl.k3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f13421e = a(this.f13418b);
        this.f13422f = a(this.f13419c);
        this.f13420d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, i2 i2Var, o2 o2Var) {
        List listB = a(i2Var).b();
        if (listB.equals(kVar.t0().b())) {
            kVar.t0().a((List) null);
        } else {
            kVar.t0().a(listB);
        }
        this.f13420d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2 r2Var = (r2) it.next();
            arrayList.add(new b(r2Var.d(), this, r2Var));
        }
        return arrayList;
    }

    private r2 a(i2 i2Var) {
        if (i2Var.b() == c.BIDDERS.ordinal()) {
            return (r2) this.f13418b.get(i2Var.a());
        }
        return (r2) this.f13419c.get(i2Var.a());
    }
}
