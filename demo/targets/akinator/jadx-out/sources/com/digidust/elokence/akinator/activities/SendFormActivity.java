package com.digidust.elokence.akinator.activities;

import a.b;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Html;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ao.kwoC.zAQQWzBxnS;
import ca.m;
import ca.o;
import ca.r;
import com.amazon.device.ads.DtbConstants;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import da.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lb.b1;
import lb.c;
import lb.z0;
import o9.a0;
import o9.k7;
import o9.l7;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class SendFormActivity extends AkActivity {
    public static final /* synthetic */ int O = 0;
    public EditText C;
    public RadioButton D;
    public RadioButton E;
    public RadioButton F;
    public RadioButton G;
    public String H;
    public String I;
    public int J;
    public final ArrayList K = new ArrayList();
    public final k7 L = new k7(this, 0);
    public final k7 M = new k7(this, 1);
    public final k7 N = new k7(this, 2);

    public void hideKeyboard(View view) {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) throws IOException {
        Uri data;
        if (i10 == 0 && i11 == -1 && (data = intent.getData()) != null) {
            try {
                MediaStore.Images.Media.getBitmap(getContentResolver(), data);
            } catch (IOException e10) {
                Timber.tag("SendFormActivity").e(e10);
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    public String getChoiceRadioButton() {
        if (this.D.isChecked()) {
            return this.D.getText().toString() + " (error/technical problem)";
        }
        if (this.E.isChecked()) {
            return this.E.getText().toString() + " (inappropriate content)";
        }
        if (this.F.isChecked()) {
            return this.F.getText().toString() + PcrIk.JdEgLYt;
        }
        if (!this.G.isChecked()) {
            return null;
        }
        return this.G.getText().toString() + " (other)";
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        String subjectLabel;
        RelativeLayout relativeLayout;
        Typeface typeface;
        Button button;
        StringBuilder sb2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_send_form);
        if (m.sharedInstance().isDeviceConnectedWithSpecialAccount()) {
            f fVar = new f(this);
            fVar.setTypeFcm(m.sharedInstance().getFcmToken(), m.sharedInstance().getFcmToken().split(":")[0]);
            fVar.setCopierListener(new l7(this));
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.relativeBackButton);
        ((TextView) findViewById(R.id.preventionMessage)).setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_CONSENTEMENT"));
        TextView textView = (TextView) findViewById(R.id.preventionMessageUrl);
        textView.setText(Html.fromHtml("<a href=\"https://cgu.akinator.com/app/privacy/" + b1.sharedInstance().getApplicationLanguage() + "\">" + b1.sharedInstance().getTraductionFromToken("VOIR_POLITIQUE_DE_CONFIDENTIALITE") + "</a>", 0));
        textView.setOnClickListener(new k7(this, 3));
        TextView textView2 = (TextView) findViewById(R.id.textDescriptionMessage);
        Typeface typeface2 = this.f21686i;
        textView2.setTypeface(typeface2);
        textView2.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_DESCRIPTION"));
        TextView textView3 = (TextView) findViewById(R.id.textSujetMessage);
        textView3.setTypeface(typeface2);
        textView3.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_SUJET"));
        TextView textView4 = (TextView) findViewById(R.id.textTechnicalDataMessage);
        textView4.setTypeface(typeface2);
        textView4.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_DONNEES_TECHNIQUES"));
        TextView textView5 = (TextView) findViewById(R.id.textTitleForm);
        Typeface typeface3 = this.f21687j;
        textView5.setTypeface(typeface3);
        textView5.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE"));
        TextView textView6 = (TextView) findViewById(R.id.textExplicatifTechnicalDataMessage);
        textView6.setTypeface(typeface3);
        textView6.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_DONNEES_TECHNIQUES_EXPLICATION"));
        RadioButton radioButton = (RadioButton) findViewById(R.id.choiceOne);
        this.D = radioButton;
        radioButton.setTypeface(typeface3);
        this.D.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_SUJET1"));
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.choiceTwo);
        this.E = radioButton2;
        radioButton2.setTypeface(typeface3);
        this.E.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_SUJET2"));
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.choiceThree);
        this.F = radioButton3;
        radioButton3.setTypeface(typeface3);
        this.F.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_SUJET3"));
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.choiceFour);
        this.G = radioButton4;
        radioButton4.setTypeface(typeface3);
        this.G.setText(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_SUJET4"));
        int intExtra = getIntent().getIntExtra("RadioButton", 0);
        if (intExtra == 0) {
            this.D.setChecked(true);
        } else if (intExtra == 1) {
            this.E.setChecked(true);
        } else if (intExtra == 2) {
            this.F.setChecked(true);
        } else if (intExtra != 3) {
            Timber.w("Unknown message subject id", new Object[0]);
        } else {
            this.G.setChecked(true);
        }
        Button button2 = (Button) findViewById(R.id.sendButton);
        button2.setTextSize(15.0f);
        button2.setTypeface(typeface2);
        button2.setText(b1.sharedInstance().getTraductionFromToken("ENVOYER"));
        String str = m.sharedInstance().isWifiConnected() ? DtbConstants.NETWORK_TYPE_WIFI : m.sharedInstance().isGSMConnected() ? "Data" : "None";
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.J = packageInfo.versionCode;
            this.I = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            Timber.tag("SendFormActivity").e(e10);
        }
        String str2 = m.sharedInstance().isPaid() ? "Paid" : o.sharedInstance().isUnlocked() ? "InApp" : "Freemium";
        try {
            subjectLabel = m.sharedInstance().getCurrentInstance().getSubjectLabel();
        } catch (Exception unused) {
            subjectLabel = "n/a";
        }
        String strReplace = z0.getInstance().getLastWSUrlTried() == null ? AbstractJsonLexerKt.NULL : z0.getInstance().getLastWSUrlTried().replace(DtbConstants.HTTPS, "").replace(".akinator.com", "").replace("/ws", "");
        StringBuilder sb3 = new StringBuilder(AbstractJsonLexerKt.NULL);
        c lastInstanceSelected = z0.getInstance().getLastInstanceSelected();
        if (lastInstanceSelected != null) {
            button = button2;
            relativeLayout = relativeLayout2;
            StringBuilder sb4 = new StringBuilder(lastInstanceSelected.getBaseUrlWS().replace(DtbConstants.HTTPS, "").replace(".akinator.com", "").replace("/ws", ""));
            typeface = typeface3;
            for (int i10 = 0; i10 < lastInstanceSelected.getCandidatesURLCount(); i10++) {
                String candidateURL = lastInstanceSelected.getCandidateURL(i10);
                String strReplace2 = candidateURL == null ? AbstractJsonLexerKt.NULL : candidateURL.replace(DtbConstants.HTTPS, "").replace(".akinator.com", "").replace("/ws", "");
                sb4.append(" - ");
                sb4.append(strReplace2);
            }
            sb2 = new StringBuilder(sb4.toString().trim());
        } else {
            relativeLayout = relativeLayout2;
            typeface = typeface3;
            button = button2;
            sb2 = sb3;
        }
        String string = sb2.toString();
        String idJoueurAccount = m.sharedInstance().isUserConnected() ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
        ArrayList arrayList = this.K;
        arrayList.clear();
        arrayList.add(new Pair("Device", Build.BRAND + " - " + Build.MODEL));
        arrayList.add(new Pair("OS Version", Build.VERSION.RELEASE));
        arrayList.add(new Pair("System Language", Locale.getDefault().getLanguage()));
        arrayList.add(new Pair(AndroidInitializeBoldSDK.MSG_NETWORK, str));
        arrayList.add(new Pair("Screen size", width + "x" + height));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.I);
        sb5.append(" (");
        arrayList.add(new Pair("App version", b.f(this.J, ")", sb5)));
        arrayList.add(new Pair("App detail", str2));
        arrayList.add(new Pair("App Language", b1.sharedInstance().getApplicationLanguage()));
        arrayList.add(new Pair("Theme", subjectLabel));
        arrayList.add(new Pair("ID user", m.sharedInstance().getDeviceId()));
        arrayList.add(new Pair("Localisation", getResources().getConfiguration().getLocales().get(0).getCountry()));
        arrayList.add(new Pair("Last ws", strReplace));
        arrayList.add(new Pair("Instance", string));
        arrayList.add(new Pair("PlayerID", idJoueurAccount));
        arrayList.add(new Pair(b1.sharedInstance().getTraductionFromToken("MENU_MODE_ENFANT"), m.sharedInstance().isChildProtectEnabled() ? "1" : "0"));
        arrayList.add(new Pair(zAQQWzBxnS.xWmzeEWRatoUxP, jb.c.sharedInstance().getCampaign("id_media_pub")));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutInfosContainer);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_send_form, (ViewGroup) linearLayout, false);
            TextView textView7 = (TextView) viewInflate.findViewById(R.id.textLeftLine);
            Typeface typeface4 = typeface;
            textView7.setTypeface(typeface4);
            textView7.setText((CharSequence) pair.first);
            TextView textView8 = (TextView) viewInflate.findViewById(R.id.textRightLine);
            textView8.setTypeface(typeface4);
            textView8.setText((CharSequence) pair.second);
            linearLayout.addView(viewInflate);
        }
        EditText editText = (EditText) findViewById(R.id.editTextDescription);
        this.C = editText;
        editText.setTypeface(typeface);
        this.C.setHint(b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_DESCRIPTION_PAR_DEFAUT"));
        this.C.setOnEditorActionListener(new a0(this, 1));
        this.C.setOnFocusChangeListener(new com.google.android.material.datepicker.c(this, 3));
        this.H = b1.sharedInstance().getTraductionFromToken("MERCI_DE_CONSERVER_DONNEES_TECHNIQUES");
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.mainRelativeLayout);
        relativeLayout.setOnClickListener(this.L);
        button.setOnClickListener(this.N);
        relativeLayout3.setOnClickListener(this.M);
    }
}
