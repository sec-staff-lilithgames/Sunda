package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final AlertController.a f4766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4767b;

    public l(Context context) {
        this(context, m.c(context, 0));
    }

    public m create() {
        AlertController.a aVar = this.f4766a;
        m mVar = new m(aVar.f4689a, this.f4767b);
        aVar.apply(mVar.f4769h);
        mVar.setCancelable(aVar.f4705q);
        if (aVar.f4705q) {
            mVar.setCanceledOnTouchOutside(true);
        }
        mVar.setOnCancelListener(aVar.f4706r);
        mVar.setOnDismissListener(aVar.f4707s);
        DialogInterface.OnKeyListener onKeyListener = aVar.f4708t;
        if (onKeyListener != null) {
            mVar.setOnKeyListener(onKeyListener);
        }
        return mVar;
    }

    public Context getContext() {
        return this.f4766a.f4689a;
    }

    public l setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4710v = listAdapter;
        aVar.f4711w = onClickListener;
        return this;
    }

    public l setCancelable(boolean z10) {
        this.f4766a.f4705q = z10;
        return this;
    }

    public l setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        AlertController.a aVar = this.f4766a;
        aVar.J = cursor;
        aVar.K = str;
        aVar.f4711w = onClickListener;
        return this;
    }

    public l setCustomTitle(View view) {
        this.f4766a.f4694f = view;
        return this;
    }

    public l setIcon(int i10) {
        this.f4766a.f4691c = i10;
        return this;
    }

    public l setIconAttribute(int i10) {
        TypedValue typedValue = new TypedValue();
        AlertController.a aVar = this.f4766a;
        aVar.f4689a.getTheme().resolveAttribute(i10, typedValue, true);
        aVar.f4691c = typedValue.resourceId;
        return this;
    }

    @Deprecated
    public l setInverseBackgroundForced(boolean z10) {
        this.f4766a.getClass();
        return this;
    }

    public l setItems(int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4709u = aVar.f4689a.getResources().getTextArray(i10);
        aVar.f4711w = onClickListener;
        return this;
    }

    public l setMessage(int i10) {
        AlertController.a aVar = this.f4766a;
        aVar.f4695g = aVar.f4689a.getText(i10);
        return this;
    }

    public l setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4709u = aVar.f4689a.getResources().getTextArray(i10);
        aVar.I = onMultiChoiceClickListener;
        aVar.E = zArr;
        aVar.F = true;
        return this;
    }

    public l setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4699k = aVar.f4689a.getText(i10);
        aVar.f4701m = onClickListener;
        return this;
    }

    public l setNegativeButtonIcon(Drawable drawable) {
        this.f4766a.f4700l = drawable;
        return this;
    }

    public l setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4702n = aVar.f4689a.getText(i10);
        aVar.f4704p = onClickListener;
        return this;
    }

    public l setNeutralButtonIcon(Drawable drawable) {
        this.f4766a.f4703o = drawable;
        return this;
    }

    public l setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f4766a.f4706r = onCancelListener;
        return this;
    }

    public l setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f4766a.f4707s = onDismissListener;
        return this;
    }

    public l setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f4766a.M = onItemSelectedListener;
        return this;
    }

    public l setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.f4766a.f4708t = onKeyListener;
        return this;
    }

    public l setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4696h = aVar.f4689a.getText(i10);
        aVar.f4698j = onClickListener;
        return this;
    }

    public l setPositiveButtonIcon(Drawable drawable) {
        this.f4766a.f4697i = drawable;
        return this;
    }

    public l setRecycleOnMeasureEnabled(boolean z10) {
        this.f4766a.getClass();
        return this;
    }

    public l setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4709u = aVar.f4689a.getResources().getTextArray(i10);
        aVar.f4711w = onClickListener;
        aVar.H = i11;
        aVar.G = true;
        return this;
    }

    public l setTitle(int i10) {
        AlertController.a aVar = this.f4766a;
        aVar.f4693e = aVar.f4689a.getText(i10);
        return this;
    }

    public l setView(int i10) {
        AlertController.a aVar = this.f4766a;
        aVar.f4713y = null;
        aVar.f4712x = i10;
        aVar.D = false;
        return this;
    }

    public m show() {
        m mVarCreate = create();
        mVarCreate.show();
        return mVarCreate;
    }

    public l(Context context, int i10) {
        this.f4766a = new AlertController.a(new ContextThemeWrapper(context, m.c(context, i10)));
        this.f4767b = i10;
    }

    public l setIcon(Drawable drawable) {
        this.f4766a.f4692d = drawable;
        return this;
    }

    public l setMessage(CharSequence charSequence) {
        this.f4766a.f4695g = charSequence;
        return this;
    }

    public l setTitle(CharSequence charSequence) {
        this.f4766a.f4693e = charSequence;
        return this;
    }

    public l setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4709u = charSequenceArr;
        aVar.f4711w = onClickListener;
        return this;
    }

    public l setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4699k = charSequence;
        aVar.f4701m = onClickListener;
        return this;
    }

    public l setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4702n = charSequence;
        aVar.f4704p = onClickListener;
        return this;
    }

    public l setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4696h = charSequence;
        aVar.f4698j = onClickListener;
        return this;
    }

    public l setView(View view) {
        AlertController.a aVar = this.f4766a;
        aVar.f4713y = view;
        aVar.f4712x = 0;
        aVar.D = false;
        return this;
    }

    public l setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4709u = charSequenceArr;
        aVar.I = onMultiChoiceClickListener;
        aVar.E = zArr;
        aVar.F = true;
        return this;
    }

    public l setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.J = cursor;
        aVar.f4711w = onClickListener;
        aVar.H = i10;
        aVar.K = str;
        aVar.G = true;
        return this;
    }

    @Deprecated
    public l setView(View view, int i10, int i11, int i12, int i13) {
        AlertController.a aVar = this.f4766a;
        aVar.f4713y = view;
        aVar.f4712x = 0;
        aVar.D = true;
        aVar.f4714z = i10;
        aVar.A = i11;
        aVar.B = i12;
        aVar.C = i13;
        return this;
    }

    public l setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.J = cursor;
        aVar.I = onMultiChoiceClickListener;
        aVar.L = str;
        aVar.K = str2;
        aVar.F = true;
        return this;
    }

    public l setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4709u = charSequenceArr;
        aVar.f4711w = onClickListener;
        aVar.H = i10;
        aVar.G = true;
        return this;
    }

    public l setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.a aVar = this.f4766a;
        aVar.f4710v = listAdapter;
        aVar.f4711w = onClickListener;
        aVar.H = i10;
        aVar.G = true;
        return this;
    }
}
