package c7;

import c7.s;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends s.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11818a;

    public a(String str) {
        this.f11818a = str;
    }

    public final String getFileName() {
        return n0.substringAfter$default(this.f11818a, '/', (String) null, 2, (Object) null);
    }

    public final String getFilePath() {
        return this.f11818a;
    }

    @tu.f
    public static /* synthetic */ void getFileName$annotations() {
    }
}
