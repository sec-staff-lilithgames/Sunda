package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class v0 extends f.m implements p {

    /* renamed from: f, reason: collision with root package name */
    public v f4883f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f4884g;

    public v0(Context context) {
        this(context, 0);
    }

    @Override // f.m, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().addContentView(view, layoutParams);
    }

    public final boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x3.w.dispatchKeyEvent(this.f4884g, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().findViewById(i10);
    }

    public v getDelegate() {
        if (this.f4883f == null) {
            this.f4883f = v.create(this, this);
        }
        return this.f4883f;
    }

    public a getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // f.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // f.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // androidx.appcompat.app.p
    public o.c onWindowStartingSupportActionMode(o.b bVar) {
        return null;
    }

    @Override // f.m, android.app.Dialog
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        getDelegate().setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().requestWindowFeature(i10);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.u0] */
    public v0(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f4884g = new x3.v() { // from class: androidx.appcompat.app.u0
            @Override // x3.v
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f4873b.b(keyEvent);
            }
        };
        v delegate = getDelegate();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        delegate.setTheme(i10);
        delegate.onCreate(null);
    }

    @Override // f.m, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        getDelegate().setTitle(getContext().getString(i10));
    }

    @Override // f.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // androidx.appcompat.app.p
    public void onSupportActionModeFinished(o.c cVar) {
    }

    @Override // androidx.appcompat.app.p
    public void onSupportActionModeStarted(o.c cVar) {
    }
}
