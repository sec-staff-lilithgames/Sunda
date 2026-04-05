package com.digidust.elokence.akinator.activities;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.mediation.nativeAds.a;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CreditsActivity extends AkActivity {
    public static final /* synthetic */ int E = 0;
    public RelativeLayout C;
    public final a D = new a(this, 29);

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_credits);
        this.C = (RelativeLayout) findViewById(R.id.relativeBackButton);
        ((TextView) findViewById(R.id.textTitleCredit)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS"));
        ((TextView) findViewById(R.id.textIntroduction)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_AKINATOR_BY_ELOKENCE"));
        ((TextView) findViewById(R.id.textMusic)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_MUSIC_TITLE"));
        ((TextView) findViewById(R.id.textMusicExplicit)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_MUSIC_TEXT"));
        ((TextView) findViewById(R.id.textGraphics)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_GRAPHICS_TITLE"));
        ((TextView) findViewById(R.id.textGraphicsExplicit)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_GRAPHICS_TEXT"));
        ((TextView) findViewById(R.id.textPhoto)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_PHOTO_TITLE"));
        ((TextView) findViewById(R.id.textPhotoExplicit)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_PHOTO_TEXT"));
        ((TextView) findViewById(R.id.textData)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_DATA_TITLE"));
        ((TextView) findViewById(R.id.textDataExplicit)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_DATA_TEXT"));
        ((TextView) findViewById(R.id.textLibraries)).setText(b1.sharedInstance().getTraductionFromToken("MENU_CREDITS_OPENSOURCE_TITLE"));
        o2.x((TextView) findViewById(R.id.textLibrariesExplicit), "RX Android / Retrofit / OKHTTP");
        this.C.setOnClickListener(this.D);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
