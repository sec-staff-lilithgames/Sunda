package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import ca.m;
import ca.t;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import java.util.ArrayList;
import lb.b1;
import o9.j0;
import y9.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ReportActivity extends AkActivity {
    public static final /* synthetic */ int I = 0;
    public ImageView C;
    public ImageView D;
    public ListView E;
    public g F;
    public TextView G;
    public final j0 H = new j0(this, 8);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == 0) {
            goToHome(true);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        t();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f21681c) {
            return;
        }
        setContentView(R.layout.activity_report);
        this.C = (ImageView) findViewById(R.id.retourButton);
        this.E = (ListView) findViewById(R.id.reportAnswerList);
        this.G = (TextView) findViewById(R.id.textReport);
        this.D = (ImageView) findViewById(R.id.backgroundFond);
        g gVar = new g(this, (ArrayList) getIntent().getSerializableExtra("report"));
        this.F = gVar;
        this.E.setAdapter((ListAdapter) gVar);
        this.F.notifyDataSetChanged();
        this.E.setDivider(null);
        this.E.setDividerHeight(0);
        try {
            this.D.setImageDrawable(new BitmapDrawable(getResources(), t.sharedInstance().getSubjectBackgroundEndgame(m.sharedInstance().getCurrentInstance().getSubjectId())));
        } catch (OutOfMemoryError unused) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
        o2.x(this.G, "RAPPORT_DE_PARTIE");
        this.G.setTypeface(this.f21686i);
        markTextviewForUpdate(this.G);
        this.C.setOnClickListener(this.H);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.f21681c) {
            this.F.clear();
        }
        super.onDestroy();
    }

    public final void t() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
