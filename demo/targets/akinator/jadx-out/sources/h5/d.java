package h5;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f58699a = new d();

    public final <T> T getManager(Context context, String tag, l manager) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(manager, "manager");
        try {
            return (T) manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + c.f58698a.extServicesVersionS());
            return null;
        }
    }
}
