package u3;

import android.util.Base64;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f87791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87792b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87793c;

    /* renamed from: d, reason: collision with root package name */
    public final List f87794d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87795e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87796f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87797g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87798h;

    public g(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        return o2.r(sb2, "-", str4, "-", str5);
    }

    public List<List<byte[]>> getCertificates() {
        return this.f87794d;
    }

    public int getCertificatesArrayResId() {
        return this.f87795e;
    }

    @Deprecated
    public String getIdentifier() {
        return this.f87798h;
    }

    public String getProviderAuthority() {
        return this.f87791a;
    }

    public String getProviderPackage() {
        return this.f87792b;
    }

    public String getQuery() {
        return this.f87793c;
    }

    public String getSystemFont() {
        return this.f87796f;
    }

    public String getVariationSettings() {
        return this.f87797g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f87791a + ", mProviderPackage: " + this.f87792b + ", mQuery: " + this.f87793c + ", mSystemFont: " + this.f87796f + ", mVariationSettings: " + this.f87797g + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f87794d;
            if (i10 >= list.size()) {
                sb2.append("}");
                sb2.append("mCertificatesArray: " + this.f87795e);
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }

    public g(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f87791a = (String) w3.i.checkNotNull(str);
        this.f87792b = (String) w3.i.checkNotNull(str2);
        this.f87793c = (String) w3.i.checkNotNull(str3);
        this.f87794d = (List) w3.i.checkNotNull(list);
        this.f87795e = 0;
        this.f87796f = str4;
        this.f87797g = str5;
        this.f87798h = a(str, str2, str3, str4, str5);
    }

    public g(String str, String str2, String str3, int i10) {
        this.f87791a = (String) w3.i.checkNotNull(str);
        this.f87792b = (String) w3.i.checkNotNull(str2);
        this.f87793c = (String) w3.i.checkNotNull(str3);
        this.f87794d = null;
        w3.i.checkArgument(i10 != 0);
        this.f87795e = i10;
        this.f87796f = null;
        this.f87797g = null;
        this.f87798h = a(str, str2, str3, null, null);
    }
}
