package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements View.OnLayoutChangeListener {

        /* renamed from: jd, reason: collision with root package name */
        private int f21504jd;
        private final Drawable jpo;
        private int wqx;

        public jpo(Drawable drawable) {
            this.jpo = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.f21504jd && i19 == this.wqx) {
                return;
            }
            this.f21504jd = i18;
            this.wqx = i19;
            this.jpo.setBounds(0, 0, i18, i19);
        }
    }

    public static void jpo(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (viewGroup == null || dtVar == null || TextUtils.isEmpty(dtVar.nq())) {
            return;
        }
        try {
            int i10 = hna.gum;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableJpo = jpo(viewGroup.getResources(), dtVar);
            if (drawableJpo == null) {
                return;
            }
            viewGroup.setForeground(drawableJpo);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("add overlay fail", th2.getMessage());
        }
    }

    public static void jpo(Activity activity, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (activity == null || dtVar == null || TextUtils.isEmpty(dtVar.nq())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = hna.gum;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableJpo = jpo(activity.getResources(), dtVar);
            if (drawableJpo == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableJpo);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("add overlay fail", th2.getMessage());
        }
    }

    private static Drawable jpo(Resources resources, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        try {
            String strNq = dtVar.nq();
            if (TextUtils.isEmpty(strNq)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strNq, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
