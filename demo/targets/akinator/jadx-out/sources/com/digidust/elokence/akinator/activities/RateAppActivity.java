package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;
import com.digidust.elokence.akinator.activities.RateAppActivity;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class RateAppActivity extends AkActivity {
    public static final /* synthetic */ int C = 0;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_rate_app);
        TextView textView = (TextView) findViewById(R.id.titleRateAppText);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "NOTE_AIMES_TU_NOTRE_APPLICATION", textView);
        textView.setTypeface(AkApplication.f21719f.getTypeFaceSatisfyReg());
        TextView textView2 = (TextView) findViewById(R.id.textYesRateApp);
        o2.A(aVar, "NOTE_OUI", textView2);
        Typeface typeface = this.f21686i;
        textView2.setTypeface(typeface);
        TextView textView3 = (TextView) findViewById(R.id.textNoRateApp);
        textView3.setText(aVar.sharedInstance().getTraductionFromToken("NOTE_NON"));
        textView3.setTypeface(typeface);
        TextView textView4 = (TextView) findViewById(R.id.textYesDesctription);
        textView4.setText(aVar.sharedInstance().getTraductionFromToken("NOTE_OUI_TEXT1"));
        textView4.setTypeface(typeface);
        TextView textView5 = (TextView) findViewById(R.id.textYesDesctription2);
        textView5.setText(aVar.sharedInstance().getTraductionFromToken("NOTE_OUI_TEXT2"));
        textView5.setTypeface(typeface);
        TextView textView6 = (TextView) findViewById(R.id.textNoDesctription);
        textView6.setText(aVar.sharedInstance().getTraductionFromToken("NOTE_NON_TEXT1"));
        textView6.setTypeface(typeface);
        TextView textView7 = (TextView) findViewById(R.id.textNoDesctription2);
        textView7.setText(aVar.sharedInstance().getTraductionFromToken("NOTE_NON_TEXT2"));
        textView7.setTypeface(typeface);
        Button button = (Button) findViewById(R.id.buttonNoRateApp);
        button.setText(aVar.sharedInstance().getTraductionFromToken("NOTE_NE_PLUS_DEMANDER"));
        button.setTypeface(typeface);
        final int i10 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: o9.v6

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RateAppActivity f78632c;

            {
                this.f78632c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                RateAppActivity rateAppActivity = this.f78632c;
                switch (i11) {
                    case 0:
                        int i12 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        rateAppActivity.getClass();
                        rateAppActivity.startActivity(new Intent(rateAppActivity, (Class<?>) PostHomeSliderActivity.class));
                        rateAppActivity.finish();
                        break;
                    case 1:
                        int i13 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        rateAppActivity.disableAdOneTime();
                        rateAppActivity.startActivity(AkActivity.o());
                        break;
                    default:
                        int i14 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        rateAppActivity.getClass();
                        rateAppActivity.startActivity(new Intent(rateAppActivity, (Class<?>) SendFormActivity.class));
                        rateAppActivity.finish();
                        break;
                }
            }
        });
        final int i11 = 1;
        ((ImageView) findViewById(R.id.yesButton)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.v6

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RateAppActivity f78632c;

            {
                this.f78632c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                RateAppActivity rateAppActivity = this.f78632c;
                switch (i112) {
                    case 0:
                        int i12 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        rateAppActivity.getClass();
                        rateAppActivity.startActivity(new Intent(rateAppActivity, (Class<?>) PostHomeSliderActivity.class));
                        rateAppActivity.finish();
                        break;
                    case 1:
                        int i13 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        rateAppActivity.disableAdOneTime();
                        rateAppActivity.startActivity(AkActivity.o());
                        break;
                    default:
                        int i14 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        rateAppActivity.getClass();
                        rateAppActivity.startActivity(new Intent(rateAppActivity, (Class<?>) SendFormActivity.class));
                        rateAppActivity.finish();
                        break;
                }
            }
        });
        final int i12 = 2;
        ((ImageView) findViewById(R.id.noButton)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.v6

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RateAppActivity f78632c;

            {
                this.f78632c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                RateAppActivity rateAppActivity = this.f78632c;
                switch (i112) {
                    case 0:
                        int i122 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        rateAppActivity.getClass();
                        rateAppActivity.startActivity(new Intent(rateAppActivity, (Class<?>) PostHomeSliderActivity.class));
                        rateAppActivity.finish();
                        break;
                    case 1:
                        int i13 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        rateAppActivity.disableAdOneTime();
                        rateAppActivity.startActivity(AkActivity.o());
                        break;
                    default:
                        int i14 = RateAppActivity.C;
                        ca.o.sharedInstance().disableAlertRateApp();
                        rateAppActivity.getClass();
                        rateAppActivity.startActivity(new Intent(rateAppActivity, (Class<?>) SendFormActivity.class));
                        rateAppActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
