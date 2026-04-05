package o9;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i8 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j8 f78229b;

    public i8(j8 j8Var) {
        this.f78229b = j8Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        j8 j8Var = this.f78229b;
        if (j8Var.f78274j.getSelectedItemsIndex().contains(Integer.valueOf(i10))) {
            j8Var.f78274j.removeSelectedItem(Integer.valueOf(i10));
        } else {
            j8Var.f78274j.addSelectedItem(Integer.valueOf(i10));
        }
    }
}
