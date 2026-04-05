package p9;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public b f80917b;

    public final void displayFinalFragment() {
        b bVar = this.f80917b;
        if (bVar != null) {
            bVar.onAddMagicFinished();
        }
        h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
        h2VarBeginTransaction.replace(R.id.containerFragmentAddMagic, f.f80919g.newInstance());
        h2VarBeginTransaction.commit();
    }

    public final b getMCallback() {
        return this.f80917b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        e0.checkNotNullParameter(context, "context");
        super.onAttach(context);
        try {
            this.f80917b = (b) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement OnAddMagicFragmentControllerListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f80917b = null;
    }

    public final void setMCallback(b bVar) {
        this.f80917b = bVar;
    }
}
