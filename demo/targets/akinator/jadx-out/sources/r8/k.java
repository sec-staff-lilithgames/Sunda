package r8;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f84026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f84027b;

    public k(Context context, String str) {
        this.f84026a = context;
        this.f84027b = str;
    }

    @Override // r8.h
    public File getCacheDirectory() {
        File cacheDir = this.f84026a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = this.f84027b;
        return str != null ? new File(cacheDir, str) : cacheDir;
    }
}
