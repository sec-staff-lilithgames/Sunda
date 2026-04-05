package p8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 implements n8.q {

    /* renamed from: j, reason: collision with root package name */
    public static final j9.n f80903j = new j9.n(50);

    /* renamed from: b, reason: collision with root package name */
    public final q8.b f80904b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.q f80905c;

    /* renamed from: d, reason: collision with root package name */
    public final n8.q f80906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80907e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80908f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f80909g;

    /* renamed from: h, reason: collision with root package name */
    public final n8.v f80910h;

    /* renamed from: i, reason: collision with root package name */
    public final n8.z f80911i;

    public x0(q8.b bVar, n8.q qVar, n8.q qVar2, int i10, int i11, n8.z zVar, Class cls, n8.v vVar) {
        this.f80904b = bVar;
        this.f80905c = qVar;
        this.f80906d = qVar2;
        this.f80907e = i10;
        this.f80908f = i11;
        this.f80911i = zVar;
        this.f80909g = cls;
        this.f80910h = vVar;
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f80908f == x0Var.f80908f && this.f80907e == x0Var.f80907e && j9.s.bothNullOrEqual(this.f80911i, x0Var.f80911i) && this.f80909g.equals(x0Var.f80909g) && this.f80905c.equals(x0Var.f80905c) && this.f80906d.equals(x0Var.f80906d) && this.f80910h.equals(x0Var.f80910h)) {
                return true;
            }
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        int iHashCode = ((((this.f80906d.hashCode() + (this.f80905c.hashCode() * 31)) * 31) + this.f80907e) * 31) + this.f80908f;
        n8.z zVar = this.f80911i;
        if (zVar != null) {
            iHashCode = (iHashCode * 31) + zVar.hashCode();
        }
        return this.f80910h.hashCode() + ((this.f80909g.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f80905c + ", signature=" + this.f80906d + ", width=" + this.f80907e + ", height=" + this.f80908f + ", decodedResourceClass=" + this.f80909g + ", transformation='" + this.f80911i + "', options=" + this.f80910h + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        q8.b bVar = this.f80904b;
        byte[] bArr = (byte[]) bVar.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f80907e).putInt(this.f80908f).array();
        this.f80906d.updateDiskCacheKey(messageDigest);
        this.f80905c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        n8.z zVar = this.f80911i;
        if (zVar != null) {
            zVar.updateDiskCacheKey(messageDigest);
        }
        this.f80910h.updateDiskCacheKey(messageDigest);
        j9.n nVar = f80903j;
        Class cls = this.f80909g;
        byte[] bytes = (byte[]) nVar.get(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(n8.q.f75849a);
            nVar.put(cls, bytes);
        }
        messageDigest.update(bytes);
        bVar.put(bArr);
    }
}
