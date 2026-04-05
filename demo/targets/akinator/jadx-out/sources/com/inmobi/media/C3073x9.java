package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3073x9 {
    public static ViewGroup.LayoutParams a(C2903n8 asset, ViewGroup parent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        C2920o8 c2920o8 = asset.f33139d;
        Point point = c2920o8.f33181a;
        Point point2 = c2920o8.f33183c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a(point.x), a(point.y));
        if (parent instanceof C3004t8) {
            C2987s8 c2987s8 = new C2987s8(a(point.x), a(point.y));
            int iA = a(point2.x);
            int iA2 = a(point2.y);
            c2987s8.f33366a = iA;
            c2987s8.f33367b = iA2;
            return c2987s8;
        }
        if (parent instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(point.x), a(point.y));
            layoutParams2.setMargins(a(point2.x), a(point2.y), 0, 0);
            return layoutParams2;
        }
        if (parent instanceof AbsListView) {
            return new AbsListView.LayoutParams(a(point.x), a(point.y));
        }
        if (parent instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a(point.x), a(point.y));
            layoutParams3.setMargins(a(point2.x), a(point2.y), 0, 0);
            return layoutParams3;
        }
        HashMap map = N9.f32067c;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "access$getTAG$cp(...)");
        return layoutParams;
    }

    public static int a(int i10) {
        int i11;
        return ((((Context) N9.f32069e.get()) instanceof InMobiAdActivity) || (i11 = N9.f32070f) == 0) ? i10 : (int) (((i11 * 1.0d) / N9.f32071g) * i10);
    }

    public static void a(Context context, ImageView imageView) {
        Bitmap bitmapCreateBitmap;
        if (imageView.getDrawable() == null) {
            float f10 = AbstractC2679a4.d().f32676c;
            A3 a32 = new A3(context, (byte) 0, null);
            if (Build.VERSION.SDK_INT < 28) {
                a32.layout(0, 0, (int) (a(40) * f10), (int) (a(40) * f10));
                a32.setDrawingCacheEnabled(true);
                a32.buildDrawingCache();
                bitmapCreateBitmap = a32.getDrawingCache();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "getDrawingCache(...)");
            } else {
                a32.layout(0, 0, (int) (a(40) * f10), (int) (a(40) * f10));
                bitmapCreateBitmap = Bitmap.createBitmap((int) (a(40) * f10), (int) (a(40) * f10), Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                a32.draw(new Canvas(bitmapCreateBitmap));
            }
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
    }

    public static final void a(TextView textView, ArrayList arrayList) {
        HashMap map = N9.f32067c;
        int paintFlags = textView.getPaintFlags();
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -1178781136) {
                if (iHashCode != -1026963764) {
                    if (iHashCode != -891985998) {
                        if (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) {
                            i10 |= 1;
                        }
                    } else if (str.equals("strike")) {
                        paintFlags |= 16;
                    }
                } else if (str.equals(TtmlNode.UNDERLINE)) {
                    paintFlags |= 8;
                }
            } else if (str.equals(TtmlNode.ITALIC)) {
                i10 |= 2;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i10);
        textView.setPaintFlags(paintFlags);
    }

    public static void a(View view, C2920o8 assetStyle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        int color = Color.parseColor("#00000000");
        try {
            color = Color.parseColor(assetStyle.a());
        } catch (IllegalArgumentException e10) {
            HashMap map = N9.f32067c;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "access$getTAG$cp(...)");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        view.setBackgroundColor(color);
        if (kotlin.jvm.internal.e0.areEqual("line", assetStyle.f33185e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            if (kotlin.jvm.internal.e0.areEqual("curved", assetStyle.f33186f)) {
                gradientDrawable.setCornerRadius(assetStyle.f33188h);
            }
            int color2 = Color.parseColor("#ff000000");
            try {
                String str = assetStyle.f33189i;
                Locale US = Locale.US;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(US, "US");
                String lowerCase = str.toLowerCase(US);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                color2 = Color.parseColor(lowerCase);
            } catch (IllegalArgumentException e11) {
                HashMap map2 = N9.f32067c;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "access$getTAG$cp(...)");
                Y5 y53 = Y5.f32563a;
                C2796h2 event2 = new C2796h2(e11);
                kotlin.jvm.internal.e0.checkNotNullParameter(event2, "event");
                Y5.f32566d.a(event2);
            }
            gradientDrawable.setStroke(1, color2);
            view.setBackground(gradientDrawable);
        }
    }

    public static final void a(View view) {
        HashMap map = N9.f32067c;
        view.setBackground(null);
    }
}
