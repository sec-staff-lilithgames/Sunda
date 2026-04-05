package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W8 implements X8 {

    /* renamed from: a, reason: collision with root package name */
    private final X3 f35686a;

    /* JADX WARN: Multi-variable type inference failed */
    public W8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("file does not exists")));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        if (drawableCreateFromPath != null) {
            return tu.z.m7131constructorimpl(drawableCreateFromPath);
        }
        int i11 = tu.z.f87419c;
        return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("failed to create a drawable")));
    }

    private final Object c(String str) {
        InputStream inputStreamA = this.f35686a.a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamA, new File(str).getName());
            gv.d.closeFinally(inputStreamA, null);
            if (drawableCreateFromStream != null) {
                return tu.z.m7131constructorimpl(drawableCreateFromStream);
            }
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("failed to create a drawable")));
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.X8
    public Object a(String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(e10));
        }
    }

    public W8(X3 connectionFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f35686a = connectionFactory;
    }

    public /* synthetic */ W8(X3 x32, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? L4.f34800a : x32);
    }
}
