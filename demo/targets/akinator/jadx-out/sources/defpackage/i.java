package defpackage;

import android.content.Context;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientKt;
import io.ktor.client.engine.android.Android;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f59272a = new i();

    public final HttpClient createClient(Context context) {
        e0.checkNotNullParameter(context, "context");
        return HttpClientKt.HttpClient(Android.INSTANCE, new h(context));
    }
}
