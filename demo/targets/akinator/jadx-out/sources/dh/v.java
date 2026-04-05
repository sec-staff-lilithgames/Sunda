package dh;

import android.view.View;
import android.widget.AdapterView;
import q.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f52312b;

    public v(x xVar) {
        this.f52312b = xVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        x xVar = this.f52312b;
        j2 j2Var = xVar.f52316g;
        xVar.setText(xVar.convertSelectionToString(i10 < 0 ? j2Var.getSelectedItem() : xVar.getAdapter().getItem(i10)), false);
        AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                view = j2Var.getSelectedView();
                i10 = j2Var.getSelectedItemPosition();
                j10 = j2Var.getSelectedItemId();
            }
            onItemClickListener.onItemClick(j2Var.getListView(), view, i10, j10);
        }
        j2Var.dismiss();
    }
}
