package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5150b;

    public j(k kVar) {
        this.f5150b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ((k.a) view).getTab().select();
        k kVar = this.f5150b;
        int childCount = kVar.f5154e.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kVar.f5154e.getChildAt(i10);
            childAt.setSelected(childAt == view);
        }
    }
}
