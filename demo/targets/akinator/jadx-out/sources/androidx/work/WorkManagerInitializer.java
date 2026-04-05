package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import n6.c0;
import n6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements c6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7423a = c0.tagWithPrefix("WrkMgrInitializer");

    @Override // c6.b
    public List<Class<? extends c6.b>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // c6.b
    public y0 create(Context context) {
        c0.get().debug(f7423a, "Initializing WorkManager with default configuration.");
        y0.initialize(context, new a.C0006a().build());
        return y0.getInstance(context);
    }
}
