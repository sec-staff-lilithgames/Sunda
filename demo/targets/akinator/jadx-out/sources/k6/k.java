package k6;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f70608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70610c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70611d;

    /* renamed from: e, reason: collision with root package name */
    public final String f70612e;

    /* renamed from: f, reason: collision with root package name */
    public final String f70613f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f70614g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70615h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f70616i;

    public k(List list, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, boolean z11) {
        this.f70608a = list;
        this.f70609b = str;
        this.f70610c = str2;
        this.f70611d = str3;
        this.f70612e = str4;
        this.f70613f = str5;
        this.f70614g = z10;
        this.f70615h = i10;
        this.f70616i = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f70614g == kVar.f70614g && this.f70615h == kVar.f70615h && this.f70616i == kVar.f70616i && Objects.equals(this.f70608a, kVar.f70608a) && Objects.equals(this.f70609b, kVar.f70609b) && Objects.equals(this.f70610c, kVar.f70610c) && Objects.equals(this.f70611d, kVar.f70611d) && Objects.equals(this.f70612e, kVar.f70612e) && Objects.equals(this.f70613f, kVar.f70613f);
    }

    public String getArchitecture() {
        return this.f70612e;
    }

    public int getBitness() {
        return this.f70615h;
    }

    public List<i> getBrandVersionList() {
        return this.f70608a;
    }

    public String getFullVersion() {
        return this.f70609b;
    }

    public String getModel() {
        return this.f70613f;
    }

    public String getPlatform() {
        return this.f70610c;
    }

    public String getPlatformVersion() {
        return this.f70611d;
    }

    public int hashCode() {
        return Objects.hash(this.f70608a, this.f70609b, this.f70610c, this.f70611d, this.f70612e, this.f70613f, Boolean.valueOf(this.f70614g), Integer.valueOf(this.f70615h), Boolean.valueOf(this.f70616i));
    }

    public boolean isMobile() {
        return this.f70614g;
    }

    public boolean isWow64() {
        return this.f70616i;
    }
}
