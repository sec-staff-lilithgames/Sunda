package o9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.carousel.CarouselLayoutManager;
import java.util.Timer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n3 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public AkActivity f78384c;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView f78385e;

    /* renamed from: f, reason: collision with root package name */
    public Timer f78386f;

    /* renamed from: g, reason: collision with root package name */
    public l3 f78387g;

    /* renamed from: h, reason: collision with root package name */
    public final Typeface f78388h = AkApplication.getTypeFace();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends RecyclerView.a {
        public a(AkActivity akActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(m3 m3Var, int i10) {
            int i11 = i10 % 4;
            if (i11 == 0) {
                m3Var.f78358c.setImageResource(R.drawable.more_fun_image1);
                return;
            }
            if (i11 == 1) {
                m3Var.f78358c.setImageResource(R.drawable.more_fun_image2);
            } else if (i11 == 2) {
                m3Var.f78358c.setImageResource(R.drawable.more_fun_image3);
            } else {
                if (i11 != 3) {
                    return;
                }
                m3Var.f78358c.setImageResource(R.drawable.more_fun_image4);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public m3 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new m3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_carousel, viewGroup, false));
        }
    }

    public static n3 newInstance() {
        return new n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78384c = (AkActivity) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_more_fun, viewGroup, false);
        a aVar = new a(this.f78384c);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(1, true);
        carouselLayoutManager.setPostLayoutListener(new ea.f());
        carouselLayoutManager.setMaxVisibleItems(4);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
        this.f78385e = recyclerView;
        recyclerView.setLayoutManager(carouselLayoutManager);
        this.f78385e.setHasFixedSize(true);
        this.f78385e.addOnScrollListener(new ea.g());
        this.f78385e.setAdapter(aVar);
        this.f78385e.setOnTouchListener(new k3());
        Button button = (Button) viewInflate.findViewById(R.id.accessoriesButton);
        button.setText(lb.b1.sharedInstance().getTraductionFromToken("BTN_PERSONNALISER"));
        button.setOnClickListener(new j0(this, 3));
        TextView textView = (TextView) viewInflate.findViewById(R.id.textCustomizeTheGenie);
        j1.o2.x(textView, "SSTITRE_BOUTIQUE");
        textView.setTypeface(this.f78388h);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Timer timer = this.f78386f;
        if (timer != null) {
            timer.cancel();
            this.f78386f = null;
        }
        l3 l3Var = this.f78387g;
        if (l3Var != null) {
            l3Var.cancel();
            this.f78387g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f78386f = new Timer();
        l3 l3Var = new l3(this);
        this.f78387g = l3Var;
        this.f78386f.scheduleAtFixedRate(l3Var, 5000L, 5000L);
    }

    @Override // o9.c1
    public final boolean removeCreatedView() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            jb.h.sharedInstance().incMetricCompteur("morefun_displayed");
        }
    }
}
