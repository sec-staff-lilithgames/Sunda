package ij;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import hj.s;
import hj.t;
import java.util.Map;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final o f59626a;

    /* renamed from: b, reason: collision with root package name */
    public final s f59627b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f59628c;

    public c(s sVar, LayoutInflater layoutInflater, o oVar) {
        this.f59627b = sVar;
        this.f59628c = layoutInflater;
        this.f59626a = oVar;
    }

    public static void a(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            t.loge("Error parsing background color: " + e10.toString() + " color: " + str);
        }
    }

    public static void setButtonBgColorFromHex(Button button, String str) {
        try {
            Drawable drawableWrap = p3.a.wrap(button.getBackground());
            p3.a.setTint(drawableWrap, Color.parseColor(str));
            button.setBackground(drawableWrap);
        } catch (IllegalArgumentException e10) {
            t.loge("Error parsing background color: " + e10.toString());
        }
    }

    public static void setupViewButtonFromModel(Button button, rj.h hVar) {
        String hexColor = hVar.getText().getHexColor();
        setButtonBgColorFromHex(button, hVar.getButtonHexColor());
        button.setText(hVar.getText().getText());
        button.setTextColor(Color.parseColor(hexColor));
    }

    public boolean canSwipeToDismiss() {
        return false;
    }

    public s getConfig() {
        return this.f59627b;
    }

    public abstract View getDialogView();

    public View.OnClickListener getDismissListener() {
        return null;
    }

    public abstract ImageView getImageView();

    public abstract ViewGroup getRootView();

    public abstract ViewTreeObserver.OnGlobalLayoutListener inflate(Map<rj.b, View.OnClickListener> map, View.OnClickListener onClickListener);
}
