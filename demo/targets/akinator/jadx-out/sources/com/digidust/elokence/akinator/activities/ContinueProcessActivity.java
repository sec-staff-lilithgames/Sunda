package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ca.m;
import ca.o;
import ca.t;
import ca.u;
import com.digidust.elokence.akinator.activities.ContinueProcessActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import java.util.ArrayList;
import mt.b0;
import o9.f0;
import o9.g0;
import o9.h0;
import ot.c;
import ou.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ContinueProcessActivity extends AkActivity {
    public static final /* synthetic */ int H = 0;
    public TextView C;
    public Button D;
    public Button E;
    public final f0 F;
    public final f0 G;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.f0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.f0] */
    public ContinueProcessActivity() {
        final int i10 = 0;
        this.F = new View.OnClickListener(this) { // from class: o9.f0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ContinueProcessActivity f78133c;

            {
                this.f78133c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ContinueProcessActivity continueProcessActivity = this.f78133c;
                switch (i11) {
                    case 0:
                        int i12 = ContinueProcessActivity.H;
                        continueProcessActivity.getClass();
                        Intent intent = new Intent(continueProcessActivity, (Class<?>) QuestionActivity.class);
                        intent.putExtra("upgradeView", true);
                        continueProcessActivity.startActivity(intent);
                        continueProcessActivity.finish();
                        break;
                    default:
                        int i13 = ContinueProcessActivity.H;
                        continueProcessActivity.t();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.G = new View.OnClickListener(this) { // from class: o9.f0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ContinueProcessActivity f78133c;

            {
                this.f78133c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ContinueProcessActivity continueProcessActivity = this.f78133c;
                switch (i112) {
                    case 0:
                        int i12 = ContinueProcessActivity.H;
                        continueProcessActivity.getClass();
                        Intent intent = new Intent(continueProcessActivity, (Class<?>) QuestionActivity.class);
                        intent.putExtra("upgradeView", true);
                        continueProcessActivity.startActivity(intent);
                        continueProcessActivity.finish();
                        break;
                    default:
                        int i13 = ContinueProcessActivity.H;
                        continueProcessActivity.t();
                        break;
                }
            }
        };
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == 0) {
            goToHome(true);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(true);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_continue_process);
        try {
            ((ImageView) findViewById(R.id.imageBackground)).setImageDrawable(new BitmapDrawable(getResources(), t.sharedInstance().getSubjectBackground(m.sharedInstance().getCurrentInstance().getSubjectId())));
        } catch (Exception unused) {
        }
        this.C = (TextView) findViewById(R.id.bulleText);
        this.D = (Button) findViewById(R.id.yesContinueButton);
        this.E = (Button) findViewById(R.id.noContinueButton);
        q(R.id.akinatorImage, t.sharedInstance().getAkiBitmap("akinator_etonnement"));
        q(R.id.akinatorChapeau, t.sharedInstance().getHatBitmap(m.sharedInstance().getHat(), "akinator_etonnement"));
        q(R.id.akinatorTenue, t.sharedInstance().getClothBitmap(m.sharedInstance().getCloth(), "akinator_etonnement"));
        this.C.setTypeface(this.f21686i);
        markTextviewForUpdate(this.D);
        markTextviewForUpdate(this.E);
        markTextviewForUpdate(this.C);
        updateTextViewsSize();
        o2.w(this.D, "OUI");
        o2.w(this.E, "NON");
        o2.x(this.C, "ON_CONTINUE");
        this.D.setOnClickListener(this.F);
        this.E.setOnClickListener(this.G);
    }

    public final void t() {
        ArrayList arrayList = new ArrayList();
        o.sharedInstance().setAkinatorStatus(1);
        u.sharedInstance().getPersoPropose();
        disposeAtDestruction(b0.fromCallable(new g0(0, arrayList)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new h0(0, this, arrayList)));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
