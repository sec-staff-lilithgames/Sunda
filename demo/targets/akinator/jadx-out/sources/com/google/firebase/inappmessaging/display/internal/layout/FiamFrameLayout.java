package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import lj.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FiamFrameLayout extends FrameLayout implements a {

    /* renamed from: b, reason: collision with root package name */
    public mj.a f29697b;

    public FiamFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolDispatchKeyEvent = this.f29697b.dispatchKeyEvent(keyEvent);
        return boolDispatchKeyEvent != null ? boolDispatchKeyEvent.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    @Override // lj.a
    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f29697b = new mj.a(this, onClickListener);
    }

    public FiamFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FiamFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public FiamFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
