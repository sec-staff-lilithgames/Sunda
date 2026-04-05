package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f4744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.a f4745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AlertController.a aVar, Context context, int i10, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i10, R.id.text1, charSequenceArr);
        this.f4745c = aVar;
        this.f4744b = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        boolean[] zArr = this.f4745c.E;
        if (zArr != null && zArr[i10]) {
            this.f4744b.setItemChecked(i10, true);
        }
        return view2;
    }
}
