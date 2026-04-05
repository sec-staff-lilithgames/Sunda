package p8;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements n8.q {

    /* renamed from: b, reason: collision with root package name */
    public final n8.q f80771b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.q f80772c;

    public h(n8.q qVar, n8.q qVar2) {
        this.f80771b = qVar;
        this.f80772c = qVar2;
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f80771b.equals(hVar.f80771b) && this.f80772c.equals(hVar.f80772c)) {
                return true;
            }
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        return this.f80772c.hashCode() + (this.f80771b.hashCode() * 31);
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f80771b + ", signature=" + this.f80772c + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f80771b.updateDiskCacheKey(messageDigest);
        this.f80772c.updateDiskCacheKey(messageDigest);
    }
}
