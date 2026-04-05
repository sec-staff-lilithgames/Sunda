package da;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r extends AlertDialog {

    /* renamed from: e, reason: collision with root package name */
    public static final Typeface f51971e;

    /* renamed from: f, reason: collision with root package name */
    public static final Typeface f51972f;

    /* renamed from: b, reason: collision with root package name */
    public final Context f51973b;

    /* renamed from: c, reason: collision with root package name */
    public j f51974c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        AkApplication.a aVar = AkApplication.f21719f;
        f51971e = aVar.getTypeFace();
        f51972f = aVar.getTypeFaceCrickxDroite();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        setCancelable(false);
        this.f51973b = context;
        if (getWindow() != null) {
            Window window = getWindow();
            e0.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(-1));
        }
    }

    public final void setOkListener(j jVar) {
        this.f51974c = jVar;
    }

    public final void setPopupApproved() {
        View viewInflate = LayoutInflater.from(this.f51973b).inflate(R.layout.layout_approved_checking, (ViewGroup) null);
        e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.approvedText);
        textView.setTypeface(f51972f);
        b1.a aVar = b1.f72741d;
        textView.setText(aVar.sharedInstance().getTraductionFromToken("PIEGE_TEST_APPROUVE"));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.explicationPiege);
        o2.A(aVar, "PIEGE_EXPLICATION", textView2);
        Typeface typeface = f51971e;
        textView2.setTypeface(typeface);
        textView2.setTextColor(-16777216);
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.bravoMessage);
        textView3.setText(aVar.sharedInstance().getTraductionFromToken("BRAVO_TU_N_ES_PAS_TOMBE_PIEGE"));
        textView3.setTypeface(typeface);
        textView3.setTextColor(-16777216);
        setCancelable(false);
        Button button = (Button) relativeLayout.findViewById(R.id.okButton);
        button.setText(aVar.sharedInstance().getTraductionFromToken("OK"));
        button.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 16));
        setView(relativeLayout);
        show();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        e0.checkNotNullParameter(context, "context");
        setCancelable(false);
        this.f51973b = context;
        if (getWindow() != null) {
            Window window = getWindow();
            e0.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(-1));
        }
    }

    public final void setConfirmeListener(g gVar) {
    }

    public final void setConfirmeRadioListener(h hVar) {
    }
}
