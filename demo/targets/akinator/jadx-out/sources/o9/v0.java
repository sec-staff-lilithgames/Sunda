package o9;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class v0 extends c1 implements aa.d {

    /* renamed from: c, reason: collision with root package name */
    public TextView f78610c;

    /* renamed from: e, reason: collision with root package name */
    public View f78611e;

    /* renamed from: f, reason: collision with root package name */
    public Button f78612f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f78613g;

    /* renamed from: h, reason: collision with root package name */
    public View f78614h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f78615i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f78616j;

    /* renamed from: m, reason: collision with root package name */
    public AkActivity f78619m;

    /* renamed from: k, reason: collision with root package name */
    public final Typeface f78617k = AkApplication.getTypeFace();

    /* renamed from: l, reason: collision with root package name */
    public boolean f78618l = false;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f78620n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final u9.c f78621o = new u9.c(this);

    public static v0 newInstance() {
        return new v0();
    }

    public void displayIndice(String str) {
        ViewGroup viewGroup = (ViewGroup) this.f78619m.getWindow().getDecorView().findViewById(R.id.content);
        this.f78613g = viewGroup;
        if (viewGroup != null) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(com.digidust.elokence.akinator.freemium.R.layout.layout_indice, this.f78613g, false);
            this.f78614h = viewInflate;
            viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.closeView).setOnClickListener(new p0(this, 1));
            TextView textView = (TextView) this.f78614h.findViewById(com.digidust.elokence.akinator.freemium.R.id.indiceTypeText);
            textView.setText(str);
            textView.setTypeface(this.f78617k);
            getActivity().runOnUiThread(new q0(this, 2));
        }
    }

    public AkActivity getActivityMaster() {
        return this.f78619m;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aa.f.sharedInstance().addListener(this);
        this.f78621o.onFragmentCreate();
        this.f78619m = (AkActivity) getActivity();
        View viewInflate = layoutInflater.inflate(com.digidust.elokence.akinator.freemium.R.layout.fragment_defi_du_jour, viewGroup, false);
        this.f78611e = viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.defisLayout);
        this.f78610c = (TextView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.titreDefi);
        this.f78612f = (Button) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.buttonPrecedant);
        this.f78615i = (LinearLayout) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.layoutPhotoDefi1);
        this.f78616j = (LinearLayout) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.layoutPhotoDefi2);
        ((Button) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.infoDDJ)).setOnClickListener(new p0(this, 0));
        getActivity().runOnUiThread(new q0(this, 1));
        return viewInflate;
    }

    @Override // aa.d
    public void onDefiDuJourModified() {
        getActivity().runOnUiThread(new q0(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        aa.f.sharedInstance().removeListener(this);
        this.f78621o.onFragmentDestroy();
        ArrayList arrayList = this.f78620n;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = (Bitmap) it.next();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            arrayList.clear();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f78621o.onResume();
    }

    @Override // o9.c1
    public boolean removeCreatedView() {
        if (this.f78613g == null || this.f78614h == null) {
            return false;
        }
        getActivity().runOnUiThread(new q0(this, 0));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            jb.h.sharedInstance().incMetricCompteur("dc_displayed");
        }
    }

    public final void a(LinearLayout linearLayout, int i10, int i11, final aa.c cVar) {
        final v0 v0Var = this;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(v0Var.getActivity());
        int i12 = i10;
        while (i12 < i11) {
            final aa.e eVar = cVar.getListPerso().get(i12);
            String photoBase64 = eVar.getPhotoBase64();
            float pourcentage = eVar.getPourcentage();
            boolean zIsFound = eVar.isFound();
            int gz = eVar.getGz();
            final String indice = eVar.getIndice();
            View viewInflate = layoutInflaterFrom.inflate(com.digidust.elokence.akinator.freemium.R.layout.item_defi_wanted, (ViewGroup) null);
            ImageView imageView = (ImageView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.imagePersoWanted);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.layoutPersoPourcent);
            TextView textView = (TextView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.defiGz);
            final ImageView imageView2 = (ImageView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.layoutPersoIndice);
            if (zIsFound) {
                imageView2.setVisibility(8);
                TextView textView2 = (TextView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.defiPourcentText);
                Typeface typeface = v0Var.f78617k;
                textView2.setTypeface(typeface);
                String str = QFzuMMDfrzagDN.XpKpuuc;
                textView2.setText(str + pourcentage + "%");
                textView.setTypeface(typeface);
                if (v0Var.f78618l) {
                    textView.setVisibility(4);
                } else {
                    textView.setText(str + gz + "gz");
                }
                try {
                    byte[] bArrDecode = z9.f.decode(photoBase64);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    imageView.setBackgroundColor(-16777216);
                    imageView.setImageBitmap(bitmapDecodeByteArray);
                    v0Var.f78620n.add(bitmapDecodeByteArray);
                } catch (z9.g unused) {
                    imageView.setImageResource(com.digidust.elokence.akinator.freemium.R.drawable.ak_place_holder_ddj);
                }
            } else {
                constraintLayout.setVisibility(4);
                textView.setVisibility(4);
                if (indice != null) {
                    if (eVar.isIndiceUnlocked()) {
                        imageView2.setImageResource(com.digidust.elokence.akinator.freemium.R.drawable.icon_indice_dispo);
                    } else {
                        imageView2.setImageResource(com.digidust.elokence.akinator.freemium.R.drawable.icon_indice_non_dispo);
                    }
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: o9.s0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            aa.e eVar2 = eVar;
                            boolean zIsIndiceUnlocked = eVar2.isIndiceUnlocked();
                            v0 v0Var2 = this.f78508b;
                            String str2 = indice;
                            if (zIsIndiceUnlocked) {
                                v0Var2.displayIndice(str2);
                                return;
                            }
                            int i13 = 0;
                            int i14 = 500;
                            while (true) {
                                aa.c cVar2 = cVar;
                                if (i13 >= cVar2.getListPerso().size()) {
                                    break;
                                }
                                if (cVar2.getListPerso().get(i13).isIndiceUnlocked()) {
                                    i14 *= 2;
                                }
                                i13++;
                            }
                            ca.m.sharedInstance().isUserConnected();
                            boolean zIsUserConnected = ca.m.sharedInstance().isUserConnected();
                            ImageView imageView3 = imageView2;
                            if (!zIsUserConnected ? ca.r.sharedInstance().getGenizBalance() < i14 : ca.r.sharedInstance().getGenizBalanceAccount() < i14) {
                                if (!ca.m.sharedInstance().isPaid()) {
                                    String traductionFromToken = lb.b1.sharedInstance().getTraductionFromToken("REGARDE_UNE_VIDEO_POUR_DEBLOQUER_CET_INDICE");
                                    da.f fVar = new da.f(v0Var2.getActivity());
                                    fVar.setTypeAchatGeniz(i14, traductionFromToken);
                                    fVar.setConfirmeListener(new t0(v0Var2, eVar2, imageView3, str2));
                                    return;
                                }
                            }
                            da.f fVar2 = new da.f(v0Var2.getActivity());
                            fVar2.setTypeAchatGeniz(i14, lb.b1.sharedInstance().getTraductionFromToken("VEUX_TU_OBTENIR_CET_INDICE"));
                            fVar2.setConfirmeListener(new u0(v0Var2, i14, eVar2, imageView3, str2));
                        }
                    });
                } else {
                    imageView2.setVisibility(8);
                }
            }
            linearLayout.addView(viewInflate);
            i12++;
            v0Var = this;
        }
    }
}
