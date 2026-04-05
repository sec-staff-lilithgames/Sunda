package m7;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static final <T extends View> p create(T t10) {
        return create$default(t10, false, 2, null);
    }

    public static /* synthetic */ p create$default(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return create(view, z10);
    }

    public static final <T extends View> p create(T t10, boolean z10) {
        return new h(t10, z10);
    }
}
