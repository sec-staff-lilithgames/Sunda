package r8;

import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u implements k9.f {

    /* renamed from: b, reason: collision with root package name */
    public final MessageDigest f84043b;

    /* renamed from: c, reason: collision with root package name */
    public final k9.k f84044c = k9.k.newInstance();

    public u(MessageDigest messageDigest) {
        this.f84043b = messageDigest;
    }

    @Override // k9.f
    public k9.k getVerifier() {
        return this.f84044c;
    }
}
