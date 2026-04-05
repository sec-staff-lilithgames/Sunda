package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class e extends View {

    /* renamed from: a, reason: collision with root package name */
    protected float f13526a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f13527b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f13533a;

        a(int i10) {
            this.f13533a = i10;
        }

        public int b() {
            return this.f13533a;
        }
    }

    public e(Context context) {
        super(context);
        this.f13526a = 1.0f;
        this.f13527b = context;
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f13526a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f13526a = f10;
    }

    public static e a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new j(context);
        }
        return new n(context);
    }
}
