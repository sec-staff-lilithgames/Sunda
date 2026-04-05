package qp;

import io.bidmachine.media3.common.util.m0;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f83423c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f83424d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final m0 f83425a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f83426b = new StringBuilder();

    public static String a(m0 m0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int position = m0Var.getPosition();
        int iLimit = m0Var.limit();
        while (position < iLimit && !z10) {
            char c10 = (char) m0Var.getData()[position];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                position++;
                sb2.append(c10);
            }
        }
        m0Var.skipBytes(position - m0Var.getPosition());
        return sb2.toString();
    }

    public static String b(m0 m0Var, StringBuilder sb2) {
        c(m0Var);
        if (m0Var.bytesLeft() == 0) {
            return null;
        }
        String strA = a(m0Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) m0Var.readUnsignedByte());
    }

    public static void c(m0 m0Var) {
        while (true) {
            for (boolean z10 = true; m0Var.bytesLeft() > 0 && z10; z10 = false) {
                char c10 = (char) m0Var.getData()[m0Var.getPosition()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    m0Var.skipBytes(1);
                } else {
                    int position = m0Var.getPosition();
                    int iLimit = m0Var.limit();
                    byte[] data = m0Var.getData();
                    int i10 = position + 2;
                    if (i10 <= iLimit) {
                        int i11 = position + 1;
                        if (data[position] == 47 && data[i11] == 42) {
                            while (true) {
                                int i12 = i10 + 1;
                                if (i12 >= iLimit) {
                                    break;
                                }
                                if (((char) data[i10]) == '*' && ((char) data[i12]) == '/') {
                                    i10 += 2;
                                    iLimit = i10;
                                } else {
                                    i10 = i12;
                                }
                            }
                            m0Var.skipBytes(iLimit - m0Var.getPosition());
                        }
                    }
                }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fc, code lost:
    
        return r3;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<qp.c> parseBlock(io.bidmachine.media3.common.util.m0 r18) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.b.parseBlock(io.bidmachine.media3.common.util.m0):java.util.List");
    }
}
