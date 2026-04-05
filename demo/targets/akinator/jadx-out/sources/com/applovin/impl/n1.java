package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class n1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private p1 f14841a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f14842b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f14843c;

    /* renamed from: d, reason: collision with root package name */
    private Button f14844d;

    private void b() {
        s2 s2Var = new s2();
        s2Var.a(this.f14842b.z().a(this.f14841a));
        String strB = this.f14842b.z().b(this.f14841a.a());
        if (strB != null) {
            s2Var.a("\nBid Response Preview:\n");
            s2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f14843c = textView;
        textView.setText(s2Var.toString());
        this.f14843c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f14841a.c() + " - " + this.f14841a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        b8.a(findViewById(android.R.id.content), this.f14842b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f14844d = button;
        button.setOnClickListener(new a9(this, 1));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f14842b.z().a(this.f14841a, (Context) this, false);
        return true;
    }

    public void a(p1 p1Var, com.applovin.impl.sdk.k kVar) {
        this.f14841a = p1Var;
        this.f14842b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f14842b.z().a(this.f14841a, (Context) this, true);
    }

    private boolean a() {
        return (this.f14841a == null || this.f14842b == null) ? false : true;
    }
}
