package qn;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f83344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f83347d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83348e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f83344a = str;
        this.f83345b = str2;
        this.f83346c = str3;
        this.f83347d = str4;
        this.f83348e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f83344a, hVar.f83344a) && Objects.equals(this.f83345b, hVar.f83345b) && Objects.equals(this.f83346c, hVar.f83346c) && Objects.equals(this.f83347d, hVar.f83347d) && Objects.equals(this.f83348e, hVar.f83348e);
    }

    public int hashCode() {
        String str = this.f83344a;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83345b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83346c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83347d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f83348e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
