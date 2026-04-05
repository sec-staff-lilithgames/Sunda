package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import com.applovin.shadow.okio.Segment;
import gv.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50210a;

    public j(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.f50210a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.q
    public String a(String fileName) throws IOException {
        e0.checkNotNullParameter(fileName, "fileName");
        InputStream inputStreamOpen = this.f50210a.getAssets().open(fileName);
        e0.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, sv.g.f86134b), Segment.SIZE);
        try {
            String text = y.readText(bufferedReader);
            gv.d.closeFinally(bufferedReader, null);
            return text;
        } finally {
        }
    }
}
