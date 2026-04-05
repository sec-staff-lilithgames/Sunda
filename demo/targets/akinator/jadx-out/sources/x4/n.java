package x4;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n extends o {
    public /* synthetic */ n(Fragment fragment, String str, int i10, u uVar) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Fragment fragment, String str) {
        super(fragment, str);
        e0.checkNotNullParameter(fragment, "fragment");
    }
}
