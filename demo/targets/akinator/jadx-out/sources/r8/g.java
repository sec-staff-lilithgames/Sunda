package r8;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f84016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f84017b;

    public g(String str, String str2) {
        this.f84016a = str;
        this.f84017b = str2;
    }

    @Override // r8.h
    public File getCacheDirectory() {
        return new File(this.f84016a, this.f84017b);
    }
}
