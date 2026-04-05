package io.odeeo.internal.w;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f67293a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67294b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67295c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f67297e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67298f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<b> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        io.odeeo.internal.q0.a.checkArgument(i11 == -1 || i11 > 0);
        this.f67293a = i10;
        this.f67294b = str;
        this.f67295c = str2;
        this.f67296d = str3;
        this.f67297e = z10;
        this.f67298f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[PHI: r6
      0x00bc: PHI (r6v1 int) = (r6v0 int), (r6v2 int), (r6v0 int) binds: [B:31:0x009d, B:39:0x00c0, B:36:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.w.b parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L33
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            int r7 = r7 * 1000
            if (r7 <= 0) goto L24
            r1 = r4
        L22:
            r9 = r7
            goto L3e
        L24:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L37
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L37
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L37
            java.lang.String r1 = r8.toString()     // Catch: java.lang.NumberFormatException -> L37
            io.odeeo.internal.q0.p.w(r3, r1)     // Catch: java.lang.NumberFormatException -> L37
        L33:
            r1 = r5
            r9 = r6
            goto L3e
        L36:
            r7 = r6
        L37:
            java.lang.String r1 = "Invalid bitrate header: "
            p0.o2.A(r1, r2, r3)
            r1 = r5
            goto L22
        L3e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L52
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L53
        L52:
            r10 = r7
        L53:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L67
        L66:
            r11 = r7
        L67:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7a
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r4
            goto L7b
        L7a:
            r12 = r7
        L7b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L94
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r13 = r1
            r1 = r4
            goto L95
        L94:
            r13 = r5
        L95:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r15 = r15.get(r2)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto Lbc
            java.lang.Object r15 = r15.get(r5)
            java.lang.String r15 = (java.lang.String) r15
            int r2 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> Lc0
            if (r2 <= 0) goto Lad
            r14 = r2
            goto Lc4
        Lad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbf
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbf
            r4.append(r15)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbf
            io.odeeo.internal.q0.p.w(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbf
        Lbc:
            r4 = r1
            r14 = r6
            goto Lc4
        Lbf:
            r6 = r2
        Lc0:
            p0.o2.A(r0, r15, r3)
            goto Lbc
        Lc4:
            if (r4 == 0) goto Lcc
            io.odeeo.internal.w.b r8 = new io.odeeo.internal.w.b
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7 = r8
        Lcc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.w.b.parse(java.util.Map):io.odeeo.internal.w.b");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f67293a == bVar.f67293a && g0.areEqual(this.f67294b, bVar.f67294b) && g0.areEqual(this.f67295c, bVar.f67295c) && g0.areEqual(this.f67296d, bVar.f67296d) && this.f67297e == bVar.f67297e && this.f67298f == bVar.f67298f) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ t getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        int i10 = (this.f67293a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f67294b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67295c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67296d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f67297e ? 1 : 0)) * 31) + this.f67298f;
    }

    @Override // io.odeeo.internal.s.a.b
    public void populateMediaMetadata(a0.b bVar) {
        String str = this.f67295c;
        if (str != null) {
            bVar.setStation(str);
        }
        String str2 = this.f67294b;
        if (str2 != null) {
            bVar.setGenre(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f67295c + "\", genre=\"" + this.f67294b + "\", bitrate=" + this.f67293a + ", metadataInterval=" + this.f67298f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f67293a);
        parcel.writeString(this.f67294b);
        parcel.writeString(this.f67295c);
        parcel.writeString(this.f67296d);
        g0.writeBoolean(parcel, this.f67297e);
        parcel.writeInt(this.f67298f);
    }

    public b(Parcel parcel) {
        this.f67293a = parcel.readInt();
        this.f67294b = parcel.readString();
        this.f67295c = parcel.readString();
        this.f67296d = parcel.readString();
        this.f67297e = g0.readBoolean(parcel);
        this.f67298f = parcel.readInt();
    }
}
