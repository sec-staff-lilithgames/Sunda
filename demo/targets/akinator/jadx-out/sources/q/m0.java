package q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements n0, DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.m f82175b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f82176c;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f82177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f82178f;

    public m0(AppCompatSpinner appCompatSpinner) {
        this.f82178f = appCompatSpinner;
    }

    @Override // q.n0
    public void dismiss() {
        androidx.appcompat.app.m mVar = this.f82175b;
        if (mVar != null) {
            mVar.dismiss();
            this.f82175b = null;
        }
    }

    @Override // q.n0
    public Drawable getBackground() {
        return null;
    }

    @Override // q.n0
    public CharSequence getHintText() {
        return this.f82177e;
    }

    @Override // q.n0
    public int getHorizontalOffset() {
        return 0;
    }

    @Override // q.n0
    public int getHorizontalOriginalOffset() {
        return 0;
    }

    @Override // q.n0
    public int getVerticalOffset() {
        return 0;
    }

    @Override // q.n0
    public boolean isShowing() {
        androidx.appcompat.app.m mVar = this.f82175b;
        if (mVar != null) {
            return mVar.isShowing();
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        AppCompatSpinner appCompatSpinner = this.f82178f;
        appCompatSpinner.setSelection(i10);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i10, this.f82176c.getItemId(i10));
        }
        dismiss();
    }

    @Override // q.n0
    public void setAdapter(ListAdapter listAdapter) {
        this.f82176c = listAdapter;
    }

    @Override // q.n0
    public void setBackgroundDrawable(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // q.n0
    public void setHorizontalOffset(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // q.n0
    public void setHorizontalOriginalOffset(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // q.n0
    public void setPromptText(CharSequence charSequence) {
        this.f82177e = charSequence;
    }

    @Override // q.n0
    public void setVerticalOffset(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // q.n0
    public void show(int i10, int i11) {
        if (this.f82176c == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f82178f;
        androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.f82177e;
        if (charSequence != null) {
            lVar.setTitle(charSequence);
        }
        androidx.appcompat.app.m mVarCreate = lVar.setSingleChoiceItems(this.f82176c, appCompatSpinner.getSelectedItemPosition(), this).create();
        this.f82175b = mVarCreate;
        ListView listView = mVarCreate.getListView();
        listView.setTextDirection(i10);
        listView.setTextAlignment(i11);
        this.f82175b.show();
    }
}
