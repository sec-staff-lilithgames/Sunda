package p8;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.security.MessageDigest;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m0 implements n8.q {

    /* renamed from: b, reason: collision with root package name */
    public final Object f80821b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80822c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80823d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f80824e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f80825f;

    /* renamed from: g, reason: collision with root package name */
    public final n8.q f80826g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f80827h;

    /* renamed from: i, reason: collision with root package name */
    public final n8.v f80828i;

    /* renamed from: j, reason: collision with root package name */
    public int f80829j;

    public m0(Object obj, n8.q qVar, int i10, int i11, Map map, Class cls, Class cls2, n8.v vVar) {
        this.f80821b = j9.q.checkNotNull(obj);
        this.f80826g = (n8.q) j9.q.checkNotNull(qVar, "Signature must not be null");
        this.f80822c = i10;
        this.f80823d = i11;
        this.f80827h = (Map) j9.q.checkNotNull(map);
        this.f80824e = (Class) j9.q.checkNotNull(cls, "Resource class must not be null");
        this.f80825f = (Class) j9.q.checkNotNull(cls2, "Transcode class must not be null");
        this.f80828i = (n8.v) j9.q.checkNotNull(vVar);
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f80821b.equals(m0Var.f80821b) && this.f80826g.equals(m0Var.f80826g) && this.f80823d == m0Var.f80823d && this.f80822c == m0Var.f80822c && this.f80827h.equals(m0Var.f80827h) && this.f80824e.equals(m0Var.f80824e) && this.f80825f.equals(m0Var.f80825f) && this.f80828i.equals(m0Var.f80828i)) {
                return true;
            }
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        if (this.f80829j == 0) {
            int iHashCode = this.f80821b.hashCode();
            this.f80829j = iHashCode;
            int iHashCode2 = ((((this.f80826g.hashCode() + (iHashCode * 31)) * 31) + this.f80822c) * 31) + this.f80823d;
            this.f80829j = iHashCode2;
            int iHashCode3 = this.f80827h.hashCode() + (iHashCode2 * 31);
            this.f80829j = iHashCode3;
            int iHashCode4 = this.f80824e.hashCode() + (iHashCode3 * 31);
            this.f80829j = iHashCode4;
            int iHashCode5 = this.f80825f.hashCode() + (iHashCode4 * 31);
            this.f80829j = iHashCode5;
            this.f80829j = this.f80828i.hashCode() + (iHashCode5 * 31);
        }
        return this.f80829j;
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "EngineKey{model=" + this.f80821b + ", width=" + this.f80822c + ", height=" + this.f80823d + ", resourceClass=" + this.f80824e + ", transcodeClass=" + this.f80825f + ", signature=" + this.f80826g + ", hashCode=" + this.f80829j + ", transformations=" + this.f80827h + TJzY.IRizG + this.f80828i + AbstractJsonLexerKt.END_OBJ;
    }
}
