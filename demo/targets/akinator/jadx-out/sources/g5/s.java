package g5;

import android.R;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends RecyclerView.n {

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f57312c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f57313d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f57314e;

    public s(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f57312c = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.digidust.elokence.akinator.freemium.R.id.icon_frame, view.findViewById(com.digidust.elokence.akinator.freemium.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        view.getBackground();
        if (textView != null) {
            textView.getTextColors();
        }
    }

    public static s createInstanceForTests(View view) {
        return new s(view);
    }

    public View findViewById(int i10) {
        SparseArray sparseArray = this.f57312c;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i10);
        if (viewFindViewById != null) {
            sparseArray.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean isDividerAllowedAbove() {
        return this.f57313d;
    }

    public boolean isDividerAllowedBelow() {
        return this.f57314e;
    }

    public void setDividerAllowedAbove(boolean z10) {
        this.f57313d = z10;
    }

    public void setDividerAllowedBelow(boolean z10) {
        this.f57314e = z10;
    }
}
