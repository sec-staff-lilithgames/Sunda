package tn;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import gn.r0;
import gn.t0;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f87311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87312b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87313c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f87314a;

        /* renamed from: b, reason: collision with root package name */
        public final int f87315b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87316c;

        /* renamed from: d, reason: collision with root package name */
        public final String f87317d;

        /* renamed from: e, reason: collision with root package name */
        public final String f87318e;

        /* renamed from: f, reason: collision with root package name */
        public final String f87319f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f87314a = i10;
            this.f87315b = i11;
            this.f87316c = str;
            this.f87317d = str2;
            this.f87318e = str3;
            this.f87319f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f87314a == aVar.f87314a && this.f87315b == aVar.f87315b && TextUtils.equals(this.f87316c, aVar.f87316c) && TextUtils.equals(this.f87317d, aVar.f87317d) && TextUtils.equals(this.f87318e, aVar.f87318e) && TextUtils.equals(this.f87319f, aVar.f87319f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f87314a * 31) + this.f87315b) * 31;
            String str = this.f87316c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f87317d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f87318e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f87319f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public t(String str, String str2, List<a> list) {
        this.f87311a = str;
        this.f87312b = str2;
        this.f87313c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f87311a, tVar.f87311a) && TextUtils.equals(this.f87312b, tVar.f87312b) && this.f87313c.equals(tVar.f87313c)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        String str = this.f87311a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87312b;
        return this.f87313c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f87311a;
        sb2.append(str != null ? o2.o(e3.g.o(" [", str, ", "), this.f87312b, C3191e4.i.f36531e) : "");
        return sb2.toString();
    }
}
