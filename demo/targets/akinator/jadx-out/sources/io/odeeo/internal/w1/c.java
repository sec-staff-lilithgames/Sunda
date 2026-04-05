package io.odeeo.internal.w1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.R;
import io.odeeo.sdk.advertisement.data.AdInfo;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c extends FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final a f67352p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f67353q = Color.rgb(249, 0, 243);

    /* renamed from: r, reason: collision with root package name */
    public static int f67354r = Color.rgb(130, 1, 241);

    /* renamed from: s, reason: collision with root package name */
    public static final int f67355s = 12;

    /* renamed from: t, reason: collision with root package name */
    public static final int f67356t = 102;

    /* renamed from: u, reason: collision with root package name */
    public static final int f67357u = 24;

    /* renamed from: v, reason: collision with root package name */
    public static final int f67358v = 180;

    /* renamed from: w, reason: collision with root package name */
    public static final int f67359w = 6;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f67360a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.w1.g f67361b;

    /* renamed from: c, reason: collision with root package name */
    public int f67362c;

    /* renamed from: d, reason: collision with root package name */
    public int f67363d;

    /* renamed from: e, reason: collision with root package name */
    public int f67364e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.sdk.l f67365f;

    /* renamed from: g, reason: collision with root package name */
    public ImageButton f67366g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f67367h;

    /* renamed from: i, reason: collision with root package name */
    public ImageButton f67368i;

    /* renamed from: j, reason: collision with root package name */
    public final tu.o f67369j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.o f67370k;

    /* renamed from: l, reason: collision with root package name */
    public final tu.o f67371l;

    /* renamed from: m, reason: collision with root package name */
    public float f67372m;

    /* renamed from: n, reason: collision with root package name */
    public kv.l f67373n;

    /* renamed from: o, reason: collision with root package name */
    public kv.l f67374o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.w1.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0684a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f67375a;

            static {
                int[] iArr = new int[AdUnit.PlacementType.values().length];
                iArr[AdUnit.PlacementType.RewardedAudioIconAd.ordinal()] = 1;
                iArr[AdUnit.PlacementType.RewardedAudioBannerAd.ordinal()] = 2;
                f67375a = iArr;
            }
        }

        public a() {
        }

        public final int getACTION_BUTTON_SIZE$odeeoSdk_release() {
            return c.f67357u;
        }

        public final int getAD_MARK_LAYOUT_SIZE$odeeoSdk_release() {
            return c.f67355s;
        }

        public final int getAD_MARK_TEXT_SIZE$odeeoSdk_release() {
            return c.f67359w;
        }

        public final int getAD_MARK_TRANSPARENCY$odeeoSdk_release() {
            return c.f67358v;
        }

        public final boolean getAdViewVisibility(AdUnit.PlacementType iconAdType, boolean z10) {
            e0.checkNotNullParameter(iconAdType, "iconAdType");
            int i10 = C0684a.f67375a[iconAdType.ordinal()];
            return ((i10 == 1 || i10 == 2) && z10) ? false : true;
        }

        public final int getCOLOR_DEFAULT_FROM$odeeoSdk_release() {
            return c.f67353q;
        }

        public final int getCOLOR_DEFAULT_TO$odeeoSdk_release() {
            return c.f67354r;
        }

        public final int getLINEBAR_CORNER_TRANSPARENCY$odeeoSdk_release() {
            return c.f67356t;
        }

        public final boolean getVisualizerVisibility(AdInfo ad2) {
            e0.checkNotNullParameter(ad2, "ad");
            String companionUrl$odeeoSdk_release = ad2.getCompanionUrl$odeeoSdk_release();
            if (companionUrl$odeeoSdk_release != null && companionUrl$odeeoSdk_release.length() != 0) {
                return true;
            }
            String companionHtml$odeeoSdk_release = ad2.getCompanionHtml$odeeoSdk_release();
            return (companionHtml$odeeoSdk_release == null || companionHtml$odeeoSdk_release.length() == 0) ? false : true;
        }

        public final void setCOLOR_DEFAULT_TO$odeeoSdk_release(int i10) {
            c.f67354r = i10;
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67376a;

        static {
            int[] iArr = new int[AdUnit.ActionButtonType.values().length];
            iArr[AdUnit.ActionButtonType.Mute.ordinal()] = 1;
            iArr[AdUnit.ActionButtonType.Close.ordinal()] = 2;
            f67376a = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.w1.c$c, reason: collision with other inner class name */
    public static final class C0685c extends f0 implements kv.a {
        public C0685c() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4607invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4607invoke() {
            c.this.getSetMuteEnabled$odeeoSdk_release().invoke(Boolean.TRUE);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends f0 implements kv.a {
        public d() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4608invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4608invoke() {
            c.this.getSetMuteEnabled$odeeoSdk_release().invoke(Boolean.FALSE);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends f0 implements kv.a {
        public e() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4609invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4609invoke() {
            c.this.getFinishWithError$odeeoSdk_release().invoke(new io.odeeo.internal.b1.e(AdUnit.ERROR_STOPPED_CLOSEBTN, null, 2, null));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends f0 implements kv.a {
        public f() {
            super(0);
        }

        @Override // kv.a
        public final io.odeeo.sdk.m invoke() {
            Object tag = c.this.getTag();
            if (tag != null) {
                return (io.odeeo.sdk.m) tag;
            }
            throw new NullPointerException("null cannot be cast to non-null type io.odeeo.sdk.PlacementData");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends f0 implements kv.a {
        public g() {
            super(0);
        }

        @Override // kv.a
        public final Float invoke() {
            return Float.valueOf(io.odeeo.internal.v1.k.f67283a.getDeviceDensityPixelScale(c.this.getContext()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f67382a = new h();

        public h() {
            super(1);
        }

        public final void invoke(io.odeeo.internal.b1.e it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.b1.e) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends f0 implements kv.a {
        public i() {
            super(0);
        }

        @Override // kv.a
        public final io.odeeo.sdk.n invoke() {
            Object tag = c.this.getTag(R.drawable.endlevel_popup);
            io.odeeo.sdk.n nVar = tag instanceof io.odeeo.sdk.n ? (io.odeeo.sdk.n) tag : null;
            if (nVar == null) {
                return new io.odeeo.sdk.n(null, null, 0.0f, null, 0, 0, 63, null);
            }
            return nVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final j f67384a = new j();

        public j() {
            super(1);
        }

        public final void invoke(boolean z10) {
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Activity context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    public static final void a(c this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.f67365f.onPause();
        this$0.f67361b.pause$odeeoSdk_release();
    }

    public static final void b(c this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.f67365f.release();
    }

    public static final void c(c this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.f67365f.onResume();
        this$0.f67361b.resume$odeeoSdk_release();
    }

    /* renamed from: addActionButton-R6A4vtM$odeeoSdk_release, reason: not valid java name */
    public final void m4606addActionButtonR6A4vtM$odeeoSdk_release(LinearLayout frame, AdUnit.ActionButtonType actionType, float f10, GradientDrawable backgroundDrawable, String placementId) {
        e0.checkNotNullParameter(frame, "frame");
        e0.checkNotNullParameter(actionType, "actionType");
        e0.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        e0.checkNotNullParameter(placementId, "placementId");
        io.odeeo.internal.e1.c cVarM4588getPlacementConfig00XPtyU = io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(placementId);
        int i10 = b.f67376a[actionType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f67372m = Math.max(cVarM4588getPlacementConfig00XPtyU.getActionDelayMs(), f10);
            this.f67368i.setBackground(backgroundDrawable);
            this.f67368i.setVisibility(8);
            o.setDebounceClickListener$default(this.f67368i, 0L, new e(), 1, null);
            Drawable drawable = m3.a.getDrawable(this.f67360a, R.drawable.odeeo_skip_template);
            e0.checkNotNull(drawable);
            e0.checkNotNullExpressionValue(drawable, "getDrawable(context, R.d…le.odeeo_skip_template)!!");
            this.f67368i.setImageDrawable(drawable);
            this.f67368i.setAdjustViewBounds(true);
            this.f67368i.setScaleType(ImageView.ScaleType.CENTER_CROP);
            io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
            int iDensityPixelsToPixels = kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 4);
            this.f67368i.setPadding(iDensityPixelsToPixels, iDensityPixelsToPixels, iDensityPixelsToPixels, iDensityPixelsToPixels);
            ImageButton imageButton = this.f67368i;
            float densityPixelsToPixelScale$odeeoSdk_release = getDensityPixelsToPixelScale$odeeoSdk_release();
            int i11 = f67357u;
            frame.addView(imageButton, new LinearLayout.LayoutParams(kVar.densityPixelsToPixels(densityPixelsToPixelScale$odeeoSdk_release, i11), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i11)));
            return;
        }
        this.f67372m = Math.max(cVarM4588getPlacementConfig00XPtyU.getActionDelayMs(), f10);
        this.f67367h.setBackground(backgroundDrawable);
        this.f67367h.setVisibility(8);
        o.setDebounceClickListener$default(this.f67367h, 0L, new C0685c(), 1, null);
        Drawable drawable2 = m3.a.getDrawable(this.f67360a, R.drawable.odeeo_mute_template);
        e0.checkNotNull(drawable2);
        e0.checkNotNullExpressionValue(drawable2, "getDrawable(context, R.d…le.odeeo_mute_template)!!");
        this.f67367h.setImageDrawable(drawable2);
        this.f67367h.setAdjustViewBounds(true);
        ImageButton imageButton2 = this.f67367h;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageButton2.setScaleType(scaleType);
        io.odeeo.internal.v1.k kVar2 = io.odeeo.internal.v1.k.f67283a;
        int iDensityPixelsToPixels2 = kVar2.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 4);
        this.f67367h.setPadding(iDensityPixelsToPixels2, iDensityPixelsToPixels2, iDensityPixelsToPixels2, iDensityPixelsToPixels2);
        ImageButton imageButton3 = this.f67367h;
        float densityPixelsToPixelScale$odeeoSdk_release2 = getDensityPixelsToPixelScale$odeeoSdk_release();
        int i12 = f67357u;
        frame.addView(imageButton3, new LinearLayout.LayoutParams(kVar2.densityPixelsToPixels(densityPixelsToPixelScale$odeeoSdk_release2, i12), kVar2.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i12)));
        this.f67366g.setBackground(backgroundDrawable);
        this.f67366g.setVisibility(8);
        o.setDebounceClickListener$default(this.f67366g, 0L, new d(), 1, null);
        Drawable drawable3 = m3.a.getDrawable(this.f67360a, R.drawable.odeeo_unmute_template);
        e0.checkNotNull(drawable3);
        e0.checkNotNullExpressionValue(drawable3, "getDrawable(context, R.d….odeeo_unmute_template)!!");
        this.f67366g.setImageDrawable(drawable3);
        this.f67366g.setAdjustViewBounds(true);
        this.f67366g.setScaleType(scaleType);
        this.f67366g.setPadding(iDensityPixelsToPixels2, iDensityPixelsToPixels2, iDensityPixelsToPixels2, iDensityPixelsToPixels2);
        frame.addView(this.f67366g, new LinearLayout.LayoutParams(kVar2.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i12), kVar2.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i12)));
    }

    public final float getActionButtonDelayMillis$odeeoSdk_release() {
        return this.f67372m;
    }

    @Override // android.view.View
    public final Activity getContext() {
        return this.f67360a;
    }

    public final io.odeeo.sdk.m getData$odeeoSdk_release() {
        return (io.odeeo.sdk.m) this.f67369j.getValue();
    }

    public final float getDensityPixelsToPixelScale$odeeoSdk_release() {
        return ((Number) this.f67371l.getValue()).floatValue();
    }

    public final kv.l getFinishWithError$odeeoSdk_release() {
        return this.f67374o;
    }

    public final io.odeeo.internal.w1.g getLineBarVisualizer$odeeoSdk_release() {
        return this.f67361b;
    }

    public final ImageButton getMuteBtn$odeeoSdk_release() {
        return this.f67367h;
    }

    public final io.odeeo.sdk.n getRewardedData$odeeoSdk_release() {
        return (io.odeeo.sdk.n) this.f67370k.getValue();
    }

    public final kv.l getSetMuteEnabled$odeeoSdk_release() {
        return this.f67373n;
    }

    public final ImageButton getSkipBtn$odeeoSdk_release() {
        return this.f67368i;
    }

    public final ImageButton getUnmuteBtn$odeeoSdk_release() {
        return this.f67366g;
    }

    public final io.odeeo.sdk.l getWebView$odeeoSdk_release() {
        return this.f67365f;
    }

    public final void pause$odeeoSdk_release() {
        this.f67360a.runOnUiThread(new gt.a(this, 0));
    }

    public final void release$odeeoSdk_release() {
        this.f67360a.runOnUiThread(new gt.a(this, 2));
    }

    public final void resume$odeeoSdk_release() {
        this.f67360a.runOnUiThread(new gt.a(this, 1));
    }

    public final void setActionButtonDelayMillis$odeeoSdk_release(float f10) {
        this.f67372m = f10;
    }

    public final void setButtonsClickable(boolean z10) {
        this.f67366g.setClickable(z10);
        this.f67367h.setClickable(z10);
        this.f67368i.setClickable(z10);
    }

    public final void setFinishWithError$odeeoSdk_release(kv.l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.f67374o = lVar;
    }

    public final void setMuteBtn$odeeoSdk_release(ImageButton imageButton) {
        e0.checkNotNullParameter(imageButton, "<set-?>");
        this.f67367h = imageButton;
    }

    public final void setMuteButtonEnabled(boolean z10) {
        Fade fade = new Fade();
        fade.setDuration(400L);
        fade.addTarget(this.f67367h);
        Fade fade2 = new Fade();
        fade2.setDuration(400L);
        fade2.addTarget(this.f67366g);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(fade);
        transitionSet.addTransition(fade2);
        TransitionManager.beginDelayedTransition(this, transitionSet);
        if (z10) {
            this.f67366g.setVisibility(0);
            this.f67367h.setVisibility(8);
        } else {
            this.f67367h.setVisibility(0);
            this.f67366g.setVisibility(8);
        }
    }

    public final void setSetMuteEnabled$odeeoSdk_release(kv.l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.f67373n = lVar;
    }

    public final void setSkipBtn$odeeoSdk_release(ImageButton imageButton) {
        e0.checkNotNullParameter(imageButton, "<set-?>");
        this.f67368i = imageButton;
    }

    public final void setUnmuteBtn$odeeoSdk_release(ImageButton imageButton) {
        e0.checkNotNullParameter(imageButton, "<set-?>");
        this.f67366g = imageButton;
    }

    public final void setVisualizationColor(int i10, int i11, int i12) {
        this.f67362c = i10;
        this.f67363d = i11;
        this.f67364e = i12;
        this.f67365f.setAudioOnlyVisualizerColor(i10);
        this.f67365f.setGradientBackgroundColor(i11, i12);
    }

    public void timerTick(int i10, long j10) {
        this.f67361b.invalidate();
    }

    public final void turnOnSkipButton() {
        Fade fade = new Fade();
        fade.setDuration(400L);
        fade.addTarget(this.f67368i);
        TransitionManager.beginDelayedTransition(this, fade);
        this.f67368i.setVisibility(0);
    }

    public /* synthetic */ c(Activity activity, AttributeSet attributeSet, int i10, u uVar) {
        this(activity, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.f67360a = context;
        this.f67361b = new io.odeeo.internal.w1.g(context);
        this.f67362c = -1;
        this.f67363d = f67353q;
        this.f67364e = f67354r;
        this.f67365f = new io.odeeo.sdk.l(context, null, 0, null, null, 30, null);
        this.f67366g = new ImageButton(context);
        this.f67367h = new ImageButton(context);
        this.f67368i = new ImageButton(context);
        this.f67369j = q.lazy(new f());
        this.f67370k = q.lazy(new i());
        this.f67371l = q.lazy(new g());
        this.f67372m = 5000.0f;
        this.f67373n = j.f67384a;
        this.f67374o = h.f67382a;
    }

    public final void a(FrameLayout frame, FrameLayout.LayoutParams layoutParams, boolean z10) {
        float[] fArr;
        e0.checkNotNullParameter(frame, "frame");
        e0.checkNotNullParameter(layoutParams, "layoutParams");
        float fDensityPixelsToPixels = io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setAlpha(f67358v);
        if (z10) {
            fArr = new float[]{0.0f, 0.0f, fDensityPixelsToPixels, fDensityPixelsToPixels, fDensityPixelsToPixels, fDensityPixelsToPixels, 0.0f, 0.0f};
        } else {
            fArr = new float[]{fDensityPixelsToPixels, fDensityPixelsToPixels, 0.0f, 0.0f, 0.0f, 0.0f, fDensityPixelsToPixels, fDensityPixelsToPixels};
        }
        gradientDrawable.setCornerRadii(fArr);
        TextView textView = new TextView(this.f67365f.getContext());
        textView.setTextSize(1, f67359w);
        textView.setText("AD");
        textView.setTypeface(null, 1);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackground(gradientDrawable);
        frame.addView(textView, layoutParams);
    }

    public final void a(GradientDrawable backgroundDrawable) {
        e0.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        if (this.f67365f.getAdInfo().getVisualiserEnabled$odeeoSdk_release()) {
            this.f67361b.setLines(3);
            this.f67361b.setWidth(2);
            this.f67361b.setSpace(1);
            this.f67361b.setLength(10);
            backgroundDrawable.setAlpha(f67356t);
            this.f67361b.setBackground(backgroundDrawable);
        }
    }
}
