package x8;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p implements n8.g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f91859a = "Exif\u0000\u0000".getBytes(Charset.forName(C.UTF8_NAME));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f91860b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int a(n nVar, q8.b bVar) throws IOException {
        try {
            int uInt16 = nVar.getUInt16();
            if ((uInt16 & 65496) == 65496 || uInt16 == 19789 || uInt16 == 18761) {
                int iC = c(nVar);
                if (iC != -1) {
                    byte[] bArr = (byte[]) bVar.get(iC, byte[].class);
                    try {
                        return d(nVar, bArr, iC);
                    } finally {
                        bVar.put(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + uInt16);
                return -1;
            }
        } catch (m unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType b(n nVar) throws IOException {
        try {
            int uInt16 = nVar.getUInt16();
            if (uInt16 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | nVar.getUInt8();
            if (uInt8 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int uInt82 = (uInt8 << 8) | nVar.getUInt8();
            if (uInt82 == -1991225785) {
                nVar.skip(21L);
                try {
                    return nVar.getUInt8() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (m unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (uInt82 == 1380533830) {
                nVar.skip(4L);
                if (((nVar.getUInt16() << 16) | nVar.getUInt16()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int uInt162 = (nVar.getUInt16() << 16) | nVar.getUInt16();
                if ((uInt162 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i10 = uInt162 & 255;
                if (i10 == 88) {
                    nVar.skip(4L);
                    short uInt83 = nVar.getUInt8();
                    return (uInt83 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (uInt83 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i10 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                nVar.skip(4L);
                return (nVar.getUInt8() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((nVar.getUInt16() << 16) | nVar.getUInt16()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int uInt163 = (nVar.getUInt16() << 16) | nVar.getUInt16();
            if (uInt163 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i11 = 0;
            boolean z10 = uInt163 == 1635150182;
            nVar.skip(4L);
            int i12 = uInt82 - 16;
            if (i12 % 4 == 0) {
                while (i11 < 5 && i12 > 0) {
                    int uInt164 = (nVar.getUInt16() << 16) | nVar.getUInt16();
                    if (uInt164 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (uInt164 == 1635150182) {
                        z10 = true;
                    }
                    i11++;
                    i12 -= 4;
                }
            }
            return z10 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (m unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(x8.n r9) throws java.io.IOException {
        /*
        L0:
            short r0 = r9.getUInt8()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L18
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5e
            java.lang.String r9 = "Unknown segmentId="
            p0.o2.z(r0, r9, r4)
            return r3
        L18:
            short r0 = r9.getUInt8()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L21
            goto L5e
        L21:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L31
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5e
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L31:
            int r1 = r9.getUInt16()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L5f
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5e
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = w0.i.f(r0, r1, r5, r9, r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L5e:
            return r3
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.p.c(x8.n):int");
    }

    public static int d(n nVar, byte[] bArr, int i10) throws IOException {
        ByteOrder byteOrder;
        short s10;
        String str;
        int i11 = nVar.read(bArr, i10);
        short s11 = -1;
        if (i11 == i10) {
            int i12 = 0;
            byte[] bArr2 = f91859a;
            boolean z10 = bArr != null && i10 > bArr2.length;
            if (z10) {
                int i13 = 0;
                while (true) {
                    if (i13 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i13] != bArr2[i13]) {
                        z10 = false;
                        break;
                    }
                    i13++;
                }
            }
            if (!z10) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
            short s12 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s12 != 18761) {
                if (s12 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    o2.z(s12, "Unknown endianness = ", "DfltImageHeaderParser");
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i14 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i15 = i14 + 6;
            short s13 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : (short) -1;
            while (i12 < s13) {
                int i16 = (i12 * 12) + i14 + 8;
                short s14 = byteBuffer.remaining() - i16 >= 2 ? byteBuffer.getShort(i16) : s11;
                if (s14 != 274) {
                    s10 = s11;
                } else {
                    int i17 = i16 + 2;
                    short s15 = byteBuffer.remaining() - i17 >= 2 ? byteBuffer.getShort(i17) : s11;
                    if (s15 < 1 || s15 > 12) {
                        s10 = s11;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Got invalid format code = ";
                            o2.z(s15, str, "DfltImageHeaderParser");
                        }
                    } else {
                        int i18 = i16 + 4;
                        int i19 = byteBuffer.remaining() - i18 >= 4 ? byteBuffer.getInt(i18) : s11;
                        if (i19 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s10 = s11;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                s10 = s11;
                                StringBuilder sbF = w0.i.f(i12, s14, "Got tagIndex=", " tagType=", " formatCode=");
                                sbF.append((int) s15);
                                sbF.append(" componentCount=");
                                sbF.append(i19);
                                Log.d("DfltImageHeaderParser", sbF.toString());
                            } else {
                                s10 = s11;
                            }
                            int i20 = i19 + f91860b[s15];
                            if (i20 <= 4) {
                                int i21 = i16 + 8;
                                if (i21 < 0 || i21 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i21 + " tagType=" + ((int) s14));
                                    }
                                } else {
                                    if (i20 >= 0 && i20 + i21 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i21 >= 2 ? byteBuffer.getShort(i21) : s10;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        o2.z(s14, "Illegal number of bytes for TI tag data tagType=", "DfltImageHeaderParser");
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                o2.z(s15, str, "DfltImageHeaderParser");
                            }
                        }
                    }
                }
                i12++;
                s11 = s10;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + i11);
            return -1;
        }
        return s11;
    }

    @Override // n8.g
    public int getOrientation(InputStream inputStream, q8.b bVar) throws IOException {
        return a(new o((InputStream) j9.q.checkNotNull(inputStream)), (q8.b) j9.q.checkNotNull(bVar));
    }

    @Override // n8.g
    public ImageHeaderParser$ImageType getType(InputStream inputStream) throws IOException {
        return b(new o((InputStream) j9.q.checkNotNull(inputStream)));
    }

    @Override // n8.g
    public ImageHeaderParser$ImageType getType(ByteBuffer byteBuffer) throws IOException {
        return b(new l((ByteBuffer) j9.q.checkNotNull(byteBuffer)));
    }

    @Override // n8.g
    public int getOrientation(ByteBuffer byteBuffer, q8.b bVar) throws IOException {
        return a(new l((ByteBuffer) j9.q.checkNotNull(byteBuffer)), (q8.b) j9.q.checkNotNull(bVar));
    }
}
