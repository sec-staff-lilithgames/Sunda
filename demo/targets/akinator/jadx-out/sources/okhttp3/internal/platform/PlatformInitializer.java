package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PlatformInitializer implements c6.b {
    @Override // c6.b
    public List<Class<c6.b>> dependencies() {
        return p0.emptyList();
    }

    @Override // c6.b
    public c create(Context context) {
        e0.checkNotNullParameter(context, "context");
        d.f79518a.setApplicationContext(context);
        return c.f79515a.get();
    }
}
