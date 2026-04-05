package x4;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f91743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        e0.checkNotNullParameter(fragment, "fragment");
        this.f91743c = viewGroup;
    }

    public final ViewGroup getParentContainer() {
        return this.f91743c;
    }
}
