package gn;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class z0 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58266c;

    public z0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f58265b = z10;
        this.f58266c = i10;
    }

    public static z0 createForMalformedContainer(String str, Throwable th2) {
        return new z0(str, th2, true, 1);
    }

    public static z0 createForMalformedDataOfUnknownType(String str, Throwable th2) {
        return new z0(str, th2, true, 0);
    }

    public static z0 createForMalformedManifest(String str, Throwable th2) {
        return new z0(str, th2, true, 4);
    }

    public static z0 createForManifestWithUnsupportedFeature(String str, Throwable th2) {
        return new z0(str, th2, false, 4);
    }

    public static z0 createForUnsupportedContainerFeature(String str) {
        return new z0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f58265b);
        sb2.append(", dataType=");
        return a.b.f(this.f58266c, "}", sb2);
    }
}
