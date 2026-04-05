package a7;

import android.content.Context;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    public static final m create(Context context) {
        return new l(context).build();
    }

    public static final l7.k executeBlocking(m mVar, l7.i iVar) {
        return (l7.k) BuildersKt__BuildersKt.runBlocking$default(null, new o(mVar, iVar, null), 1, null);
    }
}
