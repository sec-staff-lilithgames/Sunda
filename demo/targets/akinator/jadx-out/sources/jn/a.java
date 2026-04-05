package jn;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f69709a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f69710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69712d;

    public a(String str, byte[] bArr, int i10) {
        this(str, bArr, 0, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f69709a.equals(aVar.f69709a) && Arrays.equals(this.f69710b, aVar.f69710b) && this.f69711c == aVar.f69711c && this.f69712d == aVar.f69712d) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        io.bidmachine.media3.common.util.a.checkState(this.f69709a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.f69710b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
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
        return ((((Arrays.hashCode(this.f69710b) + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f69709a)) * 31) + this.f69711c) * 31) + this.f69712d;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f69709a
            byte[] r1 = r4.f69710b
            int r2 = r4.f69712d
            if (r2 == 0) goto L4f
            r3 = 1
            if (r2 == r3) goto L4a
            r3 = 23
            if (r2 == r3) goto L3d
            r3 = 67
            if (r2 == r3) goto L34
            r3 = 75
            if (r2 == r3) goto L2a
            r3 = 78
            if (r2 == r3) goto L1c
            goto L6f
        L1c:
            io.bidmachine.media3.common.util.m0 r2 = new io.bidmachine.media3.common.util.m0
            r2.<init>(r1)
            long r1 = r2.readUnsignedLongToLong()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L73
        L2a:
            r2 = 0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L73
        L34:
            int r1 = rh.w.fromByteArray(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L73
        L3d:
            int r1 = rh.w.fromByteArray(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L73
        L4a:
            java.lang.String r1 = io.bidmachine.media3.common.util.a1.fromUtf8Bytes(r1)
            goto L73
        L4f:
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L6f
            java.util.List r1 = r4.getAuxiliaryTrackTypesFromMap()
            java.lang.String r2 = "track types = "
            java.lang.StringBuilder r2 = p0.o2.u(r2)
            r3 = 44
            mh.d1 r3 = mh.d1.on(r3)
            r3.appendTo(r2, r1)
            java.lang.String r1 = r2.toString()
            goto L73
        L6f:
            java.lang.String r1 = io.bidmachine.media3.common.util.a1.toHexString(r1)
        L73:
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = a.b.m(r2, r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.a.toString():java.lang.String");
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                io.bidmachine.media3.common.util.a.checkArgument(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                io.bidmachine.media3.common.util.a.checkArgument(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                io.bidmachine.media3.common.util.a.checkArgument(z10);
                break;
            case "auxiliary.tracks.map":
                io.bidmachine.media3.common.util.a.checkArgument(i11 == 0);
                break;
        }
        this.f69709a = str;
        this.f69710b = bArr;
        this.f69711c = i10;
        this.f69712d = i11;
    }
}
