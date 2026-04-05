package com.digidust.elokence.akinator.activities;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ca.m;
import ca.t;
import com.digidust.elokence.akinator.activities.PropositionPotionActivity;
import com.digidust.elokence.akinator.freemium.R;
import jb.h;
import lb.b1;
import o9.a5;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PropositionPotionActivity extends AkActivity {
    public static final /* synthetic */ int F = 0;
    public RelativeLayout C;
    public final a5 D;
    public final a5 E;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.a5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.a5] */
    public PropositionPotionActivity() {
        final int i10 = 0;
        this.D = new View.OnClickListener(this) { // from class: o9.a5

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PropositionPotionActivity f78030c;

            {
                this.f78030c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                PropositionPotionActivity propositionPotionActivity = this.f78030c;
                switch (i11) {
                    case 0:
                        int i12 = PropositionPotionActivity.F;
                        propositionPotionActivity.getClass();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(propositionPotionActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            String stringExtra = propositionPotionActivity.getIntent().getStringExtra("potion");
                            if (stringExtra != null) {
                                if (stringExtra.equals("ultime") || stringExtra.equals("ultimePub")) {
                                    propositionPotionActivity.disableAdOneTime();
                                    z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), propositionPotionActivity);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        int i13 = PropositionPotionActivity.F;
                        propositionPotionActivity.setResult(0);
                        propositionPotionActivity.finish();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.E = new View.OnClickListener(this) { // from class: o9.a5

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PropositionPotionActivity f78030c;

            {
                this.f78030c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                PropositionPotionActivity propositionPotionActivity = this.f78030c;
                switch (i112) {
                    case 0:
                        int i12 = PropositionPotionActivity.F;
                        propositionPotionActivity.getClass();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(propositionPotionActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            String stringExtra = propositionPotionActivity.getIntent().getStringExtra("potion");
                            if (stringExtra != null) {
                                if (stringExtra.equals("ultime") || stringExtra.equals("ultimePub")) {
                                    propositionPotionActivity.disableAdOneTime();
                                    z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), propositionPotionActivity);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        int i13 = PropositionPotionActivity.F;
                        propositionPotionActivity.setResult(0);
                        propositionPotionActivity.finish();
                        break;
                }
            }
        };
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void itemPurchased(String str) {
        String stringExtra = getIntent().getStringExtra("potion");
        if (stringExtra != null) {
            if ((stringExtra.equals("ultime") || stringExtra.equals("ultimePub")) && str.equals(e.getInstance().getSkuInappUltime())) {
                setResult(1);
                finish();
            }
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bitmap subjectBackground;
        super.onCreate(bundle);
        setContentView(R.layout.activity_question_overlay);
        TextView textView = (TextView) findViewById(R.id.overlayTextDescQuestion);
        Button button = (Button) findViewById(R.id.ButtonAcheter);
        Button button2 = (Button) findViewById(R.id.ButtonNonMerci);
        Typeface typeface = this.f21686i;
        textView.setTypeface(typeface);
        button.setTypeface(typeface);
        button2.setTypeface(typeface);
        String stringExtra = getIntent().getStringExtra("potion");
        if (stringExtra != null) {
            if (stringExtra.equals("ultime")) {
                textView.setText(b1.sharedInstance().getTraductionFromToken("FONCTIONNALITE_INDISPONIBLE_EN_VERSION_FREEMIUM") + "\n" + b1.sharedInstance().getTraductionFromToken("AKI_ANDROID_ALERTE_FREEMIUM_PERSONNALISER_NEW"));
            } else if (stringExtra.equals("ultimePub")) {
                textView.setText(b1.sharedInstance().getTraductionFromToken("ALERTE_PAS_DE_PUB"));
                h.sharedInstance().incMetricCompteur("pub_close");
            }
        }
        this.C = (RelativeLayout) findViewById(R.id.contentFrame);
        try {
            subjectBackground = t.sharedInstance().getSubjectBackground(m.sharedInstance().getCurrentInstance().getSubjectId());
        } catch (Exception unused) {
            subjectBackground = null;
        }
        if (subjectBackground != null) {
            this.C.setBackground(new BitmapDrawable(getResources(), subjectBackground));
        }
        button.setText(b1.sharedInstance().getTraductionFromToken("OUI"));
        button2.setText(b1.sharedInstance().getTraductionFromToken("NON_MERCI"));
        markTextviewForUpdate(button);
        markTextviewForUpdate(button2);
        markTextviewForUpdate(textView);
        updateTextViewsSize();
        button.setOnClickListener(this.D);
        button2.setOnClickListener(this.E);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onInitialization(boolean z10) {
        e.getInstance().requestAllPurchases(null);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (e.getInstance().isInit()) {
            e.getInstance().requestAllPurchases(null);
        } else {
            e.getInstance().init(this, null);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
