package p9;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public d f80918b;

    public final d getMCallback() {
        return this.f80918b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        e0.checkNotNullParameter(context, "context");
        super.onAttach(context);
        try {
            this.f80918b = (d) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement OnAddMagicFragmentListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f80918b = null;
    }

    public final void setMCallback(d dVar) {
        this.f80918b = dVar;
    }
}
