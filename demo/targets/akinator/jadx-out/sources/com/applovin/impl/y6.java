package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class y6 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f16296a;

    /* renamed from: b, reason: collision with root package name */
    private String f16297b;

    /* renamed from: c, reason: collision with root package name */
    private String f16298c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f16298c);
        intent.putExtra("android.intent.extra.TITLE", this.f16297b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f16297b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f16296a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.k kVar) {
        this.f16296a = kVar;
        this.f16297b = str;
        this.f16298c = str2;
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f16297b);
        ((TextView) findViewById(R.id.textView)).setText(this.f16298c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
