package i9;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n8.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements q {

    /* renamed from: b, reason: collision with root package name */
    public final Object f59436b;

    public d(Object obj) {
        this.f59436b = j9.q.checkNotNull(obj);
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f59436b.equals(((d) obj).f59436b);
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        return this.f59436b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f59436b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f59436b.toString().getBytes(q.f75849a));
    }
}
