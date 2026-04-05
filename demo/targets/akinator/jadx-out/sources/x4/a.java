package x4;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: c, reason: collision with root package name */
    public final String f91729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        e0.checkNotNullParameter(fragment, "fragment");
        e0.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.f91729c = previousFragmentId;
    }

    public final String getPreviousFragmentId() {
        return this.f91729c;
    }
}
