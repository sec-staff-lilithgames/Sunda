package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends v0 implements DialogInterface {

    /* renamed from: h, reason: collision with root package name */
    public final AlertController f4769h;

    public m(Context context, int i10) {
        super(context, c(context, i10));
        this.f4769h = new AlertController(getContext(), this, getWindow());
    }

    public static int c(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i10) {
        return this.f4769h.getButton(i10);
    }

    public ListView getListView() {
        return this.f4769h.getListView();
    }

    @Override // androidx.appcompat.app.v0, f.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4769h.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f4769h.onKeyDown(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f4769h.onKeyUp(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setButton(int i10, CharSequence charSequence, Message message) {
        this.f4769h.setButton(i10, charSequence, null, message, null);
    }

    public void setCustomTitle(View view) {
        this.f4769h.setCustomTitle(view);
    }

    public void setIcon(int i10) {
        this.f4769h.setIcon(i10);
    }

    public void setIconAttribute(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.f4769h.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.f4769h.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.v0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f4769h.setTitle(charSequence);
    }

    public void setView(View view) {
        this.f4769h.setView(view);
    }

    public void setButton(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4769h.setButton(i10, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        this.f4769h.setIcon(drawable);
    }

    public void setView(View view, int i10, int i11, int i12, int i13) {
        this.f4769h.setView(view, i10, i11, i12, i13);
    }

    public void setButton(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f4769h.setButton(i10, charSequence, onClickListener, null, drawable);
    }
}
