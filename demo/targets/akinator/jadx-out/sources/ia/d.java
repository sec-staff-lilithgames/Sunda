package ia;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final f f59441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59442c;

    /* renamed from: e, reason: collision with root package name */
    public final List f59443e;

    /* renamed from: f, reason: collision with root package name */
    public int f59444f;

    public d(List list, int i10, e eVar) {
        this.f59441b = eVar;
        this.f59442c = i10;
        this.f59443e = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f59443e.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = View.inflate(context, R.layout.item_spinner_list, null);
            textView = (TextView) view.findViewById(R.id.text_view_spinner);
            textView.setTypeface(AkApplication.getTypeFace());
            c cVar = new c();
            cVar.f59440a = textView;
            view.setTag(cVar);
        } else {
            textView = ((c) view.getTag()).f59440a;
        }
        textView.setText(((e) this.f59441b).format(getItem(i10)));
        textView.setTextColor(this.f59442c);
        return view;
    }

    @Override // android.widget.Adapter
    public String getItem(int i10) {
        int i11 = this.f59444f;
        List list = this.f59443e;
        return i10 >= i11 ? (String) list.get(i10 + 1) : (String) list.get(i10);
    }
}
