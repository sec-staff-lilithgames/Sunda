package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.c1;
import com.applovin.impl.d;
import com.applovin.impl.p2;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private c1 f13579a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f13580b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f13581c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements p2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13582a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.b1$a$a, reason: collision with other inner class name */
        public class C0028a implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i2 f13584a;

            public C0028a(i2 i2Var) {
                this.f13584a = i2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((p1) b1.this.f13579a.d().get(this.f13584a.a()), b1.this.f13579a.e());
            }
        }

        public a(c cVar) {
            this.f13582a = cVar;
        }

        @Override // com.applovin.impl.p2.a
        public void a(i2 i2Var, o2 o2Var) {
            if (i2Var.b() != c1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(b1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f13582a, new C0028a(i2Var));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f13580b = (FrameLayout) findViewById(android.R.id.content);
        this.f13581c = (ListView) findViewById(R.id.listView);
        b8.a(this.f13580b, com.applovin.impl.sdk.k.D0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c1 c1Var = this.f13579a;
        if (c1Var != null) {
            c1Var.a((p2.a) null);
            this.f13579a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        c1 c1Var = this.f13579a;
        if (c1Var == null) {
            finish();
            return;
        }
        this.f13581c.setAdapter((ListAdapter) c1Var);
        c1 c1Var2 = this.f13579a;
        if (c1Var2 != null && !c1Var2.e().z().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        c1 c1Var3 = this.f13579a;
        if (c1Var3 == null || !c1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(c1 c1Var, c cVar) {
        this.f13579a = c1Var;
        c1Var.a(new a(cVar));
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f13580b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f13580b.bringChildToFront(textView);
    }
}
