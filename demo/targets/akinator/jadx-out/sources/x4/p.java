package x4;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f91748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Fragment fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        e0.checkNotNullParameter(fragment, "fragment");
        e0.checkNotNullParameter(container, "container");
        this.f91748c = container;
    }

    public final ViewGroup getContainer() {
        return this.f91748c;
    }
}
