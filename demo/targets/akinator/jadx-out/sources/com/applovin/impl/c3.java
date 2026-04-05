package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.b3;
import com.applovin.impl.d;
import com.applovin.impl.d3;
import com.applovin.impl.p2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c3 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private d3 f13759a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f13760b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements p2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3 f13761a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.c3$a$a, reason: collision with other inner class name */
        public class C0029a implements d.b {
            public C0029a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f13761a);
            }
        }

        public a(b3 b3Var) {
            this.f13761a = b3Var;
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            if (i2Var.b() != d3.a.TEST_ADS.ordinal()) {
                k7.a(o2Var.c(), o2Var.b(), c3.this);
                return;
            }
            com.applovin.impl.sdk.k kVarO = this.f13761a.o();
            b3.b bVarY = this.f13761a.y();
            if (!c3.this.f13759a.a(i2Var)) {
                k7.a(o2Var.c(), o2Var.b(), c3.this);
                return;
            }
            if (b3.b.READY == bVarY) {
                d.a(c3.this, MaxDebuggerMultiAdActivity.class, kVarO.e(), new C0029a());
            } else if (b3.b.DISABLED != bVarY) {
                k7.a(o2Var.c(), o2Var.b(), c3.this);
            } else {
                kVarO.t0().a();
                k7.a(o2Var.c(), o2Var.b(), c3.this);
            }
        }
    }

    public c3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        d3 d3Var = this.f13759a;
        if (d3Var != null) {
            return d3Var.h().o();
        }
        return null;
    }

    public void initialize(b3 b3Var) {
        setTitle(b3Var.g());
        d3 d3Var = new d3(b3Var, this);
        this.f13759a = d3Var;
        d3Var.a(new a(b3Var));
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f13760b = listView;
        listView.setAdapter((ListAdapter) this.f13759a);
    }

    @Override // com.applovin.impl.k3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f13759a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f13759a.k();
            this.f13759a.c();
        }
    }
}
