package r8;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f84015a;

    public f(String str) {
        this.f84015a = str;
    }

    @Override // r8.h
    public File getCacheDirectory() {
        return new File(this.f84015a);
    }
}
