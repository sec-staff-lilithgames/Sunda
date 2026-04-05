package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.c1;
import ca.m;
import ca.o;
import ca.r;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.ChildrenModeActivity;
import com.digidust.elokence.akinator.activities.CompteActivity;
import com.digidust.elokence.akinator.activities.ConfirmationMailActivity;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.CreditsActivity;
import com.digidust.elokence.akinator.activities.InscriptionActivity;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityMenuBinding;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import da.f;
import j1.o2;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import lb.b1;
import o9.b3;
import o9.d3;
import o9.g3;
import timber.log.Timber;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class MenuActivity extends AkActivity {
    public static final /* synthetic */ int D = 0;
    public ActivityMenuBinding C;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public static WindowInsets t(View view, WindowInsets windowInsets) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(windowInsets, "windowInsets");
        if (Build.VERSION.SDK_INT < 30) {
            return windowInsets;
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        e0.checkNotNullExpressionValue(insets, "getInsets(...)");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onAllPurchasesRestored() throws NumberFormatException {
        super.onAllPurchasesRestored();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(false);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String upperCase;
        super.onCreate(bundle);
        ActivityMenuBinding activityMenuBindingInflate = ActivityMenuBinding.inflate(getLayoutInflater());
        this.C = activityMenuBindingInflate;
        ActivityMenuBinding activityMenuBinding = null;
        if (activityMenuBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBindingInflate = null;
        }
        setContentView(activityMenuBindingInflate.getRoot());
        ActivityMenuBinding activityMenuBinding2 = this.C;
        if (activityMenuBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding2 = null;
        }
        TextView textView = activityMenuBinding2.notConnectedLayout.textCreateAccount;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding3 = this.C;
        if (activityMenuBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding3 = null;
        }
        TextView textView2 = activityMenuBinding3.notConnectedLayout.textCreateAccount;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "COMPTE_EXPLICATION_PARAMETRES", textView2);
        ActivityMenuBinding activityMenuBinding4 = this.C;
        if (activityMenuBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding4 = null;
        }
        activityMenuBinding4.notConnectedLayout.textConnexion.setTypeface(typeface);
        SpannableString spannableString = new SpannableString(aVar.sharedInstance().getTraductionFromToken("COMPTE_CONNEXION"));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        if (m.sharedInstance().isUserConnected()) {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), Dispatchers.getIO(), null, new g3(this, null), 2, null);
        }
        ActivityMenuBinding activityMenuBinding5 = this.C;
        if (activityMenuBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding5 = null;
        }
        activityMenuBinding5.notConnectedLayout.textConnexion.setText(aVar.sharedInstance().getTraductionFromToken("COMPTE_VOUS_AVEZ_UN_COMPTE") + " " + ((Object) spannableString));
        ActivityMenuBinding activityMenuBinding6 = this.C;
        if (activityMenuBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding6 = null;
        }
        final int i10 = 9;
        activityMenuBinding6.notConnectedLayout.textConnexion.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i11 = i10;
                ActivityMenuBinding activityMenuBinding7 = null;
                int i12 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i11) {
                    case 0:
                        int i13 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i14 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i15 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i16 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding8 = menuActivity.C;
                            if (activityMenuBinding8 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding7 = activityMenuBinding8;
                            }
                            activityMenuBinding7.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding9 = menuActivity.C;
                            if (activityMenuBinding9 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding7 = activityMenuBinding9;
                            }
                            activityMenuBinding7.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i12));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding10 = menuActivity.C;
                            if (activityMenuBinding10 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding7 = activityMenuBinding10;
                            }
                            activityMenuBinding7.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding11 = menuActivity.C;
                            if (activityMenuBinding11 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding7 = activityMenuBinding11;
                            }
                            activityMenuBinding7.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding12 = menuActivity.C;
                            if (activityMenuBinding12 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding7 = activityMenuBinding12;
                            }
                            activityMenuBinding7.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding13 = menuActivity.C;
                            if (activityMenuBinding13 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding7 = activityMenuBinding13;
                            }
                            activityMenuBinding7.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding7 = this.C;
        if (activityMenuBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding7 = null;
        }
        activityMenuBinding7.notConnectedLayout.createAccountButton.setText(aVar.sharedInstance().getTraductionFromToken("COMPTE_CREER_UN_COMPTE_BTN"));
        ActivityMenuBinding activityMenuBinding8 = this.C;
        if (activityMenuBinding8 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding8 = null;
        }
        final int i11 = 1;
        activityMenuBinding8.notConnectedLayout.createAccountButton.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i11;
                ActivityMenuBinding activityMenuBinding72 = null;
                int i12 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i13 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i14 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i15 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i16 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding82;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding9 = menuActivity.C;
                            if (activityMenuBinding9 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding9;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i12));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding10 = menuActivity.C;
                            if (activityMenuBinding10 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding10;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding11 = menuActivity.C;
                            if (activityMenuBinding11 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding11;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding12 = menuActivity.C;
                            if (activityMenuBinding12 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding12;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding13 = menuActivity.C;
                            if (activityMenuBinding13 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding13;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding9 = this.C;
        if (activityMenuBinding9 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding9 = null;
        }
        final int i12 = 2;
        activityMenuBinding9.textRelativeCompte.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i12;
                ActivityMenuBinding activityMenuBinding72 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i13 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i14 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i15 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i16 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding82;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding92;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding10 = menuActivity.C;
                            if (activityMenuBinding10 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding10;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding11 = menuActivity.C;
                            if (activityMenuBinding11 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding11;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding12 = menuActivity.C;
                            if (activityMenuBinding12 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding12;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding13 = menuActivity.C;
                            if (activityMenuBinding13 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding13;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding10 = this.C;
        if (activityMenuBinding10 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding10 = null;
        }
        activityMenuBinding10.notConnectedLayout.textTitlePseudo.setText("PSEUDO");
        ActivityMenuBinding activityMenuBinding11 = this.C;
        if (activityMenuBinding11 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding11 = null;
        }
        TextView textView3 = activityMenuBinding11.notConnectedLayout.textTitlePseudo;
        Typeface typeface2 = this.f21686i;
        textView3.setTypeface(typeface2);
        if (m.sharedInstance().isUserConnected()) {
            ActivityMenuBinding activityMenuBinding12 = this.C;
            if (activityMenuBinding12 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding12 = null;
            }
            activityMenuBinding12.connectedLayout.getRoot().setVisibility(0);
            ActivityMenuBinding activityMenuBinding13 = this.C;
            if (activityMenuBinding13 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding13 = null;
            }
            activityMenuBinding13.notConnectedLayout.getRoot().setVisibility(8);
            ActivityMenuBinding activityMenuBinding14 = this.C;
            if (activityMenuBinding14 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding14 = null;
            }
            activityMenuBinding14.textRelativeCompte.setVisibility(0);
        } else {
            ActivityMenuBinding activityMenuBinding15 = this.C;
            if (activityMenuBinding15 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding15 = null;
            }
            activityMenuBinding15.connectedLayout.getRoot().setVisibility(8);
            ActivityMenuBinding activityMenuBinding16 = this.C;
            if (activityMenuBinding16 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding16 = null;
            }
            activityMenuBinding16.notConnectedLayout.getRoot().setVisibility(0);
            ActivityMenuBinding activityMenuBinding17 = this.C;
            if (activityMenuBinding17 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding17 = null;
            }
            activityMenuBinding17.textRelativeCompte.setVisibility(8);
        }
        ActivityMenuBinding activityMenuBinding18 = this.C;
        if (activityMenuBinding18 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding18 = null;
        }
        o2.A(aVar, "COMPTE_PARAMETRES_MENU", activityMenuBinding18.textCompte);
        ActivityMenuBinding activityMenuBinding19 = this.C;
        if (activityMenuBinding19 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding19 = null;
        }
        activityMenuBinding19.textCompte.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding20 = this.C;
        if (activityMenuBinding20 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding20 = null;
        }
        Button button = activityMenuBinding20.connectedLayout.confirmationMailButton;
        Typeface typeface3 = this.f21688k;
        button.setTypeface(typeface3);
        ActivityMenuBinding activityMenuBinding21 = this.C;
        if (activityMenuBinding21 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding21 = null;
        }
        activityMenuBinding21.connectedLayout.confirmationMailButton.setText(aVar.sharedInstance().getTraductionFromToken("COMPTE_EMAIL_CONFIRMER_EMAIL_BTN_LABEL"));
        ActivityMenuBinding activityMenuBinding22 = this.C;
        if (activityMenuBinding22 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding22 = null;
        }
        activityMenuBinding22.connectedLayout.confirmationMailButton.setAllCaps(false);
        ActivityMenuBinding activityMenuBinding23 = this.C;
        if (activityMenuBinding23 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding23 = null;
        }
        final int i13 = 3;
        activityMenuBinding23.connectedLayout.confirmationMailButton.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i13;
                ActivityMenuBinding activityMenuBinding72 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i14 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i15 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i16 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding82;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding92;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding102;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding112;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding122;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding132;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding24 = this.C;
        if (activityMenuBinding24 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding24 = null;
        }
        activityMenuBinding24.textRetirerConsentement.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding25 = this.C;
        if (activityMenuBinding25 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding25 = null;
        }
        activityMenuBinding25.textRetirerConsentement.setText(aVar.sharedInstance().getTraductionFromToken("RGPD_RETIRER_CONSENTEMENT"));
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String simCountryIso = telephonyManager.getSimCountryIso();
                e0.checkNotNullExpressionValue(simCountryIso, "getSimCountryIso(...)");
                Locale locale = Locale.getDefault();
                e0.checkNotNullExpressionValue(locale, "getDefault(...)");
                upperCase = simCountryIso.toUpperCase(locale);
                e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } catch (NullPointerException unused) {
            }
        } else {
            upperCase = null;
        }
        if (upperCase == null || e0.areEqual("", upperCase)) {
            Locale.getDefault().getCountry();
        }
        ActivityMenuBinding activityMenuBinding26 = this.C;
        if (activityMenuBinding26 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding26 = null;
        }
        activityMenuBinding26.textActivationTTS.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding27 = this.C;
        if (activityMenuBinding27 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding27 = null;
        }
        TextView textView4 = activityMenuBinding27.textActivationTTS;
        b1.a aVar2 = b1.f72741d;
        o2.A(aVar2, "MENU_TTS_ACTIVATE", textView4);
        ActivityMenuBinding activityMenuBinding28 = this.C;
        if (activityMenuBinding28 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding28 = null;
        }
        final int i14 = 4;
        activityMenuBinding28.ttsSettings.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i14;
                ActivityMenuBinding activityMenuBinding72 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i15 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i16 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding82;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding92;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding102;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding112;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding122;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding132;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        if (m.sharedInstance().isRGPDCountry() && m.sharedInstance().isFreemium()) {
            ActivityMenuBinding activityMenuBinding29 = this.C;
            if (activityMenuBinding29 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding29 = null;
            }
            activityMenuBinding29.layoutRetirerConsentement.setVisibility(0);
        } else {
            ActivityMenuBinding activityMenuBinding30 = this.C;
            if (activityMenuBinding30 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding30 = null;
            }
            activityMenuBinding30.layoutRetirerConsentement.setVisibility(8);
        }
        ActivityMenuBinding activityMenuBinding31 = this.C;
        if (activityMenuBinding31 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding31 = null;
        }
        activityMenuBinding31.textCredit.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding32 = this.C;
        if (activityMenuBinding32 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding32 = null;
        }
        o2.A(aVar2, "MENU_CREDITS", activityMenuBinding32.textCredit);
        ActivityMenuBinding activityMenuBinding33 = this.C;
        if (activityMenuBinding33 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding33 = null;
        }
        final int i15 = 5;
        activityMenuBinding33.textCredit.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i15;
                ActivityMenuBinding activityMenuBinding72 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i16 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding82;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding92;
                            }
                            activityMenuBinding72.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding102;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding112;
                            }
                            activityMenuBinding72.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding122;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding72 = activityMenuBinding132;
                            }
                            activityMenuBinding72.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding34 = this.C;
        if (activityMenuBinding34 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding34 = null;
        }
        activityMenuBinding34.textTitleParam.setTypeface(typeface2);
        ActivityMenuBinding activityMenuBinding35 = this.C;
        if (activityMenuBinding35 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding35 = null;
        }
        o2.A(aVar2, "MENU_PARAMETRES", activityMenuBinding35.textTitleParam);
        ActivityMenuBinding activityMenuBinding36 = this.C;
        if (activityMenuBinding36 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding36 = null;
        }
        activityMenuBinding36.textTitleParam.setAllCaps(true);
        ActivityMenuBinding activityMenuBinding37 = this.C;
        if (activityMenuBinding37 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding37 = null;
        }
        activityMenuBinding37.connectedLayout.textPseudo.setTypeface(typeface3);
        ActivityMenuBinding activityMenuBinding38 = this.C;
        if (activityMenuBinding38 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding38 = null;
        }
        activityMenuBinding38.connectedLayout.textPseudo.setText(m.sharedInstance().getPseudoUser());
        ActivityMenuBinding activityMenuBinding39 = this.C;
        if (activityMenuBinding39 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding39 = null;
        }
        activityMenuBinding39.notConnectedLayout.textPseudoNotConnected.setTypeface(typeface3);
        if (!m.sharedInstance().isUserConnected() && r.sharedInstance().getNomJoueur() != null) {
            ActivityMenuBinding activityMenuBinding40 = this.C;
            if (activityMenuBinding40 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding40 = null;
            }
            activityMenuBinding40.notConnectedLayout.textPseudoNotConnected.setText(r.sharedInstance().getNomJoueur());
        }
        ActivityMenuBinding activityMenuBinding41 = this.C;
        if (activityMenuBinding41 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding41 = null;
        }
        activityMenuBinding41.connectedLayout.textMail.setTypeface(typeface3);
        ActivityMenuBinding activityMenuBinding42 = this.C;
        if (activityMenuBinding42 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding42 = null;
        }
        activityMenuBinding42.connectedLayout.textMail.setText(m.sharedInstance().getMailUser());
        ActivityMenuBinding activityMenuBinding43 = this.C;
        if (activityMenuBinding43 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding43 = null;
        }
        activityMenuBinding43.textTitleAvis.setTypeface(typeface2);
        ActivityMenuBinding activityMenuBinding44 = this.C;
        if (activityMenuBinding44 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding44 = null;
        }
        o2.A(aVar2, "MENU_TON_AVIS_COMPTE", activityMenuBinding44.textTitleAvis);
        ActivityMenuBinding activityMenuBinding45 = this.C;
        if (activityMenuBinding45 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding45 = null;
        }
        activityMenuBinding45.textTitleAvis.setAllCaps(true);
        ActivityMenuBinding activityMenuBinding46 = this.C;
        if (activityMenuBinding46 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding46 = null;
        }
        activityMenuBinding46.textTitleAchat.setTypeface(typeface2);
        ActivityMenuBinding activityMenuBinding47 = this.C;
        if (activityMenuBinding47 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding47 = null;
        }
        o2.A(aVar2, "MENU_GERER_LES_ACHATS", activityMenuBinding47.textTitleAchat);
        ActivityMenuBinding activityMenuBinding48 = this.C;
        if (activityMenuBinding48 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding48 = null;
        }
        activityMenuBinding48.textTitleAchat.setAllCaps(true);
        ActivityMenuBinding activityMenuBinding49 = this.C;
        if (activityMenuBinding49 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding49 = null;
        }
        activityMenuBinding49.textTitleInformation.setTypeface(typeface2);
        ActivityMenuBinding activityMenuBinding50 = this.C;
        if (activityMenuBinding50 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding50 = null;
        }
        o2.A(aVar2, "MENU_INFORMATIONS", activityMenuBinding50.textTitleInformation);
        ActivityMenuBinding activityMenuBinding51 = this.C;
        if (activityMenuBinding51 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding51 = null;
        }
        activityMenuBinding51.textTitleInformation.setAllCaps(true);
        ActivityMenuBinding activityMenuBinding52 = this.C;
        if (activityMenuBinding52 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding52 = null;
        }
        activityMenuBinding52.textLangue.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding53 = this.C;
        if (activityMenuBinding53 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding53 = null;
        }
        o2.A(aVar2, "MENU_LANGUE", activityMenuBinding53.textLangue);
        ActivityMenuBinding activityMenuBinding54 = this.C;
        if (activityMenuBinding54 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding54 = null;
        }
        activityMenuBinding54.textModeEnfant.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding55 = this.C;
        if (activityMenuBinding55 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding55 = null;
        }
        o2.A(aVar2, "MENU_MODE_ENFANT", activityMenuBinding55.textModeEnfant);
        ActivityMenuBinding activityMenuBinding56 = this.C;
        if (activityMenuBinding56 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding56 = null;
        }
        activityMenuBinding56.textMusique.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding57 = this.C;
        if (activityMenuBinding57 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding57 = null;
        }
        o2.A(aVar2, "MENU_MUSIQUE", activityMenuBinding57.textMusique);
        ActivityMenuBinding activityMenuBinding58 = this.C;
        if (activityMenuBinding58 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding58 = null;
        }
        activityMenuBinding58.textEffet.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding59 = this.C;
        if (activityMenuBinding59 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding59 = null;
        }
        o2.A(aVar2, "MENU_EFFETS", activityMenuBinding59.textEffet);
        ActivityMenuBinding activityMenuBinding60 = this.C;
        if (activityMenuBinding60 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding60 = null;
        }
        activityMenuBinding60.textRestaure.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding61 = this.C;
        if (activityMenuBinding61 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding61 = null;
        }
        o2.A(aVar2, "MENU_RESTAURER_ACHATS", activityMenuBinding61.textRestaure);
        ActivityMenuBinding activityMenuBinding62 = this.C;
        if (activityMenuBinding62 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding62 = null;
        }
        activityMenuBinding62.textPublicite.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding63 = this.C;
        if (activityMenuBinding63 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding63 = null;
        }
        activityMenuBinding63.textPublicite.setText(aVar2.sharedInstance().getTraductionFromToken("MENU_PLUS_DE_PUB"));
        if (o.sharedInstance().isUnlocked()) {
            ActivityMenuBinding activityMenuBinding64 = this.C;
            if (activityMenuBinding64 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding64 = null;
            }
            activityMenuBinding64.layoutPublicite.setVisibility(8);
        } else if (m.sharedInstance().isFreemium()) {
            ActivityMenuBinding activityMenuBinding65 = this.C;
            if (activityMenuBinding65 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding65 = null;
            }
            activityMenuBinding65.layoutPublicite.setVisibility(0);
        } else {
            ActivityMenuBinding activityMenuBinding66 = this.C;
            if (activityMenuBinding66 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding66 = null;
            }
            activityMenuBinding66.layoutPublicite.setVisibility(8);
        }
        ActivityMenuBinding activityMenuBinding67 = this.C;
        if (activityMenuBinding67 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding67 = null;
        }
        activityMenuBinding67.textMessage.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding68 = this.C;
        if (activityMenuBinding68 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding68 = null;
        }
        o2.A(aVar2, "MENU_LAISSER_MESSAGE", activityMenuBinding68.textMessage);
        ActivityMenuBinding activityMenuBinding69 = this.C;
        if (activityMenuBinding69 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding69 = null;
        }
        activityMenuBinding69.textNote.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding70 = this.C;
        if (activityMenuBinding70 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding70 = null;
        }
        o2.A(aVar2, "MENU_NOTER_APPLI", activityMenuBinding70.textNote);
        ActivityMenuBinding activityMenuBinding71 = this.C;
        if (activityMenuBinding71 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding71 = null;
        }
        activityMenuBinding71.textPolitiqueConf.setTypeface(typeface3);
        ActivityMenuBinding activityMenuBinding72 = this.C;
        if (activityMenuBinding72 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding72 = null;
        }
        o2.A(aVar2, "MENU_POLITIQUE_CONFIDENTIALITE", activityMenuBinding72.textPolitiqueConf);
        ActivityMenuBinding activityMenuBinding73 = this.C;
        if (activityMenuBinding73 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding73 = null;
        }
        activityMenuBinding73.textLangueChoisi.setTypeface(typeface);
        ActivityMenuBinding activityMenuBinding74 = this.C;
        if (activityMenuBinding74 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding74 = null;
        }
        activityMenuBinding74.textLangueChoisi.setText(aVar2.sharedInstance().getApplicationLanguageLabel());
        ActivityMenuBinding activityMenuBinding75 = this.C;
        if (activityMenuBinding75 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding75 = null;
        }
        final int i16 = 6;
        activityMenuBinding75.textRelativeLangue.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i16;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i17 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding76 = this.C;
        if (activityMenuBinding76 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding76 = null;
        }
        final int i17 = 7;
        activityMenuBinding76.textMessage.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i17;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i18 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding77 = this.C;
        if (activityMenuBinding77 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding77 = null;
        }
        final int i18 = 8;
        activityMenuBinding77.textRestaure.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i18;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i19 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding78 = this.C;
        if (activityMenuBinding78 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding78 = null;
        }
        final int i19 = 10;
        activityMenuBinding78.textNote.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i19;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i20 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding79 = this.C;
        if (activityMenuBinding79 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding79 = null;
        }
        final int i20 = 11;
        activityMenuBinding79.textPublicite.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i20;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i21 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding80 = this.C;
        if (activityMenuBinding80 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding80 = null;
        }
        final int i21 = 12;
        activityMenuBinding80.textPolitiqueConf.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i21;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i22 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding81 = this.C;
        if (activityMenuBinding81 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding81 = null;
        }
        final int i22 = 13;
        activityMenuBinding81.textModeEnfant.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i22;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding82 = menuActivity.C;
                            if (activityMenuBinding82 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding82;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i23 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding82 = this.C;
        if (activityMenuBinding82 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding82 = null;
        }
        final int i23 = 14;
        activityMenuBinding82.musiqueImage.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i23;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding822 = menuActivity.C;
                            if (activityMenuBinding822 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding822;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i232 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i24 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding83 = this.C;
        if (activityMenuBinding83 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding83 = null;
        }
        final int i24 = 15;
        activityMenuBinding83.effectImage.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i24;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding822 = menuActivity.C;
                            if (activityMenuBinding822 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding822;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i232 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i242 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i25 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding84 = this.C;
        if (activityMenuBinding84 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding84 = null;
        }
        final int i25 = 16;
        activityMenuBinding84.twitterLogo.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i25;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding822 = menuActivity.C;
                            if (activityMenuBinding822 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding822;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i232 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i242 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i252 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i26 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding85 = this.C;
        if (activityMenuBinding85 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding85 = null;
        }
        final int i26 = 17;
        activityMenuBinding85.facebookLogo.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i26;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding822 = menuActivity.C;
                            if (activityMenuBinding822 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding822;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i232 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i242 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i252 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i262 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i27 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding86 = this.C;
        if (activityMenuBinding86 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding86 = null;
        }
        final int i27 = 18;
        activityMenuBinding86.relativeBackButton.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i27;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding822 = menuActivity.C;
                            if (activityMenuBinding822 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding822;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i232 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i242 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i252 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i262 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i272 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i28 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        ActivityMenuBinding activityMenuBinding87 = this.C;
        if (activityMenuBinding87 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding87 = null;
        }
        final int i28 = 0;
        activityMenuBinding87.textRetirerConsentement.setOnClickListener(new View.OnClickListener(this) { // from class: o9.c3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuActivity f78066c;

            {
                this.f78066c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                int i112 = i28;
                ActivityMenuBinding activityMenuBinding722 = null;
                int i122 = 1;
                MenuActivity menuActivity = this.f78066c;
                switch (i112) {
                    case 0:
                        int i132 = MenuActivity.D;
                        ca.m.sharedInstance().updateRgpdStatus(true);
                        menuActivity.m(true);
                        break;
                    case 1:
                        int i142 = MenuActivity.D;
                        Intent intent = new Intent(menuActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", false);
                        intent.putExtra("coming_from_menu", true);
                        menuActivity.startActivity(intent);
                        break;
                    case 2:
                        int i152 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CompteActivity.class));
                        break;
                    case 3:
                        int i162 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConfirmationMailActivity.class));
                        break;
                    case 4:
                        int i172 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        ca.m.sharedInstance().setTTSEnabled(!ca.m.sharedInstance().isTTSEnabled());
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            ActivityMenuBinding activityMenuBinding822 = menuActivity.C;
                            if (activityMenuBinding822 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding822;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
                            w9.e.getInstance().initialize(menuActivity);
                        } else {
                            ActivityMenuBinding activityMenuBinding92 = menuActivity.C;
                            if (activityMenuBinding92 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding92;
                            }
                            activityMenuBinding722.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
                            w9.e.getInstance().shutdown();
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 5:
                        int i182 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) CreditsActivity.class));
                        break;
                    case 6:
                        int i192 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SelectLanguageActivity.class));
                        break;
                    case 7:
                        int i202 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) SendFormActivity.class));
                        break;
                    case 8:
                        int i212 = MenuActivity.D;
                        Timber.Forest.d("Restore purchases button", new Object[0]);
                        menuActivity.runOnUiThread(new e3(menuActivity, i122));
                        ca.m.sharedInstance().displayRestoreOk(true);
                        z9.e.getInstance().init(menuActivity, null);
                        break;
                    case 9:
                        int i222 = MenuActivity.D;
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ConnectActivity.class));
                        break;
                    case 10:
                        int i232 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(AkActivity.o());
                        menuActivity.disableAdOneTime();
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("rating_app", "1");
                        break;
                    case 11:
                        int i242 = MenuActivity.D;
                        na.b.playBip();
                        if (!z9.e.getInstance().isInit()) {
                            Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), menuActivity);
                            break;
                        }
                    case 12:
                        int i252 = MenuActivity.D;
                        menuActivity.disableAdOneTime();
                        na.b.playBip();
                        Intent intent2 = new Intent(menuActivity, (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/");
                        intent2.putExtra("lng", lb.b1.f72741d.sharedInstance().getApplicationLanguage());
                        intent2.putExtra("allowUserAction", false);
                        menuActivity.startActivity(intent2);
                        break;
                    case 13:
                        int i262 = MenuActivity.D;
                        na.b.playBip();
                        menuActivity.startActivity(new Intent(menuActivity, (Class<?>) ChildrenModeActivity.class));
                        break;
                    case 14:
                        int i272 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        boolean zIsMusicEnabled = ca.m.sharedInstance().isMusicEnabled();
                        ca.m.sharedInstance().setMusicEnabled(!zIsMusicEnabled);
                        if (zIsMusicEnabled) {
                            na.a.pauseMusic();
                        } else {
                            na.a.playMusic();
                        }
                        if (!ca.m.sharedInstance().isMusicEnabled()) {
                            ActivityMenuBinding activityMenuBinding102 = menuActivity.C;
                            if (activityMenuBinding102 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding102;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding112 = menuActivity.C;
                            if (activityMenuBinding112 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding112;
                            }
                            activityMenuBinding722.musiqueImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 15:
                        int i282 = MenuActivity.D;
                        menuActivity.getClass();
                        ca.m.sharedInstance().setSoundEnabled(!ca.m.sharedInstance().isSoundEnabled());
                        na.b.playBip();
                        if (!ca.m.sharedInstance().isSoundEnabled()) {
                            ActivityMenuBinding activityMenuBinding122 = menuActivity.C;
                            if (activityMenuBinding122 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding122;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_off_menu);
                            break;
                        } else {
                            ActivityMenuBinding activityMenuBinding132 = menuActivity.C;
                            if (activityMenuBinding132 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMenuBinding722 = activityMenuBinding132;
                            }
                            activityMenuBinding722.effectImage.setImageResource(R.drawable.switch_on_menu);
                            break;
                        }
                    case 16:
                        int i29 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=akinator_team")));
                            break;
                        } catch (Exception unused2) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/#!/akinator_team")));
                            return;
                        }
                    case 17:
                        int i30 = MenuActivity.D;
                        menuActivity.getClass();
                        na.b.playBip();
                        menuActivity.disableAdOneTime();
                        try {
                            menuActivity.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/Akinator")));
                            break;
                        } catch (Exception unused22) {
                            menuActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Akinator")));
                            return;
                        }
                    default:
                        int i31 = MenuActivity.D;
                        menuActivity.goToHome(false);
                        break;
                }
            }
        });
        if (m.sharedInstance().isMusicEnabled()) {
            ActivityMenuBinding activityMenuBinding88 = this.C;
            if (activityMenuBinding88 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding88 = null;
            }
            activityMenuBinding88.musiqueImage.setImageResource(R.drawable.switch_on_menu);
        } else {
            ActivityMenuBinding activityMenuBinding89 = this.C;
            if (activityMenuBinding89 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding89 = null;
            }
            activityMenuBinding89.musiqueImage.setImageResource(R.drawable.switch_off_menu);
        }
        if (m.sharedInstance().isSoundEnabled()) {
            ActivityMenuBinding activityMenuBinding90 = this.C;
            if (activityMenuBinding90 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding90 = null;
            }
            activityMenuBinding90.effectImage.setImageResource(R.drawable.switch_on_menu);
        } else {
            ActivityMenuBinding activityMenuBinding91 = this.C;
            if (activityMenuBinding91 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding91 = null;
            }
            activityMenuBinding91.effectImage.setImageResource(R.drawable.switch_off_menu);
        }
        ActivityMenuBinding activityMenuBinding92 = this.C;
        if (activityMenuBinding92 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMenuBinding = activityMenuBinding92;
        }
        activityMenuBinding.mainLayout.setOnApplyWindowInsetsListener(new d3(0));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onInitialization(boolean z10) {
        if (z10) {
            e.getInstance().requestAllPurchases(new b3(this, 0));
        } else {
            r();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
        ActivityMenuBinding activityMenuBinding = this.C;
        if (activityMenuBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding = null;
        }
        activityMenuBinding.connectedLayout.textPseudo.setText(str);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ActivityMenuBinding activityMenuBinding = this.C;
        ActivityMenuBinding activityMenuBinding2 = null;
        if (activityMenuBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityMenuBinding = null;
        }
        activityMenuBinding.textModeEnfantChoisi.setTypeface(this.f21687j);
        boolean zIsChildProtectEnabled = m.sharedInstance().isChildProtectEnabled();
        if (m.sharedInstance().isTTSEnabled()) {
            ActivityMenuBinding activityMenuBinding3 = this.C;
            if (activityMenuBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding3 = null;
            }
            activityMenuBinding3.SwitchTTS.setImageResource(R.drawable.switch_on_menu);
        } else {
            ActivityMenuBinding activityMenuBinding4 = this.C;
            if (activityMenuBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityMenuBinding4 = null;
            }
            activityMenuBinding4.SwitchTTS.setImageResource(R.drawable.switch_off_menu);
        }
        if (zIsChildProtectEnabled) {
            ActivityMenuBinding activityMenuBinding5 = this.C;
            if (activityMenuBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMenuBinding2 = activityMenuBinding5;
            }
            o2.A(b1.f72741d, "MENU_MODE_ENFANT_ACTIVE", activityMenuBinding2.textModeEnfantChoisi);
        } else {
            ActivityMenuBinding activityMenuBinding6 = this.C;
            if (activityMenuBinding6 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMenuBinding2 = activityMenuBinding6;
            }
            o2.A(b1.f72741d, "MENU_MODE_ENFANT_INACTIVE", activityMenuBinding2.textModeEnfantChoisi);
        }
        if (o.sharedInstance().mustAlertUserIsConnected()) {
            new f(this).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("COMPTE_CONNECTE"));
            o.sharedInstance().resetUserMustBeAlertConnected();
        }
    }
}
