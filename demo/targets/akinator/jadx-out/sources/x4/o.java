package x4;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f91747b;

    public /* synthetic */ o(Fragment fragment, String str, int i10, u uVar) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    public final Fragment getFragment() {
        return this.f91747b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Fragment fragment, String str) {
        super(str);
        e0.checkNotNullParameter(fragment, "fragment");
        this.f91747b = fragment;
    }
}
