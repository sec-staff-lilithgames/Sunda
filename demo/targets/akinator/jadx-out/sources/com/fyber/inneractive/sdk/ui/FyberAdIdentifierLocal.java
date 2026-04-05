package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.network.w0;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class FyberAdIdentifierLocal extends IFyberAdIdentifier implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public ImageView f26711m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f26712n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26713o;

    /* renamed from: p, reason: collision with root package name */
    public Animator f26714p;

    /* renamed from: q, reason: collision with root package name */
    public float f26715q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f26716r;

    public FyberAdIdentifierLocal(r rVar) {
        super(rVar);
        this.f26713o = false;
        this.f26715q = 0.0f;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier
    public final void a(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ia_identifier_overlay);
        int i10 = 0;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(R.layout.ia_layout_fyber_ad_identifier, viewGroup2, false);
        this.f26711m = (ImageView) viewGroup3.findViewById(R.id.ia_fyber_identifier_image);
        TextView textView = (TextView) viewGroup3.findViewById(R.id.ia_fyber_identifier_text);
        this.f26712n = textView;
        if (this.f26732j) {
            int i11 = this.f26724b;
            int i12 = this.f26725c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = o.b(i11);
                textView.getLayoutParams().height = o.b(i12);
            }
            ImageView imageView = this.f26711m;
            int i13 = this.f26726d;
            int i14 = this.f26727e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = o.b(i13);
                imageView.getLayoutParams().height = o.b(i14);
            }
            TextView textView2 = this.f26712n;
            int i15 = this.f26728f;
            if (textView2 != null) {
                textView2.setTextSize(i15);
            }
            a(this.f26711m, this.f26729g);
            this.f26712n.setOnClickListener(this);
            this.f26712n.setText(this.f26730h);
            String str = this.f26731i;
            if (!TextUtils.isEmpty(str)) {
                IAConfigManager.O.f23224s.a(new w0(new b(this), viewGroup2.getContext(), new com.fyber.inneractive.sdk.cache.b(str)));
            }
        }
        IFyberAdIdentifier.Corner corner = this.f26733k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup3.removeView(this.f26712n);
            viewGroup3.addView(this.f26712n);
            viewGroup3.setLayoutDirection(0);
        }
        viewGroup3.addOnLayoutChangeListener(new c(this));
        this.f26711m.setOnClickListener(this);
        a();
        viewGroup2.addView(viewGroup3);
        IFyberAdIdentifier.Corner corner2 = this.f26733k;
        corner2.getClass();
        int i16 = j.f26747a[corner2.ordinal()];
        if (i16 == 1) {
            i10 = 51;
        } else if (i16 == 2) {
            i10 = 53;
        } else if (i16 == 3) {
            i10 = 83;
        } else if (i16 == 4) {
            i10 = 85;
        }
        o.a(viewGroup3, i10);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.f26711m) {
            if (view == this.f26712n && this.f26734l == com.fyber.inneractive.sdk.config.global.features.a.OPEN) {
                a();
                IFyberAdIdentifier.ClickListener clickListener = this.f26723a;
                if (clickListener != null) {
                    clickListener.a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f26714p != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = this.f26711m;
        Property property = View.ROTATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 90.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f26711m, "imageAlpha", 255, 25);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        animatorSet2.addListener(new d(this, animatorSet));
        animatorSet2.setDuration(225L);
        this.f26714p = animatorSet2;
        animatorSet2.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f26711m, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f26711m, "imageAlpha", 25, 255);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfInt2);
        animatorSet3.setDuration(225L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f26712n, (Property<TextView, Float>) View.TRANSLATION_X, this.f26713o ? this.f26715q : 0.0f);
        objectAnimatorOfFloat3.setDuration(450L);
        animatorSet.setDuration(450L);
        animatorSet.playTogether(objectAnimatorOfFloat3, animatorSet3);
        animatorSet.addListener(new e(this));
    }

    public final void a() {
        this.f26713o = false;
        this.f26711m.setImageResource(R.drawable.ia_fyber_info_button);
        a(this.f26711m, this.f26729g);
        Animator animator = this.f26714p;
        if (animator != null) {
            animator.removeAllListeners();
            this.f26714p = null;
        }
    }

    public static void a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                com.fyber.inneractive.sdk.widget.a.a(imageView, ColorStateList.valueOf(Color.parseColor(str)));
                return;
            } catch (Exception unused) {
                IAlog.f("could not parse color %s", str);
                return;
            }
        }
        com.fyber.inneractive.sdk.widget.a.a(imageView, null);
    }
}
