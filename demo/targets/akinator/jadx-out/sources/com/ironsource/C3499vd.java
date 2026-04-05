package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3499vd {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39129a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.vd$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final View a(Context context, String str, X8 imageLoader) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(imageLoader, "imageLoader");
            if (str == null) {
                return a(context);
            }
            Object objA = imageLoader.a(str);
            if (tu.z.m7136isFailureimpl(objA)) {
                objA = null;
            }
            Drawable drawable = (Drawable) objA;
            if (drawable == null) {
                return a(context);
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }

        private a() {
        }

        private static final GradientDrawable a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }
    }
}
