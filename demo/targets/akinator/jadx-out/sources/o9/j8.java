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
public class j8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public TextView f78268c;

    /* renamed from: e, reason: collision with root package name */
    public ListView f78269e;

    /* renamed from: f, reason: collision with root package name */
    public Button f78270f;

    /* renamed from: g, reason: collision with root package name */
    public Button f78271g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f78272h;

    /* renamed from: j, reason: collision with root package name */
    public y9.a f78274j;

    /* renamed from: k, reason: collision with root package name */
    public final h8 f78275k;

    /* renamed from: l, reason: collision with root package name */
    public final h8 f78276l;

    /* renamed from: m, reason: collision with root package name */
    public final h8 f78277m;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f78273i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final i8 f78278n = new i8(this);

    /* JADX WARN: Type inference failed for: r0v1, types: [o9.h8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o9.h8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o9.h8] */
    public j8() {
        final int i10 = 0;
        this.f78275k = new View.OnClickListener(this) { // from class: o9.h8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j8 f78201c;

            {
                this.f78201c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f78201c.f78123b.manageReturnFragment();
                        break;
                    case 1:
                        this.f78201c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78201c.f78123b.managePreviousFragment();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f78276l = new View.OnClickListener(this) { // from class: o9.h8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j8 f78201c;

            {
                this.f78201c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f78201c.f78123b.manageReturnFragment();
                        break;
                    case 1:
                        this.f78201c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78201c.f78123b.managePreviousFragment();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f78277m = new View.OnClickListener(this) { // from class: o9.h8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j8 f78201c;

            {
                this.f78201c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f78201c.f78123b.manageReturnFragment();
                        break;
                    case 1:
                        this.f78201c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78201c.f78123b.managePreviousFragment();
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
        this.f78268c = (TextView) viewInflate.findViewById(R.id.listCharactersTitle);
        this.f78269e = (ListView) viewInflate.findViewById(R.id.charactersList);
        this.f78270f = (Button) viewInflate.findViewById(R.id.characterNotInListButton);
        this.f78271g = (Button) viewInflate.findViewById(R.id.validateButton);
        this.f78272h = (ImageView) viewInflate.findViewById(R.id.retourButton);
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78268c.setTypeface(typeFace);
        this.f78270f.setTypeface(typeFace);
        this.f78271g.setTypeface(typeFace);
        this.f78123b.markTextviewForUpdate(this.f78270f);
        this.f78123b.markTextviewForUpdate(this.f78268c);
        this.f78123b.markTextviewForUpdate(this.f78271g);
        this.f78123b.updateTextViewsSize();
        j1.o2.w(this.f78270f, "PAS_DANS_LA_LISTE");
        j1.o2.x(this.f78268c, "SI_VOUS_VOYEZ_LE_PERSONNAGE_AUQUEL_VOUS_PENSIEZ_DANS_LA_LISTE_SUIVANTE_CLIQUEZ_SUR_SON_NOM");
        this.f78271g.setText(lb.b1.sharedInstance().getTraductionFromToken("VALIDER"));
        ArrayList arrayList = (ArrayList) getArguments().getSerializable("several");
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == null) {
                arrayList.remove(i10);
            } else {
                i10++;
            }
        }
        this.f78274j = new y9.a(this.f78123b, arrayList, this.f78273i);
        if (ca.m.sharedInstance().canDownloadPicture()) {
            this.f78123b.disposeAtDestruction(mt.b0.fromCallable(new com.google.firebase.messaging.m(7, this, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(this, 20)));
        }
        this.f78269e.setAdapter((ListAdapter) this.f78274j);
        this.f78274j.notifyDataSetChanged();
        this.f78269e.setDivider(null);
        this.f78269e.setDividerHeight(0);
        this.f78270f.setOnClickListener(this.f78277m);
        this.f78269e.setOnItemClickListener(this.f78278n);
        this.f78272h.setOnClickListener(this.f78275k);
        this.f78271g.setTextColor(Color.parseColor("#4C2901"));
        this.f78270f.setTextColor(Color.parseColor("#4C2901"));
        this.f78271g.setOnClickListener(this.f78276l);
        return viewInflate;
    }
}
