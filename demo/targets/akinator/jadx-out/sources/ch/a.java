package ch;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends com.google.android.material.tabs.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12301a;

    public /* synthetic */ a(int i10) {
        this.f12301a = i10;
    }

    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f12301a) {
            case 0:
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
                RectF rectFA2 = com.google.android.material.tabs.a.a(tabLayout, view2);
                if (rectFA.left < rectFA2.left) {
                    double d10 = (f10 * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d10));
                    fCos = (float) Math.sin(d10);
                } else {
                    double d11 = (f10 * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d11);
                    fCos = (float) (1.0d - Math.cos(d11));
                }
                drawable.setBounds(vf.a.lerp((int) rectFA.left, (int) rectFA2.left, fSin), drawable.getBounds().top, vf.a.lerp((int) rectFA.right, (int) rectFA2.right, fCos), drawable.getBounds().bottom);
                break;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF rectFA3 = com.google.android.material.tabs.a.a(tabLayout, view);
                float fLerp = f10 < 0.5f ? vf.a.lerp(1.0f, 0.0f, 0.0f, 0.5f, f10) : vf.a.lerp(0.0f, 1.0f, 0.5f, 1.0f, f10);
                drawable.setBounds((int) rectFA3.left, drawable.getBounds().top, (int) rectFA3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fLerp * 255.0f));
                break;
        }
    }
}
