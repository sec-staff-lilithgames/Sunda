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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public TextView f78169c;

    /* renamed from: e, reason: collision with root package name */
    public TextView f78170e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f78171f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f78172g;

    /* renamed from: h, reason: collision with root package name */
    public Button f78173h;

    /* renamed from: i, reason: collision with root package name */
    public Button f78174i;

    /* renamed from: j, reason: collision with root package name */
    public final f8 f78175j;

    /* renamed from: k, reason: collision with root package name */
    public final f8 f78176k;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.f8] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.f8] */
    public g8() {
        final int i10 = 0;
        this.f78175j = new View.OnClickListener(this) { // from class: o9.f8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g8 f78147c;

            {
                this.f78147c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f78147c.f78123b.managePreviousFragment();
                        break;
                    default:
                        this.f78147c.f78123b.manageNextFragment();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f78176k = new View.OnClickListener(this) { // from class: o9.f8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g8 f78147c;

            {
                this.f78147c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f78147c.f78123b.managePreviousFragment();
                        break;
                    default:
                        this.f78147c.f78123b.manageNextFragment();
                        break;
                }
            }
        };
    }

    public String getNameFromEditor() {
        return this.f78172g.getText().toString();
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
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_name, viewGroup, false);
        this.f78170e = (TextView) viewInflate.findViewById(R.id.soundlike3ContentText);
        this.f78171f = (TextView) viewInflate.findViewById(R.id.soundlike3Message);
        this.f78169c = (TextView) viewInflate.findViewById(R.id.soundlike3FieldNameText);
        this.f78172g = (EditText) viewInflate.findViewById(R.id.soundlike3FieldNameValue);
        this.f78173h = (Button) viewInflate.findViewById(R.id.nextButton);
        this.f78174i = (Button) viewInflate.findViewById(R.id.previousButton);
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78170e.setTypeface(typeFace);
        this.f78172g.setTypeface(typeFace);
        this.f78169c.setTypeface(typeFace);
        this.f78171f.setTypeface(typeFace);
        this.f78173h.setTypeface(typeFace);
        this.f78174i.setTypeface(typeFace);
        this.f78123b.markTextviewForUpdate(this.f78173h);
        this.f78123b.markTextviewForUpdate(this.f78174i);
        this.f78123b.markTextviewForUpdate(this.f78170e);
        this.f78123b.markTextviewForUpdate(this.f78172g);
        this.f78123b.markTextviewForUpdate(this.f78169c);
        this.f78123b.updateTextViewsSize();
        this.f78173h.setOnClickListener(this.f78176k);
        this.f78174i.setOnClickListener(this.f78175j);
        this.f78173h.setTextColor(Color.parseColor("#4C2901"));
        this.f78174i.setTextColor(Color.parseColor("#4C2901"));
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getString("name") == null) {
            this.f78172g.setText(ca.u.sharedInstance().getCharacterNameProposed());
        } else {
            this.f78172g.setText(arguments.getString("name"));
        }
        this.f78172g.setOnEditorActionListener(new a0(this, 3));
        this.f78169c.setText(Character.toUpperCase(lb.b1.sharedInstance().getTraductionFromToken("NOM").charAt(0)) + lb.b1.sharedInstance().getTraductionFromToken("NOM").substring(1));
        this.f78171f.setText(lb.b1.sharedInstance().getTraductionFromToken("EXPLICATION_NOUVEAU_NOM") + ". ");
        j1.o2.x(this.f78170e, "SSTITRE_NOUVEAU_PERSONNAGE");
        j1.o2.w(this.f78173h, "SUIVANT");
        j1.o2.w(this.f78174i, "PRECEDENT");
        this.f78172g.setOnFocusChangeListener(new com.google.android.material.datepicker.c(this, 5));
        return viewInflate;
    }
}
