package as;

import as.j;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements c {

    /* renamed from: b, reason: collision with root package name */
    public final pw.k f7981b;

    /* renamed from: c, reason: collision with root package name */
    public final j.a f7982c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7983e;

    /* renamed from: f, reason: collision with root package name */
    public final g f7984f;

    public l(pw.k kVar, boolean z10) {
        this.f7981b = kVar;
        this.f7983e = z10;
        j.a aVar = new j.a(kVar);
        this.f7982c = aVar;
        this.f7984f = new g(aVar);
    }

    public final List a(int i10, short s10, byte b10, int i11) throws IOException {
        j.a aVar = this.f7982c;
        aVar.f7976g = i10;
        aVar.f7973c = i10;
        aVar.f7977h = s10;
        aVar.f7974e = b10;
        aVar.f7975f = i11;
        g gVar = this.f7984f;
        pw.k kVar = gVar.f7955b;
        ArrayList arrayList = gVar.f7954a;
        while (!kVar.exhausted()) {
            byte b11 = kVar.readByte();
            int i12 = b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 == 128) {
                throw new IOException("index == 0");
            }
            if ((b11 & 128) == 128) {
                int iE = gVar.e(i12, 127);
                int i13 = iE - 1;
                if (i13 >= 0) {
                    e[] eVarArr = i.f7968b;
                    if (i13 <= eVarArr.length - 1) {
                        arrayList.add(eVarArr[i13]);
                    }
                }
                int length = gVar.f7959f + 1 + (i13 - i.f7968b.length);
                if (length >= 0) {
                    e[] eVarArr2 = gVar.f7958e;
                    if (length <= eVarArr2.length - 1) {
                        arrayList.add(eVarArr2[length]);
                    }
                }
                throw new IOException(a.b.e(iE, "Header index too large "));
            }
            if (i12 == 64) {
                pw.l lVarD = gVar.d();
                i.a(lVarD);
                gVar.c(new e(lVarD, gVar.d()));
            } else if ((b11 & 64) == 64) {
                gVar.c(new e(gVar.b(gVar.e(i12, 63) - 1), gVar.d()));
            } else if ((b11 & 32) == 32) {
                int iE2 = gVar.e(i12, 31);
                gVar.f7957d = iE2;
                if (iE2 < 0 || iE2 > gVar.f7956c) {
                    throw new IOException("Invalid dynamic table size update " + gVar.f7957d);
                }
                int i14 = gVar.f7961h;
                if (iE2 < i14) {
                    if (iE2 == 0) {
                        Arrays.fill(gVar.f7958e, (Object) null);
                        gVar.f7959f = gVar.f7958e.length - 1;
                        gVar.f7960g = 0;
                        gVar.f7961h = 0;
                    } else {
                        gVar.a(i14 - iE2);
                    }
                }
            } else if (i12 == 16 || i12 == 0) {
                pw.l lVarD2 = gVar.d();
                i.a(lVarD2);
                arrayList.add(new e(lVarD2, gVar.d()));
            } else {
                arrayList.add(new e(gVar.b(gVar.e(i12, 15) - 1), gVar.d()));
            }
        }
        return gVar.getAndResetHeaderList();
    }

    public final void b(b bVar, int i10) throws IOException {
        pw.k kVar = this.f7981b;
        int i11 = kVar.readInt();
        bVar.priority(i10, i11 & Integer.MAX_VALUE, (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7981b.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // as.c
    public boolean nextFrame(b bVar) throws Throwable {
        Throwable th2;
        boolean z10;
        pw.k kVar = this.f7981b;
        try {
            kVar.require(9L);
            int iA = j.a(kVar);
            if (iA < 0 || iA > 16384) {
                j.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte b10 = (byte) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            byte b11 = (byte) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            int i10 = kVar.readInt() & Integer.MAX_VALUE;
            Logger logger = j.f7970a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(k.a(true, i10, iA, b10, b11));
            }
            switch (b10) {
                case 0:
                    if ((b11 & 1) != 0) {
                        th2 = null;
                        z10 = true;
                    } else {
                        th2 = null;
                        z10 = false;
                    }
                    if ((b11 & 32) != 0) {
                        j.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw th2;
                    }
                    short s10 = (b11 & 8) != 0 ? (short) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
                    bVar.data(z10, i10, this.f7981b, j.b(iA, b11, s10), iA);
                    kVar.skip(s10);
                    return true;
                case 1:
                    if (i10 == 0) {
                        j.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z11 = (b11 & 1) != 0;
                    short s11 = (b11 & 8) != 0 ? (short) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
                    if ((b11 & 32) != 0) {
                        b(bVar, i10);
                        iA -= 5;
                    }
                    bVar.headers(false, z11, i10, -1, a(j.b(iA, b11, s11), s11, b11, i10), f.f7952f);
                    return true;
                case 2:
                    if (iA != 5) {
                        j.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i10 != 0) {
                        b(bVar, i10);
                        return true;
                    }
                    j.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                    throw null;
                case 3:
                    if (iA != 4) {
                        j.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i10 == 0) {
                        j.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i11 = kVar.readInt();
                    a aVarFromHttp2 = a.fromHttp2(i11);
                    if (aVarFromHttp2 != null) {
                        bVar.rstStream(i10, aVarFromHttp2);
                        return true;
                    }
                    j.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i11));
                    throw null;
                case 4:
                    if (i10 != 0) {
                        j.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b11 & 1) != 0) {
                        if (iA == 0) {
                            bVar.ackSettings();
                            return true;
                        }
                        j.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    if (iA % 6 != 0) {
                        j.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    p pVar = new p();
                    for (int i12 = 0; i12 < iA; i12 += 6) {
                        short s12 = kVar.readShort();
                        int i13 = kVar.readInt();
                        switch (s12) {
                            case 1:
                            case 6:
                                pVar.set(s12, 0, i13);
                            case 2:
                                if (i13 != 0 && i13 != 1) {
                                    j.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                                pVar.set(s12, 0, i13);
                            case 3:
                                s12 = 4;
                                pVar.set(s12, 0, i13);
                            case 4:
                                if (i13 < 0) {
                                    j.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                s12 = 7;
                                pVar.set(s12, 0, i13);
                            case 5:
                                if (i13 < 16384 || i13 > 16777215) {
                                    j.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i13));
                                    throw null;
                                }
                                pVar.set(s12, 0, i13);
                                break;
                            default:
                        }
                    }
                    bVar.settings(false, pVar);
                    int i14 = pVar.f7998a;
                    int i15 = i14 & 2;
                    int[] iArr = pVar.f7999b;
                    if ((i15 != 0 ? iArr[1] : -1) >= 0) {
                        int i16 = (i14 & 2) != 0 ? iArr[1] : -1;
                        g gVar = this.f7984f;
                        gVar.f7956c = i16;
                        gVar.f7957d = i16;
                        int i17 = gVar.f7961h;
                        if (i16 < i17) {
                            if (i16 == 0) {
                                Arrays.fill(gVar.f7958e, (Object) null);
                                gVar.f7959f = gVar.f7958e.length - 1;
                                gVar.f7960g = 0;
                                gVar.f7961h = 0;
                                return true;
                            }
                            gVar.a(i17 - i16);
                        }
                    }
                    return true;
                case 5:
                    if (i10 == 0) {
                        j.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    short s13 = (b11 & 8) != 0 ? (short) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
                    bVar.pushPromise(i10, kVar.readInt() & Integer.MAX_VALUE, a(j.b(iA - 4, b11, s13), s13, b11, i10));
                    return true;
                case 6:
                    if (iA != 8) {
                        j.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i10 != 0) {
                        j.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    bVar.ping((b11 & 1) != 0, kVar.readInt(), kVar.readInt());
                    return true;
                case 7:
                    if (iA < 8) {
                        j.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i10 != 0) {
                        j.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i18 = kVar.readInt();
                    int i19 = kVar.readInt();
                    int i20 = iA - 8;
                    a aVarFromHttp22 = a.fromHttp2(i19);
                    if (aVarFromHttp22 == null) {
                        j.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i19));
                        throw null;
                    }
                    pw.l byteString = pw.l.f81912g;
                    if (i20 > 0) {
                        byteString = kVar.readByteString(i20);
                    }
                    bVar.goAway(i18, aVarFromHttp22, byteString);
                    return true;
                case 8:
                    if (iA != 4) {
                        j.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long j10 = kVar.readInt() & 2147483647L;
                    if (j10 != 0) {
                        bVar.windowUpdate(i10, j10);
                        return true;
                    }
                    j.c("windowSizeIncrement was 0", new Object[0]);
                    throw null;
                default:
                    kVar.skip(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // as.c
    public void readConnectionPreface() throws IOException {
        if (this.f7983e) {
            return;
        }
        pw.l lVar = j.f7971b;
        pw.l byteString = this.f7981b.readByteString(lVar.size());
        Logger logger = j.f7970a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("<< CONNECTION " + byteString.hex());
        }
        if (lVar.equals(byteString)) {
            return;
        }
        j.c("Expected a connection header but was %s", byteString.utf8());
        throw null;
    }
}
