package f1;

import android.view.ViewStructure;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f55284a = new e();

    public final int addChildCount(ViewStructure structure, int i10) {
        e0.checkNotNullParameter(structure, "structure");
        return structure.addChildCount(i10);
    }

    public final ViewStructure newChild(ViewStructure structure, int i10) {
        e0.checkNotNullParameter(structure, "structure");
        return structure.newChild(i10);
    }

    public final void setDimens(ViewStructure structure, int i10, int i11, int i12, int i13, int i14, int i15) {
        e0.checkNotNullParameter(structure, "structure");
        structure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public final void setId(ViewStructure structure, int i10, String str, String str2, String str3) {
        e0.checkNotNullParameter(structure, "structure");
        structure.setId(i10, str, str2, str3);
    }
}
