package mj;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f74736a;

    /* renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f74737b;

    public a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f74736a = viewGroup;
        this.f74737b = onClickListener;
    }

    public Boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f74737b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f74736a);
        return Boolean.TRUE;
    }
}
