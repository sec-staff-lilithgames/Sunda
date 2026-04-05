package s9;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import bj.v0;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddPhotoBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import lb.b1;
import lb.e;
import mt.n0;
import s9.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends p9.e {

    /* renamed from: j, reason: collision with root package name */
    public static final a f85509j = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public FragmentAddPhotoBinding f85510c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f85511e = AkApplication.f21719f.getTypeFace();

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f85512f;

    /* renamed from: g, reason: collision with root package name */
    public e.g f85513g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f85514h;

    /* renamed from: i, reason: collision with root package name */
    public g f85515i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final c newInstance() {
            return new c();
        }
    }

    public final e.g getMCharacter() {
        return this.f85513g;
    }

    public final Bitmap getRescaledBitmap() {
        return this.f85512f;
    }

    public final void loadNewPictureFromDisk(Uri targetUri) {
        e0.checkNotNullParameter(targetUri, "targetUri");
        pt.c cVar = this.f85514h;
        if (cVar == null || cVar.isDisposed()) {
            FragmentAddPhotoBinding fragmentAddPhotoBinding = this.f85510c;
            e0.checkNotNull(fragmentAddPhotoBinding);
            fragmentAddPhotoBinding.loadingBarAward.setVisibility(0);
            n0 n0VarCreate = n0.create(new ks.s(19, this, targetUri));
            e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
            this.f85514h = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(ou.j.io()).subscribe(new v0(new b(this, 0), 28), new v0(new b(this, 1), 29));
        }
    }

    public final boolean mustAddPseudo() {
        FragmentAddPhotoBinding fragmentAddPhotoBinding = this.f85510c;
        e0.checkNotNull(fragmentAddPhotoBinding);
        return fragmentAddPhotoBinding.customizeCheckBoxPseudo.isChecked();
    }

    @Override // androidx.fragment.app.Fragment
    @tu.f
    public void onActivityResult(int i10, int i11, Intent intent) {
        Uri data;
        super.onActivityResult(i10, i11, intent);
        if (i10 != 0 || i11 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        loadNewPictureFromDisk(data);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddPhotoBinding fragmentAddPhotoBindingInflate = FragmentAddPhotoBinding.inflate(inflater, viewGroup, false);
        this.f85510c = fragmentAddPhotoBindingInflate;
        e0.checkNotNull(fragmentAddPhotoBindingInflate);
        RelativeLayout root = fragmentAddPhotoBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        pt.c cVar = this.f85514h;
        if (cVar != null) {
            cVar.dispose();
        }
        Bitmap bitmap = this.f85512f;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f85510c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
        this.f85513g = persoPropose;
        if (persoPropose == null) {
            Toast.makeText(requireContext(), b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            return;
        }
        FragmentAddPhotoBinding fragmentAddPhotoBinding = this.f85510c;
        e0.checkNotNull(fragmentAddPhotoBinding);
        TextView textView = fragmentAddPhotoBinding.customizeLabelText;
        Typeface typeface = this.f85511e;
        textView.setTypeface(typeface);
        fragmentAddPhotoBinding.customizeButtonLoadPicture.setTypeface(typeface);
        fragmentAddPhotoBinding.customizeButtonSendPicture.setTypeface(typeface);
        fragmentAddPhotoBinding.customizeCheckBoxPseudo.setTypeface(typeface);
        TextView textView2 = fragmentAddPhotoBinding.customizeLabelText;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "BY_CHECKING_THIS_BOX_YOU_ALLOW_ELOKENCE_TO_USE_THIS_PICTURE_AND_CERTIFY_OWNING_ITS_RIGHTS", textView2);
        fragmentAddPhotoBinding.customizeButtonLoadPicture.setText(aVar.sharedInstance().getTraductionFromToken("CHOISIR_UNE_PHOTO"));
        fragmentAddPhotoBinding.customizeButtonSendPicture.setText(aVar.sharedInstance().getTraductionFromToken("ENVOYER"));
        fragmentAddPhotoBinding.customizeCheckBoxPseudo.setText(aVar.sharedInstance().getTraductionFromToken("AFFICHER_MON_PSEUDO"));
        fragmentAddPhotoBinding.customizeButtonLoadPicture.setTextColor(Color.parseColor("#4C2901"));
        fragmentAddPhotoBinding.customizeButtonSendPicture.setTextColor(Color.parseColor("#4C2901"));
        final int i10 = 0;
        fragmentAddPhotoBinding.customizeButtonLoadPicture.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f85506c;

            {
                this.f85506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                c cVar = this.f85506c;
                switch (i11) {
                    case 0:
                        c.a aVar2 = c.f85509j;
                        cVar.getClass();
                        Intent intent = new Intent("android.intent.action.GET_CONTENT", (Uri) null);
                        intent.setType("image/*");
                        intent.putExtra("return-data", true);
                        cVar.startActivityForResult(intent, 0);
                        break;
                    case 1:
                        g gVar = cVar.f85515i;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        c.a aVar3 = c.f85509j;
                        cVar.getClass();
                        Intent intent2 = new Intent(cVar.requireContext(), (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/mobile/content#inpi");
                        cVar.startActivity(intent2);
                        break;
                }
            }
        });
        final int i11 = 1;
        fragmentAddPhotoBinding.customizeButtonSendPicture.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f85506c;

            {
                this.f85506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                c cVar = this.f85506c;
                switch (i112) {
                    case 0:
                        c.a aVar2 = c.f85509j;
                        cVar.getClass();
                        Intent intent = new Intent("android.intent.action.GET_CONTENT", (Uri) null);
                        intent.setType("image/*");
                        intent.putExtra("return-data", true);
                        cVar.startActivityForResult(intent, 0);
                        break;
                    case 1:
                        g gVar = cVar.f85515i;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        c.a aVar3 = c.f85509j;
                        cVar.getClass();
                        Intent intent2 = new Intent(cVar.requireContext(), (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/mobile/content#inpi");
                        cVar.startActivity(intent2);
                        break;
                }
            }
        });
        final int i12 = 2;
        fragmentAddPhotoBinding.customizeLabelText.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f85506c;

            {
                this.f85506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                c cVar = this.f85506c;
                switch (i112) {
                    case 0:
                        c.a aVar2 = c.f85509j;
                        cVar.getClass();
                        Intent intent = new Intent("android.intent.action.GET_CONTENT", (Uri) null);
                        intent.setType("image/*");
                        intent.putExtra("return-data", true);
                        cVar.startActivityForResult(intent, 0);
                        break;
                    case 1:
                        g gVar = cVar.f85515i;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        c.a aVar3 = c.f85509j;
                        cVar.getClass();
                        Intent intent2 = new Intent(cVar.requireContext(), (Class<?>) WebviewCGV.class);
                        intent2.putExtra("url", "https://cgu.akinator.com/mobile/content#inpi");
                        cVar.startActivity(intent2);
                        break;
                }
            }
        });
    }

    public final void setMCharacter(e.g gVar) {
        this.f85513g = gVar;
    }

    public final void setManager(g mManager) {
        e0.checkNotNullParameter(mManager, "mManager");
        this.f85515i = mManager;
    }
}
