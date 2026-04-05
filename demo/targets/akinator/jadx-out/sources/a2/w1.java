package a2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements x4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3870a;

    public w1(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f3870a = context;
    }

    @Override // a2.x4
    public void openUri(String uri) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
        this.f3870a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
    }
}
