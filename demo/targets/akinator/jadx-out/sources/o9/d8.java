package o9;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.fyber.inneractive.sdk.external.NativeAdContent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public EditText f78096c;

    /* renamed from: e, reason: collision with root package name */
    public TextView f78097e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f78098f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f78099g;

    /* renamed from: h, reason: collision with root package name */
    public Button f78100h;

    /* renamed from: i, reason: collision with root package name */
    public Button f78101i;

    /* renamed from: j, reason: collision with root package name */
    public final c8 f78102j;

    /* renamed from: k, reason: collision with root package name */
    public final c8 f78103k;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.c8] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.c8] */
    public d8() {
        final int i10 = 0;
        this.f78102j = new View.OnClickListener(this) { // from class: o9.c8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d8 f78079c;

            {
                this.f78079c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f78079c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78079c.f78123b.managePreviousFragment();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f78103k = new View.OnClickListener(this) { // from class: o9.c8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d8 f78079c;

            {
                this.f78079c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f78079c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78079c.f78123b.managePreviousFragment();
                        break;
                }
            }
        };
    }

    public String getDescriptionFromEditor() {
        return this.f78096c.getText().toString();
    }

    public void hideKeyboard(View view) {
        ((InputMethodManager) this.f78123b.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // o9.e8, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_description, viewGroup, false);
        this.f78096c = (EditText) viewInflate.findViewById(R.id.soundlike4FieldDescriptionValue);
        this.f78097e = (TextView) viewInflate.findViewById(R.id.soundlike4ContentText);
        this.f78098f = (TextView) viewInflate.findViewById(R.id.soundlike4FieldDescriptionText);
        this.f78099g = (TextView) viewInflate.findViewById(R.id.soundlike4Message);
        this.f78101i = (Button) viewInflate.findViewById(R.id.nextButton);
        this.f78100h = (Button) viewInflate.findViewById(R.id.previousButton);
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78097e.setTypeface(typeFace);
        this.f78096c.setTypeface(typeFace);
        this.f78098f.setTypeface(typeFace);
        this.f78099g.setTypeface(typeFace);
        this.f78101i.setTypeface(typeFace);
        this.f78100h.setTypeface(typeFace);
        this.f78123b.markTextviewForUpdate(this.f78096c);
        this.f78123b.markTextviewForUpdate(this.f78098f);
        this.f78123b.markTextviewForUpdate(this.f78097e);
        this.f78101i.setOnClickListener(this.f78102j);
        this.f78100h.setOnClickListener(this.f78103k);
        this.f78101i.setTextColor(Color.parseColor("#4C2901"));
        this.f78100h.setTextColor(Color.parseColor("#4C2901"));
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getString("description") != null) {
            this.f78096c.setText(arguments.getString("description"));
        }
        this.f78096c.setOnEditorActionListener(new a0(this, 2));
        this.f78098f.setText(Character.toUpperCase(lb.b1.sharedInstance().getTraductionFromToken(NativeAdContent.ViewTag.AD_DESCRIPTION).charAt(0)) + lb.b1.sharedInstance().getTraductionFromToken(NativeAdContent.ViewTag.AD_DESCRIPTION).substring(1) + ":");
        this.f78099g.setText(lb.b1.sharedInstance().getTraductionFromToken("EXPLICATION_NOUVELLE_DESCRIPTION") + ".");
        j1.o2.x(this.f78097e, "SSTITRE_NOUVEAU_PERSONNAGE");
        j1.o2.w(this.f78101i, "SUIVANT");
        j1.o2.w(this.f78100h, "PRECEDENT");
        this.f78096c.setOnFocusChangeListener(new com.google.android.material.datepicker.c(this, 4));
        return viewInflate;
    }

    public void setDescriptionFromEditor(String str) {
        this.f78096c.setText(str);
    }
}
