package i9;

import java.security.MessageDigest;
import n8.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements q {

    /* renamed from: b, reason: collision with root package name */
    public static final c f59435b = new c();

    public static c obtain() {
        return f59435b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
