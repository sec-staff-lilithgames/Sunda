package com.pgl.ssdk;

import b0.e2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f50463a;

        /* renamed from: b, reason: collision with root package name */
        private final q f50464b;

        public a(long j10, q qVar) {
            this.f50463a = j10;
            this.f50464b = qVar;
        }

        public q a() {
            return this.f50464b;
        }

        public long b() {
            return this.f50463a;
        }
    }

    public static t a(q qVar) throws IOException, s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbR = e2.r(jC, "ZIP Central Directory start offset out of range: ", ". ZIP End of Central Directory offset: ");
            sbR.append(jLongValue);
            throw new s(sbR.toString());
        }
        long jD = p.d(byteBufferA);
        long j10 = jC + jD;
        if (j10 <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbR2 = e2.r(j10, "ZIP Central Directory overlaps with End of Central Directory. CD end: ", ", EoCD start: ");
        sbR2.append(jLongValue);
        throw new s(sbR2.toString());
    }

    public static a a(q qVar, t tVar) throws b, IOException {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC != jE) {
            StringBuilder sbR = e2.r(jC, "ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ");
            sbR.append(jE);
            throw new b(sbR.toString());
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j10 = byteBufferA.getLong(0);
                if (j10 < byteBufferA.capacity() || j10 > 2147483639) {
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j10)));
                }
                long j11 = (int) (8 + j10);
                long j12 = jA - j11;
                if (j12 >= 0) {
                    ByteBuffer byteBufferA2 = qVar.a(j12, 8);
                    byteBufferA2.order(byteOrder);
                    long j13 = byteBufferA2.getLong(0);
                    if (j13 == j10) {
                        return new a(j12, qVar.a(j12, j11));
                    }
                    StringBuilder sbR2 = e2.r(j13, "APK Signing Block sizes in header and footer do not match: ", " vs ");
                    sbR2.append(j10);
                    throw new b(sbR2.toString());
                }
                throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j12)));
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}
