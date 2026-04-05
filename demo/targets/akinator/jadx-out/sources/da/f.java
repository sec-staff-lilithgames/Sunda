package da;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import java.text.NumberFormat;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends AlertDialog {

    /* renamed from: h, reason: collision with root package name */
    public static final Typeface f51960h;

    /* renamed from: i, reason: collision with root package name */
    public static final Typeface f51961i;

    /* renamed from: b, reason: collision with root package name */
    public final Context f51962b;

    /* renamed from: c, reason: collision with root package name */
    public h f51963c;

    /* renamed from: e, reason: collision with root package name */
    public g f51964e;

    /* renamed from: f, reason: collision with root package name */
    public j f51965f;

    /* renamed from: g, reason: collision with root package name */
    public i f51966g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        AkApplication.a aVar = AkApplication.f21719f;
        f51960h = aVar.getTypeFace();
        f51961i = aVar.getTypeFaceRaleBold();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        setCancelable(false);
        this.f51962b = context;
        if (getWindow() != null) {
            Window window = getWindow();
            e0.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void a(String str, String str2, String str3, float f10, boolean z10) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_yes_no, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.textTitre);
        if (z10) {
            textView.setText(Html.fromHtml(str3));
        } else {
            textView.setText(str3);
        }
        textView.setTypeface(f51960h);
        setCancelable(false);
        Button button = (Button) linearLayout.findViewById(R.id.ouiButton);
        button.setText(str);
        if (f10 > 0.0f) {
            button.setTextSize(0, r0.getResources().getDimensionPixelSize(R.dimen.gen_little_button_text_size) * f10);
        }
        button.setOnClickListener(new d(this, 0));
        Button button2 = (Button) linearLayout.findViewById(R.id.nonButton);
        button2.setText(str2);
        if (f10 > 0.0f) {
            button2.setTextSize(0, r0.getResources().getDimensionPixelSize(R.dimen.gen_little_button_text_size) * f10);
        }
        button2.setOnClickListener(new d(this, 7));
        setView(linearLayout);
        show();
    }

    public final String getTextEditText(EditText edit) {
        e0.checkNotNullParameter(edit, "edit");
        return edit.getText().toString();
    }

    public final void setConfirmeListener(g gVar) {
        this.f51964e = gVar;
    }

    public final void setConfirmeRadioListener(h hVar) {
        this.f51963c = hVar;
    }

    public final void setCopierListener(i iVar) {
        this.f51966g = iVar;
    }

    public final void setOkListener(j jVar) {
        this.f51965f = jVar;
    }

    public final void setTypeAchatGeniz(int i10, String str) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_achat_geniz, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.textScoreGz);
        textView.setTextColor(-16777216);
        Typeface typeface = f51960h;
        textView.setTypeface(typeface);
        textView.setText(ca.m.sharedInstance().isUserConnected() ? NumberFormat.getInstance().format(ca.r.sharedInstance().getGenizBalanceAccount()) : NumberFormat.getInstance().format(ca.r.sharedInstance().getGenizBalance()));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.textTitre);
        b1.a aVar = b1.f72741d;
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("COUT_DE_INDICE") + " : ");
        textView2.setTypeface(typeface);
        setCancelable(false);
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.textCoutQuantite);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        textView3.setText(sb2.toString());
        textView3.setTypeface(typeface);
        TextView textView4 = (TextView) relativeLayout.findViewById(R.id.textToDisplay);
        textView4.setText(str);
        textView4.setTypeface(typeface);
        Button button = (Button) relativeLayout.findViewById(R.id.ouiButton);
        button.setText(aVar.sharedInstance().getTraductionFromToken("OUI"));
        button.setOnClickListener(new d(this, 1));
        Button button2 = (Button) relativeLayout.findViewById(R.id.nonButton);
        button2.setText(aVar.sharedInstance().getTraductionFromToken("NON"));
        button2.setOnClickListener(new d(this, 2));
        setView(relativeLayout);
        show();
    }

    public final void setTypeDoubleButtonsCustom(String str, String str2, String str3) {
        setTypeDoubleButtonsCustom(str, str2, str3, false);
    }

    public final void setTypeDoubleButtonsCustomWithRatio(String str, String str2, String str3, float f10) {
        a(str, str2, str3, f10, false);
    }

    public final void setTypeFcm(String str, String str2) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_fcm, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.titleFcmToken);
        textView.setText("FCM TOKEN");
        Typeface typeface = f51960h;
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.titleJetonId);
        textView2.setText("JETON ID");
        textView2.setTypeface(typeface);
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.textMessage);
        textView3.setText(str);
        textView3.setTypeface(typeface);
        TextView textView4 = (TextView) linearLayout.findViewById(R.id.textMessage2);
        textView4.setText(str2);
        textView4.setTypeface(typeface);
        TextView textView5 = (TextView) linearLayout.findViewById(R.id.textTitre);
        textView5.setText(str);
        textView5.setTypeface(typeface);
        textView5.setText("Firebase Informations");
        setCancelable(false);
        Button button = (Button) linearLayout.findViewById(R.id.okButton);
        button.setText("Copier");
        button.setTypeface(typeface);
        button.setOnClickListener(new d(this, 11));
        Button button2 = (Button) linearLayout.findViewById(R.id.okButton2);
        button2.setText("Copier");
        button2.setTypeface(typeface);
        button2.setOnClickListener(new d(this, 12));
        setView(linearLayout);
        show();
    }

    public final void setTypeIUnderstand(String str) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_i_understand, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.textTitre);
        textView.setText(str);
        textView.setTypeface(f51960h);
        setCancelable(false);
        Button button = (Button) linearLayout.findViewById(R.id.okButton);
        button.setText(b1.f72741d.sharedInstance().getTraductionFromToken("J_AI_COMPRIS"));
        button.setOnClickListener(new d(this, 13));
        setView(linearLayout);
        show();
    }

    public final void setTypeNoAdAvailable() {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_no_ad_available, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.textLigne1);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "AUCUNE_PUB_VIDEO_REWARDED_DISPONIBLE", textView);
        Typeface typeface = f51960h;
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.textLigne2);
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("RECOMPENSE_ACCORDEE"));
        textView2.setTypeface(typeface);
        setCancelable(false);
        Button button = (Button) relativeLayout.findViewById(R.id.okButton);
        button.setText(aVar.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new d(this, 4));
        setView(relativeLayout);
        show();
    }

    public final void setTypeOk(String str) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_ok, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.textTitre);
        textView.setText(str);
        textView.setTypeface(f51960h);
        setCancelable(false);
        Button button = (Button) linearLayout.findViewById(R.id.okButton);
        button.setText(b1.f72741d.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new d(this, 6));
        setView(linearLayout);
        show();
    }

    public final void setTypeOkNew(String str) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_ok_new, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.textTitre);
        textView.setText(str);
        textView.setTypeface(f51960h);
        setCancelable(false);
        Button button = (Button) relativeLayout.findViewById(R.id.okButton);
        button.setText(b1.f72741d.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new d(this, 3));
        setView(relativeLayout);
        show();
    }

    public final void setTypePointsPerdus(ta.d fake) {
        e0.checkNotNullParameter(fake, "fake");
        Context context = this.f51962b;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_alerte_pts_perdus, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        setCancelable(false);
        int lostPoints = fake.getLostPoints();
        ArrayList<ta.e> listFake = fake.getListFake();
        b1.a aVar = b1.f72741d;
        String strReplace$default = k0.replace$default(aVar.sharedInstance().getTraductionFromToken("POINTS_PERDUS"), "[nb_points]", String.valueOf(lostPoints), false, 4, (Object) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.ptsPerdus);
        textView.setTextColor(-16777216);
        textView.setTypeface(f51960h);
        textView.setText(strReplace$default);
        ((ListView) linearLayout.findViewById(R.id.layoutFakeAkiAwards)).setAdapter((ListAdapter) new y9.m(context, listFake));
        Button button = (Button) linearLayout.findViewById(R.id.okButton);
        button.setText(aVar.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new d(this, 10));
        setView(linearLayout);
        show();
    }

    public final void setTypeRadioButtons(ArrayList<String> options, int i10) {
        e0.checkNotNullParameter(options, "options");
        setTypeRadioButtonsWithIcons(options, null, i10);
    }

    public final void setTypeRadioButtonsWithIcons(ArrayList<String> options, ArrayList<Integer> arrayList, int i10) throws Resources.NotFoundException {
        e0.checkNotNullParameter(options, "options");
        Context context = this.f51962b;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_alerte_radio_buttons, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        RadioGroup radioGroup = (RadioGroup) linearLayout.findViewById(R.id.radioGroup);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gen_button_text_size);
        int size = options.size();
        int i11 = 0;
        while (i11 < size) {
            String str = options.get(i11);
            e0.checkNotNullExpressionValue(str, "get(...)");
            String str2 = str;
            int iIntValue = arrayList != null ? arrayList.get(i11).intValue() : -1;
            RadioButton radioButton = new RadioButton(context);
            if (iIntValue != -1) {
                radioButton.setCompoundDrawablesWithIntrinsicBounds(iIntValue, 0, 0, 0);
            }
            radioButton.setText(str2);
            radioButton.setTextColor(-16777216);
            radioButton.setTypeface(f51960h);
            radioButton.setTextSize(0, dimensionPixelSize);
            radioButton.setAllCaps(false);
            radioButton.setId(i11);
            radioButton.setButtonDrawable(R.drawable.radio_button_icon_selector);
            radioButton.setChecked(i10 == i11);
            radioGroup.addView(radioButton);
            i11++;
        }
        radioGroup.setOnCheckedChangeListener(new e());
        setCancelable(false);
        Button button = (Button) linearLayout.findViewById(R.id.okButton);
        button.setText(b1.f72741d.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(3, this, radioGroup));
        setView(linearLayout);
        show();
    }

    public final void setTypeRegleDdj() {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_ddj, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        setCancelable(false);
        TextView textView = (TextView) linearLayout.findViewById(R.id.regleDdj);
        textView.setTextColor(-16777216);
        Typeface typeface = f51960h;
        textView.setTypeface(typeface);
        b1.a aVar = b1.f72741d;
        textView.setText(aVar.sharedInstance().getTraductionFromToken("REGLE_DEFI_DU_JOUR") + "\n" + aVar.sharedInstance().getTraductionFromToken("REGLE2_DEFI_DU_JOUR"));
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.regleIndice1);
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("REGLE_INDICE_1"));
        textView2.setTypeface(typeface);
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.regleIndice2);
        textView3.setText(aVar.sharedInstance().getTraductionFromToken("REGLE_INDICE_2"));
        textView3.setTypeface(typeface);
        Button button = (Button) linearLayout.findViewById(R.id.okButton);
        button.setText(aVar.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new d(this, 5));
        setView(linearLayout);
        show();
    }

    public final void setTypeTwoButtons(String str, String str2, String str3) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_two_buttons, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.textTitre);
        textView.setText(str);
        Typeface typeface = f51960h;
        textView.setTypeface(typeface);
        setCancelable(false);
        Button button = (Button) linearLayout.findViewById(R.id.ouiButton);
        button.setText(str3);
        button.setTypeface(f51961i);
        button.setOnClickListener(new d(this, 8));
        Button button2 = (Button) linearLayout.findViewById(R.id.nonButton);
        button2.setText(str2);
        button2.setTypeface(typeface);
        button2.setOnClickListener(new d(this, 9));
        setView(linearLayout);
        show();
    }

    public final void setTypeTwoButtonsOneEditText(String str, String str2, String str3) {
        View viewInflate = LayoutInflater.from(this.f51962b).inflate(R.layout.layout_alerte_two_buttons_one_edit_text, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.textTitre);
        textView.setText(str);
        Typeface typeface = f51960h;
        textView.setTypeface(typeface);
        setCancelable(false);
        EditText editText = (EditText) linearLayout.findViewById(R.id.editTextMail);
        editText.setTypeface(typeface);
        Button button = (Button) linearLayout.findViewById(R.id.ouiButton);
        button.setText(str2);
        button.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(4, this, editText));
        Button button2 = (Button) linearLayout.findViewById(R.id.nonButton);
        button2.setText(str3);
        button2.setOnClickListener(new d(this, 14));
        setView(linearLayout);
        show();
    }

    public final void setTypeYesNo(String str) {
        b1.a aVar = b1.f72741d;
        setTypeDoubleButtonsCustom(aVar.sharedInstance().getTraductionFromToken("OUI"), aVar.sharedInstance().getTraductionFromToken("NON"), str, false);
    }

    public final void setTypeDoubleButtonsCustom(String str, String str2, String str3, boolean z10) {
        a(str, str2, str3, -1.0f, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10) {
        super(context, i10);
        e0.checkNotNullParameter(context, "context");
        setCancelable(false);
        this.f51962b = context;
        if (getWindow() != null) {
            Window window = getWindow();
            e0.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
