package x4;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment) {
        super(fragment, "Attempting to set retain instance for fragment " + fragment);
        e0.checkNotNullParameter(fragment, "fragment");
    }
}
