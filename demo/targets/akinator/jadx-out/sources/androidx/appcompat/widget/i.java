package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5149b;

    public i(k kVar) {
        this.f5149b = kVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5149b.f5154e.getChildCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return ((k.a) this.f5149b.f5154e.getChildAt(i10)).getTab();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            return this.f5149b.a((a.b) getItem(i10), true);
        }
        ((k.a) view).bindTab((a.b) getItem(i10));
        return view;
    }
}
