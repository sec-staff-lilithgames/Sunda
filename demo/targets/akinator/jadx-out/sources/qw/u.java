package qw;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import f.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.w0;
import pw.g1;
import pw.n0;
import sv.k0;
import tu.e0;
import tu.x0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class u {
    public static final Map a(ArrayList arrayList) {
        n0 n0Var = n0.a.get$default(n0.f81931c, "/", false, 1, (Object) null);
        Map mapMutableMapOf = p1.mutableMapOf(e0.to(n0Var, new q(n0Var, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (q qVar : y0.sortedWith(arrayList, new t())) {
            if (((q) mapMutableMapOf.put(qVar.getCanonicalPath(), qVar)) == null) {
                while (true) {
                    n0 n0VarParent = qVar.getCanonicalPath().parent();
                    if (n0VarParent != null) {
                        q qVar2 = (q) mapMutableMapOf.get(n0VarParent);
                        if (qVar2 != null) {
                            qVar2.getChildren().add(qVar.getCanonicalPath());
                            break;
                        }
                        q qVar3 = new q(n0VarParent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapMutableMapOf.put(n0VarParent, qVar3);
                        qVar3.getChildren().add(qVar.getCanonicalPath());
                        qVar = qVar3;
                    }
                }
            }
        }
        return mapMutableMapOf;
    }

    public static final String b(int i10) {
        StringBuilder sb2 = new StringBuilder("0x");
        String string = Integer.toString(i10, sv.e.checkRadix(16));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public static final void c(pw.k kVar, int i10, kv.p pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = kVar.readShortLe() & 65535;
            long shortLe2 = kVar.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - 4;
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            kVar.require(shortLe2);
            long size = kVar.getBuffer().size();
            pVar.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (kVar.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(a.b.e(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                kVar.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    public static final q d(pw.k kVar, q qVar) throws IOException {
        int intLe = kVar.readIntLe();
        if (intLe != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(intLe));
        }
        kVar.skip(2L);
        short shortLe = kVar.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        kVar.skip(18L);
        long shortLe2 = kVar.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = kVar.readShortLe() & 65535;
        kVar.skip(shortLe2);
        if (qVar == null) {
            kVar.skip(shortLe3);
            return null;
        }
        b1 b1Var = new b1();
        b1 b1Var2 = new b1();
        b1 b1Var3 = new b1();
        c(kVar, shortLe3, new r(kVar, b1Var, b1Var2, b1Var3));
        return qVar.copy$okio((Integer) b1Var.f71816b, (Integer) b1Var2.f71816b, (Integer) b1Var3.f71816b);
    }

    public static final Long dosDateTimeToEpochMillis(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(y.datePartsToEpochMillis(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long filetimeToEpochMillis(long j10) {
        return (j10 / 10000) - 11644473600000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (r14 != (r11.readShortLe() & 65535)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r0 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r10 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        r11.skip(4);
        r13 = new qw.l(r14, r11.readIntLe() & 4294967295L, r11.readShortLe() & 65535);
        r7 = r11.readUtf8(r13.getCommentByteCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r11.close();
        r5 = r5 - 20;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r5 <= r19) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        r5 = pw.h0.buffer(r4.source(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r5.readIntLe() != 117853008) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r6 = r5.readIntLe();
        r10 = r5.readLongLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r5.readIntLe() != 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r6 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        r6 = pw.h0.buffer(r4.source(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        r8 = r6.readIntLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r8 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r6.skip(12);
        r8 = r6.readIntLe();
        r10 = r6.readIntLe();
        r22 = r6.readLongLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if (r22 != r6.readLongLe()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r8 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        if (r10 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
    
        r6.skip(8);
        r21 = new qw.l(r22, r6.readLongLe(), r13.getCommentByteCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
    
        throw new java.io.IOException("bad zip: expected " + b(101075792) + " but was " + b(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0134, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        if (r6 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0138, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013d, code lost:
    
        tu.h.addSuppressed(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0141, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
    
        if (r5 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        tu.h.addSuppressed(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r0 = r11.readShortLe() & 65535;
        r10 = r11.readShortLe() & 65535;
        r14 = r11.readShortLe() & 65535;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6 A[Catch: all -> 0x0161, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0161, blocks: (B:3:0x001b, B:5:0x0029, B:6:0x0032, B:16:0x008e, B:18:0x009a, B:70:0x0169, B:64:0x015d, B:71:0x016a, B:97:0x01c9, B:100:0x01d6, B:94:0x01c3, B:107:0x01e2, B:110:0x01f0, B:111:0x01f7, B:112:0x01f8, B:113:0x01fb, B:114:0x01fc, B:115:0x0211, B:19:0x00a2, B:21:0x00ab, B:24:0x00bc, B:53:0x0148, B:47:0x013d, B:54:0x0149, B:55:0x014e, B:25:0x00c4, B:27:0x00cd, B:31:0x00ea, B:36:0x0105, B:37:0x010a, B:39:0x010d, B:40:0x0133, B:44:0x0138, B:91:0x01be, B:72:0x017b, B:75:0x0183, B:77:0x0193, B:79:0x019f, B:82:0x01a6, B:83:0x01ab, B:84:0x01b2, B:7:0x003a, B:9:0x0043, B:15:0x006a, B:104:0x01da, B:105:0x01df, B:61:0x0158), top: B:126:0x001b, inners: #1, #3, #4, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[Catch: all -> 0x0141, TryCatch #1 {all -> 0x0141, blocks: (B:19:0x00a2, B:21:0x00ab, B:24:0x00bc, B:53:0x0148, B:47:0x013d, B:54:0x0149, B:55:0x014e, B:25:0x00c4, B:27:0x00cd, B:31:0x00ea, B:36:0x0105, B:37:0x010a, B:39:0x010d, B:40:0x0133, B:44:0x0138), top: B:125:0x00a2, outer: #2, inners: #6, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169 A[Catch: all -> 0x0161, TryCatch #2 {all -> 0x0161, blocks: (B:3:0x001b, B:5:0x0029, B:6:0x0032, B:16:0x008e, B:18:0x009a, B:70:0x0169, B:64:0x015d, B:71:0x016a, B:97:0x01c9, B:100:0x01d6, B:94:0x01c3, B:107:0x01e2, B:110:0x01f0, B:111:0x01f7, B:112:0x01f8, B:113:0x01fb, B:114:0x01fc, B:115:0x0211, B:19:0x00a2, B:21:0x00ab, B:24:0x00bc, B:53:0x0148, B:47:0x013d, B:54:0x0149, B:55:0x014e, B:25:0x00c4, B:27:0x00cd, B:31:0x00ea, B:36:0x0105, B:37:0x010a, B:39:0x010d, B:40:0x0133, B:44:0x0138, B:91:0x01be, B:72:0x017b, B:75:0x0183, B:77:0x0193, B:79:0x019f, B:82:0x01a6, B:83:0x01ab, B:84:0x01b2, B:7:0x003a, B:9:0x0043, B:15:0x006a, B:104:0x01da, B:105:0x01df, B:61:0x0158), top: B:126:0x001b, inners: #1, #3, #4, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c9 A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #2 {all -> 0x0161, blocks: (B:3:0x001b, B:5:0x0029, B:6:0x0032, B:16:0x008e, B:18:0x009a, B:70:0x0169, B:64:0x015d, B:71:0x016a, B:97:0x01c9, B:100:0x01d6, B:94:0x01c3, B:107:0x01e2, B:110:0x01f0, B:111:0x01f7, B:112:0x01f8, B:113:0x01fb, B:114:0x01fc, B:115:0x0211, B:19:0x00a2, B:21:0x00ab, B:24:0x00bc, B:53:0x0148, B:47:0x013d, B:54:0x0149, B:55:0x014e, B:25:0x00c4, B:27:0x00cd, B:31:0x00ea, B:36:0x0105, B:37:0x010a, B:39:0x010d, B:40:0x0133, B:44:0x0138, B:91:0x01be, B:72:0x017b, B:75:0x0183, B:77:0x0193, B:79:0x019f, B:82:0x01a6, B:83:0x01ab, B:84:0x01b2, B:7:0x003a, B:9:0x0043, B:15:0x006a, B:104:0x01da, B:105:0x01df, B:61:0x0158), top: B:126:0x001b, inners: #1, #3, #4, #8, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pw.g1 openZip(pw.n0 r27, pw.r r28, kv.l r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.u.openZip(pw.n0, pw.r, kv.l):pw.g1");
    }

    public static /* synthetic */ g1 openZip$default(n0 n0Var, pw.r rVar, kv.l lVar, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            lVar = new j0(15);
        }
        return openZip(n0Var, rVar, lVar);
    }

    public static final q readCentralDirectoryZipEntry(final pw.k kVar) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<this>");
        int intLe = kVar.readIntLe();
        if (intLe != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(intLe));
        }
        kVar.skip(4L);
        short shortLe = kVar.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        int shortLe2 = kVar.readShortLe() & 65535;
        int shortLe3 = kVar.readShortLe() & 65535;
        int shortLe4 = kVar.readShortLe() & 65535;
        long intLe2 = kVar.readIntLe() & 4294967295L;
        final a1 a1Var = new a1();
        a1Var.f71813b = kVar.readIntLe() & 4294967295L;
        final a1 a1Var2 = new a1();
        a1Var2.f71813b = kVar.readIntLe() & 4294967295L;
        int shortLe5 = kVar.readShortLe() & 65535;
        int shortLe6 = kVar.readShortLe() & 65535;
        int shortLe7 = kVar.readShortLe() & 65535;
        kVar.skip(8L);
        final a1 a1Var3 = new a1();
        a1Var3.f71813b = kVar.readIntLe() & 4294967295L;
        String utf8 = kVar.readUtf8(shortLe5);
        if (sv.n0.contains$default((CharSequence) utf8, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = a1Var2.f71813b == 4294967295L ? 8 : 0L;
        if (a1Var.f71813b == 4294967295L) {
            j10 += 8;
        }
        if (a1Var3.f71813b == 4294967295L) {
            j10 += 8;
        }
        final long j11 = j10;
        final b1 b1Var = new b1();
        final b1 b1Var2 = new b1();
        final b1 b1Var3 = new b1();
        final w0 w0Var = new w0();
        c(kVar, shortLe6, new kv.p() { // from class: qw.s
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                pw.k kVar2 = kVar;
                if (iIntValue == 1) {
                    w0 w0Var2 = w0Var;
                    if (w0Var2.f71863b) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    w0Var2.f71863b = true;
                    if (jLongValue < j11) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    a1 a1Var4 = a1Var2;
                    long longLe = a1Var4.f71813b;
                    if (longLe == 4294967295L) {
                        longLe = kVar2.readLongLe();
                    }
                    a1Var4.f71813b = longLe;
                    a1 a1Var5 = a1Var;
                    a1Var5.f71813b = a1Var5.f71813b == 4294967295L ? kVar2.readLongLe() : 0L;
                    a1 a1Var6 = a1Var3;
                    a1Var6.f71813b = a1Var6.f71813b == 4294967295L ? kVar2.readLongLe() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    kVar2.skip(4L);
                    u.c(kVar2, (int) (jLongValue - 4), new r(b1Var, kVar2, b1Var2, b1Var3));
                }
                return x0.f87415a;
            }
        });
        if (j11 <= 0 || w0Var.f71863b) {
            return new q(n0.a.get$default(n0.f81931c, "/", false, 1, (Object) null).resolve(utf8), k0.endsWith$default(utf8, "/", false, 2, null), kVar.readUtf8(shortLe7), intLe2, a1Var.f71813b, a1Var2.f71813b, shortLe2, a1Var3.f71813b, shortLe4, shortLe3, (Long) b1Var.f71816b, (Long) b1Var2.f71816b, (Long) b1Var3.f71816b, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final q readLocalHeader(pw.k kVar, q centralDirectoryZipEntry) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        q qVarD = d(kVar, centralDirectoryZipEntry);
        kotlin.jvm.internal.e0.checkNotNull(qVarD);
        return qVarD;
    }

    public static final void skipLocalHeader(pw.k kVar) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<this>");
        d(kVar, null);
    }
}
