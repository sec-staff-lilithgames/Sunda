package o9;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public TextView f78537c;

    /* renamed from: e, reason: collision with root package name */
    public ListView f78538e;

    /* renamed from: f, reason: collision with root package name */
    public Button f78539f;

    /* renamed from: g, reason: collision with root package name */
    public Button f78540g;

    /* renamed from: i, reason: collision with root package name */
    public y9.a f78542i;

    /* renamed from: j, reason: collision with root package name */
    public final q8 f78543j;

    /* renamed from: k, reason: collision with root package name */
    public final q8 f78544k;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f78541h = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final r8 f78545l = new r8(this);

    /* JADX WARN: Type inference failed for: r0v1, types: [o9.q8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o9.q8] */
    public s8() {
        final int i10 = 0;
        this.f78543j = new View.OnClickListener(this) { // from class: o9.q8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s8 f78467c;

            {
                this.f78467c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f78467c.f78123b.managePreviousFragment();
                        break;
                    default:
                        this.f78467c.f78123b.manageNextFragment();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f78544k = new View.OnClickListener(this) { // from class: o9.q8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s8 f78467c;

            {
                this.f78467c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f78467c.f78123b.managePreviousFragment();
                        break;
                    default:
                        this.f78467c.f78123b.manageNextFragment();
                        break;
                }
            }
        };
    }

    @Override // o9.e8, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_several_proposal, viewGroup, false);
        this.f78537c = (TextView) viewInflate.findViewById(R.id.listCharactersTitle);
        this.f78538e = (ListView) viewInflate.findViewById(R.id.charactersList);
        this.f78539f = (Button) viewInflate.findViewById(R.id.characterNotInListButton);
        this.f78540g = (Button) viewInflate.findViewById(R.id.validateButton);
        ((ImageView) viewInflate.findViewById(R.id.retourButton)).setVisibility(4);
        ArrayList arrayList = (ArrayList) getArguments().getSerializable("several");
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78537c.setTypeface(typeFace);
        this.f78539f.setTypeface(typeFace);
        this.f78540g.setTypeface(typeFace);
        this.f78123b.markTextviewForUpdate(this.f78539f);
        this.f78123b.markTextviewForUpdate(this.f78537c);
        this.f78123b.markTextviewForUpdate(this.f78540g);
        this.f78123b.updateTextViewsSize();
        j1.o2.w(this.f78539f, "PAS_DANS_LA_LISTE");
        j1.o2.x(this.f78537c, "SI_VOUS_VOYEZ_LE_PERSONNAGE_AUQUEL_VOUS_PENSIEZ_DANS_LA_LISTE_SUIVANTE_CLIQUEZ_SUR_SON_NOM");
        this.f78540g.setText(lb.b1.sharedInstance().getTraductionFromToken("VALIDER"));
        y9.a aVar = new y9.a(this.f78123b, arrayList, this.f78541h);
        this.f78542i = aVar;
        this.f78538e.setAdapter((ListAdapter) aVar);
        this.f78542i.notifyDataSetChanged();
        this.f78538e.setDivider(null);
        this.f78538e.setDividerHeight(0);
        this.f78539f.setOnClickListener(this.f78543j);
        this.f78538e.setOnItemClickListener(this.f78545l);
        this.f78540g.setTextColor(Color.parseColor("#4C2901"));
        this.f78539f.setTextColor(Color.parseColor("#4C2901"));
        this.f78540g.setOnClickListener(this.f78544k);
        if (ca.m.sharedInstance().canDownloadPicture()) {
            this.f78123b.disposeAtDestruction(mt.b0.fromCallable(new com.google.firebase.messaging.m(9, this, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(this, 21)));
        }
        return viewInflate;
    }
}
