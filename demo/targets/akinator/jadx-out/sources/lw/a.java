package lw;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import pw.b1;
import pw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f73625f;

    /* renamed from: e, reason: collision with root package name */
    public final String f73626e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: lw.a$a, reason: collision with other inner class name */
    public static final class C0746a {
        public C0746a(u uVar) {
        }

        public final String getPUBLIC_SUFFIX_RESOURCE() {
            return a.f73625f;
        }
    }

    static {
        new C0746a(null);
        f73625f = "PublicSuffixDatabase.list";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // lw.b
    public b1 listSource() throws IOException {
        AssetManager assets;
        Context applicationContext = okhttp3.internal.platform.d.f79518a.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(getPath());
        e0.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return h0.source(inputStreamOpen);
    }

    public /* synthetic */ a(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? f73625f : str);
    }

    @Override // lw.b
    public String getPath() {
        return this.f73626e;
    }

    public a(String path) {
        e0.checkNotNullParameter(path, "path");
        this.f73626e = path;
    }
}
