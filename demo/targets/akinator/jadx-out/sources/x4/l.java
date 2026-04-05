package x4;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f91744c;

    /* renamed from: e, reason: collision with root package name */
    public final int f91745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Fragment fragment, Fragment targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        e0.checkNotNullParameter(fragment, "fragment");
        e0.checkNotNullParameter(targetFragment, "targetFragment");
        this.f91744c = targetFragment;
        this.f91745e = i10;
    }

    public final int getRequestCode() {
        return this.f91745e;
    }

    public final Fragment getTargetFragment() {
        return this.f91744c;
    }
}
