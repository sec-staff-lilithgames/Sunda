package io.odeeo.internal.d;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f63316a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f63317b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f63318c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f63319d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f63320e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f63321f = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.d.b$b, reason: collision with other inner class name */
    public static final class C0599b {

        /* renamed from: a, reason: collision with root package name */
        public final String f63322a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63323b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63324c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63325d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63326e;

        /* renamed from: f, reason: collision with root package name */
        public final int f63327f;

        public C0599b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f63322a = str;
            this.f63323b = i10;
            this.f63325d = i11;
            this.f63324c = i12;
            this.f63326e = i13;
            this.f63327f = i14;
        }
    }

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f63317b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f63321f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f63320e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((g0.getBigEndianInt(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static io.odeeo.internal.b.t parseAc3AnnexFFormat(io.odeeo.internal.q0.x xVar, String str, String str2, io.odeeo.internal.f.e eVar) {
        int i10 = f63317b[(xVar.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int unsignedByte = xVar.readUnsignedByte();
        int i11 = f63319d[(unsignedByte & 56) >> 3];
        if ((unsignedByte & 4) != 0) {
            i11++;
        }
        return new t.b().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i11).setSampleRate(i10).setDrmInitData(eVar).setLanguage(str2).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f63316a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    public static C0599b parseAc3SyncframeInfo(io.odeeo.internal.q0.w wVar) {
        int iA;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int bits;
        int i14;
        int i15;
        int i16;
        int i17;
        int position = wVar.getPosition();
        wVar.skipBits(40);
        boolean z10 = wVar.readBits(5) > 10;
        wVar.setPosition(position);
        int i18 = -1;
        if (z10) {
            wVar.skipBits(16);
            int bits2 = wVar.readBits(2);
            if (bits2 == 0) {
                i18 = 0;
            } else if (bits2 == 1) {
                i18 = 1;
            } else if (bits2 == 2) {
                i18 = 2;
            }
            wVar.skipBits(3);
            iA = (wVar.readBits(11) + 1) * 2;
            int bits3 = wVar.readBits(2);
            if (bits3 == 3) {
                i10 = f63318c[wVar.readBits(2)];
                i14 = 6;
                bits = 3;
            } else {
                bits = wVar.readBits(2);
                i14 = f63316a[bits];
                i10 = f63317b[bits3];
            }
            i12 = i14 * NotificationCompat.FLAG_LOCAL_ONLY;
            int bits4 = wVar.readBits(3);
            boolean bit = wVar.readBit();
            i11 = f63319d[bits4] + (bit ? 1 : 0);
            wVar.skipBits(10);
            if (wVar.readBit()) {
                wVar.skipBits(8);
            }
            if (bits4 == 0) {
                wVar.skipBits(5);
                if (wVar.readBit()) {
                    wVar.skipBits(8);
                }
            }
            if (i18 == 1 && wVar.readBit()) {
                wVar.skipBits(16);
            }
            if (wVar.readBit()) {
                if (bits4 > 2) {
                    wVar.skipBits(2);
                }
                if ((bits4 & 1) == 0 || bits4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    wVar.skipBits(6);
                }
                if ((bits4 & 4) != 0) {
                    wVar.skipBits(i16);
                }
                if (bit && wVar.readBit()) {
                    wVar.skipBits(5);
                }
                if (i18 == 0) {
                    if (wVar.readBit()) {
                        i17 = 6;
                        wVar.skipBits(6);
                    } else {
                        i17 = 6;
                    }
                    if (bits4 == 0 && wVar.readBit()) {
                        wVar.skipBits(i17);
                    }
                    if (wVar.readBit()) {
                        wVar.skipBits(i17);
                    }
                    int bits5 = wVar.readBits(2);
                    if (bits5 == 1) {
                        wVar.skipBits(5);
                    } else if (bits5 == 2) {
                        wVar.skipBits(12);
                    } else if (bits5 == 3) {
                        int bits6 = wVar.readBits(5);
                        if (wVar.readBit()) {
                            wVar.skipBits(5);
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                wVar.skipBits(4);
                            }
                            if (wVar.readBit()) {
                                if (wVar.readBit()) {
                                    wVar.skipBits(4);
                                }
                                if (wVar.readBit()) {
                                    wVar.skipBits(4);
                                }
                            }
                        }
                        if (wVar.readBit()) {
                            wVar.skipBits(5);
                            if (wVar.readBit()) {
                                wVar.skipBits(7);
                                if (wVar.readBit()) {
                                    wVar.skipBits(8);
                                }
                            }
                        }
                        wVar.skipBits((bits6 + 2) * 8);
                        wVar.byteAlign();
                    }
                    if (bits4 < 2) {
                        if (wVar.readBit()) {
                            wVar.skipBits(14);
                        }
                        if (bits4 == 0 && wVar.readBit()) {
                            wVar.skipBits(14);
                        }
                    }
                    if (wVar.readBit()) {
                        if (bits == 0) {
                            wVar.skipBits(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (wVar.readBit()) {
                                    wVar.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (wVar.readBit()) {
                wVar.skipBits(5);
                if (bits4 == 2) {
                    wVar.skipBits(4);
                }
                if (bits4 >= 6) {
                    wVar.skipBits(2);
                }
                if (wVar.readBit()) {
                    wVar.skipBits(8);
                }
                if (bits4 == 0 && wVar.readBit()) {
                    wVar.skipBits(8);
                }
                if (bits3 < 3) {
                    wVar.skipBit();
                }
            }
            if (i18 == 0 && bits != 3) {
                wVar.skipBit();
            }
            if (i18 == 2 && (bits == 3 || wVar.readBit())) {
                i15 = 6;
                wVar.skipBits(6);
            } else {
                i15 = 6;
            }
            str = (wVar.readBit() && wVar.readBits(i15) == 1 && wVar.readBits(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i13 = i18;
        } else {
            wVar.skipBits(32);
            int bits7 = wVar.readBits(2);
            String str2 = bits7 == 3 ? null : MimeTypes.AUDIO_AC3;
            iA = a(bits7, wVar.readBits(6));
            wVar.skipBits(8);
            int bits8 = wVar.readBits(3);
            if ((bits8 & 1) != 0 && bits8 != 1) {
                wVar.skipBits(2);
            }
            if ((bits8 & 4) != 0) {
                wVar.skipBits(2);
            }
            if (bits8 == 2) {
                wVar.skipBits(2);
            }
            int[] iArr = f63317b;
            i10 = bits7 < iArr.length ? iArr[bits7] : -1;
            i11 = f63319d[bits8] + (wVar.readBit() ? 1 : 0);
            i12 = 1536;
            i13 = -1;
            str = str2;
        }
        return new C0599b(str, i13, i11, i10, iA, i12);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
    }

    public static io.odeeo.internal.b.t parseEAc3AnnexFFormat(io.odeeo.internal.q0.x xVar, String str, String str2, io.odeeo.internal.f.e eVar) {
        xVar.skipBytes(2);
        int i10 = f63317b[(xVar.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int unsignedByte = xVar.readUnsignedByte();
        int i11 = f63319d[(unsignedByte & 14) >> 1];
        if ((unsignedByte & 1) != 0) {
            i11++;
        }
        if (((xVar.readUnsignedByte() & 30) >> 1) > 0 && (2 & xVar.readUnsignedByte()) != 0) {
            i11 += 2;
        }
        return new t.b().setId(str).setSampleMimeType((xVar.bytesLeft() <= 0 || (xVar.readUnsignedByte() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC).setChannelCount(i11).setSampleRate(i10).setDrmInitData(eVar).setLanguage(str2).build();
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
