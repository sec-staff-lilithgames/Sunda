package i9;

import android.content.Context;
import android.content.pm.PackageManager;
import j9.s;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import n8.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements q {

    /* renamed from: b, reason: collision with root package name */
    public final int f59432b;

    /* renamed from: c, reason: collision with root package name */
    public final q f59433c;

    public a(int i10, q qVar) {
        this.f59432b = i10;
        this.f59433c = qVar;
    }

    public static q obtain(Context context) throws PackageManager.NameNotFoundException {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.obtain(context));
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59432b == aVar.f59432b && this.f59433c.equals(aVar.f59433c)) {
                return true;
            }
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        return s.hashCode(this.f59433c, this.f59432b);
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f59433c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f59432b).array());
    }
}
