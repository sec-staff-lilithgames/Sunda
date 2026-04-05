package m3;

import android.content.LocusId;
import android.os.Build;
import com.google.firebase.messaging.b0;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f74004a;

    /* renamed from: b, reason: collision with root package name */
    public final LocusId f74005b;

    public e(String str) {
        this.f74004a = (String) w3.i.checkStringNotEmpty(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f74005b = b0.d(str);
        } else {
            this.f74005b = null;
        }
    }

    public static e toLocusIdCompat(LocusId locusId) {
        w3.i.checkNotNull(locusId, "locusId cannot be null");
        return new e((String) w3.i.checkStringNotEmpty(b0.k(locusId), "id cannot be empty"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        String str = ((e) obj).f74004a;
        String str2 = this.f74004a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public String getId() {
        return this.f74004a;
    }

    public int hashCode() {
        String str = this.f74004a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public LocusId toLocusId() {
        return this.f74005b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f74004a.length() + "_chars");
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }
}
