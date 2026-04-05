package x3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f91708d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f91709a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f91710b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f91711c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f91709a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
