package o9;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public TextView f78324c;

    /* renamed from: e, reason: collision with root package name */
    public Button f78325e;

    /* renamed from: f, reason: collision with root package name */
    public Button f78326f;

    /* renamed from: g, reason: collision with root package name */
    public final k8 f78327g;

    /* renamed from: h, reason: collision with root package name */
    public final k8 f78328h;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.k8] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.k8] */
    public l8() {
        final int i10 = 0;
        this.f78327g = new View.OnClickListener(this) { // from class: o9.k8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l8 f78304c;

            {
                this.f78304c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f78304c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78304c.f78123b.managePreviousFragment();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f78328h = new View.OnClickListener(this) { // from class: o9.k8

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l8 f78304c;

            {
                this.f78304c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f78304c.f78123b.manageNextFragment();
                        break;
                    default:
                        this.f78304c.f78123b.managePreviousFragment();
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
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_retry, viewGroup, false);
        this.f78324c = (TextView) viewInflate.findViewById(R.id.remerciementText);
        this.f78325e = (Button) viewInflate.findViewById(R.id.finishedButton);
        this.f78326f = (Button) viewInflate.findViewById(R.id.newSearchButton);
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78324c.setTypeface(typeFace);
        this.f78325e.setTypeface(typeFace);
        this.f78326f.setTypeface(typeFace);
        this.f78326f.setTextSize(15.0f);
        this.f78325e.setTextSize(15.0f);
        j1.o2.x(this.f78324c, "RECHERCHE_SANS_RESULTAT");
        j1.o2.w(this.f78325e, "ANNULER");
        j1.o2.w(this.f78326f, "NOUVELLE_RECHERCHE");
        this.f78325e.setOnClickListener(this.f78327g);
        this.f78326f.setOnClickListener(this.f78328h);
        this.f78325e.setTextColor(Color.parseColor("#4C2901"));
        this.f78326f.setTextColor(Color.parseColor("#4C2901"));
        return viewInflate;
    }
}
