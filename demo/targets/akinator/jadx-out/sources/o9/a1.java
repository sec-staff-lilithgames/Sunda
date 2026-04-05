package o9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.ViewPagerCustom;
import java.util.ArrayList;
import java.util.Timer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a1 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public ViewPagerCustom f78017b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f78018c = null;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f78019e = null;

    /* renamed from: f, reason: collision with root package name */
    public Timer f78020f = null;

    /* renamed from: g, reason: collision with root package name */
    public y0 f78021g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f78022h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public String f78023i = "";

    /* renamed from: j, reason: collision with root package name */
    public boolean f78024j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f78025k = true;

    public a1() {
        new u9.d(this);
    }

    public static a1 newInstance(ArrayList<String> arrayList, String str) {
        return newInstance(arrayList, str, false);
    }

    public final void a(int i10, boolean z10) {
        ImageView imageView;
        Bitmap bitmapDecodeResource;
        LinearLayout linearLayout = this.f78019e;
        if (linearLayout == null) {
            return;
        }
        imageView = (ImageView) linearLayout.getChildAt(i10);
        String str = (String) this.f78022h.get(i10);
        str.getClass();
        switch (str) {
            case "podium":
                if (!z10) {
                    imageView.setImageResource(R.drawable.award_icon_pressed);
                    break;
                } else {
                    imageView.setImageResource(R.drawable.award_icon_unpressed);
                    break;
                }
            case "classement":
                if (!z10) {
                    imageView.setImageResource(R.drawable.classement_icon_pressed);
                    break;
                } else {
                    imageView.setImageResource(R.drawable.classement_icon_unpressed);
                    break;
                }
            case "dc":
                if (!ca.m.sharedInstance().mustDisplayUpdateIcon()) {
                    if (!z10) {
                        imageView.setImageResource(R.drawable.defi_icone_pressed);
                        break;
                    } else {
                        imageView.setImageResource(R.drawable.defi_icone_unpressed);
                        break;
                    }
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inMutable = true;
                    if (z10) {
                        bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.defi_icone_unpressed, options);
                        ca.m.sharedInstance().setDisplayUpdateIcon(false);
                    } else {
                        bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.defi_icone_pressed, options);
                    }
                    if (bitmapDecodeResource != null) {
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        new Canvas(bitmapDecodeResource).drawCircle(bitmapDecodeResource.getWidth() * 0.8f, bitmapDecodeResource.getHeight() * 0.8f, bitmapDecodeResource.getWidth() / 6.0f, paint);
                        imageView.setImageBitmap(bitmapDecodeResource);
                        break;
                    }
                }
                break;
            case "lsa":
                if (!z10) {
                    imageView.setImageResource(R.drawable.icon_hof_pressed);
                    break;
                } else {
                    imageView.setImageResource(R.drawable.icon_hof_unpressed);
                    break;
                }
            case "morefun":
                if (!z10) {
                    imageView.setImageResource(R.drawable.button_more_fun_pressed);
                    break;
                } else {
                    imageView.setImageResource(R.drawable.button_more_fun_unpressed);
                    break;
                }
            case "myworld":
                imageView.setVisibility(4);
                break;
            case "character":
                if (!z10) {
                    imageView.setImageResource(R.drawable.button_more_options_pressed);
                    break;
                } else {
                    imageView.setImageResource(R.drawable.button_more_options_unpressed);
                    break;
                }
        }
    }

    public void disableAutoSlide() {
        this.f78025k = false;
    }

    public void enableAutoSlide() {
        this.f78025k = true;
    }

    public boolean fragmentHasClosedAView() {
        if (this.f78018c == null) {
            return false;
        }
        boolean zRemoveCreatedView = false;
        for (int i10 = 0; i10 < this.f78018c.getCount(); i10++) {
            Fragment fragment = (Fragment) this.f78018c.f78706m.get(i10);
            if (fragment != null && (fragment instanceof c1)) {
                zRemoveCreatedView |= ((c1) fragment).removeCreatedView();
            }
        }
        return zRemoveCreatedView;
    }

    public Fragment getFragment(String str) {
        return (Fragment) this.f78018c.f78706m.get(this.f78022h.indexOf(str));
    }

    public void killThreadRefreshSlider() {
        Timer timer = this.f78020f;
        if (timer != null) {
            timer.cancel();
            this.f78020f = null;
        }
        y0 y0Var = this.f78021g;
        if (y0Var != null) {
            y0Var.cancel();
            this.f78021g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f78022h = getArguments().getStringArrayList("elementsToDisplay");
            this.f78023i = getArguments().getString("default_index");
            this.f78024j = getArguments().getBoolean("isFound");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            r10 = 2131624131(0x7f0e00c3, float:1.8875433E38)
            r0 = 0
            android.view.View r8 = r8.inflate(r10, r9, r0)
            r9 = 2131428603(0x7f0b04fb, float:1.8478855E38)
            android.view.View r9 = r8.findViewById(r9)
            com.digidust.elokence.akinator.graphic.ViewPagerCustom r9 = (com.digidust.elokence.akinator.graphic.ViewPagerCustom) r9
            r7.f78017b = r9
            o9.w0 r10 = new o9.w0
            r10.<init>(r7)
            r9.setOnInterceptTouchEventListener(r10)
            com.digidust.elokence.akinator.graphic.ViewPagerCustom r9 = r7.f78017b
            o9.x0 r10 = new o9.x0
            r10.<init>(r7)
            r9.addOnPageChangeListener(r10)
            o9.z0 r9 = new o9.z0
            androidx.fragment.app.FragmentActivity r10 = r7.getActivity()
            androidx.fragment.app.FragmentManager r10 = r10.getSupportFragmentManager()
            r9.<init>(r7, r10)
            r7.f78018c = r9
            com.digidust.elokence.akinator.graphic.ViewPagerCustom r10 = r7.f78017b
            r10.setAdapter(r9)
            java.util.ArrayList r9 = r7.f78022h
            java.lang.String r10 = r7.f78023i
            int r9 = r9.indexOf(r10)
            com.digidust.elokence.akinator.graphic.ViewPagerCustom r10 = r7.f78017b
            int r1 = java.lang.Math.max(r9, r0)
            r10.setCurrentItem(r1)
            androidx.fragment.app.FragmentActivity r10 = r7.getActivity()
            android.view.WindowManager r10 = r10.getWindowManager()
            android.view.Display r10 = r10.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r10.getSize(r1)
            int r10 = r1.x
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165611(0x7f0701ab, float:1.7945444E38)
            float r1 = r1.getDimension(r2)
            android.content.res.Resources r2 = r7.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r1 = (int) r1
            o9.z0 r2 = r7.f78018c
            int r2 = r2.getCount()
            if (r2 <= 0) goto L92
            o9.z0 r2 = r7.f78018c
            int r2 = r2.getCount()
            int r2 = r2 * r1
            int r10 = r10 - r2
            o9.z0 r2 = r7.f78018c
            int r2 = r2.getCount()
            int r2 = r2 * 2
            int r10 = r10 / r2
            goto L93
        L92:
            r10 = r0
        L93:
            if (r10 >= 0) goto L96
            r10 = r0
        L96:
            r2 = 2131428149(0x7f0b0335, float:1.8477934E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r7.f78019e = r2
            r2 = r0
        La2:
            o9.z0 r3 = r7.f78018c
            int r3 = r3.getCount()
            if (r2 >= r3) goto Leb
            android.widget.ImageView r3 = new android.widget.ImageView
            androidx.fragment.app.FragmentActivity r4 = r7.getActivity()
            r3.<init>(r4)
            android.content.res.Resources r4 = r7.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r5 = 1
            r6 = 1092616192(0x41200000, float:10.0)
            float r4 = android.util.TypedValue.applyDimension(r5, r6, r4)
            int r4 = (int) r4
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r1, r1)
            r6.setMargins(r10, r0, r10, r4)
            r3.setLayoutParams(r6)
            com.google.android.exoplayer2.ui.t r4 = new com.google.android.exoplayer2.ui.t
            r6 = 2
            r4.<init>(r7, r2, r6)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout r4 = r7.f78019e
            r4.addView(r3, r2)
            if (r9 < 0) goto Le3
            if (r2 != r9) goto Le1
            goto Le5
        Le1:
            r5 = r0
            goto Le5
        Le3:
            if (r2 != 0) goto Le1
        Le5:
            r7.a(r2, r5)
            int r2 = r2 + 1
            goto La2
        Leb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.a1.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        killThreadRefreshSlider();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        killThreadRefreshSlider();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f78020f = new Timer();
        y0 y0Var = new y0(this);
        this.f78021g = y0Var;
        this.f78020f.scheduleAtFixedRate(y0Var, 10000L, 10000L);
    }

    public static a1 newInstance(ArrayList<String> arrayList, String str, boolean z10) {
        a1 a1Var = new a1();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("elementsToDisplay", arrayList);
        bundle.putString("default_index", str);
        bundle.putBoolean("isFound", z10);
        a1Var.setArguments(bundle);
        return a1Var;
    }
}
