package com.inmobi.media;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N9 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile WeakReference f32068d;

    /* renamed from: a, reason: collision with root package name */
    public int f32072a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f32073b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f32067c = uu.p1.hashMapOf(tu.e0.to(T8.class, (byte) 0), tu.e0.to(C2891md.class, (byte) 1), tu.e0.to(C2874ld.class, (byte) 2), tu.e0.to(C3004t8.class, (byte) 3), tu.e0.to(ImageView.class, (byte) 6), tu.e0.to(C3056w9.class, (byte) 7), tu.e0.to(C3107z9.class, (byte) 4), tu.e0.to(Button.class, (byte) 5), tu.e0.to(C2735d9.class, (byte) 8), tu.e0.to(GestureDetectorOnGestureListenerC3093yc.class, (byte) 9), tu.e0.to(Q4.class, (byte) 10));

    /* renamed from: e, reason: collision with root package name */
    public static WeakReference f32069e = new WeakReference(null);

    /* renamed from: f, reason: collision with root package name */
    public static int f32070f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static int f32071g = 1;

    public N9(Context context) {
        f32069e = new WeakReference(context);
        this.f32073b = uu.p1.hashMapOf(tu.e0.to((byte) 0, new G9(this)), tu.e0.to((byte) 3, new C9(this)), tu.e0.to((byte) 1, new L9(this)), tu.e0.to((byte) 2, new H9(this)), tu.e0.to((byte) 6, new F9(this)), tu.e0.to((byte) 10, new E9(this)), tu.e0.to((byte) 7, new K9(this)), tu.e0.to((byte) 4, new I9(this)), tu.e0.to((byte) 5, new D9(this)), tu.e0.to((byte) 8, new J9(this)), tu.e0.to((byte) 9, new M9(this)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.content.Context r9, com.inmobi.media.C2903n8 r10, com.inmobi.commons.core.configs.AdConfig r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N9.a(android.content.Context, com.inmobi.media.n8, com.inmobi.commons.core.configs.AdConfig):android.view.View");
    }

    public final void b(View view) {
        Byte b10 = (Byte) f32067c.get(view.getClass());
        byte bByteValue = b10 != null ? b10.byteValue() : (byte) -1;
        if (-1 == bByteValue) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
            view.toString();
            return;
        }
        B9 b92 = (B9) this.f32073b.get(Byte.valueOf(bByteValue));
        if (b92 == null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
            return;
        }
        if (this.f32072a >= 300) {
            Iterator it = this.f32073b.entrySet().iterator();
            int size = 0;
            B9 b93 = null;
            while (it.hasNext()) {
                B9 b94 = (B9) ((Map.Entry) it.next()).getValue();
                if (b94.f31667a.size() > size) {
                    size = b94.f31667a.size();
                    b93 = b94;
                }
            }
            if (b93 != null && b93.f31667a.size() > 0) {
                uu.v0.removeFirst(b93.f31667a);
            }
        }
        b92.a(view);
    }

    public static final void a(N9 n9, Button button, C2903n8 c2903n8) {
        n9.getClass();
        C2920o8 c2920o8 = c2903n8.f33139d;
        kotlin.jvm.internal.e0.checkNotNull(c2920o8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeCtaAsset.NativeCtaAssetStyle");
        C3021u8 c3021u8 = (C3021u8) c2920o8;
        button.setLayoutParams(new ViewGroup.LayoutParams(C3073x9.a(c3021u8.f33181a.x), C3073x9.a(c3021u8.f33181a.y)));
        Object obj = c2903n8.f33140e;
        button.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        button.setTextSize(1, C3073x9.a(c3021u8.f32446l));
        int color = Color.parseColor("#ff000000");
        try {
            String str = c3021u8.f32448n;
            Locale US = Locale.US;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            color = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e10) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        button.setTextColor(color);
        int color2 = Color.parseColor("#00000000");
        try {
            color2 = Color.parseColor(c3021u8.a());
        } catch (IllegalArgumentException e11) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
            Y5 y53 = Y5.f32563a;
            C2796h2 event2 = new C2796h2(e11);
            kotlin.jvm.internal.e0.checkNotNullParameter(event2, "event");
            Y5.f32566d.a(event2);
        }
        button.setBackgroundColor(color2);
        button.setTextAlignment(4);
        button.setGravity(17);
        C3073x9.a(button, c3021u8.f32449o);
        C3073x9.a(button, c3021u8);
    }

    public static final void a(N9 n9, ImageView imageView, C2903n8 c2903n8) {
        int i10;
        int i11;
        int i12;
        String str;
        n9.getClass();
        Object obj = c2903n8.f33140e;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            int iA = C3073x9.a(c2903n8.f33139d.f33181a.x);
            int iA2 = C3073x9.a(c2903n8.f33139d.f33181a.y);
            String str3 = c2903n8.f33139d.f33187g;
            if (kotlin.jvm.internal.e0.areEqual(str3, "aspectFit")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (kotlin.jvm.internal.e0.areEqual(str3, "aspectFill")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            Context context = (Context) f32069e.get();
            if (context != null && iA > 0 && iA2 > 0) {
                int length = str2.length() - 1;
                int i13 = 0;
                boolean z10 = false;
                while (i13 <= length) {
                    boolean z11 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z10 ? i13 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                if (str2.subSequence(i13, length + 1).toString().length() > 0) {
                    Ia ia2 = Ia.f31873a;
                    RequestCreator requestCreatorLoad = ia2.a(context).load(str2);
                    Object objA = ia2.a(new A9(context, imageView, c2903n8));
                    kotlin.jvm.internal.e0.checkNotNull(objA, "null cannot be cast to non-null type com.squareup.picasso.Callback");
                    requestCreatorLoad.into(imageView, (Callback) objA);
                    if (sv.k0.equals("cross_button", c2903n8.f33137b, true) && ((str = c2903n8.f33151p) == null || str.length() == 0)) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3090y9(context, imageView), 2000L);
                    }
                }
            }
            C2970r8 c2970r8 = c2903n8.f33153r;
            if (c2970r8 == null || !kotlin.jvm.internal.e0.areEqual("line", c2970r8.f33139d.f33185e)) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                C2920o8 c2920o8 = c2970r8.f33139d;
                int i14 = c2920o8.f33183c.x == c2903n8.f33139d.f33183c.x ? 1 : 0;
                i11 = C3073x9.a(c2920o8.f33181a.x) == C3073x9.a(c2903n8.f33139d.f33181a.x) + c2903n8.f33139d.f33183c.x ? 1 : 0;
                i12 = C3073x9.a(c2970r8.f33139d.f33183c.y) == C3073x9.a(c2903n8.f33139d.f33183c.y) ? 1 : 0;
                i = C3073x9.a(c2970r8.f33139d.f33181a.y) == C3073x9.a(c2903n8.f33139d.f33183c.y) + C3073x9.a(c2903n8.f33139d.f33181a.y) ? 1 : 0;
                if (C3073x9.a(c2970r8.f33139d.f33181a.x) == C3073x9.a(c2903n8.f33139d.f33181a.x)) {
                    i10 = i;
                    i11 = 1;
                    i = 1;
                } else {
                    i10 = i;
                    i = i14;
                }
            }
            imageView.setPaddingRelative(i, i12, i11, i10);
            C3073x9.a(imageView, c2903n8.f33139d);
        }
    }

    public static final void a(N9 n9, TextView textView, C2903n8 c2903n8) {
        n9.getClass();
        C2920o8 c2920o8 = c2903n8.f33139d;
        kotlin.jvm.internal.e0.checkNotNull(c2920o8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTextAsset.NativeTextAssetStyle");
        W8 w82 = (W8) c2920o8;
        textView.setLayoutParams(new ViewGroup.LayoutParams(C3073x9.a(w82.f33181a.x), C3073x9.a(w82.f33181a.y)));
        Object obj = c2903n8.f33140e;
        textView.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        textView.setTypeface(Typeface.DEFAULT);
        byte b10 = w82.f32447m;
        if (b10 == 0) {
            textView.setGravity(8388627);
        } else if (b10 == 1) {
            textView.setGravity(8388629);
        } else if (b10 == 2) {
            textView.setGravity(17);
        } else {
            textView.setGravity(8388627);
        }
        textView.setTextSize(1, C3073x9.a(w82.f32446l));
        int color = Color.parseColor("#ff000000");
        try {
            String str = w82.f32448n;
            Locale US = Locale.US;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            color = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e10) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        textView.setTextColor(color);
        int color2 = Color.parseColor("#00000000");
        try {
            color2 = Color.parseColor(w82.a());
        } catch (IllegalArgumentException e11) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
            Y5 y53 = Y5.f32563a;
            C2796h2 event2 = new C2796h2(e11);
            kotlin.jvm.internal.e0.checkNotNullParameter(event2, "event");
            Y5.f32566d.a(event2);
        }
        textView.setBackgroundColor(color2);
        textView.setTextAlignment(1);
        C3073x9.a(textView, w82.f32449o);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        C3073x9.a(textView, w82);
    }

    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (!(view instanceof T8) && !(view instanceof C3004t8)) {
            b(view);
            return;
        }
        C3004t8 c3004t8 = (C3004t8) view;
        if (c3004t8.getChildCount() == 0) {
            b(view);
            return;
        }
        Stack stack = new Stack();
        stack.push(c3004t8);
        while (!stack.isEmpty()) {
            C3004t8 c3004t82 = (C3004t8) stack.pop();
            int childCount = c3004t82.getChildCount();
            while (true) {
                childCount--;
                if (-1 < childCount) {
                    View childAt = c3004t82.getChildAt(childCount);
                    c3004t82.removeViewAt(childCount);
                    if (childAt instanceof C3004t8) {
                        stack.push(childAt);
                    } else {
                        kotlin.jvm.internal.e0.checkNotNull(childAt);
                        b(childAt);
                    }
                }
            }
            kotlin.jvm.internal.e0.checkNotNull(c3004t82);
            b(c3004t82);
        }
    }

    public static void a(C2735d9 c2735d9, C2903n8 c2903n8) {
        long jA;
        c2735d9.setVisibility(4);
        kotlin.jvm.internal.e0.checkNotNull(c2903n8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTimerAsset");
        C2684a9 c2684a9 = (C2684a9) c2903n8;
        Z8 z82 = c2684a9.f32648x;
        Y8 y82 = z82.f32597a;
        Y8 y83 = z82.f32598b;
        if (y82 != null) {
            try {
                jA = y82.a();
            } catch (Exception e10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                return;
            }
        } else {
            jA = 0;
        }
        long jA2 = y83 != null ? y83.a() : 0L;
        if (jA2 >= 0) {
            c2735d9.setTimerValue(jA2);
            new Handler(Looper.getMainLooper()).postDelayed(new zk.n(5, c2684a9, c2735d9), jA * 1000);
        }
    }

    public static final void a(C2684a9 timerAsset, C2735d9 timerView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timerAsset, "$timerAsset");
        kotlin.jvm.internal.e0.checkNotNullParameter(timerView, "$timerView");
        if (f32069e.get() != null) {
            if (timerAsset.f32649y) {
                timerView.setVisibility(0);
            }
            timerView.d();
        }
    }
}
