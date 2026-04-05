package jh;

import android.app.PendingIntent;
import b0.e2;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final int f69538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69540c;

    /* renamed from: d, reason: collision with root package name */
    public final long f69541d;

    /* renamed from: e, reason: collision with root package name */
    public final long f69542e;

    /* renamed from: f, reason: collision with root package name */
    public final List f69543f;

    /* renamed from: g, reason: collision with root package name */
    public final List f69544g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f69545h;

    /* renamed from: i, reason: collision with root package name */
    public final List f69546i;

    public b(int i10, int i11, int i12, long j10, long j11, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f69538a = i10;
        this.f69539b = i11;
        this.f69540c = i12;
        this.f69541d = j10;
        this.f69542e = j11;
        this.f69543f = list;
        this.f69544g = list2;
        this.f69545h = pendingIntent;
        this.f69546i = list3;
    }

    @Override // jh.a
    public final List a() {
        return this.f69544g;
    }

    @Override // jh.a
    public final List b() {
        return this.f69543f;
    }

    @Override // jh.a
    public final long bytesDownloaded() {
        return this.f69541d;
    }

    @Override // jh.a
    public final List c() {
        return this.f69546i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f69538a != aVar.sessionId() || this.f69539b != aVar.status() || this.f69540c != aVar.errorCode() || this.f69541d != aVar.bytesDownloaded() || this.f69542e != aVar.totalBytesToDownload()) {
            return false;
        }
        List list = this.f69543f;
        if (list == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!list.equals(aVar.b())) {
            return false;
        }
        List list2 = this.f69544g;
        if (list2 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!list2.equals(aVar.a())) {
            return false;
        }
        PendingIntent pendingIntent = this.f69545h;
        if (pendingIntent == null) {
            if (aVar.resolutionIntent() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(aVar.resolutionIntent())) {
            return false;
        }
        List list3 = this.f69546i;
        return list3 == null ? aVar.c() == null : list3.equals(aVar.c());
    }

    @Override // jh.a
    public final int errorCode() {
        return this.f69540c;
    }

    public final int hashCode() {
        int i10 = ((((this.f69538a ^ 1000003) * 1000003) ^ this.f69539b) * 1000003) ^ this.f69540c;
        long j10 = this.f69541d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f69542e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f69543f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f69544g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f69545h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f69546i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // jh.a
    @Deprecated
    public final PendingIntent resolutionIntent() {
        return this.f69545h;
    }

    @Override // jh.a
    public final int sessionId() {
        return this.f69538a;
    }

    @Override // jh.a
    public final int status() {
        return this.f69539b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f69543f);
        String strValueOf2 = String.valueOf(this.f69544g);
        String strValueOf3 = String.valueOf(this.f69545h);
        String strValueOf4 = String.valueOf(this.f69546i);
        StringBuilder sbF = w0.i.f(this.f69538a, this.f69539b, "SplitInstallSessionState{sessionId=", ", status=", ", errorCode=");
        sbF.append(this.f69540c);
        sbF.append(", bytesDownloaded=");
        sbF.append(this.f69541d);
        e2.A(sbF, ", totalBytesToDownload=", this.f69542e, ", moduleNamesNullable=");
        com.google.android.gms.internal.play_billing.a.B(sbF, strValueOf, ", languagesNullable=", strValueOf2, ", resolutionIntent=");
        return o2.r(sbF, strValueOf3, ", splitFileIntents=", strValueOf4, "}");
    }

    @Override // jh.a
    public final long totalBytesToDownload() {
        return this.f69542e;
    }
}
