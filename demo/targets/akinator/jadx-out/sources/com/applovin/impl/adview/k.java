package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.b2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final b2 f13550a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13551b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a();

        void onFailure();
    }

    public k(b2 b2Var, Context context) {
        super(context);
        this.f13550a = b2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f13551b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f13550a.b();
    }

    public void a(a aVar) {
        if (this.f13551b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f13550a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(drawableA);
            this.f13551b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
