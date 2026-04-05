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
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class t8 extends e8 {

    /* renamed from: c, reason: collision with root package name */
    public TextView f78575c;

    /* renamed from: e, reason: collision with root package name */
    public Button f78576e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f78577f = new j0(this, 9);

    @Override // o9.e8, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_thanking, viewGroup, false);
        this.f78575c = (TextView) viewInflate.findViewById(R.id.remerciementText);
        this.f78576e = (Button) viewInflate.findViewById(R.id.buttonOk);
        Typeface typeFace = AkApplication.getTypeFace();
        this.f78575c.setTypeface(typeFace);
        this.f78576e.setTypeface(typeFace);
        j1.o2.x(this.f78575c, "MERCI_POUR_TON_AIDE");
        this.f78576e.setOnClickListener(this.f78577f);
        this.f78576e.setTextColor(Color.parseColor(GalEuEfxjome.pvb));
        return viewInflate;
    }
}
