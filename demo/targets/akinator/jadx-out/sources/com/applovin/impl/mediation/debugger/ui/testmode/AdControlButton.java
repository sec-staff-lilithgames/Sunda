package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.m0;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final GradientDrawable f14651a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f14652b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a f14653c;

    /* renamed from: d, reason: collision with root package name */
    private b f14654d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdFormat f14655e;

    /* renamed from: f, reason: collision with root package name */
    private a f14656f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        return b.LOAD == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : b.LOADING == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : m0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f14653c.a();
        } else {
            setEnabled(true);
            this.f14653c.b();
        }
        this.f14652b.setText(b(bVar));
        this.f14651a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f14654d;
    }

    public MaxAdFormat getFormat() {
        return this.f14655e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f14656f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f14654d != bVar) {
            c(bVar);
        }
        this.f14654d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f14655e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f14656f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f14651a = gradientDrawable;
        Button button = new Button(getContext());
        this.f14652b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f14653c = aVar;
        b bVar = b.LOAD;
        this.f14654d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f14652b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{m0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
