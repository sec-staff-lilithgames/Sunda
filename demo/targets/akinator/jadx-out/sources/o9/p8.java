package o9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public EditText f78442c;

    /* renamed from: e, reason: collision with root package name */
    public TextView f78443e;

    /* renamed from: f, reason: collision with root package name */
    public ListView f78444f;

    /* renamed from: h, reason: collision with root package name */
    public ArrayAdapter f78446h;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f78445g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantLock f78447i = new ReentrantLock();

    /* renamed from: j, reason: collision with root package name */
    public final m8 f78448j = new m8(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final o8 f78449k = new o8(this);

    public String getTextFromEditor() {
        return this.f78442c.getText().toString();
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
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_search, viewGroup, false);
        this.f78442c = (EditText) viewInflate.findViewById(R.id.soundlike1FieldValue);
        this.f78444f = (ListView) viewInflate.findViewById(R.id.listAutocompletion);
        this.f78443e = (TextView) viewInflate.findViewById(R.id.tipsContentText);
        this.f78442c.setOnEditorActionListener(new m8(this, 0));
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78443e.setTypeface(typeFace);
        this.f78442c.setTypeface(typeFace);
        this.f78123b.markTextviewForUpdate(this.f78443e);
        this.f78123b.markTextviewForUpdate(this.f78442c);
        this.f78123b.updateTextViewsSize();
        this.f78443e.setText(lb.b1.sharedInstance().getTraductionFromToken("VISIBLEMENT_JE_NE_CONNAIS_PAS_ENCORE_VOTRE_PERSONNAGE") + ". " + lb.b1.sharedInstance().getTraductionFromToken("MERCI_DE_MINDIQUER_SON_NOM_DANS_LE_CHAMP_CI_DESSOUS") + " " + lb.b1.sharedInstance().getTraductionFromToken("POUR_ME_PERMETTRE_DEFFECTUER_UNE_RECHERCHE"));
        this.f78446h = new ArrayAdapter(this.f78123b, R.layout.item_soundlike_autocompletion, R.id.soundlike_autocompletion);
        this.f78444f.setVisibility(8);
        this.f78444f.setAdapter((ListAdapter) this.f78446h);
        this.f78444f.setOnItemClickListener(this.f78449k);
        this.f78442c.setOnEditorActionListener(this.f78448j);
        this.f78442c.addTextChangedListener(new n8(this));
        this.f78442c.setOnFocusChangeListener(new com.google.android.material.datepicker.c(this, 6));
        return viewInflate;
    }
}
