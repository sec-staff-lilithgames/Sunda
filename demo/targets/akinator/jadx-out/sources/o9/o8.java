package o9;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o8 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f78421b;

    public o8(p8 p8Var) {
        this.f78421b = p8Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        String str = (String) adapterView.getItemAtPosition(i10);
        p8 p8Var = this.f78421b;
        p8Var.f78442c.setText(str);
        p8Var.f78445g.clear();
        p8Var.f78444f.setVisibility(8);
        p8Var.f78123b.manageNextFragment();
    }
}
